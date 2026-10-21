package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GraphicsLayerScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0006\u0010\u0001\u001a\u00020\u0000\"\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "GraphicsLayerScope", "", "DefaultCameraDistance", "F", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getDefaultShadowColor", "()J", "DefaultShadowColor", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class GraphicsLayerScopeKt {
    public static final float DefaultCameraDistance = 8.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f15659a = Color.INSTANCE.m2534getBlack0d7_KjU();

    @NotNull
    public static final GraphicsLayerScope GraphicsLayerScope() {
        return new ReusableGraphicsLayerScope();
    }

    public static final long getDefaultShadowColor() {
        return f15659a;
    }
}
