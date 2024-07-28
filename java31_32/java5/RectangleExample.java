public class RectangleExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 5, 0, 0);
        Point p = new Point(2, 3);

        boolean isInsideXBounds = p.x >= rectangle.getX() && p.x <= rectangle.getX() + rectangle.getWidth();
        boolean isInsideYBounds = p.y >= rectangle.getY() && p.y <= rectangle.getY() + rectangle.getHeight();

        if (isInsideXBounds && isInsideYBounds) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}

class Rectangle {
    private double width;
    private double height;
    private double x;  // 左下のx座標
    private double y;  // 左下のy座標

    public Rectangle(double width, double height, double x, double y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
