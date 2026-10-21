package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.engine.prefill.BitmapPreFiller;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class Glide implements ComponentCallbacks2 {

    @GuardedBy("Glide.class")
    public static volatile Glide F0;
    public static volatile boolean G0;

    @Nullable
    @GuardedBy("this")
    public BitmapPreFiller E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Engine f37976p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BitmapPool f37977q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final MemoryCache f37978r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final GlideContext f37979s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ArrayPool f37980t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final RequestManagerRetriever f37981u0;
    public final ConnectivityMonitorFactory v0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final RequestOptionsFactory f37983x0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @GuardedBy("managers")
    public final ArrayList f37982w0 = new ArrayList();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public MemoryCategory f37984y0 = MemoryCategory.NORMAL;

    public interface RequestOptionsFactory {
        @NonNull
        RequestOptions build();
    }

    public Glide(@NonNull Context context, @NonNull Engine engine, @NonNull MemoryCache memoryCache, @NonNull BitmapPool bitmapPool, @NonNull ArrayPool arrayPool, @NonNull RequestManagerRetriever requestManagerRetriever, @NonNull ConnectivityMonitorFactory connectivityMonitorFactory, int i10, @NonNull RequestOptionsFactory requestOptionsFactory, @NonNull ArrayMap arrayMap, @NonNull List list, @NonNull List list2, @Nullable AppGlideModule appGlideModule, @NonNull GlideExperiments glideExperiments) {
        this.f37976p0 = engine;
        this.f37977q0 = bitmapPool;
        this.f37980t0 = arrayPool;
        this.f37978r0 = memoryCache;
        this.f37981u0 = requestManagerRetriever;
        this.v0 = connectivityMonitorFactory;
        this.f37983x0 = requestOptionsFactory;
        this.f37979s0 = new GlideContext(context, arrayPool, new b(this, list2, appGlideModule), new ImageViewTargetFactory(), requestOptionsFactory, arrayMap, list, engine, glideExperiments, i10);
    }

    @Nullable
    public static GeneratedAppGlideModule a(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e5) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e5);
        } catch (InstantiationException e7) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e7);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
        }
    }

    @GuardedBy("Glide.class")
    public static void b(@NonNull Context context, @NonNull GlideBuilder glideBuilder, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<GlideModule> listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) {
            listEmptyList = new ManifestParser(applicationContext).parse();
        }
        List<GlideModule> list = listEmptyList;
        if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
            Set<Class<?>> setA = generatedAppGlideModule.a();
            Iterator<GlideModule> it = list.iterator();
            while (it.hasNext()) {
                GlideModule next = it.next();
                if (setA.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        next.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<GlideModule> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().getClass().toString();
            }
        }
        glideBuilder.f37997n = generatedAppGlideModule != null ? generatedAppGlideModule.b() : null;
        Iterator<GlideModule> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next().applyOptions(applicationContext, glideBuilder);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, glideBuilder);
        }
        if (glideBuilder.f37991g == null) {
            glideBuilder.f37991g = GlideExecutor.newSourceExecutor();
        }
        if (glideBuilder.f37992h == null) {
            glideBuilder.f37992h = GlideExecutor.newDiskCacheExecutor();
        }
        if (glideBuilder.f37998o == null) {
            glideBuilder.f37998o = GlideExecutor.newAnimationExecutor();
        }
        if (glideBuilder.f37994j == null) {
            glideBuilder.f37994j = new MemorySizeCalculator.Builder(applicationContext).build();
        }
        if (glideBuilder.f37995k == null) {
            glideBuilder.f37995k = new DefaultConnectivityMonitorFactory();
        }
        if (glideBuilder.f37988d == null) {
            int bitmapPoolSize = glideBuilder.f37994j.getBitmapPoolSize();
            if (bitmapPoolSize > 0) {
                glideBuilder.f37988d = new LruBitmapPool(bitmapPoolSize);
            } else {
                glideBuilder.f37988d = new BitmapPoolAdapter();
            }
        }
        if (glideBuilder.f37989e == null) {
            glideBuilder.f37989e = new LruArrayPool(glideBuilder.f37994j.getArrayPoolSizeInBytes());
        }
        if (glideBuilder.f37990f == null) {
            glideBuilder.f37990f = new LruResourceCache(glideBuilder.f37994j.getMemoryCacheSize());
        }
        if (glideBuilder.f37993i == null) {
            glideBuilder.f37993i = new InternalCacheDiskCacheFactory(applicationContext);
        }
        if (glideBuilder.f37987c == null) {
            glideBuilder.f37987c = new Engine(glideBuilder.f37990f, glideBuilder.f37993i, glideBuilder.f37992h, glideBuilder.f37991g, GlideExecutor.newUnlimitedSourceExecutor(), glideBuilder.f37998o, glideBuilder.f37999p);
        }
        List<RequestListener<Object>> list2 = glideBuilder.f38000q;
        if (list2 == null) {
            glideBuilder.f38000q = Collections.emptyList();
        } else {
            glideBuilder.f38000q = Collections.unmodifiableList(list2);
        }
        GlideExperiments.a aVar = glideBuilder.f37986b;
        aVar.getClass();
        Glide glide = new Glide(applicationContext, glideBuilder.f37987c, glideBuilder.f37990f, glideBuilder.f37988d, glideBuilder.f37989e, new RequestManagerRetriever(glideBuilder.f37997n), glideBuilder.f37995k, glideBuilder.f37996l, glideBuilder.m, glideBuilder.f37985a, glideBuilder.f38000q, list, generatedAppGlideModule, new GlideExperiments(aVar));
        applicationContext.registerComponentCallbacks(glide);
        F0 = glide;
    }

    @VisibleForTesting
    public static void enableHardwareBitmaps() {
        HardwareConfigState.getInstance().unblockHardwareBitmaps();
    }

    @NonNull
    public static Glide get(@NonNull Context context) {
        if (F0 == null) {
            GeneratedAppGlideModule generatedAppGlideModuleA = a(context.getApplicationContext());
            synchronized (Glide.class) {
                if (F0 == null) {
                    if (G0) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    G0 = true;
                    try {
                        b(context, new GlideBuilder(), generatedAppGlideModuleA);
                        G0 = false;
                    } catch (Throwable th2) {
                        G0 = false;
                        throw th2;
                    }
                }
            }
        }
        return F0;
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context) {
        return getPhotoCacheDir(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR);
    }

    @VisibleForTesting
    @Deprecated
    public static synchronized void init(Glide glide) {
        try {
            if (F0 != null) {
                tearDown();
            }
            F0 = glide;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    public static synchronized boolean isInitialized() {
        return F0 != null;
    }

    @VisibleForTesting
    public static void tearDown() {
        synchronized (Glide.class) {
            try {
                if (F0 != null) {
                    F0.getContext().getApplicationContext().unregisterComponentCallbacks(F0);
                    F0.f37976p0.shutdown();
                }
                F0 = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static RequestManager with(@NonNull Context context) {
        Preconditions.checkNotNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return get(context).getRequestManagerRetriever().get(context);
    }

    public final void c(RequestManager requestManager) {
        synchronized (this.f37982w0) {
            try {
                if (!this.f37982w0.contains(requestManager)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f37982w0.remove(requestManager);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clearDiskCache() {
        Util.assertBackgroundThread();
        this.f37976p0.clearDiskCache();
    }

    public void clearMemory() {
        Util.assertMainThread();
        this.f37978r0.clearMemory();
        this.f37977q0.clearMemory();
        this.f37980t0.clearMemory();
    }

    @NonNull
    public ArrayPool getArrayPool() {
        return this.f37980t0;
    }

    @NonNull
    public BitmapPool getBitmapPool() {
        return this.f37977q0;
    }

    @NonNull
    public Context getContext() {
        return this.f37979s0.getBaseContext();
    }

    @NonNull
    public Registry getRegistry() {
        return this.f37979s0.getRegistry();
    }

    @NonNull
    public RequestManagerRetriever getRequestManagerRetriever() {
        return this.f37981u0;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        clearMemory();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        trimMemory(i10);
    }

    public synchronized void preFillBitmapPool(@NonNull PreFillType.Builder... builderArr) {
        try {
            if (this.E0 == null) {
                this.E0 = new BitmapPreFiller(this.f37978r0, this.f37977q0, (DecodeFormat) this.f37983x0.build().getOptions().get(Downsampler.DECODE_FORMAT));
            }
            this.E0.preFill(builderArr);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    public MemoryCategory setMemoryCategory(@NonNull MemoryCategory memoryCategory) {
        Util.assertMainThread();
        this.f37978r0.setSizeMultiplier(memoryCategory.getMultiplier());
        this.f37977q0.setSizeMultiplier(memoryCategory.getMultiplier());
        MemoryCategory memoryCategory2 = this.f37984y0;
        this.f37984y0 = memoryCategory;
        return memoryCategory2;
    }

    public void trimMemory(int i10) {
        Util.assertMainThread();
        synchronized (this.f37982w0) {
            try {
                Iterator it = this.f37982w0.iterator();
                while (it.hasNext()) {
                    ((RequestManager) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f37978r0.trimMemory(i10);
        this.f37977q0.trimMemory(i10);
        this.f37980t0.trimMemory(i10);
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context, @NonNull String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @NonNull
    public static RequestManager with(@NonNull FragmentActivity fragmentActivity) {
        Preconditions.checkNotNull(fragmentActivity, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return get(fragmentActivity).getRequestManagerRetriever().get(fragmentActivity);
    }

    @VisibleForTesting
    public static void init(@NonNull Context context, @NonNull GlideBuilder glideBuilder) {
        GeneratedAppGlideModule generatedAppGlideModuleA = a(context);
        synchronized (Glide.class) {
            try {
                if (F0 != null) {
                    tearDown();
                }
                b(context, glideBuilder, generatedAppGlideModuleA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @Deprecated
    public static RequestManager with(@NonNull Activity activity) {
        return with(activity.getApplicationContext());
    }

    @NonNull
    public static RequestManager with(@NonNull Fragment fragment) {
        Context context = fragment.getContext();
        Preconditions.checkNotNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return get(context).getRequestManagerRetriever().get(fragment);
    }

    @NonNull
    @Deprecated
    public static RequestManager with(@NonNull android.app.Fragment fragment) {
        Activity activity = fragment.getActivity();
        Preconditions.checkNotNull(activity, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return with(activity.getApplicationContext());
    }

    @NonNull
    public static RequestManager with(@NonNull View view) {
        Context context = view.getContext();
        Preconditions.checkNotNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return get(context).getRequestManagerRetriever().get(view);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
