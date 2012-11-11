package gr.dim.stas.managedbeans;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.OperationBinding;

public class IndexManagedBean {
    private RichPopup thePopup;
    private RichTable theTable;

    public IndexManagedBean() {
    }

    public void setThePopup(RichPopup thePopup) {
        this.thePopup = thePopup;
    }

    public RichPopup getThePopup() {
        return thePopup;
    }

    public void setTheTable(RichTable theTable) {
        this.theTable = theTable;
    }

    public RichTable getTheTable() {
        return theTable;
    }

    /**
     * Value Change Listener Method That handles the visibility of the popup and the mandatory radioButtons of the other rows.
     * @param valueChangeEvent
     */
    public void radioVCL(ValueChangeEvent valueChangeEvent) {
    
        System.out.println("about to execute VCL..."+valueChangeEvent.getNewValue());
        String actualValue=valueChangeEvent.getNewValue().toString().equals("0") ? "true" : null;
        DCBindingContainer bindingContainer = ADFUtils.getDCBindingContainer();
        OperationBinding binding = bindingContainer.getOperationBinding("updateOtherRows");
        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("reqValue", actualValue);
        binding.execute();
        Object object = binding.getResult();
        if(object!=null){
          System.out.println("setting message: "+object);
          RichPopup.PopupHints ppH=new RichPopup.PopupHints();
          
          AdfFacesContext.getCurrentInstance().getPageFlowScope().put("errorMessage", object);
          this.getThePopup().show(ppH);
          
         
          
        }
      AdfFacesContext.getCurrentInstance().addPartialTarget(getTheTable());
    }
}
