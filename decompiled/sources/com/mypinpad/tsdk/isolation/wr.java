package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/wr;", "Lcom/mypinpad/tsdk/i/wl;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wr extends wl {

    @NotNull
    public static final wr INSTANCE = new wr();

    static {
        int i10 = 1 | 11;
        int i11 = i10 << 1;
        int i12 = -(i10 & (~(1 & 11)));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public wr() {
        super(wm.UiMessageCallbackKtWhenMappings, null);
    }
}
