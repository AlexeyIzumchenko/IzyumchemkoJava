import java.util.Scanner;

public class program2
{
    /* Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате
       сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();

        if (a.equals(b))
        {
            System.out.println("Строки идентичны");
        }
        else
        {
            System.out.println("Строки неидентичны");
        }
    }
}