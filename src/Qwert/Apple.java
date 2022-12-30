package Qwert;

public class Apple  extends Fruit{
    private static int count =1;
    public Apple() {
        super(1.0f,"Apple"+String.valueOf(count));
        count++;
    }

}
