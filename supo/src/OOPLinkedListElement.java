public class OOPLinkedListElement {
    private final int x;
    private OOPLinkedListElement next;

    public OOPLinkedListElement(int x, OOPLinkedListElement next) {
        this.x = x;
        this.next = next;
    }

    public int getX() {
        return this.x;
    }

    public OOPLinkedListElement getNext() {
        return this.next;
    }

    public void setNext(OOPLinkedListElement next) {
        this.next = next;
    }
}
