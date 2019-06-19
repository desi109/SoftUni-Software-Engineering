import java.math.BigInteger;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger secondNum = new BigInteger(scanner.nextLine());
        
        BigInteger sum = firstNum.add(secondNum);
        System.out.println(sum);
    }
}
