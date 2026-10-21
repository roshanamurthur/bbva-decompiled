package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import mx.openpay.library.domain.util.Constant;
import org.objenesis.instantiator.ObjectInstantiator;

/* JADX INFO: loaded from: classes9.dex */
public class Registration {
    private final int id;
    private ObjectInstantiator instantiator;
    private Serializer serializer;
    private final Class type;
    private final boolean typeNameAscii;

    public Registration(Class cls, Serializer serializer, int i10) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (serializer == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        }
        this.type = cls;
        this.serializer = serializer;
        this.id = i10;
        this.typeNameAscii = Util.isAscii(cls.getName());
    }

    public int getId() {
        return this.id;
    }

    public ObjectInstantiator getInstantiator() {
        return this.instantiator;
    }

    public Serializer getSerializer() {
        return this.serializer;
    }

    public Class getType() {
        return this.type;
    }

    public boolean isTypeNameAscii() {
        return this.typeNameAscii;
    }

    public void setInstantiator(ObjectInstantiator objectInstantiator) {
        if (objectInstantiator == null) {
            throw new IllegalArgumentException("instantiator cannot be null.");
        }
        this.instantiator = objectInstantiator;
    }

    public void setSerializer(Serializer serializer) {
        if (serializer == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        }
        this.serializer = serializer;
        if (Log.TRACE) {
            Log.trace("kryo", "Update registered serializer: " + this.type.getName() + " (" + serializer.getClass().getName() + ")");
        }
    }

    public String toString() {
        return Constant.BRACKET_OPEN + this.id + ", " + Util.className(this.type) + Constant.BRACKET_CLOSE;
    }
}
