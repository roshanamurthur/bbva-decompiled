package com.mypinpad.tsdk.isolation;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class az extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54182f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f54183g = 1;

    public az() {
        super(setAnimation.TsdkManualInitializerinit1().setDividerPadding());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        az azVar = (az) objArr[0];
        int i13 = f54183g + 113;
        f54182f = i13 % 128;
        int i14 = i13 % 2;
        setMaxWidth setmaxwidth = (setMaxWidth) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{getBeepOnFailure.setOnFocusChangeListener, azVar.setCompoundDrawableTintBlendMode()}, 367993749, -367993745, (int) System.currentTimeMillis());
        int i15 = f54182f;
        int i16 = ((i15 | 85) << 1) - (i15 ^ 85);
        f54183g = i16 % 128;
        int i17 = i16 % 2;
        return setmaxwidth;
    }

    @NotNull
    public final List<getBeepOnFailure> setNavigationOnClickListener() {
        return (List) setOnFocusChangeListener(new Object[]{this}, 1527997756, -1527997756, System.identityHashCode(this));
    }
}
