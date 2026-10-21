package h0;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1", f = "ExposedDropdownMenu.kt", i = {}, l = {ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY}, m = "invokeSuspend", n = {}, s = {})
public final class b1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68655p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f68656q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f68657r0;

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {524, 525}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    public static final class a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f68658p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f68659q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f68660r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f68660r0 = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f68660r0, continuation);
            aVar.f68659q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f68658p0;
            if (i10 != 0) {
                if (i10 == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.f68659q0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((PointerInputChange) obj) != null) {
                    this.f68660r0.invoke();
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.f68659q0;
            PointerEventPass pointerEventPass = PointerEventPass.Initial;
            this.f68659q0 = awaitPointerEventScope;
            this.f68658p0 = 1;
            if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, pointerEventPass, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            this.f68659q0 = null;
            this.f68658p0 = 2;
            obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((PointerInputChange) obj) != null) {
                this.f68660r0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Function0<Unit> function0, Continuation<? super b1> continuation) {
        super(2, continuation);
        this.f68657r0 = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        b1 b1Var = new b1(this.f68657r0, continuation);
        b1Var.f68656q0 = obj;
        return b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((b1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68655p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f68656q0;
            a aVar = new a(this.f68657r0, null);
            this.f68655p0 = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, aVar, this) == coroutine_suspended) {
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
