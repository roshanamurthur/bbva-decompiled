package androidx.compose.ui.draw;

import androidx.activity.a;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w0.b;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lw0/b;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class DrawWithCacheElement extends ModifierNodeElement<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<CacheDrawScope, DrawResult> f15446b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(@NotNull Function1<? super CacheDrawScope, DrawResult> onBuildDrawCache) {
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        this.f15446b = onBuildDrawCache;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new b(new CacheDrawScope(), this.f15446b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && Intrinsics.areEqual(this.f15446b, ((DrawWithCacheElement) obj).f15446b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f15446b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        a.c(inspectorInfo, "<this>", "drawWithCache").set("onBuildDrawCache", this.f15446b);
    }

    @NotNull
    public final String toString() {
        return ci.a.c(new StringBuilder("DrawWithCacheElement(onBuildDrawCache="), this.f15446b, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        b node2 = (b) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Function1<CacheDrawScope, DrawResult> value = this.f15446b;
        Intrinsics.checkNotNullParameter(value, "value");
        node2.J0 = value;
        node2.invalidateDrawCache();
    }
}
