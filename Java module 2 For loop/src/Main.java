class Srednia{
    private int[] srednia;
    int sum = 0;
    public Srednia (int[] srednia)
    {
        this.srednia = srednia;
        for (int i = 0; i < srednia.length ; i++) {
           this.srednia[i] = i + 1;
        }
    }
    public void Display(){
        System.out.println("Elementy tablicy: ");
        for (int i = 0; i < srednia.length; i++) {
            System.out.println(srednia[i]);
            sum += srednia[i];
        }
    }
    public double Average(){

        return (double)sum / (double)srednia.length;
    }
}

public class Main {
    public static void main(String[] args) {

        int [] s = new int[20];
        Srednia srednia = new Srednia(s);
        srednia.Display();
        System.out.println("Średnia: " + srednia.Average());
        //zaokrąglić
        //System.out.println("Średnia: " + (srednia.Average() + 0.5) );
    }
}
