package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.R;
import androidx.core.os.HandlerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\"\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\",\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\"\u001e\u0010\u0013\u001a\u00020\u0007*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroid/view/View;", "Landroidx/compose/runtime/CompositionContext;", "findViewTreeCompositionContext", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/compose/runtime/Recomposer;", "createLifecycleAwareWindowRecomposer", "value", "getCompositionContext", "(Landroid/view/View;)Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroid/view/View;Landroidx/compose/runtime/CompositionContext;)V", "compositionContext", "getWindowRecomposer", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n34#2:443\n361#3,7:444\n1#4:451\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n98#1:443\n99#1:444,7\n*E\n"})
public final class WindowRecomposer_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f17355a = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final StateFlow access$getAnimationScaleFlowFor(Context context) {
        StateFlow stateFlow;
        LinkedHashMap linkedHashMap = f17355a;
        synchronized (linkedHashMap) {
            try {
                Object objStateIn = linkedHashMap.get(context);
                if (objStateIn == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    final Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                    final Handler handlerCreateAsync = HandlerCompat.createAsync(Looper.getMainLooper());
                    objStateIn = FlowKt.stateIn(FlowKt.flow(new n1(contentResolver, uriFor, new ContentObserver(handlerCreateAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                        @Override // android.database.ContentObserver
                        public void onChange(boolean selfChange, @Nullable Uri uri) {
                            channelChannel$default.mo5953trySendJP2dKIU(Unit.INSTANCE);
                        }
                    }, channelChannel$default, context, null)), CoroutineScopeKt.MainScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objStateIn);
                }
                stateFlow = (StateFlow) objStateIn;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return stateFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.compose.ui.platform.q0] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.coroutines.CoroutineContext] */
    @ExperimentalComposeUiApi
    @NotNull
    public static final Recomposer createLifecycleAwareWindowRecomposer(@NotNull final View view, @NotNull CoroutineContext coroutineContext, @Nullable Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        CoroutineContext coroutineContext2;
        ?? q0Var;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (coroutineContext.get(ContinuationInterceptor.INSTANCE) == null || coroutineContext.get(MonotonicFrameClock.INSTANCE) == null) {
            coroutineContext = AndroidUiDispatcher.INSTANCE.getCurrentThread().plus(coroutineContext);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContext.get(MonotonicFrameClock.INSTANCE);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.pause();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(MotionDurationScale.INSTANCE);
        ?? r1 = motionDurationScale;
        if (motionDurationScale == null) {
            q0Var = new q0();
            objectRef.element = q0Var;
        }
        if (pausableMonotonicFrameClock != null) {
            r1 = q0Var;
            coroutineContext2 = pausableMonotonicFrameClock;
        } else {
            r1 = q0Var;
            coroutineContext2 = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2).plus(r1);
        final Recomposer recomposer = new Recomposer(coroutineContextPlus);
        recomposer.pauseCompositionFrameClock();
        final CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineContextPlus);
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View v3) {
                    Intrinsics.checkNotNullParameter(v3, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View v3) {
                    Intrinsics.checkNotNullParameter(v3, "v");
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.cancel();
                }
            });
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer.2

                /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$WhenMappings */
                /* JADX INFO: compiled from: WindowRecomposer.android.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$a */
                /* JADX INFO: compiled from: WindowRecomposer.android.kt */
                @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {394}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
                public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public int f17363p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public /* synthetic */ Object f17364q0;

                    /* JADX INFO: renamed from: r0, reason: collision with root package name */
                    public final /* synthetic */ Ref.ObjectRef<q0> f17365r0;

                    /* JADX INFO: renamed from: s0, reason: collision with root package name */
                    public final /* synthetic */ Recomposer f17366s0;

                    /* JADX INFO: renamed from: t0, reason: collision with root package name */
                    public final /* synthetic */ LifecycleOwner f17367t0;

                    /* JADX INFO: renamed from: u0, reason: collision with root package name */
                    public final /* synthetic */ AnonymousClass2 f17368u0;
                    public final /* synthetic */ View v0;

                    /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$a$a, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
                    @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C0065a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public int f17369p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public final /* synthetic */ StateFlow<Float> f17370q0;

                        /* JADX INFO: renamed from: r0, reason: collision with root package name */
                        public final /* synthetic */ q0 f17371r0;

                        /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$a$a$a, reason: collision with other inner class name */
                        /* JADX INFO: compiled from: WindowRecomposer.android.kt */
                        public static final class C0066a implements FlowCollector<Float> {

                            /* JADX INFO: renamed from: p0, reason: collision with root package name */
                            public final /* synthetic */ q0 f17372p0;

                            public C0066a(q0 q0Var) {
                                this.f17372p0 = q0Var;
                            }

                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Float f6, Continuation continuation) {
                                this.f17372p0.f17435p0.setFloatValue(f6.floatValue());
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0065a(StateFlow<Float> stateFlow, q0 q0Var, Continuation<? super C0065a> continuation) {
                            super(2, continuation);
                            this.f17370q0 = stateFlow;
                            this.f17371r0 = q0Var;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new C0065a(this.f17370q0, this.f17371r0, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C0065a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                            int i10 = this.f17369p0;
                            if (i10 == 0) {
                                ResultKt.throwOnFailure(obj);
                                C0066a c0066a = new C0066a(this.f17371r0);
                                this.f17369p0 = 1;
                                if (this.f17370q0.collect(c0066a, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(Ref.ObjectRef<q0> objectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, AnonymousClass2 anonymousClass2, View view, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f17365r0 = objectRef;
                        this.f17366s0 = recomposer;
                        this.f17367t0 = lifecycleOwner;
                        this.f17368u0 = anonymousClass2;
                        this.v0 = view;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        a aVar = new a(this.f17365r0, this.f17366s0, this.f17367t0, this.f17368u0, this.v0, continuation);
                        aVar.f17364q0 = obj;
                        return aVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
                    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        Job job;
                        Job jobLaunch$default;
                        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                        int i10 = this.f17363p0;
                        AnonymousClass2 anonymousClass2 = this.f17368u0;
                        LifecycleOwner lifecycleOwner = this.f17367t0;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            job = (Job) this.f17364q0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                lifecycleOwner.getLifecycle().removeObserver(anonymousClass2);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                lifecycleOwner.getLifecycle().removeObserver(anonymousClass2);
                                throw th;
                            }
                        }
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.f17364q0;
                        try {
                            q0 q0Var = this.f17365r0.element;
                            if (q0Var != null) {
                                Context applicationContext = this.v0.getContext().getApplicationContext();
                                Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                                StateFlow stateFlowAccess$getAnimationScaleFlowFor = WindowRecomposer_androidKt.access$getAnimationScaleFlowFor(applicationContext);
                                q0Var.f17435p0.setFloatValue(((Number) stateFlowAccess$getAnimationScaleFlowFor.getValue()).floatValue());
                                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0065a(stateFlowAccess$getAnimationScaleFlowFor, q0Var, null), 3, null);
                            } else {
                                jobLaunch$default = null;
                            }
                            try {
                                Recomposer recomposer = this.f17366s0;
                                this.f17364q0 = jobLaunch$default;
                                this.f17363p0 = 1;
                                if (recomposer.runRecomposeAndApplyChanges(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                job = jobLaunch$default;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                lifecycleOwner.getLifecycle().removeObserver(anonymousClass2);
                                return Unit.INSTANCE;
                            } catch (Throwable th3) {
                                job = jobLaunch$default;
                                th = th3;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                lifecycleOwner.getLifecycle().removeObserver(anonymousClass2);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            job = null;
                        }
                    }
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                    if (i10 == 1) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, CoroutineStart.UNDISPATCHED, new a(objectRef, recomposer, source, this, view, null), 1, null);
                        return;
                    }
                    Recomposer recomposer2 = recomposer;
                    if (i10 == 2) {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock3 != null) {
                            pausableMonotonicFrameClock3.resume();
                        }
                        recomposer2.resumeCompositionFrameClock();
                        return;
                    }
                    if (i10 == 3) {
                        recomposer2.pauseCompositionFrameClock();
                    } else {
                        if (i10 != 4) {
                            return;
                        }
                        recomposer2.cancel();
                    }
                }
            });
            return recomposer;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, coroutineContext, lifecycle);
    }

    @Nullable
    public static final CompositionContext findViewTreeCompositionContext(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        for (ViewParent parent = view.getParent(); compositionContext == null && (parent instanceof View); parent = parent.getParent()) {
            compositionContext = getCompositionContext((View) parent);
        }
        return compositionContext;
    }

    @Nullable
    public static final CompositionContext getCompositionContext(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    @NotNull
    public static final Recomposer getWindowRecomposer(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!view.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
        }
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext == null) {
            return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(view);
        }
        if (compositionContext instanceof Recomposer) {
            return (Recomposer) compositionContext;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
    }

    public static final void setCompositionContext(@NotNull View view, @Nullable CompositionContext compositionContext) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.androidx_compose_ui_view_composition_context, compositionContext);
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }
}
