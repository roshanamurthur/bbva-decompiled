package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/vt;", "Lcom/mypinpad/tsdk/i/wl;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class vt extends wl {

    @NotNull
    public static final vt INSTANCE = new vt();

    static {
        int i10 = 7 << 1;
        int i11 = -7;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        int i13 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public vt() {
        super(wm.setTextAlignment, null);
    }
}
