package com.noknok.android.uaf.framework.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.RemoteException;
import com.fido.android.framework.service.Mfac;
import com.noknok.android.client.commlib.ICommunicationClient;
import com.noknok.android.client.commlib.ICommunicationClientResponse;
import com.noknok.android.client.mfac.ASMCommunicationClientRequest;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.uaf.AppFinder;
import com.noknok.android.uaf.asm.service.IUafAsmService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class UAFServiceASMCommunicationClient implements ICommunicationClient, ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Semaphore f63598b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, IUafAsmService> f63597a = new HashMap();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.noknok.android.uaf.asm.service.IUafAsmService>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<java.lang.String, com.noknok.android.uaf.asm.service.IUafAsmService>] */
    private synchronized IUafAsmService a(String str) {
        IUafAsmService iUafAsmService;
        iUafAsmService = (IUafAsmService) this.f63597a.get(str);
        if (iUafAsmService != null && !iUafAsmService.asBinder().pingBinder()) {
            this.f63597a.remove(str);
            iUafAsmService = null;
        }
        return iUafAsmService;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.HashMap, java.util.Map<java.lang.String, com.noknok.android.uaf.asm.service.IUafAsmService>] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.HashMap, java.util.Map<java.lang.String, com.noknok.android.uaf.asm.service.IUafAsmService>] */
    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public String[] getServiceModuleList(String str) {
        String[] strArr;
        this.f63598b = new Semaphore(0, false);
        Context applicationContext = Mfac.Instance().getContext().getApplicationContext();
        AppFinder appFinder = new AppFinder(applicationContext, AppFinder.MIME_TYPE_ASM);
        List<ResolveInfo> serviceApps = appFinder.getServiceApps();
        if (AppSDKConfig.getInstance(applicationContext).get(AppSDKConfig.Key.usePreloadedOnly).getAsBoolean()) {
            appFinder.removeUserApps(serviceApps);
        }
        Intent intent = new Intent();
        intent.setAction(AppFinder.SERVICE_ACTION);
        intent.setType(AppFinder.MIME_TYPE_ASM);
        int i10 = 0;
        for (ResolveInfo resolveInfo : serviceApps) {
            String str2 = resolveInfo.serviceInfo.packageName + "," + resolveInfo.serviceInfo.name;
            if (a(str2) == null) {
                intent.setPackage(resolveInfo.serviceInfo.applicationInfo.packageName);
                try {
                    applicationContext.bindService(intent, this, 1);
                    i10++;
                } catch (SecurityException e5) {
                    Logger.e("UAFServiceASMCommunicationClient", "Unable to bind service:" + str2, e5);
                }
            }
        }
        try {
            if (!this.f63598b.tryAcquire(i10, 30L, TimeUnit.SECONDS)) {
                Logger.w("UAFServiceASMCommunicationClient", "Not all ASM services were connected");
            }
        } catch (InterruptedException e7) {
            Logger.e("UAFServiceASMCommunicationClient", "Error while acquiring service lock ", e7);
            Thread.currentThread().interrupt();
        }
        synchronized (this) {
            Logger.i("UAFServiceASMCommunicationClient", "UAF AIDL ASM list: " + this.f63597a.keySet());
            strArr = (String[]) this.f63597a.keySet().toArray(new String[0]);
        }
        return strArr;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, com.noknok.android.uaf.asm.service.IUafAsmService>] */
    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str = componentName.getPackageName() + "," + componentName.getClassName();
        Logger.i("UAFServiceASMCommunicationClient", "Connected to remote ASM service " + str);
        synchronized (this) {
            this.f63597a.put(str, IUafAsmService.Stub.asInterface(iBinder));
        }
        this.f63598b.release();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.noknok.android.uaf.asm.service.IUafAsmService>] */
    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.f63597a.remove(componentName.getPackageName() + "," + componentName.getClassName());
        }
        Mfac.Instance().getContext().unbindService(this);
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public long sendRequest(String str, String str2, Object obj, ICommunicationClientResponse iCommunicationClientResponse) {
        String strSendRequest;
        Logger.i("UAFServiceASMCommunicationClient", "Sending request to remote ASM service " + str);
        ASMCommunicationClientRequest aSMCommunicationClientRequest = (ASMCommunicationClientRequest) obj;
        try {
            IUafAsmService iUafAsmServiceA = a(str);
            strSendRequest = iUafAsmServiceA != null ? iUafAsmServiceA.sendRequest(aSMCommunicationClientRequest.sRequest) : null;
        } catch (RemoteException e5) {
            Logger.e("UAFServiceASMCommunicationClient", "Failed to connect to remote service.", e5);
        }
        iCommunicationClientResponse.onResponse(null, strSendRequest);
        return 0L;
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public void removeRequest(long j10) {
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public void waitForResponse(long j10) {
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public void postRequest(String str, String str2, Object obj) {
    }
}
