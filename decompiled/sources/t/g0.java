package t;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", i = {}, l = {288, 290}, m = "invokeSuspend", n = {}, s = {})
public final class g0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93382p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f93383q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ScrollState f93384r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f93385s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ float f93386t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean z10, ScrollState scrollState, float f6, float f10, Continuation<? super g0> continuation) {
        super(2, continuation);
        this.f93383q0 = z10;
        this.f93384r0 = scrollState;
        this.f93385s0 = f6;
        this.f93386t0 = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new g0(this.f93383q0, this.f93384r0, this.f93385s0, this.f93386t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((g0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93382p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f93383q0) {
                ScrollState scrollState = this.f93384r0;
                Intrinsics.checkNotNull(scrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                float f6 = this.f93385s0;
                this.f93382p0 = 1;
                if (ScrollExtensionsKt.animateScrollBy$default(scrollState, f6, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                ScrollState scrollState2 = this.f93384r0;
                Intrinsics.checkNotNull(scrollState2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                float f10 = this.f93386t0;
                this.f93382p0 = 2;
                if (ScrollExtensionsKt.animateScrollBy$default(scrollState2, f10, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
