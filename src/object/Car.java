package object;

public class Car {

    private String carMake;
    private String carModel;
    private Integer carYear;

    //create constructor
    public Car(String carMake, String carModel, Integer carYear) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;
    }

    //create getter and setter for
    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getCarYear() {
        return carYear;
    }

    public void setCarYear(Integer carYear) {
        this.carYear = carYear;
    }
}
