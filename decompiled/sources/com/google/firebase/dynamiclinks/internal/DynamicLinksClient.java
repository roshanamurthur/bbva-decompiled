package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicLinksClient extends GmsClient<IDynamicLinksService> {
    public static final String ACTION_START_SERVICE = "com.google.firebase.dynamiclinks.service.START";
    public static final String SERVICE_DESCRIPTOR = "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";

    public DynamicLinksClient(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 131, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public String getServiceDescriptor() {
        return SERVICE_DESCRIPTOR;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    public String getStartServiceAction() {
        return ACTION_START_SERVICE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public boolean usesClientTelemetry() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @Nullable
    public IDynamicLinksService createServiceInterface(IBinder iBinder) {
        return IDynamicLinksService.Stub.asInterface(iBinder);
    }
}
