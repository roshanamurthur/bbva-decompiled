package zm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.pqc.crypto.xmss.XMSSOid;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements XMSSOid {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, c> f95102c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95104b;

    static {
        HashMap map = new HashMap();
        map.put(a(32, 67, "SHA-256"), new c(16777217, "WOTSP_SHA2-256_W16"));
        map.put(a(64, 131, "SHA-512"), new c(33554434, "WOTSP_SHA2-512_W16"));
        map.put(a(32, 67, "SHAKE128"), new c(50331651, "WOTSP_SHAKE128_W16"));
        map.put(a(64, 131, "SHAKE256"), new c(67108868, "WOTSP_SHAKE256_W16"));
        f95102c = Collections.unmodifiableMap(map);
    }

    public c(int i10, String str) {
        this.f95103a = i10;
        this.f95104b = str;
    }

    public static String a(int i10, int i11, String str) {
        return str + Constant.DASH_STRING + i10 + "-16-" + i11;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public final int getOid() {
        return this.f95103a;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public final String toString() {
        return this.f95104b;
    }
}
