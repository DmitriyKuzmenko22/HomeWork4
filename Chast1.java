import java.util.Arrays;
import java.util.Collections;


public class DzNew4 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        //2
        byte[] arr2 = new byte[26];

        //4
        String[] daysOfWeek = {" Monday", "Tuesday", "Wednesday", "chetverng", "Friday", "Saturday", "Sunday"};
        //3
        String[] stringArray = new String[10];
        isVivod(stringArray);

        //6
        Integer[] arr3={333,14,5,6,27,81,99,10};


        isVozrastanie(arr3);
        isUbivanie(arr3);
        int[] arr8 = {5, 6, 8, -10, 22, 15};
isPisotive(arr8);

        String[][] s9 = {
                {"a(0,0)", "a(0,1)"},
                {"a(1,0)", "a(1,1)"},
                {"a(2,0)", "a(1,1)"}};
        isTwoVivod(s9);

        int[][] a10 = {{1, 2, 3},
                {4, 0, 54,},};
        isTwoVivod2(a10);
        isRandom(a10);
    }



    public static void isVivod(String stringArray[]) {
        //5
        stringArray[2] = "Hello World!";
        System.out.println(stringArray[2]);
    }
   public static void isVozrastanie(Integer arr3[]){
       Arrays.sort(arr3);
       for (int i = 0; i < arr3.length; i++)
           System.out.println("Массив по возрастанию индекса " + i + "= " + arr3[i]);
    }
public static void isUbivanie(Integer arr3[]) {

    Arrays.sort(arr3, Collections.reverseOrder());
    for (int i = 0; i < arr3.length; i++) {

        System.out.println("По убыванию: " + arr3[i] + "  ");
    }
}
    public static void isPisotive(int arr8[]) {

        if (arr8[3] >= 0)
            System.out.println("Является ли 3-й элемент массива положительным числом *" + true + "*");
        else
            System.out.println("Является ли 3-й элемент массива положительным числом *" + false + "*");

        int chetnoe = arr8[4] % 2;
        if (chetnoe == 0)
            System.out.println("Является ли 4-й элемент массива четным числом *" + true + "*");
        else
            System.out.println("Является ли 4-й элемент массива четным числом *" + false + "*");


        if (arr8[3] > arr8[4])
            System.out.println("Число массива под индексом 3 больше,чем число под индексом 4");
        else
            System.out.println("Число массива под индексом 4 больше, чем число под индексом 3");
    }
       public static void isTwoVivod(String s9[][]){
           System.out.println("Вывести на экран элемент, расположенный в правом верхнем углу массива.= "+s9[0][1]);
        }

        public static void isTwoVivod2(int a10[][]) {
            System.out.println(" Вывести на экран элемент, расположенный в правом нижнем углу массива =" + a10[0][1]);
            System.out.println(" Вывести на экран элемент, расположенный в левом верхнем углу массива =" + a10[0][0]);
        }
            public static void isRandom(int a10[][]){
        int y=0;
        int x=2;
        System.out.println(" вывод на экран любого элемента второй строки массива="+a10[1][x]);
        System.out.println(" Вывода на экран любого элемента массива="+a10[y][x]);
    }
        }



