package ua.edu.duan.gof;

public class DeliveredDocumentState implements IDocumentState {
    @Override
    public String getStateName() {
        return null;
    }

    @Override
    public void handle() {
        System.out.println("Delivered state");
    }

    @Override
    public void nextState(DocumentContext context) {
        //DO nothing
    }
}
