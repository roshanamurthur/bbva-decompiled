package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
public class ListPreloader<T> implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f38016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RequestManager f38017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PreloadModelProvider<T> f38018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PreloadSizeProvider<T> f38019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38021g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38023i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38022h = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38024j = true;

    public interface PreloadModelProvider<U> {
        @NonNull
        List<U> getPreloadItems(int i10);

        @Nullable
        RequestBuilder<?> getPreloadRequestBuilder(@NonNull U u2);
    }

    public interface PreloadSizeProvider<T> {
        @Nullable
        int[] getPreloadSize(@NonNull T t10, int i10, int i11);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<a> f38028a;

        public b(int i10) {
            this.f38028a = Util.createQueue(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f38028a.offer(new a());
            }
        }
    }

    public ListPreloader(@NonNull RequestManager requestManager, @NonNull PreloadModelProvider<T> preloadModelProvider, @NonNull PreloadSizeProvider<T> preloadSizeProvider, int i10) {
        this.f38017c = requestManager;
        this.f38018d = preloadModelProvider;
        this.f38019e = preloadSizeProvider;
        this.f38015a = i10;
        this.f38016b = new b(i10 + 1);
    }

    public final void a(int i10, boolean z10) {
        int iMin;
        int iMax;
        if (this.f38024j != z10) {
            this.f38024j = z10;
            int i11 = 0;
            while (true) {
                b bVar = this.f38016b;
                if (i11 >= bVar.f38028a.size()) {
                    break;
                }
                Queue<a> queue = bVar.f38028a;
                a aVarPoll = queue.poll();
                queue.offer(aVarPoll);
                aVarPoll.f38026q0 = 0;
                aVarPoll.f38025p0 = 0;
                this.f38017c.clear(aVarPoll);
                i11++;
            }
        }
        int i12 = this.f38015a;
        if (!z10) {
            i12 = -i12;
        }
        int i13 = i12 + i10;
        if (i10 < i13) {
            iMax = Math.max(this.f38020f, i10);
            iMin = i13;
        } else {
            iMin = Math.min(this.f38021g, i10);
            iMax = i13;
        }
        int iMin2 = Math.min(this.f38023i, iMin);
        int iMin3 = Math.min(this.f38023i, Math.max(0, iMax));
        PreloadModelProvider<T> preloadModelProvider = this.f38018d;
        if (i10 < i13) {
            for (int i14 = iMin3; i14 < iMin2; i14++) {
                b(i14, preloadModelProvider.getPreloadItems(i14), true);
            }
        } else {
            for (int i15 = iMin2 - 1; i15 >= iMin3; i15--) {
                b(i15, preloadModelProvider.getPreloadItems(i15), false);
            }
        }
        this.f38021g = iMin3;
        this.f38020f = iMin2;
    }

    public final void b(int i10, List list, boolean z10) {
        int size = list.size();
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                c(i10, i11, list.get(i11));
            }
            return;
        }
        for (int i12 = size - 1; i12 >= 0; i12--) {
            c(i10, i12, list.get(i12));
        }
    }

    public final void c(int i10, int i11, @Nullable Object obj) {
        int[] preloadSize;
        RequestBuilder<?> preloadRequestBuilder;
        if (obj == null || (preloadSize = this.f38019e.getPreloadSize(obj, i10, i11)) == null || (preloadRequestBuilder = this.f38018d.getPreloadRequestBuilder(obj)) == null) {
            return;
        }
        int i12 = preloadSize[0];
        int i13 = preloadSize[1];
        Queue<a> queue = this.f38016b.f38028a;
        a aVarPoll = queue.poll();
        queue.offer(aVarPoll);
        aVarPoll.f38026q0 = i12;
        aVarPoll.f38025p0 = i13;
        preloadRequestBuilder.into(aVarPoll);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        if (this.f38023i == 0 && i12 == 0) {
            return;
        }
        this.f38023i = i12;
        int i13 = this.f38022h;
        if (i10 > i13) {
            a(i11 + i10, true);
        } else if (i10 < i13) {
            a(i10, false);
        }
        this.f38022h = i10;
    }

    public static final class a implements Target<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f38025p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f38026q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @Nullable
        public Request f38027r0;

        @Override // com.bumptech.glide.request.target.Target
        @Nullable
        public final Request getRequest() {
            return this.f38027r0;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
            sizeReadyCallback.onSizeReady(this.f38026q0, this.f38025p0);
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void setRequest(@Nullable Request request) {
            this.f38027r0 = request;
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public final void onDestroy() {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public final void onStart() {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public final void onStop() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onLoadCleared(@Nullable Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onLoadFailed(@Nullable Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onLoadStarted(@Nullable Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onResourceReady(@NonNull Object obj, @Nullable Transition<? super Object> transition) {
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
    }
}
