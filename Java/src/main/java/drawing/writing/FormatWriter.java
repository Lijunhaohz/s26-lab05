package drawing.writing;

import drawing.shapes.Line;

import java.io.Writer;

/**
 * Abstract base class for format-specific writers.
 * Provides a common interface for converting lines to different formats.
 *
 * @author Refactor Task 3
 */
public abstract class FormatWriter extends Writer {
    /**
     * Writes a line to the output in the appropriate format.
     * 
     * @param line the line to write
     * @throws java.io.IOException if an I/O error occurs
     */
    public abstract void writeLine(Line line) throws java.io.IOException;
}
