package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dq;", "Lcom/mypinpad/tsdk/i/dk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class dq extends dk {

    @NotNull
    public static final dq INSTANCE = new dq();

    static {
        int i10 = 1 & 57;
        int i11 = ((1 ^ 57) | i10) << 1;
        int i12 = -((~i10) & (1 | 57));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        int i14 = i13 % 128;
        int i15 = i13 % 2;
    }
}
