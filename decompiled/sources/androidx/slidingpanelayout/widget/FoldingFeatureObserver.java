package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import ek.a;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FoldingFeatureObserver.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;", "", "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "onFoldingFeatureChangeListener", "", "setOnFoldingFeatureChangeListener", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "registerLayoutStateChangeCallback", "unregisterLayoutStateChangeCallback", "Landroidx/window/layout/WindowInfoTracker;", "windowInfoTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroidx/window/layout/WindowInfoTracker;Ljava/util/concurrent/Executor;)V", "OnFoldingFeatureChangeListener", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0})
public final class FoldingFeatureObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WindowInfoTracker f23447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Executor f23448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Job f23449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public OnFoldingFeatureChangeListener f23450d;

    /* JADX INFO: compiled from: FoldingFeatureObserver.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "", "onFoldingFeatureChange", "", "foldingFeature", "Landroidx/window/layout/FoldingFeature;", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnFoldingFeatureChangeListener {
        void onFoldingFeatureChange(@NotNull FoldingFeature foldingFeature);
    }

    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1, reason: invalid class name */
    /* JADX INFO: compiled from: FoldingFeatureObserver.kt */
    @DebugMetadata(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f23451p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Activity f23453r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f23453r0 = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FoldingFeatureObserver.this.new AnonymousClass1(this.f23453r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i10 = this.f23451p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                final FoldingFeatureObserver foldingFeatureObserver = FoldingFeatureObserver.this;
                final Flow<WindowLayoutInfo> flowWindowLayoutInfo = foldingFeatureObserver.f23447a.windowLayoutInfo(this.f23453r0);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                    /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Collect.kt */
                    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$lambda-1$$inlined$collect$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 6, 0}, xi = 48)
                    public static final class AnonymousClass2 implements FlowCollector<WindowLayoutInfo> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f23457p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public final /* synthetic */ FoldingFeatureObserver f23458q0;

                        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", i = {}, l = {138}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: p0, reason: collision with root package name */
                            public /* synthetic */ Object f23459p0;

                            /* JADX INFO: renamed from: q0, reason: collision with root package name */
                            public int f23460q0;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.f23459p0 = obj;
                                this.f23460q0 |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, FoldingFeatureObserver foldingFeatureObserver) {
                            this.f23457p0 = flowCollector;
                            this.f23458q0 = foldingFeatureObserver;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(WindowLayoutInfo windowLayoutInfo, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i10 = anonymousClass1.f23460q0;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f23460q0 = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj = anonymousClass1.f23459p0;
                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                            int i11 = anonymousClass1.f23460q0;
                            if (i11 == 0) {
                                ResultKt.throwOnFailure(obj);
                                FoldingFeature foldingFeatureAccess$getFoldingFeature = FoldingFeatureObserver.access$getFoldingFeature(this.f23458q0, windowLayoutInfo);
                                if (foldingFeatureAccess$getFoldingFeature != null) {
                                    anonymousClass1.f23460q0 = 1;
                                    if (this.f23457p0.emit(foldingFeatureAccess$getFoldingFeature, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super FoldingFeature> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flowWindowLayoutInfo.collect(new AnonymousClass2(flowCollector, foldingFeatureObserver), continuation);
                        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                FlowCollector<FoldingFeature> flowCollector = new FlowCollector<FoldingFeature>() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(FoldingFeature foldingFeature, @NotNull Continuation<? super Unit> continuation) {
                        Unit unit;
                        FoldingFeature foldingFeature2 = foldingFeature;
                        FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener = foldingFeatureObserver.f23450d;
                        if (onFoldingFeatureChangeListener == null) {
                            unit = null;
                        } else {
                            onFoldingFeatureChangeListener.onFoldingFeatureChange(foldingFeature2);
                            unit = Unit.INSTANCE;
                        }
                        return unit == a.getCOROUTINE_SUSPENDED() ? unit : Unit.INSTANCE;
                    }
                };
                this.f23451p0 = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    public FoldingFeatureObserver(@NotNull WindowInfoTracker windowInfoTracker, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(windowInfoTracker, "windowInfoTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f23447a = windowInfoTracker;
        this.f23448b = executor;
    }

    public static final FoldingFeature access$getFoldingFeature(FoldingFeatureObserver foldingFeatureObserver, WindowLayoutInfo windowLayoutInfo) {
        Object next;
        foldingFeatureObserver.getClass();
        Iterator<T> it = windowLayoutInfo.getDisplayFeatures().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((DisplayFeature) next) instanceof FoldingFeature));
        if (next instanceof FoldingFeature) {
            return (FoldingFeature) next;
        }
        return null;
    }

    public final void registerLayoutStateChangeCallback(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Job job = this.f23449c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f23449c = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(this.f23448b)), null, null, new AnonymousClass1(activity, null), 3, null);
    }

    public final void setOnFoldingFeatureChangeListener(@NotNull OnFoldingFeatureChangeListener onFoldingFeatureChangeListener) {
        Intrinsics.checkNotNullParameter(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.f23450d = onFoldingFeatureChangeListener;
    }

    public final void unregisterLayoutStateChangeCallback() {
        Job job = this.f23449c;
        if (job == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }
}
