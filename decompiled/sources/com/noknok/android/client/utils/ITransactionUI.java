package com.noknok.android.client.utils;

import android.app.Activity;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface ITransactionUI {
    @Deprecated
    Outcome openUI(Activity activity, String str, String str2, Map<String, String> map);

    Outcome openUI(ActivityProxy activityProxy, String str, String str2, Map<String, String> map);
}
