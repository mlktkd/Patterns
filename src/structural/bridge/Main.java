package structural.bridge;

public class Main {
    public static void main(String[] args) {
        ShapeBridge square = new ShapeType(new Square());
        ShapeBridge triangle = new ShapeType(new Triangle());
        square.drawShape_ShapeBridge();
        System.out.println("*******************");
        triangle.drawShape_ShapeBridge();

        ShapeBridge blueTriangle = new Color(new BlueTriangle());
        blueTriangle.shapeBp.shapeType_IShape();
        blueTriangle.shapeBp.shapeColor_IShape();

        ShapeBridge redTriangle = new Color(new RedTriangle());
        redTriangle.shapeBp.shapeType_IShape();
        redTriangle.shapeBp.shapeColor_IShape();
    }
}
