package com.factory_method;

public class Dialog {

    String type;

    public void renderWindow(String type) {
        // ... other code ...
        this.type = type;
        Button okButton = createButton();
        okButton.render();
    }

    public Button createButton() {
        if (type.equals("HTML")) {
            return new HtmlButton();
        } else {
            return new NativeButton();
        }
    }
}
