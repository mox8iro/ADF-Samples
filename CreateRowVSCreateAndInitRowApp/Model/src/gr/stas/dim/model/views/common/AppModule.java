package gr.stas.dim.model.views.common;

import oracle.jbo.ApplicationModule;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 08 12:04:25 EEST 2010
// ---------------------------------------------------------------------
public interface AppModule extends ApplicationModule {
    void createAndInitRowDepartment(Number empId);

    void createAndInitRowEmployees(Number depId);

    void createRowSetAttributeDepartment(Number empId);

    void createRowSetAttributeEmployees(Number depId);

    void createRowSetAttributeValuesDepartment(Number empId);

    void createRowSetAttributeValuesEmployees(Number depId);
}
