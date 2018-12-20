import java.util.ArrayList;

public abstract class Plyta {

    private String tytul;
    private String rodzajFilmu;
    private static int iloscPlyt = 0;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getRodzajFilmu() {
        return rodzajFilmu;
    }

    public void setRodzajFilmu(String rodzajFilmu) {
        this.rodzajFilmu = rodzajFilmu;
    }

    public Plyta() {
        iloscPlyt++;
    }

    abstract void wypozycz();
    abstract void oddaj ();

    public void iloscPlytNaStanie(ArrayList lista){
        lista.size();

    }
    public void rodzajePlytNaStanie(ArrayList lista){
        for(Object element: lista){
            System.out.println(element);
        }
    }

    public boolean czyPuste(ArrayList lista){
        lista.isEmpty();
        return true;
    }

    public void rodzajNosnika(Plyta p){
        System.out.println(p.getClass());
    }
    


}
