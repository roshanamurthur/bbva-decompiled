package com.bbva.rateapp;

import android.app.Activity;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InAppReview.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007R\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/bbva/rateapp/InAppReview;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "showInAppReview", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/rateapp/InAppReviewCallback;", "callback", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/google/android/play/core/review/ReviewManager;", "reviewManager", "<init>", "(Lcom/google/android/play/core/review/ReviewManager;)V", "rateapp_release"}, k = 1, mv = {1, 7, 1})
public final class InAppReview implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ReviewManager f36355p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f36356q0;

    /* JADX INFO: compiled from: InAppReview.kt */
    public static final class a implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f36357a;

        public a(b function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f36357a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f36357a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: InAppReview.kt */
    public static final class b extends Lambda implements Function1<ReviewInfo, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Activity f36359q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Result<Unit>> f36360r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, SafeContinuation safeContinuation) {
            super(1);
            this.f36359q0 = activity;
            this.f36360r0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ReviewInfo reviewInfo) {
            InAppReview.this.f36355p0.launchReviewFlow(this.f36359q0, reviewInfo).addOnCompleteListener(new com.bbva.rateapp.a(this.f36360r0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: InAppReview.kt */
    @DebugMetadata(c = "com.bbva.rateapp.InAppReview$showInAppReview$3", f = "InAppReview.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f36361p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Activity f36363r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ InAppReviewCallback f36364s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, InAppReviewCallback inAppReviewCallback, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f36363r0 = activity;
            this.f36364s0 = inAppReviewCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InAppReview.this.new c(this.f36363r0, this.f36364s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f36361p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f36361p0 = 1;
                obj = InAppReview.this.showInAppReview(this.f36363r0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result result = (Result) obj;
            boolean z10 = result instanceof Result.Success;
            InAppReviewCallback inAppReviewCallback = this.f36364s0;
            if (z10) {
                if (inAppReviewCallback != null) {
                    inAppReviewCallback.onInAppReviewSuccess();
                }
            } else if ((result instanceof Result.Error) && inAppReviewCallback != null) {
                inAppReviewCallback.onInAppReviewError(((Result.Error) result).getException());
            }
            return Unit.INSTANCE;
        }
    }

    public InAppReview(@NotNull ReviewManager reviewManager) {
        Intrinsics.checkNotNullParameter(reviewManager, "reviewManager");
        this.f36355p0 = reviewManager;
        this.f36356q0 = CoroutineScopeKt.MainScope();
    }

    public static /* synthetic */ void showInAppReview$default(InAppReview inAppReview, Activity activity, InAppReviewCallback inAppReviewCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            inAppReviewCallback = null;
        }
        inAppReview.showInAppReview(activity, inAppReviewCallback);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f36356q0.getCoroutineContext();
    }

    @JvmOverloads
    public final void showInAppReview(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        showInAppReview$default(this, activity, null, 2, null);
    }

    @Nullable
    public final Object showInAppReview(@NotNull Activity activity, @NotNull Continuation<? super Result<Unit>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        this.f36355p0.requestReviewFlow().addOnSuccessListener(new a(new b(activity, safeContinuation)));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @JvmOverloads
    public final void showInAppReview(@NotNull Activity activity, @Nullable InAppReviewCallback callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(activity, callback, null), 3, null);
    }
}
