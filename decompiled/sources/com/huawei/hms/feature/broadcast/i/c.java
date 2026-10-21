package com.huawei.hms.feature.broadcast.i;

import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.feature.broadcast.IHWMarketBroadcastHandler;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes10.dex */
public class c implements IHWMarketBroadcastHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50215a = "c";

    @Override // com.huawei.hms.feature.broadcast.IHWMarketBroadcastHandler
    public InstallState makeSessionState(Intent intent) {
        Bundle bundle = new Bundle();
        SafeIntent safeIntent = new SafeIntent(intent);
        bundle.putInt(com.huawei.hms.feature.model.b.f50436f, safeIntent.getIntExtra(com.huawei.hms.feature.model.c.f50448d, -1));
        int intExtra = safeIntent.getIntExtra(com.huawei.hms.feature.model.c.f50449e, -1);
        String str = f50215a;
        Logger.i(str, "DownloadProcess result: " + intExtra);
        if (intExtra != 0) {
            Bundle bundleExtra = safeIntent.getBundleExtra(com.huawei.hms.feature.model.c.f50452h);
            if (bundleExtra != null) {
                SafeBundle safeBundle = new SafeBundle(bundleExtra);
                int i10 = safeBundle.getInt(com.huawei.hms.feature.model.c.f50458o);
                bundle.putInt("status", com.huawei.hms.feature.utils.d.a(i10, 1));
                Logger.i(str, "Download staus :" + i10 + ",interruptReason:" + safeBundle.getInt(com.huawei.hms.feature.model.c.f50459p));
            } else {
                Logger.w(str, "download failed:unknown reason.....because Bundle.state from market is null.");
                bundle.putInt("status", 6);
                bundle.putInt("error_code", -100);
            }
        } else {
            bundle.putInt("status", 2);
            Bundle bundleExtra2 = safeIntent.getBundleExtra(com.huawei.hms.feature.model.c.f50452h);
            if (bundleExtra2 != null) {
                SafeBundle safeBundle2 = new SafeBundle(bundleExtra2);
                int i11 = safeBundle2.getInt(com.huawei.hms.feature.model.c.f50458o);
                bundle.putInt("status", com.huawei.hms.feature.utils.d.a(i11, 1));
                Logger.i(str, "Download staus :" + i11 + ",interruptReason:" + safeBundle2.getInt(com.huawei.hms.feature.model.c.f50459p));
                bundle.putLong(com.huawei.hms.feature.model.b.f50433c, safeBundle2.getLong(com.huawei.hms.feature.model.c.f50457n, 0L));
                bundle.putLong(com.huawei.hms.feature.model.b.f50437g, safeBundle2.getLong(com.huawei.hms.feature.model.c.m, 1L));
                bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50440j, safeBundle2.getStringArrayList(com.huawei.hms.feature.model.c.f50463t));
                bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50443n, safeBundle2.getStringArrayList(com.huawei.hms.feature.model.c.f50464u));
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("state", bundle);
        return InstallState.makeSessionState(bundle2);
    }
}
