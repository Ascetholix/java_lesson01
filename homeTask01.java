import java.util.Arrays;
import java.util.Random;

/**
 * 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
 * 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
 * 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
 * 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
 * * int i = new Random().nextInt(k); //это кидалка случайных чисел!)
 */
public class homeTask01 {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        int[] m1 = new int[0];
        int[] m2 = new int[0];

        Random rnd = new Random();
        i = rnd.nextInt(2000);
        n = Integer.toBinaryString(i).length();

//        System.out.println(i);
//        System.out.println(n);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);

        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {                       // условия если значение делиться без остатка то
                int[] tmp1 = new int[m1.length+1];  //  создаем временый массив
                tmp1[0] = j;
                for (int l = 1; l < tmp1.length ; l++) {
                    tmp1[l] = m1[l-1];
                }
                m1 = tmp1;
            }
        }
        for (int j = Short.MIN_VALUE; j < i ; j++) {
            if(j%n !=0){                              // условия если значение неделиться без остатка то
                int[] tmp2 = new int[m2.length+1];   //  создаем временый массив
                tmp2[0] = j;
                for (int l = 1; l < tmp2.length ; l++) {
                    tmp2[l] = m2[l-1];
                }
                m2 = tmp2;
            }

        }
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));
    }
}

