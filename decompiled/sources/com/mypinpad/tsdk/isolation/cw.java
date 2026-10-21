package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class cw extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f55064g = {i.d(cw.class, "terminalType_B1", "getTerminalType_B1()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/terminal/TerminalType;", 0)};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55066i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f55067f;

    static {
        int i10 = f55066i + 29;
        f55065h = i10 % 128;
        int i11 = i10 % 2;
    }

    public cw() {
        super(setAnimation.setTransformationMethod().setDividerPadding());
        da.Companion companion = da.INSTANCE;
        this.f55067f = new n(0, 7, 0, (openContextMenu) da.Companion.setY(new Object[0], 1348427754, -1348427754, (int) System.currentTimeMillis()));
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        cw cwVar = (cw) objArr[0];
        int i13 = f55065h;
        int i14 = i13 ^ 57;
        int i15 = ((i13 & 57) | i14) << 1;
        int i16 = -i14;
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        f55066i = i17 % 128;
        int i18 = i17 % 2;
        n nVar = cwVar.f55067f;
        da daVar = (da) ((Enum) n.setCompoundDrawableTintBlendMode(new Object[]{nVar, cwVar, f55064g[0]}, 2052976211, -2052976210, System.identityHashCode(nVar)));
        System.identityHashCode(cwVar);
        System.identityHashCode(cwVar);
        return daVar;
    }

    @NotNull
    public final da getNavBarTitleString() {
        return (da) setY(new Object[]{this}, -1066192597, 1066192597, System.identityHashCode(this));
    }
}
