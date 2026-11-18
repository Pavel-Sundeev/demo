package homework_5;

public class Bankomat {
    int countTwenty;
    int countFifty;
    int countOneHundred;

    public Bankomat(int countTwenty, int countFifty, int countOneHundred) {
        this.countTwenty = countTwenty;
        this.countFifty = countFifty;
        this.countOneHundred = countOneHundred;
    }

    public void addMoney(int countTwenty, int countFifty, int countOneHundred){
        if (countTwenty < 0){
            System.out.println("Нельзя положить в банкомат отрицательную сумму 20 рублёвых купюр");
        } else {
            this.countTwenty += countTwenty;
        }


        if (countFifty < 0){
            System.out.println("Нельзя положить в банкомат отрицательную сумму 50 рублёвых купюр");
        } else {
            this.countFifty += countFifty;
        }

        if (countOneHundred < 0){
            System.out.println("Нельзя положить в банкомат отрицательную сумму 100 рублёвых купюр");
        } else {
            this.countOneHundred += countOneHundred;
        }
    }

    public boolean subMoney(int sum){
        boolean bool = false;
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;

        if (sum < 0){
            System.out.println("Нельзя с банкомата снять отрицательную сумму!!!");
            return bool;
        }

        if (sum > ((countTwenty * 20) + (countFifty * 50) + (countOneHundred * 100))){
            System.out.println("В банкомате недостаточно средств для снятия денежных средств");
            return bool;
        }

        for (int i = this.countOneHundred; i >= 0; i--) {
            int cost = 100 * i;
            if (cost > sum){
                continue;
            }
            for (int j = this.countFifty; j >= 0; j--) {
                int ost = (sum - cost) - 50 * j;
                if (ost < 0){
                    continue;
                }else {
                    if (ost % 20 == 0){
                        if (ost > countTwenty * 20){
                            System.out.println("Списание невозможно, не хватает средств");
                            return bool;
                        } else {
                            hundred = i;
                            fifty = j;
                            twenty = ost / 20;
                            bool = true;
                            break;
                        }
                    }
                }
            }
            if (bool){
                break;
            }
        }

        if (bool){
            System.out.println("Сумма была выдана: " + hundred + " x 100, " + fifty + " x 50, " + twenty + " x 20");
            this.countOneHundred -= hundred;
            this.countFifty -= fifty;
            this.countTwenty -= twenty;
            return bool;
        }else {
            return false;
        }
    }
}
