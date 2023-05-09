// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int topUpAmount = 1100;
        int bonusAmount = 0;
        if (topUpAmount > 1000) {
            bonusAmount = topUpAmount / 100;
        }
        int finalBalance = balance + topUpAmount + bonusAmount;
        System.out.println("Итоговый баланс: " + finalBalance + " рублей");
        System.out.println("Бонусы: " + bonusAmount + " рублей");
    }
}