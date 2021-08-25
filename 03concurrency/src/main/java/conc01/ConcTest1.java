package conc01;

import java.util.concurrent.*;

public class ConcTest1 {

    private static ExecutorService singlePool = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
//        int result = sum();
        int result = 0;

        // 使用 Future方法
//        Future<Integer> future = singlePool.submit(ConcTest1::sum);
//        try {
//            result = future.get();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            singlePool.shutdown();
//        }

        // 使用 FutureTask
        FutureTask<Integer> futureTask = new FutureTask<>(ConcTest1::sum);
        Thread t1 = new Thread(futureTask);
        t1.start();
        try {
            result = futureTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 确保  拿到result 并输出
        System.out.println("异步计算结果为：" + result);

        System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");

        // 然后退出main线程
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if (a < 2)
            return 1;
        return fibo(a - 1) + fibo(a - 2);
    }
}
