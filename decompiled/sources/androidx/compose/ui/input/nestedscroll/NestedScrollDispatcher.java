package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J#\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0016\u00101\u001a\u0004\u0018\u00010.8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00064"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchPreScroll-OzD1aCk", "(JI)J", "dispatchPreScroll", "consumed", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPostScroll", "Landroidx/compose/ui/unit/Velocity;", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPreFling", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPostFling", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "a", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "getModifierLocalNode$ui_release", "()Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "setModifierLocalNode$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocalModifierNode;)V", "modifierLocalNode", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlin/jvm/functions/Function0;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "setCalculateNestedScrollScope$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "calculateNestedScrollScope", "c", "Lkotlinx/coroutines/CoroutineScope;", "getScope$ui_release", "()Lkotlinx/coroutines/CoroutineScope;", "setScope$ui_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "scope", "getCoroutineScope", "coroutineScope", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class NestedScrollDispatcher {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ModifierLocalModifierNode modifierLocalNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<? extends CoroutineScope> calculateNestedScrollScope = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CoroutineScope scope;

    /* JADX INFO: compiled from: NestedScrollModifier.kt */
    public static final class a extends Lambda implements Function0<CoroutineScope> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return NestedScrollDispatcher.this.getScope();
        }
    }

    /* JADX INFO: compiled from: NestedScrollModifier.kt */
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {221}, m = "dispatchPostFling-RZ2iAVY", n = {}, s = {})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f16323p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f16325r0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16323p0 = obj;
            this.f16325r0 |= Integer.MIN_VALUE;
            return NestedScrollDispatcher.this.m3380dispatchPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    /* JADX INFO: compiled from: NestedScrollModifier.kt */
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {206}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f16326p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f16328r0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16326p0 = obj;
            this.f16328r0 |= Integer.MIN_VALUE;
            return NestedScrollDispatcher.this.m3382dispatchPreFlingQWom1Mo(0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    public final Object m3380dispatchPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation<? super Velocity> continuation) {
        b bVar;
        long jM4625getZero9UxMQ8M;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f16325r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f16325r0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object objMo218onPostFlingRZ2iAVY = bVar2.f16323p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar2.f16325r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objMo218onPostFlingRZ2iAVY);
            NestedScrollConnection parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                bVar2.f16325r0 = 1;
                objMo218onPostFlingRZ2iAVY = parent$ui_release.mo218onPostFlingRZ2iAVY(j10, j11, bVar2);
                if (objMo218onPostFlingRZ2iAVY == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                jM4625getZero9UxMQ8M = Velocity.INSTANCE.m4625getZero9UxMQ8M();
            }
            return Velocity.m4605boximpl(jM4625getZero9UxMQ8M);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objMo218onPostFlingRZ2iAVY);
        jM4625getZero9UxMQ8M = ((Velocity) objMo218onPostFlingRZ2iAVY).getF18328a();
        return Velocity.m4605boximpl(jM4625getZero9UxMQ8M);
    }

    /* JADX INFO: renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m3381dispatchPostScrollDzOQY0M(long consumed, long available, int source) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo219onPostScrollDzOQY0M(consumed, available, source) : Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    public final Object m3382dispatchPreFlingQWom1Mo(long j10, @NotNull Continuation<? super Velocity> continuation) {
        c cVar;
        long jM4625getZero9UxMQ8M;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f16328r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f16328r0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objMo220onPreFlingQWom1Mo = cVar.f16326p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f16328r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objMo220onPreFlingQWom1Mo);
            NestedScrollConnection parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                cVar.f16328r0 = 1;
                objMo220onPreFlingQWom1Mo = parent$ui_release.mo220onPreFlingQWom1Mo(j10, cVar);
                if (objMo220onPreFlingQWom1Mo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                jM4625getZero9UxMQ8M = Velocity.INSTANCE.m4625getZero9UxMQ8M();
            }
            return Velocity.m4605boximpl(jM4625getZero9UxMQ8M);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objMo220onPreFlingQWom1Mo);
        jM4625getZero9UxMQ8M = ((Velocity) objMo220onPreFlingQWom1Mo).getF18328a();
        return Velocity.m4605boximpl(jM4625getZero9UxMQ8M);
    }

    /* JADX INFO: renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m3383dispatchPreScrollOzD1aCk(long available, int source) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo221onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m2291getZeroF1C5BW0();
    }

    @NotNull
    public final Function0<CoroutineScope> getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScopeInvoke = this.calculateNestedScrollScope.invoke();
        if (coroutineScopeInvoke != null) {
            return coroutineScopeInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Nullable
    /* JADX INFO: renamed from: getModifierLocalNode$ui_release, reason: from getter */
    public final ModifierLocalModifierNode getModifierLocalNode() {
        return this.modifierLocalNode;
    }

    @Nullable
    public final NestedScrollConnection getParent$ui_release() {
        ModifierLocalModifierNode modifierLocalModifierNode = this.modifierLocalNode;
        if (modifierLocalModifierNode != null) {
            return (NestedScrollNode) modifierLocalModifierNode.getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getScope$ui_release, reason: from getter */
    public final CoroutineScope getScope() {
        return this.scope;
    }

    public final void setCalculateNestedScrollScope$ui_release(@NotNull Function0<? extends CoroutineScope> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.calculateNestedScrollScope = function0;
    }

    public final void setModifierLocalNode$ui_release(@Nullable ModifierLocalModifierNode modifierLocalModifierNode) {
        this.modifierLocalNode = modifierLocalModifierNode;
    }

    public final void setScope$ui_release(@Nullable CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }
}
