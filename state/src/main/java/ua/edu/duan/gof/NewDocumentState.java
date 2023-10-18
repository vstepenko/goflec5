package ua.edu.duan.gof;

public class NewDocumentState implements IDocumentState{
    @Override
    public String getStateName() {
        return "NEW";
    }

    @Override
    public void handle() {
        System.out.println("NEW Document state");
    }

    @Override
    public void nextState(DocumentContext context) {
        context.setState(new SentDocumentState());
    }
}
