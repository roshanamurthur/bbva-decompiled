package org.bouncycastle.jcajce.util;

import java.security.PrivateKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class AnnotatedPrivateKey implements PrivateKey {
    public static final String LABEL = "label";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PrivateKey f90311p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Map<String, Object> f90312q0;

    public AnnotatedPrivateKey(PrivateKey privateKey, String str) {
        this.f90311p0 = privateKey;
        this.f90312q0 = Collections.singletonMap("label", str);
    }

    public AnnotatedPrivateKey addAnnotation(String str, Object obj) {
        HashMap map = new HashMap(this.f90312q0);
        map.put(str, obj);
        return new AnnotatedPrivateKey(this.f90311p0, (Map<String, Object>) Collections.unmodifiableMap(map));
    }

    public boolean equals(Object obj) {
        boolean z10 = obj instanceof AnnotatedPrivateKey;
        PrivateKey privateKey = this.f90311p0;
        return z10 ? privateKey.equals(((AnnotatedPrivateKey) obj).f90311p0) : privateKey.equals(obj);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.f90311p0.getAlgorithm();
    }

    public Object getAnnotation(String str) {
        return this.f90312q0.get(str);
    }

    public Map<String, Object> getAnnotations() {
        return this.f90312q0;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.f90311p0.getEncoded();
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.f90311p0.getFormat();
    }

    public PrivateKey getKey() {
        return this.f90311p0;
    }

    public int hashCode() {
        return this.f90311p0.hashCode();
    }

    public AnnotatedPrivateKey removeAnnotation(String str) {
        HashMap map = new HashMap(this.f90312q0);
        map.remove(str);
        return new AnnotatedPrivateKey(this.f90311p0, (Map<String, Object>) Collections.unmodifiableMap(map));
    }

    public String toString() {
        Map<String, Object> map = this.f90312q0;
        return (map.containsKey("label") ? map.get("label") : this.f90311p0).toString();
    }

    public AnnotatedPrivateKey(PrivateKey privateKey, Map<String, Object> map) {
        this.f90311p0 = privateKey;
        this.f90312q0 = map;
    }
}
