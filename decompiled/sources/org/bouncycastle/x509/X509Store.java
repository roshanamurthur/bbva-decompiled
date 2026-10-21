package org.bouncycastle.x509;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* JADX INFO: loaded from: classes13.dex */
public class X509Store implements Store {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Provider f91721p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public X509StoreSpi f91722q0;

    public static X509Store getInstance(String str, X509StoreParameters x509StoreParameters) throws NoSuchStoreException {
        try {
            e.a aVarF = e.f("X509Store", str);
            X509StoreSpi x509StoreSpi = (X509StoreSpi) aVarF.f91749a;
            x509StoreSpi.engineInit(x509StoreParameters);
            X509Store x509Store = new X509Store();
            x509Store.f91721p0 = aVarF.f91750b;
            x509Store.f91722q0 = x509StoreSpi;
            return x509Store;
        } catch (NoSuchAlgorithmException e5) {
            throw new NoSuchStoreException(e5.getMessage());
        }
    }

    @Override // org.bouncycastle.util.Store
    public Collection getMatches(Selector selector) {
        return this.f91722q0.engineGetMatches(selector);
    }

    public Provider getProvider() {
        return this.f91721p0;
    }

    public static X509Store getInstance(String str, X509StoreParameters x509StoreParameters, String str2) throws NoSuchStoreException, NoSuchProviderException {
        return getInstance(str, x509StoreParameters, e.h(str2));
    }

    public static X509Store getInstance(String str, X509StoreParameters x509StoreParameters, Provider provider) throws NoSuchStoreException {
        try {
            e.a aVarG = e.g("X509Store", str, provider);
            X509StoreSpi x509StoreSpi = (X509StoreSpi) aVarG.f91749a;
            x509StoreSpi.engineInit(x509StoreParameters);
            X509Store x509Store = new X509Store();
            x509Store.f91721p0 = aVarG.f91750b;
            x509Store.f91722q0 = x509StoreSpi;
            return x509Store;
        } catch (NoSuchAlgorithmException e5) {
            throw new NoSuchStoreException(e5.getMessage());
        }
    }
}
