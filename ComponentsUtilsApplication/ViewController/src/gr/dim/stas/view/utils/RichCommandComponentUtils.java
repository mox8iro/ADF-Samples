package gr.dim.stas.view.utils;

import java.io.OutputStream;

import javax.el.ELContext;

import javax.el.ExpressionFactory;

import javax.el.MethodExpression;

import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.MethodExpressionActionListener;

import oracle.adf.share.logging.ADFLogger;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;
import oracle.adf.view.rich.component.rich.nav.RichCommandToolbarButton;

import oracle.adfinternal.view.faces.taglib.listener.ResetActionListener;

import org.apache.myfaces.trinidad.event.ReturnEvent;
import org.apache.myfaces.trinidadinternal.taglib.listener.FileDownloadActionListener;

/**
 * @author stasinopoulos.dimitrios@gmail.com
 * @version 0.1
 *
 * This is a Helper Class for UIComponents such as RichCommandButtons or a RichCommandMenuItems or RichCommandToolbarButtons.
 * Has some usefull methods that someone might need.
 * There is nothing new here. Just a class that gathers some methods regardin UIComponents.
 * Feel free to Improve!
 *
 */
public class RichCommandComponentUtils {

    public static final ADFLogger LOGGER = ADFLogger.createADFLogger(RichCommandComponentUtils.class);
    /**
     * Method that adds an ActionListener to an UIComponent
     * @param theComponent UIComponent. Must be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton
     * @param actionListenerEL String. The Expression Language to be added. e.g. of actionListenerEL: #{myBacking.myActionLIstener}
     * @return UIComponent. NULL if no instance of the above mentioned components.
     */
    public static UIComponent addActionListener(UIComponent theComponent,
                                                String actionListenerEL) {
        //initialize temp Buttons.
        RichCommandButton tempButton = new RichCommandButton();
        RichCommandMenuItem tempMenuItem = new RichCommandMenuItem();
        RichCommandToolbarButton tempToolbarButton =
            new RichCommandToolbarButton();

        MethodExpression actionListener =
            actionListenerMethodExpression(actionListenerEL);
        //UIComponent might be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton
        if (theComponent instanceof RichCommandButton) {
            tempButton = (RichCommandButton)theComponent;
            tempButton.addActionListener(new MethodExpressionActionListener(actionListener));

            return tempButton;
        } else if (theComponent instanceof RichCommandMenuItem) {
            tempMenuItem = (RichCommandMenuItem)theComponent;
            tempMenuItem.addActionListener(new MethodExpressionActionListener(actionListener));

            return tempMenuItem;

        } else if (theComponent instanceof RichCommandToolbarButton) {
            tempToolbarButton = (RichCommandToolbarButton)theComponent;
            tempToolbarButton.addActionListener(new MethodExpressionActionListener(actionListener));

            return tempToolbarButton;
        } else {
            //no suitable component
            LOGGER.severe("no suitable component");
            return null;
        }
    }

    /**
     * Method that adds an Action to an UIComponent
     * @param theComponent UIComponent. Must be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton
     * @param actionEL String. The Expression Language to be added. e.g. of actionEL: #{myBacking.myAction}
     * @return UIComponent. NULL if no instance of the above mentioned components.
     */
    public static UIComponent addAction(UIComponent theComponent,
                                        String actionEL) {

        //initialize temp Buttons.
        RichCommandButton tempButton = new RichCommandButton();
        RichCommandMenuItem tempMenuItem = new RichCommandMenuItem();
        RichCommandToolbarButton tempToolbarButton =
            new RichCommandToolbarButton();

        MethodExpression action = actionMethoExpression(actionEL);
        //UIComponent might be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton
        if (theComponent instanceof RichCommandButton) {
            tempButton = (RichCommandButton)theComponent;
            tempButton.setActionExpression(action);

            return tempButton;
        } else if (theComponent instanceof RichCommandMenuItem) {
            tempMenuItem = (RichCommandMenuItem)theComponent;
            tempMenuItem.setActionExpression(action);
            return tempMenuItem;
        } else if (theComponent instanceof RichCommandToolbarButton) {
            tempToolbarButton = (RichCommandToolbarButton)theComponent;
            tempToolbarButton.setActionExpression(action);

            return tempToolbarButton;
        } else {
            //no suitable component
            LOGGER.severe("no suitable component");
            return null;
        }
    }


