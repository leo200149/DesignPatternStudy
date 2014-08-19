import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * A new output stream, which will double write character
 * to the output stream.
 * 
 * @author Magic
 * 
 */
public class DoubleOutputStream extends FilterOutputStream {
	public DoubleOutputStream(OutputStream out) {
		super(out);
	}

	@Override
	public void write(int b) throws IOException {
		super.write(b);
		super.write(b);
	}

	
}