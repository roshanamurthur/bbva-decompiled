package o3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.CommandHandler;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.utils.IdGenerator;

/* JADX INFO: compiled from: Alarms.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f85265a = Logger.tagWithPrefix("Alarms");

    public static void a(@NonNull Context context, int i10, @NonNull String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i10, CommandHandler.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        Logger.get().debug(f85265a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl, @NonNull String str, long j10) {
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(str);
        if (systemIdInfo != null) {
            a(context, systemIdInfo.systemId, str);
            int i10 = systemIdInfo.systemId;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            PendingIntent service = PendingIntent.getService(context, i10, CommandHandler.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j10, service);
                return;
            }
            return;
        }
        int iNextAlarmManagerId = new IdGenerator(workDatabase).nextAlarmManagerId();
        systemIdInfoDao.insertSystemIdInfo(new SystemIdInfo(str, iNextAlarmManagerId));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service2 = PendingIntent.getService(context, iNextAlarmManagerId, CommandHandler.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j10, service2);
        }
    }
}
