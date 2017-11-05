package com.vladmihalcea.hibernate.type.util;

import org.hibernate.usertype.DynamicParameterizedType;

import java.lang.annotation.Annotation;
import java.util.Properties;

/**
 * @author Vlad Mihalcea
 */
public abstract class PropertyType<T> implements DynamicParameterizedType.ParameterType {

    public abstract Class<T> getReturnedClass();

    @Override
    public Annotation[] getAnnotationsMethod() {
        return new Annotation[0];
    }

    @Override
    public String getCatalog() {
        return null;
    }

    @Override
    public String getSchema() {
        return null;
    }

    @Override
    public String getTable() {
        return null;
    }

    @Override
    public boolean isPrimaryKey() {
        return false;
    }

    @Override
    public String[] getColumns() {
        return new String[0];
    }

    public Properties toProperties() {
        Properties typeProperties = new Properties();
        typeProperties.put(DynamicParameterizedType.PARAMETER_TYPE, this);
        return typeProperties;
    }
}
