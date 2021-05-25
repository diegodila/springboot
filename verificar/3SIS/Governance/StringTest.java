import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void TestString() throws IOException {
		int a = CheckPoint.capturaNro('b');
		assertEquals(a, 2);
	}

}
