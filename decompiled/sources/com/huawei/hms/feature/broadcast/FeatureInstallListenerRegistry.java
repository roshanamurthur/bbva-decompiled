package com.huawei.hms.feature.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.hms.feature.install.FeatureInstallManagerFactory;
import com.huawei.hms.feature.listener.InstallStateListener;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.utils.Logger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FeatureInstallListenerRegistry<StateT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50176a = "FeatureInstallListenerRegistry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f50177b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f50181f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<InstallStateListener> f50178c = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f50180e = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f50179d = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                FeatureInstallListenerRegistry.this.handleBroadcast(context, intent);
            } catch (RuntimeException e5) {
                Logger.e(FeatureInstallListenerRegistry.f50176a, "RuntimeException happen", e5);
            }
        }
    }

    public FeatureInstallListenerRegistry(Context context) {
        this.f50177b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
    }

    private void b() {
        if ((this.f50179d || !this.f50178c.isEmpty()) && this.f50180e == null) {
            this.f50180e = new a();
            String appFrom = FeatureInstallManagerFactory.getAppFrom(this.f50177b);
            IntentFilter intentFilterMakeBroadcastFilter = BroadcastHandlerManager.makeBroadcastFilter();
            if (!BroadcastHandlerManager.f50169f.containsKey(appFrom)) {
                Logger.e(f50176a, "Exception happen, Get an error APP_FROM  " + appFrom);
                return;
            }
            Logger.i(f50176a, "register receiver...." + appFrom);
            this.f50177b.registerReceiver(this.f50180e, intentFilterMakeBroadcastFilter, BroadcastHandlerManager.f50169f.get(appFrom), null);
        }
    }

    private void c() {
        if (this.f50179d || !this.f50178c.isEmpty() || this.f50180e == null) {
            return;
        }
        Logger.d(f50176a, "unRegisterReceiver....");
        this.f50177b.unregisterReceiver(this.f50180e);
        this.f50180e = null;
    }

    public final synchronized void forceRegister(boolean z10) {
        Logger.d(f50176a, "forceRegister");
        this.f50179d = z10;
        b();
    }

    public List<String> getModuleName() {
        return this.f50181f;
    }

    public abstract void handleBroadcast(Context context, Intent intent);

    public final synchronized void notifyListeners(InstallState installState) {
        Iterator<InstallStateListener> it = this.f50178c.iterator();
        while (it.hasNext()) {
            it.next().onStateUpdate(installState);
        }
    }

    public final synchronized void registerListener(InstallStateListener installStateListener) {
        Logger.i(f50176a, "registerInstallListener");
        this.f50178c.add(installStateListener);
        b();
    }

    public void setModuleName(List<String> list) {
        this.f50181f = list;
    }

    public final synchronized void unregisterListener(InstallStateListener installStateListener) {
        Logger.i(f50176a, "unregisterInstallListener");
        this.f50178c.remove(installStateListener);
        c();
    }
}
