public class OOPLinkedList {
    private OOPLinkedListElement hd;

    public OOPLinkedList() {
        this.hd = null;
    }

    // James: Good
    // adding elements
    public void addHd(int value) {
        this.hd = new OOPLinkedListElement(value, this.hd);
    }

    // getting elements
    public int getHd() {
        if (this.hd == null) {
            // James: Good error checking
            throw new IllegalStateException("empty list you joker");
        }
        return this.hd.getX();
    }

    // removing elements
    public void removeHd() {
        if (this.hd == null) {
            throw new IllegalStateException("empty list you joker");
        }
        this.hd = this.hd.getNext();
    }

    // get nth element
    public int getNth(int n) {
        OOPLinkedListElement tmp = this.hd;
        if (tmp == null) {
            throw new IllegalStateException("empty list you joker");
        }
        while (n > 0 && tmp != null) {
            tmp = tmp.getNext();
            n--;
        }
        if (tmp == null) {
            throw new IllegalStateException("index out of bounds!");
        }
        return tmp.getX();
    }

    // get length
    public int getLength() {
        int counter = 0;
        OOPLinkedListElement tmp = this.hd;
        while (tmp != null) {
            tmp = tmp.getNext();
            counter++;
        }
        return counter;
    }

}
