public class ShipsCounter {
    private int[][] field;

    public ShipsCounter(int[][] field) {
        this.field = field;
    }

    public int[][] getField() {
        return field;
    }

    public int getCountShips(int[][] field) {
        int countShips = 0;
        for (int coordY = 0; coordY < field.length; coordY++) {
            for (int coordX = 0; coordX < field[coordY].length;
                 coordX++) {
                int element = field[coordY][coordX];
                if (element == 1) {
                    boolean addedShip = shipIsAdded(coordY, coordX);
                    if (!addedShip) {
                        countShips++;
                    }
                }
            }
        }
        return countShips;
    }

    public boolean shipIsAdded(int coordinateY, int coordinateX) {
        boolean isAddedShip = false;
        if (coordinateX > 0 && field[coordinateY][coordinateX - 1] == 1
                || coordinateY > 0 && field[coordinateY - 1][coordinateX] == 1) {
            isAddedShip = true;
        }
        return isAddedShip;
    }
}
