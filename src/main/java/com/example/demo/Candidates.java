package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Candidates {

    private List<Candidate> candidates = new ArrayList<>();

    public Candidates() {
        candidates.add(new Candidate(1, "John", "anon.jpeg", 0));
        candidates.add(new Candidate(2, "Benn", "anon.jpeg", 0));
        candidates.add(new Candidate(3, "Bill", "anon.jpeg", 0));
        candidates.add(new Candidate(4, "Mak", "anon.jpeg", 0));
        candidates.add(new Candidate(5, "Michael", "anon.jpeg", 0));
    }


    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }
}
