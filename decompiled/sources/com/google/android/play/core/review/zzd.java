package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"RestrictedApi"})
public final class zzd implements ReviewManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzi f46237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f46238b = new Handler(Looper.getMainLooper());

    public zzd(zzi zziVar) {
        this.f46237a = zziVar;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @NonNull
    public final Task<Void> launchReviewFlow(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        if (reviewInfo.b()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this.f46238b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @NonNull
    public final Task<ReviewInfo> requestReviewFlow() {
        return this.f46237a.zza();
    }
}
