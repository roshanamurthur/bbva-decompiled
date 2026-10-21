package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.util.GlideSuppliers;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class GlideContext extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @VisibleForTesting
    public static final GenericTransitionOptions f38002k = new GenericTransitionOptions();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayPool f38003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlideSuppliers.GlideSupplier<Registry> f38004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageViewTargetFactory f38005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Glide.RequestOptionsFactory f38006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<RequestListener<Object>> f38007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Class<?>, TransitionOptions<?, ?>> f38008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Engine f38009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GlideExperiments f38010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f38011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public RequestOptions f38012j;

    public GlideContext(@NonNull Context context, @NonNull ArrayPool arrayPool, @NonNull GlideSuppliers.GlideSupplier<Registry> glideSupplier, @NonNull ImageViewTargetFactory imageViewTargetFactory, @NonNull Glide.RequestOptionsFactory requestOptionsFactory, @NonNull Map<Class<?>, TransitionOptions<?, ?>> map, @NonNull List<RequestListener<Object>> list, @NonNull Engine engine, @NonNull GlideExperiments glideExperiments, int i10) {
        super(context.getApplicationContext());
        this.f38003a = arrayPool;
        this.f38005c = imageViewTargetFactory;
        this.f38006d = requestOptionsFactory;
        this.f38007e = list;
        this.f38008f = map;
        this.f38009g = engine;
        this.f38010h = glideExperiments;
        this.f38011i = i10;
        this.f38004b = GlideSuppliers.memorize(glideSupplier);
    }

    @NonNull
    public <X> ViewTarget<ImageView, X> buildImageViewTarget(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f38005c.buildTarget(imageView, cls);
    }

    @NonNull
    public ArrayPool getArrayPool() {
        return this.f38003a;
    }

    public List<RequestListener<Object>> getDefaultRequestListeners() {
        return this.f38007e;
    }

    public synchronized RequestOptions getDefaultRequestOptions() {
        try {
            if (this.f38012j == null) {
                this.f38012j = this.f38006d.build().lock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f38012j;
    }

    @NonNull
    public <T> TransitionOptions<?, T> getDefaultTransitionOptions(@NonNull Class<T> cls) {
        Map<Class<?>, TransitionOptions<?, ?>> map = this.f38008f;
        TransitionOptions<?, T> transitionOptions = (TransitionOptions) map.get(cls);
        if (transitionOptions == null) {
            for (Map.Entry<Class<?>, TransitionOptions<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    transitionOptions = (TransitionOptions) entry.getValue();
                }
            }
        }
        return transitionOptions == null ? f38002k : transitionOptions;
    }

    @NonNull
    public Engine getEngine() {
        return this.f38009g;
    }

    public GlideExperiments getExperiments() {
        return this.f38010h;
    }

    public int getLogLevel() {
        return this.f38011i;
    }

    @NonNull
    public Registry getRegistry() {
        return this.f38004b.get();
    }
}
