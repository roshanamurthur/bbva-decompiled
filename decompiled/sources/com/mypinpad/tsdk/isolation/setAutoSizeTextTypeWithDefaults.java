package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeWithDefaults;", "Lcom/mypinpad/tsdk/i/setForeground;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setAutoSizeTextTypeWithDefaults extends setForeground {

    @NotNull
    public static final setAutoSizeTextTypeWithDefaults INSTANCE = new setAutoSizeTextTypeWithDefaults();

    static {
        int i10 = (83 << 1) - 83;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    public setAutoSizeTextTypeWithDefaults() {
        super(null);
    }
}
