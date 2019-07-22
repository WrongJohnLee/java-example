package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName EnpointMethodInvokeHandler
 * @Description ���ɵĴ����������Ϊ����������
 * @Author qzli
 * @Date 2019/7/22 22:58
 * @Version 1.0
 **/
public class EnpointMethodInvokeHandler implements InvocationHandler {
    
    /**
     * һ����˵������ʵ���࣬Ҳ�����Լ��������
     */
    private Object target;
    
    public EnpointMethodInvokeHandler(Object target) {
        this.target = target;
    }
    
    /**
     * ���нӿڵĶ�����������
     * @param proxy ûɶ�õģ�����������ʵ��
     * @param method �������õķ��������õĻ���Ҫ�����Ľӿ�ʵ������
     * @param args �������÷��������
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("wa�������ȳ�");
        method.invoke(target, args);
        System.out.println("wa�������볡");
        return null;
    }
}
