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

public class CustomAdapterV extends ArrayAdapter<Dipendente> {

    private int resource;
    private LayoutInflater inflater;
    private List <Dipendente> dipendenti;

    public CustomAdapterV(@NonNull Context context, int resource, @NonNull List<Dipendente> objects) {
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
            v = inflater.inflate(R.layout.itemlistavuota,null);
        }

        Dipendente d = getItem(position);
        TextView nomeV;
        TextView cognomeV;
        TextView telefonoV;

        nomeV = (TextView) v.findViewById(R.id.nomeV);
        cognomeV = (TextView) v.findViewById(R.id.cognomeV);
        telefonoV = (TextView) v.findViewById(R.id.telefonoV);

        nomeV.setText(d.getNome());
        cognomeV.setText(d.getCognome());
        telefonoV.setText(d.getTelefono());

        return v;

    }
}
