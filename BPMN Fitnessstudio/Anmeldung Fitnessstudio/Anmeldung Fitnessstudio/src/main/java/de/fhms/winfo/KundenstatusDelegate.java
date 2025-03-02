package de.fhms.winfo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("KundenStatus")
public class KundenstatusDelegate implements JavaDelegate {

    public void execute(DelegateExecution execution) throws Exception {
        String status = (String) execution.getVariable("kunde");
        int rating = 0;
        if ("Neukunde".equals(status)) rating=2;
        if ("Altkunde".equals(status)) rating=1;
        execution.setVariable("kundenstatus", rating);
    }
}

