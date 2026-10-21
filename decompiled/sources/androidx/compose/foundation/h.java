package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickablePointerInputNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,978:1\n157#2:979\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/CombinedClickablePointerInputNode\n*L\n926#1:979\n*E\n"})
public final class h extends androidx.compose.foundation.a {

    @Nullable
    public Function0<Unit> P0;

    @Nullable
    public Function0<Unit> Q0;

    /* JADX INFO: compiled from: Clickable.kt */
    public static final class a extends Lambda implements Function1<Offset, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            offset.getF15533a();
            Function0<Unit> function0 = h.this.Q0;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Clickable.kt */
    public static final class b extends Lambda implements Function1<Offset, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            offset.getF15533a();
            Function0<Unit> function0 = h.this.P0;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Clickable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$4", f = "Clickable.kt", i = {}, l = {936}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f4085p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ PressGestureScope f4086q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ long f4087r0;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            long f15533a = offset.getF15533a();
            c cVar = h.this.new c(continuation);
            cVar.f4086q0 = pressGestureScope;
            cVar.f4087r0 = f15533a;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM144access$handlePressInteractionEPk0efs;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f4085p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = this.f4086q0;
                long j10 = this.f4087r0;
                h hVar = h.this;
                if (hVar.J0) {
                    this.f4085p0 = 1;
                    MutableInteractionSource mutableInteractionSource = hVar.K0;
                    if (mutableInteractionSource == null || (objM144access$handlePressInteractionEPk0efs = ClickableKt.m144access$handlePressInteractionEPk0efs(pressGestureScope, j10, mutableInteractionSource, hVar.M0, hVar.N0, this)) != ek.a.getCOROUTINE_SUSPENDED()) {
                        objM144access$handlePressInteractionEPk0efs = Unit.INSTANCE;
                    }
                    if (objM144access$handlePressInteractionEPk0efs == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: compiled from: Clickable.kt */
    public static final class d extends Lambda implements Function1<Offset, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            offset.getF15533a();
            h hVar = h.this;
            if (hVar.J0) {
                hVar.L0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public h() {
        throw null;
    }

    @Override // androidx.compose.foundation.a
    @Nullable
    public final Object b(@NotNull PointerInputScope pointerInputScope, @NotNull Continuation<? super Unit> continuation) {
        long jM4555getCenterozmzZPI = IntSizeKt.m4555getCenterozmzZPI(pointerInputScope.getN0());
        this.M0.m118setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m4507getXimpl(jM4555getCenterozmzZPI), IntOffset.m4508getYimpl(jM4555getCenterozmzZPI)));
        Object objDetectTapGestures = TapGestureDetectorKt.detectTapGestures(pointerInputScope, (!this.J0 || this.Q0 == null) ? null : new a(), (!this.J0 || this.P0 == null) ? null : new b(), new c(null), new d(), continuation);
        return objDetectTapGestures == ek.a.getCOROUTINE_SUSPENDED() ? objDetectTapGestures : Unit.INSTANCE;
    }
}
