
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

    public Money plus(Money addition) {
        int c = this.cents + addition.cents;
        int e = this.euros + addition.euros;
        while (c >= 100) {
            c -= 100;
            e ++;
        }

        return new Money(e, c);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros > compared.euros) {
            return false;
        }
        if (this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int c = this.cents - decreaser.cents;
        int e = this.euros - decreaser.euros;
        while (c < 0) {
            c += 100;
            e -= 1;
        }
        if (c < 0 | e < 0) {
            return new Money(0,0);
        }
        return new Money(e, c);
    }
}
