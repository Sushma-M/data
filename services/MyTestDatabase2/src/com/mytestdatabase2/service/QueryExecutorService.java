
package com.mytestdatabase2.service;
// Generated Sep 4, 2014 8:36:43 AM 

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface QueryExecutorService {

	
	Page<Object> executeWMCustomQuerySelect(CustomQuery query, Pageable pageable) ;

	int executeWMCustomQueryUpdate(CustomQuery query) ;
}

