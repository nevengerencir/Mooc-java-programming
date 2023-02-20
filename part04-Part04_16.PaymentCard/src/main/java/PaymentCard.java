public class PaymentCard {
    String name;
    private double balance;
    public PaymentCard(double newBalance,String name){
        this.balance=newBalance;
        this.name=name;
    }
    public String toString(){
        return  this.name +": The card had balance of " + balance + " euros";
    }
    public void eatAffordably(){
        if (this.balance - 2.60 <0){
            return;

        }
        this.balance-= 2.60;
        if (this.balance<0){
            this.balance = 0;
        }
    }
    public void eatHeartily(){
        if (this.balance - 4.60 <0){
            return;

        }
        this.balance-=4.60;

    }
    public void addMoney(int amount){
        if(amount < 0){
            return;
        }
        if(this.balance + amount > 150){
            this.balance = 150;
        }
        this.balance += amount;
    }
}
