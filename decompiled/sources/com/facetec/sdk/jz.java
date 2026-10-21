package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class jz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jz f41941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jz f41942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jz f41943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final jz f41944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final jz f41945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final jz f41946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final jz f41947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final jz f41948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final jz f41949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final jz f41950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final jz f41951l;
    public static final jz m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final jz f41952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final jz f41953o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final jz f41954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final jz f41955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final jz f41956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final jz f41957t;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final String f41959p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Comparator<String> f41940a = new Comparator<String>() { // from class: com.facetec.sdk.jz.3
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            int iMin = Math.min(str3.length(), str4.length());
            for (int i10 = 4; i10 < iMin; i10++) {
                char cCharAt = str3.charAt(i10);
                char cCharAt2 = str4.charAt(i10);
                if (cCharAt != cCharAt2) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
            }
            int length = str3.length();
            int length2 = str4.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map<String, jz> f41958x = new LinkedHashMap();

    static {
        c("SSL_RSA_WITH_NULL_MD5");
        c("SSL_RSA_WITH_NULL_SHA");
        c("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        c("SSL_RSA_WITH_RC4_128_MD5");
        c("SSL_RSA_WITH_RC4_128_SHA");
        c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_RSA_WITH_DES_CBC_SHA");
        f41942c = c("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        c("SSL_DH_anon_WITH_RC4_128_MD5");
        c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        c("SSL_DH_anon_WITH_DES_CBC_SHA");
        c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        c("TLS_KRB5_WITH_DES_CBC_SHA");
        c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        c("TLS_KRB5_WITH_RC4_128_SHA");
        c("TLS_KRB5_WITH_DES_CBC_MD5");
        c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        c("TLS_KRB5_WITH_RC4_128_MD5");
        c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f41943d = c("TLS_RSA_WITH_AES_128_CBC_SHA");
        c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        c("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f41944e = c("TLS_RSA_WITH_AES_256_CBC_SHA");
        c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        c("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        c("TLS_RSA_WITH_NULL_SHA256");
        c("TLS_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_RSA_WITH_AES_256_CBC_SHA256");
        c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        c("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        c("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        c("TLS_PSK_WITH_RC4_128_SHA");
        c("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        c("TLS_PSK_WITH_AES_128_CBC_SHA");
        c("TLS_PSK_WITH_AES_256_CBC_SHA");
        c("TLS_RSA_WITH_SEED_CBC_SHA");
        f41941b = c("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f41949j = c("TLS_RSA_WITH_AES_256_GCM_SHA384");
        c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        c("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        c("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        c("TLS_FALLBACK_SCSV");
        c("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDH_RSA_WITH_NULL_SHA");
        c("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDHE_RSA_WITH_NULL_SHA");
        c("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f41947h = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f41948i = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        c("TLS_ECDH_anon_WITH_NULL_SHA");
        c("TLS_ECDH_anon_WITH_RC4_128_SHA");
        c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f41945f = c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f41946g = c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f41953o = c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        m = c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f41952n = c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f41950k = c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f41951l = c("TLS_AES_128_GCM_SHA256");
        f41954q = c("TLS_AES_256_GCM_SHA384");
        f41956s = c("TLS_CHACHA20_POLY1305_SHA256");
        f41955r = c("TLS_AES_128_CCM_SHA256");
        f41957t = c("TLS_AES_256_CCM_8_SHA256");
    }

    private jz(String str) {
        str.getClass();
        this.f41959p = str;
    }

    public static synchronized jz a(String str) {
        jz jzVar;
        String string;
        try {
            Map<String, jz> map = f41958x;
            jzVar = map.get(str);
            if (jzVar == null) {
                if (str.startsWith("TLS_")) {
                    StringBuilder sb2 = new StringBuilder("SSL_");
                    sb2.append(str.substring(4));
                    string = sb2.toString();
                } else if (str.startsWith("SSL_")) {
                    StringBuilder sb3 = new StringBuilder("TLS_");
                    sb3.append(str.substring(4));
                    string = sb3.toString();
                } else {
                    string = str;
                }
                jzVar = map.get(string);
                if (jzVar == null) {
                    jzVar = new jz(str);
                }
                map.put(str, jzVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jzVar;
    }

    private static jz c(String str) {
        jz jzVar = new jz(str);
        f41958x.put(str, jzVar);
        return jzVar;
    }

    public static List<jz> e(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return this.f41959p;
    }
}
