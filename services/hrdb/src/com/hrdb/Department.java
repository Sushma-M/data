package com.hrdb;
// Generated Sep 4, 2014 9:49:59 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import javax.persistence.Transient;
import javax.persistence.CascadeType;


/**
 * Department generated by hbm2java
 */
@Entity
@Table(name="DEPARTMENT"
    ,schema="PUBLIC"
    ,catalog="PUBLIC"
)
public class Department  implements java.io.Serializable {


     private Integer deptid;
     private String name;
     private Integer budget;
     private Integer q1;
     private Integer q2;
     private Integer q3;
     private Integer q4;
     private String deptcode;
     private String location;
     private Integer tenantid;
     private Set<Employee> employees = new HashSet<Employee>(0);

    public Department() {
    }

    public Department(String name, Integer budget, Integer q1, Integer q2, Integer q3, Integer q4, String deptcode, String location, Integer tenantid, Set<Employee> employees) {
       this.name = name;
       this.budget = budget;
       this.q1 = q1;
       this.q2 = q2;
       this.q3 = q3;
       this.q4 = q4;
       this.deptcode = deptcode;
       this.location = location;
       this.tenantid = tenantid;
       this.employees = employees;
    }

     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="DEPTID", unique=true, nullable=false)
    public Integer getDeptid() {
        return this.deptid;
    }
    
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    
    @Column(name="NAME")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="BUDGET")
    public Integer getBudget() {
        return this.budget;
    }
    
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    
    @Column(name="Q1")
    public Integer getQ1() {
        return this.q1;
    }
    
    public void setQ1(Integer q1) {
        this.q1 = q1;
    }

    
    @Column(name="Q2")
    public Integer getQ2() {
        return this.q2;
    }
    
    public void setQ2(Integer q2) {
        this.q2 = q2;
    }

    
    @Column(name="Q3")
    public Integer getQ3() {
        return this.q3;
    }
    
    public void setQ3(Integer q3) {
        this.q3 = q3;
    }

    
    @Column(name="Q4")
    public Integer getQ4() {
        return this.q4;
    }
    
    public void setQ4(Integer q4) {
        this.q4 = q4;
    }

    
    @Column(name="DEPTCODE", length=20)
    public String getDeptcode() {
        return this.deptcode;
    }
    
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    
    @Column(name="LOCATION")
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    
    @Column(name="TENANTID")
    public Integer getTenantid() {
        return this.tenantid;
    }
    
    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

@OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="department")
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }




}

