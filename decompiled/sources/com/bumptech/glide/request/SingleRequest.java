package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SdkDigitizeStatus;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.GlideTrace;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class SingleRequest<R> implements Request, SizeReadyCallback, ResourceCallback {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);

    @GuardedBy("requestLock")
    public int A;

    @GuardedBy("requestLock")
    public boolean B;

    @Nullable
    public final RuntimeException C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateVerifier f38783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final RequestListener<R> f38785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RequestCoordinator f38786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f38787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GlideContext f38788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Object f38789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class<R> f38790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BaseRequestOptions<?> f38791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f38792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f38793l;
    public final Priority m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Target<R> f38794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final List<RequestListener<R>> f38795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransitionFactory<? super R> f38796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Executor f38797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @GuardedBy("requestLock")
    public Resource<R> f38798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @GuardedBy("requestLock")
    public Engine.LoadStatus f38799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @GuardedBy("requestLock")
    public long f38800t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile Engine f38801u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @GuardedBy("requestLock")
    public a f38802v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f38803w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f38804x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f38805y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f38806z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLEARED;
        public static final a COMPLETE;
        public static final a FAILED;
        public static final a PENDING;
        public static final a RUNNING;
        public static final a WAITING_FOR_SIZE;

        static {
            a aVar = new a(SdkDigitizeStatus.PENDING, 0);
            PENDING = aVar;
            a aVar2 = new a(DebugCoroutineInfoImplKt.RUNNING, 1);
            RUNNING = aVar2;
            a aVar3 = new a("WAITING_FOR_SIZE", 2);
            WAITING_FOR_SIZE = aVar3;
            a aVar4 = new a("COMPLETE", 3);
            COMPLETE = aVar4;
            a aVar5 = new a("FAILED", 4);
            FAILED = aVar5;
            a aVar6 = new a("CLEARED", 5);
            CLEARED = aVar6;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public SingleRequest(Context context, GlideContext glideContext, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, BaseRequestOptions<?> baseRequestOptions, int i10, int i11, Priority priority, Target<R> target, @Nullable RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator, Engine engine, TransitionFactory<? super R> transitionFactory, Executor executor) {
        if (D) {
            String.valueOf(hashCode());
        }
        this.f38783b = StateVerifier.newInstance();
        this.f38784c = obj;
        this.f38787f = context;
        this.f38788g = glideContext;
        this.f38789h = obj2;
        this.f38790i = cls;
        this.f38791j = baseRequestOptions;
        this.f38792k = i10;
        this.f38793l = i11;
        this.m = priority;
        this.f38794n = target;
        this.f38785d = requestListener;
        this.f38795o = list;
        this.f38786e = requestCoordinator;
        this.f38801u = engine;
        this.f38796p = transitionFactory;
        this.f38797q = executor;
        this.f38802v = a.PENDING;
        if (this.C == null && glideContext.getExperiments().isEnabled(GlideBuilder.LogRequestOrigins.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    public static <R> SingleRequest<R> obtain(Context context, GlideContext glideContext, Object obj, Object obj2, Class<R> cls, BaseRequestOptions<?> baseRequestOptions, int i10, int i11, Priority priority, Target<R> target, RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator, Engine engine, TransitionFactory<? super R> transitionFactory, Executor executor) {
        return new SingleRequest<>(context, glideContext, obj, obj2, cls, baseRequestOptions, i10, i11, priority, target, requestListener, list, requestCoordinator, engine, transitionFactory, executor);
    }

    @GuardedBy("requestLock")
    public final Drawable a() {
        if (this.f38805y == null) {
            BaseRequestOptions<?> baseRequestOptions = this.f38791j;
            Drawable fallbackDrawable = baseRequestOptions.getFallbackDrawable();
            this.f38805y = fallbackDrawable;
            if (fallbackDrawable == null && baseRequestOptions.getFallbackId() > 0) {
                this.f38805y = d(baseRequestOptions.getFallbackId());
            }
        }
        return this.f38805y;
    }

    @GuardedBy("requestLock")
    public final Drawable b() {
        if (this.f38804x == null) {
            BaseRequestOptions<?> baseRequestOptions = this.f38791j;
            Drawable placeholderDrawable = baseRequestOptions.getPlaceholderDrawable();
            this.f38804x = placeholderDrawable;
            if (placeholderDrawable == null && baseRequestOptions.getPlaceholderId() > 0) {
                this.f38804x = d(baseRequestOptions.getPlaceholderId());
            }
        }
        return this.f38804x;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f38784c) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f38783b.throwIfRecycled();
                this.f38800t = LogTime.getLogTime();
                Object obj = this.f38789h;
                if (obj == null) {
                    if (Util.isValidDimensions(this.f38792k, this.f38793l)) {
                        this.f38806z = this.f38792k;
                        this.A = this.f38793l;
                    }
                    e(new GlideException("Received null model"), a() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f38802v;
                if (aVar == a.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    onResourceReady(this.f38798r, DataSource.MEMORY_CACHE, false);
                    return;
                }
                List<RequestListener<R>> list = this.f38795o;
                if (list != null) {
                    for (RequestListener<R> requestListener : list) {
                        if (requestListener instanceof ExperimentalRequestListener) {
                            ((ExperimentalRequestListener) requestListener).onRequestStarted(obj);
                        }
                    }
                }
                this.f38782a = GlideTrace.beginSectionAsync("GlideRequest");
                a aVar2 = a.WAITING_FOR_SIZE;
                this.f38802v = aVar2;
                if (Util.isValidDimensions(this.f38792k, this.f38793l)) {
                    onSizeReady(this.f38792k, this.f38793l);
                } else {
                    this.f38794n.getSize(this);
                }
                a aVar3 = this.f38802v;
                if ((aVar3 == a.RUNNING || aVar3 == aVar2) && ((requestCoordinator = this.f38786e) == null || requestCoordinator.canNotifyStatusChanged(this))) {
                    this.f38794n.onLoadStarted(b());
                }
                if (D) {
                    LogTime.getElapsedMillis(this.f38800t);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("requestLock")
    public final boolean c() {
        RequestCoordinator requestCoordinator = this.f38786e;
        return requestCoordinator == null || !requestCoordinator.getRoot().isAnyResourceSet();
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.f38784c) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f38783b.throwIfRecycled();
                a aVar = this.f38802v;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f38783b.throwIfRecycled();
                this.f38794n.removeCallback(this);
                Engine.LoadStatus loadStatus = this.f38799s;
                Resource<R> resource = null;
                if (loadStatus != null) {
                    loadStatus.cancel();
                    this.f38799s = null;
                }
                Resource<R> resource2 = this.f38798r;
                if (resource2 != null) {
                    this.f38798r = null;
                    resource = resource2;
                }
                RequestCoordinator requestCoordinator = this.f38786e;
                if (requestCoordinator == null || requestCoordinator.canNotifyCleared(this)) {
                    this.f38794n.onLoadCleared(b());
                }
                GlideTrace.endSectionAsync("GlideRequest", this.f38782a);
                this.f38802v = aVar2;
                if (resource != null) {
                    this.f38801u.release(resource);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("requestLock")
    public final Drawable d(@DrawableRes int i10) {
        BaseRequestOptions<?> baseRequestOptions = this.f38791j;
        Resources.Theme theme = baseRequestOptions.getTheme();
        Context context = this.f38787f;
        return DrawableDecoderCompat.getDrawable(context, i10, theme != null ? baseRequestOptions.getTheme() : context.getTheme());
    }

    public final void e(GlideException glideException, int i10) {
        boolean zOnLoadFailed;
        this.f38783b.throwIfRecycled();
        synchronized (this.f38784c) {
            try {
                glideException.setOrigin(this.C);
                int logLevel = this.f38788g.getLogLevel();
                if (logLevel <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f38789h + "] with dimensions [" + this.f38806z + "x" + this.A + Constant.BRACKET_CLOSE, glideException);
                    if (logLevel <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f38799s = null;
                this.f38802v = a.FAILED;
                RequestCoordinator requestCoordinator = this.f38786e;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestFailed(this);
                }
                boolean z10 = true;
                this.B = true;
                try {
                    List<RequestListener<R>> list = this.f38795o;
                    if (list != null) {
                        Iterator<RequestListener<R>> it = list.iterator();
                        zOnLoadFailed = false;
                        while (it.hasNext()) {
                            zOnLoadFailed |= it.next().onLoadFailed(glideException, this.f38789h, this.f38794n, c());
                        }
                    } else {
                        zOnLoadFailed = false;
                    }
                    RequestListener<R> requestListener = this.f38785d;
                    if (requestListener == null || !requestListener.onLoadFailed(glideException, this.f38789h, this.f38794n, c())) {
                        z10 = false;
                    }
                    if (!(zOnLoadFailed | z10)) {
                        g();
                    }
                    this.B = false;
                    GlideTrace.endSectionAsync("GlideRequest", this.f38782a);
                } catch (Throwable th2) {
                    this.B = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @GuardedBy("requestLock")
    public final void f(Resource<R> resource, R r3, DataSource dataSource, boolean z10) {
        boolean zOnResourceReady;
        boolean zC = c();
        this.f38802v = a.COMPLETE;
        this.f38798r = resource;
        if (this.f38788g.getLogLevel() <= 3) {
            Objects.toString(dataSource);
            Objects.toString(this.f38789h);
            LogTime.getElapsedMillis(this.f38800t);
        }
        RequestCoordinator requestCoordinator = this.f38786e;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestSuccess(this);
        }
        boolean z11 = true;
        this.B = true;
        try {
            List<RequestListener<R>> list = this.f38795o;
            if (list != null) {
                zOnResourceReady = false;
                for (RequestListener<R> requestListener : list) {
                    boolean zOnResourceReady2 = zOnResourceReady | requestListener.onResourceReady(r3, this.f38789h, this.f38794n, dataSource, zC);
                    zOnResourceReady = requestListener instanceof ExperimentalRequestListener ? ((ExperimentalRequestListener) requestListener).onResourceReady(r3, this.f38789h, this.f38794n, dataSource, zC, z10) | zOnResourceReady2 : zOnResourceReady2;
                }
            } else {
                zOnResourceReady = false;
            }
            RequestListener<R> requestListener2 = this.f38785d;
            if (requestListener2 == null || !requestListener2.onResourceReady(r3, this.f38789h, this.f38794n, dataSource, zC)) {
                z11 = false;
            }
            if (!(zOnResourceReady | z11)) {
                this.f38794n.onResourceReady(r3, this.f38796p.build(dataSource, zC));
            }
            this.B = false;
            GlideTrace.endSectionAsync("GlideRequest", this.f38782a);
        } catch (Throwable th2) {
            this.B = false;
            throw th2;
        }
    }

    @GuardedBy("requestLock")
    public final void g() {
        RequestCoordinator requestCoordinator = this.f38786e;
        if (requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this)) {
            Drawable drawableA = this.f38789h == null ? a() : null;
            if (drawableA == null) {
                if (this.f38803w == null) {
                    BaseRequestOptions<?> baseRequestOptions = this.f38791j;
                    Drawable errorPlaceholder = baseRequestOptions.getErrorPlaceholder();
                    this.f38803w = errorPlaceholder;
                    if (errorPlaceholder == null && baseRequestOptions.getErrorId() > 0) {
                        this.f38803w = d(baseRequestOptions.getErrorId());
                    }
                }
                drawableA = this.f38803w;
            }
            if (drawableA == null) {
                drawableA = b();
            }
            this.f38794n.onLoadFailed(drawableA);
        }
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public Object getLock() {
        this.f38783b.throwIfRecycled();
        return this.f38784c;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.f38784c) {
            z10 = this.f38802v == a.COMPLETE;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f38784c) {
            z10 = this.f38802v == a.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f38784c) {
            z10 = this.f38802v == a.COMPLETE;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        BaseRequestOptions<?> baseRequestOptions;
        Priority priority;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        BaseRequestOptions<?> baseRequestOptions2;
        Priority priority2;
        int size2;
        if (!(request instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f38784c) {
            try {
                i10 = this.f38792k;
                i11 = this.f38793l;
                obj = this.f38789h;
                cls = this.f38790i;
                baseRequestOptions = this.f38791j;
                priority = this.m;
                List<RequestListener<R>> list = this.f38795o;
                size = list != null ? list.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        SingleRequest singleRequest = (SingleRequest) request;
        synchronized (singleRequest.f38784c) {
            try {
                i12 = singleRequest.f38792k;
                i13 = singleRequest.f38793l;
                obj2 = singleRequest.f38789h;
                cls2 = singleRequest.f38790i;
                baseRequestOptions2 = singleRequest.f38791j;
                priority2 = singleRequest.m;
                List<RequestListener<R>> list2 = singleRequest.f38795o;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i10 == i12 && i11 == i13 && Util.bothModelsNullEquivalentOrEquals(obj, obj2) && cls.equals(cls2) && Util.bothBaseRequestOptionsNullEquivalentOrEquals(baseRequestOptions, baseRequestOptions2) && priority == priority2 && size == size2;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f38784c) {
            try {
                a aVar = this.f38802v;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onLoadFailed(GlideException glideException) {
        e(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.ResourceCallback
    public void onResourceReady(Resource<?> resource, DataSource dataSource, boolean z10) {
        this.f38783b.throwIfRecycled();
        Resource<?> resource2 = null;
        try {
            synchronized (this.f38784c) {
                try {
                    this.f38799s = null;
                    if (resource == null) {
                        onLoadFailed(new GlideException("Expected to receive a Resource<R> with an object of " + this.f38790i + " inside, but instead got null."));
                        return;
                    }
                    Object obj = resource.get();
                    try {
                        if (obj != null && this.f38790i.isAssignableFrom(obj.getClass())) {
                            RequestCoordinator requestCoordinator = this.f38786e;
                            if (requestCoordinator == null || requestCoordinator.canSetImage(this)) {
                                f(resource, obj, dataSource, z10);
                                return;
                            }
                            this.f38798r = null;
                            this.f38802v = a.COMPLETE;
                            GlideTrace.endSectionAsync("GlideRequest", this.f38782a);
                            this.f38801u.release(resource);
                            return;
                        }
                        this.f38798r = null;
                        StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                        sb2.append(this.f38790i);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(resource);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        onLoadFailed(new GlideException(sb2.toString()));
                        this.f38801u.release(resource);
                    } catch (Throwable th2) {
                        resource2 = resource;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (resource2 != null) {
                this.f38801u.release(resource2);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i10, int i11) throws Throwable {
        Object obj;
        int iRound = i10;
        this.f38783b.throwIfRecycled();
        Object obj2 = this.f38784c;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = D;
                    if (z10) {
                        LogTime.getElapsedMillis(this.f38800t);
                    }
                    if (this.f38802v == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f38802v = aVar;
                        float sizeMultiplier = this.f38791j.getSizeMultiplier();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * sizeMultiplier);
                        }
                        this.f38806z = iRound;
                        this.A = i11 == Integer.MIN_VALUE ? i11 : Math.round(sizeMultiplier * i11);
                        if (z10) {
                            LogTime.getElapsedMillis(this.f38800t);
                        }
                        Engine engine = this.f38801u;
                        GlideContext glideContext = this.f38788g;
                        Object obj3 = this.f38789h;
                        Key signature = this.f38791j.getSignature();
                        int i12 = this.f38806z;
                        int i13 = this.A;
                        Class<?> resourceClass = this.f38791j.getResourceClass();
                        Class<R> cls = this.f38790i;
                        Priority priority = this.m;
                        DiskCacheStrategy diskCacheStrategy = this.f38791j.getDiskCacheStrategy();
                        Map<Class<?>, Transformation<?>> transformations = this.f38791j.getTransformations();
                        boolean zIsTransformationRequired = this.f38791j.isTransformationRequired();
                        BaseRequestOptions<?> baseRequestOptions = this.f38791j;
                        obj = obj2;
                        try {
                            this.f38799s = engine.load(glideContext, obj3, signature, i12, i13, resourceClass, cls, priority, diskCacheStrategy, transformations, zIsTransformationRequired, baseRequestOptions.S0, baseRequestOptions.getOptions(), this.f38791j.isMemoryCacheable(), this.f38791j.getUseUnlimitedSourceGeneratorsPool(), this.f38791j.getUseAnimationPool(), this.f38791j.getOnlyRetrieveFromCache(), this, this.f38797q);
                            if (this.f38802v != aVar) {
                                this.f38799s = null;
                            }
                            if (z10) {
                                LogTime.getElapsedMillis(this.f38800t);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.f38784c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f38784c) {
            obj = this.f38789h;
            cls = this.f38790i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + Constant.BRACKET_CLOSE;
    }
}
