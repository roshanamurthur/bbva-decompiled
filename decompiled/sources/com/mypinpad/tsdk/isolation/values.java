package com.mypinpad.tsdk.isolation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class values {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61526b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61527c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CancelPinPadLaunchRequest<b0, setImageURI> f61528a = new CancelPinPadLaunchRequest<>();

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = (i15 * 446) + (((~(i10 | i14 | i12)) | (~(i11 | i13))) * 446) + (((~((~i12) | i14)) | i15) * 446) + (i11 * (-445)) + (i10 * (-445));
        if (i16 == 1) {
            values valuesVar = (values) objArr[0];
            Terminal terminal = (Terminal) objArr[1];
            setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) objArr[2];
            md mdVar = (md) objArr[3];
            Intrinsics.checkNotNullParameter(terminal, "");
            Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
            Intrinsics.checkNotNullParameter(mdVar, "");
            CancelPinPadLaunchRequest<b0, setImageURI> cancelPinPadLaunchRequest = valuesVar.f61528a;
            setImageURI setimageuri = (setImageURI) CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest, new b0(terminal, mdVar), setbackgroundtintlist}, 1452864265, -1452864265, System.identityHashCode(cancelPinPadLaunchRequest));
            if (setimageuri == null) {
                int i17 = f61526b;
                int i18 = i17 & 21;
                int i19 = i18 + ((i17 ^ 21) | i18);
                f61527c = i19 % 128;
                if (i19 % 2 == 0) {
                    throw null;
                }
                int i20 = (-2) - (((i17 & 74) + (i17 | 74)) ^ (-1));
                f61527c = i20 % 128;
                if (i20 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            objValueOf = (setFontFeatureSettings) setImageURI.setX(new Object[]{setimageuri}, -1838857790, 1838857790, System.identityHashCode(setimageuri));
            int i21 = f61527c;
            int i22 = (i21 & 59) + (i21 | 59);
            f61526b = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
        } else {
            if (i16 != 2) {
                if (i16 != 3) {
                    values valuesVar2 = (values) objArr[0];
                    setImageURI setimageuri2 = (setImageURI) objArr[1];
                    Intrinsics.checkNotNullParameter(setimageuri2, "");
                    CancelPinPadLaunchRequest<b0, setImageURI> cancelPinPadLaunchRequest2 = valuesVar2.f61528a;
                    b0 b0Var = new b0(((setMax) setImageURI.setX(new Object[]{setimageuri2}, -1896705164, 1896705168, System.identityHashCode(setimageuri2))).setDividerPadding(), ((setMax) setImageURI.setX(new Object[]{setimageuri2}, -1896705164, 1896705168, System.identityHashCode(setimageuri2))).setX());
                    setMax setmax = (setMax) setImageURI.setX(new Object[]{setimageuri2}, -1896705164, 1896705168, System.identityHashCode(setimageuri2));
                    CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest2, b0Var, (setBackgroundTintList) setMax.setX(new Object[]{setmax}, 1901627190, -1901627173, System.identityHashCode(setmax)), setimageuri2}, -235006928, 235006933, System.identityHashCode(cancelPinPadLaunchRequest2));
                    int i23 = f61526b;
                    int i24 = i23 & 1;
                    int i25 = (i23 ^ 1) | i24;
                    int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                    f61527c = i26 % 128;
                    int i27 = i26 % 2;
                    return null;
                }
                values valuesVar3 = (values) objArr[0];
                Function1 function1 = (Function1) objArr[1];
                int i28 = f61527c;
                int i29 = ((i28 & 29) - (~(i28 | 29))) - 1;
                f61526b = i29 % 128;
                if (i29 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(function1, "");
                    CancelPinPadLaunchRequest<b0, setImageURI> cancelPinPadLaunchRequest3 = valuesVar3.f61528a;
                    CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest3, function1}, 1503856781, -1503856777, System.identityHashCode(cancelPinPadLaunchRequest3));
                    return null;
                }
                Intrinsics.checkNotNullParameter(function1, "");
                CancelPinPadLaunchRequest<b0, setImageURI> cancelPinPadLaunchRequest4 = valuesVar3.f61528a;
                CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest4, function1}, 1503856781, -1503856777, System.identityHashCode(cancelPinPadLaunchRequest4));
                throw null;
            }
            values valuesVar4 = (values) objArr[0];
            int i30 = f61527c + 23;
            f61526b = i30 % 128;
            int i31 = i30 % 2;
            CancelPinPadLaunchRequest<b0, setImageURI> cancelPinPadLaunchRequest5 = valuesVar4.f61528a;
            boolean zBooleanValue = ((Boolean) CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest5}, -1767569711, 1767569713, System.identityHashCode(cancelPinPadLaunchRequest5))).booleanValue();
            int i32 = f61527c;
            int i33 = i32 ^ 121;
            int i34 = (((i32 & 121) | i33) << 1) - i33;
            f61526b = i34 % 128;
            if (i34 % 2 != 0) {
                int i35 = 50 / 0;
            }
            objValueOf = Boolean.valueOf(zBooleanValue);
        }
        return objValueOf;
    }

    @Nullable
    public final setFontFeatureSettings setCompoundDrawableTintBlendMode(@NotNull Terminal terminal, @NotNull setBackgroundTintList setbackgroundtintlist, @NotNull md mdVar) {
        return (setFontFeatureSettings) setY(new Object[]{this, terminal, setbackgroundtintlist, mdVar}, -1159783560, 1159783561, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull setImageURI setimageuri) {
        setY(new Object[]{this, setimageuri}, 1508320102, -1508320102, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull Function1<? super setImageURI, setImageURI> function1) {
        setY(new Object[]{this, function1}, 1066085569, -1066085566, System.identityHashCode(this));
    }

    public final boolean setX() {
        return ((Boolean) setY(new Object[]{this}, 83221832, -83221830, System.identityHashCode(this))).booleanValue();
    }
}
