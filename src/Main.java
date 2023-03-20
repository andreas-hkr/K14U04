public class Main {
    public static void main(String[] args) {
        // Givet klassen Clock nedan, lägg till en metod inc som lägger till en minut

        Clock clock = new Clock();
        clock.h = 23;
        clock.m = 59;

        clock.inc();

        System.out.println(clock);
    }
}

class Clock {
    int h;
    int m;

    void inc() {
        if (m < 59) {
            m++;
        } else {
            m = 0;
            if (h < 23) {
                h++;
            } else {
                h = 0;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", h, m);
    }
}