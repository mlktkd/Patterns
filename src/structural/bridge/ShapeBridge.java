package structural.bridge;

public abstract class ShapeBridge {
    protected IShape_BP shapeBp;

    protected ShapeBridge(IShape_BP shapeBp) {
        this.shapeBp = shapeBp;
    }
    abstract void drawShape_ShapeBridge();
    abstract void fillColor_ShapeBridge();
}
