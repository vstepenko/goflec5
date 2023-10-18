package ua.edu.duan.gof;

public class DocEditor {
    private String text ="";
    private int style;

    public void addText(String text) {
        this.text += text;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public void print(){
        System.out.println("Style: "+ Integer.toString(style) + " Text : "+ text);
    }

    public DocEditorMemento saveToMemento(){
        return new DocEditorMemento(text, style);
    }

    public void restoreFromMemento(DocEditorMemento memento){
        this.text = memento.text;
        this.style = memento.style;
    }

    public static class  DocEditorMemento {
        private final String text;
        private final int style;

        public DocEditorMemento(String text, int style) {
            this.text = text;
            this.style = style;
        }
    }
}
