package conc01;

import java.util.concurrent.Semaphore;

public class ConcTest4 {
    private static int result = 0;

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(0);

        long start = System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
//        int result = sum();

        Thread t1 = new Thread(() -> {
            result = sum();
            semaphore.release(1);
        });
        t1.start();

        // 使用信号量的阻塞机制实现
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
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
