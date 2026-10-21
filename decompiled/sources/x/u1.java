package x;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.SideCalculator;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(30)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,724:1\n314#2,11:725\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n213#1:725,11\n*E\n"})
public final class u1 implements NestedScrollConnection, WindowInsetsAnimationControlListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final AndroidWindowInsets f94407p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final View f94408q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final SideCalculator f94409r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Density f94410s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public WindowInsetsAnimationController f94411t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f94412u0;

    @NotNull
    public final CancellationSignal v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f94413w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public Job f94414x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public CancellableContinuation<? super WindowInsetsAnimationController> f94415y0;

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f94416p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable it = th2;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {320, 346, 371}, m = "fling-huYlsQE", n = {"this", "available", "flingAmount", "this", "endVelocity", "available", "this", "available"}, s = {"L$0", "J$0", "F$0", "L$0", "L$1", "J$0", "L$0", "J$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public u1 f94417p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Ref.FloatRef f94418q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f94419r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public float f94420s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f94421t0;
        public int v0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f94421t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return u1.this.b(0L, 0.0f, false, this);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f94423p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f94424q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ u1 f94425r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f94426s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f94427t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.layout.e f94428u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f94429w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f94430x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ WindowInsetsAnimationController f94431y0;

        /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
        @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f94432p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ int f94433q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ float f94434r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.foundation.layout.e f94435s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ int f94436t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ int f94437u0;
            public final /* synthetic */ u1 v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f94438w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public final /* synthetic */ WindowInsetsAnimationController f94439x0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public final /* synthetic */ boolean f94440y0;

            /* JADX INFO: renamed from: x.u1$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
            public static final class C0506a extends Lambda implements Function2<Float, Float, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ int f94441p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ int f94442q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ u1 f94443r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ Ref.FloatRef f94444s0;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public final /* synthetic */ WindowInsetsAnimationController f94445t0;

                /* JADX INFO: renamed from: u0, reason: collision with root package name */
                public final /* synthetic */ boolean f94446u0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0506a(int i10, int i11, u1 u1Var, Ref.FloatRef floatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z10) {
                    super(2);
                    this.f94441p0 = i10;
                    this.f94442q0 = i11;
                    this.f94443r0 = u1Var;
                    this.f94444s0 = floatRef;
                    this.f94445t0 = windowInsetsAnimationController;
                    this.f94446u0 = z10;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Float f6, Float f10) {
                    float fFloatValue = f6.floatValue();
                    float fFloatValue2 = f10.floatValue();
                    float f11 = this.f94441p0;
                    float f12 = this.f94442q0;
                    u1 u1Var = this.f94443r0;
                    if (fFloatValue > f12 || f11 > fFloatValue) {
                        this.f94444s0.element = fFloatValue2;
                        this.f94445t0.finish(this.f94446u0);
                        u1Var.f94411t0 = null;
                        Job job = u1Var.f94414x0;
                        if (job != null) {
                            job.cancel((CancellationException) new t1());
                        }
                    } else {
                        WindowInsetsAnimationController windowInsetsAnimationController = u1Var.f94411t0;
                        if (windowInsetsAnimationController != null) {
                            Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                            Intrinsics.checkNotNullExpressionValue(currentInsets, "it.currentInsets");
                            windowInsetsAnimationController.setInsetsAndAlpha(u1Var.f94409r0.adjustInsets(currentInsets, mk.c.roundToInt(fFloatValue)), 1.0f, 0.0f);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(float f6, int i10, int i11, int i12, WindowInsetsAnimationController windowInsetsAnimationController, androidx.compose.foundation.layout.e eVar, u1 u1Var, Continuation continuation, Ref.FloatRef floatRef, boolean z10) {
                super(2, continuation);
                this.f94433q0 = i10;
                this.f94434r0 = f6;
                this.f94435s0 = eVar;
                this.f94436t0 = i11;
                this.f94437u0 = i12;
                this.v0 = u1Var;
                this.f94438w0 = floatRef;
                this.f94439x0 = windowInsetsAnimationController;
                this.f94440y0 = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                int i10 = this.f94433q0;
                float f6 = this.f94434r0;
                androidx.compose.foundation.layout.e eVar = this.f94435s0;
                return new a(f6, i10, this.f94436t0, this.f94437u0, this.f94439x0, eVar, this.v0, continuation, this.f94438w0, this.f94440y0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f94432p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    float f6 = this.f94433q0;
                    C0506a c0506a = new C0506a(this.f94436t0, this.f94437u0, this.v0, this.f94438w0, this.f94439x0, this.f94440y0);
                    this.f94432p0 = 1;
                    if (SuspendAnimationKt.animateDecay(f6, this.f94434r0, this.f94435s0, c0506a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f6, int i10, int i11, int i12, WindowInsetsAnimationController windowInsetsAnimationController, androidx.compose.foundation.layout.e eVar, u1 u1Var, Continuation continuation, Ref.FloatRef floatRef, boolean z10) {
            super(2, continuation);
            this.f94425r0 = u1Var;
            this.f94426s0 = i10;
            this.f94427t0 = f6;
            this.f94428u0 = eVar;
            this.v0 = i11;
            this.f94429w0 = i12;
            this.f94430x0 = floatRef;
            this.f94431y0 = windowInsetsAnimationController;
            this.E0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            u1 u1Var = this.f94425r0;
            int i10 = this.f94426s0;
            float f6 = this.f94427t0;
            androidx.compose.foundation.layout.e eVar = this.f94428u0;
            c cVar = new c(f6, i10, this.v0, this.f94429w0, this.f94431y0, eVar, u1Var, continuation, this.f94430x0, this.E0);
            cVar.f94424q0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f94423p0;
            u1 u1Var = this.f94425r0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f94424q0;
                u1 u1Var2 = this.f94425r0;
                int i11 = this.f94426s0;
                float f6 = this.f94427t0;
                androidx.compose.foundation.layout.e eVar = this.f94428u0;
                u1Var2.f94414x0 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(f6, i11, this.v0, this.f94429w0, this.f94431y0, eVar, u1Var2, null, this.f94430x0, this.E0), 3, null);
                Job job = u1Var.f94414x0;
                if (job != null) {
                    this.f94423p0 = 1;
                    if (job.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            u1Var.f94414x0 = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f94447p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ u1 f94448q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f94449r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f94450s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f94451t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ WindowInsetsAnimationController f94452u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
        @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {374}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f94453p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ int f94454q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ int f94455r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ float f94456s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ WindowInsetsAnimationController f94457t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ boolean f94458u0;
            public final /* synthetic */ u1 v0;

            /* JADX INFO: renamed from: x.u1$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
            public static final class C0507a extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ u1 f94459p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0507a(u1 u1Var) {
                    super(1);
                    this.f94459p0 = u1Var;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                    Animatable<Float, AnimationVector1D> animateTo = animatable;
                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                    float fFloatValue = animateTo.getValue().floatValue();
                    u1 u1Var = this.f94459p0;
                    WindowInsetsAnimationController windowInsetsAnimationController = u1Var.f94411t0;
                    if (windowInsetsAnimationController != null) {
                        Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                        Intrinsics.checkNotNullExpressionValue(currentInsets, "it.currentInsets");
                        windowInsetsAnimationController.setInsetsAndAlpha(u1Var.f94409r0.adjustInsets(currentInsets, mk.c.roundToInt(fFloatValue)), 1.0f, 0.0f);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(float f6, int i10, int i11, WindowInsetsAnimationController windowInsetsAnimationController, u1 u1Var, Continuation continuation, boolean z10) {
                super(2, continuation);
                this.f94454q0 = i10;
                this.f94455r0 = i11;
                this.f94456s0 = f6;
                this.f94457t0 = windowInsetsAnimationController;
                this.f94458u0 = z10;
                this.v0 = u1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                int i10 = this.f94454q0;
                int i11 = this.f94455r0;
                return new a(this.f94456s0, i10, i11, this.f94457t0, this.v0, continuation, this.f94458u0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f94453p0;
                u1 u1Var = this.v0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(this.f94454q0, 0.0f, 2, null);
                    Float fBoxFloat = Boxing.boxFloat(this.f94455r0);
                    Float fBoxFloat2 = Boxing.boxFloat(this.f94456s0);
                    C0507a c0507a = new C0507a(u1Var);
                    this.f94453p0 = 1;
                    if (Animatable.animateTo$default(animatableAnimatable$default, fBoxFloat, null, fBoxFloat2, c0507a, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.f94457t0.finish(this.f94458u0);
                u1Var.f94411t0 = null;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f6, int i10, int i11, WindowInsetsAnimationController windowInsetsAnimationController, u1 u1Var, Continuation continuation, boolean z10) {
            super(2, continuation);
            this.f94448q0 = u1Var;
            this.f94449r0 = i10;
            this.f94450s0 = i11;
            this.f94451t0 = f6;
            this.f94452u0 = windowInsetsAnimationController;
            this.v0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            u1 u1Var = this.f94448q0;
            d dVar = new d(this.f94451t0, this.f94449r0, this.f94450s0, this.f94452u0, u1Var, continuation, this.v0);
            dVar.f94447p0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f94447p0;
            u1 u1Var = this.f94448q0;
            u1Var.f94414x0 = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(this.f94451t0, this.f94449r0, this.f94450s0, this.f94452u0, u1Var, null, this.v0), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    public static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f94460p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable it = th2;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public u1(@NotNull AndroidWindowInsets windowInsets, @NotNull View view, @NotNull SideCalculator sideCalculator, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(sideCalculator, "sideCalculator");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f94407p0 = windowInsets;
        this.f94408q0 = view;
        this.f94409r0 = sideCalculator;
        this.f94410s0 = density;
        this.v0 = new CancellationSignal();
    }

    public final void a() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.f94411t0;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.f94411t0) != null) {
            windowInsetsAnimationController.finish(this.f94407p0.isVisible());
        }
        this.f94411t0 = null;
        CancellableContinuation<? super WindowInsetsAnimationController> cancellableContinuation = this.f94415y0;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume(null, a.f94416p0);
        }
        this.f94415y0 = null;
        Job job = this.f94414x0;
        if (job != null) {
            job.cancel((CancellationException) new t1());
        }
        this.f94414x0 = null;
        this.f94413w0 = 0.0f;
        this.f94412u0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(long j10, float f6, boolean z10, Continuation<? super Velocity> continuation) throws Throwable {
        b bVar;
        float f10;
        long j11;
        u1 u1Var;
        u1 u1Var2;
        Ref.FloatRef floatRef;
        long j12;
        u1 u1Var3;
        long j13;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.v0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.v0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f94421t0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.v0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Job job = this.f94414x0;
            if (job != null) {
                job.cancel((CancellationException) new t1());
            }
            this.f94414x0 = null;
            this.f94413w0 = 0.0f;
            if ((f6 == 0.0f && !z10) || (this.f94411t0 == null && this.f94407p0.isVisible() == z10)) {
                return Velocity.m4605boximpl(Velocity.INSTANCE.m4625getZero9UxMQ8M());
            }
            bVar.f94417p0 = this;
            bVar.f94419r0 = j10;
            bVar.f94420s0 = f6;
            bVar.v0 = 1;
            Object result = this.f94411t0;
            if (result == null) {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(bVar), 1);
                cancellableContinuationImpl.initCancellability();
                this.f94415y0 = cancellableContinuationImpl;
                c();
                result = cancellableContinuationImpl.getResult();
                if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(bVar);
                }
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            f10 = f6;
            j11 = j10;
            obj = result;
            u1Var = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    j12 = bVar.f94419r0;
                    floatRef = bVar.f94418q0;
                    u1Var2 = bVar.f94417p0;
                    ResultKt.throwOnFailure(obj);
                    return Velocity.m4605boximpl(u1Var2.f94409r0.mo317consumedVelocityQWom1Mo(j12, floatRef.element));
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j13 = bVar.f94419r0;
                u1Var3 = bVar.f94417p0;
                ResultKt.throwOnFailure(obj);
                return Velocity.m4605boximpl(u1Var3.f94409r0.mo317consumedVelocityQWom1Mo(j13, 0.0f));
            }
            float f11 = bVar.f94420s0;
            j11 = bVar.f94419r0;
            u1Var = bVar.f94417p0;
            ResultKt.throwOnFailure(obj);
            f10 = f11;
        }
        WindowInsetsAnimationController windowInsetsAnimationControllerC = androidx.core.view.o0.c(obj);
        if (windowInsetsAnimationControllerC == null) {
            return Velocity.m4605boximpl(Velocity.INSTANCE.m4625getZero9UxMQ8M());
        }
        SideCalculator sideCalculator = u1Var.f94409r0;
        Insets hiddenStateInsets = windowInsetsAnimationControllerC.getHiddenStateInsets();
        Intrinsics.checkNotNullExpressionValue(hiddenStateInsets, "animationController.hiddenStateInsets");
        int iValueOf = sideCalculator.valueOf(hiddenStateInsets);
        SideCalculator sideCalculator2 = u1Var.f94409r0;
        Insets shownStateInsets = windowInsetsAnimationControllerC.getShownStateInsets();
        Intrinsics.checkNotNullExpressionValue(shownStateInsets, "animationController.shownStateInsets");
        int iValueOf2 = sideCalculator2.valueOf(shownStateInsets);
        Insets currentInsets = windowInsetsAnimationControllerC.getCurrentInsets();
        Intrinsics.checkNotNullExpressionValue(currentInsets, "animationController.currentInsets");
        int iValueOf3 = u1Var.f94409r0.valueOf(currentInsets);
        if ((f10 <= 0.0f && iValueOf3 == iValueOf) || (f10 >= 0.0f && iValueOf3 == iValueOf2)) {
            windowInsetsAnimationControllerC.finish(iValueOf3 == iValueOf2);
            u1Var.f94411t0 = null;
            return Velocity.m4605boximpl(Velocity.INSTANCE.m4625getZero9UxMQ8M());
        }
        androidx.compose.foundation.layout.e eVar = new androidx.compose.foundation.layout.e(u1Var.f94410s0);
        float fA = eVar.a(f10) + iValueOf3;
        float f12 = iValueOf;
        boolean z11 = (fA - f12) / ((float) (iValueOf2 - iValueOf)) > 0.5f;
        int i12 = z11 ? iValueOf2 : iValueOf;
        if (fA <= iValueOf2 && fA >= f12) {
            d dVar = new d(f10, iValueOf3, i12, windowInsetsAnimationControllerC, u1Var, null, z11);
            bVar.f94417p0 = u1Var;
            bVar.f94419r0 = j11;
            bVar.v0 = 3;
            if (CoroutineScopeKt.coroutineScope(dVar, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            u1Var3 = u1Var;
            j13 = j11;
            return Velocity.m4605boximpl(u1Var3.f94409r0.mo317consumedVelocityQWom1Mo(j13, 0.0f));
        }
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        c cVar = new c(f10, iValueOf3, iValueOf, iValueOf2, windowInsetsAnimationControllerC, eVar, u1Var, null, floatRef2, z11);
        bVar.f94417p0 = u1Var;
        bVar.f94418q0 = floatRef2;
        bVar.f94419r0 = j11;
        bVar.v0 = 2;
        if (CoroutineScopeKt.coroutineScope(cVar, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        u1Var2 = u1Var;
        floatRef = floatRef2;
        j12 = j11;
        return Velocity.m4605boximpl(u1Var2.f94409r0.mo317consumedVelocityQWom1Mo(j12, floatRef.element));
    }

    public final void c() {
        if (this.f94412u0) {
            return;
        }
        this.f94412u0 = true;
        WindowInsetsController windowInsetsController = this.f94408q0.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.f94407p0.getType(), -1L, null, this.v0, rn.b.a(this));
        }
    }

    public final long d(long j10, float f6) {
        Job job = this.f94414x0;
        if (job != null) {
            job.cancel((CancellationException) new t1());
            this.f94414x0 = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f94411t0;
        if (f6 != 0.0f) {
            if (this.f94407p0.isVisible() != (f6 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.f94413w0 = 0.0f;
                    c();
                    return this.f94409r0.mo316consumedOffsetsMKHz9U(j10);
                }
                SideCalculator sideCalculator = this.f94409r0;
                Insets hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                Intrinsics.checkNotNullExpressionValue(hiddenStateInsets, "animationController.hiddenStateInsets");
                int iValueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.f94409r0;
                Insets shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                Intrinsics.checkNotNullExpressionValue(shownStateInsets, "animationController.shownStateInsets");
                int iValueOf2 = sideCalculator2.valueOf(shownStateInsets);
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                Intrinsics.checkNotNullExpressionValue(currentInsets, "animationController.currentInsets");
                int iValueOf3 = this.f94409r0.valueOf(currentInsets);
                if (iValueOf3 == (f6 > 0.0f ? iValueOf2 : iValueOf)) {
                    this.f94413w0 = 0.0f;
                    return Offset.INSTANCE.m2291getZeroF1C5BW0();
                }
                float f10 = iValueOf3 + f6 + this.f94413w0;
                int iCoerceIn = kotlin.ranges.c.coerceIn(mk.c.roundToInt(f10), iValueOf, iValueOf2);
                this.f94413w0 = f10 - mk.c.roundToInt(f10);
                if (iCoerceIn != iValueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f94409r0.adjustInsets(currentInsets, iCoerceIn), 1.0f, 0.0f);
                }
                return this.f94409r0.mo316consumedOffsetsMKHz9U(j10);
            }
        }
        return Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    public final void onCancelled(@Nullable WindowInsetsAnimationController windowInsetsAnimationController) {
        a();
    }

    public final void onFinished(@NotNull WindowInsetsAnimationController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        a();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo218onPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation<? super Velocity> continuation) {
        return b(j11, this.f94409r0.showMotion(Velocity.m4614getXimpl(j11), Velocity.m4615getYimpl(j11)), true, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo219onPostScrollDzOQY0M(long j10, long j11, int i10) {
        return d(j11, this.f94409r0.showMotion(Offset.m2275getXimpl(j11), Offset.m2276getYimpl(j11)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo220onPreFlingQWom1Mo(long j10, @NotNull Continuation<? super Velocity> continuation) {
        return b(j10, this.f94409r0.hideMotion(Velocity.m4614getXimpl(j10), Velocity.m4615getYimpl(j10)), false, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo221onPreScrollOzD1aCk(long j10, int i10) {
        return d(j10, this.f94409r0.hideMotion(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10)));
    }

    public final void onReady(@NotNull WindowInsetsAnimationController controller, int i10) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f94411t0 = controller;
        this.f94412u0 = false;
        CancellableContinuation<? super WindowInsetsAnimationController> cancellableContinuation = this.f94415y0;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume(controller, e.f94460p0);
        }
        this.f94415y0 = null;
    }
}
