package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class VoteMachineService {

    private List<Candidate> candidates;

    @PostConstruct
    public void fillCandidates() {

        Candidates candidates = new Candidates();

        this.candidates = candidates.getCandidates();

    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }
}



