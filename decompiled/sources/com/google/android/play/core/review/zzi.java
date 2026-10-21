package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.internal.zzt;
import com.google.android.play.core.review.internal.zzw;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"RestrictedApi"})
public final class zzi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.android.play.core.review.internal.zzi f46239c = new com.google.android.play.core.review.internal.zzi("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public final zzt f46240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46241b;

    public zzi(Context context) {
        this.f46241b = context.getPackageName();
        if (zzw.zza(context)) {
            this.f46240a = new zzt(context, f46239c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), zze.zza, null, null);
        }
    }

    public final Task zza() {
        Object[] objArr = {this.f46241b};
        com.google.android.play.core.review.internal.zzi zziVar = f46239c;
        zziVar.zzd("requestInAppReview (%s)", objArr);
        zzt zztVar = this.f46240a;
        if (zztVar == null) {
            zziVar.zzb("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.forException(new ReviewException(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zztVar.zzp(new b(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
