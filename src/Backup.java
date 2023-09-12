//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Backup {
//
//    static List<String> intToRoman(int num) {
//        String s;
//        int contor = 0;
//        List<Double> help = new ArrayList<Double>();
//        List<String> res = new ArrayList<String>();
//        while (num > 0) {
//            if (num % 10 == 0)
//                if (num % 100 == 0)
//                    if (num % 1000 == 0) {
//                        //help.add(num % 10000 * Math.pow(10, contor));
//                        //num = num / 10000;
//                        contor = 3;
//                        help.add(Math.pow(10, contor));
//                        num = num  - 1000;
//                        //contor += 4;
//                    }
//                    else {
//                        if (num % 500 == 0) {
//                            contor = 2;
//                            help.add(5 * Math.pow(10, contor));
//                            num = num  - 500;
//                        }
//                        else {
//                            //help.add(num % 1000 * Math.pow(10, contor));
//                            //num = num / 1000;
//                            //contor += 3;
//                            contor = 2;
//                            help.add(Math.pow(10, contor));
//                            num = num - 100;
//                        }
//                    }
//                else {
//                    if (num % 50 == 0) {
//                        contor = 1;
//                        help.add(5 * Math.pow(10, contor));
//                        num = num  - 50;
//                    }
//                    else {
//                        //help.add(num % 100 * Math.pow(10, contor));
//                        //num = num / 100;
//                        //contor += 2;
//                        contor = 1;
//                        help.add(Math.pow(10, contor));
//                        num = num - 10;
//                    }
//                }
//            else {
//                if (num % 5 == 0) {
//                    contor = 0;
//                    help.add(5 * Math.pow(10, contor));
//                    num = num  - 5;
//                }
//                else {
//                    //help.add(num % 10 * Math.pow(10, contor));
//                    //num = num / 10;
//                    //contor += 1;
//                    contor = 0;
//                    help.add(Math.pow(10, contor));
//                    num = num - 1;
//                }
//            }
//        }
//        for (int i = help.size() - 1; i > 0; i--) {
//            int j = 0;
//            switch (help.get(i)) {
//                case 1000:
//                    res.set(j, "M");
//                case 500:
//                    res.set(j, "D");
//                case 100:
//                    res.set(j, "C");
//                case 50:
//                    res.set(j, "L");
//                case 10:
//                    res.set(j, "X");
//                case 5:
//                    res.set(j,"V");
//                case 1:
//                    res.set(j, "I");
//            }
//        }
//        //return help;
//        return res;
//    }
//
//    public static void main(String[] args) {
//
//        int num;
//        Scanner scanner = new Scanner(System.in);
//        num = scanner.nextInt();
//        System.out.println(intToRoman(num));
//    }
//}
