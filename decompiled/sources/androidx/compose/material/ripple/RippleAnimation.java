package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import k0.b;
import k0.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RippleAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B$\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0002J\u001f\u0010\u000b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "", "animate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finish", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "color", "draw-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", "draw", "Landroidx/compose/ui/geometry/Offset;", "origin", "Landroidx/compose/ui/unit/Dp;", "radius", "", "bounded", "<init>", "(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,194:1\n81#2:195\n107#2,2:196\n81#2:198\n107#2,2:199\n137#3:201\n214#4,8:202\n261#4,11:210\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n76#1:195\n76#1:196,2\n77#1:198\n77#1:199,2\n130#1:201\n158#1:202,8\n158#1:210,11\n*E\n"})
public final class RippleAnimation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Offset f8957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Float f8960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Float f8961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Offset f8962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, AnimationVector1D> f8963g = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, AnimationVector1D> f8964h = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, AnimationVector1D> f8965i = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<Unit> f8966j = CompletableDeferredKt.CompletableDeferred((Job) null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableState f8967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableState f8968l;

    /* JADX INFO: compiled from: RippleAnimation.kt */
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {80, 82, 83}, m = "animate", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public RippleAnimation f8969p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f8970q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f8972s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f8970q0 = obj;
            this.f8972s0 |= Integer.MIN_VALUE;
            return RippleAnimation.this.animate(this);
        }
    }

    public RippleAnimation(Offset offset, float f6, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this.f8957a = offset;
        this.f8958b = f6;
        this.f8959c = z10;
        Boolean bool = Boolean.FALSE;
        this.f8967k = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f8968l = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public static final Object access$fadeIn(RippleAnimation rippleAnimation, Continuation continuation) {
        rippleAnimation.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new b(rippleAnimation, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public static final Object access$fadeOut(RippleAnimation rippleAnimation, Continuation continuation) {
        rippleAnimation.getClass();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new c(rippleAnimation, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object animate(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        RippleAnimation rippleAnimation;
        Object objCoroutineScope;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f8972s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f8972s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f8970q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f8972s0;
        if (i11 != 0) {
            if (i11 == 1) {
                rippleAnimation = aVar.f8969p0;
                ResultKt.throwOnFailure(obj);
            } else if (i11 == 2) {
                rippleAnimation = aVar.f8969p0;
                ResultKt.throwOnFailure(obj);
                aVar.f8969p0 = null;
                aVar.f8972s0 = 3;
                rippleAnimation.getClass();
                objCoroutineScope = CoroutineScopeKt.coroutineScope(new c(rippleAnimation, null), aVar);
                if (objCoroutineScope != ek.a.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        aVar.f8969p0 = this;
        aVar.f8972s0 = 1;
        Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(new b(this, null), aVar);
        if (objCoroutineScope2 != ek.a.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope2 = Unit.INSTANCE;
        }
        if (objCoroutineScope2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        rippleAnimation = this;
        rippleAnimation.f8967k.setValue(Boolean.TRUE);
        aVar.f8969p0 = rippleAnimation;
        aVar.f8972s0 = 2;
        if (rippleAnimation.f8966j.await(aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        aVar.f8969p0 = null;
        aVar.f8972s0 = 3;
        rippleAnimation.getClass();
        objCoroutineScope = CoroutineScopeKt.coroutineScope(new c(rippleAnimation, null), aVar);
        if (objCoroutineScope != ek.a.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        if (objCoroutineScope == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m894draw4WTKRHQ(@NotNull DrawScope draw, long j10) {
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        if (this.f8960d == null) {
            this.f8960d = Float.valueOf(RippleAnimationKt.m896getRippleStartRadiusuvyYCjk(draw.mo2909getSizeNHjbRc()));
        }
        Float f6 = this.f8961e;
        boolean z10 = this.f8959c;
        if (f6 == null) {
            float f10 = this.f8958b;
            this.f8961e = Float.isNaN(f10) ? Float.valueOf(RippleAnimationKt.m895getRippleEndRadiuscSwnlzA(draw, z10, draw.mo2909getSizeNHjbRc())) : Float.valueOf(draw.mo415toPx0680j_4(f10));
        }
        if (this.f8957a == null) {
            this.f8957a = Offset.m2264boximpl(draw.mo2908getCenterF1C5BW0());
        }
        if (this.f8962f == null) {
            this.f8962f = Offset.m2264boximpl(OffsetKt.Offset(Size.m2344getWidthimpl(draw.mo2909getSizeNHjbRc()) / 2.0f, Size.m2341getHeightimpl(draw.mo2909getSizeNHjbRc()) / 2.0f));
        }
        float fFloatValue = (!((Boolean) this.f8968l.getValue()).booleanValue() || ((Boolean) this.f8967k.getValue()).booleanValue()) ? this.f8963g.getValue().floatValue() : 1.0f;
        Float f11 = this.f8960d;
        Intrinsics.checkNotNull(f11);
        float fFloatValue2 = f11.floatValue();
        Float f12 = this.f8961e;
        Intrinsics.checkNotNull(f12);
        float fLerp = MathHelpersKt.lerp(fFloatValue2, f12.floatValue(), this.f8964h.getValue().floatValue());
        Offset offset = this.f8957a;
        Intrinsics.checkNotNull(offset);
        float fM2275getXimpl = Offset.m2275getXimpl(offset.getF15533a());
        Offset offset2 = this.f8962f;
        Intrinsics.checkNotNull(offset2);
        float fM2275getXimpl2 = Offset.m2275getXimpl(offset2.getF15533a());
        Animatable<Float, AnimationVector1D> animatable = this.f8965i;
        float fLerp2 = MathHelpersKt.lerp(fM2275getXimpl, fM2275getXimpl2, animatable.getValue().floatValue());
        Offset offset3 = this.f8957a;
        Intrinsics.checkNotNull(offset3);
        float fM2276getYimpl = Offset.m2276getYimpl(offset3.getF15533a());
        Offset offset4 = this.f8962f;
        Intrinsics.checkNotNull(offset4);
        long jOffset = OffsetKt.Offset(fLerp2, MathHelpersKt.lerp(fM2276getYimpl, Offset.m2276getYimpl(offset4.getF15533a()), animatable.getValue().floatValue()));
        long jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(j10, Color.m2510getAlphaimpl(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!z10) {
            a1.b.x(draw, jM2507copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fM2344getWidthimpl = Size.m2344getWidthimpl(draw.mo2909getSizeNHjbRc());
        float fM2341getHeightimpl = Size.m2341getHeightimpl(draw.mo2909getSizeNHjbRc());
        int iM2497getIntersectrtfAjoo = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
        DrawContext drawContext = draw.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2918clipRectN_I0leg(0.0f, 0.0f, fM2344getWidthimpl, fM2341getHeightimpl, iM2497getIntersectrtfAjoo);
        a1.b.x(draw, jM2507copywmQWz5c$default, fLerp, jOffset, 0.0f, null, null, 0, 120, null);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
    }

    public final void finish() {
        this.f8968l.setValue(Boolean.TRUE);
        this.f8966j.complete(Unit.INSTANCE);
    }
}
