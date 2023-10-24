package web.model;

public class Car {
    private  String model;
    private  int series;
    private  int age;
    public Car(){

    }
    public Car(String model,int series,int age){
        this.model=model;
        this.series=series;
        this.age=age;
    }
    public String getModel(){
        return model;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSeries(){
        return series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge(){
        return age;
    }

    public void setSeries(int series) {
        this.series = series;
    }
    @Override
    public String toString(){
        return "Car" + age + model + series;
    }
}
