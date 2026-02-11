package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    /**
     * Checks if a position on the road is occupied.
     *
     * @param position the position to check
     * @return true if the position is occupied, false otherwise
     */
    public boolean isOccupied(int position) {
        if (!isValid(position)) {
            return true; // Consider invalid positions as occupied
        }
        return this.occupied[position];
    }

    /**
     * Checks if a position is valid on this road.
     *
     * @param position the position to check
     * @return true if the position is valid, false otherwise
     */
    public boolean isValid(int position) {
        return position >= 0 && position < this.occupied.length;
    }
}
