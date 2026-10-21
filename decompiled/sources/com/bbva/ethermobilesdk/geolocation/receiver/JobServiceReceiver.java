package com.bbva.ethermobilesdk.geolocation.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.bbva.ethermobilesdk.geolocation.activity.service.ActivityRecognitionService;
import com.bbva.ethermobilesdk.geolocation.geofencing.service.GeofencingService;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.geolocation.utils.extension.LoggerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JobServiceReceiver.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/receiver/JobServiceReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "geolocation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JobServiceReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (intent != null) {
            LoggerKt.log("JobServiceReceiver call from " + intent.getStringExtra(ConstantsKt.TYPE));
            if (Intrinsics.areEqual(intent.getAction(), ConstantsKt.JOB_SERVICE_ACTION)) {
                String stringExtra = intent.getStringExtra(ConstantsKt.TYPE);
                if (stringExtra != null) {
                    int iHashCode = stringExtra.hashCode();
                    if (iHashCode != -1672791168) {
                        if (iHashCode == -873340145 && stringExtra.equals(ConstantsKt.ACTIVITY_TYPE)) {
                            JobIntentService.enqueueWork(context, (Class<?>) ActivityRecognitionService.class, 101, intent);
                            return;
                        }
                    } else if (stringExtra.equals(ConstantsKt.GEOFENCING_TYPE)) {
                        JobIntentService.enqueueWork(context, (Class<?>) GeofencingService.class, 102, intent);
                        return;
                    }
                }
                LoggerKt.log("Intent type not recognized");
            }
        }
    }
}
