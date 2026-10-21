package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.PreloadTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.signature.AndroidResourceSignature;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
public class RequestBuilder<TranscodeType> extends BaseRequestOptions<RequestBuilder<TranscodeType>> {
    protected static final RequestOptions DOWNLOAD_ONLY_OPTIONS = new RequestOptions().diskCacheStrategy(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);
    public final Context U0;
    public final RequestManager V0;
    public final Class<TranscodeType> W0;
    public final Glide X0;
    public final GlideContext Y0;

    @NonNull
    public TransitionOptions<?, ? super TranscodeType> Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @Nullable
    public Object f38039a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @Nullable
    public ArrayList f38040b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @Nullable
    public RequestBuilder<TranscodeType> f38041c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @Nullable
    public RequestBuilder<TranscodeType> f38042d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @Nullable
    public Float f38043e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f38044f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f38045g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f38046h1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38048b;

        static {
            int[] iArr = new int[Priority.values().length];
            f38048b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38048b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38048b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38048b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f38047a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38047a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38047a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38047a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38047a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38047a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f38047a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f38047a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public RequestBuilder(@NonNull Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        RequestOptions requestOptions;
        this.f38044f1 = true;
        this.X0 = glide;
        this.V0 = requestManager;
        this.W0 = cls;
        this.U0 = context;
        this.Z0 = requestManager.glide.f37979s0.getDefaultTransitionOptions(cls);
        this.Y0 = glide.f37979s0;
        Iterator<RequestListener<Object>> it = requestManager.v0.iterator();
        while (it.hasNext()) {
            addListener((RequestListener) it.next());
        }
        synchronized (requestManager) {
            requestOptions = requestManager.f38055w0;
        }
        apply((BaseRequestOptions<?>) requestOptions);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> addListener(@Nullable RequestListener<TranscodeType> requestListener) {
        if (isAutoCloneEnabled()) {
            return mo4900clone().addListener(requestListener);
        }
        if (requestListener != null) {
            if (this.f38040b1 == null) {
                this.f38040b1 = new ArrayList();
            }
            this.f38040b1.add(requestListener);
        }
        return selfOrThrowIfLocked();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ BaseRequestOptions apply(@NonNull BaseRequestOptions baseRequestOptions) {
        return apply((BaseRequestOptions<?>) baseRequestOptions);
    }

    @CheckResult
    @Deprecated
    public <Y extends Target<File>> Y downloadOnly(@NonNull Y y7) {
        return (Y) getDownloadOnlyRequest().into(y7);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(Object obj) {
        if (!(obj instanceof RequestBuilder)) {
            return false;
        }
        RequestBuilder requestBuilder = (RequestBuilder) obj;
        if (super.equals(requestBuilder)) {
            return Objects.equals(this.W0, requestBuilder.W0) && this.Z0.equals(requestBuilder.Z0) && Objects.equals(this.f38039a1, requestBuilder.f38039a1) && Objects.equals(this.f38040b1, requestBuilder.f38040b1) && Objects.equals(this.f38041c1, requestBuilder.f38041c1) && Objects.equals(this.f38042d1, requestBuilder.f38042d1) && Objects.equals(this.f38043e1, requestBuilder.f38043e1) && this.f38044f1 == requestBuilder.f38044f1 && this.f38045g1 == requestBuilder.f38045g1;
        }
        return false;
    }

    @NonNull
    public RequestBuilder<TranscodeType> error(@Nullable RequestBuilder<TranscodeType> requestBuilder) {
        if (isAutoCloneEnabled()) {
            return mo4900clone().error((RequestBuilder) requestBuilder);
        }
        this.f38042d1 = requestBuilder;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> getDownloadOnlyRequest() {
        return new RequestBuilder(File.class, this).apply((BaseRequestOptions<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Request h(int i10, int i11, Priority priority, TransitionOptions transitionOptions, BaseRequestOptions baseRequestOptions, @Nullable RequestCoordinator requestCoordinator, @Nullable RequestFutureTarget requestFutureTarget, Target target, Object obj, Executor executor) {
        ErrorRequestCoordinator errorRequestCoordinator;
        RequestCoordinator errorRequestCoordinator2;
        Request requestL;
        if (this.f38042d1 != null) {
            errorRequestCoordinator2 = new ErrorRequestCoordinator(obj, requestCoordinator);
            errorRequestCoordinator = errorRequestCoordinator2;
        } else {
            errorRequestCoordinator = 0;
            errorRequestCoordinator2 = requestCoordinator;
        }
        RequestBuilder<TranscodeType> requestBuilder = this.f38041c1;
        if (requestBuilder != null) {
            if (this.f38046h1) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            TransitionOptions transitionOptions2 = requestBuilder.f38044f1 ? transitionOptions : requestBuilder.Z0;
            Priority priority2 = requestBuilder.isPrioritySet() ? this.f38041c1.getPriority() : i(priority);
            int overrideWidth = this.f38041c1.getOverrideWidth();
            int overrideHeight = this.f38041c1.getOverrideHeight();
            if (Util.isValidDimensions(i10, i11) && !this.f38041c1.isValidOverride()) {
                overrideWidth = baseRequestOptions.getOverrideWidth();
                overrideHeight = baseRequestOptions.getOverrideHeight();
            }
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = new ThumbnailRequestCoordinator(obj, errorRequestCoordinator2);
            ThumbnailRequestCoordinator thumbnailRequestCoordinator2 = thumbnailRequestCoordinator;
            SingleRequest singleRequestL = l(i10, i11, priority, transitionOptions, baseRequestOptions, thumbnailRequestCoordinator, requestFutureTarget, target, obj, executor);
            this.f38046h1 = true;
            RequestBuilder<TranscodeType> requestBuilder2 = this.f38041c1;
            Request requestH = requestBuilder2.h(overrideWidth, overrideHeight, priority2, transitionOptions2, requestBuilder2, thumbnailRequestCoordinator2, requestFutureTarget, target, obj, executor);
            this.f38046h1 = false;
            thumbnailRequestCoordinator2.setRequests(singleRequestL, requestH);
            requestL = thumbnailRequestCoordinator2;
        } else if (this.f38043e1 != null) {
            ThumbnailRequestCoordinator thumbnailRequestCoordinator3 = new ThumbnailRequestCoordinator(obj, errorRequestCoordinator2);
            thumbnailRequestCoordinator3.setRequests(l(i10, i11, priority, transitionOptions, baseRequestOptions, thumbnailRequestCoordinator3, requestFutureTarget, target, obj, executor), l(i10, i11, i(priority), transitionOptions, baseRequestOptions.mo4900clone().sizeMultiplier(this.f38043e1.floatValue()), thumbnailRequestCoordinator3, requestFutureTarget, target, obj, executor));
            requestL = thumbnailRequestCoordinator3;
        } else {
            requestL = l(i10, i11, priority, transitionOptions, baseRequestOptions, errorRequestCoordinator2, requestFutureTarget, target, obj, executor);
        }
        if (errorRequestCoordinator == 0) {
            return requestL;
        }
        int overrideWidth2 = this.f38042d1.getOverrideWidth();
        int overrideHeight2 = this.f38042d1.getOverrideHeight();
        if (Util.isValidDimensions(i10, i11) && !this.f38042d1.isValidOverride()) {
            overrideWidth2 = baseRequestOptions.getOverrideWidth();
            overrideHeight2 = baseRequestOptions.getOverrideHeight();
        }
        int i12 = overrideHeight2;
        int i13 = overrideWidth2;
        RequestBuilder<TranscodeType> requestBuilder3 = this.f38042d1;
        errorRequestCoordinator.setRequests(requestL, requestBuilder3.h(i13, i12, requestBuilder3.getPriority(), requestBuilder3.Z0, this.f38042d1, errorRequestCoordinator, requestFutureTarget, target, obj, executor));
        return errorRequestCoordinator;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
        return Util.hashCode(this.f38045g1, Util.hashCode(this.f38044f1, Util.hashCode(this.f38043e1, Util.hashCode(this.f38042d1, Util.hashCode(this.f38041c1, Util.hashCode(this.f38040b1, Util.hashCode(this.f38039a1, Util.hashCode(this.Z0, Util.hashCode(this.W0, super.hashCode())))))))));
    }

    @NonNull
    public final Priority i(@NonNull Priority priority) {
        int i10 = a.f38048b[priority.ordinal()];
        if (i10 == 1) {
            return Priority.NORMAL;
        }
        if (i10 == 2) {
            return Priority.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return Priority.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + getPriority());
    }

    @NonNull
    public <Y extends Target<TranscodeType>> Y into(@NonNull Y y7) {
        j(y7, null, this, Executors.mainThreadExecutor());
        return y7;
    }

    public final void j(@NonNull Target target, @Nullable RequestFutureTarget requestFutureTarget, BaseRequestOptions baseRequestOptions, Executor executor) {
        Preconditions.checkNotNull(target);
        if (!this.f38045g1) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        TransitionOptions<?, ? super TranscodeType> transitionOptions = this.Z0;
        Request requestH = h(baseRequestOptions.getOverrideWidth(), baseRequestOptions.getOverrideHeight(), baseRequestOptions.getPriority(), transitionOptions, baseRequestOptions, null, requestFutureTarget, target, obj, executor);
        Request request = target.getRequest();
        if (requestH.isEquivalentTo(request) && (baseRequestOptions.isMemoryCacheable() || !request.isComplete())) {
            if (((Request) Preconditions.checkNotNull(request)).isRunning()) {
                return;
            }
            request.begin();
        } else {
            this.V0.clear((Target<?>) target);
            target.setRequest(requestH);
            RequestManager requestManager = this.V0;
            synchronized (requestManager) {
                requestManager.f38052s0.track(target);
                requestManager.f38050q0.runRequest(requestH);
            }
        }
    }

    @NonNull
    public final RequestBuilder<TranscodeType> k(@Nullable Object obj) {
        if (isAutoCloneEnabled()) {
            return mo4900clone().k(obj);
        }
        this.f38039a1 = obj;
        this.f38045g1 = true;
        return selfOrThrowIfLocked();
    }

    public final SingleRequest l(int i10, int i11, Priority priority, TransitionOptions transitionOptions, BaseRequestOptions baseRequestOptions, RequestCoordinator requestCoordinator, RequestFutureTarget requestFutureTarget, Target target, Object obj, Executor executor) {
        Context context = this.U0;
        Object obj2 = this.f38039a1;
        Class<TranscodeType> cls = this.W0;
        ArrayList arrayList = this.f38040b1;
        GlideContext glideContext = this.Y0;
        return SingleRequest.obtain(context, glideContext, obj, obj2, cls, baseRequestOptions, i10, i11, priority, target, requestFutureTarget, arrayList, requestCoordinator, glideContext.getEngine(), transitionOptions.f38061p0, executor);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> listener(@Nullable RequestListener<TranscodeType> requestListener) {
        if (isAutoCloneEnabled()) {
            return mo4900clone().listener(requestListener);
        }
        this.f38040b1 = null;
        return addListener(requestListener);
    }

    @NonNull
    public Target<TranscodeType> preload(int i10, int i11) {
        return into(PreloadTarget.obtain(this.V0, i10, i11));
    }

    @NonNull
    public FutureTarget<TranscodeType> submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType> requestBuilder) {
        if (isAutoCloneEnabled()) {
            return mo4900clone().thumbnail(requestBuilder);
        }
        this.f38041c1 = requestBuilder;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> transition(@NonNull TransitionOptions<?, ? super TranscodeType> transitionOptions) {
        if (isAutoCloneEnabled()) {
            return mo4900clone().transition(transitionOptions);
        }
        this.Z0 = (TransitionOptions) Preconditions.checkNotNull(transitionOptions);
        this.f38044f1 = false;
        return selfOrThrowIfLocked();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> apply(@NonNull BaseRequestOptions<?> baseRequestOptions) {
        Preconditions.checkNotNull(baseRequestOptions);
        return (RequestBuilder) super.apply(baseRequestOptions);
    }

    @CheckResult
    @Deprecated
    public FutureTarget<File> downloadOnly(int i10, int i11) {
        return getDownloadOnlyRequest().submit(i10, i11);
    }

    @NonNull
    public FutureTarget<TranscodeType> submit(int i10, int i11) {
        RequestFutureTarget requestFutureTarget = new RequestFutureTarget(i10, i11);
        j(requestFutureTarget, requestFutureTarget, this, Executors.directExecutor());
        return requestFutureTarget;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    /* JADX INFO: renamed from: clone */
    public RequestBuilder<TranscodeType> mo4900clone() {
        RequestBuilder<TranscodeType> requestBuilder = (RequestBuilder) super.mo4900clone();
        requestBuilder.Z0 = requestBuilder.Z0.m5276clone();
        if (requestBuilder.f38040b1 != null) {
            requestBuilder.f38040b1 = new ArrayList(requestBuilder.f38040b1);
        }
        RequestBuilder<TranscodeType> requestBuilder2 = requestBuilder.f38041c1;
        if (requestBuilder2 != null) {
            requestBuilder.f38041c1 = requestBuilder2.mo4900clone();
        }
        RequestBuilder<TranscodeType> requestBuilder3 = requestBuilder.f38042d1;
        if (requestBuilder3 != null) {
            requestBuilder.f38042d1 = requestBuilder3.mo4900clone();
        }
        return requestBuilder;
    }

    @NonNull
    public ViewTarget<ImageView, TranscodeType> into(@NonNull ImageView imageView) {
        BaseRequestOptions baseRequestOptionsOptionalCenterCrop;
        Util.assertMainThread();
        Preconditions.checkNotNull(imageView);
        if (!isTransformationSet() && isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (a.f38047a[imageView.getScaleType().ordinal()]) {
                case 1:
                    baseRequestOptionsOptionalCenterCrop = mo4900clone().optionalCenterCrop();
                    break;
                case 2:
                    baseRequestOptionsOptionalCenterCrop = mo4900clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    baseRequestOptionsOptionalCenterCrop = mo4900clone().optionalFitCenter();
                    break;
                case 6:
                    baseRequestOptionsOptionalCenterCrop = mo4900clone().optionalCenterInside();
                    break;
                default:
                    baseRequestOptionsOptionalCenterCrop = this;
                    break;
            }
        } else {
            baseRequestOptionsOptionalCenterCrop = this;
        }
        ViewTarget<ImageView, TranscodeType> viewTargetBuildImageViewTarget = this.Y0.buildImageViewTarget(imageView, this.W0);
        j(viewTargetBuildImageViewTarget, null, baseRequestOptionsOptionalCenterCrop, Executors.mainThreadExecutor());
        return viewTargetBuildImageViewTarget;
    }

    @NonNull
    public Target<TranscodeType> preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> error(Object obj) {
        if (obj == null) {
            return error((RequestBuilder) null);
        }
        return error((RequestBuilder) mo4900clone().error((RequestBuilder) null).thumbnail((RequestBuilder) null).mo4906load(obj));
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType>... requestBuilderArr) {
        if (requestBuilderArr != null && requestBuilderArr.length != 0) {
            return thumbnail(Arrays.asList(requestBuilderArr));
        }
        return thumbnail((RequestBuilder) null);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> thumbnail(@Nullable List<RequestBuilder<TranscodeType>> list) {
        RequestBuilder<TranscodeType> requestBuilderThumbnail = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                RequestBuilder<TranscodeType> requestBuilder = list.get(size);
                if (requestBuilder != null) {
                    requestBuilderThumbnail = requestBuilderThumbnail == null ? requestBuilder : requestBuilder.thumbnail(requestBuilderThumbnail);
                }
            }
            return thumbnail(requestBuilderThumbnail);
        }
        return thumbnail((RequestBuilder) null);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo4906load(@Nullable Object obj) {
        return k(obj);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo4901load(@Nullable Bitmap bitmap) {
        return k(bitmap).apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo4902load(@Nullable Drawable drawable) {
        return k(drawable).apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo4907load(@Nullable String str) {
        return k(str);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo4903load(@Nullable Uri uri) {
        RequestBuilder<TranscodeType> requestBuilderK = k(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return requestBuilderK;
        }
        Context context = this.U0;
        return requestBuilderK.theme(context.getTheme()).signature(AndroidResourceSignature.obtain(context));
    }

    @NonNull
    @CheckResult
    @Deprecated
    public RequestBuilder<TranscodeType> thumbnail(float f6) {
        if (isAutoCloneEnabled()) {
            return mo4900clone().thumbnail(f6);
        }
        if (f6 >= 0.0f && f6 <= 1.0f) {
            this.f38043e1 = Float.valueOf(f6);
            return selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @Deprecated
    public FutureTarget<TranscodeType> into(int i10, int i11) {
        return submit(i10, i11);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo4904load(@Nullable File file) {
        return k(file);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo4905load(@Nullable @DrawableRes @RawRes Integer num) {
        RequestBuilder<TranscodeType> requestBuilderK = k(num);
        Context context = this.U0;
        return requestBuilderK.theme(context.getTheme()).signature(AndroidResourceSignature.obtain(context));
    }

    @SuppressLint({"CheckResult"})
    public RequestBuilder(Class<TranscodeType> cls, RequestBuilder<?> requestBuilder) {
        this(requestBuilder.X0, requestBuilder.V0, cls, requestBuilder.U0);
        this.f38039a1 = requestBuilder.f38039a1;
        this.f38045g1 = requestBuilder.f38045g1;
        apply((BaseRequestOptions<?>) requestBuilder);
    }

    @Override // 
    @CheckResult
    @Deprecated
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo4908load(@Nullable URL url) {
        return k(url);
    }

    @Override // 
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo4909load(@Nullable byte[] bArr) {
        RequestBuilder<TranscodeType> requestBuilderK = k(bArr);
        if (!requestBuilderK.isDiskCacheStrategySet()) {
            requestBuilderK = requestBuilderK.apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
        }
        return !requestBuilderK.isSkipMemoryCacheSet() ? requestBuilderK.apply((BaseRequestOptions<?>) RequestOptions.skipMemoryCacheOf(true)) : requestBuilderK;
    }
}
