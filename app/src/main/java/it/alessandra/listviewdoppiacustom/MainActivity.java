package it.alessandra.listviewdoppiacustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listaPiena;
    private ListView listaVuota;
    private Button Bsposta;
    private TextView nomeP;
    private TextView nomeV;
    private TextView cognomeP;
    private TextView cognomeV;
    private TextView telefonoP;
    private TextView telefonoV;
    private CustomAdapter customAdapter;
    private CustomAdapterV customAdapterV;
    private Azienda azienda;
    private List<Dipendente> dipendentiSpostati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        azienda = new Azienda();
        azienda.init();

        listaPiena = (ListView) findViewById(R.id.listapiena);
        listaVuota = (ListView) findViewById(R.id.listavuota);
        Bsposta = findViewById(R.id.bSposta);
        nomeP = findViewById(R.id.nomeP);
        nomeV = findViewById(R.id.nomeV);
        cognomeP = findViewById(R.id.cognomeP);
        cognomeV = findViewById(R.id.cognomeV);
        telefonoP = findViewById(R.id.telefonoP);
        telefonoV = findViewById(R.id.telefonoV);
        dipendentiSpostati = new ArrayList<Dipendente>();

        customAdapter = new CustomAdapter(this, R.layout.itemlistapiena, azienda.getDipendenti());
        customAdapterV = new CustomAdapterV(this, R.layout.itemlistavuota, dipendentiSpostati);

        listaPiena.setAdapter(customAdapter);
        listaVuota.setAdapter(customAdapterV);

        Bsposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (azienda.getDipendenti().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Nessun elemento da spostare",Toast.LENGTH_LONG).show();
                } else {
                    Dipendente primoDipendente = azienda.getDipendenti().get(0);
                    dipendentiSpostati.add(primoDipendente);
                    azienda.getDipendenti().remove(0);
                    customAdapter.notifyDataSetChanged();
                    customAdapterV.notifyDataSetChanged();
                }
            }
        });

    }
}
