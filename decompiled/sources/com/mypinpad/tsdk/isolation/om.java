package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/om;", "Lcom/mypinpad/tsdk/i/oj;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class om extends oj {

    @NotNull
    public static final om INSTANCE = new om();

    static {
        int i10 = (30 << 1) - 30;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        int i12 = i11 % 128;
        int i13 = i11 % 2;
    }

    public om() {
        super(null);
    }
}
