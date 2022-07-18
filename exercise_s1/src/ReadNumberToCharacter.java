import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadNumberToCharacter {
    public static void main(String[] args) {
        int a = 1;
        while (a > 0) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter number:");
            int number = myObj.nextInt();

            //b2:đọc các số có một chữ số
            if (number >= 0 && number < 10) {
                switch (number) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("For");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Oop!");
                }
            }
            //b3:đọc các số có hai chữ số nhỏ hơn hoặc bẳng 20
            else if (number >= 10 && number <=20) {
                //Số từ 10 đến 15 và 20:
                switch (number) {
                    case 10:
                        System.out.println("Ten");
                        break;
                    case 11:
                        System.out.println("Eleven");
                        break;
                    case 12:
                        System.out.println("Twelve");
                        break;
                    case 13:
                        System.out.println("Thirteen");
                        break;
                    case 14:
                        System.out.println("Fourteen");
                        break;
                    case 15:
                        System.out.println("Fifteen");
                        break;
                    case 20:
                        System.out.println("Twenty");
                        break;
                }
                //Số từ 16 đến 19:
                // tinh so hang don vi
                int ones = number % 10;
                switch (ones) {
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                }
            }

            //b4:đọc các số có hai chữ số lớn hơn  20 nhỏ hơn 100
            else if (number > 20 && number < 100) {
                int tens = number / 10;
                int ones = number % 10;

                switch (tens) {
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirty ");
                        break;
                    case 4:
                        System.out.print("Fourty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                }

                switch (ones) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }

            //b5: đọc các số có ba chữ số 100-110 111-115 116-120 121-999
            else if (number >= 100 && number < 1000) {
                int hundred = number / 100;
                int ten = number % 100;
                int tens = ten / 10;
                int ones = ten % 10;

                switch (hundred) {
                    case 1:
                        System.out.print("One hundred ");
                        break;
                    case 2:
                        System.out.print("Two hundred ");
                        break;
                    case 3:
                        System.out.print("Three hundred ");
                        break;
                    case 4:
                        System.out.print("Four hundred ");
                        break;
                    case 5:
                        System.out.print("Five hundred ");
                        break;
                    case 6:
                        System.out.print("Six hundred ");
                        break;
                    case 7:
                        System.out.print("Seven hundred ");
                        break;
                    case 8:
                        System.out.print("Eight hundred ");
                        break;
                    case 9:
                        System.out.print("Nine hundred ");
                        break;
                }

                //100-110
                if (ten >= 0 && ten <10) {
                    switch (ones) {
                        case 0:
                            System.out.println(" ");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                }

                //110-115 116-120
                else if (ten >= 10 && ten <=20) {
                    //Số từ 10 đến 15 và 20:
                    switch (ten) {
                        case 10:
                            System.out.println("Ten");
                            break;
                        case 11:
                            System.out.println("Eleven");
                            break;
                        case 12:
                            System.out.println("Twelve");
                            break;
                        case 13:
                            System.out.println("Thirteen");
                            break;
                        case 14:
                            System.out.println("Fourteen");
                            break;
                        case 15:
                            System.out.println("Fifteen");
                            break;
                        case 20:
                            System.out.println("Twenty");
                            break;
                    }
                    //Số từ 16 đến 19:
                    // tinh so hang don vi
                    switch (ones) {
                        case 6:
                            System.out.println("Sixteen");
                            break;
                        case 7:
                            System.out.println("Seventeen");
                            break;
                        case 8:
                            System.out.println("Eighteen");
                            break;
                        case 9:
                            System.out.println("Nineteen");
                            break;
                    }
                }

                //121-999
                else if (ten > 20 && ten <=99) {
                    switch (tens) {
                        case 2:
                            System.out.print("Twenty ");
                            break;
                        case 3:
                            System.out.print("Thirty ");
                            break;
                        case 4:
                            System.out.print("Forty ");
                            break;
                        case 5:
                            System.out.print("Fifty ");
                            break;
                        case 6:
                            System.out.print("Sixty ");
                            break;
                        case 7:
                            System.out.print("Seventy ");
                            break;
                        case 8:
                            System.out.print("Eighty ");
                            break;
                        case 9:
                            System.out.print("Ninety ");
                            break;
                    }

                    switch (ones) {
                        case 0:
                            System.out.println("");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                }
            }
        }
    }
}