    /**
     * Method that adds a FileDownloadActionListener to an UIComponent
     * @param theComponent UIComponent. Must be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton
     * @param fileDownloadActionListenerEL String. The Expression Language to be added. e.g. of actionEL: #{myBacking.myFileDownloadActionListener}
     * @param contentType String. The type of the content to be saved.
     * @param fileName String. The name of the file to be created.
     * @return UIComponent. NULL if no instance of the above mentioned components.
     */
    public static UIComponent addFileDownloadActionListener(UIComponent theComponent,
                                                            String fileDownloadActionListenerEL,
                                                            String contentType,
                                                            String fileName) {

        //initialize temp Buttons.
        RichCommandButton tempButton = new RichCommandButton();
        RichCommandMenuItem tempMenuItem = new RichCommandMenuItem();
        RichCommandToolbarButton tempToolbarButton =
            new RichCommandToolbarButton();


        MethodExpression returnMethodExpression =
            fileDownladActionListenerMethodExpression(fileDownloadActionListenerEL);
        //initialize a FileDownloadActionListener
        FileDownloadActionListener fileDownLoadListener =
            new FileDownloadActionListener();
        fileDownLoadListener.setMethod(returnMethodExpression);
        fileDownLoadListener.setContentType(contentType);
        fileDownLoadListener.setFilename(fileName);

        //UIComponent might be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton
        if (theComponent instanceof RichCommandButton) {
            tempButton = (RichCommandButton)theComponent;

            tempButton.addActionListener(fileDownLoadListener);

            return tempButton;
        } else if (theComponent instanceof RichCommandMenuItem) {
            tempMenuItem = (RichCommandMenuItem)theComponent;
            tempMenuItem.addActionListener(fileDownLoadListener);
            return tempMenuItem;
        } else if (theComponent instanceof RichCommandToolbarButton) {
            tempToolbarButton = (RichCommandToolbarButton)theComponent;
            tempToolbarButton.addActionListener(fileDownLoadListener);

            return tempToolbarButton;
        } else {
            //no suitable component
            LOGGER.severe("no suitable component");
            return null;
        }
    }


    /**
     * 
     * DOES NOT WORK. due to a potential adf bug.
     * 
     * Method that adds a ReturnListener to an UIComponent
     * @param theComponent UIComponent. Must be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton
     * @param returnListenerEL String. The Expression Language to be added. e.g. of actionEL: #{myBacking.myAction}
     * @return UIComponent. NULL if no instance of the above mentioned components.
     */
    public static UIComponent addReturnListener(UIComponent theComponent,
                                                String returnListenerEL) {

        //initialize temp Buttons.
        RichCommandButton tempButton = new RichCommandButton();
        RichCommandMenuItem tempMenuItem = new RichCommandMenuItem();
        RichCommandToolbarButton tempToolbarButton =
            new RichCommandToolbarButton();

        MethodExpression returnMethodExpression =
           returnListenerMethodExpression(returnListenerEL);
        //UIComponent might be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton
        if (theComponent instanceof RichCommandButton) {
            tempButton = (RichCommandButton)theComponent;
            tempButton.setReturnListener(returnMethodExpression);

            return tempButton;
        } else if (theComponent instanceof RichCommandMenuItem) {
            tempMenuItem = (RichCommandMenuItem)theComponent;
            tempMenuItem.setReturnListener(returnMethodExpression);
            return tempMenuItem;
        } else if (theComponent instanceof RichCommandToolbarButton) {
            tempToolbarButton = (RichCommandToolbarButton)theComponent;
            tempToolbarButton.setReturnListener(returnMethodExpression);

            return tempToolbarButton;
        } else {
            //no suitable component
            LOGGER.severe("no suitable component");
            return null;
        }
    }


