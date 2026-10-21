package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {299, 301, 308, 309, TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f3490p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f3491q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f3492r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ PressGestureScope f3493s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ long f3494t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f3495u0;
    public final /* synthetic */ AbstractClickableNode.InteractionData v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Function0<Boolean> f3496w0;

    /* JADX INFO: compiled from: Clickable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", i = {1}, l = {293, 296}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public PressInteraction.Press f3497p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f3498q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Boolean> f3499r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f3500s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f3501t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ AbstractClickableNode.InteractionData f3502u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Boolean> function0, long j10, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3499r0 = function0;
            this.f3500s0 = j10;
            this.f3501t0 = mutableInteractionSource;
            this.f3502u0 = interactionData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f3499r0, this.f3500s0, this.f3501t0, this.f3502u0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            PressInteraction.Press press;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3498q0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    press = this.f3497p0;
                    ResultKt.throwOnFailure(obj);
                }
                this.f3502u0.setPressInteraction(press);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (this.f3499r0.invoke().booleanValue()) {
                long tapIndicationDelay = Clickable_androidKt.getTapIndicationDelay();
                this.f3498q0 = 1;
                if (DelayKt.delay(tapIndicationDelay, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            PressInteraction.Press press2 = new PressInteraction.Press(this.f3500s0, null);
            this.f3497p0 = press2;
            this.f3498q0 = 2;
            if (this.f3501t0.emit(press2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            press = press2;
            this.f3502u0.setPressInteraction(press);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PressGestureScope pressGestureScope, long j10, MutableInteractionSource mutableInteractionSource, AbstractClickableNode.InteractionData interactionData, Function0<Boolean> function0, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f3493s0 = pressGestureScope;
        this.f3494t0 = j10;
        this.f3495u0 = mutableInteractionSource;
        this.v0 = interactionData;
        this.f3496w0 = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        d dVar = new d(this.f3493s0, this.f3494t0, this.f3495u0, this.v0, this.f3496w0, continuation);
        dVar.f3492r0 = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Job jobLaunch$default;
        Object objTryAwaitRelease;
        boolean z10;
        PressInteraction.Press press;
        PressInteraction.Release release;
        PressInteraction.Release release2;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f3491q0;
        AbstractClickableNode.InteractionData interactionData = this.v0;
        MutableInteractionSource mutableInteractionSource = this.f3495u0;
        if (i10 != 0) {
            if (i10 == 1) {
                jobLaunch$default = (Job) this.f3492r0;
                ResultKt.throwOnFailure(obj);
                objTryAwaitRelease = obj;
            } else if (i10 == 2) {
                z10 = this.f3490p0;
                ResultKt.throwOnFailure(obj);
                if (z10) {
                    press = new PressInteraction.Press(this.f3494t0, null);
                    release = new PressInteraction.Release(press);
                    this.f3492r0 = release;
                    this.f3491q0 = 3;
                    if (mutableInteractionSource.emit(press, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    release2 = release;
                    this.f3492r0 = null;
                    this.f3491q0 = 4;
                    if (mutableInteractionSource.emit(release2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i10 == 3) {
                release2 = (PressInteraction.Release) this.f3492r0;
                ResultKt.throwOnFailure(obj);
                this.f3492r0 = null;
                this.f3491q0 = 4;
                if (mutableInteractionSource.emit(release2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            interactionData.setPressInteraction(null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f3492r0, null, null, new a(this.f3496w0, this.f3494t0, this.f3495u0, this.v0, null), 3, null);
        this.f3492r0 = jobLaunch$default;
        this.f3491q0 = 1;
        objTryAwaitRelease = this.f3493s0.tryAwaitRelease(this);
        if (objTryAwaitRelease == coroutine_suspended) {
            return coroutine_suspended;
        }
        boolean zBooleanValue = ((Boolean) objTryAwaitRelease).booleanValue();
        if (jobLaunch$default.isActive()) {
            this.f3492r0 = null;
            this.f3490p0 = zBooleanValue;
            this.f3491q0 = 2;
            if (JobKt.cancelAndJoin(jobLaunch$default, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z10 = zBooleanValue;
            if (z10) {
                press = new PressInteraction.Press(this.f3494t0, null);
                release = new PressInteraction.Release(press);
                this.f3492r0 = release;
                this.f3491q0 = 3;
                if (mutableInteractionSource.emit(press, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                release2 = release;
                this.f3492r0 = null;
                this.f3491q0 = 4;
                if (mutableInteractionSource.emit(release2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            PressInteraction.Press pressInteraction = interactionData.getPressInteraction();
            if (pressInteraction != null) {
                Interaction release3 = zBooleanValue ? new PressInteraction.Release(pressInteraction) : new PressInteraction.Cancel(pressInteraction);
                this.f3492r0 = null;
                this.f3491q0 = 5;
                if (mutableInteractionSource.emit(release3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        interactionData.setPressInteraction(null);
        return Unit.INSTANCE;
    }
}
