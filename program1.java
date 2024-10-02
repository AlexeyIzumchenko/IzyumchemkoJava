import java.util.Scanner;

public class program1
{
    /*
    Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
    - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
    - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a > b)
        {
            System.out.println("a > b");
        }
        else if (a < b)
        {
            System.out.println("a < b");
        }
        else
        {
            System.out.println("a = b");
        }

        System.out.println("a+b: " + (a + b));
        System.out.println("a-b: " + (a - b));
        System.out.println("a/b: " + (a / b));
        System.out.println("axb: " + (a * b));

    }
}