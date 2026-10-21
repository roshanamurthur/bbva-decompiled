package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zze extends ResultReceiver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f46111p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f46111p0 = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        TaskCompletionSource taskCompletionSource = this.f46111p0;
        if (i10 == 1) {
            taskCompletionSource.trySetResult(-1);
        } else if (i10 != 2) {
            taskCompletionSource.trySetResult(1);
        } else {
            taskCompletionSource.trySetResult(0);
        }
    }
}
