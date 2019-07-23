package ppmoney;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @ClassName CalRate
 * @Description ������Ϣ��Aλ��Ϣ�ܺͣ�PΪ����rΪ��Ϣ��tΪÿ�������Ϣ������nΪͶ������
 * @Author qzli
 * @Date 2019/7/23 21:31
 * @Version 1.0
 **/
public class CalRate {
    public static void main(String[] args) {
        System.out.println("�����뱾��");
        Scanner scanner = new Scanner(System.in);
        String p = scanner.next();
        validIn("^([1-9][0-9]*)+(\\.?)+([0-9][0-9]*)$", p);
        System.out.println("��������Ϣ");
        String r = scanner.next();
        validIn("^([1-9][0-9]*)+(\\.?)+([0-9][0-9]*)$", r);
        System.out.println("������ÿ�������Ϣ����");
        String t = scanner.next();
        validIn("^[1-9][0-9]*$", t);
        System.out.println("������Ͷ������");
        String n = scanner.next();
        validIn("^[1-9][0-9]*$", n);
        System.out.println(cal(new BigDecimal(p), new BigDecimal(r), Integer.valueOf(t), Integer.valueOf(n)));
    }
    
    public static void validIn(String regex, String in) {
        if(!Pattern.matches(regex, in)){
            System.out.println("���벻�Ϸ�");
        }
    }
    
    public static BigDecimal cal(BigDecimal p, BigDecimal r, int t, int n) {
        int size = t * n;
        BigDecimal result = null;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                result = p.add(p.multiply(r));
            }else {
                result = result.add(result.multiply(r));
            }
        }
        return result;
    }
}
