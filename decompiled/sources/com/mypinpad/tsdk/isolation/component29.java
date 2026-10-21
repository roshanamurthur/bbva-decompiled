package com.mypinpad.tsdk.isolation;

import ak.b;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class component29 implements setSecondaryProgress {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54897c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54898d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setColorFilter f54899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IntegrityManager f54900b;

    public component29(@NotNull Context context, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f54899a = setcolorfilter;
        IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(context);
        Intrinsics.checkNotNullExpressionValue(integrityManagerCreate, "");
        this.f54900b = integrityManagerCreate;
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        IntegrityServiceException integrityServiceException;
        Integer numValueOf;
        Throwable th2 = (Throwable) objArr[0];
        int i10 = f54897c;
        int i11 = i10 + 97;
        f54898d = i11 % 128;
        if (i11 % 2 == 0) {
            boolean z10 = th2 instanceof IntegrityServiceException;
            throw null;
        }
        if (!(!(th2 instanceof IntegrityServiceException))) {
            int i12 = i10 & 83;
            int i13 = -(-((i10 ^ 83) | i12));
            int i14 = (i12 & i13) + (i12 | i13);
            f54898d = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            integrityServiceException = (IntegrityServiceException) th2;
        } else {
            int i15 = i10 ^ 67;
            int i16 = (((i10 & 67) | i15) << 1) - i15;
            f54898d = i16 % 128;
            int i17 = i16 % 2;
            integrityServiceException = null;
        }
        if (integrityServiceException == null) {
            int i18 = (i10 | 3) << 1;
            int i19 = -(((~i10) & 3) | (i10 & (-4)));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            int i21 = i20 % 128;
            f54898d = i21;
            int i22 = i20 % 2;
            int i23 = i21 + 51;
            f54897c = i23 % 128;
            int i24 = i23 % 2;
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(integrityServiceException.getErrorCode());
            int i25 = (-2) - ((f54897c + 80) ^ (-1));
            f54898d = i25 % 128;
            int i26 = i25 % 2;
        }
        if (th2 instanceof TimeoutException) {
            int i27 = f54898d;
            int i28 = i27 & 3;
            int i29 = (i27 ^ 3) | i28;
            int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
            f54897c = i30 % 128;
            int i31 = i30 % 2;
            int i32 = i27 & 117;
            int i33 = -(-(i27 | 117));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            f54897c = i34 % 128;
            if (i34 % 2 == 0) {
                return Boolean.TRUE;
            }
            int i35 = 44 / 0;
            return Boolean.TRUE;
        }
        if (numValueOf != null) {
            int i36 = f54897c;
            int i37 = i36 ^ 5;
            int i38 = ((i36 & 5) | i37) << 1;
            int i39 = -i37;
            int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
            f54898d = i40 % 128;
            if (i40 % 2 == 0) {
                int iIntValue = numValueOf.intValue();
                ((Boolean) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue)}, -1732867513, 1732867513, iIntValue)).booleanValue();
                throw null;
            }
            int iIntValue2 = numValueOf.intValue();
            if (((Boolean) setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue2)}, -1732867513, 1732867513, iIntValue2)).booleanValue()) {
                int i41 = f54898d + 53;
                int i42 = i41 % 128;
                f54897c = i42;
                int i43 = i41 % 2;
                int i44 = i42 & 3;
                int i45 = (((i42 ^ 3) | i44) << 1) - ((i42 | 3) & (~i44));
                f54898d = i45 % 128;
                if (i45 % 2 != 0) {
                    return Boolean.TRUE;
                }
                int i46 = 93 / 0;
                return Boolean.TRUE;
            }
        }
        int i47 = f54897c;
        int i48 = i47 & 35;
        int i49 = -(-((i47 ^ 35) | i48));
        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
        f54898d = i50 % 128;
        int i51 = i50 % 2;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r8 != 3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        com.mypinpad.tsdk.isolation.setColorFilter.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1.f54899a, 6, com.mypinpad.tsdk.isolation.getDisplayExponent.setY(java.lang.String.valueOf(r8)), null, 4}, 1173867142, -1173867141, 6);
        r8 = new kotlin.Pair(java.lang.Long.valueOf(r3.setCompoundDrawableTintBlendMode()), java.lang.Long.valueOf(r3.setDividerPadding()));
        r0 = com.mypinpad.tsdk.isolation.component29.f54897c;
        r1 = r0 ^ 41;
        r0 = ((r0 & 41) | r1) << 1;
        r1 = -r1;
        r2 = ((r0 | r1) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.component29.f54898d = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        r8 = new kotlin.Pair(java.lang.Long.valueOf(r3.setCompoundDrawableTintBlendMode()), java.lang.Long.valueOf(r3.setDividerPadding()));
        r0 = com.mypinpad.tsdk.isolation.component29.f54897c;
        r1 = (r0 ^ 30) + ((r0 & 30) << 1);
        r0 = (r1 ^ (-1)) + (r1 << 1);
        com.mypinpad.tsdk.isolation.component29.f54898d = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00af, code lost:
    
        if ((r0 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b1, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r8 != 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ kotlin.Pair b(java.lang.Object[] r8) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.component29.b(java.lang.Object[]):kotlin.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:134:0x06ed A[PHI: r0 r1 r2
      0x06ed: PHI (r0v12 java.lang.String) = (r0v11 java.lang.String), (r0v23 java.lang.String) binds: [B:133:0x06eb, B:130:0x06cc] A[DONT_GENERATE, DONT_INLINE]
      0x06ed: PHI (r1v13 int) = (r1v12 int), (r1v34 int) binds: [B:133:0x06eb, B:130:0x06cc] A[DONT_GENERATE, DONT_INLINE]
      0x06ed: PHI (r2v6 boolean) = (r2v5 boolean), (r2v25 boolean) binds: [B:133:0x06eb, B:130:0x06cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:137:0x0724  */
    /* JADX WARN: Code duplicated, block: B:139:0x072f A[PHI: r0 r2
      0x072f: PHI (r0v20 java.lang.String) = (r0v11 java.lang.String), (r0v23 java.lang.String) binds: [B:133:0x06eb, B:130:0x06cc] A[DONT_GENERATE, DONT_INLINE]
      0x072f: PHI (r2v21 boolean) = (r2v5 boolean), (r2v25 boolean) binds: [B:133:0x06eb, B:130:0x06cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:154:0x03be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x03b5 A[LOOP:0: B:60:0x01c3->B:87:0x03b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x03f0  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        String str;
        int length;
        int i13;
        String str2;
        boolean z11;
        Object obj;
        getDynamicButtonIconTextSpacingDp y7;
        int i14;
        Object component27Var;
        setOnGroupExpandListener setongroupexpandlistener;
        Iterator it;
        int i15;
        ExecutionException executionException;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = ~i10;
        int i25 = ~i11;
        int i26 = 2;
        switch ((i24 * 490) + (((~(i10 | i25)) | (~(i25 | i12))) * 490) + ((i24 | i25 | (~i12)) * (-490)) + (i11 * (-489)) + (i10 * 491)) {
            case 1:
                return a(objArr);
            case 2:
                return b(objArr);
            case 3:
                byte[] bArr = (byte[]) objArr[0];
                int i27 = f54897c;
                int i28 = (i27 ^ 99) + ((i27 & 99) << 1);
                f54898d = i28 % 128;
                if (i28 % 2 == 0) {
                    str = (String) setFreezesText.setY(new Object[]{bArr}, -1175135662, 1175135662, (int) System.currentTimeMillis());
                    length = str.length();
                    z10 = false;
                    if (27 <= length) {
                        i13 = f54898d;
                        int i29 = i13 + 52;
                        int i30 = (i29 ^ (-1)) + (i29 << 1);
                        f54897c = i30 % 128;
                        int i31 = i30 % 2;
                        if (length <= 500) {
                            int i32 = i13 & 115;
                            int i33 = -(-((i13 ^ 115) | i32));
                            int i34 = (i32 & i33) + (i32 | i33);
                            f54897c = i34 % 128;
                            int i35 = i34 % 2;
                            int i36 = i13 & 123;
                            int i37 = (((i13 ^ 123) | i36) << 1) - ((~i36) & (i13 | 123));
                            f54897c = i37 % 128;
                            int i38 = i37 % 2;
                            str2 = str;
                            z11 = true;
                        } else {
                            int i39 = i13 + 17;
                            f54897c = i39 % 128;
                            int i40 = i39 % 2;
                        }
                    } else {
                        int i41 = f54898d;
                        int i42 = i41 & 123;
                        int i43 = i42 + ((i41 ^ 123) | i42);
                        f54897c = i43 % 128;
                        int i44 = i43 % 2;
                    }
                    str2 = str;
                    z11 = z10;
                } else {
                    z10 = false;
                    str = (String) setFreezesText.setY(new Object[]{bArr}, -1175135662, 1175135662, (int) System.currentTimeMillis());
                    length = str.length();
                    if (16 <= length) {
                        i13 = f54898d;
                        int i210 = i13 + 52;
                        int i310 = (i210 ^ (-1)) + (i210 << 1);
                        f54897c = i310 % 128;
                        int i311 = i310 % 2;
                        if (length <= 500) {
                            int i312 = i13 & 115;
                            int i313 = -(-((i13 ^ 115) | i312));
                            int i314 = (i312 & i313) + (i312 | i313);
                            f54897c = i314 % 128;
                            int i315 = i314 % 2;
                            int i316 = i13 & 123;
                            int i317 = (((i13 ^ 123) | i316) << 1) - ((~i316) & (i13 | 123));
                            f54897c = i317 % 128;
                            int i318 = i317 % 2;
                            str2 = str;
                            z11 = true;
                        } else {
                            int i319 = i13 + 17;
                            f54897c = i319 % 128;
                            int i45 = i319 % 2;
                        }
                    } else {
                        int i46 = f54898d;
                        int i47 = i46 & 123;
                        int i48 = i47 + ((i46 ^ 123) | i47);
                        f54897c = i48 % 128;
                        int i49 = i48 % 2;
                    }
                    str2 = str;
                    z11 = z10;
                }
                if (!z11) {
                    throw new IllegalArgumentException();
                }
                int i50 = f54898d;
                int i51 = i50 & 35;
                int i52 = (i50 ^ 35) | i51;
                int i53 = (i51 & i52) + (i51 | i52);
                f54897c = i53 % 128;
                int i54 = i53 % 2;
                int i55 = (i50 ^ 93) + ((i50 & 93) << 1);
                f54897c = i55 % 128;
                int i56 = i55 % 2;
                return str2;
            case 4:
                component29 component29Var = (component29) objArr[0];
                Throwable th2 = (Throwable) objArr[1];
                int i57 = f54898d;
                int i58 = i57 & 3;
                int i59 = (~i58) & (i57 | 3);
                int i60 = i58 << 1;
                int i61 = (i59 & i60) + (i60 | i59);
                f54897c = i61 % 128;
                int i62 = i61 % 2;
                if (!(th2 instanceof IntegrityServiceException)) {
                    if (!(th2 instanceof TimeoutException)) {
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{component29Var.f54899a, 3, null, th2, 2}, 1173867142, -1173867141, 3);
                        int i63 = f54898d;
                        int i64 = i63 & 25;
                        int i65 = i64 + ((i63 ^ 25) | i64);
                        f54897c = i65 % 128;
                        int i66 = i65 % 2;
                    } else {
                        int i67 = ((i57 & 50) + (i57 | 50)) - 1;
                        f54897c = i67 % 128;
                        int i68 = i67 % 2;
                        obj = null;
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{component29Var.f54899a, 4, null, th2, 2}, 1173867142, -1173867141, 4);
                        int i69 = f54898d;
                        int i70 = i69 & 9;
                        int i71 = -(-(i69 | 9));
                        int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                        f54897c = i72 % 128;
                        if (i72 % 2 != 0) {
                            int i73 = 79 / 0;
                        }
                    }
                    return obj;
                }
                int i74 = i57 & 81;
                int i75 = (((i57 ^ 81) | i74) << 1) - ((i57 | 81) & (~i74));
                f54897c = i75 % 128;
                if (i75 % 2 != 0) {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{component29Var.f54899a, 4, getDisplayExponent.setY(String.valueOf(((IntegrityServiceException) th2).getErrorCode())), th2}, -1999045713, 1999045717, 4);
                } else {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{component29Var.f54899a, 5, getDisplayExponent.setY(String.valueOf(((IntegrityServiceException) th2).getErrorCode())), th2}, -1999045713, 1999045717, 5);
                }
                obj = null;
                return obj;
            case 5:
                component29 component29Var2 = (component29) objArr[0];
                String str3 = (String) objArr[1];
                long jLongValue = ((Number) objArr[2]).longValue();
                long jLongValue2 = ((Number) objArr[3]).longValue();
                int i76 = f54897c;
                int i77 = i76 & 31;
                int i78 = (i76 | 31) & (~i77);
                int i79 = i77 << 1;
                int i80 = ((i78 | i79) << 1) - (i78 ^ i79);
                f54898d = i80 % 128;
                int i81 = i80 % 2;
                IntegrityTokenRequest integrityTokenRequestBuild = IntegrityTokenRequest.builder().setCloudProjectNumber(jLongValue2).setNonce(str3).build();
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{component29Var2.f54899a, 1, getDisplayExponent.setY(String.valueOf(jLongValue)), null, 4}, 1173867142, -1173867141, 1);
                Task<IntegrityTokenResponse> taskRequestIntegrityToken = component29Var2.f54900b.requestIntegrityToken(integrityTokenRequestBuild);
                Intrinsics.checkNotNullExpressionValue(taskRequestIntegrityToken, "");
                IntegrityTokenResponse integrityTokenResponse = (IntegrityTokenResponse) setOnFocusChangeListener(new Object[]{taskRequestIntegrityToken, Long.valueOf(jLongValue)}, 1104117939, -1104117933, (int) System.currentTimeMillis());
                String str4 = integrityTokenResponse.token();
                if (str4 != null) {
                    String strTake = StringsKt___StringsKt.take(str4, 4);
                    if (strTake == null) {
                        int i82 = f54897c;
                        int i83 = i82 & 83;
                        int i84 = (((i82 ^ 83) | i83) << 1) - ((~i83) & (i82 | 83));
                        f54898d = i84 % 128;
                        if (i84 % 2 == 0) {
                            throw null;
                        }
                        int i85 = i82 & 9;
                        int i86 = (i82 | 9) & (~i85);
                        int i87 = i85 << 1;
                        int i88 = (i86 & i87) + (i86 | i87);
                        f54898d = i88 % 128;
                        int i89 = i88 % 2;
                    } else {
                        y7 = getDisplayExponent.setY(strTake);
                        int i90 = f54897c;
                        int i91 = ((i90 ^ 111) | (i90 & 111)) << 1;
                        int i92 = -(((~i90) & 111) | (i90 & (-112)));
                        int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                        f54898d = i93 % 128;
                        i14 = 2;
                        int i94 = i93 % 2;
                    }
                    Object[] objArr2 = new Object[5];
                    objArr2[0] = component29Var2.f54899a;
                    objArr2[1] = 2;
                    objArr2[i14] = y7;
                    objArr2[3] = null;
                    objArr2[4] = 4;
                    setColorFilter.setCompoundDrawableTintBlendMode(objArr2, 1173867142, -1173867141, i14);
                    String str5 = integrityTokenResponse.token();
                    Intrinsics.checkNotNullExpressionValue(str5, "");
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{str5}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                    String str6 = integrityTokenResponse.token();
                    Intrinsics.checkNotNullExpressionValue(str6, "");
                    component27Var = new component27(str6);
                    int i95 = f54897c;
                    int i96 = ((i95 ^ 70) + ((i95 & 70) << 1)) - 1;
                    f54898d = i96 % 128;
                    int i97 = i96 % 2;
                } else {
                    int i98 = f54898d;
                    int i99 = ((i98 ^ 75) | (i98 & 75)) << 1;
                    int i100 = -(((~i98) & 75) | (i98 & (-76)));
                    int i101 = (i99 & i100) + (i100 | i99);
                    int i102 = i101 % 128;
                    f54897c = i102;
                    int i103 = i101 % 2;
                    int i104 = (i102 & 31) + (i102 | 31);
                    f54898d = i104 % 128;
                    int i105 = i104 % 2;
                }
                y7 = null;
                i14 = 2;
                Object[] objArr3 = new Object[5];
                objArr3[0] = component29Var2.f54899a;
                objArr3[1] = 2;
                objArr3[i14] = y7;
                objArr3[3] = null;
                objArr3[4] = 4;
                setColorFilter.setCompoundDrawableTintBlendMode(objArr3, 1173867142, -1173867141, i14);
                String str7 = integrityTokenResponse.token();
                Intrinsics.checkNotNullExpressionValue(str7, "");
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{str7}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                String str8 = integrityTokenResponse.token();
                Intrinsics.checkNotNullExpressionValue(str8, "");
                component27Var = new component27(str8);
                int i910 = f54897c;
                int i911 = ((i910 ^ 70) + ((i910 & 70) << 1)) - 1;
                f54898d = i911 % 128;
                int i912 = i911 % 2;
                break;
            case 6:
                Task task = (Task) objArr[0];
                long jLongValue3 = ((Number) objArr[1]).longValue();
                int i106 = f54898d;
                int i107 = (i106 & (-72)) | ((~i106) & 71);
                int i108 = (i106 & 71) << 1;
                int i109 = (i107 ^ i108) + ((i108 & i107) << 1);
                f54897c = i109 % 128;
                int i110 = i109 % 2;
                component27Var = Tasks.await(task, jLongValue3, TimeUnit.MILLISECONDS);
                if (i110 != 0) {
                    int i111 = 22 / 0;
                }
                break;
            case 7:
                component29 component29Var3 = (component29) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                long jLongValue4 = ((Number) objArr[2]).longValue();
                setLinksClickable setlinksclickable = (setLinksClickable) objArr[3];
                Intrinsics.checkNotNullParameter(bArr2, "");
                Intrinsics.checkNotNullParameter(setlinksclickable, "");
                String str9 = (String) setOnFocusChangeListener(new Object[]{bArr2}, -495279253, 495279256, (int) System.currentTimeMillis());
                ArrayList arrayList = new ArrayList();
                int i112 = (-2) - ((f54898d + 48) ^ (-1));
                f54897c = i112 % 128;
                int i113 = i112 % 2;
                int i114 = 0;
                for (int i115 = 3; i114 < i115; i115 = 3) {
                    int i116 = f54898d + 93;
                    f54897c = i116 % 128;
                    int i117 = i116 % i26;
                    int iIdentityHashCode = System.identityHashCode(component29Var3);
                    int i118 = -(-(i114 * 503));
                    int i119 = 503 ^ i118;
                    int i120 = (503 & i118) << 1;
                    int i121 = (i119 ^ i120) + ((i119 & i120) << 1);
                    int i122 = ~i114;
                    int i123 = (i122 & 1) | (i114 & (-2));
                    int i124 = i114 & 1;
                    int i125 = (i123 ^ i124) | (i123 & i124);
                    int i126 = i125 * (-502);
                    int i127 = i121 & i126;
                    int i128 = (i121 ^ i126) | i127;
                    int i129 = ((i127 | i128) << 1) - (i127 ^ i128);
                    int i130 = (-2) & i122;
                    int i131 = (~i130) & (i122 | (-2));
                    int i132 = ~((i130 & i131) | (i131 ^ i130));
                    int i133 = ~iIdentityHashCode;
                    int i134 = (i133 | iIdentityHashCode) & i133;
                    int i135 = (-2) & i134;
                    int i136 = (~i135) & (i134 | (-2));
                    int i137 = (i136 & i135) | (i136 ^ i135);
                    int i138 = ~i137;
                    int i139 = (i137 | i138) & i138;
                    int i140 = i132 & i139;
                    int i141 = (i132 | i139) & (~i140);
                    int i142 = (i141 & i140) | (i141 ^ i140);
                    int i143 = i125 & iIdentityHashCode;
                    int i144 = i143 | ((i125 | iIdentityHashCode) & (~i143));
                    int i145 = ~i144;
                    int i146 = (i144 | i145) & i145;
                    int i147 = ((~i146) & i142) | ((~i142) & i146);
                    int i148 = i142 & i146;
                    int i149 = (((i148 & i147) | (i147 ^ i148)) * (-502)) + i129;
                    int i150 = (-2) & i133;
                    int i151 = (~i150) & ((-2) | i133);
                    int i152 = (i150 & i151) | (i151 ^ i150);
                    int i153 = i152 ^ i114;
                    int i154 = i114 & i152;
                    int i155 = ~((i154 & i153) | (i153 ^ i154));
                    int i156 = i123 | i124;
                    int i157 = (i133 & i156) | ((~i156) & iIdentityHashCode);
                    int i158 = i156 & iIdentityHashCode;
                    int i159 = ~((i157 & i158) | (i157 ^ i158));
                    int i160 = i155 & i159;
                    int i161 = -(-((((i155 | i159) & (~i160)) | i160) * 502));
                    int i162 = (i149 ^ i161) + ((i161 & i149) << 1);
                    Pair pair = (Pair) setOnFocusChangeListener(new Object[]{component29Var3, setlinksclickable, Integer.valueOf(i162)}, 1336863448, -1336863446, i162);
                    long jLongValue5 = ((Number) pair.component1()).longValue();
                    Long l6 = (Long) pair.component2();
                    if (l6 != null) {
                        int i163 = f54897c;
                        int i164 = (i163 | 49) << 1;
                        int i165 = -(((~i163) & 49) | (i163 & (-50)));
                        int i166 = ((i164 | i165) << 1) - (i165 ^ i164);
                        f54898d = i166 % 128;
                        int i167 = i166 % 2;
                        try {
                            Thread.sleep(l6.longValue());
                            int i168 = f54897c;
                            int i169 = i168 | 59;
                            int i170 = i169 << 1;
                            int i171 = -((~(i168 & 59)) & i169);
                            int i172 = (i170 & i171) + (i171 | i170);
                            f54898d = i172 % 128;
                            int i173 = i172 % 2;
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        component27Var = (component27) setOnFocusChangeListener(new Object[]{component29Var3, str9, Long.valueOf(jLongValue5), Long.valueOf(jLongValue4)}, 2134544985, -2134544980, System.identityHashCode(component29Var3));
                        int i174 = f54898d;
                        int i175 = (i174 & 29) + (i174 | 29);
                        f54897c = i175 % 128;
                        int i176 = i175 % 2;
                    } catch (Exception e5) {
                        e = e5;
                        if (e instanceof ExecutionException) {
                            executionException = (ExecutionException) e;
                            System.identityHashCode(component29Var3);
                            System.identityHashCode(component29Var3);
                        } else {
                            int i177 = f54898d;
                            int i178 = i177 & 117;
                            int i179 = (((i177 | 117) & (~i178)) - (~(i178 << 1))) - 1;
                            f54897c = i179 % 128;
                            int i180 = i179 % 2;
                            executionException = null;
                        }
                        if (executionException == null) {
                            int i181 = f54898d;
                            int i182 = i181 & 97;
                            int i183 = ((i181 ^ 97) | i182) << 1;
                            int i184 = -((i181 | 97) & (~i182));
                            int i185 = (i183 ^ i184) + ((i184 & i183) << 1);
                            f54897c = i185 % 128;
                            if (i185 % 2 != 0) {
                                int i186 = 35 / 0;
                            }
                        } else {
                            Throwable cause = executionException.getCause();
                            if (cause == null) {
                                int i187 = f54898d;
                                int i188 = i187 + 27;
                                f54897c = i188 % 128;
                                int i189 = i188 % 2;
                                int i190 = (i187 | 5) << 1;
                                int i191 = -(((~i187) & 5) | (i187 & (-6)));
                                int i192 = (i190 & i191) + (i191 | i190);
                                f54897c = i192 % 128;
                                int i193 = i192 % 2;
                            } else {
                                int i194 = f54897c;
                                int i195 = i194 & 77;
                                int i196 = (i194 | 77) & (~i195);
                                int i197 = -(-(i195 << 1));
                                int i198 = (i196 ^ i197) + ((i196 & i197) << 1);
                                f54898d = i198 % 128;
                                i16 = 2;
                                int i199 = i198 % 2;
                                e = cause;
                            }
                            Object[] objArr4 = new Object[i16];
                            objArr4[0] = component29Var3;
                            objArr4[1] = e;
                            setOnFocusChangeListener(objArr4, -633512784, 633512788, System.identityHashCode(component29Var3));
                            arrayList.add(e);
                            if (!((Boolean) setOnFocusChangeListener(new Object[]{e}, -485440385, 485440386, (int) System.currentTimeMillis())).booleanValue()) {
                                setongroupexpandlistener = new setOnGroupExpandListener((Throwable) CollectionsKt___CollectionsKt.first((List) arrayList));
                                it = CollectionsKt___CollectionsKt.drop(arrayList, 1).iterator();
                                int i200 = f54898d;
                                int i201 = i200 & 97;
                                int i202 = ((i200 ^ 97) | i201) << 1;
                                int i203 = -((i200 | 97) & (~i201));
                                int i204 = (i202 & i203) + (i203 | i202);
                                f54897c = i204 % 128;
                                int i205 = i204 % 2;
                                while (it.hasNext()) {
                                    int i206 = f54897c;
                                    i15 = ((i206 ^ 26) + ((i206 & 26) << 1)) - 1;
                                    f54898d = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        b.addSuppressed(setongroupexpandlistener, (Throwable) it.next());
                                        int i207 = 57 / 0;
                                    } else {
                                        b.addSuppressed(setongroupexpandlistener, (Throwable) it.next());
                                    }
                                }
                                throw setongroupexpandlistener;
                            }
                            i114 = i162;
                            i26 = 2;
                        }
                        i16 = 2;
                        Object[] objArr5 = new Object[i16];
                        objArr5[0] = component29Var3;
                        objArr5[1] = e;
                        setOnFocusChangeListener(objArr5, -633512784, 633512788, System.identityHashCode(component29Var3));
                        arrayList.add(e);
                        if (!((Boolean) setOnFocusChangeListener(new Object[]{e}, -485440385, 485440386, (int) System.currentTimeMillis())).booleanValue()) {
                            setongroupexpandlistener = new setOnGroupExpandListener((Throwable) CollectionsKt___CollectionsKt.first((List) arrayList));
                            it = CollectionsKt___CollectionsKt.drop(arrayList, 1).iterator();
                            int i208 = f54898d;
                            int i209 = i208 & 97;
                            int i2010 = ((i208 ^ 97) | i209) << 1;
                            int i2011 = -((i208 | 97) & (~i209));
                            int i2012 = (i2010 & i2011) + (i2011 | i2010);
                            f54897c = i2012 % 128;
                            int i2013 = i2012 % 2;
                            while (it.hasNext()) {
                                int i2014 = f54897c;
                                i15 = ((i2014 ^ 26) + ((i2014 & 26) << 1)) - 1;
                                f54898d = i15 % 128;
                                if (i15 % 2 == 0) {
                                    b.addSuppressed(setongroupexpandlistener, (Throwable) it.next());
                                    int i2015 = 57 / 0;
                                } else {
                                    b.addSuppressed(setongroupexpandlistener, (Throwable) it.next());
                                }
                            }
                            throw setongroupexpandlistener;
                        }
                        i114 = i162;
                        i26 = 2;
                    }
                    break;
                }
                setongroupexpandlistener = new setOnGroupExpandListener((Throwable) CollectionsKt___CollectionsKt.first((List) arrayList));
                it = CollectionsKt___CollectionsKt.drop(arrayList, 1).iterator();
                int i2016 = f54898d;
                int i2017 = i2016 & 97;
                int i2018 = ((i2016 ^ 97) | i2017) << 1;
                int i2019 = -((i2016 | 97) & (~i2017));
                int i20110 = (i2018 & i2019) + (i2019 | i2018);
                f54897c = i20110 % 128;
                int i20111 = i20110 % 2;
                while (it.hasNext()) {
                    int i20112 = f54897c;
                    i15 = ((i20112 ^ 26) + ((i20112 & 26) << 1)) - 1;
                    f54898d = i15 % 128;
                    if (i15 % 2 == 0) {
                        b.addSuppressed(setongroupexpandlistener, (Throwable) it.next());
                        int i20113 = 57 / 0;
                    } else {
                        b.addSuppressed(setongroupexpandlistener, (Throwable) it.next());
                    }
                }
                throw setongroupexpandlistener;
            default:
                int iIntValue = ((Number) objArr[0]).intValue();
                int i211 = f54897c;
                int i212 = (i211 & 65) + (i211 | 65);
                int i213 = i212 % 128;
                f54898d = i213;
                if (i212 % 2 == 0) {
                    throw null;
                }
                if (iIntValue != -100) {
                    switch (iIntValue) {
                        case -17:
                            int i214 = i213 & 37;
                            int i215 = (i214 - (~(-(-((i213 ^ 37) | i214))))) - 1;
                            f54897c = i215 % 128;
                            if (i215 % 2 != 0) {
                                int i216 = 45 / 0;
                            }
                            break;
                        case -16:
                            int i217 = i213 + 58;
                            int i218 = (i217 ^ (-1)) + (i217 << 1);
                            f54897c = i218 % 128;
                            if (i218 % 2 != 0) {
                                throw null;
                            }
                            component27Var = Boolean.FALSE;
                            break;
                        case -15:
                            int i219 = (i213 ^ 11) + ((i213 & 11) << 1);
                            f54897c = i219 % 128;
                            if (i219 % 2 != 0) {
                                throw null;
                            }
                            component27Var = Boolean.FALSE;
                            break;
                        case -14:
                            i17 = i211 & 85;
                            i18 = (i211 ^ 85) | i17;
                            i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                            f54898d = i19 % 128;
                            int i220 = i19 % 2;
                            component27Var = Boolean.FALSE;
                            break;
                        case -13:
                            i17 = i211 & 123;
                            i18 = -(-((i211 ^ 123) | i17));
                            i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                            f54898d = i19 % 128;
                            int i221 = i19 % 2;
                            component27Var = Boolean.FALSE;
                            break;
                        case -12:
                            int i222 = (-2) - ((((i213 | 122) << 1) - (i213 ^ 122)) ^ (-1));
                            f54897c = i222 % 128;
                            if (i222 % 2 != 0) {
                                throw null;
                            }
                            break;
                        case -11:
                            i20 = i211 & 7;
                            i21 = -((i211 ^ 7) | i20);
                            int i223 = (i20 - (~(-i21))) - 1;
                            f54898d = i223 % 128;
                            int i224 = i223 % 2;
                            component27Var = Boolean.FALSE;
                            break;
                        case -10:
                            int i225 = (-2) - ((((i211 | 50) << 1) - (i211 ^ 50)) ^ (-1));
                            f54898d = i225 % 128;
                            int i226 = i225 % 2;
                            component27Var = Boolean.FALSE;
                            break;
                        case -9:
                            int i227 = i213 & 119;
                            int i228 = (i227 - (~(-(-((i213 ^ 119) | i227))))) - 1;
                            f54897c = i228 % 128;
                            if (i228 % 2 != 0) {
                                int i229 = 46 / 0;
                            }
                            component27Var = Boolean.FALSE;
                            break;
                        case -8:
                            int i230 = i213 & 7;
                            int i231 = (i213 ^ 7) | i230;
                            int i232 = (i230 & i231) + (i230 | i231);
                            f54897c = i232 % 128;
                            if (i232 % 2 != 0) {
                                throw null;
                            }
                            break;
                        case -7:
                            int i233 = (i213 & (-6)) | ((~i213) & 5);
                            int i234 = -(-((i213 & 5) << 1));
                            i22 = i233 ^ i234;
                            i23 = (i233 & i234) << 1;
                            i19 = i22 + i23;
                            f54897c = i19 % 128;
                            int i2210 = i19 % 2;
                            component27Var = Boolean.FALSE;
                            break;
                        case -6:
                            int i235 = i213 & 1;
                            int i236 = (i235 - (~((i213 ^ 1) | i235))) - 1;
                            f54897c = i236 % 128;
                            if (i236 % 2 != 0) {
                                throw null;
                            }
                            component27Var = Boolean.FALSE;
                            break;
                        case -5:
                            i20 = (i211 | 83) << 1;
                            i21 = i211 ^ 83;
                            int i2211 = (i20 - (~(-i21))) - 1;
                            f54898d = i2211 % 128;
                            int i2212 = i2211 % 2;
                            component27Var = Boolean.FALSE;
                            break;
                        case -4:
                            int i237 = i213 ^ 61;
                            int i238 = ((i213 & 61) | i237) << 1;
                            int i239 = -i237;
                            i22 = i238 & i239;
                            i23 = i239 | i238;
                            i19 = i22 + i23;
                            f54897c = i19 % 128;
                            int i2213 = i19 % 2;
                            component27Var = Boolean.FALSE;
                            break;
                        case -3:
                            int i240 = i211 + 69;
                            f54898d = i240 % 128;
                            if (i240 % 2 == 0) {
                                throw null;
                            }
                            break;
                        case -2:
                            int i241 = i211 ^ 27;
                            int i242 = (i211 & 27) << 1;
                            i19 = ((i241 | i242) << 1) - (i241 ^ i242);
                            f54898d = i19 % 128;
                            int i2214 = i19 % 2;
                            component27Var = Boolean.FALSE;
                            break;
                        case -1:
                            int i243 = ((i213 ^ 44) + ((i213 & 44) << 1)) - 1;
                            f54897c = i243 % 128;
                            if (i243 % 2 != 0) {
                                int i244 = 19 / 0;
                            }
                            component27Var = Boolean.FALSE;
                            break;
                        case 0:
                            int i245 = i213 + 125;
                            f54897c = i245 % 128;
                            int i246 = i245 % 2;
                            component27Var = Boolean.FALSE;
                            break;
                        default:
                            component27Var = Boolean.FALSE;
                            break;
                    }
                } else {
                    int i247 = i211 & 107;
                    int i248 = (i211 | 107) & (~i247);
                    int i249 = -(-(i247 << 1));
                    int i250 = (i248 & i249) + (i249 | i248);
                    f54898d = i250 % 128;
                    int i251 = i250 % 2;
                }
                component27Var = Boolean.TRUE;
                break;
                break;
        }
        return component27Var;
    }

    @Override // com.mypinpad.tsdk.isolation.setSecondaryProgress
    @NotNull
    public final component27 setCompoundDrawableTintBlendMode(@NotNull byte[] bArr, long j10, @NotNull setLinksClickable setlinksclickable) {
        return (component27) setOnFocusChangeListener(new Object[]{this, bArr, Long.valueOf(j10), setlinksclickable}, -117339886, 117339893, System.identityHashCode(this));
    }
}
