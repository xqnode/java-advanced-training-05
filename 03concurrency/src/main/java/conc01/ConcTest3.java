package conc01;

import java.util.concurrent.TimeUnit;

public class ConcTest3 {
    private static int result = 0;
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
//        int result = sum();

        Thread t1 = new Thread(() -> {
            result = sum();
        });
        t1.start();

        // 使用Sleep 阻塞 （不会非常精确，在确定线程返回值的时候可以使用，但是效率极低，非常不推荐）
        try {
            TimeUnit.SECONDS.sleep(1);
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
