import java.util.Enumeration;

public class Zad10 {

    class Plane {
        int angle;
        Direction currentDirection;

        static enum Direction {
            PROSTO,
            PRAWO,
            LEWO
        };

        public Plane() {
            this.angle = 0;
            currentDirection = Direction.PROSTO;
        }

        public void setAngle(int newAngle) {
            System.out.println("===================================");
            System.out.println("Old angle: " + this.angle + "\nOld direction: " + currentDirection);

            int difference = (newAngle - this.angle + 540) % 360 - 180;

            if (difference == 0) {
                currentDirection = Direction.PROSTO;
            } else if (difference > 0) {
                currentDirection = Direction.PRAWO;
            } else if (difference < 0) {
                currentDirection = Direction.LEWO;
            }

            this.angle = newAngle;
            System.out.println("New angle: " + this.angle + "\nNew direction: " + currentDirection);
        }
    }



    void main(String[] args) {
        Plane plane = new Plane();

        plane.setAngle(30);
        plane.setAngle(120);
        plane.setAngle(100);
        plane.setAngle(360);
    }
}
