package com.facetec.sdk;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ec {
    public double a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final boolean g() {
        return this instanceof ef;
    }

    public final boolean h() {
        return this instanceof ee;
    }

    public final boolean i() {
        return this instanceof ei;
    }

    public final boolean j() {
        return this instanceof eh;
    }

    public final ei n() {
        if (i()) {
            return (ei) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(String.valueOf(this)));
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ga gaVar = new ga(stringWriter);
            gaVar.c(true);
            fh.e(this, gaVar);
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
