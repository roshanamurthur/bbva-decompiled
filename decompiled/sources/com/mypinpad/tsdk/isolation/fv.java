package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class fv extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f55579g = {i.d(fv.class, "terminalType_B1", "getTerminalType_B1()Lcom/mypinpad/softpos/emv/terminal/kernel/kernel13/model/smarttag/tag/terminal/Kernel13TerminalType;", 0)};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55580h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55581i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f55582f;

    static {
        int i10 = f55580h;
        int i11 = ((i10 ^ 95) | (i10 & 95)) << 1;
        int i12 = -(((~i10) & 95) | (i10 & (-96)));
        int i13 = (i11 & i12) + (i11 | i12);
        f55581i = i13 % 128;
        int i14 = i13 % 2;
    }

    public fv() {
        super(setAnimation.setTransformationMethod().setDividerPadding());
        ft.Companion companion = ft.INSTANCE;
        this.f55582f = new n(0, 7, 0, (openContextMenu) ft.Companion.setX(new Object[0], 909111607, -909111607, (int) System.currentTimeMillis()));
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        fv fvVar = (fv) objArr[0];
        int i13 = f55580h;
        int i14 = (i13 ^ 43) + ((i13 & 43) << 1);
        f55581i = i14 % 128;
        int i15 = i14 % 2;
        n nVar = fvVar.f55582f;
        ft ftVar = (ft) ((Enum) n.setCompoundDrawableTintBlendMode(new Object[]{nVar, fvVar, f55579g[0]}, 2052976211, -2052976210, System.identityHashCode(nVar)));
        int i16 = f55581i;
        int i17 = i16 & 115;
        int i18 = ((i16 | 115) & (~i17)) + (i17 << 1);
        f55580h = i18 % 128;
        int i19 = i18 % 2;
        return ftVar;
    }

    @NotNull
    public final ft setNavigationOnClickListener() {
        return (ft) setY(new Object[]{this}, -714196005, 714196005, System.identityHashCode(this));
    }
}
