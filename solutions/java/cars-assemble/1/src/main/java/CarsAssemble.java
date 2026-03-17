public class CarsAssemble {
    private static int qty = 221;

    public double productionRatePerHour(int speed) {
        if (speed == 0) {
            return 0.0;
        } else if (speed <= 4) {
            return speed * qty;
        } else if (speed <= 8) {
            return speed * qty * 0.9;
        } else if (speed == 9) {
            return speed * qty * 0.8;
        } else if (speed == 10) {
            return speed * qty * 0.77;
        }
        return 0.0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
