package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class gl extends fx {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56038j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56039k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f56040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final component10 f56041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f56043i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue, @NotNull component10 component10Var, @NotNull setContentDescription setcontentdescription, @NotNull setFontFeatureSettings setfontfeaturesettings) {
        super(fiVar, settextkeepstate, grVar);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        this.f56040f = getvalue;
        this.f56041g = component10Var;
        this.f56042h = setcontentdescription;
        this.f56043i = setfontfeaturesettings;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        gl glVar = (gl) objArr[0];
        gh ghVar = new gh(glVar.setOnFocusChangeListener());
        gh.setY(new Object[]{ghVar}, -574935641, 574935642, System.identityHashCode(ghVar));
        gq gqVar = new gq(glVar.setOnFocusChangeListener(), glVar.setCompoundDrawableTintBlendMode(), glVar.setX(), glVar.f56042h);
        fk fkVar = (fk) gq.setX(new Object[]{gqVar}, -1369194799, 1369194804, System.identityHashCode(gqVar));
        if (fkVar != null) {
            int i13 = f56039k;
            int i14 = ((i13 | 37) << 1) - (i13 ^ 37);
            f56038j = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 98 / 0;
            }
            int i16 = ((i13 ^ 102) + ((i13 & 102) << 1)) - 1;
            f56038j = i16 % 128;
            if (i16 % 2 == 0) {
                return fkVar;
            }
            int i17 = 82 / 0;
            return fkVar;
        }
        gk gkVar = new gk(glVar.setOnFocusChangeListener(), glVar.setCompoundDrawableTintBlendMode(), glVar.setX());
        fk fkVar2 = (fk) gk.setY(new Object[]{gkVar}, -881258237, 881258237, System.identityHashCode(gkVar));
        if (fkVar2 == null) {
            gn gnVar = new gn(glVar.setOnFocusChangeListener(), glVar.f56041g, glVar.f56043i);
            gn.setCompoundDrawableTintBlendMode(new Object[]{gnVar}, 210093159, -210093159, System.identityHashCode(gnVar));
            gj gjVar = new gj(glVar.setOnFocusChangeListener(), glVar.f56040f);
            fk fkVar3 = (fk) gj.setX(new Object[]{gjVar}, -1399696471, 1399696471, System.identityHashCode(gjVar));
            int i18 = f56038j + 67;
            f56039k = i18 % 128;
            int i19 = i18 % 2;
            return fkVar3;
        }
        int i20 = f56039k;
        int i21 = i20 ^ 11;
        int i22 = -(-((i20 & 11) << 1));
        int i23 = (i21 & i22) + (i22 | i21);
        int i24 = i23 % 128;
        f56038j = i24;
        int i25 = i23 % 2;
        int i26 = ((i24 ^ 5) | (i24 & 5)) << 1;
        int i27 = -(((~i24) & 5) | (i24 & (-6)));
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        f56039k = i28 % 128;
        int i29 = i28 % 2;
        return fkVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setX(new Object[]{this, continuation}, -1873838722, 1873838722, System.identityHashCode(this));
    }
}
