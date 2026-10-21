package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u000e\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "contentDescription", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "tint", "", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Icon", "Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,170:1\n76#2:171\n76#2:172\n76#2:180\n36#3:173\n36#3:181\n1097#4,6:174\n1097#4,6:182\n154#5:188\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n*L\n66#1:171\n100#1:172\n134#1:180\n102#1:173\n139#1:181\n102#1:174,6\n139#1:182,6\n169#1:188\n*E\n"})
public final class IconKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Modifier f7224a = SizeKt.m335size3ABfNKs(Modifier.INSTANCE, Dp.m4389constructorimpl(24));

    /* JADX INFO: compiled from: Icon.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Painter f7225p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f7226q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7227r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f7228s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7229t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7230u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Painter painter, String str, Modifier modifier, long j10, int i10, int i11) {
            super(2);
            this.f7225p0 = painter;
            this.f7226q0 = str;
            this.f7227r0 = modifier;
            this.f7228s0 = j10;
            this.f7229t0 = i10;
            this.f7230u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            IconKt.m780Iconww6aTOc(this.f7225p0, this.f7226q0, this.f7227r0, this.f7228s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7229t0 | 1), this.f7230u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Icon.kt */
    public static final class b extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f7231p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f7231p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, this.f7231p0);
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3834getImageo7Vup1c());
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m781Iconww6aTOc(@NotNull ImageVector imageVector, @Nullable String str, @Nullable Modifier modifier, long j10, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        composer.startReplaceableGroup(-800853103);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800853103, i10, -1, "androidx.compose.material.Icon (Icon.kt:61)");
        }
        m780Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composer, i10 & 14), str, modifier2, jM2507copywmQWz5c$default, composer, VectorPainter.$stable | (i10 & 112) | (i10 & 896) | (i10 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m779Iconww6aTOc(@NotNull ImageBitmap bitmap, @Nullable String str, @Nullable Modifier modifier, long j10, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        composer.startReplaceableGroup(-554892675);
        Modifier modifier2 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        long jM2507copywmQWz5c$default = (i11 & 8) != 0 ? Color.m2507copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554892675, i10, -1, "androidx.compose.material.Icon (Icon.kt:95)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(bitmap);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(bitmap, 0L, 0L, 6, null);
            composer.updateRememberedValue(bitmapPainter);
            objRememberedValue = bitmapPainter;
        }
        composer.endReplaceableGroup();
        m780Iconww6aTOc((BitmapPainter) objRememberedValue, str, modifier2, jM2507copywmQWz5c$default, composer, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m780Iconww6aTOc(@NotNull Painter painter, @Nullable String str, @Nullable Modifier modifier, long j10, @Nullable Composer composer, int i10, int i11) {
        long jM2507copywmQWz5c$default;
        int i12;
        Modifier modifierSemantics$default;
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1142959010);
        Modifier modifier3 = (i11 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i11 & 8) != 0) {
            i12 = i10 & (-7169);
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default = j10;
            i12 = i10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1142959010, i12, -1, "androidx.compose.material.Icon (Icon.kt:129)");
        }
        ColorFilter colorFilterM2549tintxETnrds$default = Color.m2509equalsimpl0(jM2507copywmQWz5c$default, Color.INSTANCE.m2544getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m2549tintxETnrds$default(ColorFilter.INSTANCE, jM2507copywmQWz5c$default, 0, 2, null);
        composerStartRestartGroup.startReplaceableGroup(1547387026);
        if (str != null) {
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new b(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
        } else {
            modifierSemantics$default = Modifier.INSTANCE;
        }
        Modifier modifier4 = modifierSemantics$default;
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifier5 = GraphicsLayerModifierKt.toolingGraphicsLayer(modifier3);
        if (!Size.m2340equalsimpl0(painter.getIntrinsicSize(), Size.INSTANCE.m2352getUnspecifiedNHjbRc())) {
            long intrinsicSize = painter.getIntrinsicSize();
            if (!Float.isInfinite(Size.m2344getWidthimpl(intrinsicSize)) || !Float.isInfinite(Size.m2341getHeightimpl(intrinsicSize))) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = f7224a;
            }
        } else {
            modifier2 = f7224a;
        }
        long j11 = jM2507copywmQWz5c$default;
        BoxKt.Box(PainterModifierKt.paint$default(modifier5.then(modifier2), painter, false, null, ContentScale.INSTANCE.getFit(), 0.0f, colorFilterM2549tintxETnrds$default, 22, null).then(modifier4), composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(painter, str, modifier3, j11, i10, i11));
    }
}
