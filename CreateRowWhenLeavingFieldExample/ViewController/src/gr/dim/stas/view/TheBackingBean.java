package gr.dim.stas.view;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;

public class TheBackingBean {
    private RichTable theTable;

    public TheBackingBean() {
    }

    public void RegionNameValueChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        ADFUtils.getBindingContainer().getOperationBinding("CreateInsert").execute();
        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        adfFacesContext.addPartialTarget(getTheTable());

    }

    public void setTheTable(RichTable theTable) {
        this.theTable = theTable;
    }

    public RichTable getTheTable() {
        return theTable;
    }
}
