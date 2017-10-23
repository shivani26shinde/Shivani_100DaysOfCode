import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodeSprint3Question1 {

    static int solve(String opr) {
        int a = Character.getNumericValue(opr.charAt(0));
        int b = Character.getNumericValue(opr.charAt(2));
        if(opr.charAt(1) == '+'){
            return a+b;
        }
        return a-b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}
