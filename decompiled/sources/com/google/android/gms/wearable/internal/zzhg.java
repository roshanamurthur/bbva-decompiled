package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class zzhg extends GmsClient<zzep> {
    private final ExecutorService zzew;
    private final zzer<Object> zzex;
    private final zzer<Object> zzey;
    private final zzer<ChannelApi.ChannelListener> zzez;
    private final zzer<DataApi.DataListener> zzfa;
    private final zzer<MessageApi.MessageListener> zzfb;
    private final zzer<Object> zzfc;
    private final zzer<Object> zzfd;
    private final zzer<CapabilityApi.CapabilityListener> zzfe;
    private final zzhp zzff;

    public zzhg(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings, Executors.newCachedThreadPool(), zzhp.zza(context));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void connect(@NonNull BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        if (!requiresGooglePlayServices()) {
            try {
                Bundle bundle = getContext().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i10 = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i10 < 8600000) {
                    StringBuilder sb2 = new StringBuilder(82);
                    sb2.append("The Wear OS app is out of date. Requires API version 8600000 but found ");
                    sb2.append(i10);
                    Log.w("WearableClient", sb2.toString());
                    Context context = getContext();
                    Context context2 = getContext();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    triggerNotAvailable(connectionProgressReportCallbacks, 6, PendingIntent.getActivity(context, 0, intent, 0));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                triggerNotAvailable(connectionProgressReportCallbacks, 16, null);
                return;
            }
        }
        super.connect(connectionProgressReportCallbacks);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return iInterfaceQueryLocalInterface instanceof zzep ? (zzep) iInterfaceQueryLocalInterface : new zzeq(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 8600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServicePackage() {
        return this.zzff.zze("com.google.android.wearable.app.cn") ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (i10 == 0) {
            this.zzex.zza(iBinder);
            this.zzey.zza(iBinder);
            this.zzez.zza(iBinder);
            this.zzfa.zza(iBinder);
            this.zzfb.zza(iBinder);
            this.zzfc.zza(iBinder);
            this.zzfd.zza(iBinder);
            this.zzfe.zza(iBinder);
        }
        super.onPostInitHandler(i10, iBinder, bundle, i11);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return !this.zzff.zze("com.google.android.wearable.app.cn");
    }

    public final void zza(BaseImplementation.ResultHolder<DataApi.DataItemResult> resultHolder, PutDataRequest putDataRequest) throws RemoteException {
        Iterator<Map.Entry<String, Asset>> it = putDataRequest.getAssets().entrySet().iterator();
        while (it.hasNext()) {
            Asset value = it.next().getValue();
            if (value.getData() == null && value.getDigest() == null && value.getFd() == null && value.getUri() == null) {
                String strValueOf = String.valueOf(putDataRequest.getUri());
                String strValueOf2 = String.valueOf(value);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 33);
                sb2.append("Put for ");
                sb2.append(strValueOf);
                sb2.append(" contains invalid asset: ");
                sb2.append(strValueOf2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        PutDataRequest putDataRequestZza = PutDataRequest.zza(putDataRequest.getUri());
        putDataRequestZza.setData(putDataRequest.getData());
        if (putDataRequest.isUrgent()) {
            putDataRequestZza.setUrgent();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Asset> entry : putDataRequest.getAssets().entrySet()) {
            Asset value2 = entry.getValue();
            if (value2.getData() != null) {
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String strValueOf3 = String.valueOf(value2);
                        String strValueOf4 = String.valueOf(parcelFileDescriptorArrCreatePipe[0]);
                        String strValueOf5 = String.valueOf(parcelFileDescriptorArrCreatePipe[1]);
                        new StringBuilder(strValueOf5.length() + strValueOf4.length() + strValueOf3.length() + 61);
                    }
                    putDataRequestZza.putAsset(entry.getKey(), Asset.createFromFd(parcelFileDescriptorArrCreatePipe[0]));
                    FutureTask futureTask = new FutureTask(new zzhh(this, parcelFileDescriptorArrCreatePipe[1], value2.getData()));
                    arrayList.add(futureTask);
                    this.zzew.submit(futureTask);
                } catch (IOException e5) {
                    String strValueOf6 = String.valueOf(putDataRequest);
                    StringBuilder sb3 = new StringBuilder(strValueOf6.length() + 60);
                    sb3.append("Unable to create ParcelFileDescriptor for asset in request: ");
                    sb3.append(strValueOf6);
                    throw new IllegalStateException(sb3.toString(), e5);
                }
            } else if (value2.getUri() != null) {
                try {
                    putDataRequestZza.putAsset(entry.getKey(), Asset.createFromFd(getContext().getContentResolver().openFileDescriptor(value2.getUri(), "r")));
                } catch (FileNotFoundException unused) {
                    new zzhb(resultHolder, arrayList).zza(new zzfu(WearableStatusCodes.ASSET_UNAVAILABLE, null));
                    String strValueOf7 = String.valueOf(value2.getUri());
                    StringBuilder sb4 = new StringBuilder(strValueOf7.length() + 28);
                    sb4.append("Couldn't resolve asset URI: ");
                    sb4.append(strValueOf7);
                    Log.w("WearableClient", sb4.toString());
                    return;
                }
            } else {
                putDataRequestZza.putAsset(entry.getKey(), value2);
            }
        }
        ((zzep) getService()).zza(new zzhb(resultHolder, arrayList), putDataRequestZza);
    }

    @VisibleForTesting
    private zzhg(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, ExecutorService executorService, zzhp zzhpVar) {
        super(context, looper, 14, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzex = new zzer<>();
        this.zzey = new zzer<>();
        this.zzez = new zzer<>();
        this.zzfa = new zzer<>();
        this.zzfb = new zzer<>();
        this.zzfc = new zzer<>();
        this.zzfd = new zzer<>();
        this.zzfe = new zzer<>();
        this.zzew = (ExecutorService) Preconditions.checkNotNull(executorService);
        this.zzff = zzhpVar;
    }

    public final void zza(BaseImplementation.ResultHolder<DataApi.GetFdForAssetResult> resultHolder, Asset asset) throws RemoteException {
        ((zzep) getService()).zza(new zzgx(resultHolder), asset);
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, String str, Uri uri, boolean z10) {
        try {
            ExecutorService executorService = this.zzew;
            Preconditions.checkNotNull(resultHolder);
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(uri);
            executorService.execute(new zzhi(this, uri, resultHolder, z10, str));
        } catch (RuntimeException e5) {
            resultHolder.setFailedResult(new Status(8));
            throw e5;
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, String str, Uri uri, long j10, long j11) {
        try {
            ExecutorService executorService = this.zzew;
            Preconditions.checkNotNull(resultHolder);
            Preconditions.checkNotNull(str);
            Preconditions.checkNotNull(uri);
            Preconditions.checkArgument(j10 >= 0, "startOffset is negative: %s", Long.valueOf(j10));
            Preconditions.checkArgument(j11 >= -1, "invalid length: %s", Long.valueOf(j11));
            executorService.execute(new zzhj(this, uri, resultHolder, str, j10, j11));
        } catch (RuntimeException e5) {
            resultHolder.setFailedResult(new Status(8));
            throw e5;
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, DataApi.DataListener dataListener, ListenerHolder<DataApi.DataListener> listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzfa.zza(this, resultHolder, dataListener, zzhk.zza(listenerHolder, intentFilterArr));
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, MessageApi.MessageListener messageListener, ListenerHolder<MessageApi.MessageListener> listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzfb.zza(this, resultHolder, messageListener, zzhk.zzb(listenerHolder, intentFilterArr));
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, CapabilityApi.CapabilityListener capabilityListener, ListenerHolder<CapabilityApi.CapabilityListener> listenerHolder, IntentFilter[] intentFilterArr) throws RemoteException {
        this.zzfe.zza(this, resultHolder, capabilityListener, zzhk.zzd(listenerHolder, intentFilterArr));
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, ChannelApi.ChannelListener channelListener, ListenerHolder<ChannelApi.ChannelListener> listenerHolder, @Nullable String str, IntentFilter[] intentFilterArr) throws RemoteException {
        if (str == null) {
            this.zzez.zza(this, resultHolder, channelListener, zzhk.zzc(listenerHolder, intentFilterArr));
        } else {
            this.zzez.zza(this, resultHolder, new zzgc(str, channelListener), zzhk.zza(listenerHolder, str, intentFilterArr));
        }
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, DataApi.DataListener dataListener) throws RemoteException {
        this.zzfa.zza(this, resultHolder, dataListener);
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, MessageApi.MessageListener messageListener) throws RemoteException {
        this.zzfb.zza(this, resultHolder, messageListener);
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, CapabilityApi.CapabilityListener capabilityListener) throws RemoteException {
        this.zzfe.zza(this, resultHolder, capabilityListener);
    }

    public final void zza(BaseImplementation.ResultHolder<Status> resultHolder, ChannelApi.ChannelListener channelListener, String str) throws RemoteException {
        if (str == null) {
            this.zzez.zza(this, resultHolder, channelListener);
        } else {
            this.zzez.zza(this, resultHolder, new zzgc(str, channelListener));
        }
    }
}
