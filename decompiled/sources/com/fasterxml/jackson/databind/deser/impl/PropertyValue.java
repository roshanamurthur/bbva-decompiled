package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PropertyValue {
    public final PropertyValue next;
    public final Object value;

    public static final class a extends PropertyValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SettableAnyProperty f43242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f43243b;

        public a(PropertyValue propertyValue, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(propertyValue, obj);
            this.f43242a = settableAnyProperty;
            this.f43243b = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public final void assign(Object obj) throws IOException {
            this.f43242a.set(obj, this.f43243b, this.value);
        }
    }

    public static final class b extends PropertyValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f43244a;

        public b(PropertyValue propertyValue, Object obj, Object obj2) {
            super(propertyValue, obj);
            this.f43244a = obj2;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public final void assign(Object obj) throws IOException {
            ((Map) obj).put(this.f43244a, this.value);
        }
    }

    public static final class c extends PropertyValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SettableBeanProperty f43245a;

        public c(PropertyValue propertyValue, Object obj, SettableBeanProperty settableBeanProperty) {
            super(propertyValue, obj);
            this.f43245a = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public final void assign(Object obj) throws IOException {
            this.f43245a.set(obj, this.value);
        }
    }

    public PropertyValue(PropertyValue propertyValue, Object obj) {
        this.next = propertyValue;
        this.value = obj;
    }

    public abstract void assign(Object obj) throws IOException;
}
