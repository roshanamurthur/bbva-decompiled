package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyAnimateScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "", FirebaseAnalytics.Param.INDEX, "scrollOffset", "", "animateScrollToItem", "(Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,268:1\n154#2:269\n154#2:270\n154#2:271\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n34#1:269\n35#1:270\n36#1:271\n*E\n"})
public final class LazyAnimateScrollKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f4927a = Dp.m4389constructorimpl(2500);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f4928b = Dp.m4389constructorimpl(1500);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f4929c = Dp.m4389constructorimpl(50);

    /* JADX INFO: compiled from: LazyAnimateScroll.kt */
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {137, 237}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
    @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,268:1\n1#2:269\n40#3,4:270\n40#3,4:274\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n*L\n129#1:270,4\n234#1:274,4\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ LazyAnimateScrollScope E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.BooleanRef f4930p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Ref.ObjectRef f4931q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Ref.IntRef f4932r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public float f4933s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public float f4934t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public float f4935u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f4936w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public /* synthetic */ Object f4937x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f4938y0;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LazyAnimateScroll.kt */
        @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,268:1\n40#2,4:269\n40#2,4:273\n40#2,4:277\n40#2,4:281\n40#2,4:285\n40#2,4:289\n40#2,4:293\n40#2,4:297\n40#2,4:301\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$3\n*L\n152#1:269,4\n159#1:273,4\n162#1:277,4\n170#1:281,4\n175#1:285,4\n186#1:289,4\n198#1:293,4\n211#1:297,4\n221#1:301,4\n*E\n"})
        public static final class C0032a extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
            public final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> E0;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LazyAnimateScrollScope f4939p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ int f4940q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ float f4941r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f4942s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ ScrollScope f4943t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f4944u0;
            public final /* synthetic */ boolean v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public final /* synthetic */ float f4945w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f4946x0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public final /* synthetic */ int f4947y0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0032a(LazyAnimateScrollScope lazyAnimateScrollScope, int i10, float f6, Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.BooleanRef booleanRef, boolean z10, float f10, Ref.IntRef intRef, int i11, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef) {
                super(1);
                this.f4939p0 = lazyAnimateScrollScope;
                this.f4940q0 = i10;
                this.f4941r0 = f6;
                this.f4942s0 = floatRef;
                this.f4943t0 = scrollScope;
                this.f4944u0 = booleanRef;
                this.v0 = z10;
                this.f4945w0 = f10;
                this.f4946x0 = intRef;
                this.f4947y0 = i11;
                this.E0 = objectRef;
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
            /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                AnimationScope<Float, AnimationVector1D> animateTo = animationScope;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                LazyAnimateScrollScope lazyAnimateScrollScope = this.f4939p0;
                int i10 = this.f4940q0;
                Integer targetItemOffset = lazyAnimateScrollScope.getTargetItemOffset(i10);
                Ref.BooleanRef booleanRef = this.f4944u0;
                int i11 = this.f4947y0;
                boolean z10 = this.v0;
                ScrollScope scrollScope = this.f4943t0;
                if (targetItemOffset == null) {
                    float f6 = this.f4941r0;
                    float fCoerceAtMost = f6 > 0.0f ? kotlin.ranges.c.coerceAtMost(animateTo.getValue().floatValue(), f6) : kotlin.ranges.c.coerceAtLeast(animateTo.getValue().floatValue(), f6);
                    Ref.FloatRef floatRef = this.f4942s0;
                    float f10 = fCoerceAtMost - floatRef.element;
                    float fScrollBy = scrollScope.scrollBy(f10);
                    Integer targetItemOffset2 = lazyAnimateScrollScope.getTargetItemOffset(i10);
                    if (targetItemOffset2 == null && !a.a(z10, lazyAnimateScrollScope, i10, i11)) {
                        if (f10 == fScrollBy) {
                            floatRef.element += f10;
                            float f11 = this.f4945w0;
                            if (z10) {
                                if (animateTo.getValue().floatValue() > f11) {
                                    animateTo.cancelAnimation();
                                }
                            } else if (animateTo.getValue().floatValue() < (-f11)) {
                                animateTo.cancelAnimation();
                            }
                            Ref.IntRef intRef = this.f4946x0;
                            if (z10) {
                                if (intRef.element >= 2 && i10 - lazyAnimateScrollScope.getLastVisibleItemIndex() > lazyAnimateScrollScope.getNumOfItemsForTeleport()) {
                                    lazyAnimateScrollScope.snapToItem(scrollScope, i10 - lazyAnimateScrollScope.getNumOfItemsForTeleport(), 0);
                                }
                            } else if (intRef.element >= 2 && lazyAnimateScrollScope.getFirstVisibleItemIndex() - i10 > lazyAnimateScrollScope.getNumOfItemsForTeleport()) {
                                lazyAnimateScrollScope.snapToItem(scrollScope, lazyAnimateScrollScope.getNumOfItemsForTeleport() + i10, 0);
                            }
                        } else {
                            animateTo.cancelAnimation();
                            booleanRef.element = false;
                        }
                    }
                    targetItemOffset = targetItemOffset2;
                    if (a.a(z10, lazyAnimateScrollScope, i10, i11)) {
                        lazyAnimateScrollScope.snapToItem(scrollScope, i10, i11);
                        booleanRef.element = false;
                        animateTo.cancelAnimation();
                    } else if (targetItemOffset != null) {
                        throw new c(targetItemOffset.intValue(), this.E0.element);
                    }
                } else if (a.a(z10, lazyAnimateScrollScope, i10, i11)) {
                    lazyAnimateScrollScope.snapToItem(scrollScope, i10, i11);
                    booleanRef.element = false;
                    animateTo.cancelAnimation();
                } else if (targetItemOffset != null) {
                    throw new c(targetItemOffset.intValue(), this.E0.element);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: LazyAnimateScroll.kt */
        @SourceDebugExtension({"SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n+ 2 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,268:1\n40#2,4:269\n40#2,4:273\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2$5\n*L\n247#1:269,4\n252#1:273,4\n*E\n"})
        public static final class b extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ float f4948p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Ref.FloatRef f4949q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ ScrollScope f4950r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(float f6, Ref.FloatRef floatRef, ScrollScope scrollScope) {
                super(1);
                this.f4948p0 = f6;
                this.f4949q0 = floatRef;
                this.f4950r0 = scrollScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                AnimationScope<Float, AnimationVector1D> animateTo = animationScope;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                float f6 = this.f4948p0;
                float fCoerceAtLeast = 0.0f;
                if (f6 > 0.0f) {
                    fCoerceAtLeast = kotlin.ranges.c.coerceAtMost(animateTo.getValue().floatValue(), f6);
                } else if (f6 < 0.0f) {
                    fCoerceAtLeast = kotlin.ranges.c.coerceAtLeast(animateTo.getValue().floatValue(), f6);
                }
                Ref.FloatRef floatRef = this.f4949q0;
                float f10 = fCoerceAtLeast - floatRef.element;
                if (f10 != this.f4950r0.scrollBy(f10) || fCoerceAtLeast != animateTo.getValue().floatValue()) {
                    animateTo.cancelAnimation();
                }
                floatRef.element += f10;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LazyAnimateScrollScope lazyAnimateScrollScope, int i10, int i11, Continuation continuation) {
            super(2, continuation);
            this.f4938y0 = i10;
            this.E0 = lazyAnimateScrollScope;
            this.F0 = i11;
        }

        public static final boolean a(boolean z10, LazyAnimateScrollScope lazyAnimateScrollScope, int i10, int i11) {
            if (z10) {
                if (lazyAnimateScrollScope.getFirstVisibleItemIndex() <= i10 && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i10 || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i11)) {
                    return false;
                }
            } else if (lazyAnimateScrollScope.getFirstVisibleItemIndex() >= i10 && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i10 || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i11)) {
                return false;
            }
            return true;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.E0, this.f4938y0, this.F0, continuation);
            aVar.f4937x0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((a) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00c6 A[Catch: c -> 0x01b4, TRY_LEAVE, TryCatch #3 {c -> 0x01b4, blocks: (B:26:0x00c0, B:28:0x00c6, B:40:0x00ed, B:44:0x012f, B:48:0x013c), top: B:94:0x00c0 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00d6 A[Catch: c -> 0x00e3, TRY_ENTER, TRY_LEAVE, TryCatch #4 {c -> 0x00e3, blocks: (B:59:0x019c, B:31:0x00d6), top: B:96:0x019c }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e8 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:42:0x012a  */
        /* JADX WARN: Code duplicated, block: B:43:0x012d  */
        /* JADX WARN: Code duplicated, block: B:46:0x0137  */
        /* JADX WARN: Code duplicated, block: B:47:0x013a  */
        /* JADX WARN: Code duplicated, block: B:57:0x0193 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:58:0x0194  */
        /* JADX WARN: Code duplicated, block: B:94:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Type inference failed for: r6v9, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0194 -> B:96:0x019c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r37) {
            /*
                Method dump skipped, instruction units count: 580
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Nullable
    public static final Object animateScrollToItem(@NotNull LazyAnimateScrollScope lazyAnimateScrollScope, int i10, int i11, @NotNull Continuation<? super Unit> continuation) {
        Object objScroll = lazyAnimateScrollScope.scroll(new a(lazyAnimateScrollScope, i10, i11, null), continuation);
        return objScroll == ek.a.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }
}
