package ru.working;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

//Singleton

@Scope(scopeName = "singleton")
public final class Scene {
    private static Scene INSTANCE;
    private List<Shape> shapeList;

    private Scene(){

    }


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
