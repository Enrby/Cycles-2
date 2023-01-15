public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int wanted = 2_459_000;
        int monthlyFee = 15000;
        int total = 0;
        int month = 1;
        while (total < wanted) {
            total = total + monthlyFee;
            System.out.println("Месяц " + month + " сумма накоплений " + total + " рублей");
            month++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 1;
        int bound = 10;
        while (number <= bound) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int coefficient = 1_000;
        int birthRate = 17;
        int mortality = 8;
        int difference = birthRate - mortality;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            population = population + population * difference / coefficient;
            System.out.println("Год " + year + ", чисенность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int wanted = 12_000_000;
        int total = 15_000;
        int month = 1;
        double percent = 7 / 100D;
        while (total < wanted) {
            total = total + (int) (total * percent);
            System.out.println("Месяц " + month + ", сумма накопленй равна " + total + " рублей");
            month++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int wanted = 12_000_000;
        int total = 15_000;
        int month = 1;
        double percent = 7 / 100D;
        while (total < wanted) {
            total = total + (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накопленй равна " + total + " рублей");
            }
            month++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int months = 9 * 12;
        int total = 15_000;
        double percent = 7 / 100D;
        for (int month = 1; month <= months; month++) {
            total = total + (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накопленй равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int fistFriday = 6;
        for (int friday = fistFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница  " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 7");
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        int firstTimeAppeared = 0;
        for (int year = start; year <= end; year++) {
            if (year % period == firstTimeAppeared) {
                System.out.println(year);
            }
        }
    }
}





