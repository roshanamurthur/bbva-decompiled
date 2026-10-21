package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class StatusRunnable<T> implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SettableFuture<T> f24635p0 = SettableFuture.create();

    public class a extends StatusRunnable<List<WorkInfo>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WorkManagerImpl f24636q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ List f24637r0;

        public a(WorkManagerImpl workManagerImpl, List list) {
            this.f24636q0 = workManagerImpl;
            this.f24637r0 = list;
        }

        @Override // androidx.work.impl.utils.StatusRunnable
        public final List<WorkInfo> a() {
            return WorkSpec.WORK_INFO_MAPPER.apply(this.f24636q0.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(this.f24637r0));
        }
    }

    public class b extends StatusRunnable<WorkInfo> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WorkManagerImpl f24638q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UUID f24639r0;

        public b(WorkManagerImpl workManagerImpl, UUID uuid) {
            this.f24638q0 = workManagerImpl;
            this.f24639r0 = uuid;
        }

        @Override // androidx.work.impl.utils.StatusRunnable
        public final WorkInfo a() {
            WorkSpec.WorkInfoPojo workStatusPojoForId = this.f24638q0.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(this.f24639r0.toString());
            if (workStatusPojoForId != null) {
                return workStatusPojoForId.toWorkInfo();
            }
            return null;
        }
    }

    public class c extends StatusRunnable<List<WorkInfo>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WorkManagerImpl f24640q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f24641r0;

        public c(WorkManagerImpl workManagerImpl, String str) {
            this.f24640q0 = workManagerImpl;
            this.f24641r0 = str;
        }

        @Override // androidx.work.impl.utils.StatusRunnable
        public final List<WorkInfo> a() {
            return WorkSpec.WORK_INFO_MAPPER.apply(this.f24640q0.getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(this.f24641r0));
        }
    }

    public class d extends StatusRunnable<List<WorkInfo>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WorkManagerImpl f24642q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f24643r0;

        public d(WorkManagerImpl workManagerImpl, String str) {
            this.f24642q0 = workManagerImpl;
            this.f24643r0 = str;
        }

        @Override // androidx.work.impl.utils.StatusRunnable
        public final List<WorkInfo> a() {
            return WorkSpec.WORK_INFO_MAPPER.apply(this.f24642q0.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(this.f24643r0));
        }
    }

    public class e extends StatusRunnable<List<WorkInfo>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WorkManagerImpl f24644q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ WorkQuery f24645r0;

        public e(WorkManagerImpl workManagerImpl, WorkQuery workQuery) {
            this.f24644q0 = workManagerImpl;
            this.f24645r0 = workQuery;
        }

        @Override // androidx.work.impl.utils.StatusRunnable
        public final List<WorkInfo> a() {
            return WorkSpec.WORK_INFO_MAPPER.apply(this.f24644q0.getWorkDatabase().rawWorkInfoDao().getWorkInfoPojos(RawQueries.workQueryToRawQuery(this.f24645r0)));
        }
    }

    @NonNull
    public static StatusRunnable<List<WorkInfo>> forStringIds(@NonNull WorkManagerImpl workManagerImpl, @NonNull List<String> list) {
        return new a(workManagerImpl, list);
    }

    @NonNull
    public static StatusRunnable<List<WorkInfo>> forTag(@NonNull WorkManagerImpl workManagerImpl, @NonNull String str) {
        return new c(workManagerImpl, str);
    }

    @NonNull
    public static StatusRunnable<WorkInfo> forUUID(@NonNull WorkManagerImpl workManagerImpl, @NonNull UUID uuid) {
        return new b(workManagerImpl, uuid);
    }

    @NonNull
    public static StatusRunnable<List<WorkInfo>> forUniqueWork(@NonNull WorkManagerImpl workManagerImpl, @NonNull String str) {
        return new d(workManagerImpl, str);
    }

    @NonNull
    public static StatusRunnable<List<WorkInfo>> forWorkQuerySpec(@NonNull WorkManagerImpl workManagerImpl, @NonNull WorkQuery workQuery) {
        return new e(workManagerImpl, workQuery);
    }

    @WorkerThread
    public abstract T a();

    @NonNull
    public ListenableFuture<T> getFuture() {
        return this.f24635p0;
    }

    @Override // java.lang.Runnable
    public void run() {
        SettableFuture<T> settableFuture = this.f24635p0;
        try {
            settableFuture.set(a());
        } catch (Throwable th2) {
            settableFuture.setException(th2);
        }
    }
}
