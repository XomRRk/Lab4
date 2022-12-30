package Qwert;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    public ArrayList<T> framework ;

    public Box(T... framework) {
        this.framework = new ArrayList<>(List.of(framework));
    }

    public ArrayList<T> getFramework() {
        return framework;
    }
    public float getWeight(){
        return framework.size()*framework.get(0).weight;
    }

    public boolean compare(Box f){
        if (f.getWeight() == framework.size()*framework.get(0).weight){
            return true;
        }
        else
            return false;
    }

    public void put(Box<T> f){
        while (framework.size()!=0){
            f.framework.add(framework.get(framework.size()-1));
            framework.remove(framework.size()-1);
        }
    }
    public  void append(int j){

        //fruit.getClass().getName();
        if (framework.get(0).getClass() == Apple.class )
            for(int i =0; i<j; i++)
                framework.add((T)new Apple());
        else
            for(int i =0; i<j; i++)
                framework.add((T)new Orange());
    }

    public void replac(T[]f, int i, int j){
        T n =f[i];
        f[i]=f[j];
        f[j]=n;
    }
    public  <T> List<T> convertArrayToList(T array[])
    {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
    public void print (){
        if (framework.size()>0)
            for (T f:framework)
                System.out.println(f);
        else
            System.out.println("Коробка пуста");
    }
}
