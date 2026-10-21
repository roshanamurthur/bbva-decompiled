package com.bbva.component.ay.crashlytics;

import androidx.camera.core.impl.utils.a;
import com.bbva.cells.component.kit.tracking.Tracker;
import com.bbva.cells.component.kit.tracking.TrackingEvent;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FirebaseCrashlyticsTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/component/ay/crashlytics/FirebaseCrashlyticsTracker;", "Lcom/bbva/cells/component/kit/tracking/Tracker;", "isCollectionEnabled", "", "(Z)V", "onEvent", "", "event", "Lcom/bbva/cells/component/kit/tracking/TrackingEvent;", "component-ay-crashlytics_release"}, k = 1, mv = {1, 1, 16})
public final class FirebaseCrashlyticsTracker implements Tracker {
    public FirebaseCrashlyticsTracker(boolean z10) {
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(z10);
    }

    @Override // com.bbva.cells.component.kit.tracking.Tracker
    public void onEvent(@Nullable TrackingEvent event) {
        FirebaseCrashlytics.getInstance().log(a.b(event != null ? event.getId() : null, ": ", event != null ? event.toString() : null));
    }
}
