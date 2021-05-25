import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class IntTest {
	@Test

	public void TestInt() throws IOException {
		int a = CheckPoint.capturaNro('b');
		assertEquals(a, 1);
	}
}
