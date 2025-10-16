//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int firstFriday = 2;
        for (; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("Задача 2.1");
        int runningDistance = 0;
        int totalDistance = 42195;
        do {
            System.out.println("Держитесь! Осталось " + (totalDistance - runningDistance) + " метров!");
            runningDistance = runningDistance + 500;
        }
        while (runningDistance <= totalDistance);
        System.out.println("Задача 2.2");
        for (int runDistance = 0; runDistance <= 42195; runDistance = runDistance + 500) {
            System.out.println("Держитесь! Осталось " + (42195 - runDistance) + " метров!");
        }
        System.out.println("Задача 3.1");
        int budget = 1000;
        int day = 0;
        while (budget > 0) {
            day++;
            if (day % 5 == 0) {
                System.out.println(day + " день. Каждый 5 день парковка бесплатная!");
                continue;
            }
            budget = budget - 100;
            System.out.println(day + " день парковки. На счету осталось " + budget + " рублей.");
        }
        System.out.println("Задача 3.2");
        int numberOfDays = 1;
        for (int money = 2000; money > 0; numberOfDays++) {
            if (numberOfDays % 5 == 0) {
                System.out.println(numberOfDays + " день. Каждый 5 день парковка бесплатная!");
                continue;
            }
            money = money - 100;
            System.out.println(numberOfDays + " день парковки. На счету осталось " + money + " рублей.");
        }
        System.out.println("Задача 4");
        int month = 0;
        int total = 0;
        while (true) {
            month++;
            total = total + 15000;
            if (month % 6 == 0) {
                total = total + (total * 7 / 100);
                System.out.println("Накопленная сумма за " + month + " месяцев равна " + total + " рублей, с учетом выплаченных 7%.");
            }
            if (total >= 12_000_000) {
                System.out.println("Цель достигнута! Вы накопили " + total + " за " + month + " месяцев.");
                break;
            }
            System.out.println("За " + month + " месяцев вы накопили " + total + " рублей.");
        }
        System.out.println("Задача 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge <= 100) {
            if (overheats >= 3) {
                System.out.println("Устройство перегрелось! Заряд завершен.");
                break;
            }
            minute++;
            if (minute % 10 == 0) {
                overheats = overheats + 1;
                minute = minute + 2;
                System.out.println("Перегрев! Заряд устройства продолжится через 2 минуты.");
                continue;
            }
            charge = charge + 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут на " + charge + "%.");
    }

}