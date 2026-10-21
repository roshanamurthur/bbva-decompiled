package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes13.dex */
public final class DefaultXMSSOid implements XMSSOid {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, DefaultXMSSOid> f91282c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91284b;

    static {
        HashMap map = new HashMap();
        map.put(a("SHA-256", 32, 16, 67, 10), new DefaultXMSSOid(1, "XMSS_SHA2_10_256"));
        map.put(a("SHA-256", 32, 16, 67, 16), new DefaultXMSSOid(2, "XMSS_SHA2_16_256"));
        map.put(a("SHA-256", 32, 16, 67, 20), new DefaultXMSSOid(3, "XMSS_SHA2_20_256"));
        map.put(a("SHA-512", 64, 16, 131, 10), new DefaultXMSSOid(4, "XMSS_SHA2_10_512"));
        map.put(a("SHA-512", 64, 16, 131, 16), new DefaultXMSSOid(5, "XMSS_SHA2_16_512"));
        map.put(a("SHA-512", 64, 16, 131, 20), new DefaultXMSSOid(6, "XMSS_SHA2_20_512"));
        map.put(a("SHAKE128", 32, 16, 67, 10), new DefaultXMSSOid(7, "XMSS_SHAKE_10_256"));
        map.put(a("SHAKE128", 32, 16, 67, 16), new DefaultXMSSOid(8, "XMSS_SHAKE_16_256"));
        map.put(a("SHAKE128", 32, 16, 67, 20), new DefaultXMSSOid(9, "XMSS_SHAKE_20_256"));
        map.put(a("SHAKE256", 64, 16, 131, 10), new DefaultXMSSOid(10, "XMSS_SHAKE_10_512"));
        map.put(a("SHAKE256", 64, 16, 131, 16), new DefaultXMSSOid(11, "XMSS_SHAKE_16_512"));
        map.put(a("SHAKE256", 64, 16, 131, 20), new DefaultXMSSOid(12, "XMSS_SHAKE_20_512"));
        f91282c = Collections.unmodifiableMap(map);
    }

    public DefaultXMSSOid(int i10, String str) {
        this.f91283a = i10;
        this.f91284b = str;
    }

    public static String a(String str, int i10, int i11, int i12, int i13) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + Constant.DASH_STRING + i10 + Constant.DASH_STRING + i11 + Constant.DASH_STRING + i12 + Constant.DASH_STRING + i13;
    }

    public static DefaultXMSSOid lookup(String str, int i10, int i11, int i12, int i13) {
        if (str != null) {
            return f91282c.get(a(str, i10, i11, i12, i13));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public int getOid() {
        return this.f91283a;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public String toString() {
        return this.f91284b;
    }
}
