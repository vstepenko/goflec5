package ua.edu.duan.gof;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DocEditorHistory {
    private final Stack<DocEditor.DocEditorMemento> mementoHistory = new Stack<>();


    public void add(DocEditor.DocEditorMemento memento){
        mementoHistory.push(memento);
    }

    public DocEditor.DocEditorMemento get(){
        return mementoHistory.pop();
    }
}
