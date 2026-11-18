package homework_5;

public class Main1 {
    static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard();
        creditCard1.accountNumber = "1111 2222 3333 4444";
        creditCard1.balance = 50000;

        CreditCard creditCard2 = new CreditCard();
        creditCard2.accountNumber = "1211 2222 3233 4244";
        creditCard2.balance = 50000;

        CreditCard creditCard3 = new CreditCard();
        creditCard3.accountNumber = "1131 2232 3333 4434";
        creditCard3.balance = 50000;

        System.out.println("-----------------------------------");
        System.out.println("Положил деньги на первые две карточки и снял с третьей");
        creditCard1.addMoneyCreditCard(15000);
        creditCard2.addMoneyCreditCard(10500.50);
        creditCard3.subMoneyCreditCard(9999.99);
        System.out.println("Вывожу информацию по всем карточка");
        System.out.println("-----------------------------------");

        System.out.println("1 карта");
        creditCard1.infoCreditCard();

        System.out.println("-----------------------------------");

        System.out.println("2 карта");
        creditCard2.infoCreditCard();

        System.out.println("-----------------------------------");

        System.out.println("3 карта");
        creditCard3.infoCreditCard();

        System.out.println("-----------------------------------");
    }
}
