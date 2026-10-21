package androidx.compose.material.pullrefresh;

import androidx.activity.a;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PullRefreshIndicatorTransform.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"pullRefreshIndicatorTransform", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", ImageScaleTypeHandler.ID, "", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPullRefreshIndicatorTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,75:1\n135#2:76\n146#2:77\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n*L\n42#1:76\n42#1:77\n*E\n"})
public final class PullRefreshIndicatorTransformKt {

    /* JADX INFO: compiled from: PullRefreshIndicatorTransform.kt */
    @SourceDebugExtension({"SMAP\nPullRefreshIndicatorTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,75:1\n214#2,8:76\n261#2,11:84\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1\n*L\n55#1:76,8\n55#1:84,11\n*E\n"})
    public static final class a extends Lambda implements Function1<ContentDrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f8885p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ContentDrawScope contentDrawScope) {
            ContentDrawScope drawWithContent = contentDrawScope;
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            int iM2497getIntersectrtfAjoo = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
            DrawContext drawContext = drawWithContent.getDrawContext();
            long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo2918clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iM2497getIntersectrtfAjoo);
            drawWithContent.drawContent();
            drawContext.getCanvas().restore();
            drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: PullRefreshIndicatorTransform.kt */
    public static final class b extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PullRefreshState f8886p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f8887q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PullRefreshState pullRefreshState, boolean z10) {
            super(1);
            this.f8886p0 = pullRefreshState;
            this.f8887q0 = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            GraphicsLayerScope graphicsLayer = graphicsLayerScope;
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            PullRefreshState pullRefreshState = this.f8886p0;
            graphicsLayer.setTranslationY(pullRefreshState.getPosition$material_release() - Size.m2341getHeightimpl(graphicsLayer.getSize()));
            if (this.f8887q0 && !pullRefreshState.getRefreshing$material_release()) {
                float fCoerceIn = c.coerceIn(EasingKt.getLinearOutSlowInEasing().transform(pullRefreshState.getPosition$material_release() / pullRefreshState.getThreshold$material_release()), 0.0f, 1.0f);
                graphicsLayer.setScaleX(fCoerceIn);
                graphicsLayer.setScaleY(fCoerceIn);
            }
            return Unit.INSTANCE;
        }
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final Modifier pullRefreshIndicatorTransform(@NotNull Modifier modifier, @NotNull final PullRefreshState state, final boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                a.c(inspectorInfo, "$this$null", "pullRefreshIndicatorTransform").set("state", state);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set(ImageScaleTypeHandler.ID, Boolean.valueOf(z10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(Modifier.INSTANCE, a.f8885p0), new b(state, z10)));
    }

    public static /* synthetic */ Modifier pullRefreshIndicatorTransform$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pullRefreshIndicatorTransform(modifier, pullRefreshState, z10);
    }
}
