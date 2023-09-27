package _04_method_oop_java.exercise;
import java.util.Random;
public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }


        public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

    public static void main(String[] args) {
            // Tạo một mảng ngẫu nhiên gồm 100,000 số
            int[] arr = new int[100000];
            Random rand = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(1000000); // Giới hạn số ngẫu nhiên từ 0 đến 999999
            }

            // Sử dụng StopWatch để đo thời gian thực thi của thuật toán sắp xếp chọn
            StopWatch stopwatch = new StopWatch();
            stopwatch.start();
            selectionSort(arr);
            stopwatch.stop();

            // In thời gian thực thi ra màn hình
            long elapsedTime = stopwatch.getElapsedTime();
            System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn cho 100,000 số: " + elapsedTime + " ms");
        }
    }

