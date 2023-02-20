
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition){
        return new Money(this.euros + addition.euros, this.cents+ addition.cents());
    }
    public Money minus(Money decreaser){
        int cents = this.cents;
        int differenceCents = cents - decreaser.cents();
        int differenceEuroes = euros - decreaser.euros();

       
        if(this.cents == 0){
            differenceCents = 100 - decreaser.cents();
            differenceEuroes--;
        }
        int euros = this.euros;


        if (differenceCents < 0){
differenceEuroes--;
        }
        if(differenceEuroes <0){
            return new Money (0,0);
        }
        return new Money(differenceEuroes,differenceCents);
    }
    public boolean lessThan(Money compared){
        if (this.euros == compared.euros() && this.cents() < compared.cents()){
            return true;
        }
        if (this.euros < compared.euros){
            return true;
        }
        return false;
    }

}
