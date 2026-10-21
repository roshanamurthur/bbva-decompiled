package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;

/* JADX INFO: loaded from: classes9.dex */
public class AlarmManagerScheduler implements WorkScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventStore f43818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AlarmManager f43819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SchedulerConfig f43820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Clock f43821e;

    public AlarmManagerScheduler(Context context, EventStore eventStore, Clock clock, SchedulerConfig schedulerConfig) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        this.f43817a = context;
        this.f43818b = eventStore;
        this.f43819c = alarmManager;
        this.f43821e = clock;
        this.f43820d = schedulerConfig;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i10) {
        schedule(transportContext, i10, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", transportContext.getBackendName());
        builder.appendQueryParameter("priority", String.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
        if (transportContext.getExtras() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(transportContext.getExtras(), 0));
        }
        Context context = this.f43817a;
        Intent intent = new Intent(context, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (!z10 && PendingIntent.getBroadcast(context, 0, intent, 603979776) != null) {
            Logging.d("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long nextCallTime = this.f43818b.getNextCallTime(transportContext);
        long scheduleDelay = this.f43820d.getScheduleDelay(transportContext.getPriority(), nextCallTime, i10);
        Logging.d("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Long.valueOf(scheduleDelay), Long.valueOf(nextCallTime), Integer.valueOf(i10));
        this.f43819c.set(3, this.f43821e.getTime() + scheduleDelay, PendingIntent.getBroadcast(context, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
    }
}
