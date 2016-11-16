import java.util.Arrays;
import java.util.Collections;

public class DZ {

    public static void main(String[] args) {

        int[] arr;

        //Объявите массив byte с идентификатором byteArray на 26 элементов.
        byte[] byteArray = new byte[26];

// Объявите массив строк с идентификатором stringArray на 10 элементов.
        //Составить программу вывода на экран любого элемента массива по его индексу.
        String[] stringArray = new String[10];
        stringArray[2]="Hello World!";


        System.out.println(stringArray[2]);
        //Объявите массив строк с идентификатором daysOfWeek  и проинициализируйте его названиями дней недели.
                String[] daysOfWeek = {" Monday", "Tuesday", "Wednesday", "chetverng", "Friday", "Saturday", "Sunday"};

        System.out.println("Today " + daysOfWeek[2]);
//Заполнить массив из восьми элементов следующими значениями: первый элемент массива равен 37, второй — 0, третий — 50, четвертый — 46, пятый — 34, шестой — 46, седьмой — 0, восьмой —13.
        Integer[] arr2 = new Integer[8];
        arr2[0] = 37;
        arr2[1] = 0;
        arr2[2] = 50;
        arr2[3] = 46;
        arr2[4] = 34;
        arr2[5] = 46;
        arr2[6] = 0;
        arr2[7] = 13;

        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++)
            System.out.println("Массив по возрастанию индекса "+i + "= " + arr2[i]);
        System.out.print("Массив по убыванию: ");
        Integer arr3[] = new Integer[10];
        Arrays.sort(arr2, Collections.reverseOrder());
//Выводим отсортированный массив на консоль.
        for (int i = 0; i < arr2.length; i++) {

            System.out.print(arr2[i] + "  ");
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------- ");

//Дан массив целых чисел. Выяснить:
             int[] arr8 = {5, 6, 8, -10, 22, 15};
                if (arr8[3] >= 0)
                    System.out.println("Является ли 3-й элемент массива положительным числом *"+true+"*");
                else
                    System.out.println("Является ли 3-й элемент массива положительным числом *"+false+"*");

                int chetnoe = arr8[4] % 2;
                if (chetnoe == 0)
                    System.out.println("Является ли 4-й элемент массива четным числом *"+true+"*");
                else
                    System.out.println("Является ли 4-й элемент массива четным числом *"+false+"*");


                if(arr8[3]>arr8[4])
                    System.out.println("Число массива под индексом 3 больше,чем число под индексом 4");
                else
                    System.out.println("Число массива под индексом 4 больше, чем число под индексом 3");
        String[][] s = {
                {"a(0,0)", "a(0,1)"},
                {"a(1,0)", "a(1,1)"},
                {"a(2,0)", "a(1,1)"}

        };

        System.out.println("Вывести на экран элемент, расположенный в правом верхнем углу массива.= "+s[0][1]);

        int[][] a = {{1, 2, 3},
                {4, 0, 54,},
        };
        System.out.println("Вывести на экран элемент, расположенный в левом нижнем углу массива ="+a[1][0]);
        System.out.println(" Вывести на экран элемент, расположенный в правом нижнем углу массива ="+s[0][1]);
        System.out.println(" Вывести на экран элемент, расположенный в левом верхнем углу массива ="+s[0][0]);
        int y=0;
        int x=2;
        System.out.println(" вывод на экран любого элемента второй строки массива="+a[1][x]);
        System.out.println(" Вывода на экран любого элемента массива="+a[y][x]);
            }


        }






