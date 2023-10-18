package ua.edu.duan.gof;

public class DocEditorTest {
    public static void main(String[] args) {
        DocEditor docEditor = new DocEditor();
        DocEditorHistory history = new DocEditorHistory();
        docEditor.setStyle(10);
        docEditor.addText("Hello");
        history.add(docEditor.saveToMemento());

        docEditor.addText(" to All!");


        docEditor.print();

        docEditor.restoreFromMemento(history.get());

        docEditor.print();


    }
}
