package gr.dim.stas;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

public class IndexBacking {
    public IndexBacking() {
    }

    public void validatorA(FacesContext facesContext, UIComponent uIComponent,
                           Object object) {
        System.out.println("Validator...");
        // Add event code here...
    }

    public void ValueChangelistener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        System.out.println("valuechangeListener..");
    }
}
