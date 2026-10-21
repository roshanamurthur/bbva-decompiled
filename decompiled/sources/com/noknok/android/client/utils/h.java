package com.noknok.android.client.utils;

import android.app.Activity;
import java.util.Map;

/* JADX INFO: compiled from: ITransactionUI.java */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h {
    @Deprecated
    public static Outcome a(ITransactionUI iTransactionUI, Activity activity, String str, String str2, Map map) {
        throw new UnsupportedOperationException();
    }

    public static Outcome b(ITransactionUI iTransactionUI, ActivityProxy activityProxy, String str, String str2, Map map) {
        return iTransactionUI.openUI(activityProxy.getWorkerActivity(), str, str2, (Map<String, String>) map);
    }
}
