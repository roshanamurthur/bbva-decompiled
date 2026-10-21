package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: com.google.android.play:review-ktx@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0006*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u00142\u0006\u0010\u0015\u001a\u0002H\u0013H\u0000¢\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"runTask", ExifInterface.GPS_DIRECTION_TRUE, "task", "Lcom/google/android/gms/tasks/Task;", "onCanceled", "Lkotlin/Function0;", "", "(Lcom/google/android/gms/tasks/Task;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchReview", "Lcom/google/android/play/core/review/ReviewManager;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "reviewInfo", "Lcom/google/android/play/core/review/ReviewInfo;", "(Lcom/google/android/play/core/review/ReviewManager;Landroid/app/Activity;Lcom/google/android/play/core/review/ReviewInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestReview", "(Lcom/google/android/play/core/review/ReviewManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryOffer", "", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_review_ktx"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ReviewManagerKtxKt {

    /* JADX INFO: compiled from: com.google.android.play:review-ktx@@2.0.1 */
    @DebugMetadata(c = "com.google.android.play.core.ktx.ReviewManagerKtxKt", f = "ReviewManagerKtx.kt", i = {}, l = {22}, m = "requestReview", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f46160p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f46161q0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46160p0 = obj;
            this.f46161q0 |= Integer.MIN_VALUE;
            return ReviewManagerKtxKt.requestReview(null, this);
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:review-ktx@@2.0.1 */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f46162p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:review-ktx@@2.0.1 */
    public static final class c extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46163p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0) {
            super(1);
            this.f46163p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            this.f46163p0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:review-ktx@@2.0.1 */
    public static final class d<TResult> implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<T> f46164a;

        public d(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f46164a = cancellableContinuationImpl;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(T t10) {
            this.f46164a.resumeWith(Result.m5535constructorimpl(t10));
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:review-ktx@@2.0.1 */
    public static final class e implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<T> f46165a;

        public e(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f46165a = cancellableContinuationImpl;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NotNull Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f46165a.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(exception)));
        }
    }

    @Nullable
    public static final Object launchReview(@NotNull ReviewManager reviewManager, @NotNull Activity activity, @NotNull ReviewInfo reviewInfo, @NotNull Continuation<? super Unit> continuation) {
        Task<Void> taskLaunchReviewFlow = reviewManager.launchReviewFlow(activity, reviewInfo);
        Intrinsics.checkNotNullExpressionValue(taskLaunchReviewFlow, "launchReviewFlow(activity, reviewInfo)");
        Object objRunTask$default = runTask$default(taskLaunchReviewFlow, null, continuation, 2, null);
        return objRunTask$default == ek.a.getCOROUTINE_SUSPENDED() ? objRunTask$default : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object requestReview(@NotNull ReviewManager reviewManager, @NotNull Continuation<? super ReviewInfo> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f46161q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f46161q0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objRunTask$default = aVar.f46160p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f46161q0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objRunTask$default);
            Task<ReviewInfo> taskRequestReviewFlow = reviewManager.requestReviewFlow();
            Intrinsics.checkNotNullExpressionValue(taskRequestReviewFlow, "requestReviewFlow()");
            aVar.f46161q0 = 1;
            objRunTask$default = runTask$default(taskRequestReviewFlow, null, aVar, 2, null);
            if (objRunTask$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRunTask$default);
        }
        Intrinsics.checkNotNullExpressionValue(objRunTask$default, "runTask(requestReviewFlow())");
        return objRunTask$default;
    }

    @Nullable
    public static final <T> Object runTask(@NotNull Task<T> task, @NotNull Function0<Unit> function0, @NotNull Continuation<? super T> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new c(function0));
        if (!task.isComplete()) {
            task.addOnSuccessListener(new d(cancellableContinuationImpl));
            task.addOnFailureListener(new e(cancellableContinuationImpl));
        } else if (task.isSuccessful()) {
            cancellableContinuationImpl.resumeWith(Result.m5535constructorimpl(task.getResult()));
        } else {
            Exception exception = task.getException();
            Intrinsics.checkNotNull(exception);
            cancellableContinuationImpl.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(exception)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ Object runTask$default(Task task, Function0 function0, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = b.f46162p0;
        }
        return runTask(task, function0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(@NotNull SendChannel<? super E> sendChannel, E e5) {
        Intrinsics.checkNotNullParameter(sendChannel, "<this>");
        return ChannelResult.m5973isSuccessimpl(sendChannel.mo5953trySendJP2dKIU(e5));
    }
}
