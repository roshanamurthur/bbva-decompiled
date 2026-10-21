package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class zf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f62332e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f62333f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<xu> f62334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f62336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62337d;

    public zf(@NotNull List<xu> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f62334a = list;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0070  */
    /* JADX WARN: Code duplicated, block: B:15:0x0074  */
    /* JADX WARN: Code duplicated, block: B:17:0x007f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x024f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0254  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws UnknownServiceException {
        int i13;
        xu xuVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = ~i10;
        int i20 = ~i11;
        int i21 = i19 | i20;
        int i22 = ~i21;
        int i23 = ~i12;
        int i24 = ((i22 | (~(i19 | i23)) | (~(i20 | i23))) * (-1136)) + (i11 * 569) + (i10 * 569);
        int i25 = i10 | i23;
        int i26 = (((~i25) | (~(i11 | i23)) | (~(i21 | i12))) * 568) + (((~(i19 | i12)) | (~(i20 | i12)) | (~(i25 | i11))) * (-568)) + i24;
        xu xuVar2 = null;
        if (i26 == 1) {
            zf zfVar = (zf) objArr[0];
            SSLSocket sSLSocket = (SSLSocket) objArr[1];
            int i27 = f62332e;
            int i28 = i27 & 85;
            int i29 = -(-((i27 ^ 85) | i28));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            f62333f = i30 % 128;
            int i31 = i30 % 2;
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            int i32 = zfVar.f62335b;
            List<xu> list = zfVar.f62334a;
            int size = list.size();
            int i33 = f62332e;
            int i34 = i33 & 23;
            int i35 = i34 + ((i33 ^ 23) | i34);
            f62333f = i35 % 128;
            int i36 = i35 % 2;
            while (true) {
                if (i32 < size) {
                    int i37 = f62333f;
                    int i38 = ((i37 ^ 17) | (i37 & 17)) << 1;
                    int i39 = -(((~i37) & 17) | (i37 & (-18)));
                    int i40 = (i38 & i39) + (i39 | i38);
                    f62332e = i40 % 128;
                    if (i40 % 2 != 0) {
                        i13 = ((i32 & (-56)) | ((~i32) & 55)) + ((i32 & 55) << 1);
                        xuVar = list.get(i32);
                        if (!(!((Boolean) xu.setX(new Object[]{xuVar, sSLSocket}, 1573978703, -1573978703, System.identityHashCode(xuVar))).booleanValue())) {
                            xuVar2 = xuVar;
                            int i41 = f62333f;
                            int i42 = i41 & 59;
                            i14 = ((~i42) & (i41 | 59)) + (i42 << 1);
                            f62332e = i14 % 128;
                            if (i14 % 2 != 0) {
                                i15 = i32 >>> 1;
                            } else {
                                int i43 = i32 & 1;
                                i15 = (i43 - (~((i32 ^ 1) | i43))) - 1;
                            }
                            zfVar.f62335b = i15;
                            int i44 = i41 & 41;
                            int i45 = (i41 ^ 41) | i44;
                            int i46 = (i44 & i45) + (i45 | i44);
                            f62332e = i46 % 128;
                            int i47 = i46 % 2;
                        } else {
                            i32 = i13;
                        }
                    } else {
                        int i48 = i32 + 69;
                        int i49 = ((i48 | (-67)) << 1) - (i48 ^ (-67));
                        i13 = (i49 ^ (-1)) + (i49 << 1);
                        xuVar = list.get(i32);
                        if (!((Boolean) xu.setX(new Object[]{xuVar, sSLSocket}, 1573978703, -1573978703, System.identityHashCode(xuVar))).booleanValue()) {
                            i32 = i13;
                        } else {
                            xuVar2 = xuVar;
                            int i410 = f62333f;
                            int i411 = i410 & 59;
                            i14 = ((~i411) & (i410 | 59)) + (i411 << 1);
                            f62332e = i14 % 128;
                            if (i14 % 2 != 0) {
                                i15 = i32 >>> 1;
                            } else {
                                int i412 = i32 & 1;
                                i15 = (i412 - (~((i32 ^ 1) | i412))) - 1;
                            }
                            zfVar.f62335b = i15;
                            int i413 = i410 & 41;
                            int i414 = (i410 ^ 41) | i413;
                            int i415 = (i413 & i414) + (i414 | i413);
                            f62332e = i415 % 128;
                            int i416 = i415 % 2;
                        }
                    }
                }
                if (xuVar2 != null) {
                    zfVar.f62336c = ((Boolean) setDividerPadding(new Object[]{zfVar, sSLSocket}, -1919434534, 1919434536, System.identityHashCode(zfVar))).booleanValue();
                    xu.setX(new Object[]{xuVar2, sSLSocket, Boolean.valueOf(zfVar.f62337d)}, -512663162, 512663163, System.identityHashCode(xuVar2));
                    int i50 = f62332e;
                    int i51 = (i50 & 36) + (i50 | 36);
                    int i52 = (i51 ^ (-1)) + (i51 << 1);
                    f62333f = i52 % 128;
                    int i53 = i52 % 2;
                    return xuVar2;
                }
                StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
                sb2.append(zfVar.f62337d);
                sb2.append(", modes=");
                sb2.append(list);
                sb2.append(", supported protocols=");
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                Intrinsics.checkNotNull(enabledProtocols);
                String string = Arrays.toString(enabledProtocols);
                Intrinsics.checkNotNullExpressionValue(string, "");
                sb2.append(string);
                throw new UnknownServiceException(sb2.toString());
            }
        }
        if (i26 == 2) {
            zf zfVar2 = (zf) objArr[0];
            SSLSocket sSLSocket2 = (SSLSocket) objArr[1];
            int i54 = f62332e;
            int i55 = (((i54 | 28) << 1) - (i54 ^ 28)) - 1;
            f62333f = i55 % 128;
            if (i55 % 2 == 0) {
                int i56 = zfVar2.f62335b;
                zfVar2.f62334a.size();
                throw null;
            }
            int i57 = zfVar2.f62335b;
            List<xu> list2 = zfVar2.f62334a;
            int size2 = list2.size();
            int i58 = f62333f + 35;
            f62332e = i58 % 128;
            int i59 = i58 % 2;
            while (i57 < size2) {
                int i60 = f62332e;
                int i61 = i60 & 81;
                int i62 = i61 + ((i60 ^ 81) | i61);
                f62333f = i62 % 128;
                int i63 = i62 % 2;
                int i64 = (i57 ^ 1) + ((i57 & 1) << 1);
                xu xuVar3 = list2.get(i57);
                if (((Boolean) xu.setX(new Object[]{xuVar3, sSLSocket2}, 1573978703, -1573978703, System.identityHashCode(xuVar3))).booleanValue()) {
                    int i65 = f62332e;
                    int i66 = i65 & 85;
                    int i67 = (i65 ^ 85) | i66;
                    int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                    f62333f = i68 % 128;
                    return Boolean.valueOf(i68 % 2 != 0);
                }
                i57 = i64;
            }
            int i69 = f62333f;
            int i70 = i69 & 85;
            int i71 = (i70 - (~((i69 ^ 85) | i70))) - 1;
            f62332e = i71 % 128;
            int i72 = i71 % 2;
            return Boolean.FALSE;
        }
        zf zfVar3 = (zf) objArr[0];
        IOException iOException = (IOException) objArr[1];
        int i73 = f62333f;
        int i74 = i73 & 43;
        int i75 = (i73 ^ 43) | i74;
        int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
        f62332e = i76 % 128;
        if (i76 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iOException, "");
            zfVar3.f62337d = false;
            if (zfVar3.f62336c) {
                if (!(iOException instanceof ProtocolException)) {
                    i16 = f62332e;
                    i17 = i16 + 99;
                    f62333f = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i77 = 98 / 0;
                        if (!(iOException instanceof InterruptedIOException)) {
                            int i78 = i16 & 125;
                            int i79 = (~i78) & (i16 | 125);
                            int i80 = i78 << 1;
                            int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                            f62333f = i81 % 128;
                            int i82 = i81 % 2;
                            if (!(iOException instanceof SSLHandshakeException)) {
                                int i83 = ((((i16 ^ 115) | (i16 & 115)) << 1) - (~(-(((~i16) & 115) | (i16 & (-116)))))) - 1;
                                f62333f = i83 % 128;
                                int i84 = i83 % 2;
                                if (!(iOException.getCause() instanceof CertificateException)) {
                                    if (!(iOException instanceof SSLPeerUnverifiedException)) {
                                        int i85 = f62332e;
                                        int i86 = ((i85 ^ 21) | (i85 & 21)) << 1;
                                        int i87 = -(((~i85) & 21) | (i85 & (-22)));
                                        int i88 = (i86 & i87) + (i87 | i86);
                                        i18 = i88 % 128;
                                        f62333f = i18;
                                        int i89 = i88 % 2;
                                        if (iOException instanceof SSLException) {
                                            int i90 = i18 + 103;
                                            f62332e = i90 % 128;
                                            int i91 = i90 % 2;
                                            return Boolean.TRUE;
                                        }
                                    }
                                }
                            } else if (!(iOException instanceof SSLPeerUnverifiedException)) {
                                int i810 = f62332e;
                                int i811 = ((i810 ^ 21) | (i810 & 21)) << 1;
                                int i812 = -(((~i810) & 21) | (i810 & (-22)));
                                int i813 = (i811 & i812) + (i812 | i811);
                                i18 = i813 % 128;
                                f62333f = i18;
                                int i814 = i813 % 2;
                                if (iOException instanceof SSLException) {
                                    int i92 = i18 + 103;
                                    f62332e = i92 % 128;
                                    int i93 = i92 % 2;
                                    return Boolean.TRUE;
                                }
                            }
                        }
                    } else if (!(iOException instanceof InterruptedIOException)) {
                        int i710 = i16 & 125;
                        int i711 = (~i710) & (i16 | 125);
                        int i815 = i710 << 1;
                        int i816 = ((i711 | i815) << 1) - (i815 ^ i711);
                        f62333f = i816 % 128;
                        int i817 = i816 % 2;
                        if (!(iOException instanceof SSLHandshakeException)) {
                            int i818 = ((((i16 ^ 115) | (i16 & 115)) << 1) - (~(-(((~i16) & 115) | (i16 & (-116)))))) - 1;
                            f62333f = i818 % 128;
                            int i819 = i818 % 2;
                            if (!(iOException.getCause() instanceof CertificateException)) {
                                if (!(iOException instanceof SSLPeerUnverifiedException)) {
                                    int i8110 = f62332e;
                                    int i8111 = ((i8110 ^ 21) | (i8110 & 21)) << 1;
                                    int i8112 = -(((~i8110) & 21) | (i8110 & (-22)));
                                    int i8113 = (i8111 & i8112) + (i8112 | i8111);
                                    i18 = i8113 % 128;
                                    f62333f = i18;
                                    int i8114 = i8113 % 2;
                                    if (iOException instanceof SSLException) {
                                        int i94 = i18 + 103;
                                        f62332e = i94 % 128;
                                        int i95 = i94 % 2;
                                        return Boolean.TRUE;
                                    }
                                }
                            }
                        } else if (!(iOException instanceof SSLPeerUnverifiedException)) {
                            int i8115 = f62332e;
                            int i8116 = ((i8115 ^ 21) | (i8115 & 21)) << 1;
                            int i8117 = -(((~i8115) & 21) | (i8115 & (-22)));
                            int i8118 = (i8116 & i8117) + (i8117 | i8116);
                            i18 = i8118 % 128;
                            f62333f = i18;
                            int i8119 = i8118 % 2;
                            if (iOException instanceof SSLException) {
                                int i96 = i18 + 103;
                                f62332e = i96 % 128;
                                int i97 = i96 % 2;
                                return Boolean.TRUE;
                            }
                        }
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(iOException, "");
            zfVar3.f62337d = true;
            if (!(!zfVar3.f62336c)) {
                if (!(iOException instanceof ProtocolException)) {
                    i16 = f62332e;
                    i17 = i16 + 99;
                    f62333f = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i712 = 98 / 0;
                        if (!(iOException instanceof InterruptedIOException)) {
                            int i713 = i16 & 125;
                            int i714 = (~i713) & (i16 | 125);
                            int i8120 = i713 << 1;
                            int i8121 = ((i714 | i8120) << 1) - (i8120 ^ i714);
                            f62333f = i8121 % 128;
                            int i8122 = i8121 % 2;
                            if (!(iOException instanceof SSLHandshakeException)) {
                                int i8123 = ((((i16 ^ 115) | (i16 & 115)) << 1) - (~(-(((~i16) & 115) | (i16 & (-116)))))) - 1;
                                f62333f = i8123 % 128;
                                int i8124 = i8123 % 2;
                                if (!(iOException.getCause() instanceof CertificateException)) {
                                    if (!(iOException instanceof SSLPeerUnverifiedException)) {
                                        int i81110 = f62332e;
                                        int i81111 = ((i81110 ^ 21) | (i81110 & 21)) << 1;
                                        int i81112 = -(((~i81110) & 21) | (i81110 & (-22)));
                                        int i81113 = (i81111 & i81112) + (i81112 | i81111);
                                        i18 = i81113 % 128;
                                        f62333f = i18;
                                        int i81114 = i81113 % 2;
                                        if (iOException instanceof SSLException) {
                                            int i98 = i18 + 103;
                                            f62332e = i98 % 128;
                                            int i99 = i98 % 2;
                                            return Boolean.TRUE;
                                        }
                                    }
                                }
                            } else if (!(iOException instanceof SSLPeerUnverifiedException)) {
                                int i81115 = f62332e;
                                int i81116 = ((i81115 ^ 21) | (i81115 & 21)) << 1;
                                int i81117 = -(((~i81115) & 21) | (i81115 & (-22)));
                                int i81118 = (i81116 & i81117) + (i81117 | i81116);
                                i18 = i81118 % 128;
                                f62333f = i18;
                                int i81119 = i81118 % 2;
                                if (iOException instanceof SSLException) {
                                    int i910 = i18 + 103;
                                    f62332e = i910 % 128;
                                    int i911 = i910 % 2;
                                    return Boolean.TRUE;
                                }
                            }
                        }
                    } else if (!(iOException instanceof InterruptedIOException)) {
                        int i715 = i16 & 125;
                        int i716 = (~i715) & (i16 | 125);
                        int i8125 = i715 << 1;
                        int i8126 = ((i716 | i8125) << 1) - (i8125 ^ i716);
                        f62333f = i8126 % 128;
                        int i8127 = i8126 % 2;
                        if (!(iOException instanceof SSLHandshakeException)) {
                            int i8128 = ((((i16 ^ 115) | (i16 & 115)) << 1) - (~(-(((~i16) & 115) | (i16 & (-116)))))) - 1;
                            f62333f = i8128 % 128;
                            int i8129 = i8128 % 2;
                            if (!(iOException.getCause() instanceof CertificateException)) {
                                if (!(iOException instanceof SSLPeerUnverifiedException)) {
                                    int i811110 = f62332e;
                                    int i811111 = ((i811110 ^ 21) | (i811110 & 21)) << 1;
                                    int i811112 = -(((~i811110) & 21) | (i811110 & (-22)));
                                    int i811113 = (i811111 & i811112) + (i811112 | i811111);
                                    i18 = i811113 % 128;
                                    f62333f = i18;
                                    int i811114 = i811113 % 2;
                                    if (iOException instanceof SSLException) {
                                        int i912 = i18 + 103;
                                        f62332e = i912 % 128;
                                        int i913 = i912 % 2;
                                        return Boolean.TRUE;
                                    }
                                }
                            }
                        } else if (!(iOException instanceof SSLPeerUnverifiedException)) {
                            int i811115 = f62332e;
                            int i811116 = ((i811115 ^ 21) | (i811115 & 21)) << 1;
                            int i811117 = -(((~i811115) & 21) | (i811115 & (-22)));
                            int i811118 = (i811116 & i811117) + (i811117 | i811116);
                            i18 = i811118 % 128;
                            f62333f = i18;
                            int i811119 = i811118 % 2;
                            if (iOException instanceof SSLException) {
                                int i914 = i18 + 103;
                                f62332e = i914 % 128;
                                int i915 = i914 % 2;
                                return Boolean.TRUE;
                            }
                        }
                    }
                }
            }
        }
        int i100 = f62333f;
        int i101 = i100 & 15;
        int i102 = ((i100 ^ 15) | i101) << 1;
        int i103 = -((i100 | 15) & (~i101));
        int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
        f62332e = i104 % 128;
        int i105 = i104 % 2;
        return Boolean.FALSE;
    }

    public final boolean setOnFocusChangeListener(@NotNull IOException iOException) {
        return ((Boolean) setDividerPadding(new Object[]{this, iOException}, -472766345, 472766345, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final xu setX(@NotNull SSLSocket sSLSocket) throws IOException {
        return (xu) setDividerPadding(new Object[]{this, sSLSocket}, -92737339, 92737340, System.identityHashCode(this));
    }
}
