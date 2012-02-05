package foo;

import com.sample.MyBean;
import com.sample.MyService;
import com.sample.config.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class ConfigTest {
    
    AnnotationConfigApplicationContext ctx;
    
    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        assertThat(ctx, is(not(nullValue())));
    }

    @Test(timeout = 1000)
    public void testName() throws Exception {
        MyService service = ctx.getBean(MyService.class);
        service.transfer();
    }

    @Test
    public void testScope() throws Exception {
        MyBean b1 = ctx.getBean(MyBean.class);
        MyBean b2 = ctx.getBean(MyBean.class);
        assertThat(b1, is(not(b2)));
    }

    @Test
    public void testServiceScope() throws Exception {
        MyService s1 = ctx.getBean(MyService.class);
        MyService s2 = ctx.getBean(MyService.class);
        assertThat(s1, is(not(s2)));
    }
}
