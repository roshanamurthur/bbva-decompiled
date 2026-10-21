package com.huawei.hms.feature.utils;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50586a = "b";

    public static Bundle a(List<String> list, List<String> list2) {
        Logger.i(f50586a, "on construct installed state bundle");
        Bundle bundle = new Bundle();
        bundle.putInt(com.huawei.hms.feature.model.b.f50436f, 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50440j, (ArrayList) list);
        }
        if (!list2.isEmpty()) {
            bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50443n, (ArrayList) list2);
        }
        bundle.putLong(com.huawei.hms.feature.model.b.f50437g, 0L);
        bundle.putLong(com.huawei.hms.feature.model.b.f50433c, 0L);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("state", bundle);
        return bundle2;
    }
}
