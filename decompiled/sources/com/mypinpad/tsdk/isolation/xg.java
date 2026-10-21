package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/xg;", "Lcom/mypinpad/tsdk/i/we;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class xg extends we {

    @NotNull
    public static final xg INSTANCE = new xg();

    static {
        int i10 = (1 & 45) + (1 | 45);
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    public xg() {
        super(wf.setOnLongClickListener, null);
    }
}
