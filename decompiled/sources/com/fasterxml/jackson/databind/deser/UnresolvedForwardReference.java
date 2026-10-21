package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class UnresolvedForwardReference extends JsonMappingException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ReadableObjectId f43202p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f43203q0;

    public UnresolvedForwardReference(JsonParser jsonParser, String str, JsonLocation jsonLocation, ReadableObjectId readableObjectId) {
        super(jsonParser, str, jsonLocation);
        this.f43202p0 = readableObjectId;
    }

    public void addUnresolvedId(Object obj, Class<?> cls, JsonLocation jsonLocation) {
        this.f43203q0.add(new UnresolvedId(obj, cls, jsonLocation));
    }

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        ArrayList arrayList = this.f43203q0;
        if (arrayList == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(message);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append(((UnresolvedId) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append('.');
        return sb2.toString();
    }

    public ReadableObjectId getRoid() {
        return this.f43202p0;
    }

    public Object getUnresolvedId() {
        return this.f43202p0.getKey().key;
    }

    public List<UnresolvedId> getUnresolvedIds() {
        return this.f43203q0;
    }

    public UnresolvedForwardReference(JsonParser jsonParser, String str) {
        super(jsonParser, str);
        this.f43203q0 = new ArrayList();
    }

    @Deprecated
    public UnresolvedForwardReference(String str, JsonLocation jsonLocation, ReadableObjectId readableObjectId) {
        super(str, jsonLocation);
        this.f43202p0 = readableObjectId;
    }

    @Deprecated
    public UnresolvedForwardReference(String str) {
        super(str);
        this.f43203q0 = new ArrayList();
    }
}
