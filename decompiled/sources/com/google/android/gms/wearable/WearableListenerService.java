package com.google.android.gms.wearable;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.wearable.internal.zzah;
import com.google.android.gms.wearable.internal.zzas;
import com.google.android.gms.wearable.internal.zzaw;
import com.google.android.gms.wearable.internal.zzen;
import com.google.android.gms.wearable.internal.zzfe;
import com.google.android.gms.wearable.internal.zzfo;
import com.google.android.gms.wearable.internal.zzhp;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class WearableListenerService extends Service implements CapabilityApi.CapabilityListener, ChannelApi.ChannelListener, DataApi.DataListener, MessageApi.MessageListener {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private ComponentName service;
    private zzc zzad;
    private IBinder zzae;
    private Intent zzaf;
    private Looper zzag;
    private boolean zzai;
    private final Object zzah = new Object();
    private zzas zzaj = new zzas(new zza());

    public class zza extends ChannelClient.ChannelCallback {
        private zza() {
        }

        @Override // com.google.android.gms.wearable.ChannelClient.ChannelCallback
        public final void onChannelClosed(@NonNull ChannelClient.Channel channel, int i10, int i11) {
            WearableListenerService.this.onChannelClosed(channel, i10, i11);
        }

        @Override // com.google.android.gms.wearable.ChannelClient.ChannelCallback
        public final void onChannelOpened(@NonNull ChannelClient.Channel channel) {
            WearableListenerService.this.onChannelOpened(channel);
        }

        @Override // com.google.android.gms.wearable.ChannelClient.ChannelCallback
        public final void onInputClosed(@NonNull ChannelClient.Channel channel, int i10, int i11) {
            WearableListenerService.this.onInputClosed(channel, i10, i11);
        }

        @Override // com.google.android.gms.wearable.ChannelClient.ChannelCallback
        public final void onOutputClosed(@NonNull ChannelClient.Channel channel, int i10, int i11) {
            WearableListenerService.this.onOutputClosed(channel, i10, i11);
        }
    }

    public Looper getLooper() {
        if (this.zzag == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.zzag = handlerThread.getLooper();
        }
        return this.zzag;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (BIND_LISTENER_INTENT_ACTION.equals(intent.getAction())) {
            return this.zzae;
        }
        return null;
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onChannelClosed(Channel channel, int i10, int i11) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onChannelOpened(Channel channel) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.service = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            new StringBuilder(String.valueOf(this.service).length() + 10);
        }
        this.zzad = new zzc(getLooper());
        Intent intent = new Intent(BIND_LISTENER_INTENT_ACTION);
        this.zzaf = intent;
        intent.setComponent(this.service);
        this.zzae = new zzd();
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            new StringBuilder(String.valueOf(this.service).length() + 11);
        }
        synchronized (this.zzah) {
            this.zzai = true;
            zzc zzcVar = this.zzad;
            if (zzcVar == null) {
                String strValueOf = String.valueOf(this.service);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 111);
                sb2.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb2.append(strValueOf);
                throw new IllegalStateException(sb2.toString());
            }
            zzcVar.quit();
        }
        super.onDestroy();
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onInputClosed(Channel channel, int i10, int i11) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onOutputClosed(Channel channel, int i10, int i11) {
    }

    public void onChannelClosed(ChannelClient.Channel channel, int i10, int i11) {
    }

    public void onChannelOpened(ChannelClient.Channel channel) {
    }

    public void onInputClosed(ChannelClient.Channel channel, int i10, int i11) {
    }

    public void onOutputClosed(ChannelClient.Channel channel, int i10, int i11) {
    }

    public final class zzd extends zzen {
        private volatile int zzam;

        private zzd() {
            this.zzam = -1;
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void onConnectedNodes(List<zzfo> list) {
            zza(new zzp(this, list), "onConnectedNodes", list);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(DataHolder dataHolder) {
            zzl zzlVar = new zzl(this, dataHolder);
            try {
                String strValueOf = String.valueOf(dataHolder);
                int count = dataHolder.getCount();
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 18);
                sb2.append(strValueOf);
                sb2.append(", rows=");
                sb2.append(count);
                if (zza(zzlVar, "onDataItemChanged", sb2.toString())) {
                    return;
                }
                dataHolder.close();
            } catch (Throwable th2) {
                dataHolder.close();
                throw th2;
            }
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zzb(zzfo zzfoVar) {
            zza(new zzo(this, zzfoVar), "onPeerDisconnected", zzfoVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(zzfe zzfeVar) {
            zza(new zzm(this, zzfeVar), BanxicoConstants.UNIFIED_LOG_EVENT_MESSAGE_RECEIVED_VALUE, zzfeVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(zzfo zzfoVar) {
            zza(new zzn(this, zzfoVar), "onPeerConnected", zzfoVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(zzah zzahVar) {
            zza(new zzq(this, zzahVar), "onConnectedCapabilityChanged", zzahVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(com.google.android.gms.wearable.internal.zzl zzlVar) {
            zza(new zzr(this, zzlVar), "onNotificationReceived", zzlVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(com.google.android.gms.wearable.internal.zzi zziVar) {
            zza(new zzs(this, zziVar), "onEntityUpdate", zziVar);
        }

        @Override // com.google.android.gms.wearable.internal.zzem
        public final void zza(zzaw zzawVar) {
            zza(new zzt(this, zzawVar), "onChannelEvent", zzawVar);
        }

        private final boolean zza(Runnable runnable, String str, Object obj) {
            if (Log.isLoggable("WearableLS", 3)) {
                String.format("%s: %s %s", str, WearableListenerService.this.service.toString(), obj);
            }
            int callingUid = Binder.getCallingUid();
            if (callingUid != this.zzam) {
                if ((!zzhp.zza(WearableListenerService.this).zze("com.google.android.wearable.app.cn") || !UidVerifier.uidHasPackageName(WearableListenerService.this, callingUid, "com.google.android.wearable.app.cn")) && !UidVerifier.isGooglePlayServicesUid(WearableListenerService.this, callingUid)) {
                    return false;
                }
                this.zzam = callingUid;
            }
            synchronized (WearableListenerService.this.zzah) {
                try {
                    if (WearableListenerService.this.zzai) {
                        return false;
                    }
                    WearableListenerService.this.zzad.post(runnable);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final class zzc extends Handler {
        private boolean started;
        private final zzb zzal;

        public zzc(Looper looper) {
            super(looper);
            this.zzal = new zzb();
        }

        @SuppressLint({"UntrackedBindService"})
        private final synchronized void zzb() {
            try {
                if (this.started) {
                    return;
                }
                if (Log.isLoggable("WearableLS", 2)) {
                    new StringBuilder(String.valueOf(WearableListenerService.this.service).length() + 13);
                }
                WearableListenerService wearableListenerService = WearableListenerService.this;
                wearableListenerService.bindService(wearableListenerService.zzaf, this.zzal, 1);
                this.started = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // android.os.Handler
        public final void dispatchMessage(Message message) {
            zzb();
            try {
                super.dispatchMessage(message);
            } finally {
                if (!hasMessages(0)) {
                    zzb("dispatch");
                }
            }
        }

        public final void quit() {
            getLooper().quit();
            zzb("quit");
        }

        @SuppressLint({"UntrackedBindService"})
        private final synchronized void zzb(String str) {
            if (this.started) {
                if (Log.isLoggable("WearableLS", 2)) {
                    new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(WearableListenerService.this.service).length());
                }
                try {
                    WearableListenerService.this.unbindService(this.zzal);
                } catch (RuntimeException unused) {
                }
                this.started = false;
            }
        }
    }

    public class zzb implements ServiceConnection {
        private zzb(WearableListenerService wearableListenerService) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
    }

    public void onConnectedNodes(List<Node> list) {
    }

    @Override // com.google.android.gms.wearable.DataApi.DataListener
    public void onDataChanged(DataEventBuffer dataEventBuffer) {
    }

    public void onEntityUpdate(com.google.android.gms.wearable.zzb zzbVar) {
    }

    @Override // com.google.android.gms.wearable.MessageApi.MessageListener
    public void onMessageReceived(MessageEvent messageEvent) {
    }

    public void onNotificationReceived(com.google.android.gms.wearable.zzd zzdVar) {
    }

    public void onPeerConnected(Node node) {
    }

    public void onPeerDisconnected(Node node) {
    }
}
