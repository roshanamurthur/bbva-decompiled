package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b.\u0010/Jd\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042;\u0010\u000b\u001a7\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\u0003\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0001¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0014J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014R4\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010+\u001a\u0004\u0018\u00010\u00142\b\u0010&\u001a\u0004\u0018\u00010\u00148@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001d\u0010-\u001a\u00020\u00178VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b,\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "", "name", "", "viewportWidth", "viewportHeight", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "Landroidx/compose/runtime/Composable;", "content", "RenderVector$ui_release", "(Ljava/lang/String;FFLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "RenderVector", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "Landroidx/compose/ui/geometry/Size;", "<set-?>", "f", "Landroidx/compose/runtime/MutableState;", "getSize-NH-jbRc$ui_release", "()J", "setSize-uvyYCjk$ui_release", "(J)V", "size", "g", "getAutoMirror$ui_release", "()Z", "setAutoMirror$ui_release", "(Z)V", "autoMirror", "value", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n81#2:421\n107#2,2:422\n81#2:424\n107#2,2:425\n81#2:427\n107#2,2:428\n281#3:430\n282#3:448\n173#4,6:431\n261#4,11:437\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n178#1:421\n178#1:422,2\n180#1:424\n180#1:425,2\n219#1:427\n219#1:428,2\n255#1:430\n255#1:448\n255#1:431,6\n255#1:437,11\n*E\n"})
public final class VectorPainter extends Painter {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState size = SnapshotStateKt.mutableStateOf$default(Size.m2332boximpl(Size.INSTANCE.m2353getZeroNHjbRc()), null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState autoMirror = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final VectorComponent f16105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Composition f16106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableState f16107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f16108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ColorFilter f16109l;

    /* JADX INFO: compiled from: VectorPainter.kt */
    @SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,420:1\n63#2,5:421\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n*L\n239#1:421,5\n*E\n"})
    public static final class a extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Composition f16111p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Composition composition) {
            super(1);
            this.f16111p0 = composition;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final Composition composition = this.f16111p0;
            return new DisposableEffectResult() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    composition.dispose();
                }
            };
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f16113q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f16114r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f16115s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function4<Float, Float, Composer, Integer, Unit> f16116t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f16117u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, float f6, float f10, Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> function4, int i10) {
            super(2);
            this.f16113q0 = str;
            this.f16114r0 = f6;
            this.f16115s0 = f10;
            this.f16116t0 = function4;
            this.f16117u0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            VectorPainter.this.RenderVector$ui_release(this.f16113q0, this.f16114r0, this.f16115s0, this.f16116t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16117u0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VectorPainter.access$setDirty(VectorPainter.this, true);
            return Unit.INSTANCE;
        }
    }

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.setInvalidateCallback$ui_release(new c());
        this.f16105h = vectorComponent;
        this.f16107j = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.f16108k = 1.0f;
    }

    public static final void access$setDirty(VectorPainter vectorPainter, boolean z10) {
        vectorPainter.f16107j.setValue(Boolean.valueOf(z10));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void RenderVector$ui_release(@NotNull String name, float f6, float f10, @NotNull Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1264894527);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264894527, i10, -1, "androidx.compose.ui.graphics.vector.VectorPainter.RenderVector (VectorPainter.kt:221)");
        }
        VectorComponent vectorComponent = this.f16105h;
        vectorComponent.setName(name);
        vectorComponent.setViewportWidth(f6);
        vectorComponent.setViewportHeight(f10);
        CompositionContext compositionContextRememberCompositionContext = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
        Composition Composition = this.f16106i;
        if (Composition == null || Composition.getP0()) {
            Composition = CompositionKt.Composition(new VectorApplier(vectorComponent.getRoot()), compositionContextRememberCompositionContext);
        }
        this.f16106i = Composition;
        Composition.setContent(ComposableLambdaKt.composableLambdaInstance(-1916507005, true, new b1.b(content, this)));
        EffectsKt.DisposableEffect(Composition, new a(Composition), composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(name, f6, f10, content, i10));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.f16108k = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.f16109l = colorFilter;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror.getValue()).booleanValue();
    }

    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.f16105h.getIntrinsicColorFilter$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        return m3024getSizeNHjbRc$ui_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m3024getSizeNHjbRc$ui_release() {
        return ((Size) this.size.getValue()).getF15551a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        ColorFilter intrinsicColorFilter$ui_release = this.f16109l;
        VectorComponent vectorComponent = this.f16105h;
        if (intrinsicColorFilter$ui_release == null) {
            intrinsicColorFilter$ui_release = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo2908getCenterF1C5BW0 = drawScope.mo2908getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo2922scale0AR0LA0(-1.0f, 1.0f, jMo2908getCenterF1C5BW0);
            vectorComponent.draw(drawScope, this.f16108k, intrinsicColorFilter$ui_release);
            drawContext.getCanvas().restore();
            drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
        } else {
            vectorComponent.draw(drawScope, this.f16108k, intrinsicColorFilter$ui_release);
        }
        MutableState mutableState = this.f16107j;
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            mutableState.setValue(Boolean.FALSE);
        }
    }

    public final void setAutoMirror$ui_release(boolean z10) {
        this.autoMirror.setValue(Boolean.valueOf(z10));
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter) {
        this.f16105h.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m3025setSizeuvyYCjk$ui_release(long j10) {
        this.size.setValue(Size.m2332boximpl(j10));
    }
}
