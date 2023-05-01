package ru.homeworktwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Singleton
@Service
public final class Scene {
    private static Scene INSTANCE;

    private List<Shape> shapeList;

    @Autowired
    public void setShapeList(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }



    public static synchronized Scene getInstance(){

        if (INSTANCE==null){
            INSTANCE = new Scene();
        }
        return INSTANCE;

    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void draw(){
for (Shape elem: shapeList){
    System.out.println(elem);
}

  }

}
