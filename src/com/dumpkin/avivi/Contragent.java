//simple class with names and increment number of "exemplyar" ^:)

package com.dumpkin.avivi;


public class Contragent {
    String agentName;
    String companyName;
    public static long number;

    public Contragent() {
number++;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAgentName() {
        return agentName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
