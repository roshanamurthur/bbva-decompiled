package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.CapabilityApi;

/* JADX INFO: loaded from: classes9.dex */
public final class zzo implements CapabilityApi {
    private static PendingResult<Status> zza(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, IntentFilter[] intentFilterArr) {
        return zzb.zza(googleApiClient, new zzt(intentFilterArr), capabilityListener);
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> addCapabilityListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, String str) {
        Asserts.checkNotNull(str, "capability must not be null");
        zzv zzvVar = new zzv(capabilityListener, str);
        IntentFilter intentFilterZzc = zzgj.zzc("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new String("/");
        }
        intentFilterZzc.addDataPath(str, 0);
        return zza(googleApiClient, zzvVar, new IntentFilter[]{intentFilterZzc});
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, Uri uri, int i10) {
        Asserts.checkNotNull(uri, "uri must not be null");
        Preconditions.checkArgument(i10 == 0 || i10 == 1, "invalid filter type");
        return zza(googleApiClient, capabilityListener, new IntentFilter[]{zzgj.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i10)});
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.AddLocalCapabilityResult> addLocalCapability(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.enqueue(new zzr(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.GetAllCapabilitiesResult> getAllCapabilities(GoogleApiClient googleApiClient, int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        }
        Preconditions.checkArgument(z10);
        return googleApiClient.enqueue(new zzq(this, googleApiClient, i10));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.GetCapabilityResult> getCapability(GoogleApiClient googleApiClient, String str, int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        }
        Preconditions.checkArgument(z10);
        return googleApiClient.enqueue(new zzp(this, googleApiClient, str, i10));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> removeCapabilityListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, String str) {
        return googleApiClient.enqueue(new zzz(googleApiClient, new zzv(capabilityListener, str), null));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> removeListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener) {
        return googleApiClient.enqueue(new zzz(googleApiClient, capabilityListener, null));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.RemoveLocalCapabilityResult> removeLocalCapability(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.enqueue(new zzs(this, googleApiClient, str));
    }
}
