package behevioral.state;

public class StateContext {
    private State state;
    public StateContext() {
        this.state = null;
    }

    public StateContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return this.state;
    }
}
