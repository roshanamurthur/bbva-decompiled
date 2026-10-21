package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LiveDataUtils {

    /* JADX INFO: Add missing generic type declarations: [In] */
    public class a<In> implements Observer<In> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Out f24614a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TaskExecutor f24615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f24616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function f24617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MediatorLiveData f24618e;

        /* JADX INFO: renamed from: androidx.work.impl.utils.LiveDataUtils$a$a, reason: collision with other inner class name */
        public class RunnableC0108a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Object f24619p0;

            public RunnableC0108a(Object obj) {
                this.f24619p0 = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (a.this.f24616c) {
                    try {
                        ?? Apply = a.this.f24617d.apply(this.f24619p0);
                        a aVar = a.this;
                        Out out = aVar.f24614a;
                        if (out == 0 && Apply != 0) {
                            aVar.f24614a = Apply;
                            aVar.f24618e.postValue(Apply);
                        } else if (out != 0 && !out.equals(Apply)) {
                            a aVar2 = a.this;
                            aVar2.f24614a = Apply;
                            aVar2.f24618e.postValue(Apply);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public a(TaskExecutor taskExecutor, Object obj, Function function, MediatorLiveData mediatorLiveData) {
            this.f24615b = taskExecutor;
            this.f24616c = obj;
            this.f24617d = function;
            this.f24618e = mediatorLiveData;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@Nullable In in2) {
            this.f24615b.executeOnBackgroundThread(new RunnableC0108a(in2));
        }
    }

    public static <In, Out> LiveData<Out> dedupedMappedLiveDataFor(@NonNull LiveData<In> liveData, @NonNull Function<In, Out> function, @NonNull TaskExecutor taskExecutor) {
        Object obj = new Object();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new a(taskExecutor, obj, function, mediatorLiveData));
        return mediatorLiveData;
    }
}
