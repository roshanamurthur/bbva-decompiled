package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jh extends eb<iv, kc> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56638i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56639j = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull kc kcVar, @NotNull getValue getvalue) {
        super(ivVar, settextkeepstate, kcVar, getvalue);
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        jh jhVar = (jh) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i13 = f56639j;
        int i14 = i13 & 27;
        int i15 = (((i13 | 27) & (~i14)) - (~(i14 << 1))) - 1;
        f56638i = i15 % 128;
        int i16 = i15 % 2;
        Intrinsics.checkNotNullParameter(setrotationx, "");
        kc kcVar = (kc) jhVar.setX();
        fk fkVar = (fk) kc.setDividerPadding(new Object[]{kcVar, (iv) jhVar.setOnFocusChangeListener(), jhVar.setCompoundDrawableTintBlendMode(), setrotationx}, -1386322137, 1386322138, System.identityHashCode(kcVar));
        int i17 = f56638i;
        int i18 = i17 & 91;
        int i19 = -(-((i17 ^ 91) | i18));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        f56639j = i20 % 128;
        if (i20 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setX(@NotNull setRotationX setrotationx) {
        return (fk) setOnFocusChangeListener(new Object[]{this, setrotationx}, 691854250, -691854250, System.identityHashCode(this));
    }
}
