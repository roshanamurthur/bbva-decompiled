package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.mypinpad.tsdk.api.callbacks.CancelPinPadLaunchRequest;
import com.mypinpad.tsdk.api.callbacks.HandlePinPadLaunchRequestResult;
import com.mypinpad.tsdk.api.callbacks.PinPadLaunchRequestListener;
import com.mypinpad.tsdk.api.callbacks.ProceedPinPadLaunchRequest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f58086a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58087b = 1;

    public static final class setDividerPadding implements re {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ PinPadLaunchRequestListener f58088a;

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            return (rb) rd.setOnFocusChangeListener(new Object[]{((setDividerPadding) objArr[0]).f58088a.onPinPadLaunchRequest()}, -768339534, 768339534, (int) System.currentTimeMillis());
        }

        @Override // com.mypinpad.tsdk.isolation.re
        @NotNull
        public final rb setDividerPadding() {
            return (rb) setX(new Object[]{this}, 1597375627, -1597375627, System.identityHashCode(this));
        }
    }

    @NotNull
    public static final re setCompoundDrawableTintBlendMode(@NotNull PinPadLaunchRequestListener pinPadLaunchRequestListener) {
        return (re) setOnFocusChangeListener(new Object[]{pinPadLaunchRequestListener}, 1386872930, -1386872929, (int) System.currentTimeMillis());
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        qz qzVar;
        int i13 = (i11 * 517) + (i10 * (-515));
        int i14 = ~i11;
        int i15 = ~(i14 | i12);
        int i16 = ~i12;
        int i17 = i15 | (~(i16 | i10));
        int i18 = ~(i16 | i11);
        int i19 = ~i10;
        if ((((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i14 | i19)) | (~(i19 | i16 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i17 | i18) * (-516)) + i13 == 1) {
            PinPadLaunchRequestListener pinPadLaunchRequestListener = (PinPadLaunchRequestListener) objArr[0];
            Intrinsics.checkNotNullParameter(pinPadLaunchRequestListener, "");
            setDividerPadding setdividerpadding = new setDividerPadding();
            setdividerpadding.f58088a = pinPadLaunchRequestListener;
            int i20 = f58086a;
            int i21 = (i20 & 3) + (i20 | 3);
            f58087b = i21 % 128;
            int i22 = i21 % 2;
            return setdividerpadding;
        }
        HandlePinPadLaunchRequestResult handlePinPadLaunchRequestResult = (HandlePinPadLaunchRequestResult) objArr[0];
        int i23 = f58087b;
        int i24 = (i23 ^ 41) + ((i23 & 41) << 1);
        f58086a = i24 % 128;
        int i25 = i24 % 2;
        Intrinsics.checkNotNullParameter(handlePinPadLaunchRequestResult, "");
        if (!Intrinsics.areEqual(handlePinPadLaunchRequestResult, CancelPinPadLaunchRequest.INSTANCE)) {
            if (!Intrinsics.areEqual(handlePinPadLaunchRequestResult, ProceedPinPadLaunchRequest.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            int i26 = f58087b;
            int i27 = i26 & 47;
            int i28 = (i26 | 47) & (~i27);
            int i29 = i27 << 1;
            int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
            f58086a = i30 % 128;
            int i31 = i30 % 2;
            rg rgVar = rg.INSTANCE;
            int i32 = f58087b + 14;
            int i33 = (i32 ^ (-1)) + (i32 << 1);
            f58086a = i33 % 128;
            int i34 = i33 % 2;
            return rgVar;
        }
        int i35 = f58086a;
        int i36 = i35 & 121;
        int i37 = ((i35 ^ 121) | i36) << 1;
        int i38 = -((i35 | 121) & (~i36));
        int i39 = (i37 & i38) + (i38 | i37);
        f58087b = i39 % 128;
        if (i39 % 2 == 0) {
            qzVar = qz.INSTANCE;
            int i40 = 69 / 0;
        } else {
            qzVar = qz.INSTANCE;
        }
        int i41 = f58086a;
        int i42 = (i41 | 29) << 1;
        int i43 = -(i41 ^ 29);
        int i44 = (i42 & i43) + (i43 | i42);
        f58087b = i44 % 128;
        if (i44 % 2 != 0) {
            return qzVar;
        }
        throw null;
    }

    @NotNull
    public static final rb setOnFocusChangeListener(@NotNull HandlePinPadLaunchRequestResult handlePinPadLaunchRequestResult) {
        return (rb) setOnFocusChangeListener(new Object[]{handlePinPadLaunchRequestResult}, -768339534, 768339534, (int) System.currentTimeMillis());
    }
}
