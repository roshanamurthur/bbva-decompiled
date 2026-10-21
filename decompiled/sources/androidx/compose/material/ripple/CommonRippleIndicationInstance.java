package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CommonRipple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B6\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "drawIndication", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "addRipple", "removeRipple", "onRemembered", "onForgotten", "onAbandoned", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n215#2,2:120\n215#2,2:122\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n*L\n77#1:120,2\n99#1:122,2\n*E\n"})
public final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f8935q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final float f8936r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final State<Color> f8937s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final State<RippleAlpha> f8938t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final SnapshotStateMap<PressInteraction.Press, RippleAnimation> f8939u0;

    /* JADX INFO: compiled from: CommonRipple.kt */
    @DebugMetadata(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f8940p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RippleAnimation f8941q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommonRippleIndicationInstance f8942r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PressInteraction.Press f8943s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, PressInteraction.Press press, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8941q0 = rippleAnimation;
            this.f8942r0 = commonRippleIndicationInstance;
            this.f8943s0 = press;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f8941q0, this.f8942r0, this.f8943s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f8940p0;
            PressInteraction.Press press = this.f8943s0;
            CommonRippleIndicationInstance commonRippleIndicationInstance = this.f8942r0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    RippleAnimation rippleAnimation = this.f8941q0;
                    this.f8940p0 = 1;
                    if (rippleAnimation.animate(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                commonRippleIndicationInstance.f8939u0.remove(press);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                commonRippleIndicationInstance.f8939u0.remove(press);
                throw th2;
            }
        }
    }

    public CommonRippleIndicationInstance() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRippleIndicationInstance(boolean z10, float f6, State color, State rippleAlpha, DefaultConstructorMarker defaultConstructorMarker) {
        super(z10, rippleAlpha);
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f8935q0 = z10;
        this.f8936r0 = f6;
        this.f8937s0 = color;
        this.f8938t0 = rippleAlpha;
        this.f8939u0 = SnapshotStateKt.mutableStateMapOf();
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(@NotNull PressInteraction.Press interaction, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        SnapshotStateMap<PressInteraction.Press, RippleAnimation> snapshotStateMap = this.f8939u0;
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = snapshotStateMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().finish();
        }
        boolean z10 = this.f8935q0;
        RippleAnimation rippleAnimation = new RippleAnimation(z10 ? Offset.m2264boximpl(interaction.getPressPosition()) : null, this.f8936r0, z10, null);
        snapshotStateMap.put(interaction, rippleAnimation);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new a(rippleAnimation, this, interaction, null), 3, null);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long jM2518unboximpl = this.f8937s0.getValue().m2518unboximpl();
        contentDrawScope.drawContent();
        m899drawStateLayerH2RKhps(contentDrawScope, this.f8936r0, jM2518unboximpl);
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.f8939u0.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.f8938t0.getValue().getPressedAlpha();
            if (pressedAlpha != 0.0f) {
                value.m894draw4WTKRHQ(contentDrawScope, Color.m2507copywmQWz5c$default(jM2518unboximpl, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.f8939u0.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.f8939u0.clear();
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(@NotNull PressInteraction.Press interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        RippleAnimation rippleAnimation = this.f8939u0.get(interaction);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
