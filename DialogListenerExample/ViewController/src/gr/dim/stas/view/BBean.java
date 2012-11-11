package gr.dim.stas.view;

import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;

public class BBean {
    public BBean() {
    }

    public void dialogListenerSaample(DialogEvent dialogEvent) {
        // Add event code here...
        System.out.println("dialogListener....");
    }

    public void popupCanceledListener(PopupCanceledEvent popupCanceledEvent) {
        // Add event code here...
        System.out.println("popupCanceled Listener...");
    }
}
