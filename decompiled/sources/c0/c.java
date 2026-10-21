package c0;

import androidx.compose.foundation.relocation.BringIntoViewChildNode;
import androidx.compose.foundation.relocation.BringIntoViewKt;
import androidx.compose.foundation.relocation.BringIntoViewParent;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
public final class c extends BringIntoViewChildNode implements BringIntoViewParent {

    @NotNull
    public BringIntoViewResponder J0;

    @NotNull
    public final ModifierLocalMap K0;

    /* JADX INFO: compiled from: BringIntoViewResponder.kt */
    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f25326p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LayoutCoordinates f25328r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<Rect> f25329s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<Rect> f25330t0;

        /* JADX INFO: renamed from: c0.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BringIntoViewResponder.kt */
        @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0111a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f25331p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ c f25332q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ LayoutCoordinates f25333r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Function0<Rect> f25334s0;

            /* JADX INFO: renamed from: c0.c$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BringIntoViewResponder.kt */
            public /* synthetic */ class C0112a extends FunctionReferenceImpl implements Function0<Rect> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ c f25335p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ LayoutCoordinates f25336q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ Function0<Rect> f25337r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0112a(c cVar, LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
                    super(0, Intrinsics.Kotlin.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f25335p0 = cVar;
                    this.f25336q0 = layoutCoordinates;
                    this.f25337r0 = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Rect invoke() {
                    Rect rectInvoke;
                    LayoutCoordinates layoutCoordinates = this.f25335p0.getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return null;
                    }
                    LayoutCoordinates layoutCoordinates2 = this.f25336q0;
                    if (!layoutCoordinates2.isAttached()) {
                        layoutCoordinates2 = null;
                    }
                    if (layoutCoordinates2 == null || (rectInvoke = this.f25337r0.invoke()) == null) {
                        return null;
                    }
                    return rectInvoke.m2312translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false).m2310getTopLeftF1C5BW0());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0111a(c cVar, LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation<? super C0111a> continuation) {
                super(2, continuation);
                this.f25332q0 = cVar;
                this.f25333r0 = layoutCoordinates;
                this.f25334s0 = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0111a(this.f25332q0, this.f25333r0, this.f25334s0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0111a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f25331p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    c cVar = this.f25332q0;
                    BringIntoViewResponder bringIntoViewResponder = cVar.J0;
                    C0112a c0112a = new C0112a(cVar, this.f25333r0, this.f25334s0);
                    this.f25331p0 = 1;
                    if (bringIntoViewResponder.bringChildIntoView(c0112a, this) == coroutine_suspended) {
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

        /* JADX INFO: compiled from: BringIntoViewResponder.kt */
        @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f25338p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ c f25339q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Function0<Rect> f25340r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, Function0<Rect> function0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f25339q0 = cVar;
                this.f25340r0 = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f25339q0, this.f25340r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f25338p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    c cVar = this.f25339q0;
                    BringIntoViewParent parent = cVar.getParent();
                    LayoutCoordinates layoutCoordinates = cVar.getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return Unit.INSTANCE;
                    }
                    this.f25338p0 = 1;
                    if (parent.bringChildIntoView(layoutCoordinates, this.f25340r0, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Function0<Rect> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f25328r0 = layoutCoordinates;
            this.f25329s0 = function0;
            this.f25330t0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = c.this.new a(this.f25328r0, this.f25329s0, this.f25330t0, continuation);
            aVar.f25326p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f25326p0;
            LayoutCoordinates layoutCoordinates = this.f25328r0;
            Function0<Rect> function0 = this.f25329s0;
            c cVar = c.this;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0111a(cVar, layoutCoordinates, function0, null), 3, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(cVar, this.f25330t0, null), 3, null);
        }
    }

    /* JADX INFO: compiled from: BringIntoViewResponder.kt */
    @SourceDebugExtension({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringChildIntoView$parentRect$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
    public static final class b extends Lambda implements Function0<Rect> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LayoutCoordinates f25342q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Rect> f25343r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LayoutCoordinates layoutCoordinates, Function0<Rect> function0) {
            super(0);
            this.f25342q0 = layoutCoordinates;
            this.f25343r0 = function0;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0009  */
        @Override // kotlin.jvm.functions.Function0
        public final Rect invoke() {
            Rect rectInvoke;
            Rect rectM2312translatek4lQ0M;
            c cVar = c.this;
            LayoutCoordinates layoutCoordinates = cVar.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                rectM2312translatek4lQ0M = null;
            } else {
                LayoutCoordinates layoutCoordinates2 = this.f25342q0;
                if (!layoutCoordinates2.isAttached()) {
                    layoutCoordinates2 = null;
                }
                if (layoutCoordinates2 == null || (rectInvoke = this.f25343r0.invoke()) == null) {
                    rectM2312translatek4lQ0M = null;
                } else {
                    rectM2312translatek4lQ0M = rectInvoke.m2312translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false).m2310getTopLeftF1C5BW0());
                }
            }
            if (rectM2312translatek4lQ0M != null) {
                return cVar.J0.calculateRectForParent(rectM2312translatek4lQ0M);
            }
            return null;
        }
    }

    public c(@NotNull BringIntoViewResponder responder) {
        Intrinsics.checkNotNullParameter(responder, "responder");
        this.J0 = responder;
        this.K0 = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(BringIntoViewKt.getModifierLocalBringIntoViewParent(), this));
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    @Nullable
    public final Object bringChildIntoView(@NotNull LayoutCoordinates layoutCoordinates, @NotNull Function0<Rect> function0, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(layoutCoordinates, function0, new b(layoutCoordinates, function0), null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewChildNode, androidx.compose.ui.modifier.ModifierLocalModifierNode
    @NotNull
    public final ModifierLocalMap getProvidedValues() {
        return this.K0;
    }
}
