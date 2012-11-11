package gr.stas.dim.model.views;

import oracle.jbo.AttributeList;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 07 16:59:39 EEST 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DepartmentsViewRowImpl extends ViewRowImpl {
    @Override
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DepartmentId {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getDepartmentId();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setDepartmentId((Number)value);
            }
        }
        ,
        DepartmentName {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getDepartmentName();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setDepartmentName((String)value);
            }
        }
        ,
        ManagerId {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getManagerId();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setManagerId((Number)value);
            }
        }
        ,
        LocationId {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getLocationId();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setLocationId((Number)value);
            }
        }
        ,
        LastName {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getLastName();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setLastName((String)value);
            }
        }
        ,
        EmployeeId {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getEmployeeId();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setEmployeeId((Number)value);
            }
        }
        ,
        JobTitle {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getJobTitle();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setJobTitle((String)value);
            }
        }
        ,
        JobId {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getJobId();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setJobId((String)value);
            }
        }
        ,
        JobId1 {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getJobId1();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setJobId1((String)value);
            }
        }
        ,
        EmployeesView {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getEmployeesView();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        EmployeesViewLOV {
            public Object get(DepartmentsViewRowImpl obj) {
                return obj.getEmployeesViewLOV();
            }

            public void put(DepartmentsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(DepartmentsViewRowImpl object);

        public abstract void put(DepartmentsViewRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int JOBTITLE = AttributesEnum.JobTitle.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int JOBID1 = AttributesEnum.JobId1.index();
    public static final int EMPLOYEESVIEW = AttributesEnum.EmployeesView.index();
    public static final int EMPLOYEESVIEWLOV = AttributesEnum.EmployeesViewLOV.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DepartmentsViewRowImpl() {
    }

    /**
     * Gets Departments entity object.
     * @return the Departments
     */
    public EntityImpl getDepartments() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets Employees entity object.
     * @return the Employees
     */
    public EntityImpl getEmployees() {
        return (EntityImpl)getEntity(1);
    }


    /**
     * Gets Jobs entity object.
     * @return the Jobs
     */
    public EntityImpl getJobs() {
        return (EntityImpl)getEntity(2);
    }

    /**
     * Gets the attribute value for DEPARTMENT_ID using the alias name DepartmentId.
     * @return the DEPARTMENT_ID
     */
    public Number getDepartmentId() {
        return (Number) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_ID using the alias name DepartmentId.
     * @param value value to set the DEPARTMENT_ID
     */
    public void setDepartmentId(Number value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT_NAME using the alias name DepartmentName.
     * @return the DEPARTMENT_NAME
     */
    public String getDepartmentName() {
        return (String) getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_NAME using the alias name DepartmentName.
     * @param value value to set the DEPARTMENT_NAME
     */
    public void setDepartmentName(String value) {
        setAttributeInternal(DEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for MANAGER_ID using the alias name ManagerId.
     * @return the MANAGER_ID
     */
    public Number getManagerId() {
        return (Number) getAttributeInternal(MANAGERID);
    }

    /**
     * Sets <code>value</code> as attribute value for MANAGER_ID using the alias name ManagerId.
     * @param value value to set the MANAGER_ID
     */
    public void setManagerId(Number value) {
        setAttributeInternal(MANAGERID, value);
    }

    /**
     * Gets the attribute value for LOCATION_ID using the alias name LocationId.
     * @return the LOCATION_ID
     */
    public Number getLocationId() {
        return (Number) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATION_ID using the alias name LocationId.
     * @param value value to set the LOCATION_ID
     */
    public void setLocationId(Number value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for LAST_NAME using the alias name LastName.
     * @return the LAST_NAME
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_NAME using the alias name LastName.
     * @param value value to set the LAST_NAME
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @return the EMPLOYEE_ID
     */
    public Number getEmployeeId() {
        return (Number) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @param value value to set the EMPLOYEE_ID
     */
    public void setEmployeeId(Number value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for JOB_TITLE using the alias name JobTitle.
     * @return the JOB_TITLE
     */
    public String getJobTitle() {
        return (String) getAttributeInternal(JOBTITLE);
    }

    /**
     * Sets <code>value</code> as attribute value for JOB_TITLE using the alias name JobTitle.
     * @param value value to set the JOB_TITLE
     */
    public void setJobTitle(String value) {
        setAttributeInternal(JOBTITLE, value);
    }

    /**
     * Gets the attribute value for JOB_ID using the alias name JobId.
     * @return the JOB_ID
     */
    public String getJobId() {
        return (String) getAttributeInternal(JOBID);
    }

    /**
     * Sets <code>value</code> as attribute value for JOB_ID using the alias name JobId.
     * @param value value to set the JOB_ID
     */
    public void setJobId(String value) {
        setAttributeInternal(JOBID, value);
    }

    /**
     * Gets the attribute value for JOB_ID using the alias name JobId1.
     * @return the JOB_ID
     */
    public String getJobId1() {
        return (String) getAttributeInternal(JOBID1);
    }

    /**
     * Sets <code>value</code> as attribute value for JOB_ID using the alias name JobId1.
     * @param value value to set the JOB_ID
     */
    public void setJobId1(String value) {
        setAttributeInternal(JOBID1, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link EmployeesView.
     */
    public RowIterator getEmployeesView() {
        return (RowIterator)getAttributeInternal(EMPLOYEESVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> EmployeesViewLOV.
     */
    public RowSet getEmployeesViewLOV() {
        return (RowSet)getAttributeInternal(EMPLOYEESVIEWLOV);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}