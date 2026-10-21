package org.bouncycastle.jce.provider;

import java.util.Collection;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Selector;
import org.bouncycastle.x509.X509CollectionStoreParameters;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;

/* JADX INFO: loaded from: classes8.dex */
public class X509StoreCertPairCollection extends X509StoreSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CollectionStore f90472a;

    @Override // org.bouncycastle.x509.X509StoreSpi
    public Collection engineGetMatches(Selector selector) {
        return this.f90472a.getMatches(selector);
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(X509StoreParameters x509StoreParameters) {
        if (!(x509StoreParameters instanceof X509CollectionStoreParameters)) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.e.e(X509CollectionStoreParameters.class, new StringBuilder("Initialization parameters must be an instance of "), Constant.DOT_STRING));
        }
        this.f90472a = new CollectionStore(((X509CollectionStoreParameters) x509StoreParameters).getCollection());
    }
}
