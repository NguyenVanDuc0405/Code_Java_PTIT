/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.util.Scanner;

/**
 *
 * @author NguyenVanDuc
 */
public class Tonguocso {
    static final int maxVal = (int) 2e6;
    static int[] prime = new int[maxVal + 5];
    static void primeDivisor () {
        for (int i = 2; i <= Math.sqrt(maxVal); i++) {
            if (prime[i] == 0) {
                for (int j = i; j <= maxVal; j += i) {
                    if (prime[j] == 0)
                    prime[j] = i;
                }
            }
        }
        for (int i = 2; i <= maxVal; i++) {
            if (prime[i] == 0) {
                prime[i] = i;
            }
        }
    }
    static void solution () {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long sum = 0;
        while (t-- > 0) {
            int n = input.nextInt();
            if (prime[n] == 0)
                sum += n;
            else {
                while (n != 1) {
                    sum += prime[n];
                    n /= prime[n];
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        primeDivisor();
        solution();
    }
}
