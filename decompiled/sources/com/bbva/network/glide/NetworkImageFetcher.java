package com.bbva.network.glide;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkImageFetcher.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/network/glide/NetworkImageFetcher;", "", "Landroid/content/Context;", "context", "", "url", "Lcom/bbva/network/glide/NetworkImageCache;", "cacheOptions", "Landroid/graphics/Bitmap;", FetchCommand.ID, "(Landroid/content/Context;Ljava/lang/String;Lcom/bbva/network/glide/NetworkImageCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "network-image_release"}, k = 1, mv = {1, 8, 0})
public final class NetworkImageFetcher {

    @NotNull
    public static final NetworkImageFetcher INSTANCE = new NetworkImageFetcher();

    /* JADX INFO: compiled from: NetworkImageFetcher.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCacheStrategy.values().length];
            try {
                iArr[ImageCacheStrategy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCacheStrategy.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageCacheStrategy.DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageCacheStrategy.RESOURCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageCacheStrategy.AUTOMATIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: NetworkImageFetcher.kt */
    @DebugMetadata(c = "com.bbva.network.glide.NetworkImageFetcher", f = "NetworkImageFetcher.kt", i = {0, 0, 0, 0}, l = {19, 20}, m = FetchCommand.ID, n = {"this", "context", "url", "cacheOptions"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public NetworkImageFetcher f35079p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Context f35080q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f35081r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public NetworkImageCache f35082s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f35083t0;
        public int v0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35083t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return NetworkImageFetcher.this.fetch(null, null, null, this);
        }
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        return a(baseContext);
    }

    public static final /* synthetic */ Object access$safeFetch(NetworkImageFetcher networkImageFetcher, Context context, String str, NetworkImageCache networkImageCache, Continuation continuation) {
        networkImageFetcher.getClass();
        return b(context, str, networkImageCache, continuation);
    }

    public static Object b(Context context, String str, NetworkImageCache networkImageCache, Continuation continuation) {
        DiskCacheStrategy diskCacheStrategy;
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        RequestBuilder<Bitmap> requestBuilderMo4907load = Glide.with(context).asBitmap().mo4907load(str);
        NetworkImageFetcher networkImageFetcher = INSTANCE;
        ImageCacheStrategy strategy = networkImageCache.getStrategy();
        networkImageFetcher.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        if (i10 == 1) {
            diskCacheStrategy = DiskCacheStrategy.ALL;
        } else if (i10 == 2) {
            diskCacheStrategy = DiskCacheStrategy.NONE;
        } else if (i10 == 3) {
            diskCacheStrategy = DiskCacheStrategy.DATA;
        } else if (i10 == 4) {
            diskCacheStrategy = DiskCacheStrategy.RESOURCE;
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            diskCacheStrategy = DiskCacheStrategy.AUTOMATIC;
        }
        requestBuilderMo4907load.diskCacheStrategy(diskCacheStrategy).skipMemoryCache(networkImageCache.getSkipMemoryCache()).onlyRetrieveFromCache(networkImageCache.getOnlyRetrieveFromCache()).into(new CustomTarget<Bitmap>() { // from class: com.bbva.network.glide.NetworkImageFetcher$safeFetch$2$1
            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(@Nullable Drawable placeholder) {
                safeContinuation.resumeWith(Result.m5535constructorimpl(null));
            }

            @Override // com.bumptech.glide.request.target.Target
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
            }

            public void onResourceReady(@NotNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                safeContinuation.resumeWith(Result.m5535constructorimpl(resource));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static /* synthetic */ Object fetch$default(NetworkImageFetcher networkImageFetcher, Context context, String str, NetworkImageCache networkImageCache, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            networkImageCache = new NetworkImageCache(null, false, false, 7, null);
        }
        return networkImageFetcher.fetch(context, str, networkImageCache, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[PHI: r10
      0x0085: PHI (r10v11 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:31:0x0082, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object fetch(@NotNull Context context, @NotNull String str, @NotNull NetworkImageCache networkImageCache, @NotNull Continuation<? super Bitmap> continuation) {
        a aVar;
        NetworkImageFetcher networkImageFetcher;
        Bitmap bitmap;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.v0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.v0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objB = aVar.f35083t0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.v0;
        if (i11 != 0) {
            if (i11 == 1) {
                networkImageCache = aVar.f35082s0;
                str = aVar.f35081r0;
                context = aVar.f35080q0;
                networkImageFetcher = aVar.f35079p0;
                ResultKt.throwOnFailure(objB);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objB);
            }
            return objB;
        }
        ResultKt.throwOnFailure(objB);
        Activity activityA = a(context);
        if (activityA != null) {
            if (activityA.isDestroyed()) {
                networkImageFetcher = this;
                bitmap = null;
            } else {
                NetworkImageFetcher networkImageFetcher2 = INSTANCE;
                aVar.f35079p0 = this;
                aVar.f35080q0 = context;
                aVar.f35081r0 = str;
                aVar.f35082s0 = networkImageCache;
                aVar.v0 = 1;
                networkImageFetcher2.getClass();
                objB = b(context, str, networkImageCache, aVar);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                networkImageFetcher = this;
            }
            if (bitmap != null) {
                return bitmap;
            }
        } else {
            networkImageFetcher = this;
        }
        aVar.f35079p0 = null;
        aVar.f35080q0 = null;
        aVar.f35081r0 = null;
        aVar.f35082s0 = null;
        aVar.v0 = 2;
        networkImageFetcher.getClass();
        objB = b(context, str, networkImageCache, aVar);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objB;
        bitmap = (Bitmap) objB;
        if (bitmap != null) {
            return bitmap;
        }
        aVar.f35079p0 = null;
        aVar.f35080q0 = null;
        aVar.f35081r0 = null;
        aVar.f35082s0 = null;
        aVar.v0 = 2;
        networkImageFetcher.getClass();
        objB = b(context, str, networkImageCache, aVar);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objB;
    }
}
