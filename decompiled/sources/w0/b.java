package w0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,312:1\n84#2:313\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n*L\n190#1:313\n*E\n"})
public final class b extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {

    @NotNull
    public final CacheDrawScope H0;
    public boolean I0;

    @NotNull
    public Function1<? super CacheDrawScope, DrawResult> J0;

    public b(@NotNull CacheDrawScope cacheDrawScope, @NotNull Function1<? super CacheDrawScope, DrawResult> block) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(block, "block");
        this.H0 = cacheDrawScope;
        this.J0 = block;
        cacheDrawScope.setCacheParams$ui_release(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        boolean z10 = this.I0;
        CacheDrawScope cacheDrawScope = this.H0;
        if (!z10) {
            cacheDrawScope.setDrawResult$ui_release(null);
            ObserverModifierNodeKt.observeReads(this, new a(this, cacheDrawScope));
            if (cacheDrawScope.getDrawResult() == null) {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
            this.I0 = true;
        }
        DrawResult drawResult = cacheDrawScope.getDrawResult();
        Intrinsics.checkNotNull(drawResult);
        drawResult.getBlock$ui_release().invoke(contentDrawScope);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @NotNull
    public final Density getDensity() {
        return DelegatableNodeKt.requireDensity(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this);
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public final long mo2199getSizeNHjbRc() {
        return IntSizeKt.m4559toSizeozmzZPI(DelegatableNodeKt.m3653requireCoordinator64DMado(this, NodeKind.m3725constructorimpl(128)).mo3581getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.draw.CacheDrawModifierNode
    public final void invalidateDrawCache() {
        this.I0 = false;
        this.H0.setDrawResult$ui_release(null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void onMeasureResultChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        invalidateDrawCache();
    }
}
