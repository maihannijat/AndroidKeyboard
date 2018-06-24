package com.sunzala.afghankeyboard;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.sunzala.afghankeyboard.adapter.SearchAdapter;
import com.sunzala.afghankeyboard.database.DatabaseManager;

import java.util.ArrayList;

public class DictionaryActivity extends AppCompatActivity implements View.OnClickListener {

    EditText searchEditText;
    Spinner languageSpinner;
    ArrayList<String> languages, words;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        languageSpinner = findViewById(R.id.spinner);
        searchEditText = findViewById(R.id.searchText);
        Button searchButton = findViewById(R.id.searchButton);
        mRecyclerView = findViewById(R.id.recyclerView);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Set event listener on search button
        searchButton.setOnClickListener(this);

        // Array for spinner
        languages = new ArrayList<>();
        languages.add("English");
        languages.add("Farsi");
        languages.add("Pashto");

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
        String searchWord = searchEditText.getText().toString();

        if(!searchWord.equals("")) {
            DatabaseManager db = new DatabaseManager(this);

            String language = languages.get(languageSpinner.getSelectedItemPosition());

            words = new ArrayList<>();
            words = db.getAllRow(searchWord, language.toLowerCase());

            if(words.size() > 0) {
                // specify an adapter
                mAdapter = new SearchAdapter(words, this, language.toLowerCase());
                mRecyclerView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();

                // Hide Keyboard
                hideKeyboard();
            } else {
                Toast.makeText(this, getString(R.string.no_result), Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, getString(R.string.search_hint_toast), Toast.LENGTH_LONG).show();
        }
    }

    private void hideKeyboard() {
        // Check if no view has focus:
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            assert imm != null;
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
