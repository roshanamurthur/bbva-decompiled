package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/CancelPinPadLaunchRequest;", "Lcom/mypinpad/tsdk/api/callbacks/HandlePinPadLaunchRequestResult;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CancelPinPadLaunchRequest extends HandlePinPadLaunchRequestResult {

    @NotNull
    public static final CancelPinPadLaunchRequest INSTANCE = new CancelPinPadLaunchRequest();

    static {
        int i10 = (1 - (-34)) - 1;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private CancelPinPadLaunchRequest() {
        super(null);
    }
}
