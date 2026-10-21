package com.viergegroup.sdk.taptophone.ui;

import com.mypinpad.tsdk.api.callbacks.UiMessage;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"holdTimeMs", "", "Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "PinPadSdk1032_1.0.32E_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewDataKt {
    public static final /* synthetic */ long access$holdTimeMs(UiMessage uiMessage) {
        return uiMessage.getHoldTime() * 100;
    }
}
