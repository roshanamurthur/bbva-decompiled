package com.mypinpad.tsdk.isolation;

import androidx.webkit.ProxyConfig;
import c2.b;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class xh {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f61833l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final xz f61834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SocketFactory f61835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final SSLSocketFactory f61836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final HostnameVerifier f61837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final xn f61838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final xo f61839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Proxy f61840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ProxySelector f61841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final yg f61842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<yi> f61843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<xu> f61844k;

    public xh(@NotNull String str, int i10, @NotNull xz xzVar, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable xn xnVar, @NotNull xo xoVar, @Nullable Proxy proxy, @NotNull List<? extends yi> list, @NotNull List<xu> list2, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(xzVar, "");
        Intrinsics.checkNotNullParameter(socketFactory, "");
        Intrinsics.checkNotNullParameter(xoVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(proxySelector, "");
        this.f61834a = xzVar;
        this.f61835b = socketFactory;
        this.f61836c = sSLSocketFactory;
        this.f61837d = hostnameVerifier;
        this.f61838e = xnVar;
        this.f61839f = xoVar;
        this.f61840g = proxy;
        this.f61841h = proxySelector;
        yg.setDividerPadding setdividerpadding = new yg.setDividerPadding();
        yg.setDividerPadding setdividerpadding2 = (yg.setDividerPadding) yg.setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, sSLSocketFactory != null ? ProxyConfig.MATCH_HTTPS : ProxyConfig.MATCH_HTTP}, 173084554, -173084530, System.identityHashCode(setdividerpadding));
        yg.setDividerPadding setdividerpadding3 = (yg.setDividerPadding) yg.setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{(yg.setDividerPadding) yg.setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding2, str}, -1828450400, 1828450425, System.identityHashCode(setdividerpadding2)), Integer.valueOf(i10)}, 802490738, -802490736, i10);
        this.f61842i = (yg) yg.setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding3}, -761647430, 761647459, System.identityHashCode(setdividerpadding3));
        this.f61843j = (List) yt.setY(new Object[]{list}, 1581148594, -1581148571, (int) System.currentTimeMillis());
        this.f61844k = (List) yt.setY(new Object[]{list2}, 1581148594, -1581148571, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:28:0x0112  */
    /* JADX WARN: Code duplicated, block: B:31:0x0119  */
    /* JADX WARN: Code duplicated, block: B:33:0x015e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0175  */
    public static /* synthetic */ Boolean a(Object[] objArr) {
        int i10;
        xn xnVar;
        xn xnVar2;
        int iIntValue;
        yg ygVar;
        xh xhVar = (xh) objArr[0];
        xh xhVar2 = (xh) objArr[1];
        int i11 = f61833l;
        int i12 = (((i11 ^ 123) | (i11 & 123)) << 1) - (((~i11) & 123) | (i11 & (-124)));
        m = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(xhVar2, "");
        if (Intrinsics.areEqual(xhVar.f61834a, xhVar2.f61834a)) {
            int i14 = m;
            int i15 = ((((i14 ^ 43) | (i14 & 43)) << 1) - (~(-(((~i14) & 43) | (i14 & (-44)))))) - 1;
            f61833l = i15 % 128;
            int i16 = i15 % 2;
            if (Intrinsics.areEqual(xhVar.f61839f, xhVar2.f61839f)) {
                int i17 = m;
                int i18 = (((i17 ^ 45) | (i17 & 45)) << 1) - (((~i17) & 45) | (i17 & (-46)));
                f61833l = i18 % 128;
                int i19 = i18 % 2;
                List<yi> list = xhVar.f61843j;
                List<yi> list2 = xhVar2.f61843j;
                if (i19 != 0) {
                    Intrinsics.areEqual(list, list2);
                    throw null;
                }
                if (Intrinsics.areEqual(list, list2) && !(!Intrinsics.areEqual(xhVar.f61844k, xhVar2.f61844k))) {
                    int i20 = m;
                    int i21 = ((i20 | 119) << 1) - (i20 ^ 119);
                    f61833l = i21 % 128;
                    int i22 = i21 % 2;
                    ProxySelector proxySelector = xhVar.f61841h;
                    ProxySelector proxySelector2 = xhVar2.f61841h;
                    if (i22 != 0) {
                        int i23 = 8 / 0;
                        if (Intrinsics.areEqual(proxySelector, proxySelector2)) {
                            int i24 = m;
                            int i25 = i24 ^ 17;
                            int i26 = ((((i24 & 17) | i25) << 1) - (~(-i25))) - 1;
                            f61833l = i26 % 128;
                            int i27 = i26 % 2;
                            if (Intrinsics.areEqual(xhVar.f61840g, xhVar2.f61840g)) {
                                int i28 = m;
                                int i29 = i28 & 9;
                                int i30 = ((i28 | 9) & (~i29)) + (i29 << 1);
                                f61833l = i30 % 128;
                                int i31 = i30 % 2;
                                if (Intrinsics.areEqual(xhVar.f61836c, xhVar2.f61836c)) {
                                    int i32 = m;
                                    int i33 = ((i32 & 76) + (i32 | 76)) - 1;
                                    f61833l = i33 % 128;
                                    int i34 = i33 % 2;
                                    if (Intrinsics.areEqual(xhVar.f61837d, xhVar2.f61837d)) {
                                        int i35 = f61833l;
                                        int i36 = i35 & 89;
                                        int i37 = ((i35 ^ 89) | i36) << 1;
                                        int i38 = -((i35 | 89) & (~i36));
                                        int i39 = (i37 & i38) + (i38 | i37);
                                        m = i39 % 128;
                                        i10 = i39 % 2;
                                        xnVar = xhVar.f61838e;
                                        xnVar2 = xhVar2.f61838e;
                                        if (i10 != 0) {
                                            Intrinsics.areEqual(xnVar, xnVar2);
                                            throw null;
                                        }
                                        if (Intrinsics.areEqual(xnVar, xnVar2)) {
                                            int i40 = m;
                                            int i41 = (i40 & (-22)) | ((~i40) & 21);
                                            int i42 = (i40 & 21) << 1;
                                            int i43 = (i41 & i42) + (i42 | i41);
                                            f61833l = i43 % 128;
                                            int i44 = i43 % 2;
                                            yg ygVar2 = xhVar.f61842i;
                                            iIntValue = ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue();
                                            ygVar = xhVar2.f61842i;
                                            if (iIntValue == ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar}, -2100304715, 2100304729, System.identityHashCode(ygVar))).intValue()) {
                                                int i45 = f61833l;
                                                int i46 = i45 ^ 105;
                                                int i47 = ((i45 & 105) | i46) << 1;
                                                int i48 = -i46;
                                                int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                                                m = i49 % 128;
                                                int i50 = i49 % 2;
                                                return Boolean.TRUE;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!(!Intrinsics.areEqual(proxySelector, proxySelector2))) {
                        int i210 = m;
                        int i211 = i210 ^ 17;
                        int i212 = ((((i210 & 17) | i211) << 1) - (~(-i211))) - 1;
                        f61833l = i212 % 128;
                        int i213 = i212 % 2;
                        if (Intrinsics.areEqual(xhVar.f61840g, xhVar2.f61840g)) {
                            int i214 = m;
                            int i215 = i214 & 9;
                            int i310 = ((i214 | 9) & (~i215)) + (i215 << 1);
                            f61833l = i310 % 128;
                            int i311 = i310 % 2;
                            if (Intrinsics.areEqual(xhVar.f61836c, xhVar2.f61836c)) {
                                int i312 = m;
                                int i313 = ((i312 & 76) + (i312 | 76)) - 1;
                                f61833l = i313 % 128;
                                int i314 = i313 % 2;
                                if (Intrinsics.areEqual(xhVar.f61837d, xhVar2.f61837d)) {
                                    int i315 = f61833l;
                                    int i316 = i315 & 89;
                                    int i317 = ((i315 ^ 89) | i316) << 1;
                                    int i318 = -((i315 | 89) & (~i316));
                                    int i319 = (i317 & i318) + (i318 | i317);
                                    m = i319 % 128;
                                    i10 = i319 % 2;
                                    xnVar = xhVar.f61838e;
                                    xnVar2 = xhVar2.f61838e;
                                    if (i10 != 0) {
                                        Intrinsics.areEqual(xnVar, xnVar2);
                                        throw null;
                                    }
                                    if (Intrinsics.areEqual(xnVar, xnVar2)) {
                                        int i410 = m;
                                        int i411 = (i410 & (-22)) | ((~i410) & 21);
                                        int i412 = (i410 & 21) << 1;
                                        int i413 = (i411 & i412) + (i412 | i411);
                                        f61833l = i413 % 128;
                                        int i414 = i413 % 2;
                                        yg ygVar3 = xhVar.f61842i;
                                        iIntValue = ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar3}, -2100304715, 2100304729, System.identityHashCode(ygVar3))).intValue();
                                        ygVar = xhVar2.f61842i;
                                        if (iIntValue == ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar}, -2100304715, 2100304729, System.identityHashCode(ygVar))).intValue()) {
                                            int i415 = f61833l;
                                            int i416 = i415 ^ 105;
                                            int i417 = ((i415 & 105) | i416) << 1;
                                            int i418 = -i416;
                                            int i419 = (i417 ^ i418) + ((i417 & i418) << 1);
                                            m = i419 % 128;
                                            int i51 = i419 % 2;
                                            return Boolean.TRUE;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i52 = f61833l;
        int i53 = (i52 & 81) + (i52 | 81);
        m = i53 % 128;
        if (i53 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0119  */
    /* JADX WARN: Code duplicated, block: B:26:0x012f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0147  */
    /* JADX WARN: Code duplicated, block: B:30:0x0152  */
    /* JADX WARN: Code duplicated, block: B:31:0x0159  */
    /* JADX WARN: Code duplicated, block: B:32:0x015d  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        String strStringPlus;
        int i13;
        int i14;
        int i15 = ~i11;
        int i16 = ~i12;
        switch ((((~(i10 | i12)) | (~((~i10) | i16)) | (~(i11 | i12))) * 831) + ((~(i15 | i10 | i12)) * (-1662)) + (((~(i15 | i16)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830))) {
            case 1:
                xh xhVar = (xh) objArr[0];
                int i17 = f61833l + 19;
                int i18 = i17 % 128;
                m = i18;
                int i19 = i17 % 2;
                HostnameVerifier hostnameVerifier = xhVar.f61837d;
                if (i19 == 0) {
                    throw null;
                }
                int i20 = i18 & 23;
                int i21 = -(-((i18 ^ 23) | i20));
                int i22 = (i20 & i21) + (i20 | i21);
                f61833l = i22 % 128;
                int i23 = i22 % 2;
                return hostnameVerifier;
            case 2:
                return a(objArr);
            case 3:
                xh xhVar2 = (xh) objArr[0];
                int i24 = m;
                int i25 = ~i24;
                int i26 = (((i24 | 31) << 1) - (~(-((31 & i25) | (i24 & (-32)))))) - 1;
                f61833l = i26 % 128;
                int i27 = i26 % 2;
                xz xzVar = xhVar2.f61834a;
                int i28 = (i24 & (-112)) | (i25 & 111);
                int i29 = -(-((i24 & 111) << 1));
                int i30 = (i28 & i29) + (i28 | i29);
                f61833l = i30 % 128;
                int i31 = i30 % 2;
                return xzVar;
            case 4:
                xh xhVar3 = (xh) objArr[0];
                int i32 = f61833l;
                int i33 = i32 & 107;
                int i34 = i33 + ((i32 ^ 107) | i33);
                m = i34 % 128;
                int i35 = i34 % 2;
                xn xnVar = xhVar3.f61838e;
                int i36 = ((i32 | 24) << 1) - (i32 ^ 24);
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                m = i37 % 128;
                int i38 = i37 % 2;
                return xnVar;
            case 5:
                xh xhVar4 = (xh) objArr[0];
                int i39 = f61833l;
                int i40 = i39 & 31;
                int i41 = ((31 | i39) & (~i40)) + (i40 << 1);
                m = i41 % 128;
                int i42 = i41 % 2;
                SocketFactory socketFactory = xhVar4.f61835b;
                if (i42 != 0) {
                    return socketFactory;
                }
                throw null;
            case 6:
                xh xhVar5 = (xh) objArr[0];
                StringBuilder sb2 = new StringBuilder("Address{");
                yg ygVar = xhVar5.f61842i;
                sb2.append((String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)));
                sb2.append(AbstractJsonLexerKt.COLON);
                yg ygVar2 = xhVar5.f61842i;
                sb2.append(((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue());
                sb2.append(", ");
                Proxy proxy = xhVar5.f61840g;
                if (proxy != null) {
                    int i43 = f61833l;
                    int i44 = i43 & 71;
                    int i45 = -(-((i43 ^ 71) | i44));
                    int i46 = (i44 & i45) + (i45 | i44);
                    m = i46 % 128;
                    if (i46 % 2 == 0) {
                        strStringPlus = Intrinsics.stringPlus("proxy=", proxy);
                        int i47 = 40 / 0;
                    } else {
                        strStringPlus = Intrinsics.stringPlus("proxy=", proxy);
                    }
                    System.identityHashCode(xhVar5);
                    System.identityHashCode(xhVar5);
                } else {
                    strStringPlus = Intrinsics.stringPlus("proxySelector=", xhVar5.f61841h);
                    int i48 = f61833l;
                    int i49 = (i48 ^ 54) + ((i48 & 54) << 1);
                    int i50 = (i49 ^ (-1)) + (i49 << 1);
                    m = i50 % 128;
                    int i51 = i50 % 2;
                }
                sb2.append(strStringPlus);
                sb2.append(AbstractJsonLexerKt.END_OBJ);
                String string = sb2.toString();
                int i52 = f61833l;
                int i53 = i52 | 17;
                int i54 = i53 << 1;
                int i55 = -((~(i52 & 17)) & i53);
                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                m = i56 % 128;
                if (i56 % 2 != 0) {
                    return string;
                }
                throw null;
            case 7:
                xh xhVar6 = (xh) objArr[0];
                int i57 = f61833l;
                int i58 = i57 & 59;
                int i59 = (i58 - (~(-(-((i57 ^ 59) | i58))))) - 1;
                m = i59 % 128;
                int i60 = i59 % 2;
                Proxy proxy2 = xhVar6.f61840g;
                if (i60 != 0) {
                    return proxy2;
                }
                throw null;
            case 8:
                xh xhVar7 = (xh) objArr[0];
                int i61 = m;
                int i62 = (i61 & (-124)) | ((~i61) & 123);
                int i63 = (i61 & 123) << 1;
                int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                f61833l = i64 % 128;
                int i65 = i64 % 2;
                yg ygVar3 = xhVar7.f61842i;
                if (i65 == 0) {
                    return ygVar3;
                }
                int i66 = 28 / 0;
                return ygVar3;
            case 9:
                xh xhVar8 = (xh) objArr[0];
                int i67 = f61833l;
                int i68 = i67 & 47;
                int i69 = (((i67 | 47) & (~i68)) - (~(-(-(i68 << 1))))) - 1;
                m = i69 % 128;
                int i70 = i69 % 2;
                int iHashCode = xhVar8.f61842i.hashCode();
                int iIdentityHashCode = System.identityHashCode(xhVar8);
                int i71 = iHashCode * (-501);
                int i72 = i71 & 265081;
                int i73 = (i71 | 265081) & (~i72);
                int i74 = i72 << 1;
                int i75 = (i73 & i74) + (i73 | i74);
                int i76 = ~iIdentityHashCode;
                int i77 = (-528) & i76;
                int i78 = (iIdentityHashCode & 527) | i77;
                int i79 = (-528) & iIdentityHashCode;
                int i80 = ~((i78 & i79) | (i78 ^ i79));
                int i81 = iHashCode ^ 527;
                int i82 = iHashCode & 527;
                int i83 = (i81 & i82) | (i81 ^ i82);
                int i84 = ~i83;
                int i85 = (i80 | ((i83 | i84) & i84)) * (-502);
                int i86 = i75 & i85;
                int i87 = (i75 ^ i85) | i86;
                int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                int i89 = ((~i76) & (-528)) | (i76 & 527);
                int i90 = (i89 & i77) | (i89 ^ i77);
                int i91 = i90 & iHashCode;
                int i92 = (i90 | iHashCode) & (~i91);
                int i93 = ~iHashCode;
                int i94 = (i92 & i91) | (i92 ^ i91);
                int i95 = ~i94;
                int i96 = (((i94 | i95) & i95) * (-502)) + i88;
                int i97 = ~((i93 & iIdentityHashCode) | (i76 & i93) | ((~i93) & iIdentityHashCode));
                int i98 = -(-(((i97 & (-528)) | ((-528) ^ i97)) * 502));
                int i99 = ((i96 | i98) << 1) - (i98 ^ i96);
                int i100 = i99 * 31;
                int iHashCode2 = xhVar8.f61834a.hashCode();
                int iIdentityHashCode2 = System.identityHashCode(xhVar8);
                int i101 = iHashCode2 * 829;
                int i102 = i99 * 25699;
                int i103 = i101 & i102;
                int i104 = i103 + ((i102 ^ i101) | i103);
                int i105 = ~iHashCode2;
                int i106 = ~i100;
                int i107 = (i106 | i100) & i106;
                int i108 = i105 & i107;
                int i109 = ~(((i105 | i107) & (~i108)) | i108);
                int i110 = ~iIdentityHashCode2;
                int i111 = i110 & iHashCode2;
                int i112 = (~i111) & (i110 | iHashCode2);
                int i113 = (i111 & i112) | (i112 ^ i111);
                int i114 = (i106 & i113) | ((~i113) & i100);
                int i115 = i113 & i100;
                int i116 = (i114 & i115) | (i114 ^ i115);
                int i117 = ~i116;
                int i118 = (i116 | i117) & i117;
                int i119 = -(-(((i109 & i118) | (i109 ^ i118)) * (-828)));
                int i120 = ((~i119) & i104) | ((~i104) & i119);
                int i121 = (i119 & i104) << 1;
                int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
                int i123 = iHashCode2 & i100;
                int i124 = (iHashCode2 ^ i100) | i123;
                int i125 = (i122 - (~(-(~(((i124 & i110) | (i124 ^ i110)) * (-828)))))) - 1;
                int i126 = (i125 ^ (-1)) + (i125 << 1);
                int i127 = -(~((~(((i100 | iHashCode2) & (~i123)) | i123)) * 828));
                int i128 = (((i126 & i127) + (i127 | i126)) - 1) * 31;
                int i129 = -(~(-(-xhVar8.f61839f.hashCode())));
                int i130 = ((((i128 | i129) << 1) - (i129 ^ i128)) - 1) * 31;
                int i131 = -(-xhVar8.f61843j.hashCode());
                int i132 = i130 & i131;
                int i133 = ((i130 ^ i131) | i132) << 1;
                int i134 = -((i131 | i130) & (~i132));
                int i135 = ((i133 ^ i134) + ((i134 & i133) << 1)) * 31;
                int i136 = -(-xhVar8.f61844k.hashCode());
                int i137 = i135 & i136;
                int i138 = (((i136 | i135) & (~i137)) + (i137 << 1)) * 31;
                int iHashCode3 = xhVar8.f61841h.hashCode();
                int i139 = (i138 & iHashCode3) + (i138 | iHashCode3);
                int i140 = i139 * 31;
                int iHashCode4 = Objects.hashCode(xhVar8.f61840g);
                int iIdentityHashCode3 = System.identityHashCode(xhVar8);
                int i141 = iHashCode4 * 905;
                int i142 = i139 * (-27993);
                int i143 = i141 & i142;
                int i144 = -(-((i142 ^ i141) | i143));
                int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                int i146 = ~iHashCode4;
                int i147 = (i146 | iHashCode4) & i146;
                int i148 = ~iIdentityHashCode3;
                int i149 = (i147 & i148) | ((~i147) & iIdentityHashCode3);
                int i150 = i147 & iIdentityHashCode3;
                int i151 = ~((i150 & i149) | (i149 ^ i150));
                int i152 = ~((i148 ^ i140) | (i148 & i140));
                int i153 = ((~i152) & i151) | ((~i151) & i152);
                int i154 = i151 & i152;
                int i155 = ((i154 & i153) | (i153 ^ i154)) * (-1808);
                int i156 = (i145 | i155) << 1;
                int i157 = -(((~i145) & i155) | ((~i155) & i145));
                int i158 = ((i156 | i157) << 1) - (i157 ^ i156);
                int i159 = ~i140;
                int i160 = ((~i159) & i146) | ((~i146) & i159) | (i146 & i159);
                int i161 = ~((i160 & iIdentityHashCode3) | (i160 ^ iIdentityHashCode3));
                int i162 = i148 ^ iHashCode4;
                int i163 = i148 & iHashCode4;
                int i164 = (i162 & i163) | (i162 ^ i163);
                int i165 = ((~i164) & i140) | (i164 & i159);
                int i166 = i164 & i140;
                int i167 = ~((i165 & i166) | (i165 ^ i166));
                int i168 = ((~i167) & i161) | ((~i161) & i167);
                int i169 = i167 & i161;
                int i170 = (i158 - (~(((i169 & i168) | (i168 ^ i169)) * 904))) - 1;
                int i171 = i146 & i140;
                int i172 = (i140 | i146) & (~i171);
                int i173 = (i171 & i172) | (i172 ^ i171);
                int i174 = ~i173;
                int i175 = (i173 | i174) & i174;
                int i176 = ~((i159 ^ iIdentityHashCode3) | (iIdentityHashCode3 & i159));
                int i177 = (i175 & i176) | (i175 ^ i176);
                int i178 = (i148 & i146) | (iHashCode4 & (~i148));
                int i179 = (i178 & i163) | (i178 ^ i163);
                int i180 = ~i179;
                int i181 = (i179 | i180) & i180;
                int i182 = i177 & i181;
                int i183 = (i177 | i181) & (~i182);
                int i184 = ((i183 & i182) | (i183 ^ i182)) * 904;
                int i185 = i170 & i184;
                int i186 = i185 + ((i184 ^ i170) | i185);
                int i187 = i186 * 31;
                int iHashCode5 = Objects.hashCode(xhVar8.f61836c);
                int iIdentityHashCode4 = System.identityHashCode(xhVar8);
                int i188 = iHashCode5 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY;
                int i189 = -(-(i186 * (-16120)));
                int i190 = i188 | i189;
                int i191 = i190 << 1;
                int i192 = -((~(i189 & i188)) & i190);
                int i193 = (i191 ^ i192) + ((i192 & i191) << 1);
                int i194 = ~iIdentityHashCode4;
                int i195 = (i194 | iIdentityHashCode4) & i194;
                int i196 = ~i187;
                int i197 = ~i195;
                int i198 = (i195 & i196) | (i187 & i197);
                int i199 = i195 & i187;
                int i200 = ~((i198 & i199) | (i198 ^ i199));
                int i201 = (~i200) & iHashCode5;
                int i202 = ~iHashCode5;
                int i203 = i201 | (i200 & i202);
                int i204 = i200 & iHashCode5;
                int i205 = (i193 - (~(((i204 & i203) | (i203 ^ i204)) * (-1042)))) - 1;
                int i206 = i187 ^ iIdentityHashCode4;
                int i207 = i187 & iIdentityHashCode4;
                int i208 = -(-(((i206 & i207) | (i206 ^ i207)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i209 = i205 & i208;
                int i210 = ((i205 ^ i208) | i209) << 1;
                int i211 = -((i205 | i208) & (~i209));
                int i212 = ((i210 | i211) << 1) - (i211 ^ i210);
                int i213 = (i196 | i187) & i196;
                int i214 = i202 & i213;
                int i215 = (i213 | i202) & (~i214);
                int i216 = ~((i215 & i214) | (i215 ^ i214));
                int i217 = (i202 | iHashCode5) & i202;
                int i218 = (i194 & i217) | ((~i217) & iIdentityHashCode4);
                int i219 = iIdentityHashCode4 & i217;
                int i220 = ~((i218 & i219) | (i218 ^ i219));
                int i221 = ((~i220) & i216) | ((~i216) & i220);
                int i222 = i220 & i216;
                int i223 = (i222 & i221) | (i221 ^ i222);
                int i224 = (i195 & i202) | (iHashCode5 & i197);
                int i225 = iHashCode5 & i195;
                int i226 = (i225 & i224) | (i224 ^ i225);
                int i227 = i226 & i187;
                int i228 = (i187 | i226) & (~i227);
                int i229 = ~((i228 & i227) | (i228 ^ i227));
                int i230 = ((~i229) & i223) | ((~i223) & i229);
                int i231 = i229 & i223;
                int i232 = -(-(((i231 & i230) | (i230 ^ i231)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i233 = i212 & i232;
                int iE = b.e((i232 | i212) & (~i233), ~(-(-(i233 << 1))), 1, 31);
                int i234 = -(-Objects.hashCode(xhVar8.f61837d));
                int i235 = iE & i234;
                int i236 = ((iE ^ i234) | i235) << 1;
                int i237 = -((iE | i234) & (~i235));
                int i238 = ((i236 ^ i237) + ((i237 & i236) << 1)) * 31;
                int i239 = -(-Objects.hashCode(xhVar8.f61838e));
                int i240 = i238 & i239;
                int i241 = i240 + ((i239 ^ i238) | i240);
                int i242 = m;
                int i243 = i242 & 69;
                int i244 = -(-((i242 ^ 69) | i243));
                int i245 = (i243 ^ i244) + ((i244 & i243) << 1);
                f61833l = i245 % 128;
                if (i245 % 2 == 0) {
                    return Integer.valueOf(i241);
                }
                throw null;
            case 10:
                xh xhVar9 = (xh) objArr[0];
                Object obj = objArr[1];
                int i246 = m + 99;
                int i247 = i246 % 128;
                f61833l = i247;
                int i248 = i246 % 2;
                if (obj instanceof xh) {
                    int i249 = i247 + 123;
                    m = i249 % 128;
                    if (i249 % 2 == 0) {
                        int i250 = 46 / 0;
                        if (Intrinsics.areEqual(xhVar9.f61842i, ((xh) obj).f61842i)) {
                            int i251 = m;
                            i13 = (((i251 | 94) << 1) - (i251 ^ 94)) - 1;
                            f61833l = i13 % 128;
                            if (i13 % 2 == 0) {
                                ((Boolean) setOnFocusChangeListener(new Object[]{xhVar9, (xh) obj}, -1484794144, 1484794146, System.identityHashCode(xhVar9))).booleanValue();
                                throw null;
                            }
                            if (((Boolean) setOnFocusChangeListener(new Object[]{xhVar9, (xh) obj}, -1484794144, 1484794146, System.identityHashCode(xhVar9))).booleanValue()) {
                                i14 = m + 119;
                                f61833l = i14 % 128;
                                if (i14 % 2 != 0) {
                                    return Boolean.TRUE;
                                }
                                int i252 = 96 / 0;
                                return Boolean.TRUE;
                            }
                        }
                    } else if (Intrinsics.areEqual(xhVar9.f61842i, ((xh) obj).f61842i)) {
                        int i253 = m;
                        i13 = (((i253 | 94) << 1) - (i253 ^ 94)) - 1;
                        f61833l = i13 % 128;
                        if (i13 % 2 == 0) {
                            ((Boolean) setOnFocusChangeListener(new Object[]{xhVar9, (xh) obj}, -1484794144, 1484794146, System.identityHashCode(xhVar9))).booleanValue();
                            throw null;
                        }
                        if (((Boolean) setOnFocusChangeListener(new Object[]{xhVar9, (xh) obj}, -1484794144, 1484794146, System.identityHashCode(xhVar9))).booleanValue()) {
                            i14 = m + 119;
                            f61833l = i14 % 128;
                            if (i14 % 2 != 0) {
                                return Boolean.TRUE;
                            }
                            int i254 = 96 / 0;
                            return Boolean.TRUE;
                        }
                    }
                }
                int i255 = f61833l;
                int i256 = i255 ^ 61;
                int i257 = ((i255 & 61) | i256) << 1;
                int i258 = -i256;
                int i259 = (i257 ^ i258) + ((i257 & i258) << 1);
                m = i259 % 128;
                int i260 = i259 % 2;
                return Boolean.FALSE;
            case 11:
                xh xhVar10 = (xh) objArr[0];
                int i261 = m;
                int i262 = i261 & 43;
                int i263 = ((((i261 ^ 43) | i262) << 1) - (~(-((i261 | 43) & (~i262))))) - 1;
                f61833l = i263 % 128;
                int i264 = i263 % 2;
                List<xu> list = xhVar10.f61844k;
                if (i264 == 0) {
                    return list;
                }
                int i265 = 22 / 0;
                return list;
            case 12:
                xh xhVar11 = (xh) objArr[0];
                int i266 = f61833l;
                int i267 = (i266 | 21) << 1;
                int i268 = -(((~i266) & 21) | (i266 & (-22)));
                int i269 = (i267 & i268) + (i268 | i267);
                m = i269 % 128;
                int i270 = i269 % 2;
                SSLSocketFactory sSLSocketFactory = xhVar11.f61836c;
                if (i270 != 0) {
                    return sSLSocketFactory;
                }
                throw null;
            case 13:
                xh xhVar12 = (xh) objArr[0];
                int i271 = f61833l;
                int i272 = i271 + 91;
                m = i272 % 128;
                int i273 = i272 % 2;
                xo xoVar = xhVar12.f61839f;
                int i274 = i271 + 121;
                m = i274 % 128;
                int i275 = i274 % 2;
                return xoVar;
            case 14:
                xh xhVar13 = (xh) objArr[0];
                int i276 = m;
                int i277 = ((i276 ^ 63) | (i276 & 63)) << 1;
                int i278 = -((i276 & (-64)) | ((~i276) & 63));
                int i279 = ((i277 | i278) << 1) - (i277 ^ i278);
                f61833l = i279 % 128;
                int i280 = i279 % 2;
                ProxySelector proxySelector = xhVar13.f61841h;
                int i281 = i276 + 38;
                int i282 = (i281 ^ (-1)) + (i281 << 1);
                f61833l = i282 % 128;
                int i283 = i282 % 2;
                return proxySelector;
            default:
                xh xhVar14 = (xh) objArr[0];
                int i284 = m + 93;
                int i285 = i284 % 128;
                f61833l = i285;
                int i286 = i284 % 2;
                List<yi> list2 = xhVar14.f61843j;
                int i287 = (((i285 ^ 7) | (i285 & 7)) << 1) - (((~i285) & 7) | (i285 & (-8)));
                m = i287 % 128;
                int i288 = i287 % 2;
                return list2;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, obj}, -658212082, 658212092, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "proxy")
    @Nullable
    public final Proxy getNavBarTitleString() {
        return (Proxy) setOnFocusChangeListener(new Object[]{this}, 1929014817, -1929014810, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 850156451, -850156442, System.identityHashCode(this))).intValue();
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull xh xhVar) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, xhVar}, -1484794144, 1484794146, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "certificatePinner")
    @Nullable
    public final xn setDividerPadding() {
        return (xn) setOnFocusChangeListener(new Object[]{this}, 2008107448, -2008107444, System.identityHashCode(this));
    }

    @JvmName(name = "proxyAuthenticator")
    @NotNull
    public final xo setLayoutAnimation() {
        return (xo) setOnFocusChangeListener(new Object[]{this}, -305101271, 305101284, System.identityHashCode(this));
    }

    @JvmName(name = "url")
    @NotNull
    public final yg setNavigationOnClickListener() {
        return (yg) setOnFocusChangeListener(new Object[]{this}, -66216281, 66216289, System.identityHashCode(this));
    }

    @JvmName(name = "proxySelector")
    @NotNull
    public final ProxySelector setOnDragListener() {
        return (ProxySelector) setOnFocusChangeListener(new Object[]{this}, -38007021, 38007035, System.identityHashCode(this));
    }

    @JvmName(name = "protocols")
    @NotNull
    public final List<yi> setOnLongClickListener() {
        return (List) setOnFocusChangeListener(new Object[]{this}, -2119012112, 2119012112, System.identityHashCode(this));
    }

    @JvmName(name = "connectionSpecs")
    @NotNull
    public final List<xu> setTextAlignment() {
        return (List) setOnFocusChangeListener(new Object[]{this}, 1514970008, -1514969997, System.identityHashCode(this));
    }

    @JvmName(name = "dns")
    @NotNull
    public final xz setX() {
        return (xz) setOnFocusChangeListener(new Object[]{this}, 76592507, -76592504, System.identityHashCode(this));
    }

    @JvmName(name = "hostnameVerifier")
    @Nullable
    public final HostnameVerifier setY() {
        return (HostnameVerifier) setOnFocusChangeListener(new Object[]{this}, 1375506037, -1375506036, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -682333280, 682333286, System.identityHashCode(this));
    }

    @JvmName(name = "socketFactory")
    @NotNull
    public final SocketFactory setCompoundDrawableTintBlendMode() {
        return (SocketFactory) setOnFocusChangeListener(new Object[]{this}, -482771210, 482771215, System.identityHashCode(this));
    }

    @JvmName(name = "sslSocketFactory")
    @Nullable
    public final SSLSocketFactory setOnFocusChangeListener() {
        return (SSLSocketFactory) setOnFocusChangeListener(new Object[]{this}, -458389256, 458389268, System.identityHashCode(this));
    }
}
