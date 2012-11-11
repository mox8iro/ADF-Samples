import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.event.ActionEvent;

import oracle.adf.model.binding.DCBindingContainer;

import oracle.binding.OperationBinding;

public class TestRollbackBean {
    public TestRollbackBean() {
    }

    public void executeRollback(ActionEvent actionEvent) {
        // Add event code here...
        executeRollbackActionAfterDisablingExecuteOnRollback();
    }
    
  public void executeRollbackActionAfterDisablingExecuteOnRollback() {
    FacesContext fc = FacesContext.getCurrentInstance();
    ValueBinding vb = fc.getApplication().createValueBinding("#{bindings}");
    DCBindingContainer bindings = (DCBindingContainer)vb.getValue(fc);
    if (bindings != null) {
      bindings.setExecuteOnRollback(false);
      OperationBinding ob = bindings.getOperationBinding("Rollback");
      if (ob != null) {
        ob.execute();
      } else {
        throw new RuntimeException("Binding container has no 'Rollback' action binding");
      }
    }
  }
}
