package it.alessandra.listviewdoppiacustom;

/**
 * Created by utente7.academy on 21/11/2017.
 */

public class Dipendente {
    private String nome;
    private String cognome;
    private String telefono;

    public Dipendente(){
        this.nome = null;
        this.cognome = null;
        this.telefono = null;
    }

    public Dipendente(String nome, String cognome, String telefono){
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
