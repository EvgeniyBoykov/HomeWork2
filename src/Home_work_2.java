public class Home_work_2 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int a = 6;
        int b = 5;
        boolean issum = isSum10and20(a, b);
        System.out.println(issum);

        System.out.println("Задание №2");
        printnum(-100);

        System.out.println("Задание №3");
        boolean isnumber = isnumber(0);
        System.out.println(isnumber);

        System.out.println("Задание №4");
        print("Текст сообщения", 5);
    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если
// да – вернуть true,в противном случае – false.
    public static boolean isSum10and20(int x, int y) {
        int sum = x + y;
        return 10 <= sum && sum <= 20;
    }

    //2. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали
// или отрицательное. Замечание: ноль считаем положительным числом.
    public static void printnum(int num) {
        if (num < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false
// если положительное.
    public static boolean isnumber(int num) {
        return num < 0;
    }

    //4. Написать метод, которому в качестве аргументов передается строка
// и число, метод должен отпечатать в консоль указанную строку,
// указанное количество раз;
    public static void print(String message, int n)
    {
        for (int i = 0; i < n; i++);
        {System.out.println(message);
        }
    }
}
