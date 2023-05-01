

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.homeworktwo.AppConfiguration;
import ru.homeworktwo.Scene;

public class TestAppTest {
    public AnnotationConfigApplicationContext ctx ;

    @Before
  public void init(){
        ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);

  }
  @Test
  public void testScene(){
      System.out.println(ctx);
    Scene scene = ctx.getBean(Scene.class);
      scene.draw();

  }
}
