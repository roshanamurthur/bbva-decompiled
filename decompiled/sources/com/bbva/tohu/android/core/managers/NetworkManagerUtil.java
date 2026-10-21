package com.bbva.tohu.android.core.managers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkManagerUtil {
    private ConnectivityManager conectivityManager;

    public NetworkManagerUtil(Context context) {
        this.conectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static NetworkManagerUtil getInstance(Context context) {
        return new NetworkManagerUtil(context);
    }

    public boolean isOnline() {
        NetworkInfo activeNetworkInfo = this.conectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}
