package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.unit.Velocity;
import h1.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NestedScrollNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b,\u0010\u001eJ%\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J!\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "", "onAttach", "onDetach", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "updateNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "updateNode", "H0", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "J0", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class NestedScrollNode extends Modifier.Node implements ModifierLocalModifierNode, NestedScrollConnection {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public NestedScrollConnection connection;

    @NotNull
    public NestedScrollDispatcher I0;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @NotNull
    public final ModifierLocalMap providedValues;

    /* JADX INFO: compiled from: NestedScrollNode.kt */
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 0, 1}, l = {105, 106}, m = "onPostFling-RZ2iAVY", n = {"this", "consumed", "available", "selfConsumed"}, s = {"L$0", "J$0", "J$1", "J$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public NestedScrollNode f16331p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f16332q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f16333r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f16334s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f16336u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16334s0 = obj;
            this.f16336u0 |= Integer.MIN_VALUE;
            return NestedScrollNode.this.mo218onPostFlingRZ2iAVY(0L, 0L, this);
        }
    }

    /* JADX INFO: compiled from: NestedScrollNode.kt */
    @DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", i = {0, 0, 1}, l = {98, 99}, m = "onPreFling-QWom1Mo", n = {"this", "available", "parentPreConsumed"}, s = {"L$0", "J$0", "J$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public NestedScrollNode f16337p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f16338q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f16339r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f16341t0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16339r0 = obj;
            this.f16341t0 |= Integer.MIN_VALUE;
            return NestedScrollNode.this.mo220onPreFlingQWom1Mo(0L, this);
        }
    }

    public NestedScrollNode(@NotNull NestedScrollConnection connection, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.connection = connection;
        this.I0 = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(NestedScrollNodeKt.getModifierLocalNestedScroll(), this));
    }

    public final CoroutineScope a() {
        CoroutineScope scope;
        NestedScrollNode nestedScrollNode = getIsAttached() ? (NestedScrollNode) c.a(this, NestedScrollNodeKt.getModifierLocalNestedScroll()) : null;
        if ((nestedScrollNode == null || (scope = nestedScrollNode.a()) == null) && (scope = this.I0.getScope()) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return scope;
    }

    public final NestedScrollConnection b() {
        if (getIsAttached()) {
            return (NestedScrollConnection) c.a(this, NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    @NotNull
    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public final /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return c.a(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @NotNull
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.I0.setModifierLocalNode$ui_release(this);
        this.I0.setCalculateNestedScrollScope$ui_release(new d1.b(this));
        this.I0.setScope$ui_release(getCoroutineScope());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        if (this.I0.getModifierLocalNode() == this) {
            this.I0.setModifierLocalNode$ui_release(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo218onPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation<? super Velocity> continuation) {
        a aVar;
        long j12;
        long j13;
        NestedScrollNode nestedScrollNode;
        long j14;
        long jM4625getZero9UxMQ8M;
        long j15;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f16336u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f16336u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objMo218onPostFlingRZ2iAVY = aVar.f16334s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f16336u0;
        if (i11 != 0) {
            if (i11 == 1) {
                long j16 = aVar.f16333r0;
                long j17 = aVar.f16332q0;
                nestedScrollNode = aVar.f16331p0;
                ResultKt.throwOnFailure(objMo218onPostFlingRZ2iAVY);
                j13 = j16;
                j12 = j17;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = aVar.f16332q0;
                ResultKt.throwOnFailure(objMo218onPostFlingRZ2iAVY);
            }
            jM4625getZero9UxMQ8M = ((Velocity) objMo218onPostFlingRZ2iAVY).getF18328a();
            j14 = j15;
            return Velocity.m4605boximpl(Velocity.m4618plusAH228Gc(j14, jM4625getZero9UxMQ8M));
        }
        ResultKt.throwOnFailure(objMo218onPostFlingRZ2iAVY);
        NestedScrollConnection nestedScrollConnection = this.connection;
        aVar.f16331p0 = this;
        j12 = j10;
        aVar.f16332q0 = j12;
        j13 = j11;
        aVar.f16333r0 = j13;
        aVar.f16336u0 = 1;
        objMo218onPostFlingRZ2iAVY = nestedScrollConnection.mo218onPostFlingRZ2iAVY(j10, j11, aVar);
        if (objMo218onPostFlingRZ2iAVY == coroutine_suspended) {
            return coroutine_suspended;
        }
        nestedScrollNode = this;
        long f18328a = ((Velocity) objMo218onPostFlingRZ2iAVY).getF18328a();
        NestedScrollConnection nestedScrollConnectionB = nestedScrollNode.b();
        if (nestedScrollConnectionB != null) {
            long jM4618plusAH228Gc = Velocity.m4618plusAH228Gc(j12, f18328a);
            long jM4617minusAH228Gc = Velocity.m4617minusAH228Gc(j13, f18328a);
            aVar.f16331p0 = null;
            aVar.f16332q0 = f18328a;
            aVar.f16336u0 = 2;
            objMo218onPostFlingRZ2iAVY = nestedScrollConnectionB.mo218onPostFlingRZ2iAVY(jM4618plusAH228Gc, jM4617minusAH228Gc, aVar);
            if (objMo218onPostFlingRZ2iAVY == coroutine_suspended) {
                return coroutine_suspended;
            }
            j15 = f18328a;
            jM4625getZero9UxMQ8M = ((Velocity) objMo218onPostFlingRZ2iAVY).getF18328a();
            j14 = j15;
        } else {
            j14 = f18328a;
            jM4625getZero9UxMQ8M = Velocity.INSTANCE.m4625getZero9UxMQ8M();
        }
        return Velocity.m4605boximpl(Velocity.m4618plusAH228Gc(j14, jM4625getZero9UxMQ8M));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo219onPostScrollDzOQY0M(long consumed, long available, int source) {
        long jMo219onPostScrollDzOQY0M = this.connection.mo219onPostScrollDzOQY0M(consumed, available, source);
        NestedScrollConnection nestedScrollConnectionB = b();
        return Offset.m2280plusMKHz9U(jMo219onPostScrollDzOQY0M, nestedScrollConnectionB != null ? nestedScrollConnectionB.mo219onPostScrollDzOQY0M(Offset.m2280plusMKHz9U(consumed, jMo219onPostScrollDzOQY0M), Offset.m2279minusMKHz9U(available, jMo219onPostScrollDzOQY0M), source) : Offset.INSTANCE.m2291getZeroF1C5BW0());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo220onPreFlingQWom1Mo(long j10, @NotNull Continuation<? super Velocity> continuation) {
        b bVar;
        long jM4625getZero9UxMQ8M;
        NestedScrollNode nestedScrollNode;
        long j11;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f16341t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f16341t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objMo220onPreFlingQWom1Mo = bVar.f16339r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f16341t0;
        if (i11 != 0) {
            if (i11 == 1) {
                j10 = bVar.f16338q0;
                nestedScrollNode = bVar.f16337p0;
                ResultKt.throwOnFailure(objMo220onPreFlingQWom1Mo);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = bVar.f16338q0;
                ResultKt.throwOnFailure(objMo220onPreFlingQWom1Mo);
            }
            return Velocity.m4605boximpl(Velocity.m4618plusAH228Gc(j11, ((Velocity) objMo220onPreFlingQWom1Mo).getF18328a()));
        }
        ResultKt.throwOnFailure(objMo220onPreFlingQWom1Mo);
        NestedScrollConnection nestedScrollConnectionB = b();
        if (nestedScrollConnectionB != null) {
            bVar.f16337p0 = this;
            bVar.f16338q0 = j10;
            bVar.f16341t0 = 1;
            objMo220onPreFlingQWom1Mo = nestedScrollConnectionB.mo220onPreFlingQWom1Mo(j10, bVar);
            if (objMo220onPreFlingQWom1Mo == coroutine_suspended) {
                return coroutine_suspended;
            }
            nestedScrollNode = this;
        } else {
            jM4625getZero9UxMQ8M = Velocity.INSTANCE.m4625getZero9UxMQ8M();
            nestedScrollNode = this;
        }
        long j12 = j10;
        j11 = jM4625getZero9UxMQ8M;
        NestedScrollConnection nestedScrollConnection = nestedScrollNode.connection;
        long jM4617minusAH228Gc = Velocity.m4617minusAH228Gc(j12, j11);
        bVar.f16337p0 = null;
        bVar.f16338q0 = j11;
        bVar.f16341t0 = 2;
        objMo220onPreFlingQWom1Mo = nestedScrollConnection.mo220onPreFlingQWom1Mo(jM4617minusAH228Gc, bVar);
        if (objMo220onPreFlingQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Velocity.m4605boximpl(Velocity.m4618plusAH228Gc(j11, ((Velocity) objMo220onPreFlingQWom1Mo).getF18328a()));
        jM4625getZero9UxMQ8M = ((Velocity) objMo220onPreFlingQWom1Mo).getF18328a();
        long j13 = j10;
        j11 = jM4625getZero9UxMQ8M;
        NestedScrollConnection nestedScrollConnection2 = nestedScrollNode.connection;
        long jM4617minusAH228Gc2 = Velocity.m4617minusAH228Gc(j13, j11);
        bVar.f16337p0 = null;
        bVar.f16338q0 = j11;
        bVar.f16341t0 = 2;
        objMo220onPreFlingQWom1Mo = nestedScrollConnection2.mo220onPreFlingQWom1Mo(jM4617minusAH228Gc2, bVar);
        if (objMo220onPreFlingQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Velocity.m4605boximpl(Velocity.m4618plusAH228Gc(j11, ((Velocity) objMo220onPreFlingQWom1Mo).getF18328a()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo221onPreScrollOzD1aCk(long available, int source) {
        NestedScrollConnection nestedScrollConnectionB = b();
        long jMo221onPreScrollOzD1aCk = nestedScrollConnectionB != null ? nestedScrollConnectionB.mo221onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m2291getZeroF1C5BW0();
        return Offset.m2280plusMKHz9U(jMo221onPreScrollOzD1aCk, this.connection.mo221onPreScrollOzD1aCk(Offset.m2279minusMKHz9U(available, jMo221onPreScrollOzD1aCk), source));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        c.c(this, modifierLocal, obj);
    }

    public final void setConnection(@NotNull NestedScrollConnection nestedScrollConnection) {
        Intrinsics.checkNotNullParameter(nestedScrollConnection, "<set-?>");
        this.connection = nestedScrollConnection;
    }

    public final void updateNode$ui_release(@NotNull NestedScrollConnection connection, @Nullable NestedScrollDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.connection = connection;
        if (this.I0.getModifierLocalNode() == this) {
            this.I0.setModifierLocalNode$ui_release(null);
        }
        if (dispatcher == null) {
            this.I0 = new NestedScrollDispatcher();
        } else if (!Intrinsics.areEqual(dispatcher, this.I0)) {
            this.I0 = dispatcher;
        }
        if (getIsAttached()) {
            this.I0.setModifierLocalNode$ui_release(this);
            this.I0.setCalculateNestedScrollScope$ui_release(new d1.b(this));
            this.I0.setScope$ui_release(getCoroutineScope());
        }
    }
}
