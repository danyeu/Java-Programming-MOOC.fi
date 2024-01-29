public class OneItemBox extends Box{
    private Item i;
    private boolean hasItem;
    public OneItemBox() {
        this.i = null;
    }


    @Override
    public void add(Item item) {
        if (!hasItem) {
            hasItem = true;
            i = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (!hasItem) {
            return false;
        }
        return i.equals(item);
    }
}
