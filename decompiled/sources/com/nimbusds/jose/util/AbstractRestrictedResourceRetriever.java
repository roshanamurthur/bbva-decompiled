package com.nimbusds.jose.util;

import java.util.List;
import java.util.Map;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public abstract class AbstractRestrictedResourceRetriever implements RestrictedResourceRetriever {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f62819d;

    public AbstractRestrictedResourceRetriever(int i10, int i11, int i12) {
        setConnectTimeout(i10);
        setReadTimeout(i11);
        setSizeLimit(i12);
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public int getConnectTimeout() {
        return this.f62816a;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public Map<String, List<String>> getHeaders() {
        return this.f62819d;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public int getReadTimeout() {
        return this.f62817b;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public int getSizeLimit() {
        return this.f62818c;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setConnectTimeout(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("The connect timeout must not be negative");
        }
        this.f62816a = i10;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setHeaders(Map<String, List<String>> map) {
        this.f62819d = map;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setReadTimeout(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("The read timeout must not be negative");
        }
        this.f62817b = i10;
    }

    @Override // com.nimbusds.jose.util.RestrictedResourceRetriever
    public void setSizeLimit(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("The size limit must not be negative");
        }
        this.f62818c = i10;
    }
}
