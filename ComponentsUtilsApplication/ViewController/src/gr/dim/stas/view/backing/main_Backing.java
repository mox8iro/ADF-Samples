package gr.dim.stas.view.backing;

import gr.dim.stas.view.utils.RichCommandComponentUtils;

import java.io.IOException;
import java.io.OutputStream;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseEvent;

import javax.faces.event.PhaseId;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;

import org.apache.myfaces.trinidad.event.ReturnEvent;

public class main_Backing {


    private RichCommandButton myActionListenerButton;
    private RichCommandButton myFileDownLoadListenerButton;
    private RichCommandButton myActionButton;
    private RichCommandButton myReturnListenerButton;

    private RichInputText textOne;
    private RichCommandButton myResetActionListenerButton;
    private RichCommandButton myActionButton_SecondPage;


    public main_Backing() {
    }


    public void setMyActionListenerButton(RichCommandButton myActionListenerButton) {
        this.myActionListenerButton = myActionListenerButton;
    }

    public RichCommandButton getMyActionListenerButton() {
        return myActionListenerButton;
    }

    public void setMyFileDownLoadListenerButton(RichCommandButton myFileDownLoadListenerButton) {
        this.myFileDownLoadListenerButton = myFileDownLoadListenerButton;
    }

    public RichCommandButton getMyFileDownLoadListenerButton() {
        return myFileDownLoadListenerButton;
    }

    public void setMyActionButton(RichCommandButton myActionButton) {
        this.myActionButton = myActionButton;
    }

    public RichCommandButton getMyActionButton() {
        return myActionButton;
    }

    public void setMyReturnListenerButton(RichCommandButton myReturnListenerButton) {
        this.myReturnListenerButton = myReturnListenerButton;
    }

    public RichCommandButton getMyReturnListenerButton() {
        return myReturnListenerButton;
    }


    public void setTextOne(RichInputText textOne) {
        this.textOne = textOne;
    }

    public RichInputText getTextOne() {
        return textOne;
    }
    
    
    //implemente listeners.
    public String myAction(){
        
        return "goSecond";
    }
    public String myActionOnReturn(){
        
        return "goBack";
    }
    
    public void myActionListener(ActionEvent actionEvent){
        System.out.println("this is the actionListener");
        
        this.getTextOne().setValue("actionListener was pressed!");
    }
    
    // implement PhasesEvent to add listeners.

    public void myBeforePhaseListener(PhaseEvent phaseEvent) {
        // Add event code here...
        if (phaseEvent.getPhaseId() != PhaseId.RENDER_RESPONSE) {
                   return;
        }
        
        
        //clear actionListeners because they are duplicated each time..
        
        RichCommandComponentUtils.clearActionListeners(this.getMyReturnListenerButton());
        RichCommandComponentUtils.clearActionListeners(this.getMyReturnListenerButton());
        RichCommandComponentUtils.clearActionListeners(this.getMyReturnListenerButton());
        
        // for this example we are adding listener while page is rendering.
        // we need to clear actionListeners because they are simply added.. and executed many times..
        RichCommandComponentUtils.addAction(this.getMyActionButton(),"#{main_Backing.myAction}");    
        
        RichCommandComponentUtils.addActionListener(this.getMyActionListenerButton(),"#{main_Backing.myActionListener}");
        RichCommandComponentUtils.addResetActionListener(this.getMyResetActionListenerButton());
        
        RichCommandComponentUtils.addFileDownloadActionListener(this.getMyFileDownLoadListenerButton(),"#{main_Backing.myFileDownLoadActionListener}","plain/text","test.txt");
        
        
    }
    
    

    public void setMyResetActionListenerButton(RichCommandButton myResetActionListenerButton) {
        this.myResetActionListenerButton = myResetActionListenerButton;
    }

    public RichCommandButton getMyResetActionListenerButton() {
        return myResetActionListenerButton;
    }

    public String myActionSecondPage() {
        // Add event code here...
        return "goBack";
    }

    public void myBeforePhaseListener_SecondPage(PhaseEvent phaseEvent) {
        // Add event code here...
        
        RichCommandComponentUtils.clearActionListeners(this.getMyActionButton_SecondPage());
        
        RichCommandComponentUtils.addAction(this.getMyActionButton_SecondPage(),"#{main_Backing.myActionSecondPage}");
        
    }

    public void setMyActionButton_SecondPage(RichCommandButton myActionButton_SecondPage) {
        this.myActionButton_SecondPage = myActionButton_SecondPage;
    }

    public RichCommandButton getMyActionButton_SecondPage() {
        return myActionButton_SecondPage;
    }

    public void myFileDownLoadActionListener(FacesContext facesContext,
                                             OutputStream outputStream) {
        // Add event code here...


        try {
            outputStream.write("boo!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
