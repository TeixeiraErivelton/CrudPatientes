package erivelton.crudPatiente.scheduler;

import erivelton.crudPatiente.service.PatienteService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class patienceScheduler {

    private final PatienteService patienteService;

    public patienceScheduler(PatienteService patienteService) {
        this.patienteService = patienteService;
    }

    @Scheduled(cron = "0/10 * * * * *")
    public void treckDate(){

        patienteService.process();
    }
}

