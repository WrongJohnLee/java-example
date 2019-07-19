package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ThreadPoolExecutorTest
 * @Description �̲߳��ԣ�ע��Worker��
 * @Author qzli
 * @Date 2019/7/18 22:20
 * @Version 1.0
 **/
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(() ->{
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test pool");
        });
    
        pool.submit(() ->{
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test pool");
        });
    
        /**
         * ��Ϊ�������������߳���Ϊ2��
         * ǰ������һֱû�ͷ�ֻ�ܵȴ�����ִ����ȥȥqueue������
         */
        pool.submit(() ->{
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test pool");
        });
    }
}
