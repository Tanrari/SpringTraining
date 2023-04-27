import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.homeworkone.Coords;
import ru.homeworkone.Point;
import ru.homeworkone.Scene;
import ru.homeworkone.Shape;

public class TestScene {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


    @Test
    public void testShape(){
//        Scene.getInstance().draw();

    }
    @Test
    public void testCoords(){
//        Coords coords = (Coords) ctx.getBean("coords");
        Point point = (Point) ctx.getBean("point");
        System.out.println(point);
        Assert.assertEquals(32,point.getCoords().getX());
        Assert.assertEquals(75,point.getCoords().getY());
    }
    @Test
    public void testWork(){
        Scene scene = ctx.getBean(Scene.class);
        scene.draw();

    }
}
