//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println ( "Задача №1" );
        int money = 0;
        int i = 0;
        while (money <= 2459000) {
            money += 15000;
            i++;
            System.out.println ( "Месяц " + i + ", сумма накоплений равна " + money + "рублей" );
        }

        System.out.println ( "Задача №2" );
        i = 1;
        while (i <= 10) {
            System.out.print ( " " + i );
            i++;
        }
        System.out.println ( "\n" );
        while (i > 1) {
            i--;
            System.out.print ( " " + i );
        }

        System.out.println ( "\nЗадача №3" );
        int population = 12000000;
        for (int years = 1; years <= 10; years++) {
            population += population * (17 - 8) / 1000;
            System.out.println ( "Год " + years + ", численность населения составляет " + population );
        }

        System.out.println ( "Задача №4" );
        double moneyInBank = 15000.0f;
        i = 0;
        while (moneyInBank <= 12000000) {
            moneyInBank += moneyInBank * 0.07;
            i++;
            System.out.println ( "Месяц " + i + ", сумма накоплений равна " + moneyInBank + "рублей" );
        }

        System.out.println ( "Задача №5" );
        moneyInBank = 15000.0f;
        i = 0;
        while (moneyInBank <= 12000000) {
            moneyInBank += moneyInBank * 0.07;
            i++;
            if ( i % 6 == 0 )
                System.out.println ( "Месяц " + i + ", сумма накоплений равна " + moneyInBank + "рублей" );
        }

        System.out.println ( "Задача №6" );
        moneyInBank = 15000.0f;
        i = 0;
        while (i <= 108) {
            moneyInBank += moneyInBank * 0.07;
            i++;
            if ( i % 6 == 0 )
                System.out.println ( "Полугодие " + (i / 6) + ", сумма накоплений равна " + moneyInBank + "рублей" );
        }

        System.out.println ( "Задача №7" );
        int days = 2;
        do {
            System.out.println ( "Сегодня пятница, " + days + "-е число. Необходимо подготовить отчёт" );
            days += 7;
        } while (days < 31);

        System.out.println ( "Задача №8" );
        for (int years = 0; years <= 2024 + 100; years += 79) {
            if ( years >= 2024 - 200 ) {
                System.out.println ( years );
            }
        }
    }

}
