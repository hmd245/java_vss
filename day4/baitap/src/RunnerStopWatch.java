
import java.time.LocalTime;

public class RunnerStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        int[] a = new int [100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int)(Math.random() * 1000);
        }
        selectionSort(a);

        stopWatch.stop();

        System.out.println("Time: " + stopWatch.getElapsendTime());

        // In mang da sap xep
        for (int x : a) {
            System.out.println(x);
        }
    }

    // Thuật toán sắp xếp chọn
    public static int[] selectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }
}
