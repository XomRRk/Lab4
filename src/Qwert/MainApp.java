package Qwert;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        Box<Apple> applebox= new Box<>(new Apple(), new Apple());
        Box<Apple> applebox1= new Box<>(new Apple(), new Apple());
        Box<Orange> orangebox1= new Box<>(new Orange(), new Orange());
        System.out.println("Вес коробки яблок: "+applebox.getWeight());
        System.out.println("Вес коробки апельсинов: "+orangebox1.getWeight());
        System.out.println("Сранение коробок по весу: "+applebox.compare(orangebox1));
        System.out.println("Сранение коробок по весу: "+applebox.compare(applebox1));

        applebox.append(4);

        System.out.println("Коробка яблок");
        applebox.print();
        System.out.println("Коробка яблок1");
        applebox1.print();


        applebox1.put(applebox);

        System.out.println("Коробка яблок");
        applebox.print();
        System.out.println("Коробка яблок1");
        applebox1.print();


    }
}
