package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
final class zzc extends ResultReceiver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f46236p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f46236p0 = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f46236p0.trySetResult(null);
    }
}
