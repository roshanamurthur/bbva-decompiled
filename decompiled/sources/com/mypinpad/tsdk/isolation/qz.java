package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/qz;", "Lcom/mypinpad/tsdk/i/rb;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class qz extends rb {

    @NotNull
    public static final qz INSTANCE = new qz();

    static {
        int i10 = 1 & 13;
        int i11 = (1 ^ 13) | i10;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        int i13 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public qz() {
        super(null);
    }
}
