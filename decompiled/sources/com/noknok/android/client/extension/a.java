package com.noknok.android.client.extension;

import android.app.Activity;
import com.noknok.android.client.utils.ActivityProxy;
import java.util.HashMap;

/* JADX INFO: compiled from: IExtensionProcessor.java */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a {
    @Deprecated
    public static void a(IExtensionProcessor iExtensionProcessor, IExtensionList iExtensionList, HashMap map, Activity activity) {
        throw new UnsupportedOperationException();
    }

    public static void b(IExtensionProcessor iExtensionProcessor, IExtensionList iExtensionList, HashMap map, ActivityProxy activityProxy) {
        iExtensionProcessor.start(iExtensionList, (HashMap<IExtensionProcessor.ExtProcParamKey, String>) map, activityProxy.getWorkerActivity());
    }
}
