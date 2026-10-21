package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getCancelButtonText extends setFastScrollAlwaysVisible {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final setVerticalScrollbarPosition f55716p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f55717q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCancelButtonText(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, boolean z10) {
        super(null);
        Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
        this.f55716p0 = setverticalscrollbarposition;
        this.f55717q0 = z10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i14 = ~i11;
        return (((~((~i10) | i12)) | i14) * 301) + ((((~(i14 | i12)) | (~((~i12) | i10))) * (-301)) + i13) != 1 ? Boolean.valueOf(((getCancelButtonText) objArr[0]).f55717q0) : ((getCancelButtonText) objArr[0]).f55716p0;
    }

    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 751000322, -751000322, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final setVerticalScrollbarPosition setY() {
        return (setVerticalScrollbarPosition) setOnFocusChangeListener(new Object[]{this}, -1828569903, 1828569904, System.identityHashCode(this));
    }
}
