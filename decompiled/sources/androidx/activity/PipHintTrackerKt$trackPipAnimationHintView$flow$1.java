package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements Function2<ProducerScope<? super Rect>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f356p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f357q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    final /* synthetic */ View f358r0;

    /* JADX INFO: compiled from: PipHintTracker.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        final /* synthetic */ View f359p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f360q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        final /* synthetic */ View.OnLayoutChangeListener f361r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        final /* synthetic */ PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 f362s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, t tVar, s sVar, PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1) {
            super(0);
            this.f359p0 = view;
            this.f360q0 = tVar;
            this.f361r0 = sVar;
            this.f362s0 = pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f359p0.getViewTreeObserver().removeOnScrollChangedListener(this.f360q0);
            this.f359p0.removeOnLayoutChangeListener(this.f361r0);
            this.f359p0.removeOnAttachStateChangeListener(this.f362s0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, Continuation<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> continuation) {
        super(2, continuation);
        this.f358r0 = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.f358r0, continuation);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.f357q0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Rect> producerScope, Continuation<? super Unit> continuation) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnLayoutChangeListener, androidx.activity.s] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewTreeObserver$OnScrollChangedListener, androidx.activity.t] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View$OnAttachStateChangeListener, androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f356p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.f357q0;
            final ?? r1 = new View.OnLayoutChangeListener() { // from class: androidx.activity.s
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    if (i11 == i15 && i13 == i17 && i12 == i16 && i14 == i18) {
                        return;
                    }
                    producerScope.mo5953trySendJP2dKIU(PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(view));
                }
            };
            final View view = this.f358r0;
            final ?? r4 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.t
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    producerScope.mo5953trySendJP2dKIU(PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(view));
                }
            };
            ?? r10 = new View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View v3) {
                    producerScope.mo5953trySendJP2dKIU(PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(view));
                    view.getViewTreeObserver().addOnScrollChangedListener(r4);
                    view.addOnLayoutChangeListener(r1);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View v3) {
                    v3.getViewTreeObserver().removeOnScrollChangedListener(r4);
                    v3.removeOnLayoutChangeListener(r1);
                }
            };
            if (Api19Impl.INSTANCE.isAttachedToWindow(view)) {
                producerScope.mo5953trySendJP2dKIU(PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(this.f358r0));
                this.f358r0.getViewTreeObserver().addOnScrollChangedListener(r4);
                this.f358r0.addOnLayoutChangeListener(r1);
            }
            this.f358r0.addOnAttachStateChangeListener(r10);
            a aVar = new a(this.f358r0, r4, r1, r10);
            this.f356p0 = 1;
            if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
