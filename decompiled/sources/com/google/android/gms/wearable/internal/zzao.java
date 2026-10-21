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
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelClient;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class zzao extends ChannelClient {
    private final zzaj zzcg;

    public zzao(@NonNull Context context, @NonNull GoogleApi.Settings settings) {
        super(context, settings);
        this.zzcg = new zzaj();
    }

    private static zzay zza(@NonNull ChannelClient.Channel channel) {
        Preconditions.checkNotNull(channel, "channel must not be null");
        return (zzay) channel;
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> close(@NonNull ChannelClient.Channel channel) {
        return PendingResultUtil.toVoidTask(zza(channel).close(asGoogleApiClient()));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<InputStream> getInputStream(@NonNull ChannelClient.Channel channel) {
        return PendingResultUtil.toTask(zza(channel).getInputStream(asGoogleApiClient()), zzaq.zzbx);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<OutputStream> getOutputStream(@NonNull ChannelClient.Channel channel) {
        return PendingResultUtil.toTask(zza(channel).getOutputStream(asGoogleApiClient()), zzar.zzbx);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<ChannelClient.Channel> openChannel(@NonNull String str, @NonNull String str2) {
        return PendingResultUtil.toTask(this.zzcg.openChannel(asGoogleApiClient(), str, str2), zzap.zzbx);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> receiveFile(@NonNull ChannelClient.Channel channel, @NonNull Uri uri, boolean z10) {
        return PendingResultUtil.toVoidTask(zza(channel).receiveFile(asGoogleApiClient(), uri, z10));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> registerChannelCallback(@NonNull ChannelClient.ChannelCallback channelCallback) {
        Preconditions.checkNotNull(channelCallback, "listener is null");
        ListenerHolder listenerHolderCreateListenerHolder = ListenerHolders.createListenerHolder(channelCallback, getLooper(), "ChannelListener");
        IntentFilter[] intentFilterArr = {zzgj.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")};
        zzas zzasVar = new zzas(channelCallback);
        return doRegisterEventListener(new zzat(zzasVar, null, intentFilterArr, listenerHolderCreateListenerHolder, ListenerHolders.createListenerHolder(zzasVar, getLooper(), "ChannelListener")), new zzau(zzasVar, null, listenerHolderCreateListenerHolder.getListenerKey()));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> sendFile(@NonNull ChannelClient.Channel channel, @NonNull Uri uri) {
        return PendingResultUtil.toVoidTask(zza(channel).sendFile(asGoogleApiClient(), uri));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Boolean> unregisterChannelCallback(@NonNull ChannelClient.ChannelCallback channelCallback) {
        return doUnregisterEventListener(ListenerHolders.createListenerHolder(channelCallback, getLooper(), "ChannelListener").getListenerKey());
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> close(@NonNull ChannelClient.Channel channel, int i10) {
        return PendingResultUtil.toVoidTask(zza(channel).close(asGoogleApiClient(), i10));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> sendFile(@NonNull ChannelClient.Channel channel, @NonNull Uri uri, long j10, long j11) {
        return PendingResultUtil.toVoidTask(zza(channel).sendFile(asGoogleApiClient(), uri, j10, j11));
    }

    public zzao(@NonNull Activity activity, @NonNull GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzcg = new zzaj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzay zza(@NonNull Channel channel) {
        Preconditions.checkNotNull(channel, "channel must not be null");
        return (zzay) channel;
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Boolean> unregisterChannelCallback(@NonNull ChannelClient.Channel channel, @NonNull ChannelClient.ChannelCallback channelCallback) {
        String strZzc = zza(channel).zzc();
        Looper looper = getLooper();
        String strValueOf = String.valueOf(strZzc);
        return doUnregisterEventListener(ListenerHolders.createListenerHolder(channelCallback, looper, strValueOf.length() != 0 ? "ChannelListener:".concat(strValueOf) : new String("ChannelListener:")).getListenerKey());
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> registerChannelCallback(@NonNull ChannelClient.Channel channel, @NonNull ChannelClient.ChannelCallback channelCallback) {
        String strZzc = ((zzay) channel).zzc();
        Preconditions.checkNotNull(channelCallback, "listener is null");
        Looper looper = getLooper();
        String strValueOf = String.valueOf(strZzc);
        ListenerHolder listenerHolderCreateListenerHolder = ListenerHolders.createListenerHolder(channelCallback, looper, strValueOf.length() != 0 ? "ChannelListener:".concat(strValueOf) : new String("ChannelListener:"));
        IntentFilter[] intentFilterArr = {zzgj.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")};
        zzas zzasVar = new zzas(channelCallback);
        return doRegisterEventListener(new zzat(zzasVar, strZzc, intentFilterArr, listenerHolderCreateListenerHolder, ListenerHolders.createListenerHolder(zzasVar, getLooper(), "ChannelListener")), new zzau(zzasVar, strZzc, listenerHolderCreateListenerHolder.getListenerKey()));
    }
}
