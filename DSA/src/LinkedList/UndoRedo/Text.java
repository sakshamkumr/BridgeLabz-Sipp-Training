package LinkedList.UndoRedo;

public class Text {
    String content;
    Text prev, next;

    public Text(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
