package com.noknok.android.uaf.framework.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.noknok.android.client.utils.Logger;
import org.fidoalliance.aidl.IUAFOperation;
import org.fidoalliance.aidl.IUAFResponseListener;

/* JADX INFO: loaded from: classes11.dex */
public class UafService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f63609a = 0;

    public class UafServiceImpl extends IUAFOperation.Stub {
        public UafServiceImpl() {
        }

        @Override // org.fidoalliance.aidl.IUAFOperation
        public void process(Intent intent, IUAFResponseListener iUAFResponseListener) throws RemoteException {
            int i10 = UafService.f63609a;
            Logger.d("UafService", "AIDL process called");
            iUAFResponseListener.onResult(new UafIntentProcessor().processIntent(intent, UafService.this.getApplicationContext(), null, false));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Logger.d("UafService", "onBind: " + intent.toString());
        return new UafServiceImpl();
    }

    @Override // android.app.Service
    public void onCreate() {
        Logger.d("UafService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.d("UafService", "onDestroy");
        stopSelf();
        super.onDestroy();
    }
}
