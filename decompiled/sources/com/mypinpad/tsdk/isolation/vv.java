package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/vv;", "Lcom/mypinpad/tsdk/i/wi;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class vv extends wi {

    @NotNull
    public static final vv INSTANCE = new vv();

    static {
        int i10 = 1 & 69;
        int i11 = -(-(1 | 69));
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        int i13 = i12 % 128;
        int i14 = i12 % 2;
    }

    public vv() {
        super(wm.setLayoutAnimation, null);
    }
}
