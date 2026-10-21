package androidx.work.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.EnqueueRunnable;
import androidx.work.impl.utils.LiveDataUtils;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkContinuationImpl extends WorkContinuation {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f24366j = Logger.tagWithPrefix("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkManagerImpl f24367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExistingWorkPolicy f24369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<? extends WorkRequest> f24370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f24372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<WorkContinuationImpl> f24373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Operation f24375i;

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, @NonNull List<? extends WorkRequest> list) {
        this(workManagerImpl, null, ExistingWorkPolicy.KEEP, list, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean a(@NonNull WorkContinuationImpl workContinuationImpl, @NonNull HashSet hashSet) {
        hashSet.addAll(workContinuationImpl.getIds());
        Set<String> setPrerequisitesFor = prerequisitesFor(workContinuationImpl);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (setPrerequisitesFor.contains((String) it.next())) {
                return true;
            }
        }
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        if (parents != null && !parents.isEmpty()) {
            Iterator<WorkContinuationImpl> it2 = parents.iterator();
            while (it2.hasNext()) {
                if (a(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(workContinuationImpl.getIds());
        return false;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Set<String> prerequisitesFor(WorkContinuationImpl workContinuationImpl) {
        HashSet hashSet = new HashSet();
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        if (parents != null && !parents.isEmpty()) {
            Iterator<WorkContinuationImpl> it = parents.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().getIds());
            }
        }
        return hashSet;
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public WorkContinuation combineInternal(@NonNull List<WorkContinuation> list) {
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(CombineContinuationsWorker.class).setInputMerger(ArrayCreatingInputMerger.class).build();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<WorkContinuation> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((WorkContinuationImpl) it.next());
        }
        return new WorkContinuationImpl(this.f24367a, null, ExistingWorkPolicy.KEEP, Collections.singletonList(oneTimeWorkRequestBuild), arrayList);
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public Operation enqueue() {
        if (this.f24374h) {
            Logger.get().warning(f24366j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f24371e)), new Throwable[0]);
        } else {
            EnqueueRunnable enqueueRunnable = new EnqueueRunnable(this);
            this.f24367a.getWorkTaskExecutor().executeOnBackgroundThread(enqueueRunnable);
            this.f24375i = enqueueRunnable.getOperation();
        }
        return this.f24375i;
    }

    public List<String> getAllIds() {
        return this.f24372f;
    }

    public ExistingWorkPolicy getExistingWorkPolicy() {
        return this.f24369c;
    }

    @NonNull
    public List<String> getIds() {
        return this.f24371e;
    }

    @Nullable
    public String getName() {
        return this.f24368b;
    }

    public List<WorkContinuationImpl> getParents() {
        return this.f24373g;
    }

    @NonNull
    public List<? extends WorkRequest> getWork() {
        return this.f24370d;
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public ListenableFuture<List<WorkInfo>> getWorkInfos() {
        ArrayList arrayList = this.f24372f;
        WorkManagerImpl workManagerImpl = this.f24367a;
        StatusRunnable<List<WorkInfo>> statusRunnableForStringIds = StatusRunnable.forStringIds(workManagerImpl, arrayList);
        workManagerImpl.getWorkTaskExecutor().executeOnBackgroundThread(statusRunnableForStringIds);
        return statusRunnableForStringIds.getFuture();
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public LiveData<List<WorkInfo>> getWorkInfosLiveData() {
        ArrayList arrayList = this.f24372f;
        WorkManagerImpl workManagerImpl = this.f24367a;
        return LiveDataUtils.dedupedMappedLiveDataFor(workManagerImpl.f24397c.workSpecDao().getWorkStatusPojoLiveDataForIds(arrayList), WorkSpec.WORK_INFO_MAPPER, workManagerImpl.f24398d);
    }

    @NonNull
    public WorkManagerImpl getWorkManagerImpl() {
        return this.f24367a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean hasCycles() {
        return a(this, new HashSet());
    }

    public boolean isEnqueued() {
        return this.f24374h;
    }

    public void markEnqueued() {
        this.f24374h = true;
    }

    @Override // androidx.work.WorkContinuation
    @NonNull
    public WorkContinuation then(@NonNull List<OneTimeWorkRequest> list) {
        return list.isEmpty() ? this : new WorkContinuationImpl(this.f24367a, this.f24368b, ExistingWorkPolicy.KEEP, list, Collections.singletonList(this));
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends WorkRequest> list) {
        this(workManagerImpl, str, existingWorkPolicy, list, null);
    }

    public WorkContinuationImpl(@NonNull WorkManagerImpl workManagerImpl, @Nullable String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<? extends WorkRequest> list, @Nullable List<WorkContinuationImpl> list2) {
        this.f24367a = workManagerImpl;
        this.f24368b = str;
        this.f24369c = existingWorkPolicy;
        this.f24370d = list;
        this.f24373g = list2;
        this.f24371e = new ArrayList(list.size());
        this.f24372f = new ArrayList();
        if (list2 != null) {
            Iterator<WorkContinuationImpl> it = list2.iterator();
            while (it.hasNext()) {
                this.f24372f.addAll(it.next().f24372f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String stringId = list.get(i10).getStringId();
            this.f24371e.add(stringId);
            this.f24372f.add(stringId);
        }
    }
}
