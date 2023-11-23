package org.example.overview;

import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
* This class is to unify the content of APIs from the Oracle course
* */
public class JavaAPI {

    /*
    * Java Streams APIs filter, map, reduce streams of data
    * Actions with lambda expressions
    * private List<Books> booksList = new ArrayList<>();
    * booksList.stream().parallel().filter(book -> book.getYear() > 2005).forEach(book -> book.doSomething());
    * */

    /*
    * Executes codes concurrently to achieve better performance
    * */
    Callable<BigDecimal> taxCalculation = new Callable<>() {
        @Override
        public BigDecimal call() throws Exception {
            BigDecimal tax = null;
            /*Some code to calculate tx*/
            return tax;
        }
    };
    ExecutorService executorService = Executors.newCachedThreadPool();
    Future<BigDecimal> result = executorService.submit(taxCalculation);

    /**
     * JDBC - Java Database Connectivity protocol enables database connectivity and SQL statement exec
     * JPA - Java Persistence API enables Java object-relational mappings
     * App Logic -> JPA -> JDBC API Provider -> JDBC Driver -> Database
     */

}
