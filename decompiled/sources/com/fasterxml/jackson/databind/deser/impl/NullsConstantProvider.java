package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class NullsConstantProvider implements NullValueProvider, Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final NullsConstantProvider f43238p0 = new NullsConstantProvider(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final NullsConstantProvider f43239q0 = new NullsConstantProvider(null);
    protected final AccessPattern _access;
    protected final Object _nullValue;

    public NullsConstantProvider(Object obj) {
        this._nullValue = obj;
        this._access = obj == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
    }

    public static NullsConstantProvider forValue(Object obj) {
        return obj == null ? f43239q0 : new NullsConstantProvider(obj);
    }

    public static boolean isNuller(NullValueProvider nullValueProvider) {
        return nullValueProvider == f43239q0;
    }

    public static boolean isSkipper(NullValueProvider nullValueProvider) {
        return nullValueProvider == f43238p0;
    }

    public static NullsConstantProvider nuller() {
        return f43239q0;
    }

    public static NullsConstantProvider skipper() {
        return f43238p0;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public AccessPattern getNullAccessPattern() {
        return this._access;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }
}
