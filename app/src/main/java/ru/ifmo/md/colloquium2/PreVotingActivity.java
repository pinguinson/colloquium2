package ru.ifmo.md.colloquium2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class PreVotingActivity extends Activity {
    CandidateAdapter adapter;
    ArrayList<Candidate> candidates;
    public static final String HINT = "Добавить кандидата...";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_voting);
        candidates = new ArrayList<Candidate>();
        adapter = new CandidateAdapter(this, candidates);
    }


    public void addCandidate(View view) {
        //TODO: fix this shit
        EditText editText = (EditText) findViewById(R.id.editText);
        String name = editText.getText().toString();
        Candidate newCandidate = new Candidate(name);
        candidates.add(newCandidate);
        adapter = new CandidateAdapter(this, candidates);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        editText.getText().clear();

    }
}
