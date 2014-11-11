package ru.ifmo.md.colloquium2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pinguinson on 11.11.2014.
 */
public class CandidateAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<Candidate> candidates;

    public CandidateAdapter(Context context, ArrayList<Candidate> candidates) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.candidates = candidates;
    }

    @Override
    public int getCount() {
        return candidates.size();
    }

    @Override
    public Object getItem(int i) {
        if (0 <= i && i < candidates.size()) {
            return candidates.get(i);
        }
        return null;
    }


    public void add(Candidate candidate) {
        candidates.add(candidate);
        Log.d("ADAPTER", "added candidate");
        notifyDataSetChanged();
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int index, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.candidate, parent, false);
        }
        Candidate candidate = candidates.get(index);

        TextView name = (TextView) view.findViewById(R.id.candidate_name);
        TextView counter = (TextView) view.findViewById(R.id.vote_counter);
        name.setText(candidate.getName());
        counter.setText(Integer.toString(candidate.getVotes()));

        return view;
    }
}
