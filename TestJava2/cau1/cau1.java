package TestJava2.cau1;

import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        int n, sum = 0, t;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Số phần tử của mảng n =  ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng vừa nhập
        System.out.println("\nMảng vừa nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        // tính tổng các phần tử có trong mảng
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("\nTổng các phần tử có trong mảng = " + sum);

        // tìm phần tử có giá trị lớn nhất và nhỏ nhất
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("\nPhần tử lớn nhất trong mảng là " + max);
        System.out.println("\nPhần tử lớn nhất trong mảng là " + min);

//        //In và tính tổng các phần tử là số lẻ và chia hết cho 3
        System.out.println("\nPhần tử là số lẻ và chia hết cho 3 là: ");
        int tong = 0;
        for (int i = 0; i < n; i++){
            if (array[i] % 2 != 0 && array[i] % 3 == 0){
                System.out.print( array[i] + " \t");


            tong += array[i];}}
            System.out.println("\nTổng các phần tử là số lẻ và chia hết cho 3 là: " + tong);

        // sắp xếp theo thứ tự giảm dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[i] < array[j]) {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp giảm dần là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }


        System.out.println("\nNhập số x =  ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        System.out.println("Số phần tử " + number + " có trong mảng = " + count);
    }
    }
