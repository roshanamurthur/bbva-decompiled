package com.huawei.hms.feature.remote;

import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.feature.model.InstallState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static Bundle a(InstallState installState) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", b(installState));
        return bundle;
    }

    private static Bundle b(InstallState installState) {
        Bundle bundle = new Bundle();
        bundle.putInt(com.huawei.hms.feature.model.b.f50436f, installState.sessionId());
        bundle.putInt("status", installState.status());
        bundle.putInt("error_code", installState.errorCode());
        bundle.putLong(com.huawei.hms.feature.model.b.f50433c, installState.bytesDownloaded());
        bundle.putLong(com.huawei.hms.feature.model.b.f50437g, installState.totalBytesToDownload());
        bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50440j, (ArrayList) installState.moduleNames());
        bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50441k, (ArrayList) installState.moduleFiles());
        bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50443n, (ArrayList) installState.languages());
        bundle.putParcelable(com.huawei.hms.feature.model.b.f50438h, installState.resolutionIntent());
        return bundle;
    }

    public static Bundle a(Collection<String> collection) {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("moduleNames", (ArrayList) collection);
        return bundle;
    }

    public static Bundle a(List<InstallState> list) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<InstallState> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(com.huawei.hms.feature.model.b.f50432b, arrayList);
        return bundle;
    }

    public static ArrayList<String> a(Bundle bundle) {
        return bundle.getStringArrayList("moduleNames");
    }
}
