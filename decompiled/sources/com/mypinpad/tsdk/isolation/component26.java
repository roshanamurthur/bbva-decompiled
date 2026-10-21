package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/component26;", "", "Lcom/mypinpad/tsdk/i/setBackgroundDrawable;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/setBackgroundDrawable;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class component26 {

    @NotNull
    public static final component26 INSTANCE = new component26();

    static {
        int i10 = (~0) & 7;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    @NotNull
    public static setBackgroundDrawable setCompoundDrawableTintBlendMode() {
        return (setBackgroundDrawable) setOnFocusChangeListener(new Object[0], -1326539077, 1326539077, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return new getDiscretionaryTagData();
    }
}
