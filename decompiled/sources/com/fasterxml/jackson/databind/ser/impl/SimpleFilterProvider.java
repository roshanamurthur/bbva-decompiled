package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class SimpleFilterProvider extends FilterProvider implements Serializable {
    protected boolean _cfgFailOnUnknownId;
    protected PropertyFilter _defaultFilter;
    protected final Map<String, PropertyFilter> _filtersById;

    public SimpleFilterProvider() {
        this(new HashMap());
    }

    @Deprecated
    public SimpleFilterProvider addFilter(String str, BeanPropertyFilter beanPropertyFilter) {
        this._filtersById.put(str, SimpleBeanPropertyFilter.from(beanPropertyFilter));
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.FilterProvider
    @Deprecated
    public BeanPropertyFilter findFilter(Object obj) {
        throw new UnsupportedOperationException("Access to deprecated filters not supported");
    }

    @Override // com.fasterxml.jackson.databind.ser.FilterProvider
    public PropertyFilter findPropertyFilter(Object obj, Object obj2) {
        PropertyFilter propertyFilter = this._filtersById.get(obj);
        if (propertyFilter != null || (propertyFilter = this._defaultFilter) != null || !this._cfgFailOnUnknownId) {
            return propertyFilter;
        }
        throw new IllegalArgumentException("No filter configured with id '" + obj + "' (type " + obj.getClass().getName() + ")");
    }

    public PropertyFilter getDefaultFilter() {
        return this._defaultFilter;
    }

    public PropertyFilter removeFilter(String str) {
        return this._filtersById.remove(str);
    }

    @Deprecated
    public SimpleFilterProvider setDefaultFilter(BeanPropertyFilter beanPropertyFilter) {
        this._defaultFilter = SimpleBeanPropertyFilter.from(beanPropertyFilter);
        return this;
    }

    public SimpleFilterProvider setFailOnUnknownId(boolean z10) {
        this._cfgFailOnUnknownId = z10;
        return this;
    }

    public boolean willFailOnUnknownId() {
        return this._cfgFailOnUnknownId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleFilterProvider(Map<String, ?> map) {
        this._cfgFailOnUnknownId = true;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof PropertyFilter)) {
                HashMap map2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof PropertyFilter) {
                        map2.put(entry.getKey(), (PropertyFilter) value);
                    } else {
                        if (!(value instanceof BeanPropertyFilter)) {
                            throw new IllegalArgumentException("Unrecognized filter type (" + value.getClass().getName() + ")");
                        }
                        map2.put(entry.getKey(), SimpleBeanPropertyFilter.from((BeanPropertyFilter) value));
                    }
                }
                this._filtersById = map2;
                return;
            }
        }
        this._filtersById = map;
    }

    public SimpleFilterProvider setDefaultFilter(PropertyFilter propertyFilter) {
        this._defaultFilter = propertyFilter;
        return this;
    }

    public SimpleFilterProvider setDefaultFilter(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this._defaultFilter = simpleBeanPropertyFilter;
        return this;
    }

    public SimpleFilterProvider addFilter(String str, PropertyFilter propertyFilter) {
        this._filtersById.put(str, propertyFilter);
        return this;
    }

    public SimpleFilterProvider addFilter(String str, SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this._filtersById.put(str, simpleBeanPropertyFilter);
        return this;
    }
}
