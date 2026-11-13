package homework_5;

public class CreditCard {

    String accountNumber;
    double balance;

    public void addMoneyCreditCard(double sum){
        if (sum <= 0){
            System.out.println("На кредитную карту нельзя положить отрицательную или равную 0 сумму!!!");
        } else {
            this.balance += sum;
        }
    }

    public void subMoneyCreditCard(double sum){
        if (this.balance < sum){
            System.out.println("С кредитной карты нельзя снять сумму превышающую ее баланс!!!");
        }else if (sum < 0){
            System.out.println("С кредитной карты нельзя снять отрицательную сумму ");
        } else {
            this.balance -= sum;
        }
    }

    public void infoCreditCard(){
        System.out.println("Номер кредитной карты: " + this.accountNumber);
        System.out.println("----------------------------------------------");
        System.out.println("Баланс кредитной карты составляет: " + this.balance);
    }
}
