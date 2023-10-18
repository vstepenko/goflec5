package ua.edu.duan.gof;

public interface IDocumentState {
    String getStateName();
    void handle();
    void nextState(DocumentContext context);
}
