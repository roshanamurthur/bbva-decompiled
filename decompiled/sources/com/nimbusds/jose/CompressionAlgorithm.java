package com.nimbusds.jose;

import com.nimbusds.jose.util.JSONStringUtils;
import java.io.Serializable;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class CompressionAlgorithm implements Serializable {
    public static final CompressionAlgorithm DEF = new CompressionAlgorithm("DEF");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f62503p0;

    public CompressionAlgorithm(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The compression algorithm name must not be null");
        }
        this.f62503p0 = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompressionAlgorithm) && toString().equals(obj.toString());
    }

    public String getName() {
        return this.f62503p0;
    }

    public int hashCode() {
        return this.f62503p0.hashCode();
    }

    public String toJSONString() {
        return JSONStringUtils.toJSONString(this.f62503p0);
    }

    public String toString() {
        return this.f62503p0;
    }
}