    /**
     * Method that adds an Action to an UIComponent
     * @param theComponent UIComponent. Must be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton.
     * @return UIComponent. NULL if no instance of the above mentioned components.
     */
    public static UIComponent addResetActionListener(UIComponent theComponent) {

        //initialize temp Buttons.
        RichCommandButton tempButton = new RichCommandButton();
        RichCommandMenuItem tempMenuItem = new RichCommandMenuItem();
        RichCommandToolbarButton tempToolbarButton =
            new RichCommandToolbarButton();

        //create a ResetActionListener.
        ResetActionListener tempResetActionListener =
            new ResetActionListener();


        //UIComponent might be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton
        if (theComponent instanceof RichCommandButton) {
            tempButton = (RichCommandButton)theComponent;
            tempButton.addActionListener(tempResetActionListener);

            return tempButton;
        } else if (theComponent instanceof RichCommandMenuItem) {
            tempMenuItem = (RichCommandMenuItem)theComponent;
            tempMenuItem.addActionListener(tempResetActionListener);
            return tempMenuItem;
        } else if (theComponent instanceof RichCommandToolbarButton) {
            tempToolbarButton = (RichCommandToolbarButton)theComponent;
            tempToolbarButton.addActionListener(tempResetActionListener);

            return tempToolbarButton;
        } else {
            //no suitable component
            LOGGER.severe("no suitable component");
            return null;
        }
    }


    /**
     * clears all actionListeners from an UIComponent.
     * 
     * @param theComponent
     */
    public static void clearActionListeners(UIComponent theComponent){
        
      //initialize temp Buttons.
                RichCommandButton tempButton = new RichCommandButton();
                RichCommandMenuItem tempMenuItem = new RichCommandMenuItem();
                RichCommandToolbarButton tempToolbarButton =new RichCommandToolbarButton();

               

                //UIComponent might be either a RichCommandButton or a RichCommandMenuItem or RichCommandToolbarButton
                if (theComponent instanceof RichCommandButton) {
                    tempButton = (RichCommandButton)theComponent;
                    ActionListener[] allActionListeners=tempButton.getActionListeners();
                    for(ActionListener actionListener : allActionListeners ){
                        tempButton.removeActionListener(actionListener);
                    }
                   
                } else if (theComponent instanceof RichCommandMenuItem) {
                    tempMenuItem = (RichCommandMenuItem)theComponent;
                    ActionListener[] allActionListeners=tempMenuItem.getActionListeners();
                    for(ActionListener actionListener : allActionListeners ){
                        tempMenuItem.removeActionListener(actionListener);
                    }
                   
                } else if (theComponent instanceof RichCommandToolbarButton) {
                    tempToolbarButton = (RichCommandToolbarButton)theComponent;
                    ActionListener[] allActionListeners=tempToolbarButton.getActionListeners();
                    for(ActionListener actionListener : allActionListeners ){
                        tempToolbarButton.removeActionListener(actionListener);
                    }

                   
                } else {
                    //no suitable component
                    LOGGER.severe("no suitable component");
                    
                }
    }
    

    //  ====================================================================================================================

    /**
     * Method that creates a MethodExpression for an Method that accepts param of type ReturnEvent.
     *
     * @param returnListenerName String. the EL to be used.
     * @return MethodExpression. NULL if "evaluation" is not good.
     */
    public static MethodExpression returnListenerMethodExpression(String returnListenerName) {

        /*
         * We are about to create a MethodExpression for an ReturnListener.
         * This. ReturnListener is a method that accepts as input parameter
         * a variable of type ReturnEvent.
         * Thus is mandatory to set a Class[]  passing the appropriate types.
         * in this case: ReturnEvent.class
         *
         */
        Class[] argumentTypes = new Class[1];
        argumentTypes[0] = ReturnEvent.class;

        FacesContext facesCtx = FacesContext.getCurrentInstance();
        Application app = facesCtx.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesCtx.getELContext();


        MethodExpression exp =
            elFactory.createMethodExpression(elContext, returnListenerName,
                                             null, argumentTypes);

        try {
            // this methodCall does some sort of "evaluation" of the newly created MethodExpression..
            // if something is wrong... exception is thrown..
            exp.getMethodInfo(elContext);
        } catch (Exception e) {
            e.printStackTrace();

        }


        return exp;
    }

