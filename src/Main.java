import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

     static String intToRoman(int num) {
         String s = "";
         String f;
         //int contor = 0;
         List<Integer> help = new ArrayList<Integer>();
         List<String> res = new ArrayList<String>();
         while (num > 0) {
             if (num % 10 == 0)
                 if (num % 100 == 0)
                     if (num % 1000 == 0) {
                         //help.add(num % 10000 * Math.pow(10, contor));
                         //num = num / 10000;
                         help.add(1000);
                         num = num  - 1000;
                         //contor += 4;
                     }
                     else {
                         if (num % 500 == 0) {
                                 help.add(500);
                                 num = num  - 500;
                             }
                         else {
                             //help.add(num % 1000 * Math.pow(10, contor));
                             //num = num / 1000;
                             //contor += 3;
                             help.add(100);
                             num = num - 100;
                         }
                     }
                 else {
                     if (num % 50 == 0) {
                         help.add(50);
                         num = num  - 50;
                     }
                     else {
                         //help.add(num % 100 * Math.pow(10, contor));
                         //num = num / 100;
                         //contor += 2;
                         help.add(10);
                         num = num - 10;
                     }
                 }
             else {
                 if (num % 5 == 0) {
                     help.add(5);
                     num = num  - 5;
                 }
                 else {
                     //help.add(num % 10 * Math.pow(10, contor));
                     //num = num / 10;
                     //contor += 1;
                     help.add(1);
                     num = num - 1;
                 }
             }
         }
         for (int i = help.size() - 1; i >= 0; i--) {
             switch (help.get(i)) {
                 case 1000:
                     s += "M";
                     break;
                 case 500:
                     s += "D";
                     break;
                 case 100:
                     s += "C";
                     break;
                 case 50:
                     s += "L";
                     break;
                 case 10:
                     s += "X";
                     break;
                 case 5:
                     s += "V";
                     break;
                 case 1:
                     s += "I";
                     break;
//             switch (help.get(i)) {
//                 case 1000:
//                     res.add("M");
//                     break;
//                 case 500:
//                     res.add("D");
//                     break;
//                 case 100:
//                     res.add("C");
//                     break;
//                 case 50:
//                     res.add("L");
//                     break;
//                 case 10:
//                     res.add("X");
//                     break;
//                 case 5:
//                     res.add("V");
//                     break;
//                 case 1:
//                     res.add("I");
//                     break;
             }
         }
         //return help;
         //return res;s

         f = s.replaceAll("VIIII", "IX");
         f = f.replaceAll("LXXXX", "XC");
         f = f.replaceAll("DCCCC", "CM");
         f = f.replaceAll("XXXX", "XL");
         f = f.replaceAll("IIII", "IV");
         f = f.replaceAll("CCCC", "CD");

         return f;
     }

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println(intToRoman(num));
    }
}