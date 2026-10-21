package com.noknok.android.client.appsdk;

import android.content.Context;
import com.noknok.android.client.asm.api.uaf.json.AuthenticatorInfo;
import com.noknok.android.client.utils.ActivityProxy;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AsmSelectionUI {

    public enum OperationType {
        Reg,
        Auth
    }

    @Deprecated
    public int openUI(Context context, List<List<AuthenticatorInfo>> list, OperationType operationType, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public int openUI(ActivityProxy activityProxy, List<List<AuthenticatorInfo>> list, OperationType operationType, boolean z10) {
        return openUI(activityProxy.getWorkerActivity(), list, operationType, z10);
    }
}
