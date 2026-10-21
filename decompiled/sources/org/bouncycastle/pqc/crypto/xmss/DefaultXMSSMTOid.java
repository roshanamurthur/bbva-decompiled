package org.bouncycastle.pqc.crypto.xmss;

import ad.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes13.dex */
public final class DefaultXMSSMTOid implements XMSSOid {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, DefaultXMSSMTOid> f91279c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91281b;

    static {
        HashMap map = new HashMap();
        e.e(1, "XMSSMT_SHA2_20/2_256", map, a("SHA-256", 32, 16, 67, 20, 2));
        e.e(2, "XMSSMT_SHA2_20/4_256", map, a("SHA-256", 32, 16, 67, 20, 4));
        e.e(3, "XMSSMT_SHA2_40/2_256", map, a("SHA-256", 32, 16, 67, 40, 2));
        e.e(4, "XMSSMT_SHA2_40/4_256", map, a("SHA-256", 32, 16, 67, 40, 2));
        e.e(5, "XMSSMT_SHA2_40/8_256", map, a("SHA-256", 32, 16, 67, 40, 4));
        e.e(6, "XMSSMT_SHA2_60/3_256", map, a("SHA-256", 32, 16, 67, 60, 8));
        e.e(7, "XMSSMT_SHA2_60/6_256", map, a("SHA-256", 32, 16, 67, 60, 6));
        e.e(8, "XMSSMT_SHA2_60/12_256", map, a("SHA-256", 32, 16, 67, 60, 12));
        e.e(9, "XMSSMT_SHA2_20/2_512", map, a("SHA-512", 64, 16, 131, 20, 2));
        e.e(10, "XMSSMT_SHA2_20/4_512", map, a("SHA-512", 64, 16, 131, 20, 4));
        e.e(11, "XMSSMT_SHA2_40/2_512", map, a("SHA-512", 64, 16, 131, 40, 2));
        e.e(12, "XMSSMT_SHA2_40/4_512", map, a("SHA-512", 64, 16, 131, 40, 4));
        e.e(13, "XMSSMT_SHA2_40/8_512", map, a("SHA-512", 64, 16, 131, 40, 8));
        e.e(14, "XMSSMT_SHA2_60/3_512", map, a("SHA-512", 64, 16, 131, 60, 3));
        e.e(15, "XMSSMT_SHA2_60/6_512", map, a("SHA-512", 64, 16, 131, 60, 6));
        e.e(16, "XMSSMT_SHA2_60/12_512", map, a("SHA-512", 64, 16, 131, 60, 12));
        e.e(17, "XMSSMT_SHAKE_20/2_256", map, a("SHAKE128", 32, 16, 67, 20, 2));
        e.e(18, "XMSSMT_SHAKE_20/4_256", map, a("SHAKE128", 32, 16, 67, 20, 4));
        e.e(19, "XMSSMT_SHAKE_40/2_256", map, a("SHAKE128", 32, 16, 67, 40, 2));
        e.e(20, "XMSSMT_SHAKE_40/4_256", map, a("SHAKE128", 32, 16, 67, 40, 4));
        e.e(21, "XMSSMT_SHAKE_40/8_256", map, a("SHAKE128", 32, 16, 67, 40, 8));
        e.e(22, "XMSSMT_SHAKE_60/3_256", map, a("SHAKE128", 32, 16, 67, 60, 3));
        e.e(23, "XMSSMT_SHAKE_60/6_256", map, a("SHAKE128", 32, 16, 67, 60, 6));
        e.e(24, "XMSSMT_SHAKE_60/12_256", map, a("SHAKE128", 32, 16, 67, 60, 12));
        e.e(25, "XMSSMT_SHAKE_20/2_512", map, a("SHAKE256", 64, 16, 131, 20, 2));
        e.e(26, "XMSSMT_SHAKE_20/4_512", map, a("SHAKE256", 64, 16, 131, 20, 4));
        e.e(27, "XMSSMT_SHAKE_40/2_512", map, a("SHAKE256", 64, 16, 131, 40, 2));
        e.e(28, "XMSSMT_SHAKE_40/4_512", map, a("SHAKE256", 64, 16, 131, 40, 4));
        e.e(29, "XMSSMT_SHAKE_40/8_512", map, a("SHAKE256", 64, 16, 131, 40, 8));
        e.e(30, "XMSSMT_SHAKE_60/3_512", map, a("SHAKE256", 64, 16, 131, 60, 3));
        e.e(31, "XMSSMT_SHAKE_60/6_512", map, a("SHAKE256", 64, 16, 131, 60, 6));
        map.put(a("SHAKE256", 64, 16, 131, 60, 12), new DefaultXMSSMTOid(32, "XMSSMT_SHAKE_60/12_512"));
        f91279c = Collections.unmodifiableMap(map);
    }

    public DefaultXMSSMTOid(int i10, String str) {
        this.f91280a = i10;
        this.f91281b = str;
    }

    public static String a(String str, int i10, int i11, int i12, int i13, int i14) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + Constant.DASH_STRING + i10 + Constant.DASH_STRING + i11 + Constant.DASH_STRING + i12 + Constant.DASH_STRING + i13 + Constant.DASH_STRING + i14;
    }

    public static DefaultXMSSMTOid lookup(String str, int i10, int i11, int i12, int i13, int i14) {
        if (str != null) {
            return f91279c.get(a(str, i10, i11, i12, i13, i14));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public int getOid() {
        return this.f91280a;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public String toString() {
        return this.f91281b;
    }
}
