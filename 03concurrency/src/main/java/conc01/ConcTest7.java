package conc01;

import java.util.concurrent.*;

public class ConcTest7 {
    private static int result = 0;
    private static ExecutorService singlePool = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        CyclicBarrier cb = new CyclicBarrier(1, () -> {
            // 确保  拿到result 并输出
            System.out.println("异步计算结果为：" + result);

            System.out.println("使用时间：" + (System.currentTimeMillis() - start) + " ms");
        });


        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
//        int result = sum();

        // 利用单线程池的特性  实现同步
        singlePool.submit(() -> {
            result = sum();
            try {
                cb.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });




        // 然后退出main线程
        singlePool.shutdown();
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
