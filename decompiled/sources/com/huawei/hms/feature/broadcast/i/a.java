package com.huawei.hms.feature.broadcast.i;

import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.feature.broadcast.IHWMarketBroadcastHandler;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes10.dex */
public class a implements IHWMarketBroadcastHandler {
    @Override // com.huawei.hms.feature.broadcast.IHWMarketBroadcastHandler
    public InstallState makeSessionState(Intent intent) {
        Bundle bundle = new Bundle();
        SafeIntent safeIntent = new SafeIntent(intent);
        bundle.putInt(com.huawei.hms.feature.model.b.f50436f, safeIntent.getIntExtra(com.huawei.hms.feature.model.c.f50448d, -1));
        bundle.putInt("status", 8);
        bundle.putParcelable(com.huawei.hms.feature.model.b.f50438h, safeIntent.getParcelableExtra(com.huawei.hms.feature.model.c.f50451g));
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("state", bundle);
        return InstallState.makeSessionState(bundle2);
    }
}
