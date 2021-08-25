package conc01;

public class ConcTest2 {
    private static int num = 0;
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
//        int result = sum();

        Thread t1 = new Thread(() -> {
            num = sum();
        });
        t1.start();

        // 使用join() 阻塞
        try {
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int result = num;

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
