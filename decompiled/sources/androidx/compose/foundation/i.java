package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", i = {0}, l = {363}, m = "invokeSuspend", n = {"magnifier"}, s = {"L$0"})
public final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ State<Offset> E0;
    public final /* synthetic */ State<Function1<Density, Offset>> F0;
    public final /* synthetic */ MutableState<Offset> G0;
    public final /* synthetic */ State<Float> H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f4090p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f4091q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ PlatformMagnifierFactory f4092r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MagnifierStyle f4093s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ View f4094t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Density f4095u0;
    public final /* synthetic */ float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow<Unit> f4096w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ State<Function1<DpSize, Unit>> f4097x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ State<Boolean> f4098y0;

    /* JADX INFO: compiled from: Magnifier.kt */
    @DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PlatformMagnifier f4099p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PlatformMagnifier platformMagnifier, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f4099p0 = platformMagnifier;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f4099p0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((a) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f4099p0.updateContent();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Magnifier.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PlatformMagnifier f4100p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Density f4101q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Boolean> f4102r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Offset> f4103s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Density, Offset>> f4104t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Offset> f4105u0;
        public final /* synthetic */ State<Float> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f4106w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<DpSize, Unit>> f4107x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(PlatformMagnifier platformMagnifier, Density density, State<Boolean> state, State<Offset> state2, State<? extends Function1<? super Density, Offset>> state3, MutableState<Offset> mutableState, State<Float> state4, Ref.LongRef longRef, State<? extends Function1<? super DpSize, Unit>> state5) {
            super(0);
            this.f4100p0 = platformMagnifier;
            this.f4101q0 = density;
            this.f4102r0 = state;
            this.f4103s0 = state2;
            this.f4104t0 = state3;
            this.f4105u0 = mutableState;
            this.v0 = state4;
            this.f4106w0 = longRef;
            this.f4107x0 = state5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            boolean zBooleanValue = this.f4102r0.getValue().booleanValue();
            PlatformMagnifier platformMagnifier = this.f4100p0;
            if (zBooleanValue) {
                long f15533a = this.f4103s0.getValue().getF15533a();
                Function1<Density, Offset> value = this.f4104t0.getValue();
                Density density = this.f4101q0;
                long f15533a2 = value.invoke(density).getF15533a();
                platformMagnifier.mo175updateWko1d7g(f15533a, OffsetKt.m2294isSpecifiedk4lQ0M(f15533a2) ? Offset.m2280plusMKHz9U(this.f4105u0.getValue().getF15533a(), f15533a2) : Offset.INSTANCE.m2290getUnspecifiedF1C5BW0(), this.v0.getValue().floatValue());
                long jMo174getSizeYbymL2g = platformMagnifier.mo174getSizeYbymL2g();
                Ref.LongRef longRef = this.f4106w0;
                if (!IntSize.m4547equalsimpl0(jMo174getSizeYbymL2g, longRef.element)) {
                    longRef.element = jMo174getSizeYbymL2g;
                    Function1<DpSize, Unit> value2 = this.f4107x0.getValue();
                    if (value2 != null) {
                        value2.invoke(DpSize.m4475boximpl(density.mo407toDpSizekrfVVM(IntSizeKt.m4559toSizeozmzZPI(jMo174getSizeYbymL2g))));
                    }
                }
            } else {
                platformMagnifier.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle, View view, Density density, float f6, MutableSharedFlow<Unit> mutableSharedFlow, State<? extends Function1<? super DpSize, Unit>> state, State<Boolean> state2, State<Offset> state3, State<? extends Function1<? super Density, Offset>> state4, MutableState<Offset> mutableState, State<Float> state5, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f4092r0 = platformMagnifierFactory;
        this.f4093s0 = magnifierStyle;
        this.f4094t0 = view;
        this.f4095u0 = density;
        this.v0 = f6;
        this.f4096w0 = mutableSharedFlow;
        this.f4097x0 = state;
        this.f4098y0 = state2;
        this.E0 = state3;
        this.F0 = state4;
        this.G0 = mutableState;
        this.H0 = state5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        i iVar = new i(this.f4092r0, this.f4093s0, this.f4094t0, this.f4095u0, this.v0, this.f4096w0, this.f4097x0, this.f4098y0, this.E0, this.F0, this.G0, this.H0, continuation);
        iVar.f4091q0 = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        PlatformMagnifier platformMagnifier;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f4090p0;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            platformMagnifier = (PlatformMagnifier) this.f4091q0;
            try {
                ResultKt.throwOnFailure(obj);
                platformMagnifier.dismiss();
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                platformMagnifier.dismiss();
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f4091q0;
        View view = this.f4094t0;
        float f6 = this.v0;
        PlatformMagnifierFactory platformMagnifierFactory = this.f4092r0;
        MagnifierStyle magnifierStyle = this.f4093s0;
        Density density = this.f4095u0;
        PlatformMagnifier platformMagnifierCreate = platformMagnifierFactory.create(magnifierStyle, view, density, f6);
        Ref.LongRef longRef = new Ref.LongRef();
        long jMo174getSizeYbymL2g = platformMagnifierCreate.mo174getSizeYbymL2g();
        Function1<DpSize, Unit> value = this.f4097x0.getValue();
        if (value != null) {
            value.invoke(DpSize.m4475boximpl(density.mo407toDpSizekrfVVM(IntSizeKt.m4559toSizeozmzZPI(jMo174getSizeYbymL2g))));
        }
        longRef.element = jMo174getSizeYbymL2g;
        FlowKt.launchIn(FlowKt.onEach(this.f4096w0, new a(platformMagnifierCreate, null)), coroutineScope);
        try {
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new b(platformMagnifierCreate, this.f4095u0, this.f4098y0, this.E0, this.F0, this.G0, this.H0, longRef, this.f4097x0));
            this.f4091q0 = platformMagnifierCreate;
            this.f4090p0 = 1;
            if (FlowKt.collect(flowSnapshotFlow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            platformMagnifier = platformMagnifierCreate;
            platformMagnifier.dismiss();
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            platformMagnifier = platformMagnifierCreate;
            platformMagnifier.dismiss();
            throw th;
        }
    }
}
