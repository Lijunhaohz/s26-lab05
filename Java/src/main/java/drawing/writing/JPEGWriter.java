package drawing.writing;

import drawing.shapes.Line;

import java.io.IOException;

/**
 * Refactor Task 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class JPEGWriter extends FormatWriter {
    // This is a stub class. Pretend this writer work.
    public JPEGWriter(String s) {
    }

    @Override
    public void writeLine(Line line) throws IOException {
        write(line.toJPEG());
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {

    }

    @Override
    public void flush() throws IOException {
    }

    @Override
    public void close() throws IOException {
    }
}
