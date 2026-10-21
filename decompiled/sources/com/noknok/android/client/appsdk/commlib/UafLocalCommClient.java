package com.noknok.android.client.appsdk.commlib;

import android.content.Context;
import android.content.Intent;
import com.noknok.android.client.appsdk.uaf.UafIntentParser;
import com.noknok.android.client.commlib.ICommunicationClient;
import com.noknok.android.client.commlib.ICommunicationClientResponse;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.uaf.framework.service.UafIntentProcessor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes11.dex */
public class UafLocalCommClient implements ICommunicationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f62890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ActivityProxy f62891b;

    public UafLocalCommClient(Context context, ActivityProxy activityProxy) {
        this.f62890a = context;
        this.f62891b = activityProxy;
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public String[] getServiceModuleList(String str) {
        return null;
    }

    @Override // com.noknok.android.client.commlib.ICommunicationClient
    public long sendRequest(String str, String str2, Object obj, ICommunicationClientResponse iCommunicationClientResponse) {
        Intent intent;
        Intent intent2 = (Intent) obj;
        try {
            intent = (Intent) UafIntentProcessor.class.getMethod("processIntent", Intent.class, Context.class, ActivityProxy.class, Boolean.TYPE).invoke(UafIntentProcessor.class.newInstance(), intent2, this.f62890a, this.f62891b, Boolean.valueOf(intent2.getExtras() == null || !intent2.getExtras().containsKey("remote")));
        } catch (ClassNotFoundException e5) {
            e = e5;
            Logger.e("UafLocalCommClient", "Failed to receive Uaf response from service", e);
            intent = null;
        } catch (IllegalAccessException e7) {
            e = e7;
            Logger.e("UafLocalCommClient", "Failed to receive Uaf response from service", e);
            intent = null;
        } catch (InstantiationException e10) {
            e = e10;
            Logger.e("UafLocalCommClient", "Failed to receive Uaf response from service", e);
            intent = null;
        } catch (NoSuchMethodException e11) {
            e = e11;
            Logger.e("UafLocalCommClient", "Failed to receive Uaf response from service", e);
            intent = null;
        } catch (InvocationTargetException e12) {
            e = e12;
            Logger.e("UafLocalCommClient", "Failed to receive Uaf response from service", e);
            intent = null;
        }
        iCommunicationClientResponse.onResponse(null, UafIntentParser.parseUafResponseIntent(intent));
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
