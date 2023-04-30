import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.working.AppConfig;
import ru.working.Circle;
import ru.working.Point;

import java.util.Arrays;

public class TestApp {
    public AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    public void testScene(){
//    Scene scene = ctx.getBean(Scene.class);
//    scene.draw();
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        Point point = ctx.getBean(Point.class);
        point.draw();
        Circle circle = ctx.getBean(Circle.class);
        circle.draw();


    }
}
