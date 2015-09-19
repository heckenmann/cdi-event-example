package de.heckenmann.cdieventexample.beans;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import de.heckenmann.cdieventexample.MeinEvent;

public class Receiver1 {

    @Inject
    private LogBean lb;

    public void listen(@Observes final MeinEvent e) {
        this.lb.addEvent(this.getClass().getName().concat(": Event aufgenommen von ").concat(e.getSource()));
    }

}
