package org.bouncycastle.x509;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Collection;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes13.dex */
public class X509CollectionStoreParameters implements X509StoreParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Collection f91720p0;

    public X509CollectionStoreParameters(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("collection cannot be null");
        }
        this.f91720p0 = collection;
    }

    public Object clone() {
        return new X509CollectionStoreParameters(this.f91720p0);
    }

    public Collection getCollection() {
        return new ArrayList(this.f91720p0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("X509CollectionStoreParameters: [\n");
        stringBuffer.append("  collection: " + this.f91720p0 + RootService.LINE_BREAK);
        stringBuffer.append(Constant.BRACKET_CLOSE);
        return stringBuffer.toString();
    }
}
