
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.advance(1);
    }
    public void advance(int howManyDays) {
        this.day += howManyDays;
        while (this.day > 30) {
            this.day -= 30;
            this.month += 1;
        }
        while (this.month > 12) {
            this.month -= 12;
            this.year += 1;
        }
        while (this.day < 0) {
            this.day += 30;
            this.month -= 1;
        }
        while (this.month < 0) {
            this.month += 12;
            this.year -= 1;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate clone = new SimpleDate(this.day, this.month, this.year);
        clone.advance(days);
        return clone;
    }

}
