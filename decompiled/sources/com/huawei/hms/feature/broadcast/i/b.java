package com.huawei.hms.feature.broadcast.i;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.feature.broadcast.IHWMarketBroadcastHandler;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.secure.android.common.util.SafeString;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class b implements IHWMarketBroadcastHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50214a = "b";

    @Override // com.huawei.hms.feature.broadcast.IHWMarketBroadcastHandler
    public InstallState makeSessionState(Intent intent) {
        Bundle bundle = new Bundle();
        SafeIntent safeIntent = new SafeIntent(intent);
        bundle.putInt(com.huawei.hms.feature.model.b.f50436f, safeIntent.getIntExtra(com.huawei.hms.feature.model.c.f50448d, -1));
        int intExtra = safeIntent.getIntExtra(com.huawei.hms.feature.model.c.f50449e, -1);
        String str = f50214a;
        Logger.i(str, "DownloadComplete result: " + intExtra);
        if (intExtra != 0) {
            Bundle bundleExtra = safeIntent.getBundleExtra(com.huawei.hms.feature.model.c.f50452h);
            if (bundleExtra != null) {
                SafeBundle safeBundle = new SafeBundle(bundleExtra);
                int i10 = safeBundle.getInt(com.huawei.hms.feature.model.c.f50458o);
                bundle.putInt("status", 6);
                Logger.i(str, "Download staus :" + i10 + ",interruptReason:" + safeBundle.getInt(com.huawei.hms.feature.model.c.f50459p));
            } else {
                bundle.putInt("status", 6);
            }
        } else {
            bundle.putInt("status", 3);
            Bundle bundleExtra2 = safeIntent.getBundleExtra(com.huawei.hms.feature.model.c.f50452h);
            if (bundleExtra2 != null) {
                SafeBundle safeBundle2 = new SafeBundle(bundleExtra2);
                bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50440j, safeBundle2.getStringArrayList(com.huawei.hms.feature.model.c.f50463t));
                bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50443n, safeBundle2.getStringArrayList(com.huawei.hms.feature.model.c.f50464u));
            }
            ArrayList parcelableArrayListExtra = safeIntent.getParcelableArrayListExtra(com.huawei.hms.feature.model.c.f50454j);
            if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() > 0) {
                Logger.i(str, "get apk uris from market. size is :" + parcelableArrayListExtra.size());
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(parcelableArrayListExtra.size());
                for (int i11 = 0; i11 < parcelableArrayListExtra.size(); i11++) {
                    Intent intent2 = new Intent();
                    intent2.setData((Uri) parcelableArrayListExtra.get(i11));
                    String path = ((Uri) parcelableArrayListExtra.get(i11)).getPath();
                    intent2.putExtra(com.huawei.hms.feature.model.b.f50442l, SafeString.substring(path, path.lastIndexOf(File.separator) + 1));
                    arrayList.add(intent2);
                }
                bundle.putParcelableArrayList(com.huawei.hms.feature.model.b.f50439i, arrayList);
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("state", bundle);
        return InstallState.makeSessionState(bundle2);
    }
}
