package com.sunzala.afghankeyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.sunzala.afghankeyboard.database.DatabaseManager;

import java.util.ArrayList;

public class DictionaryActivity extends AppCompatActivity implements View.OnClickListener {

    EditText searchText;
    Spinner languageSpinner;
    ArrayList<String> languages, words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        languageSpinner = findViewById(R.id.spinner);
        searchText = findViewById(R.id.searchText);
        Button searchButton = findViewById(R.id.searchButton);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Set event listener on search button
        searchButton.setOnClickListener(this);

        // Array for spinner
        languages = new ArrayList<>();
        languages.add("English");
        languages.add("Pashto");
        languages.add("Persian");

        // Add items to the spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, languages);
        languageSpinner.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.searchButton:
                search();
                break;
            default:
                break;
        }
    }

    private void search() {
        String searchWord = searchText.getText().toString();

        if(!searchWord.equals("")) {
            DatabaseManager db = new DatabaseManager(this);

            String language = languages.get(languageSpinner.getSelectedItemPosition());
            words = db.getAllRow(searchWord, language);
        } else {
            Toast.makeText(this, getString(R.string.search_hint_toast), Toast.LENGTH_LONG).show();
        }
    }
}
