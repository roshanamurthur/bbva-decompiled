package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/ma;", "", "Lcom/mypinpad/tsdk/i/lq;", "p0", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/ew;", "p2", "Lcom/mypinpad/tsdk/i/setFontFeatureSettings;", "p3", "Lcom/mypinpad/tsdk/i/getValue;", "p4", "Lcom/mypinpad/tsdk/i/component10;", "p5", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p6", "Lcom/mypinpad/tsdk/i/fk;", "setY", "(Lcom/mypinpad/tsdk/i/lq;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/ew;Lcom/mypinpad/tsdk/i/setFontFeatureSettings;Lcom/mypinpad/tsdk/i/getValue;Lcom/mypinpad/tsdk/i/component10;Lcom/mypinpad/tsdk/i/setContentDescription;)Lcom/mypinpad/tsdk/i/fk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ma {

    @NotNull
    public static final ma INSTANCE = new ma();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57065a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f57066b;

    static {
        int i10 = f57065a;
        int i11 = ((i10 | 46) << 1) - (i10 ^ 46);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f57066b = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        lq lqVar = (lq) objArr[0];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[1];
        ew ewVar = (ew) objArr[2];
        setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) objArr[3];
        getValue getvalue = (getValue) objArr[4];
        component10 component10Var = (component10) objArr[5];
        setContentDescription setcontentdescription = (setContentDescription) objArr[6];
        int i13 = f57066b;
        int i14 = i13 + 3;
        f57065a = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ewVar, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        ee eeVar = ee.setDividerPadding;
        ee.setOnFocusChangeListener(new Object[]{lqVar, setcontentdescription}, -1171320731, 1171320749, (int) System.currentTimeMillis());
        ee eeVar2 = ee.setDividerPadding;
        ee.setOnFocusChangeListener(new Object[]{lqVar, component10Var, setfontfeaturesettings, Boolean.TRUE}, 844101167, -844101167, (int) System.currentTimeMillis());
        lq.setCompoundDrawableTintBlendMode(new Object[]{lqVar, (setFitsSystemWindows) ee.setOnFocusChangeListener(new Object[]{lqVar, Long.valueOf(((Long) lq.setCompoundDrawableTintBlendMode(new Object[]{lqVar}, 280097942, -280097941, System.identityHashCode(lqVar))).longValue())}, -1226013544, 1226013559, (int) System.currentTimeMillis())}, -704967938, 704967938, System.identityHashCode(lqVar));
        fk fkVar = (fk) ee.setOnFocusChangeListener(new Object[]{lqVar, getvalue, (setFitsSystemWindows) lq.setCompoundDrawableTintBlendMode(new Object[]{lqVar}, -1934930086, 1934930090, System.identityHashCode(lqVar)), (ds) lq.setCompoundDrawableTintBlendMode(new Object[]{lqVar}, 328985409, -328985407, System.identityHashCode(lqVar))}, -1842798873, 1842798887, (int) System.currentTimeMillis());
        int i16 = i13 & 63;
        int i17 = (i16 - (~(-(-((i13 ^ 63) | i16))))) - 1;
        f57065a = i17 % 128;
        int i18 = i17 % 2;
        return fkVar;
    }

    @NotNull
    public static fk setY(@NotNull lq p4, @NotNull setTextKeepState p10, @NotNull ew<lq> p11, @NotNull setFontFeatureSettings p12, @NotNull getValue p13, @NotNull component10 p14, @NotNull setContentDescription p15) {
        return (fk) setDividerPadding(new Object[]{p4, p10, p11, p12, p13, p14, p15}, 356977936, -356977936, (int) System.currentTimeMillis());
    }
}
