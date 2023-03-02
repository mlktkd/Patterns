package creational.abstractfactory;

public class Triangle implements IShape{
    @Override
    public void drawShape() {
        System.out.println("Triangle is drawing!");
    }
}
