package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/ProceedPinPadLaunchRequest;", "Lcom/mypinpad/tsdk/api/callbacks/HandlePinPadLaunchRequestResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProceedPinPadLaunchRequest extends HandlePinPadLaunchRequestResult {

    @NotNull
    public static final ProceedPinPadLaunchRequest INSTANCE = new ProceedPinPadLaunchRequest();

    static {
        int i10 = 1 & 103;
        int i11 = -(-((1 ^ 103) | i10));
        int i12 = (i10 & i11) + (i10 | i11);
        int i13 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private ProceedPinPadLaunchRequest() {
        super(null);
    }
}
