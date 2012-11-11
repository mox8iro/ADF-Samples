package gr.dim.stas.bbeans;

import gr.dim.stas.utils.ADFUtils;
import gr.dim.stas.utils.JSFUtils;

import java.sql.SQLException;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;

/**
 * dstas.blogspot.com
 * stasinopoulos.dimitrios@gmail.com
 */
public class MainBean {
    private RichSelectOneChoice depChoiceList;

    public MainBean() {
    }

    public void depChoiceListChangeEvent(ValueChangeEvent valueChangeEvent) {
      
      
      Object obj=valueChangeEvent.getNewValue();
      JSFUtils.setManagedBeanValue("row.bindings.DepartmentId.inputValue", obj);

        DCIteratorBinding empIter = ADFUtils.findIterator("EmployeesView1Iterator");

        
        System.out.println("index..  "+JSFUtils.getManagedBeanValue("row.bindings.DepartmentId.inputValue"));
        
         
        System.out.println("Boo emps"+empIter.getCurrentRow().getAttribute("DepartmentId"));
      
        
        
        
        
        


        
    }

    public void setDepChoiceList(RichSelectOneChoice depChoiceList) {
        this.depChoiceList = depChoiceList;
    }

    public RichSelectOneChoice getDepChoiceList() {
        return depChoiceList;
    }

}
