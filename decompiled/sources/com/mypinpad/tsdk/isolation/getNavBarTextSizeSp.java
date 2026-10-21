package com.mypinpad.tsdk.isolation;

import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getNavBarTextSizeSp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55923c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55924d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, byte[]> f55925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setLinkTextColor f55926b;

    /* JADX WARN: Multi-variable type inference failed */
    public getNavBarTextSizeSp(@NotNull Function1<? super Integer, byte[]> function1, @NotNull setLinkTextColor setlinktextcolor) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(setlinktextcolor, "");
        this.f55925a = function1;
        this.f55926b = setlinktextcolor;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        getNavBarTextSizeSp getnavbartextsizesp = (getNavBarTextSizeSp) objArr[0];
        setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = new setVerticalScrollbarTrackDrawable(getnavbartextsizesp.f55925a.invoke(80));
        Boolean bool = component25.setY;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (!bool.booleanValue()) {
            try {
                getClientId getclientid = new getClientId((byte[]) ((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setverticalscrollbartrackdrawable}, -1034568962, 1034568962, System.identityHashCode(setverticalscrollbartrackdrawable))).clone(), 80);
                CloseableKt.closeFinally(setverticalscrollbartrackdrawable, null);
                int i13 = f55924d;
                int i14 = (i13 & 123) + (i13 | 123);
                f55923c = i14 % 128;
                int i15 = i14 % 2;
                return getclientid;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(setverticalscrollbartrackdrawable, th2);
                    throw th3;
                }
            }
        }
        setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable2 = new setVerticalScrollbarTrackDrawable(getnavbartextsizesp.f55926b.setCompoundDrawableTintBlendMode(2000L, 80));
        try {
            try {
                getClientId getclientid2 = new getClientId((byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setverticalscrollbartrackdrawable2}, -1034568962, 1034568962, System.identityHashCode(setverticalscrollbartrackdrawable2)), (byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{setverticalscrollbartrackdrawable}, -1034568962, 1034568962, System.identityHashCode(setverticalscrollbartrackdrawable))}, 1635997004, -1635997000, (int) System.currentTimeMillis()), 80);
                CloseableKt.closeFinally(setverticalscrollbartrackdrawable2, null);
                int i16 = f55923c;
                int i17 = (((i16 | 41) << 1) - (~(-(((~i16) & 41) | (i16 & (-42)))))) - 1;
                int i18 = i17 % 128;
                f55924d = i18;
                int i19 = i17 % 2;
                int i20 = i18 | 1;
                int i21 = i20 << 1;
                int i22 = -((~(i18 & 1)) & i20);
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                f55923c = i23 % 128;
                if (i23 % 2 != 0) {
                    CloseableKt.closeFinally(setverticalscrollbartrackdrawable, null);
                    throw null;
                }
                CloseableKt.closeFinally(setverticalscrollbartrackdrawable, null);
                int i24 = f55923c;
                int i25 = ((i24 & 22) + (i24 | 22)) - 1;
                f55924d = i25 % 128;
                int i26 = i25 % 2;
                return getclientid2;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(setverticalscrollbartrackdrawable2, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                CloseableKt.closeFinally(setverticalscrollbartrackdrawable, th6);
                throw th7;
            }
        }
    }

    @NotNull
    public final getClientId setY() {
        return (getClientId) setX(new Object[]{this}, 9532177, -9532177, System.identityHashCode(this));
    }
}
