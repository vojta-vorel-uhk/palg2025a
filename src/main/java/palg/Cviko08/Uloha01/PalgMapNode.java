package palg.Cviko08.Uloha01;

public class PalgMapNode
{
    private long key;
    private Person value;
    private PalgMapNode left;
    private PalgMapNode right;

    public PalgMapNode(long key, Person value, PalgMapNode left, PalgMapNode right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public Person getValue() {
        return value;
    }

    public void setValue(Person value) {
        this.value = value;
    }

    public PalgMapNode getLeft() {
        return left;
    }

    public void setLeft(PalgMapNode left) {
        this.left = left;
    }

    public PalgMapNode getRight() {
        return right;
    }

    public void setRight(PalgMapNode right) {
        this.right = right;
    }
}
