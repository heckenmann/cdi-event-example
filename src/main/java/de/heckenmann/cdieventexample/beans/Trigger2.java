package de.heckenmann.cdieventexample.beans;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

import de.heckenmann.cdieventexample.MeinEvent;

@RequestScoped
@Named
public class Trigger2 {

    @Inject
    private Event<MeinEvent> event;

    /**
     * Nach dem Erstellen wird das Event gefeuert.
     */
    public void fire() {
        this.event.fire(new MeinEvent(Trigger2.class.getCanonicalName()));
    }
}