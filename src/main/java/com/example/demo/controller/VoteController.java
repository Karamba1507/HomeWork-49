package com.example.demo.controller;

import com.example.demo.Candidate;
import com.example.demo.VoteMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VoteController {

    @Autowired
    VoteMachineService voteMachineService;


    @RequestMapping(value = "/")
    public String start() {
        return "start";
    }


    @RequestMapping(value = "/candidates")
    public String startVote(@RequestParam(name = "name", required = false, defaultValue = "Thanks") String name, Model model) {

        List<Candidate> candidates = voteMachineService.getCandidates();

        model.addAttribute("candidate", candidates);
        return "candidates";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/choose")
    public String createVote(@RequestParam(name = "id", required = false, defaultValue = "Thanks") String candidateId, Model model) {

        Candidate candidate1 = null;

        for (Candidate candidate : voteMachineService.getCandidates()) {
            if (candidate.getId() == Integer.parseInt(candidateId)) {
                candidate1 = candidate;
                int vote = candidate1.getCountVotes();
                candidate1.setCountVotes(vote + 1);
                break;
            }
        }


        model.addAttribute("candidate", candidate1);
        return "choose";
    }
}


//.split("=")[1].trim()


