import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        functional fun = new functional();

        Scanner in = new Scanner(System.in);

        System.out.println("Введте номер таска:");
        int choose = in.nextInt();

        if(choose == 1)
        {
            System.out.println("Введите число 1:");
            int num1 = in.nextInt();
            System.out.println("Введите число 2:");
            int num2 = in.nextInt();
            in.close();
            int answer = fun.reminder(num1, num2);
            System.out.println("Ответ:");
            System.out.println(answer);
        }
        else if (choose == 2)
        {
            System.out.println("Введите число выстоу:");
            double num1 = in.nextDouble();
            System.out.println("Введите число основание:");
            double num2 = in.nextDouble();
            in.close();
            double answer = fun.triArea(num1, num2);
            System.out.println("Ответ:");
            System.out.println(answer);
        }
        else if (choose == 3)
        {
            System.out.println("Введите число куриц:");
            int num1 = in.nextInt();
            System.out.println("Введите число коров:");
            int num2 = in.nextInt();
            System.out.println("Введите число свиней:");
            int num3 = in.nextInt();
            in.close();
            int answer = fun.animals(num1, num2, num3);
            System.out.println("Ответ:");
            System.out.println(answer);
        }
        else if (choose == 4)
        {
            System.out.println("Введите prob:");
            double num1 = in.nextDouble();
            System.out.println("Введите prize:");
            int num2 = in.nextInt();
            System.out.println("Введите pay:");
            int num3 = in.nextInt();
            in.close();
            boolean answer = fun.profitableGamble(num1, num2, num3);
            System.out.println("Ответ:");
            System.out.println(answer);
        }
        else if (choose == 5)
        {
            System.out.println("Введите N:");
            int num1 = in.nextInt();
            System.out.println("Введите a:");
            int num2 = in.nextInt();
            System.out.println("Введите b:");
            int num3 = in.nextInt();
            in.close();
            String answer = fun.operation(num1, num2, num3);
            System.out.println("Ответ:");
            System.out.println(answer);
        }
        else if (choose == 6)
        {
            System.out.println("Введите символ:");
            char num1 = '/';
            in.close();
            int answer = fun.ctoa(num1);
            System.out.println("Ответ:");
            System.out.println(answer);
        }
        else if (choose == 7)
        {
            System.out.println("Введите число:");
            int num1 = in.nextInt();
            in.close();
            int answer = fun.addUpTo(num1);
            System.out.println("Ответ:");
            System.out.println(answer);
        }
        else if (choose == 8)
        {
            System.out.println("Введите сторону 1:");
            int num1 = in.nextInt();
            System.out.println("Введите сторону 2:");
            int num2 = in.nextInt();
            in.close();
            int answer = fun.nextEdge(num1, num2);
            System.out.println("Ответ:");
            System.out.println(answer);
        }
        else if (choose == 9)
        {
            System.out.println("Сколько чисел:");
            short[] nums = new short[in.nextShort()];
            for(int i = 0; i < nums.length; i++)
            {
                System.out.println("Введите число");
                nums[i] = in.nextShort();
            }
            in.close();
            System.out.print("Ответ:");
            System.out.println(fun.sumOfCubes(nums));
        }
        else if (choose == 10)
        {
            System.out.println("Введите A:");
            short num1 = in.nextShort();
            System.out.println("Введите B:");
            short num2 = in.nextShort();
            System.out.println("Введите C:");
            short num3 = in.nextShort();
            in.close();
            System.out.println("Ответ:");
            System.out.println(fun.abcmath(num1, num2, num3));
        }
    }
}