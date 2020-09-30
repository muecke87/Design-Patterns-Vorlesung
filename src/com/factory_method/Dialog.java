package com.factory_method;

public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
    public Button createButton(String buttonType) {
        if(buttonType.equals("HTML")) {
            return new HtmlButton();
        } else {
            return new NativeButton();
        }
    };

}
