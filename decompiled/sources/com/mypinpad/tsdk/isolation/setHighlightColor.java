package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setHighlightColor extends setScrollBarDefaultDelayBeforeFade {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f59786y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static int f59787z = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Terminal f59788x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setHighlightColor() {
        super(setBackgroundTintList.Companion.setCompoundDrawableTintBlendMode(), null);
        setBackgroundTintList.Companion companion = setBackgroundTintList.INSTANCE;
        this.f59788x = Terminal.OTHER;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = i13 | i10;
        int i15 = ((~(i14 | i11)) * 52) + (i11 * 53) + (i10 * (-51));
        int i16 = ~i11;
        int i17 = (((~i14) | (~(i16 | i10)) | (~(i16 | i13))) * (-52)) + i15;
        int i18 = ~i10;
        if ((((~(i18 | i11)) | (~(i13 | i18))) * 52) + i17 == 1) {
            setHighlightColor sethighlightcolor = (setHighlightColor) objArr[0];
            System.identityHashCode(sethighlightcolor);
            System.identityHashCode(sethighlightcolor);
            Terminal terminal = sethighlightcolor.f59788x;
            int i19 = f59786y + 11;
            f59787z = i19 % 128;
            if (i19 % 2 != 0) {
                return terminal;
            }
            throw null;
        }
        md mdVar = (md) objArr[1];
        setTop settop = (setTop) objArr[2];
        int i20 = f59787z;
        int i21 = (i20 & (-108)) | ((~i20) & 107);
        int i22 = -(-((i20 & 107) << 1));
        int i23 = (i21 & i22) + (i22 | i21);
        f59786y = i23 % 128;
        int i24 = i23 % 2;
        Intrinsics.checkNotNullParameter(mdVar, "");
        Intrinsics.checkNotNullParameter(settop, "");
        int i25 = f59787z;
        int i26 = i25 & 53;
        int i27 = (i25 | 53) & (~i26);
        int i28 = -(-(i26 << 1));
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        f59786y = i29 % 128;
        if (i29 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade
    @NotNull
    public final Terminal setDividerPadding() {
        return (Terminal) setCompoundDrawableTintBlendMode(new Object[]{this}, -1019457303, 1019457304, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade
    public final void setOnFocusChangeListener(@NotNull md mdVar, @NotNull setTop settop) {
        setCompoundDrawableTintBlendMode(new Object[]{this, mdVar, settop}, -2030498211, 2030498211, System.identityHashCode(this));
    }
}
