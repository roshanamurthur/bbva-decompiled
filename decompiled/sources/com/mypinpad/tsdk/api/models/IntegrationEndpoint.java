package com.mypinpad.tsdk.api.models;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/api/models/IntegrationEndpoint;", "Lcom/mypinpad/tsdk/api/models/Endpoint;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntegrationEndpoint extends Endpoint {

    @NotNull
    public static final IntegrationEndpoint INSTANCE = new IntegrationEndpoint();

    static {
        int i10 = -(-105);
        int i11 = (i10 << 1) - i10;
        int i12 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private IntegrationEndpoint() {
        super(null);
    }
}