    //  ====================================================================================================================

    /**
     * Method that creates a MethodExpression for an Method that accepts params of type FacesContext and OutputStream.
     *
     * @param fileDownladActionListenerName String. the EL to be used.
     * @return MethodExpression. NULL if "evaluation" is not good.
     */
    public static MethodExpression fileDownladActionListenerMethodExpression(String fileDownladActionListenerName) {
        MethodExpression methodExpression = null;

        /*
          * We are about to create a MethodExpression for an FileDownladActionListener.
          * This. ReturnListener is a method that accepts as input parameter
          * a variable of type FacesContext and another of type OutputStream.
          * Thus is mandatory to set a Class[]  passing the appropriate types.
          * in this case: FacesContext.class and OutputStream.class
          *
          */
        Class[] argumentTypes = new Class[2];
        argumentTypes[0] = FacesContext.class;
        argumentTypes[1] = OutputStream.class;

        FacesContext facesCtx = FacesContext.getCurrentInstance();
        Application app = facesCtx.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesCtx.getELContext();


        methodExpression =
                elFactory.createMethodExpression(elContext, fileDownladActionListenerName,
                                                 null, argumentTypes);

        try {
            // this methodCall does some sort of "evaluation" of the newly created MethodExpression..
            // if something is wrong... exception is thrown..
            methodExpression.getMethodInfo(elContext);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return methodExpression;
    }

    //      ====================================================================================================================


    /**
     * Method that creates a MethodExpression for an Method that accepts param of type ActionEvent.
     *
     * @param actionListenerName String. the EL to be used.
     * @return MethodExpression. NULL if "evaluation" is not good.
     */
    public static MethodExpression actionListenerMethodExpression(String actionListenerName) {
        //the MethodExpression to be returned.
        MethodExpression methodExpression = null;
        /*
            * We are about to create a MethodExpression for an ActionListener.
            * This. ActionListener is a method that accepts as input parameter
            * a variable of type ActionEvent.
            * Thus is mandatory to set a Class[]  passing the appropriate types.
            * in this case: ActionEvent.class
            *
            */

        Class[] argumentTypes = new Class[1];
        argumentTypes[0] = ActionEvent.class;

        //get the ELContext
        FacesContext facesCtx = FacesContext.getCurrentInstance();
        Application app = facesCtx.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesCtx.getELContext();

        methodExpression = elFactory.createMethodExpression(elContext, actionListenerName, null,
                                  argumentTypes);

        try {
            // this methodCall does some sort of "evaluation" of the newly created MethodExpression..
            // if something is wrong... exception is thrown..
            methodExpression.getMethodInfo(elContext);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return methodExpression;
    }


    //  ====================================================================================================================


    /**
     * Method that creates a MethodExpression for an Method that accepts no params.
     *
     * @param actionName String. the EL to be used.
     * @return MethodExpression. NULL if "evaluation" is not good.
     */
    public static MethodExpression actionMethoExpression(String actionName) {
        //the MethodExpression to be returned.
        MethodExpression methodExpression = null;

        //Since Action Method does not accept parameters no argtypes are needed.
        Class[] argumentTypes = new Class[0];
        FacesContext facesCtx = FacesContext.getCurrentInstance();
        Application app = facesCtx.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = facesCtx.getELContext();

        methodExpression =
                elFactory.createMethodExpression(elContext, actionName, null,
                                                 argumentTypes);

        try {
            // this methodCall does some sort of "evaluation" of the newly created MethodExpression..
            // if something is wrong... exception is thrown..
            methodExpression.getMethodInfo(elContext);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return methodExpression;
    }


 

}
