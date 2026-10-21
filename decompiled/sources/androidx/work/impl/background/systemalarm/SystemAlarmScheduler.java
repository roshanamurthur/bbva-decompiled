package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmScheduler implements Scheduler {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f24472q0 = Logger.tagWithPrefix("SystemAlarmScheduler");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f24473p0;

    public SystemAlarmScheduler(@NonNull Context context) {
        this.f24473p0 = context.getApplicationContext();
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(@NonNull String str) {
        String str2 = CommandHandler.f24439s0;
        Context context = this.f24473p0;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec... workSpecArr) {
        for (WorkSpec workSpec : workSpecArr) {
            Logger.get().debug(f24472q0, String.format("Scheduling work with workSpecId %s", workSpec.id), new Throwable[0]);
            String str = workSpec.id;
            Context context = this.f24473p0;
            context.startService(CommandHandler.b(context, str));
        }
    }
}
