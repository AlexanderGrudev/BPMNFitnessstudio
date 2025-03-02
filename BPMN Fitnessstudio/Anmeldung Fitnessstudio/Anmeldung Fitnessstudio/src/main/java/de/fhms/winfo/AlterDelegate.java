package de.fhms.winfo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("AlterService")
public class AlterDelegate implements JavaDelegate {

    public void execute(DelegateExecution execution) throws Exception {
        String status = (String) execution.getVariable("erlaubnis");
        int rating = 3;
        if ("Ja".equals(status)) rating=2;
        if ("Nein".equals(status)) rating=1;
        execution.setVariable("yearRating", rating);
    }
}
