package com.google.android.play.core.review.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public class FakeReviewManager implements ReviewManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReviewInfo f46233b;

    public FakeReviewManager(Context context) {
        this.f46232a = context;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @NonNull
    public Task<Void> launchReviewFlow(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        return reviewInfo != this.f46233b ? Tasks.forException(new ReviewException(-2)) : Tasks.forResult(null);
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @NonNull
    public Task<ReviewInfo> requestReviewFlow() {
        ReviewInfo reviewInfoZzc = ReviewInfo.zzc(PendingIntent.getBroadcast(this.f46232a, 0, new Intent(), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL), false);
        this.f46233b = reviewInfoZzc;
        return Tasks.forResult(reviewInfoZzc);
    }
}
