package com.mypinpad.tsdk.isolation;

import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import ek.a;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ho extends hm {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f56214f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56215g = 1;

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[setTextLocales.values().length];
            iArr[setTextLocales.setY.ordinal()] = 1;
            iArr[setTextLocales.setX.ordinal()] = 2;
            iArr[setTextLocales.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            setCompoundDrawableTintBlendMode = iArr;
            int i10 = 1 & 95;
            int i11 = -(-((1 ^ 95) | i10));
            int i12 = (i10 & i11) + (i10 | i11);
            int i13 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar) {
        super(gvVar, settextkeepstate, exVar);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0071  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        u4 u4Var;
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i13 | (~(i14 | i15));
        int i17 = ~(i10 | i11);
        if ((((~(i10 | i15)) | (~(i11 | i14))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i17) * (-1444)) + ((i16 | i17) * 1444) + (i11 * (-721)) + (i10 * (-721)) == 1) {
            ho hoVar = (ho) objArr[0];
            Continuation continuation = (Continuation) objArr[1];
            int i18 = f56214f;
            int i19 = i18 & 79;
            int i20 = -(-((i18 ^ 79) | i19));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f56215g = i21 % 128;
            Object[] objArr2 = new Object[2];
            if (i21 % 2 == 0) {
                objArr2[0] = hoVar;
                objArr2[1] = continuation;
                onFocusChangeListener = setOnFocusChangeListener(objArr2, 1306572932, -1306572932, (int) System.currentTimeMillis());
                int i22 = 75 / 0;
            } else {
                objArr2[0] = hoVar;
                objArr2[1] = continuation;
                onFocusChangeListener = setOnFocusChangeListener(objArr2, 1306572932, -1306572932, (int) System.currentTimeMillis());
            }
            return onFocusChangeListener;
        }
        ho hoVar2 = (ho) objArr[0];
        Continuation continuation2 = (Continuation) objArr[1];
        int i23 = f56215g;
        int i24 = i23 + 59;
        f56214f = i24 % 128;
        if (i24 % 2 != 0) {
            boolean z10 = continuation2 instanceof u4;
            throw null;
        }
        if (continuation2 instanceof u4) {
            u4Var = (u4) continuation2;
            int i25 = u4Var.f61242s0;
            if ((i25 & Integer.MIN_VALUE) != 0) {
                int i26 = i23 & 63;
                int i27 = -(-((i23 ^ 63) | i26));
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                f56214f = i28 % 128;
                if (i28 % 2 != 0) {
                    u4Var.f61242s0 = i25 >>> Integer.MIN_VALUE;
                } else {
                    u4Var.f61242s0 = (((i25 | (-2147483647)) << 1) - ((-2147483647) ^ i25)) - 1;
                }
            } else {
                u4Var = new u4(hoVar2, continuation2);
                int i29 = f56215g;
                int i30 = (i29 ^ 89) + ((i29 & 89) << 1);
                f56214f = i30 % 128;
                int i31 = i30 % 2;
            }
        } else {
            u4Var = new u4(hoVar2, continuation2);
            int i210 = f56215g;
            int i32 = (i210 ^ 89) + ((i210 & 89) << 1);
            f56214f = i32 % 128;
            int i33 = i32 % 2;
        }
        Object compoundDrawableTintBlendMode = u4Var.f61240q0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i34 = u4Var.f61242s0;
        if (i34 == 0) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            setTextKeepState compoundDrawableTintBlendMode2 = hoVar2.setCompoundDrawableTintBlendMode();
            u4Var.f61239p0 = hoVar2;
            u4Var.f61242s0 = 1;
            compoundDrawableTintBlendMode = setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode2, u4Var}, -1083100835, 1083100838, System.identityHashCode(compoundDrawableTintBlendMode2));
            if (compoundDrawableTintBlendMode == coroutine_suspended) {
                int i35 = f56215g;
                int i36 = i35 & 67;
                int i37 = ((i35 ^ 67) | i36) << 1;
                int i38 = -((i35 | 67) & (~i36));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                int i40 = i39 % 128;
                f56214f = i40;
                int i41 = i39 % 2;
                int i42 = i40 & 33;
                int i43 = -(-((i40 ^ 33) | i42));
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                f56215g = i44 % 128;
                int i45 = i44 % 2;
                return coroutine_suspended;
            }
        } else {
            if (i34 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hoVar2 = u4Var.f61239p0;
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i46 = f56214f;
            int i47 = i46 & 95;
            int i48 = (i46 | 95) & (~i47);
            int i49 = -(-(i47 << 1));
            int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
            f56215g = i50 % 128;
            int i51 = i50 % 2;
        }
        a aVar = (a) compoundDrawableTintBlendMode;
        int i52 = setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode[((setTextLocales) a.setX(new Object[]{aVar}, -298445589, 298445592, System.identityHashCode(aVar))).ordinal()];
        if (i52 == 1) {
            fk navigationOnClickListener = hoVar2.setNavigationOnClickListener();
            int i53 = f56214f;
            int i54 = ((((i53 ^ 5) | (i53 & 5)) << 1) - (~(-(((~i53) & 5) | (i53 & (-6)))))) - 1;
            f56215g = i54 % 128;
            if (i54 % 2 != 0) {
                return navigationOnClickListener;
            }
            throw null;
        }
        if (i52 == 2) {
            fk dividerPadding = hoVar2.setDividerPadding();
            int i55 = f56215g;
            int i56 = (-2) - ((((i55 | 118) << 1) - (i55 ^ 118)) ^ (-1));
            f56214f = i56 % 128;
            if (i56 % 2 == 0) {
                return dividerPadding;
            }
            throw null;
        }
        if (i52 != 3) {
            throw new fh(32, ((setTextLocales) a.setX(new Object[]{aVar}, -298445589, 298445592, System.identityHashCode(aVar))).toString());
        }
        fk compoundDrawableTintBlendMode3 = hoVar2.setCompoundDrawableTintBlendMode(aVar);
        int i57 = f56214f;
        int i58 = i57 & 91;
        int i59 = ((i57 | 91) & (~i58)) + (i58 << 1);
        f56215g = i59 % 128;
        int i60 = i59 % 2;
        return compoundDrawableTintBlendMode3;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setOnFocusChangeListener(new Object[]{this, continuation}, 1631178982, -1631178981, System.identityHashCode(this));
    }
}
