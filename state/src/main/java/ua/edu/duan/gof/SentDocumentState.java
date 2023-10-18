package ua.edu.duan.gof;

public class SentDocumentState implements IDocumentState{
    @Override
    public String getStateName() {
        return "SENT";
    }

    @Override
    public void handle() {
        System.out.println("SEND state handle");
    }

    @Override
    public void nextState(DocumentContext context) {
        context.setState(new DeliveredDocumentState());
    }
}
