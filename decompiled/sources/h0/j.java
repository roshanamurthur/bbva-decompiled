package h0;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$Scrim$dismissModifier$1$1", f = "BackdropScaffold.kt", i = {}, l = {394}, m = "invokeSuspend", n = {}, s = {})
public final class j extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68840p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f68841q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f68842r0;

    /* JADX INFO: compiled from: BackdropScaffold.kt */
    public static final class a extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f68843p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0) {
            super(1);
            this.f68843p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Offset offset) {
            offset.getF15533a();
            this.f68843p0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Function0<Unit> function0, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f68842r0 = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        j jVar = new j(this.f68842r0, continuation);
        jVar.f68841q0 = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((j) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68840p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f68841q0;
            a aVar = new a(this.f68842r0);
            this.f68840p0 = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, aVar, this, 7, null) == coroutine_suspended) {
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
