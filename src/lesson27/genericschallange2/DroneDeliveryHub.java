package lesson27.genericschallange2;

public interface DroneDeliveryHub {

    int getId();
    String getType();
    boolean matches(String field, String value);
}
