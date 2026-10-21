package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes9.dex */
public class ReadableObjectId {
    protected Object _item;
    protected final ObjectIdGenerator.IdKey _key;
    protected LinkedList<Referring> _referringProperties;
    protected ObjectIdResolver _resolver;

    public ReadableObjectId(ObjectIdGenerator.IdKey idKey) {
        this._key = idKey;
    }

    public void appendReferring(Referring referring) {
        if (this._referringProperties == null) {
            this._referringProperties = new LinkedList<>();
        }
        this._referringProperties.add(referring);
    }

    public void bindItem(Object obj) throws IOException {
        this._resolver.bindItem(this._key, obj);
        this._item = obj;
        Object obj2 = this._key.key;
        LinkedList<Referring> linkedList = this._referringProperties;
        if (linkedList != null) {
            Iterator<Referring> it = linkedList.iterator();
            this._referringProperties = null;
            while (it.hasNext()) {
                it.next().handleResolvedForwardReference(obj2, obj);
            }
        }
    }

    public ObjectIdGenerator.IdKey getKey() {
        return this._key;
    }

    public ObjectIdResolver getResolver() {
        return this._resolver;
    }

    public boolean hasReferringProperties() {
        LinkedList<Referring> linkedList = this._referringProperties;
        return (linkedList == null || linkedList.isEmpty()) ? false : true;
    }

    public Iterator<Referring> referringProperties() {
        LinkedList<Referring> linkedList = this._referringProperties;
        return linkedList == null ? Collections.emptyList().iterator() : linkedList.iterator();
    }

    public Object resolve() {
        Object objResolveId = this._resolver.resolveId(this._key);
        this._item = objResolveId;
        return objResolveId;
    }

    public void setResolver(ObjectIdResolver objectIdResolver) {
        this._resolver = objectIdResolver;
    }

    public String toString() {
        return String.valueOf(this._key);
    }

    public boolean tryToResolveUnresolved(DeserializationContext deserializationContext) {
        return false;
    }

    public static abstract class Referring {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnresolvedForwardReference f43246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f43247b;

        public Referring(UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            this.f43246a = unresolvedForwardReference;
            this.f43247b = cls;
        }

        public Class<?> getBeanType() {
            return this.f43247b;
        }

        public JsonLocation getLocation() {
            return this.f43246a.getLocation();
        }

        public abstract void handleResolvedForwardReference(Object obj, Object obj2) throws IOException;

        public boolean hasId(Object obj) {
            return obj.equals(this.f43246a.getUnresolvedId());
        }

        public Referring(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this.f43246a = unresolvedForwardReference;
            this.f43247b = javaType.getRawClass();
        }
    }
}
