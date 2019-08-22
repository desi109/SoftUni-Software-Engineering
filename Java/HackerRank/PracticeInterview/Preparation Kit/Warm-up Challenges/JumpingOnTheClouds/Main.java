//Problem: https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem

import java.io.*;
import java.util.*;

public class Main {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int count = 0, i = 0;

        while(true) {
            if(i + 2 < c.length && c[i + 2] == 0) {
                i += 2;
            } else if(i + 1 < c.length) {
                i++;
            } else {
                break;
            }
            count++;
        }

        return count;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);

    }
