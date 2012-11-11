package gr.dim.stas.themanagedbeans;

import java.util.Iterator;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;

import javax.faces.context.FacesContext;

import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTable;

import oracle.jbo.Key;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;

import oracle.jbo.uicli.binding.JUCtrlHierNodeBinding;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.RowKeySet;

public class TheManagedBean {
    private String countriesSelected;
    public TheManagedBean() {
    }

    public void selectRow(SelectionEvent selectionEvent) {
        //#{bindings.CountriesView1.collectionModel.makeCurrent}
       
        makeCurrent(selectionEvent);
        
        // Add event code here...
    }


    /**
     * Synchronizes the table UI component row selection with the * selection in the ADF binding layer
     * @param selectionEvent event object created by the table
     * component upon row selection
     */
    public void makeCurrent(SelectionEvent selectionEvent) {
        RichTable _table =
            (RichTable)selectionEvent.getSource(); //the Collection Model is the object that provides the //structured data
        //for the table to render
        CollectionModel _tableModel = (CollectionModel)_table.getValue();
        //the ADF object that implements the CollectionModel is //JUCtrlHierBinding. It is wrapped by the CollectionModel API 
        JUCtrlHierBinding _adfTableBinding = (JUCtrlHierBinding)_tableModel.getWrappedData(); //Acess the ADF iterator binding that is used with
        //ADF table binding
        DCIteratorBinding _tableIteratorBinding =
            _adfTableBinding.getDCIteratorBinding(); //the role of this method is to synchronize the table component

        //selection with the selection in the ADF model
        Object _selectedRowData =
            _table.getSelectedRowData(); //cast to JUCtrlHierNodeBinding, which is the ADF object //that represents a row
        System.out.println("selectedRows:  "+_selectedRowData);
        JUCtrlHierNodeBinding _nodeBinding =
            (JUCtrlHierNodeBinding)_selectedRowData; //get the row key from the node binding and set it

        RowKeySet keySet = _table.getSelectedRowKeys();
        countriesSelected=""; // this is a demo. do not expect much.
        Iterator<Object> iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("next:   "+next);
            countriesSelected=countriesSelected+" "+next+",";
            
        }
        
        //as the current row in the iterator
        Key _rwKey = _nodeBinding.getRowKey();
        System.out.println("current row key: "+_rwKey);
        _tableIteratorBinding.setCurrentRowWithKey(_rwKey.toStringFormat(true));

    }

    public void setCountriesSelected(String countriesSelected) {
        this.countriesSelected = countriesSelected;
    }

    public String getCountriesSelected() {
        return countriesSelected;
    }
}
