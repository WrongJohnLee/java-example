package basetype;

/**
 * @ClassName Test
 * @Description TODO
 * @Author qzli
 * @Date 2019/7/19 22:37
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //ռһ���ֽڣ�8bit����2��8�η�-1����Ϊ���λ��������
        byte minByte = -128;
        byte maxByte = 127;
        //2���ֽڣ�16λ��ֻ�ܴ�һ���ַ�
        char char1 = 'a';
        char char2 = 'ţ';
        //2���ֽڣ�16λ��
        short minShort = -32768;//��-2^15����
        short maxShort = 32767;//��2^15 - 1��;
        int minInt = -2147483648;//��-2^31����
        int maxInt = 2147483647;//��2^31-1����
        long minLong = 0x8000000000000000L;//��-2^63����
        long maxLong = 0x7fffffffffffffffL;//��2^63 -1����
        //4���ֽڣ�32λ�����λ����λ��ָ��λռ8λ��ֻ�ܱ�֤10���Ƶ�6λС�����㣩��С��λռ23λ�����ֵΪ2��32�η�-1
        float minFloat = -8388608f;
        float maxFloat = 8388608f;
        //8���ֽڣ�64λ�����λ����λ��ָ��λռ11λ��ֻ�ܱ�֤10���Ƶ�15λС�����㣩��С��λռ52λ�����ֵΪ2��52�η�-1
        double minDouble = Double.MIN_VALUE;
        double maxDouble =  Double.MAX_VALUE;
    
        String s1 = "������";
        char[] chars = s1.toCharArray();
        for (char aChar : chars) {
            System.out.println(Character.toString(aChar));
        }
    }
}
