import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		byte[] buffer = new byte[1024];

		/**
		 * Create input stream from the standard input.
		 */
		InputStream in = new BufferedInputStream(new DataInputStream(System.in));
		/**
		 * write to the standard output.
		 */
		OutputStream out = new DoubleOutputStream(new DataOutputStream(
				System.out));
		try {
			System.out.println("Please input your words: ");
			int n = in.read(buffer, 0, buffer.length);
			for (int i = 0; i < n; i++) {
				out.write(buffer[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
