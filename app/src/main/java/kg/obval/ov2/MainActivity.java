package kg.obval.ov2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText usdPokupka, eurPokupka,rubPokupka, kztPokupka;
    EditText usdProdazha, eurProdazha,rubProdazha,kztProdazha;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        usdPokupka = (EditText) findViewById(R.id.editTextUSDpokupka);
        usdProdazha = (EditText) findViewById(R.id.editTextUSDprodazha);
        eurPokupka = (EditText) findViewById(R.id.editTextEURpokupka);
        eurProdazha = (EditText) findViewById(R.id.editTextEURprodazha);
        rubPokupka = (EditText) findViewById(R.id.editTextRUBpokupka);
        rubProdazha = (EditText) findViewById(R.id.editTextRUBprodazha);
        kztPokupka = (EditText) findViewById(R.id.editTextKZTpokupka);
        kztProdazha = (EditText) findViewById(R.id.editTextKZTprodazha);

        saveButton = (Button) findViewById(R.id.saveButton);
    }
}
