package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class bb extends t {
    public bb() {
        super(setAnimation.setImageState().setDividerPadding());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        bb bbVar = (bb) objArr[0];
        setFitsSystemWindows.Companion companion = setFitsSystemWindows.INSTANCE;
        return (setFitsSystemWindows) setFitsSystemWindows.Companion.setOnFocusChangeListener(new Object[]{Byte.valueOf(((Byte) setLogo.setY(new Object[]{Byte.valueOf(bbVar.setCompoundDrawableTintBlendMode()[0]), 6}, 1382640069, -1382640067, 6)).byteValue())}, 179081543, -179081543, (int) System.currentTimeMillis());
    }

    @NotNull
    public final setFitsSystemWindows setLayoutAnimation() {
        return (setFitsSystemWindows) setOnFocusChangeListener(new Object[]{this}, -1171807076, 1171807076, System.identityHashCode(this));
    }
}
