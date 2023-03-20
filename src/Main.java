public class Main {
    public static void main(String[] args) {
        // Givet klassen Clock nedan, lägg till en metod inc som lägger till en minut

        Clock clock = new Clock();
        clock.h = 22;
        clock.m = 14;

        // inc();

        System.out.println(clock);
    }
}

class Clock {
    int h;
    int m;

    @Override
    public String toString() {
        return String.format("%02d:%02d", h, m);
    }
}