package com.huawei.hms.feature.broadcast.i;

import android.content.Intent;
import android.os.Bundle;
import androidx.collection.k;
import com.huawei.hms.feature.broadcast.IHWMarketBroadcastHandler;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes10.dex */
public class d implements IHWMarketBroadcastHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50216a = "d";

    @Override // com.huawei.hms.feature.broadcast.IHWMarketBroadcastHandler
    public InstallState makeSessionState(Intent intent) {
        Bundle bundle = new Bundle();
        SafeIntent safeIntent = new SafeIntent(intent);
        bundle.putInt(com.huawei.hms.feature.model.b.f50436f, safeIntent.getIntExtra(com.huawei.hms.feature.model.c.f50448d, -1));
        int intExtra = safeIntent.getIntExtra(com.huawei.hms.feature.model.c.f50449e, -1);
        String str = f50216a;
        Logger.i(str, "InstallComplete result: " + intExtra);
        Bundle bundleExtra = safeIntent.getBundleExtra(com.huawei.hms.feature.model.c.f50452h);
        if (intExtra != 0) {
            bundle.putInt("status", 6);
            if (bundleExtra != null) {
                SafeBundle safeBundle = new SafeBundle(bundleExtra);
                int i10 = safeBundle.getInt(com.huawei.hms.feature.model.c.f50458o);
                int i11 = safeBundle.getInt(com.huawei.hms.feature.model.c.f50462s, 0);
                Logger.i(str, k.c("Install Failed: market status:", i10, " packageManager install status:", i11, "-default value is 0"));
                bundle.putInt("error_code", i11);
            }
        } else {
            bundle.putInt("status", 5);
            if (bundleExtra != null) {
                SafeBundle safeBundle2 = new SafeBundle(bundleExtra);
                bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50440j, safeBundle2.getStringArrayList(com.huawei.hms.feature.model.c.f50463t));
                bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50441k, safeBundle2.getStringArrayList(com.huawei.hms.feature.model.b.f50441k));
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("state", bundle);
        return InstallState.makeSessionState(bundle2);
    }
}
