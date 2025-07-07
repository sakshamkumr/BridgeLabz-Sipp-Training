package LinkedList.UndoRedo;

class TextEditor {
    private Text head = null, tail = null;
    private Text current = null;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    // 1. Add a new text state
    public void addTextState(String newContent) {
        Text newState = new Text(newContent);

        // If current isn't tail, invalidate forward history
        if (current != null && current.next != null) {
            current.next = null;
            tail = current;
        }

        if (tail == null) {
            head = tail = newState;
        } else {
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
        }

        current = tail;
        size++;

        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // 2. Undo
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    // 3. Redo
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    // 4. Display current state
    public void displayCurrent() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty.");
        }
    }


    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addTextState("Hello");
        editor.addTextState("Hello World");
        editor.addTextState("Hello World!");
        editor.displayCurrent(); // Hello World!

        editor.undo();
        editor.displayCurrent(); // Hello World

        editor.undo();
        editor.displayCurrent(); // Hello

        editor.redo();
        editor.displayCurrent(); // Hello World
    }
}
