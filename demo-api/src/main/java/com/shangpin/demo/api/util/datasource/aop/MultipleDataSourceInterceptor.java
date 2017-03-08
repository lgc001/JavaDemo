package com.shangpin.demo.api.util.datasource.aop;

//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
import com.shangpin.demo.api.util.datasource.DataSourceTypeManager;
import com.shangpin.demo.api.util.datasource.EnumDataSource;
import org.springframework.stereotype.Component;


//@Aspect    // for aop
@Component // for auto scan
public class MultipleDataSourceInterceptor {
//    @Pointcut("execution(public * net.aazj.service..*.getUser(..))")
//    public void dataSourceSlave(){};
//
//    @Before("dataSourceSlave()")
//    public void before(JoinPoint jp) {
//        DataSourceTypeManager.set(EnumDataSource.ErpConn);
//    }
//    // ... ...
}
