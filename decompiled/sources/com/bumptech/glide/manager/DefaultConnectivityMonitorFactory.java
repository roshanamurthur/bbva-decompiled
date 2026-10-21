package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultConnectivityMonitorFactory implements ConnectivityMonitorFactory {
    @Override // com.bumptech.glide.manager.ConnectivityMonitorFactory
    @NonNull
    public ConnectivityMonitor build(@NonNull Context context, @NonNull ConnectivityMonitor.ConnectivityListener connectivityListener) {
        return ContextCompat.checkSelfPermission(context, MagiskApp.ACCESS_NETWORK_STATE) == 0 ? new a(context, connectivityListener) : new zc.f();
    }
}
