public class Location {

    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }


    public static Location locateLargest(double[][] a) {
        if (a == null || a.length == 0 || a[0].length == 0) {
            return null;
        }

        int maxRow = 0;
        int maxColumn = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        return new Location(maxRow, maxColumn, maxValue);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }
}