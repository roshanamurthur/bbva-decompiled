package com.noknok.android.client.utils;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public abstract class UserSelectionUI {
    @Deprecated
    public int openUI(Context context, ArrayList<String> arrayList, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public int openUI(ActivityProxy activityProxy, ArrayList<String> arrayList, boolean z10) {
        return openUI(activityProxy.getWorkerActivity(), arrayList, z10);
    }
}
