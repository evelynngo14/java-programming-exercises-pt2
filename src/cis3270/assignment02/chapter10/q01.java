package cis3270.assignment02.chapter10;

public class q01 {
    class Time {
        int hour;
        int minute;
        int second;

        Time() {
            long currentMillis = System.currentTimeMillis();
            setTime(currentMillis);
        }

        Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        Time(long elapsedTime) {
            setTime(elapsedTime);
        }

        void setTime(long elapseTime) {
            long totalSeconds = elapseTime / 1000;
            second = (int)(totalSeconds % 60);

            long totalMinutes = totalSeconds / 60;
            minute = (int)(totalMinutes % 60);

            long totalHours = totalMinutes / 60;
            hour = (int)(totalHours % 24);
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }
    }

}
