package kg.obval.ov2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    EditText usdPokupka, eurPokupka,rubPokupka, kztPokupka;
    EditText usdProdazha, eurProdazha,rubProdazha,kztProdazha;
    Button saveButton;

    Double usdPok, eurPok, rubPok, kztPok;
    Double usdProd, eurProd, rubProd, kztProd;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    Course course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                course = dataSnapshot.getValue(Course.class);
                usdPokupka.setText(String.valueOf(course.getUSDpok()));
                usdProdazha.setText(String.valueOf(course.getUSDprod()));
                eurPokupka.setText(String.valueOf(course.getEURpok()));
                eurProdazha.setText(String.valueOf(course.getEURprod()));
                rubPokupka.setText(String.valueOf(course.getRUBpok()));
                rubProdazha.setText(String.valueOf(course.getRUBprod()));
                kztPokupka.setText(String.valueOf(course.getKZTpok()));
                kztProdazha.setText(String.valueOf(course.getKZTprod()));
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usdPok = Double.parseDouble(usdPokupka.getText().toString());
                usdProd = Double.parseDouble(usdProdazha.getText().toString());
                eurPok = Double.parseDouble(eurPokupka.getText().toString());
                eurProd = Double.parseDouble(eurProdazha.getText().toString());
                rubPok = Double.parseDouble(rubPokupka.getText().toString());
                rubProd = Double.parseDouble(rubProdazha.getText().toString());
                kztPok = Double.parseDouble(kztPokupka.getText().toString());
                kztProd = Double.parseDouble(kztProdazha.getText().toString());

                course.setUSDpok(usdPok);
                course.setUSDprod(usdProd);
                course.setEURpok(eurPok);
                course.setEURprod(eurProd);
                course.setRUBpok(rubPok);
                course.setRUBprod(rubProd);
                course.setKZTpok(kztPok);
                course.setKZTprod(kztProd);

                databaseReference.setValue(course);
            }
        });


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

        course = new Course();

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("course");
    }
}
