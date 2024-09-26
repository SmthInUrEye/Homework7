//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println ( "Задача №1" );
        int money = 0;
        int i = 0;
        while (money <= 2459000) {
            money = money + 15000;
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

        System.out.println ( "Задача №3" );
        int population = 12000000;
        for (int years = 1; i <= 10; i++) {
            population += population * (17 - 8) / 1000;
            System.out.println ( "Год " + i + ", численность населения составляет " + population );
        }
    }

}
