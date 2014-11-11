package ru.ifmo.md.colloquium2;

/**
 * Created by pinguinson on 11.11.2014.
 */
public class Candidate {
    private int votes;
    private String name;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }

    public int getVotes() {
        return votes;
    }

    public String getName() {
        return name;
    }

    public void voteFor() {
        this.votes++;
    }
}
