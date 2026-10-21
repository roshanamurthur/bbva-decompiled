package com.huawei.hms.feature.broadcast;

import android.os.Bundle;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.secure.android.common.intent.SafeBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50212a = "InstallState";

    private static Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle == null) {
            Logger.w(f50212a, "Get state info form bundle failed.");
            return bundle2;
        }
        SafeBundle safeBundle = new SafeBundle(bundle);
        int i10 = safeBundle.getInt(com.huawei.hms.feature.model.c.f50465v, 1);
        bundle2.putInt(com.huawei.hms.feature.model.b.f50436f, safeBundle.getInt(com.huawei.hms.feature.model.c.f50448d));
        int iA = com.huawei.hms.feature.utils.d.a(safeBundle.getInt(com.huawei.hms.feature.model.c.f50458o), i10);
        bundle2.putInt("status", iA);
        if (1 == i10) {
            bundle2.putLong(com.huawei.hms.feature.model.b.f50433c, safeBundle.getLong(com.huawei.hms.feature.model.c.f50457n));
            bundle2.putLong(com.huawei.hms.feature.model.b.f50437g, safeBundle.getLong(com.huawei.hms.feature.model.c.m));
            if (6 == iA) {
                bundle2.putInt("error_code", com.huawei.hms.feature.utils.d.a(safeBundle.getInt(com.huawei.hms.feature.model.c.f50458o)));
                String str = f50212a;
                Logger.e(str, "Download  failed, status:" + safeBundle.getInt(com.huawei.hms.feature.model.c.f50458o));
                Logger.e(str, "Download  failed, interruptReason:" + safeBundle.getInt(com.huawei.hms.feature.model.c.f50459p));
            }
        } else {
            int i11 = safeBundle.getInt(com.huawei.hms.feature.model.c.f50462s, 0);
            Logger.e(f50212a, "Install status: package manager code:" + i11 + " -default value is 0");
            if (i11 != 0) {
                bundle2.putInt("error_code", i11);
            }
        }
        bundle2.putStringArrayList(com.huawei.hms.feature.model.b.f50440j, safeBundle.getStringArrayList(com.huawei.hms.feature.model.c.f50463t));
        bundle2.putStringArrayList(com.huawei.hms.feature.model.b.f50443n, safeBundle.getStringArrayList(com.huawei.hms.feature.model.c.f50464u));
        return bundle2;
    }

    public static InstallState b(Bundle bundle) {
        return InstallState.getStateFromBundle(a((Bundle) bundle.getParcelable(com.huawei.hms.feature.model.c.f50452h)));
    }

    public static List<InstallState> c(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.huawei.hms.feature.model.c.f50453i);
        if (parcelableArrayList == null || parcelableArrayList.size() == 0) {
            Logger.w(f50212a, "Get session state list info form bundle failed..");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(InstallState.getStateFromBundle(a((Bundle) it.next())));
        }
        return arrayList;
    }
}
