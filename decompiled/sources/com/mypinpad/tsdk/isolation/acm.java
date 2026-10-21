package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class acm implements aby {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52403r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52404s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final acp f52405p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @JvmField
    public boolean f52406q0;

    @JvmField
    @NotNull
    public final abx setCompoundDrawableTintBlendMode;

    public acm(@NotNull acp acpVar) {
        Intrinsics.checkNotNullParameter(acpVar, "");
        this.f52405p0 = acpVar;
        this.setCompoundDrawableTintBlendMode = new abx();
    }

    public static /* synthetic */ String a(Object[] objArr) {
        acm acmVar = (acm) objArr[0];
        StringBuilder sb2 = new StringBuilder("buffer(");
        sb2.append(acmVar.f52405p0);
        sb2.append(RootService.CLOSE_BRACKET);
        String string = sb2.toString();
        int i10 = f52404s0;
        int i11 = ((i10 | 31) << 1) - (i10 ^ 31);
        f52403r0 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 13 / 0;
        }
        return string;
    }

    public static /* synthetic */ Short b(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        acm acmVar = (acm) objArr[0];
        int i10 = f52403r0;
        int i11 = i10 & 101;
        int i12 = (((i10 | 101) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f52404s0 = i12 % 128;
        if (i12 % 2 == 0) {
            setCompoundDrawableTintBlendMode(new Object[]{acmVar, 2L}, -1865233071, 1865233078, System.identityHashCode(acmVar));
            abx abxVar = acmVar.setCompoundDrawableTintBlendMode;
            ((Short) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1821070445, -1821070440, System.identityHashCode(abxVar))).shortValue();
            throw null;
        }
        setCompoundDrawableTintBlendMode(new Object[]{acmVar, 2L}, -1865233071, 1865233078, System.identityHashCode(acmVar));
        abx abxVar2 = acmVar.setCompoundDrawableTintBlendMode;
        short sShortValue = ((Short) abx.setOnFocusChangeListener(new Object[]{abxVar2}, 1821070445, -1821070440, System.identityHashCode(abxVar2))).shortValue();
        int i13 = f52404s0;
        int i14 = (i13 & (-10)) | ((~i13) & 9);
        int i15 = -(-((i13 & 9) << 1));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f52403r0 = i16 % 128;
        int i17 = i16 % 2;
        return Short.valueOf(sShortValue);
    }

    public static /* synthetic */ abw c(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        acm acmVar = (acm) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i10 = f52403r0 + 69;
        f52404s0 = i10 % 128;
        if (i10 % 2 != 0) {
            setCompoundDrawableTintBlendMode(new Object[]{acmVar, Long.valueOf(jLongValue)}, -1865233071, 1865233078, System.identityHashCode(acmVar));
            return acmVar.setCompoundDrawableTintBlendMode.setY(jLongValue);
        }
        setCompoundDrawableTintBlendMode(new Object[]{acmVar, Long.valueOf(jLongValue)}, -1865233071, 1865233078, System.identityHashCode(acmVar));
        acmVar.setCompoundDrawableTintBlendMode.setY(jLongValue);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        if ((r2 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        r8 = 96 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        if (((java.lang.Boolean) setCompoundDrawableTintBlendMode(r5, 1200496636, -1200496631, java.lang.System.identityHashCode(r1))).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        if (((java.lang.Boolean) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1, java.lang.Long.valueOf(r3)}, 1200496636, -1200496631, java.lang.System.identityHashCode(r1))).booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.acm.f52403r0;
        r2 = ((r1 | 71) << 1) - (r1 ^ 71);
        com.mypinpad.tsdk.isolation.acm.f52404s0 = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void d(java.lang.Object[] r8) throws java.io.EOFException {
        /*
            r0 = 0
            r1 = r8[r0]
            com.mypinpad.tsdk.i.acm r1 = (com.mypinpad.tsdk.isolation.acm) r1
            r2 = 1
            r8 = r8[r2]
            java.lang.Number r8 = (java.lang.Number) r8
            long r3 = r8.longValue()
            int r8 = com.mypinpad.tsdk.isolation.acm.f52403r0
            r5 = r8 & 95
            r8 = r8 | 95
            int r5 = r5 + r8
            int r8 = r5 % 128
            com.mypinpad.tsdk.isolation.acm.f52404s0 = r8
            r8 = 2
            int r5 = r5 % r8
            r6 = -1200496631(0xffffffffb871e009, float:-5.7667527E-5)
            r7 = 1200496636(0x478e1ffc, float:72767.97)
            if (r5 != 0) goto L41
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r0] = r1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r5[r2] = r3
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.Object r1 = setCompoundDrawableTintBlendMode(r5, r7, r6, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 34
            int r3 = r3 / r0
            if (r1 == 0) goto L6f
            goto L5b
        L41:
            java.lang.Object[] r5 = new java.lang.Object[r8]
            r5[r0] = r1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r5[r2] = r3
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.Object r1 = setCompoundDrawableTintBlendMode(r5, r7, r6, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L5b:
            int r1 = com.mypinpad.tsdk.isolation.acm.f52403r0
            r3 = r1 | 71
            int r2 = r3 << 1
            r1 = r1 ^ 71
            int r2 = r2 - r1
            int r1 = r2 % 128
            com.mypinpad.tsdk.isolation.acm.f52404s0 = r1
            int r2 = r2 % r8
            if (r2 != 0) goto L6e
            r8 = 96
            int r8 = r8 / r0
        L6e:
            return
        L6f:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.acm.d(java.lang.Object[]):void");
    }

    public static /* synthetic */ String e(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        long j10;
        acm acmVar = (acm) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i10 = f52404s0 + 44;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        int i12 = i11 % 128;
        f52403r0 = i12;
        if (i11 % 2 == 0 ? jLongValue < 0 : jLongValue < 0) {
            int i13 = (i12 & 114) + (i12 | 114);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            f52404s0 = i14 % 128;
            int i15 = i14 % 2;
        } else {
            int i16 = (i12 & 5) + (i12 | 5);
            f52404s0 = i16 % 128;
            boolean z10 = !(i16 % 2 == 0);
            int i17 = i12 & 55;
            int i18 = (~i17) & (i12 | 55);
            int i19 = -(-(i17 << 1));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            int i21 = i20 % 128;
            f52404s0 = i21;
            int i22 = i20 % 2;
            if (z10) {
                if (jLongValue == Long.MAX_VALUE) {
                    int i23 = ((i21 ^ 27) | (i21 & 27)) << 1;
                    int i24 = -((i21 & (-28)) | ((~i21) & 27));
                    int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                    int i26 = i25 % 128;
                    f52403r0 = i26;
                    if (i25 % 2 != 0) {
                        throw null;
                    }
                    int i27 = i26 + 47;
                    f52404s0 = i27 % 128;
                    int i28 = i27 % 2;
                    j10 = Long.MAX_VALUE;
                } else {
                    j10 = jLongValue + 1;
                    int i29 = i12 ^ 87;
                    int i30 = (i12 & 87) << 1;
                    int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                    f52404s0 = i31 % 128;
                    int i32 = i31 % 2;
                }
                long jLongValue2 = ((Long) setCompoundDrawableTintBlendMode(new Object[]{acmVar, (byte) 10, Long.valueOf(j10)}, -1111783896, 1111783896, System.identityHashCode(acmVar))).longValue();
                if (jLongValue2 != -1) {
                    int i33 = f52404s0 + 61;
                    f52403r0 = i33 % 128;
                    int i34 = i33 % 2;
                    String str = (String) act.setDividerPadding(new Object[]{acmVar.setCompoundDrawableTintBlendMode, Long.valueOf(jLongValue2)}, -854819362, 854819364, (int) System.currentTimeMillis());
                    int i35 = f52404s0;
                    int i36 = i35 & 27;
                    int i37 = (i36 - (~((i35 ^ 27) | i36))) - 1;
                    f52403r0 = i37 % 128;
                    int i38 = i37 % 2;
                    return str;
                }
                if (j10 < Long.MAX_VALUE) {
                    int i39 = f52404s0;
                    int i40 = i39 & 9;
                    int i41 = (((i39 | 9) & (~i40)) - (~(-(-(i40 << 1))))) - 1;
                    f52403r0 = i41 % 128;
                    int i42 = i41 % 2;
                    if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{acmVar, Long.valueOf(j10)}, 1200496636, -1200496631, System.identityHashCode(acmVar))).booleanValue()) {
                        int i43 = f52404s0;
                        int i44 = i43 & 113;
                        int i45 = (i43 | 113) & (~i44);
                        int i46 = i44 << 1;
                        int i47 = (i45 & i46) + (i45 | i46);
                        f52403r0 = i47 % 128;
                        int i48 = i47 % 2;
                        abx abxVar = acmVar.setCompoundDrawableTintBlendMode;
                        if (((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(j10 - 1)}, 630256048, -630256030, System.identityHashCode(abxVar))).byteValue() == 13) {
                            int i49 = f52403r0;
                            int i50 = i49 & 75;
                            int i51 = i50 + ((i49 ^ 75) | i50);
                            f52404s0 = i51 % 128;
                            int i52 = i51 % 2;
                            if (!(!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{acmVar, Long.valueOf(1 + j10)}, 1200496636, -1200496631, System.identityHashCode(acmVar))).booleanValue())) {
                                int i53 = f52404s0;
                                int i54 = ((i53 ^ 15) | (i53 & 15)) << 1;
                                int i55 = -(((~i53) & 15) | (i53 & (-16)));
                                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                                f52403r0 = i56 % 128;
                                int i57 = i56 % 2;
                                abx abxVar2 = acmVar.setCompoundDrawableTintBlendMode;
                                if (((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar2, Long.valueOf(j10)}, 630256048, -630256030, System.identityHashCode(abxVar2))).byteValue() == 10) {
                                    int i58 = f52404s0;
                                    int i59 = ((i58 | 17) << 1) - (i58 ^ 17);
                                    f52403r0 = i59 % 128;
                                    if (i59 % 2 == 0) {
                                        return (String) act.setDividerPadding(new Object[]{acmVar.setCompoundDrawableTintBlendMode, Long.valueOf(j10)}, -854819362, 854819364, (int) System.currentTimeMillis());
                                    }
                                    int i60 = 39 / 0;
                                    return (String) act.setDividerPadding(new Object[]{acmVar.setCompoundDrawableTintBlendMode, Long.valueOf(j10)}, -854819362, 854819364, (int) System.currentTimeMillis());
                                }
                            }
                        }
                    }
                }
                abx abxVar3 = new abx();
                abx abxVar4 = acmVar.setCompoundDrawableTintBlendMode;
                abxVar4.setOnFocusChangeListener(abxVar3, 0L, Math.min(32L, ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar4}, 1395393434, -1395393402, System.identityHashCode(abxVar4))).longValue()));
                StringBuilder sb2 = new StringBuilder("\\n not found: limit=");
                sb2.append(Math.min(acmVar.setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(), jLongValue));
                sb2.append(" content=");
                sb2.append(abxVar3.setIncludeFontPadding().setLayoutAnimation());
                sb2.append(Typography.ellipsis);
                throw new EOFException(sb2.toString());
            }
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("limit < 0: ", Long.valueOf(jLongValue)).toString());
    }

    public static /* synthetic */ Integer f(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        int onLongClickListener;
        acm acmVar = (acm) objArr[0];
        int i10 = f52403r0;
        int i11 = i10 ^ 79;
        int i12 = -(-((i10 & 79) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        f52404s0 = i13 % 128;
        if (i13 % 2 == 0) {
            setCompoundDrawableTintBlendMode(new Object[]{acmVar, 4L}, -1865233071, 1865233078, System.identityHashCode(acmVar));
            onLongClickListener = acmVar.setCompoundDrawableTintBlendMode.setOnLongClickListener();
            int i14 = 66 / 0;
        } else {
            setCompoundDrawableTintBlendMode(new Object[]{acmVar, 4L}, -1865233071, 1865233078, System.identityHashCode(acmVar));
            onLongClickListener = acmVar.setCompoundDrawableTintBlendMode.setOnLongClickListener();
        }
        int i15 = f52403r0;
        int i16 = (i15 | 35) << 1;
        int i17 = -(((~i15) & 35) | (i15 & (-36)));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f52404s0 = i18 % 128;
        int i19 = i18 % 2;
        return Integer.valueOf(onLongClickListener);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x014a  */
    /* JADX WARN: Code duplicated, block: B:19:0x014e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0162  */
    /* JADX WARN: Code duplicated, block: B:24:0x0167  */
    /* JADX WARN: Code duplicated, block: B:26:0x016b  */
    /* JADX WARN: Code duplicated, block: B:28:0x016f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0186  */
    /* JADX WARN: Code duplicated, block: B:33:0x018c  */
    /* JADX WARN: Code duplicated, block: B:38:0x020a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0214  */
    /* JADX WARN: Code duplicated, block: B:48:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0191 A[SYNTHETIC] */
    public static /* synthetic */ Long g(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        int i10;
        int i11;
        int i12;
        acm acmVar = (acm) objArr[0];
        System.identityHashCode(acmVar);
        int iIdentityHashCode = System.identityHashCode(acmVar);
        int i13 = ~iIdentityHashCode;
        int i14 = ((i13 | iIdentityHashCode) & i13) | (-146938729);
        int i15 = ~i14;
        int i16 = (i14 | i15) & i15;
        int i17 = (i16 & 374232631) | ((~i16) & 374232631) | ((-374232632) & i16);
        int i18 = ~(((-146938729) & iIdentityHashCode) | (146938728 & i13) | (146938728 & iIdentityHashCode));
        int i19 = ((~i18) & i17) | ((~i17) & i18);
        int i20 = i17 & i18;
        int i21 = -(-(((i20 & i19) | (i19 ^ i20)) * (-564)));
        int i22 = ((~i21) & 1655577008) | ((-1655577009) & i21);
        int i23 = -(-((i21 & 1655577008) << 1));
        int i24 = (i22 & i23) + (i23 | i22);
        int i25 = 516841343 & iIdentityHashCode;
        int i26 = (iIdentityHashCode | 516841343) & (~i25);
        int i27 = (~((i26 & i25) | (i26 ^ i25))) * 1128;
        int i28 = i24 | i27;
        int i29 = (i28 << 1) - ((~(i27 & i24)) & i28);
        int i30 = ~((374232631 ^ i13) | (i13 & 374232631));
        int i31 = ((-369902616) & i30) | ((~i30) & 369902615);
        int i32 = i30 & 369902615;
        int i33 = -(-(((i32 & i31) | (i31 ^ i32)) * 564));
        int i34 = i29 & i33;
        int i35 = (i33 | i29) & (~i34);
        int i36 = -(-(i34 << 1));
        if (252467633 <= ((i35 | i36) << 1) - (i35 ^ i36)) {
            setCompoundDrawableTintBlendMode(new Object[]{acmVar, 0L}, -1865233071, 1865233078, System.identityHashCode(acmVar));
            i10 = 1;
        } else {
            setCompoundDrawableTintBlendMode(new Object[]{acmVar, 1L}, -1865233071, 1865233078, System.identityHashCode(acmVar));
            i10 = 0;
        }
        int i37 = f52403r0;
        int i38 = i37 & 29;
        int i39 = (((i37 ^ 29) | i38) << 1) - ((i37 | 29) & (~i38));
        f52404s0 = i39 % 128;
        while (true) {
            int i40 = i39 % 2;
            int i41 = i10 & 1;
            int i42 = (~i41) & (i10 | 1);
            if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{acmVar, Long.valueOf((i42 - (~(-(-(i41 << 1))))) - 1)}, 1200496636, -1200496631, System.identityHashCode(acmVar))).booleanValue()) {
                int i43 = f52404s0;
                int i44 = (i43 & 49) + (i43 | 49);
                f52403r0 = i44 % 128;
                int i45 = i44 % 2;
                abx abxVar = acmVar.setCompoundDrawableTintBlendMode;
                byte bByteValue = ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(i10)}, 630256048, -630256030, System.identityHashCode(abxVar))).byteValue();
                if (bByteValue >= 48) {
                    int i46 = (-2) - ((f52403r0 + 16) ^ (-1));
                    f52404s0 = i46 % 128;
                    if (i46 % 2 == 0) {
                        if (bByteValue <= 21) {
                            continue;
                        } else if (bByteValue >= 97) {
                            int i47 = f52404s0;
                            int i48 = i47 ^ 57;
                            int i49 = ((i47 & 57) | i48) << 1;
                            int i50 = -i48;
                            i12 = (i49 ^ i50) + ((i49 & i50) << 1);
                            f52403r0 = i12 % 128;
                            if (i12 % 2 != 0) {
                                if (bByteValue > 104) {
                                    if (bByteValue >= 65) {
                                        int i51 = f52404s0;
                                        int i52 = i51 | 23;
                                        int i53 = i52 << 1;
                                        int i54 = -((~(i51 & 23)) & i52);
                                        i11 = ((i53 | i54) << 1) - (i54 ^ i53);
                                        f52403r0 = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            if (bByteValue > 14) {
                                            }
                                        } else if (bByteValue > 70) {
                                        }
                                    }
                                    if (i10 == 0) {
                                        String string = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                                        Intrinsics.checkNotNullExpressionValue(string, "");
                                        throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", string));
                                    }
                                    int i55 = f52403r0 + 99;
                                    f52404s0 = i55 % 128;
                                    int i56 = i55 % 2;
                                } else {
                                    continue;
                                }
                            } else if (bByteValue > 102) {
                                if (bByteValue >= 65) {
                                    int i57 = f52404s0;
                                    int i58 = i57 | 23;
                                    int i59 = i58 << 1;
                                    int i510 = -((~(i57 & 23)) & i58);
                                    i11 = ((i59 | i510) << 1) - (i510 ^ i59);
                                    f52403r0 = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        if (bByteValue > 14) {
                                        }
                                    } else if (bByteValue > 70) {
                                    }
                                }
                                if (i10 == 0) {
                                    String string2 = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                                    Intrinsics.checkNotNullExpressionValue(string2, "");
                                    throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", string2));
                                }
                                int i511 = f52403r0 + 99;
                                f52404s0 = i511 % 128;
                                int i512 = i511 % 2;
                            } else {
                                continue;
                            }
                        } else {
                            if (bByteValue >= 65) {
                                int i513 = f52404s0;
                                int i514 = i513 | 23;
                                int i515 = i514 << 1;
                                int i516 = -((~(i513 & 23)) & i514);
                                i11 = ((i515 | i516) << 1) - (i516 ^ i515);
                                f52403r0 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    if (bByteValue > 14) {
                                    }
                                } else if (bByteValue > 70) {
                                }
                            }
                            if (i10 == 0) {
                                String string3 = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                                Intrinsics.checkNotNullExpressionValue(string3, "");
                                throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", string3));
                            }
                            int i517 = f52403r0 + 99;
                            f52404s0 = i517 % 128;
                            int i518 = i517 % 2;
                        }
                    } else if (bByteValue <= 57) {
                        continue;
                    } else if (bByteValue >= 97) {
                        int i410 = f52404s0;
                        int i411 = i410 ^ 57;
                        int i412 = ((i410 & 57) | i411) << 1;
                        int i519 = -i411;
                        i12 = (i412 ^ i519) + ((i412 & i519) << 1);
                        f52403r0 = i12 % 128;
                        if (i12 % 2 != 0) {
                            if (bByteValue > 104) {
                                if (bByteValue >= 65) {
                                    int i5110 = f52404s0;
                                    int i5111 = i5110 | 23;
                                    int i5112 = i5111 << 1;
                                    int i5113 = -((~(i5110 & 23)) & i5111);
                                    i11 = ((i5112 | i5113) << 1) - (i5113 ^ i5112);
                                    f52403r0 = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        if (bByteValue > 14) {
                                        }
                                    } else if (bByteValue > 70) {
                                    }
                                }
                                if (i10 == 0) {
                                    String string4 = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                                    Intrinsics.checkNotNullExpressionValue(string4, "");
                                    throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", string4));
                                }
                                int i5114 = f52403r0 + 99;
                                f52404s0 = i5114 % 128;
                                int i5115 = i5114 % 2;
                            } else {
                                continue;
                            }
                        } else if (bByteValue > 102) {
                            if (bByteValue >= 65) {
                                int i5116 = f52404s0;
                                int i5117 = i5116 | 23;
                                int i5118 = i5117 << 1;
                                int i5119 = -((~(i5116 & 23)) & i5117);
                                i11 = ((i5118 | i5119) << 1) - (i5119 ^ i5118);
                                f52403r0 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    if (bByteValue > 14) {
                                    }
                                } else if (bByteValue > 70) {
                                }
                            }
                            if (i10 == 0) {
                                String string5 = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                                Intrinsics.checkNotNullExpressionValue(string5, "");
                                throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", string5));
                            }
                            int i51110 = f52403r0 + 99;
                            f52404s0 = i51110 % 128;
                            int i51111 = i51110 % 2;
                        } else {
                            continue;
                        }
                    } else {
                        if (bByteValue >= 65) {
                            int i51112 = f52404s0;
                            int i51113 = i51112 | 23;
                            int i51114 = i51113 << 1;
                            int i51115 = -((~(i51112 & 23)) & i51113);
                            i11 = ((i51114 | i51115) << 1) - (i51115 ^ i51114);
                            f52403r0 = i11 % 128;
                            if (i11 % 2 != 0) {
                                if (bByteValue > 14) {
                                }
                            } else if (bByteValue > 70) {
                            }
                        }
                        if (i10 == 0) {
                            String string6 = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                            Intrinsics.checkNotNullExpressionValue(string6, "");
                            throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", string6));
                        }
                        int i51116 = f52403r0 + 99;
                        f52404s0 = i51116 % 128;
                        int i51117 = i51116 % 2;
                    }
                } else if (bByteValue >= 97) {
                    int i413 = f52404s0;
                    int i414 = i413 ^ 57;
                    int i415 = ((i413 & 57) | i414) << 1;
                    int i5120 = -i414;
                    i12 = (i415 ^ i5120) + ((i415 & i5120) << 1);
                    f52403r0 = i12 % 128;
                    if (i12 % 2 != 0) {
                        if (bByteValue > 104) {
                            if (bByteValue >= 65) {
                                int i51118 = f52404s0;
                                int i51119 = i51118 | 23;
                                int i511110 = i51119 << 1;
                                int i511111 = -((~(i51118 & 23)) & i51119);
                                i11 = ((i511110 | i511111) << 1) - (i511111 ^ i511110);
                                f52403r0 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    if (bByteValue > 14) {
                                    }
                                } else if (bByteValue > 70) {
                                }
                            }
                            if (i10 == 0) {
                                String string7 = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                                Intrinsics.checkNotNullExpressionValue(string7, "");
                                throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", string7));
                            }
                            int i511112 = f52403r0 + 99;
                            f52404s0 = i511112 % 128;
                            int i511113 = i511112 % 2;
                        } else {
                            continue;
                        }
                    } else if (bByteValue > 102) {
                        if (bByteValue >= 65) {
                            int i511114 = f52404s0;
                            int i511115 = i511114 | 23;
                            int i511116 = i511115 << 1;
                            int i511117 = -((~(i511114 & 23)) & i511115);
                            i11 = ((i511116 | i511117) << 1) - (i511117 ^ i511116);
                            f52403r0 = i11 % 128;
                            if (i11 % 2 != 0) {
                                if (bByteValue > 14) {
                                }
                            } else if (bByteValue > 70) {
                            }
                        }
                        if (i10 == 0) {
                            String string8 = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                            Intrinsics.checkNotNullExpressionValue(string8, "");
                            throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", string8));
                        }
                        int i511118 = f52403r0 + 99;
                        f52404s0 = i511118 % 128;
                        int i511119 = i511118 % 2;
                    } else {
                        continue;
                    }
                } else {
                    if (bByteValue >= 65) {
                        int i5111110 = f52404s0;
                        int i5111111 = i5111110 | 23;
                        int i5111112 = i5111111 << 1;
                        int i5111113 = -((~(i5111110 & 23)) & i5111111);
                        i11 = ((i5111112 | i5111113) << 1) - (i5111113 ^ i5111112);
                        f52403r0 = i11 % 128;
                        if (i11 % 2 != 0) {
                            if (bByteValue > 14) {
                            }
                        } else if (bByteValue > 70) {
                        }
                    }
                    if (i10 == 0) {
                        String string9 = Integer.toString(bByteValue, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                        Intrinsics.checkNotNullExpressionValue(string9, "");
                        throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", string9));
                    }
                    int i5111114 = f52403r0 + 99;
                    f52404s0 = i5111114 % 128;
                    int i5111115 = i5111114 % 2;
                }
                int iIdentityHashCode2 = System.identityHashCode(acmVar);
                int i60 = -(-(i10 * (-493)));
                int i61 = (495 & i60) + (i60 | 495);
                int i62 = ~i10;
                int i63 = (i62 | i10) & i62;
                int i64 = -(-(((i63 & 1) | (i63 ^ 1)) * (-988)));
                int i65 = i61 ^ i64;
                int i66 = (((i64 & i61) | i65) << 1) - i65;
                int i67 = i10 ^ (-2);
                int i68 = i10 & (-2);
                int i69 = (i67 & i68) | (i67 ^ i68);
                int i70 = ~iIdentityHashCode2;
                int i71 = (iIdentityHashCode2 | i70) & i70;
                int i72 = i66 - (~(((i69 & i71) | (i69 ^ i71)) * 494));
                int i73 = (i72 ^ (-1)) + (i72 << 1);
                int i74 = ((~i62) & (-2)) | (i62 & 1);
                int i75 = (-2) & i62;
                int i76 = ~((i75 & i74) | (i74 ^ i75));
                int i77 = ~((i10 & i71) | (i71 ^ i10));
                int i78 = i76 & i77;
                int i79 = (i77 | i76) & (~i78);
                int i80 = (i79 & i78) | (i79 ^ i78);
                int i81 = ~((i41 & i42) | (i42 ^ i41));
                int i82 = -(-(((i80 & i81) | (i80 ^ i81)) * 494));
                int i83 = i73 & i82;
                int i84 = (i82 | i73) & (~i83);
                int i85 = i83 << 1;
                i10 = (i84 | i85) + (i84 & i85);
                int i86 = f52403r0;
                i39 = ((i86 ^ 68) + ((i86 & 68) << 1)) - 1;
                f52404s0 = i39 % 128;
            }
            abx abxVar2 = acmVar.setCompoundDrawableTintBlendMode;
            long jLongValue = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar2}, -1423871344, 1423871374, System.identityHashCode(abxVar2))).longValue();
            int i87 = (-2) - ((f52404s0 + 46) ^ (-1));
            f52403r0 = i87 % 128;
            if (i87 % 2 == 0) {
                return Long.valueOf(jLongValue);
            }
            throw null;
        }
    }

    public static /* synthetic */ void h(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        acm acmVar = (acm) objArr[0];
        int i10 = f52404s0;
        int i11 = ((i10 | 61) << 1) - ((i10 & (-62)) | ((~i10) & 61));
        f52403r0 = i11 % 128;
        if (i11 % 2 != 0) {
            boolean z10 = acmVar.f52406q0;
            throw null;
        }
        if (!acmVar.f52406q0) {
            int i12 = (i10 ^ 57) + ((i10 & 57) << 1);
            f52403r0 = i12 % 128;
            int i13 = i12 % 2;
            acmVar.f52406q0 = true;
            acmVar.f52405p0.close();
            abx abxVar = acmVar.setCompoundDrawableTintBlendMode;
            abx.setOnFocusChangeListener(new Object[]{abxVar}, 502611487, -502611445, System.identityHashCode(abxVar));
            int i14 = f52403r0;
            int i15 = (i14 & (-10)) | ((~i14) & 9);
            int i16 = -(-((i14 & 9) << 1));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            f52404s0 = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = f52404s0;
        int i20 = ((((i19 ^ 95) | (i19 & 95)) << 1) - (~(-(((~i19) & 95) | (i19 & (-96)))))) - 1;
        f52403r0 = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 96 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.abx.setOnFocusChangeListener(new java.lang.Object[]{r1}, -1474615858, 1474615886, java.lang.System.identityHashCode(r1))).booleanValue()) == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.acm.f52403r0;
        r2 = r1 & 125;
        r1 = (r1 | 125) & (~r2);
        r2 = -(-(r2 << 1));
        r4 = ((r1 | r2) << 1) - (r1 ^ r2);
        com.mypinpad.tsdk.isolation.acm.f52404s0 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
    
        if (r6.f52405p0.setY(r6.setCompoundDrawableTintBlendMode, com.mastercard.sonic.androidsvg.SvgConstantsKt.SPECIFIED_FONT_FAMILY) != (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.acm.f52403r0;
        r1 = r6 & 47;
        r6 = (r6 ^ 47) | r1;
        r2 = ((r1 | r6) << 1) - (r6 ^ r1);
        com.mypinpad.tsdk.isolation.acm.f52404s0 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.acm.f52403r0;
        r0 = ((r6 & 4) + (r6 | 4)) - 1;
        com.mypinpad.tsdk.isolation.acm.f52404s0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r6 = ((r1 | 55) << 1) - (r1 ^ 55);
        com.mypinpad.tsdk.isolation.acm.f52404s0 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        throw new java.lang.IllegalStateException("closed".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r6.f52406q0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((!r6.f52406q0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r2 = ((r1 | 101) << 1) - (r1 ^ 101);
        com.mypinpad.tsdk.isolation.acm.f52404s0 = r2 % 128;
        r2 = r2 % 2;
        r1 = r6.setCompoundDrawableTintBlendMode;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean i(java.lang.Object[] r6) {
        /*
            r0 = 0
            r6 = r6[r0]
            com.mypinpad.tsdk.i.acm r6 = (com.mypinpad.tsdk.isolation.acm) r6
            int r1 = com.mypinpad.tsdk.isolation.acm.f52404s0
            r2 = r1 & (-18)
            int r3 = ~r1
            r4 = 17
            r3 = r3 & r4
            r2 = r2 | r3
            r1 = r1 & r4
            r3 = 1
            int r1 = r1 << r3
            r4 = r2 & r1
            r1 = r1 | r2
            int r4 = r4 + r1
            int r1 = r4 % 128
            com.mypinpad.tsdk.isolation.acm.f52403r0 = r1
            int r4 = r4 % 2
            if (r4 == 0) goto L25
            boolean r2 = r6.f52406q0
            r4 = 68
            int r4 = r4 / r0
            if (r2 != 0) goto La5
            goto L2a
        L25:
            boolean r2 = r6.f52406q0
            r2 = r2 ^ r3
            if (r2 == 0) goto La5
        L2a:
            r2 = r1 | 101(0x65, float:1.42E-43)
            int r2 = r2 << r3
            r1 = r1 ^ 101(0x65, float:1.42E-43)
            int r2 = r2 - r1
            int r1 = r2 % 128
            com.mypinpad.tsdk.isolation.acm.f52404s0 = r1
            int r2 = r2 % 2
            com.mypinpad.tsdk.i.abx r1 = r6.setCompoundDrawableTintBlendMode
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r0] = r1
            int r1 = java.lang.System.identityHashCode(r1)
            r4 = -1474615858(0xffffffffa81b25ce, float:-8.612426E-15)
            r5 = 1474615886(0x57e4da4e, float:5.0325253E14)
            java.lang.Object r1 = com.mypinpad.tsdk.isolation.abx.setOnFocusChangeListener(r2, r4, r5, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r3
            if (r1 == r3) goto L94
            int r1 = com.mypinpad.tsdk.isolation.acm.f52403r0
            r2 = r1 & 125(0x7d, float:1.75E-43)
            int r4 = ~r2
            r1 = r1 | 125(0x7d, float:1.75E-43)
            r1 = r1 & r4
            int r2 = r2 << r3
            int r2 = -r2
            int r2 = -r2
            r4 = r1 | r2
            int r4 = r4 << r3
            r1 = r1 ^ r2
            int r4 = r4 - r1
            int r1 = r4 % 128
            com.mypinpad.tsdk.isolation.acm.f52404s0 = r1
            int r4 = r4 % 2
            com.mypinpad.tsdk.i.abx r1 = r6.setCompoundDrawableTintBlendMode
            r4 = 8192(0x2000, double:4.0474E-320)
            com.mypinpad.tsdk.i.acp r6 = r6.f52405p0
            long r1 = r6.setY(r1, r4)
            r4 = -1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L94
            int r6 = com.mypinpad.tsdk.isolation.acm.f52403r0
            r1 = r6 & 47
            r6 = r6 ^ 47
            r6 = r6 | r1
            r2 = r1 | r6
            int r2 = r2 << r3
            r6 = r6 ^ r1
            int r2 = r2 - r6
            int r6 = r2 % 128
            com.mypinpad.tsdk.isolation.acm.f52404s0 = r6
            int r2 = r2 % 2
            if (r2 != 0) goto L8e
            goto L8f
        L8e:
            r0 = r3
        L8f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L94:
            int r6 = com.mypinpad.tsdk.isolation.acm.f52403r0
            r0 = r6 & 4
            r6 = r6 | 4
            int r0 = r0 + r6
            int r0 = r0 - r3
            int r6 = r0 % 128
            com.mypinpad.tsdk.isolation.acm.f52404s0 = r6
            int r0 = r0 % 2
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        La5:
            r6 = r1 | 55
            int r6 = r6 << r3
            r0 = r1 ^ 55
            int r6 = r6 - r0
            int r0 = r6 % 128
            com.mypinpad.tsdk.isolation.acm.f52404s0 = r0
            int r6 = r6 % 2
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.acm.i(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ Short j(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        short sShortValue;
        acm acmVar = (acm) objArr[0];
        int i10 = f52403r0;
        int i11 = ((i10 | 83) << 1) - (i10 ^ 83);
        f52404s0 = i11 % 128;
        if (i11 % 2 == 0) {
            setCompoundDrawableTintBlendMode(new Object[]{acmVar, 2L}, -1865233071, 1865233078, System.identityHashCode(acmVar));
            abx abxVar = acmVar.setCompoundDrawableTintBlendMode;
            sShortValue = ((Short) abx.setOnFocusChangeListener(new Object[]{abxVar}, -998075784, 998075787, System.identityHashCode(abxVar))).shortValue();
            int i12 = 94 / 0;
        } else {
            setCompoundDrawableTintBlendMode(new Object[]{acmVar, 2L}, -1865233071, 1865233078, System.identityHashCode(acmVar));
            abx abxVar2 = acmVar.setCompoundDrawableTintBlendMode;
            sShortValue = ((Short) abx.setOnFocusChangeListener(new Object[]{abxVar2}, -998075784, 998075787, System.identityHashCode(abxVar2))).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    public static /* synthetic */ Integer k(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        acm acmVar = (acm) objArr[0];
        int i10 = f52404s0;
        int i11 = i10 & 117;
        int i12 = ((i10 | 117) & (~i11)) + (i11 << 1);
        f52403r0 = i12 % 128;
        int i13 = i12 % 2;
        setCompoundDrawableTintBlendMode(new Object[]{acmVar, 4L}, -1865233071, 1865233078, System.identityHashCode(acmVar));
        int layoutAnimation = acmVar.setCompoundDrawableTintBlendMode.setLayoutAnimation();
        int i14 = f52404s0 + 119;
        f52403r0 = i14 % 128;
        if (i14 % 2 == 0) {
            return Integer.valueOf(layoutAnimation);
        }
        throw null;
    }

    public static /* synthetic */ Long l(Object[] objArr) {
        int i10;
        int i11 = 0;
        acm acmVar = (acm) objArr[0];
        byte bByteValue = ((Byte) objArr[1]).byteValue();
        int i12 = 2;
        long jLongValue = ((Number) objArr[2]).longValue();
        int i13 = f52404s0;
        int i14 = ((i13 & 59) - (~(i13 | 59))) - 1;
        int i15 = i14 % 128;
        f52403r0 = i15;
        int i16 = i14 % 2;
        if (acmVar.f52406q0) {
            int i17 = i13 & 91;
            int i18 = ((i13 ^ 91) | i17) << 1;
            int i19 = -((~i17) & (i13 | 91));
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            f52403r0 = i20 % 128;
            int i21 = i20 % 2;
        } else {
            int i22 = (i15 & (-80)) | ((~i15) & 79);
            int i23 = (i15 & 79) << 1;
            int i24 = (i22 & i23) + (i22 | i23);
            f52404s0 = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = (i15 & 23) + (i15 | 23);
                int i26 = i25 % 128;
                f52404s0 = i26;
                long jMax = 0;
                if (i25 % 2 != 0 ? 0 > jLongValue : 0 > jLongValue) {
                    int i27 = (i15 ^ 104) + ((i15 & 104) << 1);
                    int i28 = (i27 ^ (-1)) + (i27 << 1);
                    f52404s0 = i28 % 128;
                    int i29 = i28 % 2;
                    StringBuilder sb2 = new StringBuilder("fromIndex=0 toIndex=");
                    sb2.append(jLongValue);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                int i30 = i26 + 17;
                f52403r0 = i30 % 128;
                int i31 = i30 % 2;
                int i32 = ((i26 ^ 57) | (i26 & 57)) << 1;
                int i33 = -(((~i26) & 57) | (i26 & (-58)));
                int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                f52403r0 = i34 % 128;
                int i35 = i34 % 2;
                while (jMax < jLongValue) {
                    int i36 = f52404s0;
                    int i37 = (i36 & 45) + (i36 | 45);
                    f52403r0 = i37 % 128;
                    int i38 = i37 % i12;
                    abx abxVar = acmVar.setCompoundDrawableTintBlendMode;
                    Object[] objArr2 = new Object[4];
                    objArr2[i11] = abxVar;
                    objArr2[1] = Byte.valueOf(bByteValue);
                    objArr2[i12] = Long.valueOf(jMax);
                    objArr2[3] = Long.valueOf(jLongValue);
                    long jLongValue2 = ((Long) abx.setOnFocusChangeListener(objArr2, 268946389, -268946363, System.identityHashCode(abxVar))).longValue();
                    if (jLongValue2 != -1) {
                        int i39 = f52403r0;
                        int i40 = ((i39 ^ 27) | (i39 & 27)) << 1;
                        int i41 = -((i39 & (-28)) | ((~i39) & 27));
                        int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
                        f52404s0 = i42 % 128;
                        if (i42 % i12 == 0) {
                            int i43 = 22 / i11;
                        }
                        int i44 = ((i39 & 95) - (~(-(-(i39 | 95))))) - 1;
                        f52404s0 = i44 % 128;
                        int i45 = i44 % i12;
                        return Long.valueOf(jLongValue2);
                    }
                    abx abxVar2 = acmVar.setCompoundDrawableTintBlendMode;
                    Object[] objArr3 = new Object[1];
                    objArr3[i11] = abxVar2;
                    long jLongValue3 = ((Long) abx.setOnFocusChangeListener(objArr3, 1395393434, -1395393402, System.identityHashCode(abxVar2))).longValue();
                    if (jLongValue3 < jLongValue) {
                        int i46 = f52404s0;
                        int i47 = i46 & 23;
                        int i48 = (((~i47) & (i46 | 23)) - (~(i47 << 1))) - 1;
                        f52403r0 = i48 % 128;
                        int i49 = i48 % i12;
                        long j10 = jLongValue;
                        if (acmVar.f52405p0.setY(acmVar.setCompoundDrawableTintBlendMode, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                            i10 = 2;
                        } else {
                            jMax = Math.max(jMax, jLongValue3);
                            int i50 = f52403r0;
                            int i51 = (i50 & (-58)) | ((~i50) & 57);
                            int i52 = (i50 & 57) << 1;
                            int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                            f52404s0 = i53 % 128;
                            int i54 = i53 % 2;
                            i12 = 2;
                            jLongValue = j10;
                            i11 = 0;
                        }
                    } else {
                        i10 = i12;
                    }
                    int i55 = f52403r0 + 77;
                    f52404s0 = i55 % 128;
                    int i56 = i55 % i10;
                    return -1L;
                }
                int i57 = f52403r0 + 19;
                f52404s0 = i57 % 128;
                if (i57 % i12 != 0) {
                    return -1L;
                }
                throw null;
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    public static /* synthetic */ Integer m(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        acm acmVar = (acm) objArr[0];
        aci aciVar = (aci) objArr[1];
        int i10 = f52404s0;
        int i11 = i10 & 23;
        int i12 = (i10 | 23) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f52403r0 = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(aciVar, "");
        if (!(!acmVar.f52406q0)) {
            int i16 = f52404s0;
            int i17 = i16 & 49;
            int i18 = -(-((i16 ^ 49) | i17));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f52403r0 = i19 % 128;
            int i20 = i19 % 2;
            throw new IllegalStateException("closed".toString());
        }
        int i21 = f52404s0 + 71;
        int i22 = i21 % 128;
        f52403r0 = i22;
        int i23 = i21 % 2;
        int i24 = (i22 ^ 115) + ((i22 & 115) << 1);
        f52404s0 = i24 % 128;
        int i25 = i24 % 2;
        do {
            int iIntValue = ((Integer) act.setDividerPadding(new Object[]{acmVar.setCompoundDrawableTintBlendMode, aciVar, Boolean.TRUE}, -657714353, 657714356, (int) System.currentTimeMillis())).intValue();
            if (iIntValue != -2) {
                if (iIntValue == -1) {
                    int i26 = f52403r0 + 103;
                    f52404s0 = i26 % 128;
                    if (i26 % 2 != 0) {
                        return -1;
                    }
                    throw null;
                }
                abw abwVar = ((abw[]) aci.setOnFocusChangeListener(new Object[]{aciVar}, 642933220, -642933215, System.identityHashCode(aciVar)))[iIntValue];
                int iIntValue2 = ((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue();
                abx abxVar = acmVar.setCompoundDrawableTintBlendMode;
                abx.setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(iIntValue2)}, -1525846840, 1525846865, System.identityHashCode(abxVar));
                int i27 = f52403r0;
                int i28 = (i27 & 37) + (i27 | 37);
                f52404s0 = i28 % 128;
                if (i28 % 2 != 0) {
                    return Integer.valueOf(iIntValue);
                }
                int i29 = 5 / 0;
                return Integer.valueOf(iIntValue);
            }
        } while (acmVar.f52405p0.setY(acmVar.setCompoundDrawableTintBlendMode, SvgConstantsKt.SPECIFIED_FONT_FAMILY) != -1);
        int i30 = f52404s0;
        int i31 = (i30 ^ 41) + ((i30 & 41) << 1);
        f52403r0 = i31 % 128;
        if (i31 % 2 == 0) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ acq n(Object[] objArr) {
        acm acmVar = (acm) objArr[0];
        int i10 = f52403r0 + 99;
        f52404s0 = i10 % 128;
        if (i10 % 2 != 0) {
            return acmVar.f52405p0.setY();
        }
        acmVar.f52405p0.setY();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x011b  */
    /* JADX WARN: Code duplicated, block: B:29:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:31:0x020b  */
    /* JADX WARN: Code duplicated, block: B:49:0x02ca  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException {
        Object onFocusChangeListener;
        Object objValueOf;
        int i13;
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i10;
        long j10 = 1;
        switch (((~(i16 | (~i12) | i11)) * 501) + ((~(i14 | i16)) * 1002) + ((i15 | (~(i16 | i11 | i12))) * 501) + (i11 * (-500)) + (i10 * (-500))) {
            case 1:
                return m(objArr);
            case 2:
                acm acmVar = (acm) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                int i17 = f52404s0;
                int i18 = ((i17 ^ 77) | (i17 & 77)) << 1;
                int i19 = -(((~i17) & 77) | (i17 & (-78)));
                int i20 = (i18 & i19) + (i19 | i18);
                f52403r0 = i20 % 128;
                int i21 = i20 % 2;
                setCompoundDrawableTintBlendMode(new Object[]{acmVar, Long.valueOf(jLongValue)}, -1865233071, 1865233078, System.identityHashCode(acmVar));
                abx abxVar = acmVar.setCompoundDrawableTintBlendMode;
                byte[] bArr = (byte[]) abx.setOnFocusChangeListener(new Object[]{abxVar, Long.valueOf(jLongValue)}, 1697003307, -1697003267, System.identityHashCode(abxVar));
                int i22 = f52403r0;
                int i23 = i22 & 53;
                int i24 = -(-((i22 ^ 53) | i23));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                f52404s0 = i25 % 128;
                int i26 = i25 % 2;
                return bArr;
            case 3:
                acm acmVar2 = (acm) objArr[0];
                int i27 = f52404s0 + 114;
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                f52403r0 = i28 % 128;
                int i29 = i28 % 2;
                long jLongValue2 = ((Long) setCompoundDrawableTintBlendMode(new Object[]{acmVar2, (byte) 0, Long.MAX_VALUE}, -1111783896, 1111783896, System.identityHashCode(acmVar2))).longValue();
                int i30 = f52404s0;
                int i31 = i30 ^ 1;
                int i32 = ((i30 & 1) | i31) << 1;
                int i33 = -i31;
                int i34 = (i32 & i33) + (i32 | i33);
                f52403r0 = i34 % 128;
                int i35 = i34 % 2;
                return Long.valueOf(jLongValue2);
            case 4:
                acm acmVar3 = (acm) objArr[0];
                int i36 = f52403r0;
                int i37 = (((i36 ^ 55) | (i36 & 55)) << 1) - (((~i36) & 55) | (i36 & (-56)));
                f52404s0 = i37 % 128;
                if (i37 % 2 == 0) {
                    setCompoundDrawableTintBlendMode(new Object[]{acmVar3, 1L}, -1865233071, 1865233078, System.identityHashCode(acmVar3));
                    abx abxVar2 = acmVar3.setCompoundDrawableTintBlendMode;
                    onFocusChangeListener = abx.setOnFocusChangeListener(new Object[]{abxVar2}, 33298663, -33298647, System.identityHashCode(abxVar2));
                } else {
                    setCompoundDrawableTintBlendMode(new Object[]{acmVar3, 1L}, -1865233071, 1865233078, System.identityHashCode(acmVar3));
                    abx abxVar3 = acmVar3.setCompoundDrawableTintBlendMode;
                    onFocusChangeListener = abx.setOnFocusChangeListener(new Object[]{abxVar3}, 33298663, -33298647, System.identityHashCode(abxVar3));
                }
                return Byte.valueOf(((Byte) onFocusChangeListener).byteValue());
            case 5:
                acm acmVar4 = (acm) objArr[0];
                long jLongValue3 = ((Number) objArr[1]).longValue();
                int i38 = f52404s0;
                int i39 = i38 + 1;
                int i40 = i39 % 128;
                f52403r0 = i40;
                int i41 = i39 % 2;
                if (jLongValue3 < 0) {
                    int i42 = i40 & 115;
                    int i43 = i42 + ((i40 ^ 115) | i42);
                    f52404s0 = i43 % 128;
                    int i44 = i43 % 2;
                    throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(jLongValue3)).toString());
                }
                int i45 = (i38 ^ 71) + ((i38 & 71) << 1);
                f52403r0 = i45 % 128;
                int i46 = i45 % 2;
                int i47 = i38 & 53;
                int i48 = ((~i47) & (i38 | 53)) + (i47 << 1);
                int i49 = i48 % 128;
                f52403r0 = i49;
                int i50 = i48 % 2;
                if (acmVar4.f52406q0) {
                    int i51 = (-2) - (((i49 ^ 24) + ((i49 & 24) << 1)) ^ (-1));
                    f52404s0 = i51 % 128;
                    int i52 = i51 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i53 = i38 + 121;
                f52403r0 = i53 % 128;
                int i54 = i53 % 2;
                int i55 = i38 & 79;
                int i56 = (i38 ^ 79) | i55;
                int i57 = (i55 & i56) + (i56 | i55);
                f52403r0 = i57 % 128;
                int i58 = i57 % 2;
                do {
                    abx abxVar4 = acmVar4.setCompoundDrawableTintBlendMode;
                    if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar4}, 1395393434, -1395393402, System.identityHashCode(abxVar4))).longValue() < jLongValue3) {
                        int i59 = f52403r0;
                        int i60 = (((i59 & (-38)) | ((~i59) & 37)) - (~(-(-((i59 & 37) << 1))))) - 1;
                        f52404s0 = i60 % 128;
                        int i61 = i60 % 2;
                    } else {
                        int i62 = f52403r0 + 89;
                        f52404s0 = i62 % 128;
                        int i63 = i62 % 2;
                        objValueOf = Boolean.TRUE;
                    }
                    return objValueOf;
                } while (acmVar4.f52405p0.setY(acmVar4.setCompoundDrawableTintBlendMode, SvgConstantsKt.SPECIFIED_FONT_FAMILY) != -1);
                int i64 = f52403r0;
                int i65 = (i64 ^ 43) + ((i64 & 43) << 1);
                int i66 = i65 % 128;
                f52404s0 = i66;
                int i67 = i65 % 2;
                int i68 = i66 & 111;
                int i69 = (i66 ^ 111) | i68;
                int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
                f52403r0 = i70 % 128;
                int i71 = i70 % 2;
                objValueOf = Boolean.FALSE;
                return objValueOf;
            case 6:
                return i(objArr);
            case 7:
                d(objArr);
                return null;
            case 8:
                acm acmVar5 = (acm) objArr[0];
                int i72 = f52404s0;
                int i73 = ((i72 & (-38)) | ((~i72) & 37)) + ((i72 & 37) << 1);
                int i74 = i73 % 128;
                f52403r0 = i74;
                int i75 = i73 % 2;
                if (!acmVar5.f52406q0) {
                    int i76 = i72 & 111;
                    int i77 = ((((i72 ^ 111) | i76) << 1) - (~(-((i72 | 111) & (~i76))))) - 1;
                    f52403r0 = i77 % 128;
                    objValueOf = Boolean.valueOf(i77 % 2 == 0);
                } else {
                    int i78 = (i74 ^ 15) + ((i74 & 15) << 1);
                    f52404s0 = i78 % 128;
                    int i79 = i78 % 2;
                    objValueOf = Boolean.FALSE;
                }
                return objValueOf;
            case 9:
                return e(objArr);
            case 10:
                return j(objArr);
            case 11:
                acm acmVar6 = (acm) objArr[0];
                Charset charset = (Charset) objArr[1];
                int i80 = f52404s0;
                int i81 = i80 & 75;
                int i82 = (i80 | 75) & (~i81);
                int i83 = i81 << 1;
                int i84 = (i82 & i83) + (i82 | i83);
                f52403r0 = i84 % 128;
                int i85 = i84 % 2;
                Intrinsics.checkNotNullParameter(charset, "");
                abx abxVar5 = acmVar6.setCompoundDrawableTintBlendMode;
                ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar5, acmVar6.f52405p0}, -1844326734, 1844326753, System.identityHashCode(abxVar5))).longValue();
                String compoundDrawableTintBlendMode = acmVar6.setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(charset);
                int i86 = f52404s0;
                int i87 = (i86 ^ 17) + ((i86 & 17) << 1);
                f52403r0 = i87 % 128;
                int i88 = i87 % 2;
                return compoundDrawableTintBlendMode;
            case 12:
                return f(objArr);
            case 13:
                acm acmVar7 = (acm) objArr[0];
                int i89 = f52404s0;
                int i90 = i89 & 65;
                int i91 = ((i89 | 65) & (~i90)) + (i90 << 1);
                f52403r0 = i91 % 128;
                int i92 = i91 % 2;
                String str = (String) setCompoundDrawableTintBlendMode(new Object[]{acmVar7, Long.MAX_VALUE}, -1705432834, 1705432843, System.identityHashCode(acmVar7));
                int i93 = f52403r0;
                int i94 = (i93 & 59) + (i93 | 59);
                f52404s0 = i94 % 128;
                int i95 = i94 % 2;
                return str;
            case 14:
                acm acmVar8 = (acm) objArr[0];
                int i96 = f52404s0;
                int i97 = i96 & 77;
                int i98 = (i96 ^ 77) | i97;
                int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
                f52403r0 = i99 % 128;
                int i100 = i99 % 2;
                abx abxVar6 = acmVar8.setCompoundDrawableTintBlendMode;
                int i101 = i96 ^ 31;
                int i102 = ((i96 & 31) | i101) << 1;
                int i103 = -i101;
                int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                f52403r0 = i104 % 128;
                int i105 = i104 % 2;
                return abxVar6;
            case 15:
                h(objArr);
                return null;
            case 16:
                return b(objArr);
            case 17:
                acm acmVar9 = (acm) objArr[0];
                long jLongValue4 = ((Number) objArr[1]).longValue();
                int i106 = f52404s0 + 77;
                int i107 = i106 % 128;
                f52403r0 = i107;
                int i108 = i106 % 2;
                if (acmVar9.f52406q0) {
                    int i109 = i107 & 55;
                    int i110 = -(-((i107 ^ 55) | i109));
                    int i111 = (i109 ^ i110) + ((i109 & i110) << 1);
                    f52404s0 = i111 % 128;
                    int i112 = i111 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i113 = i107 & 83;
                int i114 = (~i113) & (i107 | 83);
                int i115 = i113 << 1;
                int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                f52404s0 = i116 % 128;
                int i117 = i116 % 2;
                int i118 = i107 + 27;
                f52404s0 = i118 % 128;
                int i119 = i118 % 2;
                while (jLongValue4 > 0) {
                    int i120 = f52404s0;
                    int i121 = ((i120 ^ 94) + ((i120 & 94) << 1)) - 1;
                    f52403r0 = i121 % 128;
                    if (i121 % 2 != 0) {
                        abx abxVar7 = acmVar9.setCompoundDrawableTintBlendMode;
                        if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar7}, 1395393434, -1395393402, System.identityHashCode(abxVar7))).longValue() != j10) {
                            continue;
                        } else if (acmVar9.f52405p0.setY(acmVar9.setCompoundDrawableTintBlendMode, SvgConstantsKt.SPECIFIED_FONT_FAMILY) != -1) {
                            throw new EOFException();
                        }
                    } else {
                        abx abxVar8 = acmVar9.setCompoundDrawableTintBlendMode;
                        if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar8}, 1395393434, -1395393402, System.identityHashCode(abxVar8))).longValue() != 0) {
                            continue;
                        } else if (acmVar9.f52405p0.setY(acmVar9.setCompoundDrawableTintBlendMode, SvgConstantsKt.SPECIFIED_FONT_FAMILY) != -1) {
                            throw new EOFException();
                        }
                    }
                    abx abxVar9 = acmVar9.setCompoundDrawableTintBlendMode;
                    long jMin = Math.min(jLongValue4, ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar9}, 1395393434, -1395393402, System.identityHashCode(abxVar9))).longValue());
                    abx abxVar10 = acmVar9.setCompoundDrawableTintBlendMode;
                    abx.setOnFocusChangeListener(new Object[]{abxVar10, Long.valueOf(jMin)}, -1525846840, 1525846865, System.identityHashCode(abxVar10));
                    jLongValue4 -= jMin;
                    int i122 = f52403r0;
                    int i123 = i122 | 37;
                    int i124 = i123 << 1;
                    int i125 = -((~(i122 & 37)) & i123);
                    int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
                    f52404s0 = i126 % 128;
                    int i127 = i126 % 2;
                    j10 = 1;
                }
                int i128 = f52403r0;
                int i129 = (((i128 | 116) << 1) - (i128 ^ 116)) - 1;
                f52404s0 = i129 % 128;
                int i130 = i129 % 2;
                return null;
            case 18:
                return g(objArr);
            case 19:
                return n(objArr);
            case 20:
                return k(objArr);
            case 21:
                acm acmVar10 = (acm) objArr[0];
                ByteBuffer byteBuffer = (ByteBuffer) objArr[1];
                int i131 = f52403r0;
                int i132 = (i131 ^ 92) + ((i131 & 92) << 1);
                int i133 = (i132 ^ (-1)) + (i132 << 1);
                f52404s0 = i133 % 128;
                if (i133 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(byteBuffer, "");
                    abx abxVar11 = acmVar10.setCompoundDrawableTintBlendMode;
                    if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar11}, 1395393434, -1395393402, System.identityHashCode(abxVar11))).longValue() == 1) {
                        if (acmVar10.f52405p0.setY(acmVar10.setCompoundDrawableTintBlendMode, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                            int i134 = f52403r0;
                            int i135 = (-2) - (((i134 ^ 66) + ((i134 & 66) << 1)) ^ (-1));
                            int i136 = i135 % 128;
                            f52404s0 = i136;
                            int i137 = i135 % 2;
                            int i138 = (i136 & 56) + (i136 | 56);
                            int i139 = (i138 ^ (-1)) + (i138 << 1);
                            f52403r0 = i139 % 128;
                            int i140 = i139 % 2;
                            i13 = -1;
                        }
                    }
                    objValueOf = Integer.valueOf(i13);
                    return objValueOf;
                }
                Intrinsics.checkNotNullParameter(byteBuffer, "");
                abx abxVar12 = acmVar10.setCompoundDrawableTintBlendMode;
                if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar12}, 1395393434, -1395393402, System.identityHashCode(abxVar12))).longValue() == 0) {
                    if (acmVar10.f52405p0.setY(acmVar10.setCompoundDrawableTintBlendMode, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                        int i1310 = f52403r0;
                        int i1311 = (-2) - (((i1310 ^ 66) + ((i1310 & 66) << 1)) ^ (-1));
                        int i1312 = i1311 % 128;
                        f52404s0 = i1312;
                        int i1313 = i1311 % 2;
                        int i1314 = (i1312 & 56) + (i1312 | 56);
                        int i1315 = (i1314 ^ (-1)) + (i1314 << 1);
                        f52403r0 = i1315 % 128;
                        int i141 = i1315 % 2;
                        i13 = -1;
                    }
                }
                objValueOf = Integer.valueOf(i13);
                return objValueOf;
                i13 = acmVar10.setCompoundDrawableTintBlendMode.read(byteBuffer);
                int i142 = f52404s0 + 81;
                f52403r0 = i142 % 128;
                int i143 = i142 % 2;
                objValueOf = Integer.valueOf(i13);
                return objValueOf;
            case 22:
                return c(objArr);
            case 23:
                acm acmVar11 = (acm) objArr[0];
                abx abxVar13 = (abx) objArr[1];
                long jLongValue5 = ((Number) objArr[2]).longValue();
                int i144 = f52403r0;
                int i145 = i144 & 35;
                int i146 = -(-((i144 ^ 35) | i145));
                int i147 = (i145 ^ i146) + ((i145 & i146) << 1);
                f52404s0 = i147 % 128;
                int i148 = i147 % 2;
                Intrinsics.checkNotNullParameter(abxVar13, "");
                if (jLongValue5 < 0) {
                    int i149 = f52403r0;
                    int i150 = ((i149 & 51) - (~(-(-(i149 | 51))))) - 1;
                    f52404s0 = i150 % 128;
                    int i151 = i150 % 2;
                    throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(jLongValue5)).toString());
                }
                int i152 = f52403r0;
                int i153 = (i152 & (-94)) | ((~i152) & 93);
                int i154 = -(-((i152 & 93) << 1));
                int i155 = ((i153 | i154) << 1) - (i153 ^ i154);
                f52404s0 = i155 % 128;
                int i156 = i155 % 2;
                int i157 = i152 ^ 19;
                int i158 = -(-((i152 & 19) << 1));
                int i159 = ((i157 | i158) << 1) - (i158 ^ i157);
                int i160 = i159 % 128;
                f52404s0 = i160;
                int i161 = i159 % 2;
                if (acmVar11.f52406q0) {
                    int i162 = (((i160 ^ 81) | (i160 & 81)) << 1) - ((i160 & (-82)) | ((~i160) & 81));
                    f52403r0 = i162 % 128;
                    int i163 = i162 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i164 = ((i160 & 78) + (i160 | 78)) - 1;
                int i165 = i164 % 128;
                f52403r0 = i165;
                int i166 = i164 % 2;
                int i167 = i165 & 75;
                int i168 = (i165 ^ 75) | i167;
                int i169 = (i167 ^ i168) + ((i168 & i167) << 1);
                f52404s0 = i169 % 128;
                int i170 = i169 % 2;
                abx abxVar14 = acmVar11.setCompoundDrawableTintBlendMode;
                if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar14}, 1395393434, -1395393402, System.identityHashCode(abxVar14))).longValue() == 0) {
                    int i171 = f52403r0 + 17;
                    f52404s0 = i171 % 128;
                    int i172 = i171 % 2;
                    if (acmVar11.f52405p0.setY(acmVar11.setCompoundDrawableTintBlendMode, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                        int i173 = f52404s0;
                        int i174 = ((i173 & 114) + (i173 | 114)) - 1;
                        int i175 = i174 % 128;
                        f52403r0 = i175;
                        int i176 = i174 % 2;
                        int i177 = ((i175 ^ 109) | (i175 & 109)) << 1;
                        int i178 = -(((~i175) & 109) | (i175 & (-110)));
                        int i179 = (i177 ^ i178) + ((i178 & i177) << 1);
                        f52404s0 = i179 % 128;
                        int i180 = i179 % 2;
                        objValueOf = -1L;
                    } else {
                        abx abxVar15 = acmVar11.setCompoundDrawableTintBlendMode;
                        long jMin2 = Math.min(jLongValue5, ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar15}, 1395393434, -1395393402, System.identityHashCode(abxVar15))).longValue());
                        abx abxVar16 = acmVar11.setCompoundDrawableTintBlendMode;
                        long jLongValue6 = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar16, abxVar13, Long.valueOf(jMin2)}, -1652089489, 1652089516, System.identityHashCode(abxVar16))).longValue();
                        int i181 = f52404s0;
                        int i182 = ((i181 & 46) + (i181 | 46)) - 1;
                        f52403r0 = i182 % 128;
                        int i183 = i182 % 2;
                        objValueOf = Long.valueOf(jLongValue6);
                    }
                } else {
                    abx abxVar17 = acmVar11.setCompoundDrawableTintBlendMode;
                    long jMin3 = Math.min(jLongValue5, ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar17}, 1395393434, -1395393402, System.identityHashCode(abxVar17))).longValue());
                    abx abxVar18 = acmVar11.setCompoundDrawableTintBlendMode;
                    long jLongValue7 = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar18, abxVar13, Long.valueOf(jMin3)}, -1652089489, 1652089516, System.identityHashCode(abxVar18))).longValue();
                    int i184 = f52404s0;
                    int i185 = ((i184 & 46) + (i184 | 46)) - 1;
                    f52403r0 = i185 % 128;
                    int i186 = i185 % 2;
                    objValueOf = Long.valueOf(jLongValue7);
                }
                return objValueOf;
            case 24:
                return a(objArr);
            default:
                return l(objArr);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws NoSuchAlgorithmException, IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1562873117, 1562873132, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final byte getNavBarTitleString() {
        return ((Byte) setCompoundDrawableTintBlendMode(new Object[]{this}, 13880226, -13880222, System.identityHashCode(this))).byteValue();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -2097315306, 2097315314, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer byteBuffer) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, byteBuffer}, 1311279447, -1311279426, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final String setAlwaysDrawnWithCacheEnabled() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1024351063, 1024351076, System.identityHashCode(this));
    }

    public final short setDividerPadding() {
        return ((Short) setCompoundDrawableTintBlendMode(new Object[]{this}, -2043345095, 2043345111, System.identityHashCode(this))).shortValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final int setLayoutAnimation() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 2115538757, -2115538737, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final void setNavigationOnClickListener(long j10) throws NoSuchAlgorithmException, IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10)}, -1944819189, 1944819206, System.identityHashCode(this));
    }

    public final long setOnDragListener() {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this}, -190598540, 190598543, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final boolean setOnFocusChangeListener(long j10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10)}, 1200496636, -1200496631, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final boolean setX() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -602565760, 602565766, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    @NotNull
    public final acq setY() {
        return (acq) setCompoundDrawableTintBlendMode(new Object[]{this}, -1167279660, 1167279679, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final long setZ() {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this}, 1157358, -1157340, System.identityHashCode(this))).longValue();
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1255056667, 1255056691, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final String setLayoutAnimation(long j10) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10)}, -1705432834, 1705432843, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final short setNavigationOnClickListener() {
        return ((Short) setCompoundDrawableTintBlendMode(new Object[]{this}, -198306320, 198306330, System.identityHashCode(this))).shortValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final byte[] setOnDragListener(long j10) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10)}, 640068942, -640068940, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final abx setOnFocusChangeListener() {
        return (abx) setCompoundDrawableTintBlendMode(new Object[]{this}, -1773896087, 1773896101, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final int setY(@NotNull aci aciVar) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, aciVar}, -652880046, 652880047, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final abw setY(long j10) {
        return (abw) setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10)}, 1766627409, -1766627387, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    public final long setY(@NotNull abx abxVar, long j10) {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this, abxVar, Long.valueOf(j10)}, -476418358, 476418381, System.identityHashCode(this))).longValue();
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -886634838, 886634850, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final String setCompoundDrawableTintBlendMode(@NotNull Charset charset) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, charset}, 1568188654, -1568188643, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aby
    public final void setCompoundDrawableTintBlendMode(long j10) throws NoSuchAlgorithmException, IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10)}, -1865233071, 1865233078, System.identityHashCode(this));
    }
}
