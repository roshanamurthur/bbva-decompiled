package com.mypinpad.tsdk.api.models;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/api/models/SouthPacificEndpoint;", "Lcom/mypinpad/tsdk/api/models/Endpoint;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SouthPacificEndpoint extends Endpoint {

    @NotNull
    public static final SouthPacificEndpoint INSTANCE = new SouthPacificEndpoint();

    static {
        int i10 = 95 << 1;
        int i11 = -95;
        int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
        int i13 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private SouthPacificEndpoint() {
        super(null);
    }
}
