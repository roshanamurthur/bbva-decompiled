package com.mypinpad.tsdk.isolation;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setScreenReaderFocusable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60444c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60445d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setTextColor f60446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f60447b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/getBeepOnFailure;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<getBeepOnFailure> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60448q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60449r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f60450p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] bArr) {
            super(0);
            this.f60450p0 = bArr;
        }

        public static /* synthetic */ getBeepOnFailure a(Object[] objArr, int i10, int i11, int i12) {
            boolean z10;
            getBeepOnFailure getbeeponfailure;
            Object compoundDrawableTintBlendMode;
            boolean z11;
            int i13 = ~i10;
            int i14 = ~((~i12) | i13);
            if ((((~(i10 | i11 | i12)) | i14) * 338) + ((~(i13 | i11)) * 338) + (((~((~i11) | i10)) | i14 | (~(i10 | i12))) * (-338)) + (i11 * 339) + (i10 * (-337)) != 1) {
                a aVar = (a) objArr[0];
                int i15 = f60448q0;
                int i16 = i15 ^ 95;
                int i17 = (i15 & 95) << 1;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                f60449r0 = i18 % 128;
                int i19 = i18 % 2;
                getBeepOnFailure getbeeponfailureA = a(new Object[]{aVar}, 1351134522, -1351134521, System.identityHashCode(aVar));
                int i20 = f60449r0;
                int i21 = ((i20 | 59) << 1) - (i20 ^ 59);
                f60448q0 = i21 % 128;
                int i22 = i21 % 2;
                return getbeeponfailureA;
            }
            a aVar2 = (a) objArr[0];
            int i23 = f60448q0;
            int i24 = ((i23 ^ 48) + ((i23 & 48) << 1)) - 1;
            int i25 = i24 % 128;
            f60449r0 = i25;
            if (i24 % 2 == 0) {
                byte[] bArr = aVar2.f60450p0;
                throw null;
            }
            byte[] bArr2 = aVar2.f60450p0;
            if (bArr2 != null) {
                int i26 = i25 & 23;
                int i27 = i26 + ((i25 ^ 23) | i26);
                f60448q0 = i27 % 128;
                if (i27 % 2 != 0) {
                    throw null;
                }
                if (bArr2.length == 0) {
                    int i28 = i25 + 99;
                    f60448q0 = i28 % 128;
                    int i29 = i28 % 2;
                    z11 = true;
                } else {
                    int i30 = ((i25 | 29) << 1) - ((i25 & (-30)) | ((~i25) & 29));
                    f60448q0 = i30 % 128;
                    int i31 = i30 % 2;
                    z11 = false;
                }
                if (!(!z11)) {
                    int i32 = f60448q0;
                    int i33 = (((i32 | 44) << 1) - (i32 ^ 44)) - 1;
                    f60449r0 = i33 % 128;
                    int i34 = i33 % 2;
                } else {
                    int i35 = (i25 | 95) << 1;
                    int i36 = -(i25 ^ 95);
                    int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                    int i38 = i37 % 128;
                    f60448q0 = i38;
                    if (i37 % 2 == 0) {
                        int i39 = (i38 & 93) + (i38 | 93);
                        int i40 = i39 % 128;
                        f60449r0 = i40;
                        int i41 = i39 % 2;
                        int i42 = ((i40 ^ 23) | (i40 & 23)) << 1;
                        int i43 = -(((~i40) & 23) | (i40 & (-24)));
                        int i44 = (i42 & i43) + (i43 | i42);
                        f60448q0 = i44 % 128;
                        int i45 = i44 % 2;
                        z10 = true;
                    }
                }
                int i46 = f60448q0;
                int i47 = i46 & 113;
                int i48 = (i46 | 113) & (~i47);
                int i49 = -(-(i47 << 1));
                int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
                f60449r0 = i50 % 128;
                int i51 = i50 % 2;
                z10 = false;
            } else {
                int i410 = f60448q0;
                int i411 = i410 & 113;
                int i412 = (i410 | 113) & (~i411);
                int i413 = -(-(i411 << 1));
                int i52 = (i412 ^ i413) + ((i412 & i413) << 1);
                f60449r0 = i52 % 128;
                int i53 = i52 % 2;
                z10 = false;
            }
            if (!z10) {
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{10012, null, 6}, 1336485880, -1336485874, 10012);
                int i54 = f60448q0 + 63;
                f60449r0 = i54 % 128;
                int i55 = i54 % 2;
                return null;
            }
            int i56 = f60449r0;
            int i57 = i56 ^ 51;
            int i58 = ((i56 & 51) | i57) << 1;
            int i59 = -i57;
            int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
            f60448q0 = i60 % 128;
            if (i60 % 2 != 0) {
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), null, null, Boolean.FALSE, 90}, -976227287, 976227290, 90);
                compoundDrawableTintBlendMode = setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{getbeeponfailure, bArr2}, -1162888331, 1162888331, (int) System.currentTimeMillis());
            } else {
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
                compoundDrawableTintBlendMode = setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{getbeeponfailure, bArr2}, -1162888331, 1162888331, (int) System.currentTimeMillis());
            }
            ((Integer) compoundDrawableTintBlendMode).intValue();
            return getbeeponfailure;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ getBeepOnFailure invoke() {
            return a(new Object[]{this}, -1977998638, 1977998638, System.identityHashCode(this));
        }
    }

    public setScreenReaderFocusable(@NotNull setTextColor settextcolor, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(settextcolor, "");
        this.f60446a = settextcolor;
        this.f60447b = LazyKt__LazyJVMKt.lazy(new a(bArr));
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = (i15 * 446) + (((~(i10 | i14 | i12)) | (~(i11 | i13))) * 446) + (((~((~i12) | i14)) | i15) * 446) + (i11 * (-445)) + (i10 * (-445));
        getBeepOnFailure getbeeponfailure = null;
        if (i16 != 1) {
            if (i16 != 2) {
                setScreenReaderFocusable setscreenreaderfocusable = (setScreenReaderFocusable) objArr[0];
                int i17 = f60444c;
                int i18 = i17 & 71;
                int i19 = (i17 ^ 71) | i18;
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                f60445d = i20 % 128;
                int i21 = i20 % 2;
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setscreenreaderfocusable.f60447b.getValue();
                int i22 = f60445d;
                int i23 = (i22 ^ 35) + ((i22 & 35) << 1);
                f60444c = i23 % 128;
                if (i23 % 2 == 0) {
                    return getbeeponfailure2;
                }
                int i24 = 62 / 0;
                return getbeeponfailure2;
            }
            setScreenReaderFocusable setscreenreaderfocusable2 = (setScreenReaderFocusable) objArr[0];
            int i25 = f60445d;
            int i26 = i25 & 79;
            int i27 = (i25 ^ 79) | i26;
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            int i29 = i28 % 128;
            f60444c = i29;
            int i30 = i28 % 2;
            setTextColor settextcolor = setscreenreaderfocusable2.f60446a;
            if (i30 != 0) {
                throw null;
            }
            int i31 = i29 & 105;
            int i32 = (i31 - (~((i29 ^ 105) | i31))) - 1;
            f60445d = i32 % 128;
            int i33 = i32 % 2;
            return settextcolor;
        }
        setScreenReaderFocusable setscreenreaderfocusable3 = (setScreenReaderFocusable) objArr[0];
        int i34 = f60444c;
        int i35 = i34 & 45;
        int i36 = i35 + ((i34 ^ 45) | i35);
        f60445d = i36 % 128;
        int i37 = i36 % 2;
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{setscreenreaderfocusable3}, 2060907440, -2060907440, System.identityHashCode(setscreenreaderfocusable3));
        if (getbeeponfailure3 == null) {
            int i38 = f60444c;
            int i39 = i38 & 119;
            int i40 = i39 + ((i38 ^ 119) | i39);
            f60445d = i40 % 128;
            int i41 = i40 % 2;
            int i42 = i38 + 119;
            f60445d = i42 % 128;
            int i43 = i42 % 2;
        } else {
            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3, setAnimation.setDivider()}, -990392770, 990392791, System.identityHashCode(getbeeponfailure3));
            if (getbeeponfailure4 == null) {
                int i44 = f60444c;
                int i45 = i44 & 79;
                int i46 = ((i44 ^ 79) | i45) << 1;
                int i47 = -((i44 | 79) & (~i45));
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                f60445d = i48 % 128;
                if (i48 % 2 == 0) {
                    throw null;
                }
            } else {
                getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4, (TransactionFailed) setAnimation.setY(new Object[0], 142032602, -142032512, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure4));
                int i49 = f60445d;
                int i50 = i49 & 125;
                int i51 = (i49 | 125) & (~i50);
                int i52 = i50 << 1;
                int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                f60444c = i53 % 128;
                int i54 = i53 % 2;
            }
        }
        return getbeeponfailure;
    }

    @Nullable
    public final getBeepOnFailure setDividerPadding() {
        return (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{this}, 891387550, -891387549, System.identityHashCode(this));
    }

    @Nullable
    public final getBeepOnFailure setOnFocusChangeListener() {
        return (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{this}, 2060907440, -2060907440, System.identityHashCode(this));
    }

    @NotNull
    public final setTextColor setX() {
        return (setTextColor) setCompoundDrawableTintBlendMode(new Object[]{this}, 1596125392, -1596125390, System.identityHashCode(this));
    }
}
