package ua.edu.duan.gof;

public class DocumentContext {
    private IDocumentState state;

    public DocumentContext () {
        state = new NewDocumentState();
    }

    public void setState(IDocumentState state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }

    public void nextState() {
        state.nextState(this);
    }
}
