package com.fasterxml.jackson.databind.jsontype.impl;

import androidx.constraintlayout.core.parser.a;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class SubTypeValidator {
    protected static final Set<String> DEFAULT_NO_DESER_CLASS_NAMES;
    protected static final String PREFIX_C3P0 = "com.mchange.v2.c3p0.";
    protected static final String PREFIX_SPRING = "org.springframework.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SubTypeValidator f43377a;
    protected Set<String> _cfgIllegalClassNames = DEFAULT_NO_DESER_CLASS_NAMES;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("org.apache.commons.collections.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections.functors.InstantiateTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InstantiateTransformer");
        hashSet.add("org.codehaus.groovy.runtime.ConvertedClosure");
        a.d(hashSet, "org.codehaus.groovy.runtime.MethodClosure", "org.springframework.beans.factory.ObjectFactory", "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl", "org.apache.xalan.xsltc.trax.TemplatesImpl");
        a.d(hashSet, "com.sun.rowset.JdbcRowSetImpl", "java.util.logging.FileHandler", "java.rmi.server.UnicastRemoteObject", "org.springframework.beans.factory.config.PropertyPathFactoryBean");
        a.d(hashSet, "org.apache.tomcat.dbcp.dbcp2.BasicDataSource", "com.sun.org.apache.bcel.internal.util.ClassLoader", "org.hibernate.jmx.StatisticsService", "org.apache.ibatis.datasource.jndi.JndiDataSourceFactory");
        a.d(hashSet, "org.apache.ibatis.parsing.XPathParser", "jodd.db.connection.DataSourceConnectionProvider", "oracle.jdbc.connector.OracleManagedConnectionFactory", "oracle.jdbc.rowset.OracleJDBCRowSet");
        a.d(hashSet, "org.slf4j.ext.EventData", "flex.messaging.util.concurrent.AsynchBeansWorkManagerExecutor", "com.sun.deploy.security.ruleset.DRSHelper", "org.apache.axis2.jaxws.spi.handler.HandlerResolverImpl");
        a.d(hashSet, "org.jboss.util.propertyeditor.DocumentEditor", "org.apache.openjpa.ee.RegistryManagedRuntime", "org.apache.openjpa.ee.JNDIManagedRuntime", "org.apache.axis2.transport.jms.JMSOutTransportInfo");
        hashSet.add("com.mysql.cj.jdbc.admin.MiniAdmin");
        DEFAULT_NO_DESER_CLASS_NAMES = Collections.unmodifiableSet(hashSet);
        f43377a = new SubTypeValidator();
    }

    public static SubTypeValidator instance() {
        return f43377a;
    }

    public void validateSubType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        String name = rawClass.getName();
        if (!this._cfgIllegalClassNames.contains(name)) {
            if (rawClass.isInterface()) {
                return;
            }
            if (name.startsWith(PREFIX_SPRING)) {
                while (rawClass != null && rawClass != Object.class) {
                    String simpleName = rawClass.getSimpleName();
                    if (!"AbstractPointcutAdvisor".equals(simpleName) && !"AbstractApplicationContext".equals(simpleName)) {
                        rawClass = rawClass.getSuperclass();
                    }
                }
                return;
            }
            if (!name.startsWith(PREFIX_C3P0) || !name.endsWith("DataSource")) {
                return;
            }
        }
        deserializationContext.reportBadTypeDefinition(beanDescription, "Illegal type (%s) to deserialize: prevented for security reasons", name);
    }
}
