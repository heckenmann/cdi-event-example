package de.heckenmann.cdieventexample.beans;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named
public class LogBean {

    private final List<String> events = new ArrayList<>();

    public void addEvent(final String e) {
        this.events.add(new SimpleDateFormat("dd.MM.yyyy hh:mm:ss").format(new Date()).concat(" ").concat(e));
    }

    public List<String> getEvents() {
        return this.events;
    }
}