
package com.mytestdatabase1.service;
// Generated Sep 4, 2014 8:46:56 AM 


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service("MyTestDatabase1.queryExecutorService")
public class QueryExecutorServiceImpl implements QueryExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(QueryExecutorServiceImpl.class);

	@Autowired
	@Qualifier("MyTestDatabase1WMQueryExecutor")
	private WMQueryExecutor queryExecutor;


	@Transactional(value = "MyTestDatabase1TransactionManager")
	@Override
	public Page<Object> executeWMCustomQuerySelect(CustomQuery query, Pageable pageable) {
	    return queryExecutor.executeCustomQuery(query, pageable);
	}

	@Transactional(value = "MyTestDatabase1TransactionManager")
    @Override
    public int executeWMCustomQueryUpdate(CustomQuery query) {
        return queryExecutor.executeCustomQueryForUpdate(query);
    }
}

