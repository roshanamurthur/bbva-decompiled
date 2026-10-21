package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncListDiffer<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f22538h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListUpdateCallback f22539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsyncDifferConfig<T> f22540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f22541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f22542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<T> f22543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public List<T> f22544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22545g;

    public interface ListListener<T> {
        void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2);
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List f22546p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List f22547q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f22548r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Runnable f22549s0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.AsyncListDiffer$a$a, reason: collision with other inner class name */
        public class C0099a extends DiffUtil.Callback {
            public C0099a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final boolean areContentsTheSame(int i10, int i11) {
                a aVar = a.this;
                Object obj = aVar.f22546p0.get(i10);
                Object obj2 = aVar.f22547q0.get(i11);
                if (obj != null && obj2 != null) {
                    return AsyncListDiffer.this.f22540b.getDiffCallback().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final boolean areItemsTheSame(int i10, int i11) {
                a aVar = a.this;
                Object obj = aVar.f22546p0.get(i10);
                Object obj2 = aVar.f22547q0.get(i11);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return AsyncListDiffer.this.f22540b.getDiffCallback().areItemsTheSame(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            @Nullable
            public final Object getChangePayload(int i10, int i11) {
                a aVar = a.this;
                Object obj = aVar.f22546p0.get(i10);
                Object obj2 = aVar.f22547q0.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return AsyncListDiffer.this.f22540b.getDiffCallback().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final int getNewListSize() {
                return a.this.f22547q0.size();
            }

            @Override // androidx.recyclerview.widget.DiffUtil.Callback
            public final int getOldListSize() {
                return a.this.f22546p0.size();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DiffUtil.DiffResult f22552p0;

            public b(DiffUtil.DiffResult diffResult) {
                this.f22552p0 = diffResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                AsyncListDiffer asyncListDiffer = AsyncListDiffer.this;
                if (asyncListDiffer.f22545g == aVar.f22548r0) {
                    List<T> list = aVar.f22547q0;
                    Runnable runnable = aVar.f22549s0;
                    List<T> list2 = asyncListDiffer.f22544f;
                    asyncListDiffer.f22543e = list;
                    asyncListDiffer.f22544f = Collections.unmodifiableList(list);
                    this.f22552p0.dispatchUpdatesTo(asyncListDiffer.f22539a);
                    asyncListDiffer.a(list2, runnable);
                }
            }
        }

        public a(List list, List list2, int i10, Runnable runnable) {
            this.f22546p0 = list;
            this.f22547q0 = list2;
            this.f22548r0 = i10;
            this.f22549s0 = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AsyncListDiffer.this.f22541c.execute(new b(DiffUtil.calculateDiff(new C0099a())));
        }
    }

    public static class b implements Executor {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Handler f22554p0 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            this.f22554p0.post(runnable);
        }
    }

    public AsyncListDiffer(@NonNull RecyclerView.Adapter adapter, @NonNull DiffUtil.ItemCallback<T> itemCallback) {
        this(new AdapterListUpdateCallback(adapter), new AsyncDifferConfig.Builder(itemCallback).build());
    }

    public final void a(@NonNull List<T> list, @Nullable Runnable runnable) {
        Iterator it = this.f22542d.iterator();
        while (it.hasNext()) {
            ((ListListener) it.next()).onCurrentListChanged(list, this.f22544f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addListListener(@NonNull ListListener<T> listListener) {
        this.f22542d.add(listListener);
    }

    @NonNull
    public List<T> getCurrentList() {
        return this.f22544f;
    }

    public void removeListListener(@NonNull ListListener<T> listListener) {
        this.f22542d.remove(listListener);
    }

    public void submitList(@Nullable List<T> list) {
        submitList(list, null);
    }

    public void submitList(@Nullable List<T> list, @Nullable Runnable runnable) {
        int i10 = this.f22545g + 1;
        this.f22545g = i10;
        List<T> list2 = this.f22543e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f22544f;
        ListUpdateCallback listUpdateCallback = this.f22539a;
        if (list == null) {
            int size = list2.size();
            this.f22543e = null;
            this.f22544f = Collections.emptyList();
            listUpdateCallback.onRemoved(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f22540b.getBackgroundThreadExecutor().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f22543e = list;
        this.f22544f = Collections.unmodifiableList(list);
        listUpdateCallback.onInserted(0, list.size());
        a(list3, runnable);
    }

    public AsyncListDiffer(@NonNull ListUpdateCallback listUpdateCallback, @NonNull AsyncDifferConfig<T> asyncDifferConfig) {
        this.f22542d = new CopyOnWriteArrayList();
        this.f22544f = Collections.emptyList();
        this.f22539a = listUpdateCallback;
        this.f22540b = asyncDifferConfig;
        if (asyncDifferConfig.getMainThreadExecutor() != null) {
            this.f22541c = asyncDifferConfig.getMainThreadExecutor();
        } else {
            this.f22541c = f22538h;
        }
    }
}
