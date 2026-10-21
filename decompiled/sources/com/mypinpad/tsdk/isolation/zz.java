package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/zz;", "Lcom/mypinpad/tsdk/i/yl;", "Lcom/mypinpad/tsdk/i/yl$setCompoundDrawableTintBlendMode;", "p0", "Lcom/mypinpad/tsdk/i/yr;", "setX", "(Lcom/mypinpad/tsdk/i/yl$setCompoundDrawableTintBlendMode;)Lcom/mypinpad/tsdk/i/yr;", "Lcom/mypinpad/tsdk/i/ym;", "<init>", "(Lcom/mypinpad/tsdk/i/ym;)V", "setDividerPadding_"}, k = 1, mv = {1, 6, 0})
public final class zz implements yl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62498b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62499c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ym f62500a;

    static {
        int i10 = f62498b;
        int i11 = i10 & 39;
        int i12 = (i11 - (~(-(-((i10 ^ 39) | i11))))) - 1;
        f62499c = i12 % 128;
        int i13 = i12 % 2;
    }

    public zz(@NotNull ym ymVar) {
        Intrinsics.checkNotNullParameter(ymVar, "");
        this.f62500a = ymVar;
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        IOException iOException = (IOException) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f62499c;
        int i11 = (i10 & 53) + (i10 | 53);
        int i12 = i11 % 128;
        f62498b = i12;
        int i13 = i11 % 2;
        if (!(!(iOException instanceof ProtocolException))) {
            int i14 = i10 & 1;
            int i15 = (i14 - (~(-(-((i10 ^ 1) | i14))))) - 1;
            f62498b = i15 % 128;
            int i16 = i15 % 2;
            return Boolean.FALSE;
        }
        if (!(!(iOException instanceof InterruptedIOException))) {
            int i17 = (i12 & 60) + (i12 | 60);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            f62499c = i18 % 128;
            int i19 = i18 % 2;
            if (iOException instanceof SocketTimeoutException) {
                int i20 = i12 + 27;
                f62499c = i20 % 128;
                int i21 = i20 % 2;
                if (!zBooleanValue) {
                    int i22 = ((i12 | 13) << 1) - ((i12 & (-14)) | ((~i12) & 13));
                    int i23 = i22 % 128;
                    f62499c = i23;
                    boolean z10 = i22 % 2 != 0;
                    int i24 = i23 ^ 37;
                    int i25 = ((i23 & 37) | i24) << 1;
                    int i26 = -i24;
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    f62498b = i27 % 128;
                    if (i27 % 2 == 0) {
                        return Boolean.valueOf(z10);
                    }
                    throw null;
                }
            }
            int i28 = (i12 & (-84)) | ((~i12) & 83);
            int i29 = (i12 & 83) << 1;
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            f62499c = i30 % 128;
            int i31 = i30 % 2;
            return Boolean.FALSE;
        }
        if (iOException instanceof SSLHandshakeException) {
            int i32 = (i10 ^ 75) + ((i10 & 75) << 1);
            f62498b = i32 % 128;
            int i33 = i32 % 2;
            if (!(!(iOException.getCause() instanceof CertificateException))) {
                int i34 = f62498b;
                int i35 = i34 & 83;
                int i36 = i35 + ((i34 ^ 83) | i35);
                int i37 = i36 % 128;
                f62499c = i37;
                int i38 = i36 % 2;
                int i39 = ((i37 ^ 7) | (i37 & 7)) << 1;
                int i40 = -(((~i37) & 7) | (i37 & (-8)));
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                f62498b = i41 % 128;
                if (i41 % 2 == 0) {
                    return Boolean.FALSE;
                }
                int i42 = 69 / 0;
                return Boolean.FALSE;
            }
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            int i43 = f62498b + 63;
            f62499c = i43 % 128;
            return Boolean.valueOf(i43 % 2 == 0);
        }
        int i44 = f62499c;
        int i45 = ((i44 ^ 85) | (i44 & 85)) << 1;
        int i46 = -(((~i44) & 85) | (i44 & (-86)));
        int i47 = (i45 & i46) + (i46 | i45);
        f62498b = i47 % 128;
        int i48 = i47 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        yr yrVar = (yr) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f62498b;
        int i11 = ((i10 ^ 27) - (~(-(-((i10 & 27) << 1))))) - 1;
        f62499c = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = (String) yr.setX(new Object[]{yrVar, "Retry-After"}, 401167373, -401167369, (int) System.currentTimeMillis());
        if (str == null) {
            int i12 = f62498b + 91;
            f62499c = i12 % 128;
            if (i12 % 2 != 0) {
                return Integer.valueOf(iIntValue);
            }
            int i13 = 29 / 0;
            return Integer.valueOf(iIntValue);
        }
        if (!new Regex("\\d+").matches(str)) {
            int i14 = f62499c;
            int i15 = (i14 & (-92)) | ((~i14) & 91);
            int i16 = -(-((i14 & 91) << 1));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            f62498b = i17 % 128;
            if (i17 % 2 == 0) {
                return Integer.MAX_VALUE;
            }
            throw null;
        }
        int i18 = f62499c + 120;
        int i19 = (i18 ^ (-1)) + (i18 << 1);
        f62498b = i19 % 128;
        int i20 = i19 % 2;
        Integer numValueOf = Integer.valueOf(str);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "");
        int iIntValue2 = numValueOf.intValue();
        int i21 = f62499c;
        int i22 = ((i21 | 105) << 1) - (i21 ^ 105);
        f62498b = i22 % 128;
        if (i22 % 2 == 0) {
            return Integer.valueOf(iIntValue2);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if ((r0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        r6 = (java.lang.String) com.mypinpad.tsdk.isolation.yr.setX(new java.lang.Object[]{r3, "Location"}, 401167373, -401167369, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        if (r6 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.zz.f62499c;
        r1 = r0 + 119;
        com.mypinpad.tsdk.isolation.zz.f62498b = r1 % 128;
        r1 = r1 % 2;
        r1 = (((r0 | 42) << 1) - (r0 ^ 42)) - 1;
        com.mypinpad.tsdk.isolation.zz.f62498b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        r7 = (com.mypinpad.tsdk.isolation.yk) com.mypinpad.tsdk.isolation.yr.setX(new java.lang.Object[]{r3}, -504719753, 504719763, java.lang.System.identityHashCode(r3));
        r7 = (com.mypinpad.tsdk.isolation.yg) com.mypinpad.tsdk.isolation.yk.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r7}, -534472234, 534472239, java.lang.System.identityHashCode(r7));
        r6 = (com.mypinpad.tsdk.isolation.yg) com.mypinpad.tsdk.isolation.yg.setOnFocusChangeListener(new java.lang.Object[]{r7, r6}, -1625905780, 1625905791, java.lang.System.identityHashCode(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d6, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d8, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.zz.f62499c + 31;
        r1 = r0 % 128;
        com.mypinpad.tsdk.isolation.zz.f62498b = r1;
        r0 = r0 % 2;
        r0 = r1 & 79;
        r1 = (r1 ^ 79) | r0;
        r3 = (r0 ^ r1) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.zz.f62499c = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f1, code lost:
    
        r7 = (java.lang.String) com.mypinpad.tsdk.isolation.yg.setOnFocusChangeListener(new java.lang.Object[]{r6}, 952222842, -952222825, java.lang.System.identityHashCode(r6));
        r8 = (com.mypinpad.tsdk.isolation.yk) com.mypinpad.tsdk.isolation.yr.setX(new java.lang.Object[]{r3}, -504719753, 504719763, java.lang.System.identityHashCode(r3));
        r8 = (com.mypinpad.tsdk.isolation.yg) com.mypinpad.tsdk.isolation.yk.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r8}, -534472234, 534472239, java.lang.System.identityHashCode(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0134, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r7, (java.lang.String) com.mypinpad.tsdk.isolation.yg.setOnFocusChangeListener(new java.lang.Object[]{r8}, 952222842, -952222825, java.lang.System.identityHashCode(r8)))) == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0137, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.zz.f62498b;
        r8 = r7 & 57;
        r7 = r7 | 57;
        r9 = ((r8 | r7) << 1) - (r7 ^ r8);
        com.mypinpad.tsdk.isolation.zz.f62499c = r9 % 128;
        r9 = r9 % 2;
        r1 = r1.f62500a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0162, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.ym.setY(new java.lang.Object[]{r1}, 906360168, -906360147, java.lang.System.identityHashCode(r1))).booleanValue()) == true) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0164, code lost:
    
        r1 = (com.mypinpad.tsdk.isolation.yk) com.mypinpad.tsdk.isolation.yr.setX(new java.lang.Object[]{r3}, -504719753, 504719763, java.lang.System.identityHashCode(r3));
        r1 = (com.mypinpad.tsdk.i.yk.setDividerPadding) com.mypinpad.tsdk.isolation.yk.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, 575496979, -575496977, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x019f, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.zv.setOnFocusChangeListener(new java.lang.Object[]{r5}, -106229379, 106229383, (int) java.lang.System.currentTimeMillis())).booleanValue() == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01a3, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.zz.f62498b;
        r14 = ((r7 & (-90)) | ((~r7) & 89)) + ((r7 & 89) << 1);
        com.mypinpad.tsdk.isolation.zz.f62499c = r14 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c0, code lost:
    
        if ((r14 % 2) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c2, code lost:
    
        r8 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.yr.setX(new java.lang.Object[]{r3}, 151122101, -151122100, java.lang.System.identityHashCode(r3))).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01eb, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.zv.setOnFocusChangeListener(new java.lang.Object[]{r5}, 1967480732, -1967480732, (int) java.lang.System.currentTimeMillis())).booleanValue() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ed, code lost:
    
        if (r8 == 308) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ef, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.zz.f62498b;
        r14 = (-2) - ((r7 + 60) ^ (-1));
        com.mypinpad.tsdk.isolation.zz.f62499c = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01fc, code lost:
    
        if (r8 != 307) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ff, code lost:
    
        r7 = r7 + 53;
        com.mypinpad.tsdk.isolation.zz.f62499c = r7 % 128;
        r7 = r7 % 2;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0208, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.zz.f62498b;
        r14 = r7 & 105;
        r7 = -(-((r7 ^ 105) | r14));
        r15 = (r14 & r7) + (r7 | r14);
        com.mypinpad.tsdk.isolation.zz.f62499c = r15 % 128;
        r15 = r15 % 2;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x023b, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.zv.setOnFocusChangeListener(new java.lang.Object[]{r5}, 1437175414, -1437175413, (int) java.lang.System.currentTimeMillis())).booleanValue() == true) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x023e, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.zz.f62499c + 11;
        r11 = r9 % 128;
        com.mypinpad.tsdk.isolation.zz.f62498b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0247, code lost:
    
        if ((r9 % 2) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x024b, code lost:
    
        if (r8 == 13747) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x024e, code lost:
    
        if (r8 == 308) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0250, code lost:
    
        r11 = r11 + 99;
        com.mypinpad.tsdk.isolation.zz.f62499c = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0257, code lost:
    
        if ((r11 % 2) != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x025b, code lost:
    
        if (r8 == 2934) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025e, code lost:
    
        if (r8 == 307) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0260, code lost:
    
        r5 = (com.mypinpad.tsdk.i.yk.setDividerPadding) com.mypinpad.tsdk.i.yk.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r1, "GET", null}, -426525578, 426525584, java.lang.System.identityHashCode(r1));
        r5 = com.mypinpad.tsdk.isolation.zz.f62499c;
        r8 = (r5 & (-106)) | ((~r5) & 105);
        r5 = (r5 & 105) << 1;
        r9 = (r8 ^ r5) + ((r5 & r8) << 1);
        com.mypinpad.tsdk.isolation.zz.f62498b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x028d, code lost:
    
        if ((!r7) == true) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x028f, code lost:
    
        r8 = com.mypinpad.tsdk.isolation.zz.f62499c;
        r9 = (r8 ^ 19) + ((r8 & 19) << 1);
        com.mypinpad.tsdk.isolation.zz.f62498b = r9 % 128;
        r9 = r9 % 2;
        r8 = (com.mypinpad.tsdk.isolation.yk) com.mypinpad.tsdk.isolation.yr.setX(new java.lang.Object[]{r3}, -504719753, 504719763, java.lang.System.identityHashCode(r3));
        r8 = (com.mypinpad.tsdk.isolation.yo) com.mypinpad.tsdk.isolation.yk.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r8}, -2084954302, 2084954305, java.lang.System.identityHashCode(r8));
        r9 = (-2) - ((com.mypinpad.tsdk.isolation.zz.f62499c + 42) ^ (-1));
        com.mypinpad.tsdk.isolation.zz.f62498b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02d2, code lost:
    
        r8 = com.mypinpad.tsdk.isolation.zz.f62499c;
        r9 = r8 & 83;
        r8 = ((r8 | 83) & (~r9)) + (r9 << 1);
        com.mypinpad.tsdk.isolation.zz.f62498b = r8 % 128;
        r8 = r8 % 2;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02e2, code lost:
    
        r5 = (com.mypinpad.tsdk.i.yk.setDividerPadding) com.mypinpad.tsdk.i.yk.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r1, r5, r8}, -426525578, 426525584, java.lang.System.identityHashCode(r1));
        r5 = com.mypinpad.tsdk.isolation.zz.f62498b;
        r8 = r5 & 123;
        r5 = ((r5 | 123) & (~r8)) + (r8 << 1);
        com.mypinpad.tsdk.isolation.zz.f62499c = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0041, code lost:
    
        if ((!r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0303, code lost:
    
        if (r7 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0305, code lost:
    
        r5 = com.mypinpad.tsdk.isolation.zz.f62498b;
        r7 = (r5 & (-78)) | ((~r5) & 77);
        r5 = -(-((r5 & 77) << 1));
        r8 = (r7 & r5) + (r5 | r7);
        com.mypinpad.tsdk.isolation.zz.f62499c = r8 % 128;
        r8 = r8 % 2;
        r5 = (com.mypinpad.tsdk.i.yk.setDividerPadding) com.mypinpad.tsdk.i.yk.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r1, "Transfer-Encoding"}, -1600859902, 1600859911, java.lang.System.identityHashCode(r1));
        r5 = (com.mypinpad.tsdk.i.yk.setDividerPadding) com.mypinpad.tsdk.i.yk.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r1, "Content-Length"}, -1600859902, 1600859911, java.lang.System.identityHashCode(r1));
        r5 = (com.mypinpad.tsdk.i.yk.setDividerPadding) com.mypinpad.tsdk.i.yk.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r1, com.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_CONTENT_TYPE}, -1600859902, 1600859911, java.lang.System.identityHashCode(r1));
        r5 = com.mypinpad.tsdk.isolation.zz.f62498b;
        r7 = r5 ^ 9;
        r5 = (((r5 & 9) | r7) << 1) - r7;
        com.mypinpad.tsdk.isolation.zz.f62499c = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0365, code lost:
    
        r3 = (com.mypinpad.tsdk.isolation.yk) com.mypinpad.tsdk.isolation.yr.setX(new java.lang.Object[]{r3}, -504719753, 504719763, java.lang.System.identityHashCode(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0391, code lost:
    
        if (com.mypinpad.tsdk.isolation.yt.setOnFocusChangeListener((com.mypinpad.tsdk.isolation.yg) com.mypinpad.tsdk.isolation.yk.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r3}, -534472234, 534472239, java.lang.System.identityHashCode(r3)), r6) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0394, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.zz.f62499c;
        r7 = r3 & 119;
        r5 = ((((r3 ^ 119) | r7) << 1) - (~(-((r3 | 119) & (~r7))))) - 1;
        com.mypinpad.tsdk.isolation.zz.f62498b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x03ab, code lost:
    
        if ((r5 % 2) != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03ad, code lost:
    
        r3 = (com.mypinpad.tsdk.i.yk.setDividerPadding) com.mypinpad.tsdk.i.yk.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r1, "Authorization"}, -1600859902, 1600859911, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03c3, code lost:
    
        r1 = (com.mypinpad.tsdk.i.yk.setDividerPadding) com.mypinpad.tsdk.i.yk.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r1, r6}, -735097510, 735097513, java.lang.System.identityHashCode(r1));
        r0 = (com.mypinpad.tsdk.isolation.yk) com.mypinpad.tsdk.i.yk.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r1}, 721744858, -721744846, java.lang.System.identityHashCode(r1));
        r1 = com.mypinpad.tsdk.isolation.zz.f62499c;
        r2 = ((r1 | 67) << 1) - (r1 ^ 67);
        com.mypinpad.tsdk.isolation.zz.f62498b = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03fb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03fc, code lost:
    
        r0 = (com.mypinpad.tsdk.i.yk.setDividerPadding) com.mypinpad.tsdk.i.yk.setDividerPadding.setOnFocusChangeListener(new java.lang.Object[]{r1, "Authorization"}, -1600859902, 1600859911, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0413, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0414, code lost:
    
        ((java.lang.Integer) com.mypinpad.tsdk.isolation.yr.setX(new java.lang.Object[]{r3}, 151122101, -151122100, java.lang.System.identityHashCode(r3))).intValue();
        ((java.lang.Boolean) com.mypinpad.tsdk.isolation.zv.setOnFocusChangeListener(new java.lang.Object[]{r5}, 1967480732, -1967480732, (int) java.lang.System.currentTimeMillis())).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0438, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0439, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.zz.f62499c;
        r1 = (-2) - (((r1 ^ 90) + ((r1 & 90) << 1)) ^ (-1));
        com.mypinpad.tsdk.isolation.zz.f62498b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x044a, code lost:
    
        if ((r1 % 2) == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x044c, code lost:
    
        r1 = 56 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x044f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.ym.setY(new java.lang.Object[]{r7}, 364611752, -364611733, java.lang.System.identityHashCode(r7))).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.zz.f62498b + 45;
        com.mypinpad.tsdk.isolation.zz.f62499c = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.yk c(java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.zz.c(java.lang.Object[]):com.mypinpad.tsdk.i.yk");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:30:0x010e  */
    /* JADX WARN: Code duplicated, block: B:32:0x012b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0144  */
    /* JADX WARN: Code duplicated, block: B:36:0x0170  */
    /* JADX WARN: Code duplicated, block: B:38:0x0193  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x0203  */
    /* JADX WARN: Code duplicated, block: B:50:0x0222  */
    /* JADX WARN: Code duplicated, block: B:52:0x024b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0253  */
    /* JADX WARN: Code duplicated, block: B:56:0x0263  */
    /* JADX WARN: Code duplicated, block: B:58:0x028e  */
    /* JADX WARN: Code duplicated, block: B:60:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0316  */
    /* JADX WARN: Code duplicated, block: B:68:0x031a  */
    /* JADX WARN: Code duplicated, block: B:70:0x032e  */
    /* JADX WARN: Code duplicated, block: B:72:0x034c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0370  */
    /* JADX WARN: Code duplicated, block: B:79:0x03b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:81:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:83:0x03e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0418 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0419  */
    public static /* synthetic */ yk d(Object[] objArr) throws IOException {
        yp ypVar;
        int iIntValue;
        yk ykVar;
        int i10;
        yk y7;
        int i11;
        int i12;
        yr yrVar;
        int i13;
        int i14;
        ym ymVar;
        yr yrVar2;
        int i15;
        zz zzVar = (zz) objArr[0];
        yr yrVar3 = (yr) objArr[1];
        zg zgVar = (zg) objArr[2];
        int i16 = f62498b;
        int i17 = (i16 ^ 73) + ((i16 & 73) << 1);
        int i18 = i17 % 128;
        f62499c = i18;
        int i19 = i17 % 2;
        if (zgVar != null) {
            zi ziVar = (zi) zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar}, 207615740, -207615736, System.identityHashCode(zgVar));
            if (ziVar == null) {
                int i20 = f62498b;
                int i21 = i20 | 103;
                int i22 = ((i21 << 1) - (~(-(i21 & (~(i20 & 103)))))) - 1;
                f62499c = i22 % 128;
                int i23 = i22 % 2;
                int i24 = (i20 & 113) + (i20 | 113);
                f62499c = i24 % 128;
                int i25 = i24 % 2;
            } else {
                ypVar = (yp) zi.setY(new Object[]{ziVar}, 2102358168, -2102358143, System.identityHashCode(ziVar));
                int i26 = f62499c;
                int i27 = i26 & 35;
                int i28 = i27 + ((i26 ^ 35) | i27);
                f62498b = i28 % 128;
                int i29 = i28 % 2;
            }
            iIntValue = ((Integer) yr.setX(new Object[]{yrVar3}, 151122101, -151122100, System.identityHashCode(yrVar3))).intValue();
            yk ykVar2 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
            String str = (String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar2}, -441618648, 441618657, System.identityHashCode(ykVar2));
            if (iIntValue != 307 && iIntValue != 308) {
                if (iIntValue != 401) {
                    ym ymVar2 = zzVar.f62500a;
                    y7 = ((xo) ym.setY(new Object[]{ymVar2}, -2050938477, 2050938484, System.identityHashCode(ymVar2))).setY(ypVar, yrVar3);
                    int i30 = f62498b;
                    i11 = ((i30 | 103) << 1) - (i30 ^ 103);
                    f62499c = i11 % 128;
                    if (i11 % 2 != 0) {
                        return y7;
                    }
                    throw null;
                }
                if (iIntValue != 421) {
                    yk ykVar3 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                    if (zgVar != null) {
                        int i31 = f62499c + 1;
                        f62498b = i31 % 128;
                        int i32 = i31 % 2;
                        if (((Boolean) zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar}, -711586389, 711586408, System.identityHashCode(zgVar))).booleanValue()) {
                            ((zi) zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar}, 207615740, -207615736, System.identityHashCode(zgVar))).setOnLongClickListener();
                            yk ykVar4 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                            int i33 = f62498b;
                            int i34 = i33 & 37;
                            int i35 = (i34 - (~(-(-((i33 ^ 37) | i34))))) - 1;
                            f62499c = i35 % 128;
                            int i36 = i35 % 2;
                            return ykVar4;
                        }
                    }
                    int i37 = f62499c;
                    int i38 = i37 ^ 121;
                    i12 = (((i37 & 121) | i38) << 1) - i38;
                    f62498b = i12 % 128;
                    if (i12 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                if (iIntValue != 503) {
                    yrVar = (yr) yr.setX(new Object[]{yrVar3}, 2003566487, -2003566470, System.identityHashCode(yrVar3));
                    if (yrVar != null) {
                        int i39 = f62498b;
                        int i40 = ((i39 & (-38)) | ((~i39) & 37)) + ((i39 & 37) << 1);
                        f62499c = i40 % 128;
                        int i41 = i40 % 2;
                        if (((Integer) yr.setX(new Object[]{yrVar}, 151122101, -151122100, System.identityHashCode(yrVar))).intValue() == 503) {
                            int i42 = f62499c;
                            int i43 = ((i42 | 29) << 1) - (i42 ^ 29);
                            int i44 = i43 % 128;
                            f62498b = i44;
                            int i45 = i43 % 2;
                            int i46 = (i44 & (-96)) | ((~i44) & 95);
                            int i47 = -(-((i44 & 95) << 1));
                            i14 = (i46 ^ i47) + ((i47 & i46) << 1);
                            f62499c = i14 % 128;
                            if (i14 % 2 == 0) {
                                int i48 = 24 / 0;
                            }
                            return null;
                        }
                    }
                    if (((Integer) setY(new Object[]{yrVar3, Integer.MAX_VALUE}, -264721213, 264721216, Integer.MAX_VALUE)).intValue() == 0) {
                        int i49 = f62499c;
                        int i50 = i49 & 111;
                        int i51 = -(-((i49 ^ 111) | i50));
                        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                        f62498b = i52 % 128;
                        int i53 = i52 % 2;
                        return null;
                    }
                    int i54 = f62499c;
                    int i55 = i54 & 117;
                    int i56 = ((i54 ^ 117) | i55) << 1;
                    int i57 = -((i54 | 117) & (~i55));
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    f62498b = i58 % 128;
                    int i59 = i58 % 2;
                    yk ykVar5 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                    int i60 = f62499c;
                    int i61 = ((i60 ^ 83) | (i60 & 83)) << 1;
                    int i62 = -(((~i60) & 83) | (i60 & (-84)));
                    i13 = ((i61 | i62) << 1) - (i62 ^ i61);
                    f62498b = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i63 = 16 / 0;
                    }
                    return ykVar5;
                }
                if (iIntValue != 407) {
                    Intrinsics.checkNotNull(ypVar);
                    if (((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 250524162, -250524162, System.identityHashCode(ypVar))).type() == Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ym ymVar3 = zzVar.f62500a;
                    yk y10 = ((xo) ym.setY(new Object[]{ymVar3}, -1348873311, 1348873339, System.identityHashCode(ymVar3))).setY(ypVar, yrVar3);
                    int i64 = f62498b;
                    int i65 = ((i64 | 11) << 1) - (i64 ^ 11);
                    f62499c = i65 % 128;
                    int i66 = i65 % 2;
                    return y10;
                }
                if (iIntValue != 408) {
                    ymVar = zzVar.f62500a;
                    if (!((Boolean) ym.setY(new Object[]{ymVar}, 219894012, -219894007, System.identityHashCode(ymVar))).booleanValue()) {
                        int i67 = f62498b;
                        int i68 = (i67 ^ 5) + ((i67 & 5) << 1);
                        f62499c = i68 % 128;
                        int i69 = i68 % 2;
                        int i70 = (i67 & 83) + (i67 | 83);
                        f62499c = i70 % 128;
                        int i71 = i70 % 2;
                        return null;
                    }
                    yk ykVar6 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                    yrVar2 = (yr) yr.setX(new Object[]{yrVar3}, 2003566487, -2003566470, System.identityHashCode(yrVar3));
                    if (yrVar2 != null) {
                        int i72 = f62499c + 63;
                        f62498b = i72 % 128;
                        int i73 = i72 % 2;
                        if (((Integer) yr.setX(new Object[]{yrVar2}, 151122101, -151122100, System.identityHashCode(yrVar2))).intValue() == 408) {
                            int i74 = f62498b + 69;
                            int i75 = i74 % 128;
                            f62499c = i75;
                            int i76 = i74 % 2;
                            i15 = (i75 ^ 51) + ((i75 & 51) << 1);
                            f62498b = i15 % 128;
                            if (i15 % 2 == 0) {
                                return null;
                            }
                            throw null;
                        }
                    }
                    if (((Integer) setY(new Object[]{yrVar3, 0}, -264721213, 264721216, 0)).intValue() > 0) {
                        yk ykVar7 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                        int i77 = f62499c;
                        int i78 = i77 | 17;
                        int i79 = (i78 << 1) - ((~(i77 & 17)) & i78);
                        f62498b = i79 % 128;
                        int i80 = i79 % 2;
                        return ykVar7;
                    }
                    int i81 = f62498b;
                    int i82 = (i81 & 45) + (i81 | 45);
                    f62499c = i82 % 128;
                    int i83 = i82 % 2;
                    int i84 = i81 & 71;
                    int i85 = (((i81 ^ 71) | i84) << 1) - ((i81 | 71) & (~i84));
                    f62499c = i85 % 128;
                    int i86 = i85 % 2;
                    return null;
                }
                switch (iIntValue) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        int i87 = f62498b;
                        int i88 = i87 & 51;
                        int i89 = -(-(i87 | 51));
                        int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                        f62499c = i90 % 128;
                        int i91 = i90 % 2;
                        return null;
                }
            }
            ykVar = (yk) setY(new Object[]{zzVar, yrVar3, str}, 1544043074, -1544043069, System.identityHashCode(zzVar));
            int i92 = f62498b;
            i10 = ((((i92 ^ 33) | (i92 & 33)) << 1) - (~(-(((~i92) & 33) | (i92 & (-34)))))) - 1;
            f62499c = i10 % 128;
            if (i10 % 2 != 0) {
                return ykVar;
            }
            throw null;
        }
        int i93 = i18 + 93;
        f62498b = i93 % 128;
        if (i93 % 2 != 0) {
            throw null;
        }
        int i94 = i18 & 7;
        int i95 = -(-((i18 ^ 7) | i94));
        int i96 = (i94 & i95) + (i95 | i94);
        f62498b = i96 % 128;
        int i97 = i96 % 2;
        ypVar = null;
        iIntValue = ((Integer) yr.setX(new Object[]{yrVar3}, 151122101, -151122100, System.identityHashCode(yrVar3))).intValue();
        yk ykVar8 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
        String str2 = (String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar8}, -441618648, 441618657, System.identityHashCode(ykVar8));
        if (iIntValue != 307) {
            if (iIntValue != 401) {
                ym ymVar4 = zzVar.f62500a;
                y7 = ((xo) ym.setY(new Object[]{ymVar4}, -2050938477, 2050938484, System.identityHashCode(ymVar4))).setY(ypVar, yrVar3);
                int i310 = f62498b;
                i11 = ((i310 | 103) << 1) - (i310 ^ 103);
                f62499c = i11 % 128;
                if (i11 % 2 != 0) {
                    return y7;
                }
                throw null;
            }
            if (iIntValue != 421) {
                yk ykVar9 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                if (zgVar != null) {
                    int i311 = f62499c + 1;
                    f62498b = i311 % 128;
                    int i312 = i311 % 2;
                    if (((Boolean) zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar}, -711586389, 711586408, System.identityHashCode(zgVar))).booleanValue()) {
                        ((zi) zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar}, 207615740, -207615736, System.identityHashCode(zgVar))).setOnLongClickListener();
                        yk ykVar10 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                        int i313 = f62498b;
                        int i314 = i313 & 37;
                        int i315 = (i314 - (~(-(-((i313 ^ 37) | i314))))) - 1;
                        f62499c = i315 % 128;
                        int i316 = i315 % 2;
                        return ykVar10;
                    }
                }
                int i317 = f62499c;
                int i318 = i317 ^ 121;
                i12 = (((i317 & 121) | i318) << 1) - i318;
                f62498b = i12 % 128;
                if (i12 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            if (iIntValue != 503) {
                yrVar = (yr) yr.setX(new Object[]{yrVar3}, 2003566487, -2003566470, System.identityHashCode(yrVar3));
                if (yrVar != null) {
                    int i319 = f62498b;
                    int i410 = ((i319 & (-38)) | ((~i319) & 37)) + ((i319 & 37) << 1);
                    f62499c = i410 % 128;
                    int i411 = i410 % 2;
                    if (((Integer) yr.setX(new Object[]{yrVar}, 151122101, -151122100, System.identityHashCode(yrVar))).intValue() == 503) {
                        int i412 = f62499c;
                        int i413 = ((i412 | 29) << 1) - (i412 ^ 29);
                        int i414 = i413 % 128;
                        f62498b = i414;
                        int i415 = i413 % 2;
                        int i416 = (i414 & (-96)) | ((~i414) & 95);
                        int i417 = -(-((i414 & 95) << 1));
                        i14 = (i416 ^ i417) + ((i417 & i416) << 1);
                        f62499c = i14 % 128;
                        if (i14 % 2 == 0) {
                            int i418 = 24 / 0;
                        }
                        return null;
                    }
                }
                if (((Integer) setY(new Object[]{yrVar3, Integer.MAX_VALUE}, -264721213, 264721216, Integer.MAX_VALUE)).intValue() == 0) {
                    int i419 = f62499c;
                    int i510 = i419 & 111;
                    int i511 = -(-((i419 ^ 111) | i510));
                    int i512 = (i510 ^ i511) + ((i511 & i510) << 1);
                    f62498b = i512 % 128;
                    int i513 = i512 % 2;
                    return null;
                }
                int i514 = f62499c;
                int i515 = i514 & 117;
                int i516 = ((i514 ^ 117) | i515) << 1;
                int i517 = -((i514 | 117) & (~i515));
                int i518 = ((i516 | i517) << 1) - (i517 ^ i516);
                f62498b = i518 % 128;
                int i519 = i518 % 2;
                yk ykVar11 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                int i610 = f62499c;
                int i611 = ((i610 ^ 83) | (i610 & 83)) << 1;
                int i612 = -(((~i610) & 83) | (i610 & (-84)));
                i13 = ((i611 | i612) << 1) - (i612 ^ i611);
                f62498b = i13 % 128;
                if (i13 % 2 != 0) {
                    int i613 = 16 / 0;
                }
                return ykVar11;
            }
            if (iIntValue != 407) {
                Intrinsics.checkNotNull(ypVar);
                if (((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 250524162, -250524162, System.identityHashCode(ypVar))).type() == Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ym ymVar5 = zzVar.f62500a;
                yk y11 = ((xo) ym.setY(new Object[]{ymVar5}, -1348873311, 1348873339, System.identityHashCode(ymVar5))).setY(ypVar, yrVar3);
                int i614 = f62498b;
                int i615 = ((i614 | 11) << 1) - (i614 ^ 11);
                f62499c = i615 % 128;
                int i616 = i615 % 2;
                return y11;
            }
            if (iIntValue != 408) {
                ymVar = zzVar.f62500a;
                if (!((Boolean) ym.setY(new Object[]{ymVar}, 219894012, -219894007, System.identityHashCode(ymVar))).booleanValue()) {
                    int i617 = f62498b;
                    int i618 = (i617 ^ 5) + ((i617 & 5) << 1);
                    f62499c = i618 % 128;
                    int i619 = i618 % 2;
                    int i710 = (i617 & 83) + (i617 | 83);
                    f62499c = i710 % 128;
                    int i711 = i710 % 2;
                    return null;
                }
                yk ykVar12 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                yrVar2 = (yr) yr.setX(new Object[]{yrVar3}, 2003566487, -2003566470, System.identityHashCode(yrVar3));
                if (yrVar2 != null) {
                    int i712 = f62499c + 63;
                    f62498b = i712 % 128;
                    int i713 = i712 % 2;
                    if (((Integer) yr.setX(new Object[]{yrVar2}, 151122101, -151122100, System.identityHashCode(yrVar2))).intValue() == 408) {
                        int i714 = f62498b + 69;
                        int i715 = i714 % 128;
                        f62499c = i715;
                        int i716 = i714 % 2;
                        i15 = (i715 ^ 51) + ((i715 & 51) << 1);
                        f62498b = i15 % 128;
                        if (i15 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    }
                }
                if (((Integer) setY(new Object[]{yrVar3, 0}, -264721213, 264721216, 0)).intValue() > 0) {
                    yk ykVar13 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                    int i717 = f62499c;
                    int i718 = i717 | 17;
                    int i719 = (i718 << 1) - ((~(i717 & 17)) & i718);
                    f62498b = i719 % 128;
                    int i810 = i719 % 2;
                    return ykVar13;
                }
                int i811 = f62498b;
                int i812 = (i811 & 45) + (i811 | 45);
                f62499c = i812 % 128;
                int i813 = i812 % 2;
                int i814 = i811 & 71;
                int i815 = (((i811 ^ 71) | i814) << 1) - ((i811 | 71) & (~i814));
                f62499c = i815 % 128;
                int i816 = i815 % 2;
                return null;
            }
            switch (iIntValue) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    int i817 = f62498b;
                    int i818 = i817 & 51;
                    int i819 = -(-(i817 | 51));
                    int i98 = (i818 ^ i819) + ((i819 & i818) << 1);
                    f62499c = i98 % 128;
                    int i99 = i98 % 2;
                    return null;
            }
        }
        ykVar = (yk) setY(new Object[]{zzVar, yrVar3, str2}, 1544043074, -1544043069, System.identityHashCode(zzVar));
        int i910 = f62498b;
        i10 = ((((i910 ^ 33) | (i910 & 33)) << 1) - (~(-(((~i910) & 33) | (i910 & (-34)))))) - 1;
        f62499c = i10 % 128;
        if (i10 % 2 != 0) {
            return ykVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:112:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:113:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:115:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:117:0x070f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0711  */
    /* JADX WARN: Code duplicated, block: B:121:0x0725  */
    /* JADX WARN: Code duplicated, block: B:123:0x072f  */
    /* JADX WARN: Code duplicated, block: B:125:0x073e  */
    /* JADX WARN: Code duplicated, block: B:23:0x013a  */
    /* JADX WARN: Code duplicated, block: B:25:0x014f A[Catch: all -> 0x0135, TRY_ENTER, TryCatch #1 {all -> 0x0135, blocks: (B:11:0x00da, B:13:0x00f4, B:17:0x0131, B:29:0x0237, B:34:0x027d, B:38:0x02b5, B:39:0x02c3, B:44:0x0397, B:53:0x0420, B:54:0x042f, B:47:0x03dd, B:25:0x014f, B:26:0x01bc, B:78:0x0558, B:79:0x055f, B:59:0x0435, B:64:0x045d, B:66:0x0486, B:70:0x04c2, B:71:0x04c6, B:72:0x04c7, B:74:0x0502, B:76:0x053f, B:77:0x0557), top: B:131:0x00da, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x01bc A[Catch: all -> 0x0135, TRY_LEAVE, TryCatch #1 {all -> 0x0135, blocks: (B:11:0x00da, B:13:0x00f4, B:17:0x0131, B:29:0x0237, B:34:0x027d, B:38:0x02b5, B:39:0x02c3, B:44:0x0397, B:53:0x0420, B:54:0x042f, B:47:0x03dd, B:25:0x014f, B:26:0x01bc, B:78:0x0558, B:79:0x055f, B:59:0x0435, B:64:0x045d, B:66:0x0486, B:70:0x04c2, B:71:0x04c6, B:72:0x04c7, B:74:0x0502, B:76:0x053f, B:77:0x0557), top: B:131:0x00da, inners: #3 }] */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13;
        Boolean boolValueOf;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        zs zsVar;
        yk ykVar;
        zj zjVar;
        List listEmptyList;
        boolean z11;
        boolean z12;
        int i18;
        int i19;
        int i20 = ~i10;
        int i21 = ~i11;
        int i22 = 3;
        switch ((((~(i10 | (~i12))) | i21) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i20 | i21)) | (~(i21 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167))) {
            case 1:
                return d(objArr);
            case 2:
                return a(objArr);
            case 3:
                return b(objArr);
            case 4:
                zz zzVar = (zz) objArr[0];
                IOException iOException = (IOException) objArr[1];
                zj zjVar2 = (zj) objArr[2];
                yk ykVar2 = (yk) objArr[3];
                boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
                int i23 = f62498b;
                int i24 = i23 & 9;
                int i25 = (((i23 | 9) & (~i24)) - (~(-(-(i24 << 1))))) - 1;
                f62499c = i25 % 128;
                int i26 = i25 % 2;
                ym ymVar = zzVar.f62500a;
                if (((Boolean) ym.setY(new Object[]{ymVar}, 219894012, -219894007, System.identityHashCode(ymVar))).booleanValue()) {
                    if (zBooleanValue) {
                        int i27 = f62499c;
                        int i28 = ((i27 ^ 27) | (i27 & 27)) << 1;
                        int i29 = -(((~i27) & 27) | (i27 & (-28)));
                        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                        f62498b = i30 % 128;
                        if (i30 % 2 != 0) {
                            ((Boolean) setY(new Object[]{iOException, ykVar2}, 989257951, -989257945, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        if (((Boolean) setY(new Object[]{iOException, ykVar2}, 989257951, -989257945, (int) System.currentTimeMillis())).booleanValue()) {
                            int i31 = f62499c;
                            i16 = i31 & 23;
                            i17 = (i31 ^ 23) | i16;
                        } else if (!((Boolean) setY(new Object[]{iOException, Boolean.valueOf(zBooleanValue)}, -594738610, 594738612, (int) System.currentTimeMillis())).booleanValue()) {
                            int i32 = f62499c;
                            int i33 = ((i32 | 2) << 1) - (i32 ^ 2);
                            int i34 = (i33 ^ (-1)) + (i33 << 1);
                            f62498b = i34 % 128;
                            int i35 = i34 % 2;
                            int i36 = i32 + 82;
                            i16 = i36 ^ (-1);
                            i17 = i36 << 1;
                        } else if (!((Boolean) zj.setDividerPadding(new Object[]{zjVar2}, -1192909483, 1192909501, System.identityHashCode(zjVar2))).booleanValue()) {
                            int i37 = f62498b;
                            int i38 = i37 & 69;
                            i13 = i38 + ((i37 ^ 69) | i38);
                            f62499c = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i39 = 8 / 0;
                            }
                            boolValueOf = Boolean.TRUE;
                        } else {
                            int i40 = f62498b;
                            i14 = (-2) - ((((i40 | 46) << 1) - (i40 ^ 46)) ^ (-1));
                            int i41 = i14 % 128;
                            f62499c = i41;
                            if (i14 % 2 == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int i42 = i41 & 109;
                            int i43 = (i41 | 109) & (~i42);
                            int i44 = i42 << 1;
                            i15 = ((i43 | i44) << 1) - (i43 ^ i44);
                            f62498b = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i45 = 41 / 0;
                            }
                            boolValueOf = Boolean.valueOf(z10);
                        }
                        int i46 = i16 + i17;
                        f62498b = i46 % 128;
                        int i47 = i46 % 2;
                        boolValueOf = Boolean.FALSE;
                        break;
                    } else if (!((Boolean) setY(new Object[]{iOException, Boolean.valueOf(zBooleanValue)}, -594738610, 594738612, (int) System.currentTimeMillis())).booleanValue()) {
                        int i310 = f62499c;
                        int i311 = ((i310 | 2) << 1) - (i310 ^ 2);
                        int i312 = (i311 ^ (-1)) + (i311 << 1);
                        f62498b = i312 % 128;
                        int i313 = i312 % 2;
                        int i314 = i310 + 82;
                        i16 = i314 ^ (-1);
                        i17 = i314 << 1;
                        int i48 = i16 + i17;
                        f62498b = i48 % 128;
                        int i49 = i48 % 2;
                        boolValueOf = Boolean.FALSE;
                    } else if (!((Boolean) zj.setDividerPadding(new Object[]{zjVar2}, -1192909483, 1192909501, System.identityHashCode(zjVar2))).booleanValue()) {
                        int i315 = f62498b;
                        int i316 = i315 & 69;
                        i13 = i316 + ((i315 ^ 69) | i316);
                        f62499c = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i317 = 8 / 0;
                        }
                        boolValueOf = Boolean.TRUE;
                    } else {
                        int i410 = f62498b;
                        i14 = (-2) - ((((i410 | 46) << 1) - (i410 ^ 46)) ^ (-1));
                        int i411 = i14 % 128;
                        f62499c = i411;
                        if (i14 % 2 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i412 = i411 & 109;
                        int i413 = (i411 | 109) & (~i412);
                        int i414 = i412 << 1;
                        i15 = ((i413 | i414) << 1) - (i413 ^ i414);
                        f62498b = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i415 = 41 / 0;
                        }
                        boolValueOf = Boolean.valueOf(z10);
                    }
                } else {
                    int i50 = f62498b;
                    int i51 = i50 + 55;
                    f62499c = i51 % 128;
                    boolean z13 = i51 % 2 == 0;
                    int i52 = i50 & 65;
                    int i53 = i52 + ((i50 ^ 65) | i52);
                    f62499c = i53 % 128;
                    if (i53 % 2 == 0) {
                        int i54 = 23 / 0;
                    }
                    boolValueOf = Boolean.valueOf(z13);
                }
                break;
            case 5:
                return c(objArr);
            case 6:
                IOException iOException2 = (IOException) objArr[0];
                yk ykVar3 = (yk) objArr[1];
                int i55 = f62499c;
                int i56 = (((i55 | 20) << 1) - (i55 ^ 20)) - 1;
                f62498b = i56 % 128;
                int i57 = i56 % 2;
                if (iOException2 instanceof FileNotFoundException) {
                    int i58 = f62499c;
                    int i59 = i58 & 51;
                    int i60 = (i58 ^ 51) | i59;
                    int i61 = ((i59 | i60) << 1) - (i59 ^ i60);
                    f62498b = i61 % 128;
                    int i62 = i61 % 2;
                    int i63 = ((i58 | 21) << 1) - (i58 ^ 21);
                    f62498b = i63 % 128;
                    int i64 = i63 % 2;
                    boolValueOf = Boolean.TRUE;
                } else {
                    int i65 = f62498b + 9;
                    f62499c = i65 % 128;
                    if (i65 % 2 == 0) {
                        throw null;
                    }
                    boolValueOf = Boolean.FALSE;
                }
                break;
            default:
                zz zzVar2 = (zz) objArr[0];
                yl.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (yl.setCompoundDrawableTintBlendMode) objArr[1];
                int i66 = f62498b;
                int i67 = i66 & 83;
                int i68 = ((i66 ^ 83) | i67) << 1;
                int i69 = -((i66 | 83) & (~i67));
                int i70 = (i68 & i69) + (i69 | i68);
                f62499c = i70 % 128;
                if (i70 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
                    zsVar = (zs) setcompounddrawabletintblendmode;
                    ykVar = (yk) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 541338608, -541338597, System.identityHashCode(zsVar));
                    zjVar = (zj) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 155528025, -155528023, System.identityHashCode(zsVar));
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    z11 = false;
                } else {
                    Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
                    zsVar = (zs) setcompounddrawabletintblendmode;
                    ykVar = (yk) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 541338608, -541338597, System.identityHashCode(zsVar));
                    zjVar = (zj) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 155528025, -155528023, System.identityHashCode(zsVar));
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    z11 = true;
                }
                yk ykVar4 = ykVar;
                zs zsVar2 = zsVar;
                int i71 = f62499c + 93;
                f62498b = i71 % 128;
                int i72 = i71 % 2;
                yr yrVar = null;
                int i73 = 0;
                List list = listEmptyList;
                yk ykVar5 = ykVar4;
                boolean z14 = z11;
                List listPlus = list;
                while (true) {
                    Object[] objArr2 = new Object[i22];
                    objArr2[0] = zjVar;
                    objArr2[1] = ykVar5;
                    objArr2[2] = Boolean.valueOf(z14);
                    zj.setDividerPadding(objArr2, 44789820, -44789803, System.identityHashCode(zjVar));
                    try {
                        if (((Boolean) zj.setDividerPadding(new Object[]{zjVar}, 1594554260, -1594554259, System.identityHashCode(zjVar))).booleanValue()) {
                            throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                        }
                        try {
                            yr yrVar2 = (yr) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar2, ykVar5}, -173228024, 173228032, System.identityHashCode(zsVar2));
                            int i74 = f62498b;
                            int i75 = i74 & 7;
                            int i76 = (i74 | 7) & (~i75);
                            int i77 = i75 << 1;
                            int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
                            int i79 = i78 % 128;
                            f62499c = i79;
                            int i80 = i78 % 2;
                            int i81 = i79 & 109;
                            int i82 = -(-(i79 | 109));
                            int i83 = (i81 ^ i82) + ((i81 & i82) << 1);
                            f62498b = i83 % 128;
                            if (i83 % 2 != 0) {
                                int i84 = 24 / 0;
                                if (yrVar != null) {
                                    i19 = i79 + 19;
                                    f62498b = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        yr.setDividerPadding setdividerpadding = (yr.setDividerPadding) yr.setX(new Object[]{yrVar2}, 142679588, -142679576, System.identityHashCode(yrVar2));
                                        yr.setDividerPadding setdividerpadding2 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar}, 142679588, -142679576, System.identityHashCode(yrVar));
                                        yr.setDividerPadding setdividerpadding3 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding2, null}, 637562883, -637562870, System.identityHashCode(setdividerpadding2));
                                        yr.setDividerPadding setdividerpadding4 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding, (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding3}, -92684172, 92684189, System.identityHashCode(setdividerpadding3))}, -66560998, 66561004, System.identityHashCode(setdividerpadding));
                                        yrVar2 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding4}, -92684172, 92684189, System.identityHashCode(setdividerpadding4));
                                        int i85 = 3 / 0;
                                    } else {
                                        yr.setDividerPadding setdividerpadding5 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar2}, 142679588, -142679576, System.identityHashCode(yrVar2));
                                        yr.setDividerPadding setdividerpadding6 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar}, 142679588, -142679576, System.identityHashCode(yrVar));
                                        yr.setDividerPadding setdividerpadding7 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding6, null}, 637562883, -637562870, System.identityHashCode(setdividerpadding6));
                                        yr.setDividerPadding setdividerpadding8 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding5, (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding7}, -92684172, 92684189, System.identityHashCode(setdividerpadding7))}, -66560998, 66561004, System.identityHashCode(setdividerpadding5));
                                        yrVar2 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding8}, -92684172, 92684189, System.identityHashCode(setdividerpadding8));
                                    }
                                    int i86 = f62499c;
                                    int i87 = (-2) - (((i86 & 10) + (i86 | 10)) ^ (-1));
                                    f62498b = i87 % 128;
                                    int i88 = i87 % 2;
                                }
                            } else if (yrVar != null) {
                                i19 = i79 + 19;
                                f62498b = i19 % 128;
                                if (i19 % 2 != 0) {
                                    yr.setDividerPadding setdividerpadding9 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar2}, 142679588, -142679576, System.identityHashCode(yrVar2));
                                    yr.setDividerPadding setdividerpadding10 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar}, 142679588, -142679576, System.identityHashCode(yrVar));
                                    yr.setDividerPadding setdividerpadding11 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding10, null}, 637562883, -637562870, System.identityHashCode(setdividerpadding10));
                                    yr.setDividerPadding setdividerpadding12 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding9, (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding11}, -92684172, 92684189, System.identityHashCode(setdividerpadding11))}, -66560998, 66561004, System.identityHashCode(setdividerpadding9));
                                    yrVar2 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding12}, -92684172, 92684189, System.identityHashCode(setdividerpadding12));
                                    int i89 = 3 / 0;
                                } else {
                                    yr.setDividerPadding setdividerpadding13 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar2}, 142679588, -142679576, System.identityHashCode(yrVar2));
                                    yr.setDividerPadding setdividerpadding14 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar}, 142679588, -142679576, System.identityHashCode(yrVar));
                                    yr.setDividerPadding setdividerpadding15 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding14, null}, 637562883, -637562870, System.identityHashCode(setdividerpadding14));
                                    yr.setDividerPadding setdividerpadding16 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding13, (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding15}, -92684172, 92684189, System.identityHashCode(setdividerpadding15))}, -66560998, 66561004, System.identityHashCode(setdividerpadding13));
                                    yrVar2 = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding16}, -92684172, 92684189, System.identityHashCode(setdividerpadding16));
                                }
                                int i810 = f62499c;
                                int i811 = (-2) - (((i810 & 10) + (i810 | 10)) ^ (-1));
                                f62498b = i811 % 128;
                                int i812 = i811 % 2;
                            }
                            yrVar = yrVar2;
                            zg zgVar = (zg) zj.setDividerPadding(new Object[]{zjVar}, -1953301162, 1953301175, System.identityHashCode(zjVar));
                            ykVar5 = (yk) setY(new Object[]{zzVar2, yrVar, zgVar}, 282107474, -282107473, System.identityHashCode(zzVar2));
                            if (ykVar5 == null) {
                                int i90 = f62498b;
                                int i91 = ((i90 | 91) << 1) - (i90 ^ 91);
                                int i92 = i91 % 128;
                                f62499c = i92;
                                int i93 = i91 % 2;
                                if (zgVar != null) {
                                    int i94 = i92 + 9;
                                    f62498b = i94 % 128;
                                    int i95 = i94 % 2;
                                    if (((Boolean) zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar}, -1718063440, 1718063442, System.identityHashCode(zgVar))).booleanValue()) {
                                        int i96 = f62498b;
                                        int i97 = (i96 | 41) << 1;
                                        int i98 = -(((~i96) & 41) | (i96 & (-42)));
                                        int i99 = (i97 & i98) + (i98 | i97);
                                        f62499c = i99 % 128;
                                        if (i99 % 2 == 0) {
                                            zj.setDividerPadding(new Object[]{zjVar}, -1094292419, 1094292441, System.identityHashCode(zjVar));
                                            int i100 = 0 / 0;
                                        } else {
                                            zj.setDividerPadding(new Object[]{zjVar}, -1094292419, 1094292441, System.identityHashCode(zjVar));
                                        }
                                    }
                                }
                                zj.setDividerPadding(new Object[]{zjVar, Boolean.FALSE}, -1962710247, 1962710261, System.identityHashCode(zjVar));
                                int iIdentityHashCode = System.identityHashCode(zzVar2);
                                int i101 = (-657340532) & iIdentityHashCode;
                                int i102 = (~i101) & ((-657340532) | iIdentityHashCode);
                                int i103 = ~iIdentityHashCode;
                                int i104 = i101 | i102;
                                int i105 = ((i104 & 1797339831) | ((-1797339832) & i104) | ((~i104) & 1797339831)) * (-381);
                                int i106 = (-1906643960) & i105;
                                int i107 = i105 | (-1906643960);
                                int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                                int i109 = (iIdentityHashCode | i103) & i103;
                                int i110 = (657340531 & i109) | ((~i109) & (-657340532));
                                int i111 = i109 & (-657340532);
                                int i112 = ~((i111 & i110) | (i110 ^ i111));
                                int i113 = (-1865366264) & i112;
                                int i114 = (i112 | (-1865366264)) & (~i113);
                                int i115 = (i114 & i113) | (i114 ^ i113);
                                int i116 = ((-589314100) & i115) | ((~i115) & 589314099);
                                int i117 = i115 & 589314099;
                                int i118 = -(~(((i117 & i116) | (i116 ^ i117)) * 381));
                                int i119 = (i108 & i118) + (i118 | i108) + 148266815;
                                int i120 = ~System.identityHashCode(zzVar2);
                                int i121 = ~i120;
                                int i122 = ~((1113213164 & i120) | ((-1113213165) & i121) | (i120 & (-1113213165)));
                                int i123 = -(~(-(-(((i122 & 38422604) | (i122 ^ 38422604)) * (-160)))));
                                int i124 = (-2) - (((((-1575682731) | i123) << 1) - (i123 ^ (-1575682731))) ^ (-1));
                                int i125 = (i121 & 40598877) | ((-40598878) & i120);
                                int i126 = i120 & 40598877;
                                int i127 = ~((i126 & i125) | (i125 ^ i126));
                                int i128 = (-1113213165) & i127;
                                int i129 = (i127 | (-1113213165)) & (~i128);
                                int i130 = -(-(((i129 & i128) | (i129 ^ i128)) * 160));
                                int i131 = i124 & i130;
                                int i132 = (i130 ^ i124) | i131;
                                if (i119 > (i131 & i132) + (i132 | i131)) {
                                    return yrVar;
                                }
                                throw null;
                            }
                            yn ynVar = (yn) yr.setX(new Object[]{yrVar}, -428621868, 428621887, System.identityHashCode(yrVar));
                            if (ynVar == null) {
                                int i133 = f62499c;
                                int i134 = (i133 & 72) + (i133 | 72);
                                int i135 = (i134 ^ (-1)) + (i134 << 1);
                                int i136 = i135 % 128;
                                f62498b = i136;
                                int i137 = i135 % 2;
                                int i138 = (-2) - ((i136 + 52) ^ (-1));
                                f62499c = i138 % 128;
                                int i139 = i138 % 2;
                            } else {
                                yt.setDividerPadding(ynVar);
                                int i140 = f62498b;
                                int i141 = i140 & 23;
                                int i142 = (i140 ^ 23) | i141;
                                int i143 = (i141 & i142) + (i142 | i141);
                                f62499c = i143 % 128;
                                int i144 = i143 % 2;
                            }
                            i73++;
                            if (i73 > 20) {
                                throw new ProtocolException(Intrinsics.stringPlus("Too many follow-up requests: ", Integer.valueOf(i73)));
                            }
                            zj.setDividerPadding(new Object[]{zjVar, Boolean.TRUE}, -1962710247, 1962710261, System.identityHashCode(zjVar));
                            int i145 = f62499c;
                            int i146 = ((i145 | 2) << 1) - (i145 ^ 2);
                            int i147 = (i146 ^ (-1)) + (i146 << 1);
                            f62498b = i147 % 128;
                            int i148 = i147 % 2;
                            z14 = true;
                            i22 = 3;
                        } catch (zp e5) {
                            if (!((Boolean) setY(new Object[]{zzVar2, (IOException) zp.setY(new Object[]{e5}, -1143255038, 1143255039, System.identityHashCode(e5)), zjVar, ykVar5, Boolean.FALSE}, 543490598, -543490594, System.identityHashCode(zzVar2))).booleanValue()) {
                                throw yt.setCompoundDrawableTintBlendMode((IOException) zp.setY(new Object[]{e5}, 1666256193, -1666256193, System.identityHashCode(e5)), (List<? extends Exception>) listPlus);
                            }
                            listPlus = CollectionsKt___CollectionsKt.plus((Collection<? extends IOException>) listPlus, (IOException) zp.setY(new Object[]{e5}, 1666256193, -1666256193, System.identityHashCode(e5)));
                            zj.setDividerPadding(new Object[]{zjVar, Boolean.TRUE}, -1962710247, 1962710261, System.identityHashCode(zjVar));
                            int i149 = f62498b;
                            i18 = ((i149 & 104) + (i149 | 104)) - 1;
                            f62499c = i18 % 128;
                            int i150 = i18 % 2;
                            z14 = false;
                        } catch (IOException e7) {
                            if (e7 instanceof aad) {
                                int i151 = f62498b;
                                int i152 = i151 & 15;
                                int i153 = (((i151 ^ 15) | i152) << 1) - ((i151 | 15) & (~i152));
                                f62499c = i153 % 128;
                                int i154 = i153 % 2;
                                z12 = false;
                            } else {
                                int i155 = f62498b;
                                int i156 = (i155 ^ 79) + ((i155 & 79) << 1);
                                f62499c = i156 % 128;
                                int i157 = i156 % 2;
                                z12 = true;
                            }
                            if (!((Boolean) setY(new Object[]{zzVar2, e7, zjVar, ykVar5, Boolean.valueOf(z12)}, 543490598, -543490594, System.identityHashCode(zzVar2))).booleanValue()) {
                                int i158 = f62499c + 105;
                                f62498b = i158 % 128;
                                int i159 = i158 % 2;
                                throw yt.setCompoundDrawableTintBlendMode(e7, (List<? extends Exception>) listPlus);
                            }
                            listPlus = CollectionsKt___CollectionsKt.plus((Collection<? extends IOException>) listPlus, e7);
                            zj.setDividerPadding(new Object[]{zjVar, Boolean.TRUE}, -1962710247, 1962710261, System.identityHashCode(zjVar));
                            int i160 = f62499c;
                            int i161 = i160 | 77;
                            int i162 = i161 << 1;
                            int i163 = -((~(i160 & 77)) & i161);
                            i18 = ((i162 | i163) << 1) - (i163 ^ i162);
                            f62498b = i18 % 128;
                            int i1510 = i18 % 2;
                            z14 = false;
                        }
                    } catch (Throwable th2) {
                        zj.setDividerPadding(new Object[]{zjVar, Boolean.TRUE}, -1962710247, 1962710261, System.identityHashCode(zjVar));
                        throw th2;
                    }
                }
                break;
        }
        return boolValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.yl
    @NotNull
    public final yr setX(@NotNull yl.setCompoundDrawableTintBlendMode p4) throws IOException {
        return (yr) setY(new Object[]{this, p4}, 1634998730, -1634998730, System.identityHashCode(this));
    }
}
