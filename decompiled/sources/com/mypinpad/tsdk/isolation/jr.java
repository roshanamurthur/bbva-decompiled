package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class jr extends jk {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56681k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56682l = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f56683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final component10 f56684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f56685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final iw f56686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56687j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull kc kcVar, @NotNull getValue getvalue, @NotNull component10 component10Var, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull iw iwVar, @NotNull setContentDescription setcontentdescription) {
        super(ivVar, settextkeepstate, kcVar);
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(iwVar, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56683f = getvalue;
        this.f56684g = component10Var;
        this.f56685h = setfontfeaturesettings;
        this.f56686i = iwVar;
        this.f56687j = setcontentdescription;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        jr jrVar = (jr) objArr[0];
        js jsVar = new js(jrVar.setOnFocusChangeListener());
        js.setOnFocusChangeListener(new Object[]{jsVar}, 430325155, -430325154, System.identityHashCode(jsVar));
        jq jqVar = new jq(jrVar.setOnFocusChangeListener(), jrVar.f56687j);
        jq.setCompoundDrawableTintBlendMode(new Object[]{jqVar}, -2056512586, 2056512587, System.identityHashCode(jqVar));
        jo joVar = new jo(jrVar.setOnFocusChangeListener(), jrVar.setCompoundDrawableTintBlendMode(), jrVar.setX(), jrVar.f56685h, jrVar.f56686i);
        fk fkVar = (fk) jo.setX(new Object[]{joVar}, -725137687, 725137695, System.identityHashCode(joVar));
        if (fkVar != null) {
            int i13 = f56682l;
            int i14 = i13 & 23;
            int i15 = (i14 - (~((i13 ^ 23) | i14))) - 1;
            f56681k = i15 % 128;
            if (i15 % 2 == 0) {
                return fkVar;
            }
            throw null;
        }
        jw jwVar = new jw(jrVar.setOnFocusChangeListener(), jrVar.f56684g, jrVar.f56685h);
        jw.setOnFocusChangeListener(new Object[]{jwVar}, 927926171, -927926171, System.identityHashCode(jwVar));
        ju juVar = new ju(jrVar.setOnFocusChangeListener());
        ju.setX(new Object[]{juVar}, -1863043043, 1863043043, System.identityHashCode(juVar));
        jv jvVar = new jv(jrVar.setOnFocusChangeListener(), jrVar.f56683f);
        fk fkVar2 = (fk) jv.setDividerPadding(new Object[]{jvVar}, 1958509473, -1958509473, System.identityHashCode(jvVar));
        int i16 = (-2) - ((f56681k + 14) ^ (-1));
        f56682l = i16 % 128;
        int i17 = i16 % 2;
        return fkVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setOnFocusChangeListener(new Object[]{this, continuation}, 1799532298, -1799532298, System.identityHashCode(this));
    }
}
