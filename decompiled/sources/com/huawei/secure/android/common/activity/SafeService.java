package com.huawei.secure.android.common.activity;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import androidx.datastore.preferences.protobuf.q;
import com.huawei.secure.android.common.intent.IntentUtils;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes10.dex */
public abstract class SafeService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50598a = "SafeService";

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i10) {
        try {
            return super.bindService(intent, serviceConnection, i10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("bindService: "), f50598a, true);
            return false;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        try {
            super.onCreate();
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("onCreate: "), f50598a, true);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("onDestroy: "), f50598a, true);
        }
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        try {
            super.onRebind(new SafeIntent(intent));
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("onRebind: "), f50598a, true);
        }
    }

    @Override // android.app.Service
    @Deprecated
    public void onStart(Intent intent, int i10) {
        if (IntentUtils.hasIntentBomb(intent)) {
            a.a(f50598a, "onStart : hasIntentBomb");
        }
        try {
            super.onStart(new SafeIntent(intent), i10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("onStart: "), f50598a, true);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (IntentUtils.hasIntentBomb(intent)) {
            a.a(f50598a, "onStartCommand : hasIntentBomb");
        }
        try {
            return super.onStartCommand(new SafeIntent(intent), i10, i11);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("onStartCommand: "), f50598a, true);
            return 0;
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        try {
            return super.onUnbind(new SafeIntent(intent));
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("onUnbind: "), f50598a, true);
            return false;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivities(Intent[] intentArr) {
        try {
            super.startActivities(intentArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("startActivities: "), f50598a, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            super.startActivity(new SafeIntent(intent));
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("startActivity: "), f50598a, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ComponentName startForegroundService(Intent intent) {
        try {
            return super.startForegroundService(new SafeIntent(intent));
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("startForegroundService: "), f50598a, true);
            return null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ComponentName startService(Intent intent) {
        try {
            return super.startService(intent);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("startService: "), f50598a, true);
            return null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean stopService(Intent intent) {
        try {
            return super.stopService(intent);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("stopService: "), f50598a, true);
            return false;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("unbindService: "), f50598a, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("unregisterReceiver: "), f50598a, true);
        }
    }
}
