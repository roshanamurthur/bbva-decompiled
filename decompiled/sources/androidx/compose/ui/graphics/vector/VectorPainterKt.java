package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import b1.a;
import bk.q;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0099\u0001\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2@\u0010\u0011\u001a<\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a£\u0001\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162@\u0010\u0011\u001a<\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u0007\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u0015\u0010\u001c\u001a-\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fH\u0007¢\u0006\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "", "name", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "content", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter-mlNsNFs", "(FFFFLjava/lang/String;JILkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter", "", "autoMirror", "rememberVectorPainter-vIP8VLU", "(FFFFLjava/lang/String;JIZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/ImageVector;", AuthConstants.IMAGE, "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "group", "", "Landroidx/compose/ui/graphics/vector/VectorConfig;", "configs", "RenderVectorGroup", "(Landroidx/compose/ui/graphics/vector/VectorGroup;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)V", "RootGroupName", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n76#2:421\n1#3:422\n50#4:423\n49#4:424\n25#4:431\n1097#5,6:425\n1097#5,6:432\n173#6,6:438\n261#6,11:444\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n*L\n127#1:421\n134#1:423\n134#1:424\n142#1:431\n134#1:425,6\n142#1:432,6\n281#1:438,6\n281#1:444,11\n*E\n"})
public final class VectorPainterKt {

    @NotNull
    public static final String RootGroupName = "VectorRootGroup";

    /* JADX INFO: compiled from: VectorPainter.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ VectorNode f16119p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Map<String, VectorConfig> f16120q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(VectorNode vectorNode, Map<String, ? extends VectorConfig> map) {
            super(2);
            this.f16119p0 = vectorNode;
            this.f16120q0 = map;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1450046638, iIntValue, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:413)");
                }
                VectorPainterKt.RenderVectorGroup((VectorGroup) this.f16119p0, this.f16120q0, composer2, 64, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ VectorGroup f16121p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Map<String, VectorConfig> f16122q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f16123r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f16124s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(VectorGroup vectorGroup, Map<String, ? extends VectorConfig> map, int i10, int i11) {
            super(2);
            this.f16121p0 = vectorGroup;
            this.f16122q0 = map;
            this.f16123r0 = i10;
            this.f16124s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f16123r0 | 1);
            VectorPainterKt.RenderVectorGroup(this.f16121p0, this.f16122q0, composer, iUpdateChangedFlags, this.f16124s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    public static final class c extends Lambda implements Function4<Float, Float, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ImageVector f16125p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ImageVector imageVector) {
            super(4);
            this.f16125p0 = imageVector;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(Float f6, Float f10, Composer composer, Integer num) {
            f6.floatValue();
            f10.floatValue();
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1873274766, iIntValue, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous> (VectorPainter.kt:167)");
                }
                VectorPainterKt.RenderVectorGroup(this.f16125p0.getRoot(), null, composer2, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @Composable
    public static final void RenderVectorGroup(@NotNull VectorGroup group, @Nullable Map<String, ? extends VectorConfig> map, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Map<String, ? extends VectorConfig> map2;
        Composer composer2;
        Map<String, ? extends VectorConfig> map3;
        Intrinsics.checkNotNullParameter(group, "group");
        Composer composerStartRestartGroup = composer.startRestartGroup(-446179233);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(group) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 16;
        }
        if (i13 == 2 && (i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            map2 = map;
            composer2 = composerStartRestartGroup;
        } else {
            Map<String, ? extends VectorConfig> mapEmptyMap = i13 != 0 ? q.emptyMap() : map;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446179233, i10, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:327)");
            }
            Iterator<VectorNode> it = group.iterator();
            while (it.hasNext()) {
                VectorNode next = it.next();
                if (next instanceof VectorPath) {
                    composerStartRestartGroup.startReplaceableGroup(-326285735);
                    VectorPath vectorPath = (VectorPath) next;
                    VectorConfig vectorConfig = mapEmptyMap.get(vectorPath.getName());
                    if (vectorConfig == null) {
                        vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                            @Override // androidx.compose.ui.graphics.vector.VectorConfig
                            public final /* synthetic */ Object getOrDefault(VectorProperty vectorProperty, Object obj) {
                                return a.a(this, vectorProperty, obj);
                            }
                        };
                    }
                    VectorConfig vectorConfig2 = vectorConfig;
                    Composer composer3 = composerStartRestartGroup;
                    VectorComposeKt.m3023Path9cdaXJ4((List) vectorConfig2.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.getPathFillType(), vectorPath.getName(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig2.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig2.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.getStrokeLineCap(), vectorPath.getStrokeLineJoin(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), composer3, 8, 0, 0);
                    composer3.endReplaceableGroup();
                    it = it;
                    mapEmptyMap = mapEmptyMap;
                    composerStartRestartGroup = composer3;
                } else {
                    Iterator<VectorNode> it2 = it;
                    Map<String, ? extends VectorConfig> map4 = mapEmptyMap;
                    Composer composer4 = composerStartRestartGroup;
                    if (next instanceof VectorGroup) {
                        composer4.startReplaceableGroup(-326283877);
                        VectorGroup vectorGroup = (VectorGroup) next;
                        map3 = map4;
                        VectorConfig vectorConfig3 = map3.get(vectorGroup.getName());
                        if (vectorConfig3 == null) {
                            vectorConfig3 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                                @Override // androidx.compose.ui.graphics.vector.VectorConfig
                                public final /* synthetic */ Object getOrDefault(VectorProperty vectorProperty, Object obj) {
                                    return a.a(this, vectorProperty, obj);
                                }
                            };
                        }
                        VectorComposeKt.Group(vectorGroup.getName(), ((Number) vectorConfig3.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup.getAndroidx.constraintlayout.motion.widget.Key.ROTATION java.lang.String()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup.getPivotX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup.getPivotY()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup.getScaleX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup.getScaleY()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup.getTranslationX()))).floatValue(), ((Number) vectorConfig3.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup.getTranslationY()))).floatValue(), (List) vectorConfig3.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup.getClipPathData()), ComposableLambdaKt.composableLambda(composer4, 1450046638, true, new a(next, map3)), composer4, 939524096, 0);
                        composer4.endReplaceableGroup();
                    } else {
                        map3 = map4;
                        composer4.startReplaceableGroup(-326282407);
                        composer4.endReplaceableGroup();
                    }
                    composerStartRestartGroup = composer4;
                    mapEmptyMap = map3;
                    it = it2;
                }
            }
            map2 = mapEmptyMap;
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(group, map2, i10, i11));
    }

    @Composable
    @NotNull
    public static final VectorPainter rememberVectorPainter(@NotNull ImageVector image, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(image, "image");
        composer.startReplaceableGroup(1413834416);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:157)");
        }
        VectorPainter vectorPainterM3027rememberVectorPaintervIP8VLU = m3027rememberVectorPaintervIP8VLU(image.getDefaultWidth(), image.getDefaultHeight(), image.getViewportWidth(), image.getViewportHeight(), image.getName(), image.getTintColor(), image.getTintBlendMode(), image.getAutoMirror(), ComposableLambdaKt.composableLambda(composer, 1873274766, true, new c(image)), composer, 100663296, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainterM3027rememberVectorPaintervIP8VLU;
    }

    @ComposableOpenTarget(index = -1)
    @NotNull
    @Deprecated(message = "Replace rememberVectorPainter graphicsLayer that consumes the auto mirror flag", replaceWith = @ReplaceWith(expression = "rememberVectorPainter(defaultWidth, defaultHeight, viewportWidth, viewportHeight, name, tintColor, tintBlendMode, false, content)", imports = {"androidx.compose.ui.graphics.vector"}))
    @Composable
    /* JADX INFO: renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m3026rememberVectorPaintermlNsNFs(float f6, float f10, float f11, float f12, @Nullable String str, long j10, int i10, @NotNull Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-964365210);
        float f13 = (i12 & 4) != 0 ? Float.NaN : f11;
        float f14 = (i12 & 8) != 0 ? Float.NaN : f12;
        String str2 = (i12 & 16) != 0 ? RootGroupName : str;
        long jM2544getUnspecified0d7_KjU = (i12 & 32) != 0 ? Color.INSTANCE.m2544getUnspecified0d7_KjU() : j10;
        int iM2457getSrcIn0nO6VwU = (i12 & 64) != 0 ? BlendMode.INSTANCE.m2457getSrcIn0nO6VwU() : i10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-964365210, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:73)");
        }
        VectorPainter vectorPainterM3027rememberVectorPaintervIP8VLU = m3027rememberVectorPaintervIP8VLU(f6, f10, f13, f14, str2, jM2544getUnspecified0d7_KjU, iM2457getSrcIn0nO6VwU, false, content, composer, (i11 & 14) | 12582912 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | ((i11 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainterM3027rememberVectorPaintervIP8VLU;
    }

    @Composable
    @ComposableOpenTarget(index = -1)
    @NotNull
    /* JADX INFO: renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    public static final VectorPainter m3027rememberVectorPaintervIP8VLU(float f6, float f10, float f11, float f12, @Nullable String str, long j10, int i10, boolean z10, @NotNull Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i11, int i12) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1068590786);
        float f13 = (i12 & 4) != 0 ? Float.NaN : f11;
        float f14 = (i12 & 8) == 0 ? f12 : Float.NaN;
        String str2 = (i12 & 16) != 0 ? RootGroupName : str;
        long jM2544getUnspecified0d7_KjU = (i12 & 32) != 0 ? Color.INSTANCE.m2544getUnspecified0d7_KjU() : j10;
        int iM2457getSrcIn0nO6VwU = (i12 & 64) != 0 ? BlendMode.INSTANCE.m2457getSrcIn0nO6VwU() : i10;
        boolean z11 = (i12 & 128) != 0 ? false : z10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1068590786, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:115)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float fMo415toPx0680j_4 = density.mo415toPx0680j_4(f6);
        float fMo415toPx0680j_5 = density.mo415toPx0680j_4(f10);
        if (Float.isNaN(f13)) {
            f13 = fMo415toPx0680j_4;
        }
        if (Float.isNaN(f14)) {
            f14 = fMo415toPx0680j_5;
        }
        Color colorM2498boximpl = Color.m2498boximpl(jM2544getUnspecified0d7_KjU);
        BlendMode blendModeM2425boximpl = BlendMode.m2425boximpl(iM2457getSrcIn0nO6VwU);
        int i13 = i11 >> 15;
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(colorM2498boximpl) | composer.changed(blendModeM2425boximpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = !Color.m2509equalsimpl0(jM2544getUnspecified0d7_KjU, Color.INSTANCE.m2544getUnspecified0d7_KjU()) ? ColorFilter.INSTANCE.m2552tintxETnrds(jM2544getUnspecified0d7_KjU, iM2457getSrcIn0nO6VwU) : null;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ColorFilter colorFilter = (ColorFilter) objRememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new VectorPainter();
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        VectorPainter vectorPainter = (VectorPainter) objRememberedValue2;
        vectorPainter.m3025setSizeuvyYCjk$ui_release(SizeKt.Size(fMo415toPx0680j_4, fMo415toPx0680j_5));
        vectorPainter.setAutoMirror$ui_release(z11);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.RenderVector$ui_release(str2, f13, f14, content, composer, ((i11 >> 12) & 14) | 32768 | (i13 & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vectorPainter;
    }
}
