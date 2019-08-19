import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        print(n);
    }

    static void print(int n) {
        int[] nums = new int[n + 2];
        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 1;
        
        for (int i = 3; i < n + 2; i++)
            nums[i] = nums[i - 1] + nums[i - 2] + nums[i - 3];

        for (int i = 2; i < n + 2; i++)
            System.out.print(nums[i] + " ");
    }

}

