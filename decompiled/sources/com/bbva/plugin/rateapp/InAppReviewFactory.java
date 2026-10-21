package com.bbva.plugin.rateapp;

import android.content.Context;
import com.bbva.rateapp.InAppReview;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InAppReviewFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/rateapp/InAppReviewFactory;", "", "()V", "createInAppReview", "Lcom/bbva/rateapp/InAppReview;", "context", "Landroid/content/Context;", "rateapp-plugin_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class InAppReviewFactory {
    @NotNull
    public InAppReview createInAppReview(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ReviewManager reviewManagerCreate = ReviewManagerFactory.create(context);
        Intrinsics.checkNotNullExpressionValue(reviewManagerCreate, "create(context)");
        return new InAppReview(reviewManagerCreate);
    }
}
