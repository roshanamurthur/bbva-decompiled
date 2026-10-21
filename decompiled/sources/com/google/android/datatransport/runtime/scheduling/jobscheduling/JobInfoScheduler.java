package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(api = 21)
public class JobInfoScheduler implements WorkScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventStore f43824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchedulerConfig f43825c;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.f43823a = context;
        this.f43824b = eventStore;
        this.f43825c = schedulerConfig;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i10) {
        schedule(transportContext, i10, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i10, boolean z10) {
        Context context = this.f43823a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(transportContext.getBackendName().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.toInt(transportContext.getPriority())).array());
        if (transportContext.getExtras() != null) {
            adler32.update(transportContext.getExtras());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i11 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i11 < i10) {
                        break;
                    }
                    Logging.d("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
                    return;
                }
            }
        }
        long nextCallTime = this.f43824b.getNextCallTime(transportContext);
        JobInfo.Builder builderConfigureJob = this.f43825c.configureJob(new JobInfo.Builder(value, componentName), transportContext.getPriority(), nextCallTime, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", transportContext.getBackendName());
        persistableBundle.putInt("priority", PriorityMapping.toInt(transportContext.getPriority()));
        if (transportContext.getExtras() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(transportContext.getExtras(), 0));
        }
        builderConfigureJob.setExtras(persistableBundle);
        Logging.d("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Integer.valueOf(value), Long.valueOf(this.f43825c.getScheduleDelay(transportContext.getPriority(), nextCallTime, i10)), Long.valueOf(nextCallTime), Integer.valueOf(i10));
        jobScheduler.schedule(builderConfigureJob.build());
    }
}
