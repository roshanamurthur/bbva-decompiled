package com.noknok.android.uaf.framework.service;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.fido.android.framework.service.Mfac;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.uaf.IUafAsmApi;
import com.noknok.android.client.asm.api.uaf.IUafAsmBinder;
import com.noknok.android.client.asm.api.uaf.UafLocalAsmAgent;
import com.noknok.android.client.commlib.ICommunicationClient;
import com.noknok.android.client.commlib.ICommunicationClientResponse;
import com.noknok.android.client.mfac.ASMCommunicationClientRequest;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Logger;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class UAFLocalASMCommunicationClient implements ICommunicationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<IUafAsmBinder> f63596a = new AtomicReference<>();

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public String[] getServiceModuleList(String str) {
        try {
            this.f63596a.set((IUafAsmBinder) UafLocalAsmAgent.class.asSubclass(IUafAsmBinder.class).getMethod("instance", Context.class).invoke(null, Mfac.Instance().getContext().getApplicationContext()));
            String str2 = this.f63596a.get().getComponentName().getPackageName() + "," + this.f63596a.get().getComponentName().getClassName();
            Logger.i("UAFLocalASMCommunicationClient", "UAF Embedded ASM: " + str2);
            return new String[]{str2};
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
            Logger.i("UAFLocalASMCommunicationClient", NotificationCompat.CATEGORY_MESSAGE, e5);
            return new String[0];
        }
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public long sendRequest(String str, String str2, Object obj, ICommunicationClientResponse iCommunicationClientResponse) {
        String strProcess;
        ASMCommunicationClientRequest aSMCommunicationClientRequest = (ASMCommunicationClientRequest) obj;
        try {
            IUafAsmApi asmApi = this.f63596a.get().getAsmApi();
            String str3 = aSMCommunicationClientRequest.sRequest;
            ActivityProxy activityProxy = aSMCommunicationClientRequest.activityProxy;
            strProcess = asmApi.process(str3, activityProxy, activityProxy.getApplicationContext().getPackageName());
        } catch (AsmException e5) {
            Logger.e("UAFLocalASMCommunicationClient", "Error while sending request", e5);
            strProcess = "";
        }
        iCommunicationClientResponse.onResponse(null, strProcess);
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
