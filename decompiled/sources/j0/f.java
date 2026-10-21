package j0;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PullRefresh.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements NestedScrollConnection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Function1<Float, Float> f78745p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Function2<Float, Continuation<? super Float>, Object> f78746q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f78747r0;

    /* JADX INFO: compiled from: PullRefresh.kt */
    @DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", i = {}, l = {117}, m = "onPreFling-QWom1Mo", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f78748p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f78750r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f78748p0 = obj;
            this.f78750r0 |= Integer.MIN_VALUE;
            return f.this.mo220onPreFlingQWom1Mo(0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull Function1<? super Float, Float> onPull, @NotNull Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> onRelease, boolean z10) {
        Intrinsics.checkNotNullParameter(onPull, "onPull");
        Intrinsics.checkNotNullParameter(onRelease, "onRelease");
        this.f78745p0 = onPull;
        this.f78746q0 = onRelease;
        this.f78747r0 = z10;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final /* synthetic */ Object mo218onPostFlingRZ2iAVY(long j10, long j11, Continuation continuation) {
        return d1.a.a(this, j10, j11, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo219onPostScrollDzOQY0M(long j10, long j11, int i10) {
        if (!this.f78747r0) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        if (!NestedScrollSource.m3387equalsimpl0(i10, NestedScrollSource.INSTANCE.m3392getDragWNlRxjI()) || Offset.m2276getYimpl(j11) <= 0.0f) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        return OffsetKt.Offset(0.0f, this.f78745p0.invoke(Float.valueOf(Offset.m2276getYimpl(j11))).floatValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo220onPreFlingQWom1Mo(long j10, @NotNull Continuation<? super Velocity> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f78750r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f78750r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.f78748p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f78750r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Float fBoxFloat = Boxing.boxFloat(Velocity.m4615getYimpl(j10));
            aVar.f78750r0 = 1;
            objInvoke = this.f78746q0.invoke(fBoxFloat, aVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        return Velocity.m4605boximpl(VelocityKt.Velocity(0.0f, ((Number) objInvoke).floatValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo221onPreScrollOzD1aCk(long j10, int i10) {
        if (!this.f78747r0) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        if (!NestedScrollSource.m3387equalsimpl0(i10, NestedScrollSource.INSTANCE.m3392getDragWNlRxjI()) || Offset.m2276getYimpl(j10) >= 0.0f) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        return OffsetKt.Offset(0.0f, this.f78745p0.invoke(Float.valueOf(Offset.m2276getYimpl(j10))).floatValue());
    }
}
