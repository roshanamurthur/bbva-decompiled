package androidx.compose.material3;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"androidx/compose/material3/EnterAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ EnterAlwaysScrollBehavior f10223p0;

    /* JADX INFO: compiled from: AppBar.kt */
    @DebugMetadata(c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0, 0}, l = {1499, 1500}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public EnterAlwaysScrollBehavior$nestedScrollConnection$1 f10224p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f10225q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f10226r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f10228t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10226r0 = obj;
            this.f10228t0 |= Integer.MIN_VALUE;
            return EnterAlwaysScrollBehavior$nestedScrollConnection$1.this.mo218onPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    public EnterAlwaysScrollBehavior$nestedScrollConnection$1(EnterAlwaysScrollBehavior enterAlwaysScrollBehavior) {
        this.f10223p0 = enterAlwaysScrollBehavior;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo218onPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation<? super Velocity> continuation) {
        a aVar;
        EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1;
        long j12;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f10228t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f10228t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f10226r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f10228t0;
        if (i11 != 0) {
            if (i11 == 1) {
                j11 = aVar.f10225q0;
                enterAlwaysScrollBehavior$nestedScrollConnection$1 = aVar.f10224p0;
                ResultKt.throwOnFailure(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = aVar.f10225q0;
                ResultKt.throwOnFailure(objA);
            }
            return Velocity.m4605boximpl(Velocity.m4618plusAH228Gc(j12, ((Velocity) objA).getF18328a()));
        }
        ResultKt.throwOnFailure(objA);
        aVar.f10224p0 = this;
        aVar.f10225q0 = j11;
        aVar.f10228t0 = 1;
        objA = d1.a.a(this, j10, j11, aVar);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        enterAlwaysScrollBehavior$nestedScrollConnection$1 = this;
        long f18328a = ((Velocity) objA).getF18328a();
        TopAppBarState topAppBarState = enterAlwaysScrollBehavior$nestedScrollConnection$1.f10223p0.f10218a;
        float fM4615getYimpl = Velocity.m4615getYimpl(j11);
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = enterAlwaysScrollBehavior$nestedScrollConnection$1.f10223p0;
        DecayAnimationSpec<Float> decayAnimationSpec = enterAlwaysScrollBehavior.f10220c;
        aVar.f10224p0 = null;
        aVar.f10225q0 = f18328a;
        aVar.f10228t0 = 2;
        objA = AppBarKt.access$settleAppBar(topAppBarState, fM4615getYimpl, decayAnimationSpec, enterAlwaysScrollBehavior.f10219b, aVar);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        j12 = f18328a;
        return Velocity.m4605boximpl(Velocity.m4618plusAH228Gc(j12, ((Velocity) objA).getF18328a()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo219onPostScrollDzOQY0M(long consumed, long available, int source) {
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = this.f10223p0;
        if (!enterAlwaysScrollBehavior.f10221d.invoke().booleanValue()) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        TopAppBarState topAppBarState = enterAlwaysScrollBehavior.f10218a;
        topAppBarState.setContentOffset(Offset.m2276getYimpl(consumed) + topAppBarState.getContentOffset());
        if ((enterAlwaysScrollBehavior.f10218a.getHeightOffset() == 0.0f || enterAlwaysScrollBehavior.f10218a.getHeightOffset() == enterAlwaysScrollBehavior.f10218a.getHeightOffsetLimit()) && Offset.m2276getYimpl(consumed) == 0.0f && Offset.m2276getYimpl(available) > 0.0f) {
            enterAlwaysScrollBehavior.f10218a.setContentOffset(0.0f);
        }
        TopAppBarState topAppBarState2 = enterAlwaysScrollBehavior.f10218a;
        topAppBarState2.setHeightOffset(Offset.m2276getYimpl(consumed) + topAppBarState2.getHeightOffset());
        return Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final /* synthetic */ Object mo220onPreFlingQWom1Mo(long j10, Continuation continuation) {
        return d1.a.c(this, j10, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo221onPreScrollOzD1aCk(long available, int source) {
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = this.f10223p0;
        if (!enterAlwaysScrollBehavior.f10221d.invoke().booleanValue()) {
            return Offset.INSTANCE.m2291getZeroF1C5BW0();
        }
        float heightOffset = enterAlwaysScrollBehavior.f10218a.getHeightOffset();
        TopAppBarState topAppBarState = enterAlwaysScrollBehavior.f10218a;
        topAppBarState.setHeightOffset(Offset.m2276getYimpl(available) + topAppBarState.getHeightOffset());
        return heightOffset == enterAlwaysScrollBehavior.f10218a.getHeightOffset() ? Offset.INSTANCE.m2291getZeroF1C5BW0() : Offset.m2269copydBAh8RU$default(available, 0.0f, 0.0f, 2, null);
    }
}
