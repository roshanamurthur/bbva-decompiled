package com.nimbusds.jose;

import com.nimbusds.jose.util.JSONStringUtils;
import java.io.Serializable;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class JOSEObjectType implements Serializable {
    public static final JOSEObjectType JOSE = new JOSEObjectType("JOSE");
    public static final JOSEObjectType JOSE_JSON = new JOSEObjectType("JOSE+JSON");
    public static final JOSEObjectType JWT = new JOSEObjectType("JWT");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f62504p0;

    public JOSEObjectType(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The object type must not be null");
        }
        this.f62504p0 = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof JOSEObjectType) && this.f62504p0.toLowerCase().equals(((JOSEObjectType) obj).f62504p0.toLowerCase());
    }

    public String getType() {
        return this.f62504p0;
    }

    public int hashCode() {
        return this.f62504p0.toLowerCase().hashCode();
    }

    public String toJSONString() {
        return JSONStringUtils.toJSONString(this.f62504p0);
    }

    public String toString() {
        return this.f62504p0;
    }
}
