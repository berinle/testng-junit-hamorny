package foo;

import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author berinle
 */
public class TangledTest {
    @Test
    public void testName() throws Exception {
        assertThat(1, is(1));
    }
}
