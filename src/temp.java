/*
public class temp {
    public String CarListToString(ArrayList<Car> cars) {
        StringBuilder carList = new StringBuilder();
        String tabs;


        System.out.println(ConsoleColors.BOXING + " Index" + "\t" + stringFormatter("Brand") + " " + stringFormatter("Name") + " " + stringFormatter("Model") + " " + stringFormatter("Topspeed") + " "+ stringFormatter("Color") + " ");
        for (Car car : cars) {
            if (car.getIndexCar() > 99) {
                tabs = "\t";
            } else tabs = "\t\t";
            carList.append(ConsoleColors.WHITE_BRIGHT + " ").append(car.getIndexCar()).append(tabs).append(stringFormatter(car.getBrand())).append(" ").append(stringFormatter(car.getName())).append(" ").append(stringFormatter(Integer.toString(car.getModel()))).append(stringFormatter(Integer.toString(car.getTopSpeed()))).append("\t\t ").append(stringFormatter(car.getColor())).append("\n");

        }
}
*/