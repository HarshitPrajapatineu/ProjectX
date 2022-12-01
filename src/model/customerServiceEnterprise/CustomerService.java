/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.customerServiceEnterprise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author akshb
 */
public class CustomerService {

    private Map<String, String> queriesWithAnswers;
    private ArrayList<String> queries;
    private ArrayList<String> answers;

    public Map<String, String> getQueriesWithAnswers() {
        return queriesWithAnswers;
    }

    public void setQueriesWithAnswers(Map<String, String> queriesWithAnswers) {
        this.queriesWithAnswers = queriesWithAnswers;
    }

    public CustomerService() {
        this.queriesWithAnswers = new HashMap<>();
        this.queries = new ArrayList<>();
        this.answers = new ArrayList<>();
    }

}
