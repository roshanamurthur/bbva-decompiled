package com.mypinpad.tsdk.isolation;

import androidx.room.a;
import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/abs;", "Ljavax/net/ssl/HostnameVerifier;", "Ljava/security/cert/X509Certificate;", "p0", "", "", "setOnFocusChangeListener", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "p1", "", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "setCompoundDrawableTintBlendMode", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
public final class abs implements HostnameVerifier {

    @NotNull
    public static final abs INSTANCE = new abs();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52348a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52349b = 1;

    static {
        int i10 = f52349b;
        int i11 = i10 & 107;
        int i12 = (i10 ^ 107) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52348a = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        boolean zBooleanValue = false;
        abs absVar = (abs) objArr[0];
        String str = (String) objArr[1];
        SSLSession sSLSession = (SSLSession) objArr[2];
        int i10 = f52349b;
        int i11 = i10 & 71;
        int i12 = -(-((i10 ^ 71) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52348a = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sSLSession, "");
        if (!((Boolean) setDividerPadding(new Object[]{str}, -1911103038, 1911103041, (int) System.currentTimeMillis())).booleanValue()) {
            int i15 = f52348a;
            int i16 = ((i15 | 7) << 1) - (i15 ^ 7);
            f52349b = i16 % 128;
            zBooleanValue = i16 % 2 == 0;
            int i17 = ((i15 ^ 89) - (~((i15 & 89) << 1))) - 1;
            f52349b = i17 % 128;
            int i18 = i17 % 2;
            return Boolean.valueOf(zBooleanValue);
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            zBooleanValue = ((Boolean) setDividerPadding(new Object[]{absVar, str, (X509Certificate) certificate}, -1687078922, 1687078927, System.identityHashCode(absVar))).booleanValue();
            int i19 = f52348a;
            int i20 = i19 & 13;
            int i21 = (i19 | 13) & (~i20);
            int i22 = -(-(i20 << 1));
            int i23 = (i21 & i22) + (i21 | i22);
            f52349b = i23 % 128;
            int i24 = i23 % 2;
            int i25 = f52348a + 17;
            f52349b = i25 % 128;
            int i26 = i25 % 2;
            return Boolean.valueOf(zBooleanValue);
        } catch (SSLException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x042c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0446  */
    /* JADX WARN: Code duplicated, block: B:150:0x0447  */
    /* JADX WARN: Code duplicated, block: B:154:0x0461  */
    /* JADX WARN: Code duplicated, block: B:159:0x0486  */
    /* JADX WARN: Code duplicated, block: B:181:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:184:0x0611  */
    /* JADX WARN: Code duplicated, block: B:207:0x0753  */
    /* JADX WARN: Code duplicated, block: B:210:0x0772  */
    /* JADX WARN: Code duplicated, block: B:225:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0654 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[LOOP:1: B:182:0x060b->B:244:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x079f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[LOOP:2: B:208:0x076c->B:247:?, LOOP_END, SYNTHETIC] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Iterator it;
        abs absVar;
        boolean zBooleanValue;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Object obj;
        int i18;
        int i19 = ~i12;
        int i20 = ~i10;
        int i21 = ~i11;
        int i22 = i19 | (~(i20 | i21));
        int i23 = ~(i10 | i11);
        switch ((((~(i10 | i21)) | (~(i11 | i20))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i23) * (-1444)) + ((i22 | i23) * 1444) + (i11 * (-721)) + (i10 * (-721))) {
            case 1:
                return a(objArr);
            case 2:
                String str = (String) objArr[0];
                X509Certificate x509Certificate = (X509Certificate) objArr[1];
                int i24 = f52348a;
                int i25 = ((i24 ^ 88) + ((i24 & 88) << 1)) - 1;
                f52349b = i25 % 128;
                int i26 = i25 % 2;
                String str2 = (String) yu.setCompoundDrawableTintBlendMode(new Object[]{str}, 768394866, -768394863, (int) System.currentTimeMillis());
                List list = (List) setDividerPadding(new Object[]{x509Certificate, 7}, 1931919739, -1931919739, 7);
                if (list instanceof Collection) {
                    int i27 = f52349b;
                    int i28 = i27 & 123;
                    int i29 = i27 | 123;
                    int i30 = (i28 & i29) + (i29 | i28);
                    f52348a = i30 % 128;
                    int i31 = i30 % 2;
                    if (!list.isEmpty()) {
                        it = list.iterator();
                        int i32 = f52348a;
                        int i33 = (i32 & (-24)) | ((~i32) & 23);
                        int i34 = -(-((23 & i32) << 1));
                        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                        f52349b = i35 % 128;
                        int i36 = i35 % 2;
                        while (it.hasNext()) {
                            int i37 = f52348a;
                            int i38 = (i37 ^ 104) + ((i37 & 104) << 1);
                            int i39 = (i38 ^ (-1)) + (i38 << 1);
                            f52349b = i39 % 128;
                            int i40 = i39 % 2;
                            if (!Intrinsics.areEqual(str2, (String) yu.setCompoundDrawableTintBlendMode(new Object[]{(String) it.next()}, 768394866, -768394863, (int) System.currentTimeMillis()))) {
                                System.currentTimeMillis();
                                System.currentTimeMillis();
                                int i41 = f52348a;
                                int i42 = ((i41 & (-72)) | ((~i41) & 71)) + ((i41 & 71) << 1);
                                f52349b = i42 % 128;
                                int i43 = i42 % 2;
                                return Boolean.TRUE;
                            }
                        }
                    }
                } else {
                    it = list.iterator();
                    int i310 = f52348a;
                    int i311 = (i310 & (-24)) | ((~i310) & 23);
                    int i312 = -(-((23 & i310) << 1));
                    int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                    f52349b = i313 % 128;
                    int i314 = i313 % 2;
                    while (it.hasNext()) {
                        int i315 = f52348a;
                        int i316 = (i315 ^ 104) + ((i315 & 104) << 1);
                        int i317 = (i316 ^ (-1)) + (i316 << 1);
                        f52349b = i317 % 128;
                        int i44 = i317 % 2;
                        if (!Intrinsics.areEqual(str2, (String) yu.setCompoundDrawableTintBlendMode(new Object[]{(String) it.next()}, 768394866, -768394863, (int) System.currentTimeMillis()))) {
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            int i45 = f52348a;
                            int i46 = ((i45 & (-72)) | ((~i45) & 71)) + ((i45 & 71) << 1);
                            f52349b = i46 % 128;
                            int i47 = i46 % 2;
                            return Boolean.TRUE;
                        }
                    }
                }
                int i48 = f52349b;
                int i49 = ((i48 ^ 37) - (~((i48 & 37) << 1))) - 1;
                f52348a = i49 % 128;
                if (i49 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            case 3:
                String str3 = (String) objArr[0];
                int i50 = f52348a + 43;
                f52349b = i50 % 128;
                if (i50 % 2 == 0) {
                    str3.getClass();
                    ((Long) acu.setX(new Object[]{str3}, 1506951336, -1506951336, (int) System.currentTimeMillis())).longValue();
                    throw null;
                }
                if (str3.length() != ((int) ((Long) acu.setX(new Object[]{str3}, 1506951336, -1506951336, (int) System.currentTimeMillis())).longValue())) {
                    int i51 = f52349b;
                    int i52 = ((i51 ^ 124) + ((i51 & 124) << 1)) - 1;
                    f52348a = i52 % 128;
                    if (i52 % 2 == 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                int i53 = f52349b;
                int i54 = ((i53 & 40) + (i53 | 40)) - 1;
                int i55 = i54 % 128;
                f52348a = i55;
                int i56 = i54 % 2;
                int i57 = i55 + 99;
                f52349b = i57 % 128;
                if (i57 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            case 4:
                String str4 = (String) objArr[1];
                X509Certificate x509Certificate2 = (X509Certificate) objArr[2];
                int i58 = f52349b;
                int i59 = ((i58 | 75) << 1) - (i58 ^ 75);
                f52348a = i59 % 128;
                int i60 = i59 % 2;
                String str5 = (String) setDividerPadding(new Object[]{str4}, -146362719, 146362727, (int) System.currentTimeMillis());
                List<String> list2 = (List) setDividerPadding(new Object[]{x509Certificate2, 2}, 1931919739, -1931919739, 2);
                if (list2 instanceof Collection) {
                    int i61 = (-2) - ((f52349b + 98) ^ (-1));
                    f52348a = i61 % 128;
                    if (i61 % 2 != 0) {
                        list2.isEmpty();
                        throw null;
                    }
                    if (!list2.isEmpty()) {
                        int i62 = f52348a;
                        int i63 = ((i62 ^ 101) | (i62 & 101)) << 1;
                        int i64 = -(((~i62) & 101) | (i62 & (-102)));
                        int i65 = (i63 & i64) + (i64 | i63);
                        f52349b = i65 % 128;
                        int i66 = i65 % 2;
                        for (String str6 : list2) {
                            int i67 = f52348a;
                            int i68 = ((i67 ^ 105) | (i67 & 105)) << 1;
                            int i69 = -(((~i67) & 105) | (i67 & (-106)));
                            int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                            f52349b = i70 % 128;
                            int i71 = i70 % 2;
                            absVar = INSTANCE;
                            if (!((Boolean) setDividerPadding(new Object[]{absVar, str5, str6}, -1779659707, 1779659714, System.identityHashCode(absVar))).booleanValue()) {
                                int i72 = f52348a;
                                int i73 = i72 ^ 57;
                                int i74 = ((i72 & 57) | i73) << 1;
                                int i75 = -i73;
                                int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                                f52349b = i76 % 128;
                                int i77 = i76 % 2;
                                return Boolean.TRUE;
                            }
                        }
                    }
                } else {
                    int i610 = f52348a;
                    int i611 = ((i610 ^ 101) | (i610 & 101)) << 1;
                    int i612 = -(((~i610) & 101) | (i610 & (-102)));
                    int i613 = (i611 & i612) + (i612 | i611);
                    f52349b = i613 % 128;
                    int i614 = i613 % 2;
                    while (r2.hasNext()) {
                        int i615 = f52348a;
                        int i616 = ((i615 ^ 105) | (i615 & 105)) << 1;
                        int i617 = -(((~i615) & 105) | (i615 & (-106)));
                        int i78 = ((i616 | i617) << 1) - (i617 ^ i616);
                        f52349b = i78 % 128;
                        int i79 = i78 % 2;
                        absVar = INSTANCE;
                        if (!((Boolean) setDividerPadding(new Object[]{absVar, str5, str6}, -1779659707, 1779659714, System.identityHashCode(absVar))).booleanValue()) {
                            int i710 = f52348a;
                            int i711 = i710 ^ 57;
                            int i712 = ((i710 & 57) | i711) << 1;
                            int i713 = -i711;
                            int i714 = ((i712 | i713) << 1) - (i712 ^ i713);
                            f52349b = i714 % 128;
                            int i715 = i714 % 2;
                            return Boolean.TRUE;
                        }
                    }
                }
                int i80 = f52348a;
                int i81 = (((i80 ^ 107) | (i80 & 107)) << 1) - (((~i80) & 107) | (i80 & (-108)));
                f52349b = i81 % 128;
                int i82 = i81 % 2;
                return Boolean.FALSE;
            case 5:
                abs absVar2 = (abs) objArr[0];
                String str7 = (String) objArr[1];
                X509Certificate x509Certificate3 = (X509Certificate) objArr[2];
                int i83 = f52349b;
                int i84 = ((i83 ^ 57) | (i83 & 57)) << 1;
                int i85 = -(((~i83) & 57) | (i83 & (-58)));
                int i86 = (i84 & i85) + (i85 | i84);
                f52348a = i86 % 128;
                int i87 = i86 % 2;
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(x509Certificate3, "");
                if (!yt.setDividerPadding(str7)) {
                    zBooleanValue = ((Boolean) setDividerPadding(new Object[]{absVar2, str7, x509Certificate3}, 805186331, -805186327, System.identityHashCode(absVar2))).booleanValue();
                    int i88 = f52348a + 35;
                    f52349b = i88 % 128;
                    if (i88 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int i89 = f52349b;
                    int i90 = ((i89 ^ 126) + ((i89 & 126) << 1)) - 1;
                    f52348a = i90 % 128;
                    int i91 = i90 % 2;
                    zBooleanValue = ((Boolean) setDividerPadding(new Object[]{str7, x509Certificate3}, -808120485, 808120487, (int) System.currentTimeMillis())).booleanValue();
                    int i92 = f52348a + 75;
                    f52349b = i92 % 128;
                    int i93 = i92 % 2;
                }
                return Boolean.valueOf(zBooleanValue);
            case 6:
                X509Certificate x509Certificate4 = (X509Certificate) objArr[0];
                int i94 = f52348a;
                int i95 = i94 & 15;
                int i96 = (i94 | 15) & (~i95);
                int i97 = -(-(i95 << 1));
                int i98 = (i96 ^ i97) + ((i96 & i97) << 1);
                f52349b = i98 % 128;
                if (i98 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(x509Certificate4, "");
                    return CollectionsKt___CollectionsKt.plus((Collection) setDividerPadding(new Object[]{x509Certificate4, 115}, 1931919739, -1931919739, 115), (Iterable) setDividerPadding(new Object[]{x509Certificate4, 4}, 1931919739, -1931919739, 4));
                }
                Intrinsics.checkNotNullParameter(x509Certificate4, "");
                return CollectionsKt___CollectionsKt.plus((Collection) setDividerPadding(new Object[]{x509Certificate4, 7}, 1931919739, -1931919739, 7), (Iterable) setDividerPadding(new Object[]{x509Certificate4, 2}, 1931919739, -1931919739, 2));
            case 7:
                abs absVar3 = (abs) objArr[0];
                String strStringPlus = (String) objArr[1];
                String strStringPlus2 = (String) objArr[2];
                int i99 = f52349b;
                int i100 = i99 + 61;
                f52348a = i100 % 128;
                if (i100 % 2 != 0) {
                    throw null;
                }
                if (strStringPlus != null) {
                    int i101 = i99 + 21;
                    f52348a = i101 % 128;
                    if (i101 % 2 != 0) {
                        throw null;
                    }
                    if (strStringPlus.length() != 0) {
                        int i102 = f52349b;
                        int i103 = ((i102 & (-42)) | ((~i102) & 41)) + ((i102 & 41) << 1);
                        int i104 = i103 % 128;
                        f52348a = i104;
                        int i105 = i103 % 2;
                        int i106 = ((i104 ^ 41) - (~((i104 & 41) << 1))) - 1;
                        f52349b = i106 % 128;
                        int i107 = i106 % 2;
                        if (!l.startsWith$default(strStringPlus, Constant.DOT_STRING, false, 2, null)) {
                            int i108 = f52349b;
                            int i109 = ((i108 ^ 57) | (i108 & 57)) << 1;
                            int i110 = -(((~i108) & 57) | (i108 & (-58)));
                            int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                            f52348a = i111 % 128;
                            if (i111 % 2 == 0 ? (!l.endsWith$default(strStringPlus, "..", false, 2, null)) : !l.endsWith$default(strStringPlus, "..", true, 2, null)) {
                                if (strStringPlus2 != null) {
                                    int i112 = f52349b;
                                    int i113 = (i112 ^ 51) + ((i112 & 51) << 1);
                                    f52348a = i113 % 128;
                                    int i114 = i113 % 2;
                                    if (strStringPlus2.length() == 0) {
                                        int i115 = f52349b;
                                        int i116 = i115 & 57;
                                        int i117 = i116 + ((i115 ^ 57) | i116);
                                        f52348a = i117 % 128;
                                        int i118 = i117 % 2;
                                    } else {
                                        System.identityHashCode(absVar3);
                                        System.identityHashCode(absVar3);
                                        int i119 = f52348a;
                                        int i120 = i119 & 123;
                                        int i121 = (i119 | 123) & (~i120);
                                        int i122 = -(-(i120 << 1));
                                        int i123 = (i121 ^ i122) + ((i121 & i122) << 1);
                                        f52349b = i123 % 128;
                                        if (i123 % 2 != 0 ? !l.startsWith$default(strStringPlus2, Constant.DOT_STRING, false, 2, null) : !l.startsWith$default(strStringPlus2, Constant.DOT_STRING, true, 5, null)) {
                                            if (!l.endsWith$default(strStringPlus2, "..", false, 2, null)) {
                                                if (!l.endsWith$default(strStringPlus, Constant.DOT_STRING, false, 2, null)) {
                                                    int i124 = f52349b;
                                                    int i125 = ((i124 | 118) << 1) - (i124 ^ 118);
                                                    int i126 = (i125 ^ (-1)) + (i125 << 1);
                                                    f52348a = i126 % 128;
                                                    int i127 = i126 % 2;
                                                    strStringPlus = Intrinsics.stringPlus(strStringPlus, Constant.DOT_STRING);
                                                    int i128 = f52348a;
                                                    int i129 = ((i128 | 59) << 1) - (i128 ^ 59);
                                                    f52349b = i129 % 128;
                                                    int i130 = i129 % 2;
                                                }
                                                String str8 = strStringPlus;
                                                if (!l.endsWith$default(strStringPlus2, Constant.DOT_STRING, false, 2, null)) {
                                                    int i131 = f52348a;
                                                    int i132 = i131 ^ 69;
                                                    int i133 = ((((i131 & 69) | i132) << 1) - (~(-i132))) - 1;
                                                    f52349b = i133 % 128;
                                                    int i134 = i133 % 2;
                                                    strStringPlus2 = Intrinsics.stringPlus(strStringPlus2, Constant.DOT_STRING);
                                                    int i135 = f52348a;
                                                    int i136 = i135 & 47;
                                                    int i137 = (i135 ^ 47) | i136;
                                                    int i138 = (i136 & i137) + (i137 | i136);
                                                    f52349b = i138 % 128;
                                                    int i139 = i138 % 2;
                                                }
                                                String str9 = (String) setDividerPadding(new Object[]{strStringPlus2}, -146362719, 146362727, (int) System.currentTimeMillis());
                                                if (!StringsKt__StringsKt.contains$default((CharSequence) str9, (CharSequence) ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null)) {
                                                    int i140 = f52349b;
                                                    int i141 = (-2) - (((i140 ^ 80) + ((i140 & 80) << 1)) ^ (-1));
                                                    f52348a = i141 % 128;
                                                    int i142 = i141 % 2;
                                                    boolean zAreEqual = Intrinsics.areEqual(str8, str9);
                                                    int i143 = f52349b;
                                                    int i144 = i143 ^ 17;
                                                    int i145 = (((i143 & 17) | i144) << 1) - i144;
                                                    f52348a = i145 % 128;
                                                    int i146 = i145 % 2;
                                                    return Boolean.valueOf(zAreEqual);
                                                }
                                                if (!(!l.startsWith$default(str9, "*.", false, 2, null))) {
                                                    int i147 = (-2) - ((f52348a + 74) ^ (-1));
                                                    f52349b = i147 % 128;
                                                    if (i147 % 2 != 0 ? StringsKt__StringsKt.indexOf$default((CharSequence) str9, '*', 1, false, 4, (Object) null) != -1 : StringsKt__StringsKt.indexOf$default((CharSequence) str9, 'P', 0, true, 2, (Object) null) != -1) {
                                                        int i148 = f52349b;
                                                        int i149 = (i148 | 15) << 1;
                                                        int i150 = -(((~i148) & 15) | (i148 & (-16)));
                                                        i16 = (i149 ^ i150) + ((i150 & i149) << 1);
                                                        f52348a = i16 % 128;
                                                        if (i16 % 2 != 0) {
                                                            throw null;
                                                        }
                                                    } else if (str8.length() < str9.length()) {
                                                        int i151 = f52349b;
                                                        int i152 = (i151 & 81) + (i151 | 81);
                                                        f52348a = i152 % 128;
                                                        int i153 = i152 % 2;
                                                        int i154 = (i151 & 71) + (i151 | 71);
                                                        f52348a = i154 % 128;
                                                        if (i154 % 2 != 0) {
                                                            throw null;
                                                        }
                                                    } else {
                                                        if (!Intrinsics.areEqual("*.", str9)) {
                                                            String strSubstring = str9.substring(1);
                                                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                                            if (!l.endsWith$default(str8, strSubstring, false, 2, null)) {
                                                                int i155 = f52349b;
                                                                int i156 = i155 & 59;
                                                                int i157 = ((i155 ^ 59) | i156) << 1;
                                                                int i158 = -((i155 | 59) & (~i156));
                                                                int i159 = ((i157 | i158) << 1) - (i158 ^ i157);
                                                                f52348a = i159 % 128;
                                                                return Boolean.valueOf(i159 % 2 != 0);
                                                            }
                                                            int length = str8.length();
                                                            int i160 = -strSubstring.length();
                                                            int i161 = (length ^ i160) + ((i160 & length) << 1);
                                                            if (i161 > 0) {
                                                                int i162 = f52348a;
                                                                int i163 = (i162 & 81) + (i162 | 81);
                                                                f52349b = i163 % 128;
                                                                if (i163 % 2 != 0 ? StringsKt__StringsKt.lastIndexOf$default((CharSequence) str8, '.', i161 - 1, false, 4, (Object) null) != -1 : StringsKt__StringsKt.lastIndexOf$default((CharSequence) str8, RootService.OPEN_BRACKET, i161, true, 3, (Object) null) != -1) {
                                                                    int i164 = f52349b;
                                                                    int i165 = i164 & 85;
                                                                    int i166 = (i164 ^ 85) | i165;
                                                                    int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
                                                                    f52348a = i167 % 128;
                                                                    if (i167 % 2 != 0) {
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                            int i168 = f52348a;
                                                            int i169 = (i168 & 31) + (i168 | 31);
                                                            f52349b = i169 % 128;
                                                            int i170 = i169 % 2;
                                                            return Boolean.TRUE;
                                                        }
                                                        int i171 = f52349b;
                                                        int i172 = (i171 ^ 74) + ((i171 & 74) << 1);
                                                        int i173 = (i172 ^ (-1)) + (i172 << 1);
                                                        f52348a = i173 % 128;
                                                        int i174 = i173 % 2;
                                                        int i175 = (((i171 | 4) << 1) - (i171 ^ 4)) - 1;
                                                        f52348a = i175 % 128;
                                                        if (i175 % 2 != 0) {
                                                            i14 = 98;
                                                            int i176 = i14 / 0;
                                                            return Boolean.FALSE;
                                                        }
                                                    }
                                                } else {
                                                    int i1410 = f52349b;
                                                    int i1411 = (i1410 | 15) << 1;
                                                    int i1510 = -(((~i1410) & 15) | (i1410 & (-16)));
                                                    i16 = (i1411 ^ i1510) + ((i1510 & i1411) << 1);
                                                    f52348a = i16 % 128;
                                                    if (i16 % 2 != 0) {
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i15 = f52349b + 109;
                                    f52348a = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        throw null;
                                    }
                                } else {
                                    int i1110 = f52349b;
                                    int i1111 = i1110 & 57;
                                    int i1112 = i1111 + ((i1110 ^ 57) | i1111);
                                    f52348a = i1112 % 128;
                                    int i1113 = i1112 % 2;
                                    i15 = f52349b + 109;
                                    f52348a = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        throw null;
                                    }
                                }
                                return Boolean.FALSE;
                            }
                        }
                    }
                    int i177 = f52349b;
                    i13 = (i177 & 27) + (i177 | 27);
                    f52348a = i13 % 128;
                    if (i13 % 2 != 0) {
                        i14 = 19;
                        int i178 = i14 / 0;
                        return Boolean.FALSE;
                    }
                    return Boolean.FALSE;
                }
                int i179 = f52349b;
                int i180 = i179 | 37;
                int i181 = i180 << 1;
                int i182 = -((~(i179 & 37)) & i180);
                int i183 = (i181 ^ i182) + ((i182 & i181) << 1);
                f52348a = i183 % 128;
                int i184 = i183 % 2;
                int i1710 = f52349b;
                i13 = (i1710 & 27) + (i1710 | 27);
                f52348a = i13 % 128;
                if (i13 % 2 != 0) {
                    i14 = 19;
                    int i1711 = i14 / 0;
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
            case 8:
                String str10 = (String) objArr[0];
                int i185 = f52348a;
                int i186 = ((i185 | 101) << 1) - (i185 ^ 101);
                f52349b = i186 % 128;
                if (i186 % 2 == 0) {
                    ((Boolean) setDividerPadding(new Object[]{str10}, -1911103038, 1911103041, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (!((Boolean) setDividerPadding(new Object[]{str10}, -1911103038, 1911103041, (int) System.currentTimeMillis())).booleanValue()) {
                    int i187 = f52349b + 31;
                    f52348a = i187 % 128;
                    if (i187 % 2 == 0) {
                        return str10;
                    }
                    throw null;
                }
                Locale locale = Locale.US;
                String strD = a.d(locale, "", str10, locale, "");
                int i188 = f52349b + 71;
                f52348a = i188 % 128;
                if (i188 % 2 == 0) {
                    return strD;
                }
                throw null;
            default:
                X509Certificate x509Certificate5 = (X509Certificate) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i189 = (-2) - ((f52348a + 82) ^ (-1));
                f52349b = i189 % 128;
                try {
                    if (i189 % 2 == 0) {
                        x509Certificate5.getSubjectAlternativeNames();
                        throw null;
                    }
                    Collection<List<?>> subjectAlternativeNames = x509Certificate5.getSubjectAlternativeNames();
                    if (subjectAlternativeNames == null) {
                        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        int i190 = f52348a;
                        int i191 = ((i190 ^ 46) + ((i190 & 46) << 1)) - 1;
                        f52349b = i191 % 128;
                        if (i191 % 2 != 0) {
                            return listEmptyList;
                        }
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i192 = f52348a;
                    int i193 = (i192 & 99) + (i192 | 99);
                    f52349b = i193 % 128;
                    int i194 = i193 % 2;
                    for (List<?> list3 : subjectAlternativeNames) {
                        int i195 = f52349b;
                        int i196 = ((((i195 ^ 97) | (i195 & 97)) << 1) - (~(-(((~i195) & 97) | (i195 & (-98)))))) - 1;
                        f52348a = i196 % 128;
                        int i197 = i196 % 2;
                        if (list3 != null) {
                            int i198 = f52349b;
                            int i199 = ((i198 ^ 87) - (~((i198 & 87) << 1))) - 1;
                            f52348a = i199 % 128;
                            if (i199 % 2 != 0) {
                                if (list3.size() >= 4) {
                                    int i200 = f52348a;
                                    int i201 = i200 ^ 23;
                                    int i202 = ((i200 & 23) | i201) << 1;
                                    int i203 = -i201;
                                    i17 = (i202 ^ i203) + ((i202 & i203) << 1);
                                    f52349b = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        if (Intrinsics.areEqual(list3.get(1), Integer.valueOf(iIntValue))) {
                                            obj = list3.get(1);
                                            if (obj == null) {
                                                int i204 = f52348a;
                                                i18 = ((i204 | 79) << 1) - (i204 ^ 79);
                                                f52349b = i18 % 128;
                                                if (i18 % 2 != 0) {
                                                    throw null;
                                                }
                                            } else {
                                                arrayList.add((String) obj);
                                                int i205 = f52348a + 117;
                                                f52349b = i205 % 128;
                                                int i206 = i205 % 2;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else if (Intrinsics.areEqual(list3.get(0), Integer.valueOf(iIntValue))) {
                                        obj = list3.get(1);
                                        if (obj == null) {
                                            int i207 = f52348a;
                                            i18 = ((i207 | 79) << 1) - (i207 ^ 79);
                                            f52349b = i18 % 128;
                                            if (i18 % 2 != 0) {
                                                throw null;
                                            }
                                        } else {
                                            arrayList.add((String) obj);
                                            int i208 = f52348a + 117;
                                            f52349b = i208 % 128;
                                            int i209 = i208 % 2;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else if (list3.size() >= 2) {
                                int i2010 = f52348a;
                                int i2011 = i2010 ^ 23;
                                int i2012 = ((i2010 & 23) | i2011) << 1;
                                int i2013 = -i2011;
                                i17 = (i2012 ^ i2013) + ((i2012 & i2013) << 1);
                                f52349b = i17 % 128;
                                if (i17 % 2 == 0) {
                                    if (Intrinsics.areEqual(list3.get(1), Integer.valueOf(iIntValue))) {
                                        obj = list3.get(1);
                                        if (obj == null) {
                                            int i2014 = f52348a;
                                            i18 = ((i2014 | 79) << 1) - (i2014 ^ 79);
                                            f52349b = i18 % 128;
                                            if (i18 % 2 != 0) {
                                                throw null;
                                            }
                                        } else {
                                            arrayList.add((String) obj);
                                            int i2015 = f52348a + 117;
                                            f52349b = i2015 % 128;
                                            int i2016 = i2015 % 2;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else if (Intrinsics.areEqual(list3.get(0), Integer.valueOf(iIntValue))) {
                                    obj = list3.get(1);
                                    if (obj == null) {
                                        int i2017 = f52348a;
                                        i18 = ((i2017 | 79) << 1) - (i2017 ^ 79);
                                        f52349b = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            throw null;
                                        }
                                    } else {
                                        arrayList.add((String) obj);
                                        int i2018 = f52348a + 117;
                                        f52349b = i2018 % 128;
                                        int i2019 = i2018 % 2;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    int i210 = f52349b;
                    int i211 = ((i210 ^ 36) + ((i210 & 36) << 1)) - 1;
                    f52348a = i211 % 128;
                    if (i211 % 2 == 0) {
                        return arrayList;
                    }
                    throw null;
                } catch (CertificateParsingException unused) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
        }
    }

    @NotNull
    public static List<String> setOnFocusChangeListener(@NotNull X509Certificate p4) {
        return (List) setDividerPadding(new Object[]{p4}, -2138081287, 2138081293, (int) System.currentTimeMillis());
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull String p4, @NotNull X509Certificate p10) {
        return ((Boolean) setDividerPadding(new Object[]{this, p4, p10}, -1687078922, 1687078927, System.identityHashCode(this))).booleanValue();
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(@NotNull String p4, @NotNull SSLSession p10) {
        return ((Boolean) setDividerPadding(new Object[]{this, p4, p10}, -2094519060, 2094519061, System.identityHashCode(this))).booleanValue();
    }
}
