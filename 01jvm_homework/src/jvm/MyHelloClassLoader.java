package jvm;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyHelloClassLoader extends ClassLoader {
    public static void main(String[] args) throws Exception {
//        Class<?> helloClass = new MyHelloClassLoader().findClass("Hello");
//        Method hello = helloClass.getMethod("hello");
//        hello.invoke(helloClass.newInstance());

        int a = 255;
        int b = 10;
        byte c = (byte) (a - b);
        System.out.println(c);
    }

    @Override
    protected Class<?> findClass(String name) {
        byte[] bytes = readFile("Hello.xlass");
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (255 - bytes[i]);
        }
        return defineClass(name, bytes, 0, bytes.length);
    }

    private static byte[] readFile(String filePath) {
        FileInputStream fis = null;
        ByteArrayOutputStream bos = null;
        try {
            fis = new FileInputStream(filePath);
            bos = new ByteArrayOutputStream();

            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            return bos.toByteArray();
        } catch (Exception e) {

        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return new byte[]{};
    }
}
