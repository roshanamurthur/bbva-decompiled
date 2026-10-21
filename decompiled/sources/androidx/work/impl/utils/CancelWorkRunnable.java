package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class CancelWorkRunnable implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final OperationImpl f24595p0 = new OperationImpl();

    public class a extends CancelWorkRunnable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WorkManagerImpl f24596q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UUID f24597r0;

        public a(WorkManagerImpl workManagerImpl, UUID uuid) {
            this.f24596q0 = workManagerImpl;
            this.f24597r0 = uuid;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        @WorkerThread
        public final void b() {
            WorkManagerImpl workManagerImpl = this.f24596q0;
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                CancelWorkRunnable.a(workManagerImpl, this.f24597r0.toString());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    public class b extends CancelWorkRunnable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WorkManagerImpl f24598q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f24599r0;

        public b(WorkManagerImpl workManagerImpl, String str) {
            this.f24598q0 = workManagerImpl;
            this.f24599r0 = str;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        @WorkerThread
        public final void b() {
            WorkManagerImpl workManagerImpl = this.f24598q0;
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(this.f24599r0).iterator();
                while (it.hasNext()) {
                    CancelWorkRunnable.a(workManagerImpl, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    public class c extends CancelWorkRunnable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WorkManagerImpl f24600q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f24601r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f24602s0;

        public c(WorkManagerImpl workManagerImpl, String str, boolean z10) {
            this.f24600q0 = workManagerImpl;
            this.f24601r0 = str;
            this.f24602s0 = z10;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        @WorkerThread
        public final void b() {
            WorkManagerImpl workManagerImpl = this.f24600q0;
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(this.f24601r0).iterator();
                while (it.hasNext()) {
                    CancelWorkRunnable.a(workManagerImpl, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (this.f24602s0) {
                    Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
                }
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    public class d extends CancelWorkRunnable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WorkManagerImpl f24603q0;

        public d(WorkManagerImpl workManagerImpl) {
            this.f24603q0 = workManagerImpl;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        @WorkerThread
        public final void b() {
            WorkManagerImpl workManagerImpl = this.f24603q0;
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                while (it.hasNext()) {
                    CancelWorkRunnable.a(workManagerImpl, it.next());
                }
                new PreferenceUtils(workManagerImpl.getWorkDatabase()).setLastCancelAllTimeMillis(System.currentTimeMillis());
                workDatabase.setTransactionSuccessful();
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    public static void a(WorkManagerImpl workManagerImpl, String str) {
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State state = workSpecDao.getState(str2);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setState(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(dependencyDao.getDependentWorkIds(str2));
        }
        workManagerImpl.getProcessor().stopAndCancelWork(str);
        Iterator<Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    public static CancelWorkRunnable forAll(@NonNull WorkManagerImpl workManagerImpl) {
        return new d(workManagerImpl);
    }

    public static CancelWorkRunnable forId(@NonNull UUID uuid, @NonNull WorkManagerImpl workManagerImpl) {
        return new a(workManagerImpl, uuid);
    }

    public static CancelWorkRunnable forName(@NonNull String str, @NonNull WorkManagerImpl workManagerImpl, boolean z10) {
        return new c(workManagerImpl, str, z10);
    }

    public static CancelWorkRunnable forTag(@NonNull String str, @NonNull WorkManagerImpl workManagerImpl) {
        return new b(workManagerImpl, str);
    }

    public abstract void b();

    public Operation getOperation() {
        return this.f24595p0;
    }

    @Override // java.lang.Runnable
    public void run() {
        OperationImpl operationImpl = this.f24595p0;
        try {
            b();
            operationImpl.setState(Operation.SUCCESS);
        } catch (Throwable th2) {
            operationImpl.setState(new Operation.State.FAILURE(th2));
        }
    }
}
