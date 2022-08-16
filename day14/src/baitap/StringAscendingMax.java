package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class StringAscendingMax {


    public static void main(String[] args) {
        int[] a = {1,3,4,2,7,5,6};    // luu gia tri ngau nhien cua n
        //int[] a = {12, 3, 5, 11, 15};    // luu gia tri ngau nhien cua n
        int[] l = new int[100];    // do dai tot nhat tai thoi diem i

        int[] b = new int[100];

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Nhap vao chuoi: ");
        //String inputString = scanner.nextLine();

        // buoc co so quy hoach dong
        l[0] = 1;
        int lmax; // luu gia tri max tu dau den phan tu i\

        // quy hoach dong
        for (int i = 1; i < a.length; i++) {
            lmax = 0;
            int jmax = 0;
            // Tim so nho hon tai thoi diem a[i]
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    if (l[j] > lmax) {
                        lmax = l[j];
                        jmax = j;
                    }
                }
            }
            l[i] = lmax + 1;
            b[i] = jmax;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }

        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(l[i] + "\t");
        }

        // Tim gia tri lon nhat trong mang l
        int lengMax = 0;
        for (int i = 0; i < a.length; i++) {
            if (l[i] > lengMax) {
                lengMax = l[i];
            }
        }
        System.out.println("\nDo dai day con lon nhat: " + lengMax);


        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + "\t");
        }

        // In ra gia tri
        int Max = 0;
        for (int i = 0; i < a.length; i++) {
            if (l[i] > l[Max]) {
                Max = i;
            }
        }
        System.out.println();

        int[] daoNguoc = new int[a.length];
        while (true) {
            int i = Max;
            System.out.print(a[i] + "\t");
            daoNguoc[i] = a[i];
            Max = b[i];
            if (b[Max] == 0) {
                System.out.println(a[Max] + "\t");
                daoNguoc[i - 1] = a[Max];
                break;
            }
        }

        System.out.println(Arrays.toString(daoNguoc));
        for (int i = 0; i < daoNguoc.length; i++) {
            if (daoNguoc[i] != 0) {
                System.out.print(daoNguoc[i] + "\t");
            }
        }
    }
}
// Welcome
// acdbgef
// acdg