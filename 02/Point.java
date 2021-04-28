public class Point {
    private double coordinateX, coordinateY;

    public Point(double coordinateX, double coordinateY) {
        setCoordinateX(coordinateX);
        setCoordinateY(coordinateY);
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public int getQuadrant() {
        if (coordinateX == 0 || coordinateY == 0) {
            return 0;
        } else {
            if (coordinateX > 0 && coordinateY > 0) {
                return 1;
            } else {
                if (coordinateX < 0 && coordinateY > 0) {
                    return 2;
                } else {
                    if (coordinateX < 0 && coordinateY < 0) {
                        return 3;
                    } else {
                        return 4;
                    }
                }
            }
        }
    }

    public String getTextQuadrant() {
        int quadrant = getQuadrant();

        if (quadrant != 0) {
            return "Q" + quadrant;
        } else {
            if (coordinateX == 0 && coordinateY == 0) {
                return "Origem";
            } else {
                if (coordinateX == 0) {
                    return "Eixo Y";
                } else {
                    return "Eixo X";
                }
            }
        }
    }
}