package drawing.shapes;

import drawing.writing.FormatWriter;

import java.io.IOException;

/**
 * Refactor Task 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public interface Shape {

    /**
     * Converts shape into lines.
     *
     * @return lines of this shape.
     */
    Line[] toLines();

    /**
     * Draws this shape to the given writer.
     *
     * @param writer the writer to draw to
     */
    default void draw(FormatWriter writer) {
        try {
            Line[] lines = toLines();
            for (Line line : lines) {
                writer.writeLine(line); // The convertLine logic is hidden inside each FormatWriter subclass
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
