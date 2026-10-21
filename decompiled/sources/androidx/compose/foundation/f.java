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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickablePointerInputNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,978:1\n157#2:979\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickablePointerInputNode\n*L\n888#1:979\n*E\n"})
public final class f extends androidx.compose.foundation.a {

    /* JADX INFO: compiled from: Clickable.kt */
    @DebugMetadata(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", i = {}, l = {892}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3503p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ PressGestureScope f3504q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ long f3505r0;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            long f15533a = offset.getF15533a();
            a aVar = f.this.new a(continuation);
            aVar.f3504q0 = pressGestureScope;
            aVar.f3505r0 = f15533a;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM144access$handlePressInteractionEPk0efs;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3503p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PressGestureScope pressGestureScope = this.f3504q0;
                long j10 = this.f3505r0;
                f fVar = f.this;
                if (fVar.J0) {
                    this.f3503p0 = 1;
                    MutableInteractionSource mutableInteractionSource = fVar.K0;
                    if (mutableInteractionSource == null || (objM144access$handlePressInteractionEPk0efs = ClickableKt.m144access$handlePressInteractionEPk0efs(pressGestureScope, j10, mutableInteractionSource, fVar.M0, fVar.N0, this)) != ek.a.getCOROUTINE_SUSPENDED()) {
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
    public static final class b extends Lambda implements Function1<Offset, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            offset.getF15533a();
            f fVar = f.this;
            if (fVar.J0) {
                fVar.L0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public f() {
        throw null;
    }

    @Override // androidx.compose.foundation.a
    @Nullable
    public final Object b(@NotNull PointerInputScope pointerInputScope, @NotNull Continuation<? super Unit> continuation) {
        long jM4555getCenterozmzZPI = IntSizeKt.m4555getCenterozmzZPI(pointerInputScope.mo3499getSizeYbymL2g());
        this.M0.m118setCentreOffsetk4lQ0M(OffsetKt.Offset(IntOffset.m4507getXimpl(jM4555getCenterozmzZPI), IntOffset.m4508getYimpl(jM4555getCenterozmzZPI)));
        Object objDetectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new a(null), new b(), continuation);
        return objDetectTapAndPress == ek.a.getCOROUTINE_SUSPENDED() ? objDetectTapAndPress : Unit.INSTANCE;
    }
}
