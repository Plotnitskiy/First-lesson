public class Car {
    private CarType typeCar;

    Car(CarType typeCar) {
        this.typeCar = typeCar;
    }

    public void say() {
        switch (typeCar) {
            case BMW:
                System.out.println("BMW car");
                break;
            case AUDI:
                System.out.println("Audi car");
                break;
            case NISAN:
                System.out.println("Nisan car");
        }
    }
}
