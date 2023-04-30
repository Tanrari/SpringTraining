package ru.homeworkone;

import java.util.List;

//Singleton
public final class Scene {
    private static Scene INSTANCE;
    private List<Shape> shapeList;

    private Scene(){

    }

//    public static synchronized Scene getInstance(ArrayList listFactoryBean) {
//        if (INSTANCE==null){
//            INSTANCE = new Scene();
//        }
//        return INSTANCE;
//
//    }

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
