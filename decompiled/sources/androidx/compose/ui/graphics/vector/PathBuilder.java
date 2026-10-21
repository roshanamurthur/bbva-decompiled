package androidx.compose.ui.graphics.vector;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0005\u001a\u00020\u0000J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006J6\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006J6\u0010 \u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006J&\u0010!\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J&\u0010\"\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006J&\u0010#\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J&\u0010$\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006J\u0016\u0010%\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\u0016\u0010&\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006J>\u0010-\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J>\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006¨\u00063"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "getNodes", HearingDisabilitiesConstants.CLOSE_MODAL, "", "x", "y", "moveTo", "dx", "dy", "moveToRelative", "lineTo", "lineToRelative", "horizontalLineTo", "horizontalLineToRelative", "verticalLineTo", "verticalLineToRelative", "x1", "y1", "x2", "y2", "x3", "y3", "curveTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "curveToRelative", "reflectiveCurveTo", "reflectiveCurveToRelative", "quadTo", "quadToRelative", "reflectiveQuadTo", "reflectiveQuadToRelative", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcTo", "a", "b", "arcToRelative", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class PathBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f15944a = new ArrayList();

    public final void a(PathNode pathNode) {
        this.f15944a.add(pathNode);
    }

    @NotNull
    public final PathBuilder arcTo(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float x4, float y7) {
        a(new PathNode.ArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, x4, y7));
        return this;
    }

    @NotNull
    public final PathBuilder arcToRelative(float a10, float b10, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float dx1, float dy1) {
        a(new PathNode.RelativeArcTo(a10, b10, theta, isMoreThanHalf, isPositiveArc, dx1, dy1));
        return this;
    }

    @NotNull
    public final PathBuilder close() {
        a(PathNode.Close.INSTANCE);
        return this;
    }

    @NotNull
    public final PathBuilder curveTo(float x4, float y7, float x6, float y10, float x7, float y11) {
        a(new PathNode.CurveTo(x4, y7, x6, y10, x7, y11));
        return this;
    }

    @NotNull
    public final PathBuilder curveToRelative(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        a(new PathNode.RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3));
        return this;
    }

    @NotNull
    public final List<PathNode> getNodes() {
        return this.f15944a;
    }

    @NotNull
    public final PathBuilder horizontalLineTo(float x4) {
        a(new PathNode.HorizontalTo(x4));
        return this;
    }

    @NotNull
    public final PathBuilder horizontalLineToRelative(float dx) {
        a(new PathNode.RelativeHorizontalTo(dx));
        return this;
    }

    @NotNull
    public final PathBuilder lineTo(float x4, float y7) {
        a(new PathNode.LineTo(x4, y7));
        return this;
    }

    @NotNull
    public final PathBuilder lineToRelative(float dx, float dy) {
        a(new PathNode.RelativeLineTo(dx, dy));
        return this;
    }

    @NotNull
    public final PathBuilder moveTo(float x4, float y7) {
        a(new PathNode.MoveTo(x4, y7));
        return this;
    }

    @NotNull
    public final PathBuilder moveToRelative(float dx, float dy) {
        a(new PathNode.RelativeMoveTo(dx, dy));
        return this;
    }

    @NotNull
    public final PathBuilder quadTo(float x4, float y7, float x6, float y10) {
        a(new PathNode.QuadTo(x4, y7, x6, y10));
        return this;
    }

    @NotNull
    public final PathBuilder quadToRelative(float dx1, float dy1, float dx2, float dy2) {
        a(new PathNode.RelativeQuadTo(dx1, dy1, dx2, dy2));
        return this;
    }

    @NotNull
    public final PathBuilder reflectiveCurveTo(float x4, float y7, float x6, float y10) {
        a(new PathNode.ReflectiveCurveTo(x4, y7, x6, y10));
        return this;
    }

    @NotNull
    public final PathBuilder reflectiveCurveToRelative(float dx1, float dy1, float dx2, float dy2) {
        a(new PathNode.RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2));
        return this;
    }

    @NotNull
    public final PathBuilder reflectiveQuadTo(float x4, float y7) {
        a(new PathNode.ReflectiveQuadTo(x4, y7));
        return this;
    }

    @NotNull
    public final PathBuilder reflectiveQuadToRelative(float dx1, float dy1) {
        a(new PathNode.RelativeReflectiveQuadTo(dx1, dy1));
        return this;
    }

    @NotNull
    public final PathBuilder verticalLineTo(float y7) {
        a(new PathNode.VerticalTo(y7));
        return this;
    }

    @NotNull
    public final PathBuilder verticalLineToRelative(float dy) {
        a(new PathNode.RelativeVerticalTo(dy));
        return this;
    }
}
