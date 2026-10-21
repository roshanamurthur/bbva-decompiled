package com.google.mlkit.common.sdkinternal.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzry;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsi;
import com.google.android.gms.internal.mlkit_common.zzsj;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@WorkerThread
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f49488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RemoteModelDownloadManager f49489c;

    public /* synthetic */ a(RemoteModelDownloadManager remoteModelDownloadManager, long j10, TaskCompletionSource taskCompletionSource) {
        this.f49489c = remoteModelDownloadManager;
        this.f49487a = j10;
        this.f49488b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        if (longExtra != this.f49487a) {
            return;
        }
        RemoteModelDownloadManager remoteModelDownloadManager = this.f49489c;
        Integer downloadingModelStatusCode = remoteModelDownloadManager.getDownloadingModelStatusCode();
        synchronized (remoteModelDownloadManager) {
            try {
                this.f49489c.f49459c.getApplicationContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e5) {
                RemoteModelDownloadManager.m.w("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e5);
            }
            this.f49489c.f49457a.remove(this.f49487a);
            this.f49489c.f49458b.remove(this.f49487a);
        }
        if (downloadingModelStatusCode != null) {
            if (downloadingModelStatusCode.intValue() == 16) {
                RemoteModelDownloadManager remoteModelDownloadManager2 = this.f49489c;
                zzsh zzshVar = remoteModelDownloadManager2.f49463g;
                zzry zzryVarZzg = zzsk.zzg();
                RemoteModel remoteModel = remoteModelDownloadManager2.f49461e;
                Long lValueOf = Long.valueOf(longExtra);
                zzshVar.zze(zzryVarZzg, remoteModel, false, remoteModelDownloadManager2.getFailureReason(lValueOf));
                this.f49488b.setException(this.f49489c.d(lValueOf));
                return;
            }
            if (downloadingModelStatusCode.intValue() == 8) {
                RemoteModelDownloadManager remoteModelDownloadManager3 = this.f49489c;
                zzsh zzshVar2 = remoteModelDownloadManager3.f49463g;
                zzry zzryVarZzg2 = zzsk.zzg();
                RemoteModel remoteModel2 = remoteModelDownloadManager3.f49461e;
                zzsi zzsiVarZzh = zzsj.zzh();
                zzsiVarZzh.zzb(zzmu.NO_ERROR);
                zzsiVarZzh.zze(true);
                zzsiVarZzh.zzd(this.f49489c.f49461e.getModelType());
                zzsiVarZzh.zza(zzna.SUCCEEDED);
                zzshVar2.zzg(zzryVarZzg2, remoteModel2, zzsiVarZzh.zzh());
                this.f49488b.setResult(null);
                return;
            }
        }
        RemoteModelDownloadManager remoteModelDownloadManager4 = this.f49489c;
        remoteModelDownloadManager4.f49463g.zze(zzsk.zzg(), remoteModelDownloadManager4.f49461e, false, 0);
        this.f49488b.setException(new MlKitException("Model downloading failed", 13));
    }
}
