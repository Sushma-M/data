package com.hrdb.repository; 
// Generated Sep 4, 2014 9:50:00 AM 

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hrdb.*;
/**
 * Specifies methods used to obtain and modify Department related information
 * which is stored in the database.
 */
@Repository("hrdb.DepartmentDao")
public class DepartmentRepository extends WMGenericDaoImpl <Department, Integer> {

   @Autowired
   @Qualifier("hrdbTemplate")
   private HibernateTemplate template;

   public HibernateTemplate getTemplate() {
        return this.template;
   }
}

