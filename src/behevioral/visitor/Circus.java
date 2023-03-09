package behevioral.visitor;

public class Circus implements IPlace{
    @Override
    public void accept(IVisitor v) {
        v.vizit(this);
    }
}
