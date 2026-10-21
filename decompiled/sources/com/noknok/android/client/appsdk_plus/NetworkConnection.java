package com.noknok.android.client.appsdk_plus;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.Toast;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;

/* JADX INFO: loaded from: classes11.dex */
public class NetworkConnection {
    @SuppressLint({"MissingPermission"})
    public static boolean isNetworkAvailable(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
    }

    public static void showNetworkUnavailableMessage(Context context) {
        Toast.makeText(context, UiConfig.getText(context, UIConfigTags.LEVELS_MANAGE_REG_VIEW, UIConfigTags.TAG_ERROR_MESSAGE_NETWORK_UNAVAILABLE, R.string.nnl_appsdk_plus_msg_network_unavailable), 1).show();
    }
}
