package com.bbva.ethermobilesdk.geolocation.activity;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.geolocation.activity.model.ActivityParams;
import com.bbva.ethermobilesdk.geolocation.activity.model.ActivityResponse;
import com.bbva.ethermobilesdk.geolocation.activity.provider.ActivityProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActivityRecognitionControl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/activity/ActivityRecognitionControl;", "", "Lcom/bbva/ethermobilesdk/geolocation/activity/model/ActivityParams;", "params", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobilesdk/geolocation/activity/model/ActivityResponse;", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "stop", "Lcom/bbva/ethermobilesdk/geolocation/activity/provider/ActivityProvider;", "provider", "<init>", "(Lcom/bbva/ethermobilesdk/geolocation/activity/provider/ActivityProvider;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class ActivityRecognitionControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActivityProvider f29779a;

    public ActivityRecognitionControl(@NotNull ActivityProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f29779a = provider;
    }

    @NotNull
    public final Flow<ActivityResponse> start(@NotNull ActivityParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f29779a.start(params);
    }

    public final void stop() {
        this.f29779a.stop();
    }
}
