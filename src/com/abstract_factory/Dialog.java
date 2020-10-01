package com.abstract_factory;

public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();

        Checkbox checkBox = createCheckbox();
        checkBox.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
