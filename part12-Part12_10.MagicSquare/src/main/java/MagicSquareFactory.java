
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        int nextNumber = 1;
        int r = 0;
        int c = size / 2;
        while (true) {
            square.placeValue(c, r, nextNumber);
            nextNumber++;
            if (nextNumber > size * size) {
                break;
            }
            int rOld = r;
            int cOld = c;

            r = fix(r - 1, size);
            c = fix(c + 1, size);
            if (square.readValue(c, r) != 0) {
                r = rOld;
                c = cOld;
                while (square.readValue(c, r) != 0) {
                    r = fix(r + 1, size);
                }
            }
        }
        // implement the creation of a magic square with the Siamese method algorithm here
        return square;
    }
    private int fix(int i, int size) {
        if (i < 0) {
            return size - 1;
        }
        if (i >= size) {
            return 0;
        }
        return i;
    }

}
