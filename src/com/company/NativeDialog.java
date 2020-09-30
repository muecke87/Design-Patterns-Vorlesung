package com.company;

public class NativeDialog extends Dialog {

    @Override
    public Button createButton() {
        return new NativeButton();
    }
}
