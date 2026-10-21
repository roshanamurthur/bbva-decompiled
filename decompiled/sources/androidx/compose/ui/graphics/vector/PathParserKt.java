package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathParser.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\u001a\u001a\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"", "Landroidx/compose/ui/graphics/vector/PathNode;", "Landroidx/compose/ui/graphics/Path;", "target", "toPath", "", "a", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,553:1\n552#1:560\n33#2,6:554\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n405#1:560\n174#1:554,6\n*E\n"})
public final class PathParserKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final float[] f16029a = new float[0];

    public static final void a(Path path, double d2, double d3, double d7, double d10, double d11, double d12, double d13, boolean z10, boolean z11) {
        double d14;
        double d15;
        double d16 = d11;
        double d17 = (d13 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d17);
        double dSin = Math.sin(d17);
        double d18 = ((d3 * dSin) + (d2 * dCos)) / d16;
        double d19 = ((d3 * dCos) + ((-d2) * dSin)) / d12;
        double d20 = ((d10 * dSin) + (d7 * dCos)) / d16;
        double d21 = ((d10 * dCos) + ((-d7) * dSin)) / d12;
        double d22 = d18 - d20;
        double d23 = d19 - d21;
        double d24 = 2;
        double d25 = (d18 + d20) / d24;
        double d26 = (d19 + d21) / d24;
        double d27 = (d23 * d23) + (d22 * d22);
        if (d27 == 0.0d) {
            return;
        }
        double d28 = (1.0d / d27) - 0.25d;
        if (d28 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d27) / 1.99999d);
            a(path, d2, d3, d7, d10, d16 * dSqrt, d12 * dSqrt, d13, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d28);
        double d29 = d22 * dSqrt2;
        double d30 = dSqrt2 * d23;
        if (z10 == z11) {
            d14 = d25 - d30;
            d15 = d26 + d29;
        } else {
            d14 = d25 + d30;
            d15 = d26 - d29;
        }
        double dAtan2 = Math.atan2(d19 - d15, d18 - d14);
        double dAtan3 = Math.atan2(d21 - d15, d20 - d14) - dAtan2;
        if (z11 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d31 = d14 * d16;
        double d32 = d15 * d12;
        double d33 = (d31 * dCos) - (d32 * dSin);
        double d34 = (d32 * dCos) + (d31 * dSin);
        double d35 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * d35) / 3.141592653589793d));
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d36 = -d16;
        double d37 = d36 * dCos2;
        double d38 = d12 * dSin2;
        double d39 = (d37 * dSin3) - (d38 * dCos3);
        double d40 = d36 * dSin2;
        double d41 = d12 * dCos2;
        double d42 = (dCos3 * d41) + (dSin3 * d40);
        double d43 = dAtan3 / ((double) iCeil);
        double d44 = d2;
        double d45 = dAtan2;
        double d46 = d39;
        int i10 = 0;
        double d47 = d42;
        double d48 = d3;
        while (i10 < iCeil) {
            double d49 = d45 + d43;
            double dSin4 = Math.sin(d49);
            double dCos4 = Math.cos(d49);
            double d50 = d43;
            double d51 = (((d16 * dCos2) * dCos4) + d33) - (d38 * dSin4);
            int i11 = iCeil;
            double d52 = (d41 * dSin4) + (d16 * dSin2 * dCos4) + d34;
            double d53 = (d37 * dSin4) - (d38 * dCos4);
            double d54 = (dCos4 * d41) + (dSin4 * d40);
            double d55 = d49 - d45;
            double dTan = Math.tan(d55 / d24);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d35) - ((double) 1)) * Math.sin(d55)) / ((double) 3);
            path.cubicTo((float) ((d46 * dSqrt3) + d44), (float) ((d47 * dSqrt3) + d48), (float) (d51 - (dSqrt3 * d53)), (float) (d52 - (dSqrt3 * d54)), (float) d51, (float) d52);
            i10++;
            dSin2 = dSin2;
            dCos2 = dCos2;
            d44 = d51;
            d48 = d52;
            iCeil = i11;
            d45 = d49;
            d47 = d54;
            d46 = d53;
            d43 = d50;
            d16 = d11;
        }
    }

    @NotNull
    public static final float[] getEmptyArray() {
        return f16029a;
    }

    @NotNull
    public static final Path toPath(@NotNull List<? extends PathNode> list, @NotNull Path path) {
        PathNode pathNode;
        float f6;
        int i10;
        int i11;
        float f10;
        float f11;
        float x4;
        float y7;
        float dx;
        float dy;
        float y10;
        float f12;
        float f13;
        float f14;
        float f15;
        float y11;
        float x6;
        float x7;
        float y12;
        float x10;
        float y13;
        List<? extends PathNode> list2 = list;
        Path target = path;
        Intrinsics.checkNotNullParameter(list2, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        int iMo2408getFillTypeRgk1Os = path.mo2408getFillTypeRgk1Os();
        path.rewind();
        target.mo2410setFillTypeoQ8Xj4U(iMo2408getFillTypeRgk1Os);
        PathNode pathNode2 = list.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list.size();
        float f16 = 0.0f;
        int i12 = 0;
        float f17 = 0.0f;
        float arcStartY = 0.0f;
        float arcStartX = 0.0f;
        float y14 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (i12 < size) {
            PathNode pathNode3 = list2.get(i12);
            if (pathNode3 instanceof PathNode.Close) {
                path.close();
                target.moveTo(f18, f19);
                f17 = f18;
                arcStartX = f17;
                arcStartY = f19;
                y14 = arcStartY;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    x10 = relativeMoveTo.getDx() + arcStartX;
                    y13 = relativeMoveTo.getDy() + y14;
                    target.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                } else {
                    if (pathNode3 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                        x10 = moveTo.getX();
                        y13 = moveTo.getY();
                        target.moveTo(moveTo.getX(), moveTo.getY());
                    } else {
                        if (pathNode3 instanceof PathNode.RelativeLineTo) {
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                            target.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                            x7 = relativeLineTo.getDx() + arcStartX;
                            y12 = relativeLineTo.getDy() + y14;
                        } else if (pathNode3 instanceof PathNode.LineTo) {
                            PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                            target.lineTo(lineTo.getX(), lineTo.getY());
                            x7 = lineTo.getX();
                            y12 = lineTo.getY();
                        } else {
                            if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                target.relativeLineTo(relativeHorizontalTo.getDx(), f16);
                                x6 = relativeHorizontalTo.getDx() + arcStartX;
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                target.lineTo(horizontalTo.getX(), y14);
                                x6 = horizontalTo.getX();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                    PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                    target.relativeLineTo(f16, relativeVerticalTo.getDy());
                                    y11 = relativeVerticalTo.getDy() + y14;
                                } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                    PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                    target.lineTo(arcStartX, verticalTo.getY());
                                    y11 = verticalTo.getY();
                                } else {
                                    if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                        PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                        pathNode = pathNode3;
                                        path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                        x4 = relativeCurveTo.getDx2() + arcStartX;
                                        y7 = relativeCurveTo.getDy2() + y14;
                                        dx = relativeCurveTo.getDx3() + arcStartX;
                                        dy = relativeCurveTo.getDy3();
                                    } else {
                                        pathNode = pathNode3;
                                        if (pathNode instanceof PathNode.CurveTo) {
                                            PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode;
                                            path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                            x4 = curveTo.getX2();
                                            y7 = curveTo.getY2();
                                            dx = curveTo.getX3();
                                            y10 = curveTo.getY3();
                                        } else if (pathNode instanceof PathNode.RelativeReflectiveCurveTo) {
                                            if (pathNode2.getIsCurve()) {
                                                f15 = y14 - arcStartY;
                                                f14 = arcStartX - f17;
                                            } else {
                                                f14 = f16;
                                                f15 = f14;
                                            }
                                            PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode;
                                            path.relativeCubicTo(f14, f15, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                            x4 = relativeReflectiveCurveTo.getDx1() + arcStartX;
                                            y7 = relativeReflectiveCurveTo.getDy1() + y14;
                                            dx = relativeReflectiveCurveTo.getDx2() + arcStartX;
                                            dy = relativeReflectiveCurveTo.getDy2();
                                        } else if (pathNode instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.getIsCurve()) {
                                                float f20 = 2;
                                                f13 = (f20 * y14) - arcStartY;
                                                f12 = (arcStartX * f20) - f17;
                                            } else {
                                                f12 = arcStartX;
                                                f13 = y14;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode;
                                            path.cubicTo(f12, f13, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            x4 = reflectiveCurveTo.getX1();
                                            y7 = reflectiveCurveTo.getY1();
                                            dx = reflectiveCurveTo.getX2();
                                            y10 = reflectiveCurveTo.getY2();
                                        } else if (pathNode instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode;
                                            target.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            x4 = relativeQuadTo.getDx1() + arcStartX;
                                            y7 = relativeQuadTo.getDy1() + y14;
                                            dx = relativeQuadTo.getDx2() + arcStartX;
                                            dy = relativeQuadTo.getDy2();
                                        } else if (pathNode instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode;
                                            target.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            x4 = quadTo.getX1();
                                            y7 = quadTo.getY1();
                                            dx = quadTo.getX2();
                                            y10 = quadTo.getY2();
                                        } else if (pathNode instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                f10 = arcStartX - f17;
                                                f11 = y14 - arcStartY;
                                            } else {
                                                f10 = f16;
                                                f11 = f10;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode;
                                            target.relativeQuadraticBezierTo(f10, f11, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            x4 = f10 + arcStartX;
                                            y7 = f11 + y14;
                                            dx = relativeReflectiveQuadTo.getDx() + arcStartX;
                                            dy = relativeReflectiveQuadTo.getDy();
                                        } else if (pathNode instanceof PathNode.ReflectiveQuadTo) {
                                            if (pathNode2.getIsQuad()) {
                                                float f21 = 2;
                                                arcStartX = (arcStartX * f21) - f17;
                                                y14 = (f21 * y14) - arcStartY;
                                            }
                                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode;
                                            target.quadraticBezierTo(arcStartX, y14, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            float x11 = reflectiveQuadTo.getX();
                                            pathNode3 = pathNode;
                                            arcStartY = y14;
                                            f6 = f16;
                                            i10 = i12;
                                            i11 = size;
                                            y14 = reflectiveQuadTo.getY();
                                            f17 = arcStartX;
                                            arcStartX = x11;
                                        } else if (pathNode instanceof PathNode.RelativeArcTo) {
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + arcStartX;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + y14;
                                            pathNode3 = pathNode;
                                            i10 = i12;
                                            f6 = 0.0f;
                                            i11 = size;
                                            a(path, arcStartX, y14, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                            f17 = arcStartDx;
                                            arcStartX = f17;
                                            f18 = f18;
                                            f19 = f19;
                                            arcStartY = arcStartDy;
                                            y14 = arcStartY;
                                        } else {
                                            float f22 = f18;
                                            float f23 = f19;
                                            f6 = f16;
                                            i10 = i12;
                                            i11 = size;
                                            if (pathNode instanceof PathNode.ArcTo) {
                                                PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                                pathNode3 = pathNode;
                                                a(path, arcStartX, y14, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                                arcStartX = arcTo.getArcStartX();
                                                arcStartY = arcTo.getArcStartY();
                                                y14 = arcStartY;
                                                f18 = f22;
                                                f19 = f23;
                                                f17 = arcStartX;
                                            } else {
                                                pathNode3 = pathNode;
                                                f18 = f22;
                                                f19 = f23;
                                            }
                                        }
                                        pathNode3 = pathNode;
                                        arcStartX = dx;
                                        y14 = y10;
                                        f6 = f16;
                                        i10 = i12;
                                        i11 = size;
                                        arcStartY = y7;
                                        f17 = x4;
                                    }
                                    y10 = dy + y14;
                                    pathNode3 = pathNode;
                                    arcStartX = dx;
                                    y14 = y10;
                                    f6 = f16;
                                    i10 = i12;
                                    i11 = size;
                                    arcStartY = y7;
                                    f17 = x4;
                                }
                                y14 = y11;
                            }
                            arcStartX = x6;
                        }
                        y14 = y12;
                        arcStartX = x7;
                    }
                    i12 = i10 + 1;
                    target = path;
                    size = i11;
                    pathNode2 = pathNode3;
                    f16 = f6;
                    list2 = list;
                }
                arcStartX = x10;
                f18 = arcStartX;
                y14 = y13;
                f19 = y14;
            }
            f6 = f16;
            i10 = i12;
            i11 = size;
            i12 = i10 + 1;
            target = path;
            size = i11;
            pathNode2 = pathNode3;
            f16 = f6;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }
}
