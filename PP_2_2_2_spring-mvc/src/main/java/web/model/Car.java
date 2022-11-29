package web.model;


public class Car {

    public Car() {
    }

    public Car(String mark, String model, Double engine) {
        this.mark = mark;
        this.model = model;
        this.engine = engine;
    }

    private String mark;
    private String model;
    private Double engine;




    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
