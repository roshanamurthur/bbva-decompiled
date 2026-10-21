package org.bouncycastle.jce;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
public class MultiCertStoreParameters implements CertStoreParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Collection f90316p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f90317q0;

    public MultiCertStoreParameters(Collection collection) {
        this(collection, true);
    }

    public Collection getCertStores() {
        return this.f90316p0;
    }

    public boolean getSearchAllStores() {
        return this.f90317q0;
    }

    public MultiCertStoreParameters(Collection collection, boolean z10) {
        this.f90316p0 = collection;
        this.f90317q0 = z10;
    }

    @Override // java.security.cert.CertStoreParameters
    public Object clone() {
        return this;
    }
}
