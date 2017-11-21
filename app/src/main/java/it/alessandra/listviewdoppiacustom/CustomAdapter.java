package it.alessandra.listviewdoppiacustom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by utente7.academy on 21/11/2017.
 */

public class CustomAdapter extends ArrayAdapter<Dipendente> {

    private int resource;
    private LayoutInflater inflater;
    private List <Dipendente> dipendenti;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Dipendente> objects) {
        super(context, resource, objects);
        this.resource = resource;
        this.dipendenti = objects;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Nullable
    @Override
    public Dipendente getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View v, @NonNull ViewGroup parent) {
        if(v == null){
            v = inflater.inflate(R.layout.itemlistapiena,null);
        }

        Dipendente d = getItem(position);
        TextView nomeP;
        TextView cognomeP;
        TextView telefonoP;

        nomeP = (TextView) v.findViewById(R.id.nomeP);
        cognomeP = (TextView) v.findViewById(R.id.cognomeP);
        telefonoP = (TextView) v.findViewById(R.id.telefonoP);

        nomeP.setText(d.getNome());
        cognomeP.setText(d.getCognome());
        telefonoP.setText(d.getTelefono());

        return v;
    }

/*   public void eliminaDip(){
        dipendenti.remove(0);
   }*/
}
