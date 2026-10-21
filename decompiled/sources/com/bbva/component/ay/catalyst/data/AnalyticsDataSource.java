package com.bbva.component.ay.catalyst.data;

import androidx.room.a;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CatalystDataSource.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ay/catalyst/data/AnalyticsDataSource;", "", "()V", "getTrackingIdentifier", "Lio/reactivex/Flowable;", "", "component-ay-catalyst_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AnalyticsDataSource {
    @NotNull
    public final Flowable<String> getTrackingIdentifier() {
        Flowable<String> flowableCreate = Flowable.create(new a(), BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(flowableCreate, "create(\n        {\n            Analytics.getTrackingIdentifier(object : AdobeCallbackWithError<String> {\n                override fun call(p0: String?) {\n                    p0?.let { response ->\n                        it.onNext(response)\n                        it.onComplete()\n                    }\n                }\n\n                override fun fail(p0: AdobeError?) {\n                    p0?.let { error ->\n                        it.onError(CatalystCustomError(error.errorCode, error.errorName))\n                        it.onComplete()\n                    }\n                }\n            })\n        },\n        BackpressureStrategy.BUFFER\n    )");
        return flowableCreate;
    }
}
