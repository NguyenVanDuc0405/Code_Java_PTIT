/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Daotu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String[] s = input.nextLine().split("\\s+");
            for (int i = 0; i < s.length; i++) {
                s[i] = new StringBuilder(s[i]).reverse().toString();
            }
            for (String i : s)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
