package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/EuropeEndpoint;", "Lcom/mypinpad/tsdk/i/notifyAll;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EuropeEndpoint extends notifyAll {

    @NotNull
    public static final EuropeEndpoint INSTANCE = new EuropeEndpoint();

    static {
        int i10 = 1 & 1;
        int i11 = -(-((1 ^ 1) | i10));
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        int i13 = i12 % 128;
        if (i12 % 2 != 0) {
            int i14 = 15 / 0;
        }
    }

    public EuropeEndpoint() {
        super(null);
    }
}
