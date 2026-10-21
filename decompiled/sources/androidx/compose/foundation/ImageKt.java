package androidx.compose.foundation;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Image.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0017\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Image", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "Image-5h-nEew", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,269:1\n36#2:270\n36#2:277\n456#2,8:295\n464#2,6:309\n1097#3,6:271\n1097#3,6:278\n78#4,11:284\n91#4:315\n4144#5,6:303\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n154#1:270\n246#1:277\n256#1:295,8\n256#1:309,6\n154#1:271,6\n246#1:278,6\n256#1:284,11\n256#1:315\n256#1:303,6\n*E\n"})
public final class ImageKt {

    /* JADX INFO: compiled from: Image.kt */
    public static final class a implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3377a = new a();

        /* JADX INFO: renamed from: androidx.compose.foundation.ImageKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Image.kt */
        public static final class C0010a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final C0010a f3378p0 = new C0010a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                return Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> list, long j10) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            return MeasureScope.CC.q(Layout, Constraints.m4359getMinWidthimpl(j10), Constraints.m4358getMinHeightimpl(j10), null, C0010a.f3378p0, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX INFO: compiled from: Image.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Painter f3379p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f3380q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f3381r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Alignment f3382s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ContentScale f3383t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f3384u0;
        public final /* synthetic */ ColorFilter v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f3385w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f3386x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Painter painter, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f6, ColorFilter colorFilter, int i10, int i11) {
            super(2);
            this.f3379p0 = painter;
            this.f3380q0 = str;
            this.f3381r0 = modifier;
            this.f3382s0 = alignment;
            this.f3383t0 = contentScale;
            this.f3384u0 = f6;
            this.v0 = colorFilter;
            this.f3385w0 = i10;
            this.f3386x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ImageKt.Image(this.f3379p0, this.f3380q0, this.f3381r0, this.f3382s0, this.f3383t0, this.f3384u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f3385w0 | 1), this.f3386x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Image.kt */
    public static final class c extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f3387p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f3387p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, this.f3387p0);
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3834getImageo7Vup1c());
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    @Composable
    public static final /* synthetic */ void Image(ImageBitmap bitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f6, ColorFilter colorFilter, Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        composer.startReplaceableGroup(-2123228673);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i11 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i11 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f10 = (i11 & 32) != 0 ? 1.0f : f6;
        ColorFilter colorFilter2 = (i11 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123228673, i10, -1, "androidx.compose.foundation.Image (Image.kt:87)");
        }
        m158Image5hnEew(bitmap, str, modifier2, center, fit, f10, colorFilter2, FilterQuality.INSTANCE.m2600getLowfv9h1I(), composer, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m158Image5hnEew(@NotNull ImageBitmap bitmap, @Nullable String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f6, @Nullable ColorFilter colorFilter, int i10, @Nullable Composer composer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        composer.startReplaceableGroup(-1396260732);
        Modifier modifier2 = (i12 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i12 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i12 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f10 = (i12 & 32) != 0 ? 1.0f : f6;
        ColorFilter colorFilter2 = (i12 & 64) != 0 ? null : colorFilter;
        int iM2940getDefaultFilterQualityfv9h1I = (i12 & 128) != 0 ? DrawScope.INSTANCE.m2940getDefaultFilterQualityfv9h1I() : i10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1396260732, i11, -1, "androidx.compose.foundation.Image (Image.kt:143)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(bitmap);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = BitmapPainterKt.m3004BitmapPainterQZhYCtY$default(bitmap, 0L, 0L, iM2940getDefaultFilterQualityfv9h1I, 6, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Image((BitmapPainter) objRememberedValue, str, modifier2, center, fit, f10, colorFilter2, composer, (i11 & 112) | 8 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(@NotNull ImageVector imageVector, @Nullable String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f6, @Nullable ColorFilter colorFilter, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        composer.startReplaceableGroup(1595907091);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i11 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i11 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f10 = (i11 & 32) != 0 ? 1.0f : f6;
        ColorFilter colorFilter2 = (i11 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595907091, i10, -1, "androidx.compose.foundation.Image (Image.kt:189)");
        }
        Image(VectorPainterKt.rememberVectorPainter(imageVector, composer, i10 & 14), str, modifier2, center, fit, f10, colorFilter2, composer, VectorPainter.$stable | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(@NotNull Painter painter, @Nullable String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f6, @Nullable ColorFilter colorFilter, @Nullable Composer composer, int i10, int i11) {
        Modifier modifierSemantics$default;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer composerStartRestartGroup = composer.startRestartGroup(1142754848);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i11 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i11 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f10 = (i11 & 32) != 0 ? 1.0f : f6;
        ColorFilter colorFilter2 = (i11 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1142754848, i10, -1, "androidx.compose.foundation.Image (Image.kt:235)");
        }
        composerStartRestartGroup.startReplaceableGroup(-816794123);
        if (str != null) {
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new c(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
        } else {
            modifierSemantics$default = Modifier.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierPaint$default = PainterModifierKt.paint$default(ClipKt.clipToBounds(modifier2.then(modifierSemantics$default)), painter, false, center, fit, f10, colorFilter2, 2, null);
        a aVar = a.f3377a;
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPaint$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
        Updater.m2081setimpl(composerM2074constructorimpl, aVar, companion2.getSetMeasurePolicy());
        Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(painter, str, modifier2, center, fit, f10, colorFilter2, i10, i11));
    }
}
