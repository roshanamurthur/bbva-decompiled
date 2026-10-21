package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOverscrollFooter implements setTop {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60287c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60288d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setContextClickable f60289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public setMaxWidth f60290b;

    public setOverscrollFooter(@NotNull setContextClickable setcontextclickable) {
        Intrinsics.checkNotNullParameter(setcontextclickable, "");
        this.f60289a = setcontextclickable;
        this.f60290b = new setMaxWidth();
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = (~i10) | i13;
        int i15 = (((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i14))) * 369) + (((~i14) | i11) * (-369)) + ((i10 | i11 | i13) * (-369)) + (i11 * 370) + (i10 * 370);
        if (i15 == 1) {
            setOverscrollFooter setoverscrollfooter = (setOverscrollFooter) objArr[0];
            Terminal terminal = (Terminal) objArr[1];
            int i16 = f60288d;
            int i17 = i16 & 11;
            int i18 = i17 + ((i16 ^ 11) | i17);
            f60287c = i18 % 128;
            if (i18 % 2 != 0) {
                Intrinsics.checkNotNullParameter(terminal, "");
                setContextClickable setcontextclickable = setoverscrollfooter.f60289a;
                throw null;
            }
            Intrinsics.checkNotNullParameter(terminal, "");
            setContextClickable setcontextclickable2 = setoverscrollfooter.f60289a;
            List list = (List) setContextClickable.setDividerPadding(new Object[]{setcontextclickable2, terminal}, -370743054, 370743054, System.identityHashCode(setcontextclickable2));
            int i19 = f60287c + 13;
            f60288d = i19 % 128;
            if (i19 % 2 != 0) {
                return list;
            }
            int i20 = 91 / 0;
            return list;
        }
        if (i15 == 2) {
            setOverscrollFooter setoverscrollfooter2 = (setOverscrollFooter) objArr[0];
            setMaxWidth setmaxwidth = (setMaxWidth) objArr[1];
            int i21 = f60288d;
            int i22 = ((i21 ^ 95) | (i21 & 95)) << 1;
            int i23 = -(((~i21) & 95) | (i21 & (-96)));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            f60287c = i24 % 128;
            if (i24 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setmaxwidth, "");
                setoverscrollfooter2.f60290b = setmaxwidth;
                throw null;
            }
            Intrinsics.checkNotNullParameter(setmaxwidth, "");
            setoverscrollfooter2.f60290b = setmaxwidth;
            int i25 = f60288d;
            int i26 = i25 & 13;
            int i27 = (i25 | 13) & (~i26);
            int i28 = i26 << 1;
            int i29 = (i27 & i28) + (i27 | i28);
            f60287c = i29 % 128;
            if (i29 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i15 == 3) {
            setOverscrollFooter setoverscrollfooter3 = (setOverscrollFooter) objArr[0];
            int i30 = f60288d;
            int i31 = i30 ^ 3;
            int i32 = -(-((i30 & 3) << 1));
            int i33 = (i31 & i32) + (i32 | i31);
            f60287c = i33 % 128;
            if (i33 % 2 != 0) {
                ((setMaxWidth) setDividerPadding(new Object[]{setoverscrollfooter3}, -482452877, 482452881, System.identityHashCode(setoverscrollfooter3))).clear();
                throw null;
            }
            ((setMaxWidth) setDividerPadding(new Object[]{setoverscrollfooter3}, -482452877, 482452881, System.identityHashCode(setoverscrollfooter3))).clear();
            int i34 = f60287c;
            int i35 = (((i34 | 30) << 1) - (i34 ^ 30)) - 1;
            f60288d = i35 % 128;
            int i36 = i35 % 2;
            return null;
        }
        if (i15 == 4) {
            setOverscrollFooter setoverscrollfooter4 = (setOverscrollFooter) objArr[0];
            int i37 = f60287c;
            int i38 = ((i37 ^ 90) + ((i37 & 90) << 1)) - 1;
            f60288d = i38 % 128;
            int i39 = i38 % 2;
            setMaxWidth setmaxwidth2 = setoverscrollfooter4.f60290b;
            int i40 = i37 ^ 5;
            int i41 = (i37 & 5) << 1;
            int i42 = (i40 & i41) + (i41 | i40);
            f60288d = i42 % 128;
            if (i42 % 2 != 0) {
                return setmaxwidth2;
            }
            throw null;
        }
        setOverscrollFooter setoverscrollfooter5 = (setOverscrollFooter) objArr[0];
        Terminal terminal2 = (Terminal) objArr[1];
        md mdVar = (md) objArr[2];
        setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) objArr[3];
        int i43 = ((-1) << 1) - ((f60287c + 82) ^ (-1));
        f60288d = i43 % 128;
        int i44 = i43 % 2;
        Intrinsics.checkNotNullParameter(terminal2, "");
        Intrinsics.checkNotNullParameter(mdVar, "");
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        ((setMaxWidth) setDividerPadding(new Object[]{setoverscrollfooter5}, -482452877, 482452881, System.identityHashCode(setoverscrollfooter5))).clear();
        setContextClickable setcontextclickable3 = setoverscrollfooter5.f60289a;
        setDividerPadding(new Object[]{setoverscrollfooter5, (setMaxWidth) setContextClickable.setDividerPadding(new Object[]{setcontextclickable3, terminal2, mdVar, setbackgroundtintlist}, 506432843, -506432840, System.identityHashCode(setcontextclickable3))}, 1802856818, -1802856816, System.identityHashCode(setoverscrollfooter5));
        int i45 = f60287c + 19;
        f60288d = i45 % 128;
        int i46 = i45 % 2;
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.setTop
    public final void setCompoundDrawableTintBlendMode(@NotNull Terminal terminal, @NotNull md mdVar, @NotNull setBackgroundTintList setbackgroundtintlist) {
        setDividerPadding(new Object[]{this, terminal, mdVar, setbackgroundtintlist}, 619474371, -619474371, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setTop
    @NotNull
    public final setMaxWidth setCompoundDrawableTintBlendMode() {
        return (setMaxWidth) setDividerPadding(new Object[]{this}, -482452877, 482452881, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setTop
    public final void setDividerPadding() {
        setDividerPadding(new Object[]{this}, 2053638781, -2053638778, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setTop
    @NotNull
    public final List<TransactionFailed> setDividerPadding(@NotNull Terminal terminal) {
        return (List) setDividerPadding(new Object[]{this, terminal}, 552987797, -552987796, System.identityHashCode(this));
    }
}
