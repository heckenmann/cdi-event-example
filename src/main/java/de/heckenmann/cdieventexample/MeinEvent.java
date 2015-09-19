package de.heckenmann.cdieventexample;

/**
 * Meine Eventklasse.
 * @author ben
 */
public class MeinEvent {

    private final String source;

    /**
     * Konstruktor.
     * @param source
     */
    public MeinEvent(final String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

}
