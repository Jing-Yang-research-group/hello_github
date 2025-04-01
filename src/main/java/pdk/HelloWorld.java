package pdk;

/**
 * @author Jiawei Mao
 * @version 1.0.0
 * @since 01 Apr 2025, 1:21 PM
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f;
        // Print the result 改变数据类型
        System.out.println("User's percentage is " + percentage);
    }
}
