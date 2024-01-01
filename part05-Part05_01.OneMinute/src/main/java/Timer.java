public class Timer {
    private ClockHand hundredths = new ClockHand(100);
    private ClockHand seconds = new ClockHand(60);

    public Timer() {

    }

    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds.toString() + ":" + this.hundredths.toString();
    }
}
