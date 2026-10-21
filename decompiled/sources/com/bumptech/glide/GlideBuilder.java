package com.bumptech.glide;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class GlideBuilder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Engine f37987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BitmapPool f37988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayPool f37989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MemoryCache f37990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GlideExecutor f37991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GlideExecutor f37992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DiskCache.Factory f37993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MemorySizeCalculator f37994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ConnectivityMonitorFactory f37995k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public RequestManagerRetriever.RequestManagerFactory f37997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GlideExecutor f37998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f37999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public List<RequestListener<Object>> f38000q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayMap f37985a = new ArrayMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlideExperiments.a f37986b = new GlideExperiments.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37996l = 4;
    public Glide.RequestOptionsFactory m = new a();

    public static final class LogRequestOrigins {
    }

    public class a implements Glide.RequestOptionsFactory {
        @Override // com.bumptech.glide.Glide.RequestOptionsFactory
        @NonNull
        public final RequestOptions build() {
            return new RequestOptions();
        }
    }

    public class b implements Glide.RequestOptionsFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RequestOptions f38001a;

        public b(RequestOptions requestOptions) {
            this.f38001a = requestOptions;
        }

        @Override // com.bumptech.glide.Glide.RequestOptionsFactory
        @NonNull
        public final RequestOptions build() {
            RequestOptions requestOptions = this.f38001a;
            return requestOptions != null ? requestOptions : new RequestOptions();
        }
    }

    public static final class c {
    }

    @NonNull
    public GlideBuilder addGlobalRequestListener(@NonNull RequestListener<Object> requestListener) {
        if (this.f38000q == null) {
            this.f38000q = new ArrayList();
        }
        this.f38000q.add(requestListener);
        return this;
    }

    @NonNull
    public GlideBuilder setAnimationExecutor(@Nullable GlideExecutor glideExecutor) {
        this.f37998o = glideExecutor;
        return this;
    }

    @NonNull
    public GlideBuilder setArrayPool(@Nullable ArrayPool arrayPool) {
        this.f37989e = arrayPool;
        return this;
    }

    @NonNull
    public GlideBuilder setBitmapPool(@Nullable BitmapPool bitmapPool) {
        this.f37988d = bitmapPool;
        return this;
    }

    @NonNull
    public GlideBuilder setConnectivityMonitorFactory(@Nullable ConnectivityMonitorFactory connectivityMonitorFactory) {
        this.f37995k = connectivityMonitorFactory;
        return this;
    }

    @NonNull
    public GlideBuilder setDefaultRequestOptions(@Nullable RequestOptions requestOptions) {
        return setDefaultRequestOptions(new b(requestOptions));
    }

    @NonNull
    public <T> GlideBuilder setDefaultTransitionOptions(@NonNull Class<T> cls, @Nullable TransitionOptions<?, T> transitionOptions) {
        this.f37985a.put(cls, transitionOptions);
        return this;
    }

    @NonNull
    public GlideBuilder setDiskCache(@Nullable DiskCache.Factory factory) {
        this.f37993i = factory;
        return this;
    }

    @NonNull
    public GlideBuilder setDiskCacheExecutor(@Nullable GlideExecutor glideExecutor) {
        this.f37992h = glideExecutor;
        return this;
    }

    public GlideBuilder setImageDecoderEnabledForBitmaps(boolean z10) {
        c cVar = new c();
        boolean z11 = z10 && Build.VERSION.SDK_INT >= 29;
        HashMap map = this.f37986b.f38014a;
        if (z11) {
            map.put(c.class, cVar);
        } else {
            map.remove(c.class);
        }
        return this;
    }

    @NonNull
    public GlideBuilder setIsActiveResourceRetentionAllowed(boolean z10) {
        this.f37999p = z10;
        return this;
    }

    @NonNull
    public GlideBuilder setLogLevel(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f37996l = i10;
        return this;
    }

    public GlideBuilder setLogRequestOrigins(boolean z10) {
        LogRequestOrigins logRequestOrigins = new LogRequestOrigins();
        HashMap map = this.f37986b.f38014a;
        if (z10) {
            map.put(LogRequestOrigins.class, logRequestOrigins);
        } else {
            map.remove(LogRequestOrigins.class);
        }
        return this;
    }

    @NonNull
    public GlideBuilder setMemoryCache(@Nullable MemoryCache memoryCache) {
        this.f37990f = memoryCache;
        return this;
    }

    @NonNull
    public GlideBuilder setMemorySizeCalculator(@NonNull MemorySizeCalculator.Builder builder) {
        return setMemorySizeCalculator(builder.build());
    }

    @Deprecated
    public GlideBuilder setResizeExecutor(@Nullable GlideExecutor glideExecutor) {
        return setSourceExecutor(glideExecutor);
    }

    @NonNull
    public GlideBuilder setSourceExecutor(@Nullable GlideExecutor glideExecutor) {
        this.f37991g = glideExecutor;
        return this;
    }

    @NonNull
    public GlideBuilder setDefaultRequestOptions(@NonNull Glide.RequestOptionsFactory requestOptionsFactory) {
        this.m = (Glide.RequestOptionsFactory) Preconditions.checkNotNull(requestOptionsFactory);
        return this;
    }

    @NonNull
    public GlideBuilder setMemorySizeCalculator(@Nullable MemorySizeCalculator memorySizeCalculator) {
        this.f37994j = memorySizeCalculator;
        return this;
    }

    @Deprecated
    public GlideBuilder setDisableHardwareBitmapsOnO(boolean z10) {
        return this;
    }
}
