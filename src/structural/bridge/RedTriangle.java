package structural.bridge;

public class RedTriangle implements IShape_BP{
    @Override
    public void shapeType_IShape() {
        System.out.println("Inside the public class RedTriangle, in the method -> shapeType_IShape");
    }

    @Override
    public void shapeColor_IShape() {
        System.out.println("Inside the public class RedTriangle, in the method -> shapeType_IShape");
    }
}
