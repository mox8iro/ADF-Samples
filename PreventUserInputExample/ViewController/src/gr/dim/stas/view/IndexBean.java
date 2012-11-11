package gr.dim.stas.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.output.RichStatusIndicator;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.render.ClientEvent;

public class IndexBean {
    private String radioValue;
    private String inputTextValue;
    private RichStatusIndicator statusIndicatorComponent;
    private RichInputText theInputComponent;
    private List<String> iterList;


    public void setRadioValue(String radioValue) {
        System.out.println("setting value to the radio Group babyyyyy!!!!!");
        
        this.radioValue = radioValue;
        System.out.println("Lets wait a bit ok??");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
        
        System.out.println("Ok.. continue please");
    }

    public String getRadioValue() {
        return radioValue;
    }

    public void radioGroupVCL(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
       
        System.out.println("Oh look! There is flying sheep out of your window!!  ");
      
        System.out.println("nevermind, Lets go bowling.");

    }

    public void setInputTextValue(String inputTextValue) {
        this.inputTextValue = inputTextValue;
    }

    public String getInputTextValue() {
        return inputTextValue;
    }

    public void setStatusIndicatorComponent(RichStatusIndicator statusIndicatorComponent) {
        this.statusIndicatorComponent = statusIndicatorComponent;
    }

    public RichStatusIndicator getStatusIndicatorComponent() {
        return statusIndicatorComponent;
    }

    public void hideWhileWorkingPlease(ClientEvent clientEvent) {
             
           RichInputText inputText =  (RichInputText) clientEvent.getComponent();
           String isVisible = (String) clientEvent.getParameters().get("visible");
           System.out.println("we are going to set visible "+isVisible+"  to uiComponent:  "+inputText);
           inputText.setVisible(Boolean.parseBoolean(isVisible));
    }

    public void setTheInputComponent(RichInputText theInputComponent) {
        this.theInputComponent = theInputComponent;
    }

    public RichInputText getTheInputComponent() {
        return theInputComponent;
    }

    public void setIterList(List<String> iterList) {
        this.iterList = iterList;
    }

    public List<String> getIterList() {
        
        List<String> aList=new ArrayList<String>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        aList.add("four");
        aList.add("five");
        
        return aList;
    }
}
