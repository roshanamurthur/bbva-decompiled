package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/PinPadLaunchRequestListener;", "", "Lcom/mypinpad/tsdk/api/callbacks/HandlePinPadLaunchRequestResult;", "onPinPadLaunchRequest", "()Lcom/mypinpad/tsdk/api/callbacks/HandlePinPadLaunchRequestResult;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PinPadLaunchRequestListener {
    @NotNull
    HandlePinPadLaunchRequestResult onPinPadLaunchRequest();
}
