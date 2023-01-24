import java.util.Arrays;
import java.util.Random;

public class S1 {
    public static void main(String[] args) {
        // Цылие числа
        int x = 0;      // 32bit signed
        long l = 0;     // 64bit signed
        // Не целые числа
        float f = 0.0f; //32bit
        double d = 0.0; //64bit
        // byte, short

        char c = 'a'; // 16bit unsigned
        x = (int)f;  // преведеия в тип с отбрасыванием всего после запятой

        boolean b = true;

        String str = "Кофе, дерево,"+" Дорога, степь"; // Объязательно в двойных кавычках
        str +="!";
        System.out.println(str.toLowerCase());       //   все буквы в нижный регистр
        System.out.println((str.replaceAll(", ","-")));// поменят элементы
        System.out.println(str);                     //
        System.out.println("Hi!".repeat(10));  // повторит 10 раз

        String[] strSplit =str.split(" "); // разделить строку на список по пробелам
        System.out.println(Arrays.toString(strSplit));

        for (int i = 0; i < strSplit.length ; i++) {
            if (strSplit[i].contains(",") | strSplit[i].contains(".") | strSplit[i].contains("!")) ;{ // если имеет и .equals()
            strSplit[i] = strSplit[i].substring(0, strSplit[i].length() - 1);
             }
        }
        System.out.println(Arrays.toString(strSplit));

        int[] arr = new int[10]; // массив

        Random rnd = new Random();
        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = (int) (Math.random()*100); // рандом возврашает double и в int переводиться получаеться 0 поэтому *100
            arr[i] = rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        int[] tmp = new int[arr.length+1];  // Увеличиваем массив
        tmp[0] = 5;
        for (int i = 1; i < tmp.length ; i++) {
            tmp[i] = arr[i-1];
        }
        arr = tmp;
        System.out.println(Arrays.toString(arr));

        System.out.println(String.valueOf(4.5f));  // переводим в строку
        System.out.println(Integer.parseInt("23123")); // переводим в интеджер
        System.out.println(Integer.toBinaryString(156)); // переводим в двоичный
        System.out.println(Integer.toBinaryString(156).length());


    }
}
