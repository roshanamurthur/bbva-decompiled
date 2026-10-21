package com.bbva.ethermobilesdk.geolocation.activity.service;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.geolocation.utils.extension.DetectedActivityKt;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActivityRecognitionService.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/activity/service/ActivityRecognitionService;", "Landroidx/core/app/JobIntentService;", "<init>", "()V", "onHandleWork", "", "intent", "Landroid/content/Intent;", "geolocation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"UnsafeImplicitIntentLaunch"})
@SourceDebugExtension({"SMAP\nActivityRecognitionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityRecognitionService.kt\ncom/bbva/ethermobilesdk/geolocation/activity/service/ActivityRecognitionService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ActivityRecognitionService extends JobIntentService {
    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NotNull Intent intent) {
        ActivityRecognitionResult activityRecognitionResultExtractResult;
        DetectedActivity mostProbableActivity;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!ActivityRecognitionResult.hasResult(intent) || (activityRecognitionResultExtractResult = ActivityRecognitionResult.extractResult(intent)) == null || (mostProbableActivity = activityRecognitionResultExtractResult.getMostProbableActivity()) == null) {
            return;
        }
        Intent intent2 = new Intent(ConstantsKt.getBROADCAST_INTENT_ACTION());
        intent2.putExtra(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, DetectedActivityKt.asActivityResponse(mostProbableActivity));
        sendBroadcast(intent2);
    }
}
