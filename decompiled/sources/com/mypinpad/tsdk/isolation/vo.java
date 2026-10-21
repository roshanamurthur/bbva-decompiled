package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/vo;", "Lcom/mypinpad/tsdk/i/vr;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class vo extends vr {

    @NotNull
    public static final vo INSTANCE = new vo();

    static {
        int i10 = 1 & 109;
        int i11 = (i10 - (~(-(-((1 ^ 109) | i10))))) - 1;
        int i12 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public vo() {
        super(null);
    }
}
