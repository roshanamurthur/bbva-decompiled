package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f46040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f46041i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, TaskCompletionSource taskCompletionSource, String str) {
        super(hVar, new zzm("OnRequestInstallCallback"), taskCompletionSource);
        this.f46041i = hVar;
        this.f46040h = str;
    }

    @Override // com.google.android.play.core.appupdate.e, com.google.android.play.core.appupdate.internal.zzh
    public final void zzc(Bundle bundle) throws RemoteException {
        super.zzc(bundle);
        int i10 = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.f46038f;
        if (i10 != 0) {
            taskCompletionSource.trySetException(new InstallException(bundle.getInt("error.code", -2)));
            return;
        }
        String str = this.f46040h;
        int i11 = bundle.getInt("version.code", -1);
        int i12 = bundle.getInt("update.availability");
        int i13 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i14 = bundle.getInt("in.app.update.priority", 0);
        long j10 = bundle.getLong("bytes.downloaded");
        long j11 = bundle.getLong("total.bytes.to.download");
        long j12 = bundle.getLong("additional.size.required");
        i iVar = this.f46041i.f46047d;
        iVar.getClass();
        long jA = i.a(new File(iVar.f46048a.getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSet = new HashSet();
        if (integerArrayList != null) {
            hashSet.addAll(integerArrayList);
        }
        map.put("blocking.destructive.intent", hashSet);
        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSet2 = new HashSet();
        if (integerArrayList2 != null) {
            hashSet2.addAll(integerArrayList2);
        }
        map.put("nonblocking.destructive.intent", hashSet2);
        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSet3 = new HashSet();
        if (integerArrayList3 != null) {
            hashSet3.addAll(integerArrayList3);
        }
        map.put("blocking.intent", hashSet3);
        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSet4 = new HashSet();
        if (integerArrayList4 != null) {
            hashSet4.addAll(integerArrayList4);
        }
        map.put("nonblocking.intent", hashSet4);
        taskCompletionSource.trySetResult(AppUpdateInfo.zzb(str, i11, i12, i13, numValueOf, i14, j10, j11, j12, jA, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map));
    }
}
