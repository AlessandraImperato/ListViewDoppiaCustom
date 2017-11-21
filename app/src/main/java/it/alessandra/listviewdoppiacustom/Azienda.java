package it.alessandra.listviewdoppiacustom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by utente7.academy on 21/11/2017.
 */

public class Azienda {
    private List<Dipendente> dipendenti;

    public Azienda(){
        this.dipendenti = new ArrayList<Dipendente>();
    }

    public Azienda(List<Dipendente> dipendenti){
        this.dipendenti = dipendenti;
    }

    public List<Dipendente> getDipendenti() {
        return dipendenti;
    }

    public void setDipendenti(List<Dipendente> dipendenti) {
        this.dipendenti = dipendenti;
    }

    public void init(){
        Dipendente d1 = new Dipendente("Alessio", "Aiello", "3335289674");
        Dipendente d2 = new Dipendente("Serena", "Lo Giudice","3478521479");
        Dipendente d3 = new Dipendente("Giuseppe", "Giustolisi", "3392031573");
        Dipendente d4 = new Dipendente("Mario", "Panettieri", "3392031573");
        Dipendente d5 = new Dipendente("Federica", "Raneri", "3392031741");
        Dipendente d6 = new Dipendente("Giuseppe", "Rapisarda", "3392336573");
        Dipendente d7 = new Dipendente("Alessandra", "Giustolisi", "3358031573");

        dipendenti.add(d1);
        dipendenti.add(d2);
        dipendenti.add(d3);
        dipendenti.add(d4);
        dipendenti.add(d5);
        dipendenti.add(d6);
        dipendenti.add(d7);
    }


}
