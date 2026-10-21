package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class zzaa extends CapabilityClient {
    private final CapabilityApi zzbw;

    public zzaa(@NonNull Context context, @NonNull GoogleApi.Settings settings) {
        super(context, settings);
        this.zzbw = new zzo();
    }

    private final Task<Void> zza(ListenerHolder<CapabilityClient.OnCapabilityChangedListener> listenerHolder, CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, IntentFilter[] intentFilterArr) {
        return doRegisterEventListener(new zzaf(onCapabilityChangedListener, intentFilterArr, listenerHolder), new zzag(onCapabilityChangedListener, listenerHolder.getListenerKey()));
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> addListener(@NonNull CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, @NonNull String str) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        Asserts.checkNotNull(str, "capability must not be null");
        IntentFilter intentFilterZzc = zzgj.zzc("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new String("/");
        }
        intentFilterZzc.addDataPath(str, 0);
        IntentFilter[] intentFilterArr = {intentFilterZzc};
        Looper looper = getLooper();
        String strValueOf = String.valueOf(str);
        return zza(ListenerHolders.createListenerHolder(onCapabilityChangedListener, looper, strValueOf.length() != 0 ? "CapabilityListener:".concat(strValueOf) : new String("CapabilityListener:")), new zzae(onCapabilityChangedListener, str), intentFilterArr);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> addLocalCapability(@NonNull String str) {
        Asserts.checkNotNull(str, "capability must not be null");
        return PendingResultUtil.toVoidTask(this.zzbw.addLocalCapability(asGoogleApiClient(), str));
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Map<String, CapabilityInfo>> getAllCapabilities(int i10) {
        return PendingResultUtil.toTask(this.zzbw.getAllCapabilities(asGoogleApiClient(), i10), zzac.zzbx);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<CapabilityInfo> getCapability(@NonNull String str, int i10) {
        Asserts.checkNotNull(str, "capability must not be null");
        return PendingResultUtil.toTask(this.zzbw.getCapability(asGoogleApiClient(), str, i10), zzab.zzbx);
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Boolean> removeListener(@NonNull CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, String str) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        Asserts.checkNotNull(str, "capability must not be null");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new String("/");
        }
        Looper looper = getLooper();
        String strValueOf = String.valueOf(str);
        return doUnregisterEventListener(ListenerHolders.createListenerHolder(onCapabilityChangedListener, looper, strValueOf.length() != 0 ? "CapabilityListener:".concat(strValueOf) : new String("CapabilityListener:")).getListenerKey());
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> removeLocalCapability(@NonNull String str) {
        Asserts.checkNotNull(str, "capability must not be null");
        return PendingResultUtil.toVoidTask(this.zzbw.removeLocalCapability(asGoogleApiClient(), str));
    }

    public zzaa(@NonNull Activity activity, @NonNull GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzbw = new zzo();
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Boolean> removeListener(@NonNull CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        return doUnregisterEventListener(ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener").getListenerKey());
    }

    @Override // com.google.android.gms.wearable.CapabilityClient
    public final Task<Void> addListener(@NonNull CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, @NonNull Uri uri, int i10) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        Asserts.checkNotNull(uri, "uri must not be null");
        Preconditions.checkArgument(i10 == 0 || i10 == 1, "invalid filter type");
        return zza(ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener"), onCapabilityChangedListener, new IntentFilter[]{zzgj.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i10)});
    }
}
