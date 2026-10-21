package androidx.compose.ui.graphics.vector;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a*\u0010\t\u001a\u00020\b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\n"}, d2 = {"", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "nodes", "", "args", "", "count", "", "addPathNodes", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,399:1\n347#1,15:400\n347#1,15:415\n347#1,15:430\n347#1,15:445\n347#1,15:460\n347#1,15:475\n347#1,15:490\n347#1,15:505\n347#1,15:520\n347#1,15:535\n347#1,15:550\n347#1,15:565\n347#1,15:580\n347#1,15:595\n347#1,15:610\n347#1,15:625\n347#1,15:640\n347#1,15:655\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n154#1:400,15\n163#1:415,15\n167#1:430,15\n176#1:445,15\n180#1:460,15\n189#1:475,15\n198#1:490,15\n207#1:505,15\n216#1:520,15\n232#1:535,15\n243#1:550,15\n257#1:565,15\n271#1:580,15\n285#1:595,15\n294#1:610,15\n303#1:625,15\n312#1:640,15\n324#1:655,15\n*E\n"})
public final class PathNodeKt {
    public static final void addPathNodes(char c10, @NotNull List<PathNode> nodes, @NotNull float[] args, int i10) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        Intrinsics.checkNotNullParameter(args, "args");
        if (c10 == 'z' || c10 == 'Z') {
            nodes.add(PathNode.Close.INSTANCE);
            return;
        }
        int i11 = 0;
        if (c10 == 'm') {
            int i12 = i10 - 2;
            while (i11 <= i12) {
                int i13 = i11 + 1;
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(args[i11], args[i13]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && i11 > 0) {
                    relativeMoveTo = new PathNode.LineTo(args[i11], args[i13]);
                } else if (i11 > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(args[i11], args[i13]);
                }
                nodes.add(relativeMoveTo);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'M') {
            int i14 = i10 - 2;
            while (i11 <= i14) {
                int i15 = i11 + 1;
                PathNode moveTo = new PathNode.MoveTo(args[i11], args[i15]);
                if (i11 > 0) {
                    moveTo = new PathNode.LineTo(args[i11], args[i15]);
                } else if ((moveTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    moveTo = new PathNode.RelativeLineTo(args[i11], args[i15]);
                }
                nodes.add(moveTo);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'l') {
            int i16 = i10 - 2;
            while (i11 <= i16) {
                int i17 = i11 + 1;
                PathNode relativeLineTo = new PathNode.RelativeLineTo(args[i11], args[i17]);
                if ((relativeLineTo instanceof PathNode.MoveTo) && i11 > 0) {
                    relativeLineTo = new PathNode.LineTo(args[i11], args[i17]);
                } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    relativeLineTo = new PathNode.RelativeLineTo(args[i11], args[i17]);
                }
                nodes.add(relativeLineTo);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'L') {
            int i18 = i10 - 2;
            while (i11 <= i18) {
                int i19 = i11 + 1;
                PathNode lineTo = new PathNode.LineTo(args[i11], args[i19]);
                if ((lineTo instanceof PathNode.MoveTo) && i11 > 0) {
                    lineTo = new PathNode.LineTo(args[i11], args[i19]);
                } else if ((lineTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    lineTo = new PathNode.RelativeLineTo(args[i11], args[i19]);
                }
                nodes.add(lineTo);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'h') {
            int i20 = i10 - 1;
            while (i11 <= i20) {
                PathNode relativeHorizontalTo = new PathNode.RelativeHorizontalTo(args[i11]);
                if ((relativeHorizontalTo instanceof PathNode.MoveTo) && i11 > 0) {
                    relativeHorizontalTo = new PathNode.LineTo(args[i11], args[i11 + 1]);
                } else if ((relativeHorizontalTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    relativeHorizontalTo = new PathNode.RelativeLineTo(args[i11], args[i11 + 1]);
                }
                nodes.add(relativeHorizontalTo);
                i11++;
            }
            return;
        }
        if (c10 == 'H') {
            int i21 = i10 - 1;
            while (i11 <= i21) {
                PathNode horizontalTo = new PathNode.HorizontalTo(args[i11]);
                if ((horizontalTo instanceof PathNode.MoveTo) && i11 > 0) {
                    horizontalTo = new PathNode.LineTo(args[i11], args[i11 + 1]);
                } else if ((horizontalTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    horizontalTo = new PathNode.RelativeLineTo(args[i11], args[i11 + 1]);
                }
                nodes.add(horizontalTo);
                i11++;
            }
            return;
        }
        if (c10 == 'v') {
            int i22 = i10 - 1;
            while (i11 <= i22) {
                PathNode relativeVerticalTo = new PathNode.RelativeVerticalTo(args[i11]);
                if ((relativeVerticalTo instanceof PathNode.MoveTo) && i11 > 0) {
                    relativeVerticalTo = new PathNode.LineTo(args[i11], args[i11 + 1]);
                } else if ((relativeVerticalTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    relativeVerticalTo = new PathNode.RelativeLineTo(args[i11], args[i11 + 1]);
                }
                nodes.add(relativeVerticalTo);
                i11++;
            }
            return;
        }
        if (c10 == 'V') {
            int i23 = i10 - 1;
            while (i11 <= i23) {
                PathNode verticalTo = new PathNode.VerticalTo(args[i11]);
                if ((verticalTo instanceof PathNode.MoveTo) && i11 > 0) {
                    verticalTo = new PathNode.LineTo(args[i11], args[i11 + 1]);
                } else if ((verticalTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    verticalTo = new PathNode.RelativeLineTo(args[i11], args[i11 + 1]);
                }
                nodes.add(verticalTo);
                i11++;
            }
            return;
        }
        if (c10 == 'c') {
            int i24 = i10 - 6;
            while (i11 <= i24) {
                int i25 = i11 + 1;
                PathNode relativeCurveTo = new PathNode.RelativeCurveTo(args[i11], args[i25], args[i11 + 2], args[i11 + 3], args[i11 + 4], args[i11 + 5]);
                if ((relativeCurveTo instanceof PathNode.MoveTo) && i11 > 0) {
                    relativeCurveTo = new PathNode.LineTo(args[i11], args[i25]);
                } else if ((relativeCurveTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    relativeCurveTo = new PathNode.RelativeLineTo(args[i11], args[i25]);
                }
                nodes.add(relativeCurveTo);
                i11 += 6;
            }
            return;
        }
        if (c10 == 'C') {
            int i26 = i10 - 6;
            while (i11 <= i26) {
                int i27 = i11 + 1;
                PathNode curveTo = new PathNode.CurveTo(args[i11], args[i27], args[i11 + 2], args[i11 + 3], args[i11 + 4], args[i11 + 5]);
                if ((curveTo instanceof PathNode.MoveTo) && i11 > 0) {
                    curveTo = new PathNode.LineTo(args[i11], args[i27]);
                } else if ((curveTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    curveTo = new PathNode.RelativeLineTo(args[i11], args[i27]);
                }
                nodes.add(curveTo);
                i11 += 6;
            }
            return;
        }
        if (c10 == 's') {
            int i28 = i10 - 4;
            while (i11 <= i28) {
                int i29 = i11 + 1;
                PathNode relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(args[i11], args[i29], args[i11 + 2], args[i11 + 3]);
                if ((relativeReflectiveCurveTo instanceof PathNode.MoveTo) && i11 > 0) {
                    relativeReflectiveCurveTo = new PathNode.LineTo(args[i11], args[i29]);
                } else if ((relativeReflectiveCurveTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    relativeReflectiveCurveTo = new PathNode.RelativeLineTo(args[i11], args[i29]);
                }
                nodes.add(relativeReflectiveCurveTo);
                i11 += 4;
            }
            return;
        }
        if (c10 == 'S') {
            int i30 = i10 - 4;
            while (i11 <= i30) {
                int i31 = i11 + 1;
                PathNode reflectiveCurveTo = new PathNode.ReflectiveCurveTo(args[i11], args[i31], args[i11 + 2], args[i11 + 3]);
                if ((reflectiveCurveTo instanceof PathNode.MoveTo) && i11 > 0) {
                    reflectiveCurveTo = new PathNode.LineTo(args[i11], args[i31]);
                } else if ((reflectiveCurveTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    reflectiveCurveTo = new PathNode.RelativeLineTo(args[i11], args[i31]);
                }
                nodes.add(reflectiveCurveTo);
                i11 += 4;
            }
            return;
        }
        if (c10 == 'q') {
            int i32 = i10 - 4;
            while (i11 <= i32) {
                int i33 = i11 + 1;
                PathNode relativeQuadTo = new PathNode.RelativeQuadTo(args[i11], args[i33], args[i11 + 2], args[i11 + 3]);
                if ((relativeQuadTo instanceof PathNode.MoveTo) && i11 > 0) {
                    relativeQuadTo = new PathNode.LineTo(args[i11], args[i33]);
                } else if ((relativeQuadTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    relativeQuadTo = new PathNode.RelativeLineTo(args[i11], args[i33]);
                }
                nodes.add(relativeQuadTo);
                i11 += 4;
            }
            return;
        }
        if (c10 == 'Q') {
            int i34 = i10 - 4;
            while (i11 <= i34) {
                int i35 = i11 + 1;
                PathNode quadTo = new PathNode.QuadTo(args[i11], args[i35], args[i11 + 2], args[i11 + 3]);
                if ((quadTo instanceof PathNode.MoveTo) && i11 > 0) {
                    quadTo = new PathNode.LineTo(args[i11], args[i35]);
                } else if ((quadTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    quadTo = new PathNode.RelativeLineTo(args[i11], args[i35]);
                }
                nodes.add(quadTo);
                i11 += 4;
            }
            return;
        }
        if (c10 == 't') {
            int i36 = i10 - 2;
            while (i11 <= i36) {
                int i37 = i11 + 1;
                PathNode relativeReflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(args[i11], args[i37]);
                if ((relativeReflectiveQuadTo instanceof PathNode.MoveTo) && i11 > 0) {
                    relativeReflectiveQuadTo = new PathNode.LineTo(args[i11], args[i37]);
                } else if ((relativeReflectiveQuadTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    relativeReflectiveQuadTo = new PathNode.RelativeLineTo(args[i11], args[i37]);
                }
                nodes.add(relativeReflectiveQuadTo);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'T') {
            int i38 = i10 - 2;
            while (i11 <= i38) {
                int i39 = i11 + 1;
                PathNode reflectiveQuadTo = new PathNode.ReflectiveQuadTo(args[i11], args[i39]);
                if ((reflectiveQuadTo instanceof PathNode.MoveTo) && i11 > 0) {
                    reflectiveQuadTo = new PathNode.LineTo(args[i11], args[i39]);
                } else if ((reflectiveQuadTo instanceof PathNode.RelativeMoveTo) && i11 > 0) {
                    reflectiveQuadTo = new PathNode.RelativeLineTo(args[i11], args[i39]);
                }
                nodes.add(reflectiveQuadTo);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'a') {
            int i40 = i10 - 7;
            for (int i41 = 0; i41 <= i40; i41 += 7) {
                int i42 = i41 + 1;
                PathNode relativeArcTo = new PathNode.RelativeArcTo(args[i41], args[i42], args[i41 + 2], Float.compare(args[i41 + 3], 0.0f) != 0, Float.compare(args[i41 + 4], 0.0f) != 0, args[i41 + 5], args[i41 + 6]);
                if ((relativeArcTo instanceof PathNode.MoveTo) && i41 > 0) {
                    relativeArcTo = new PathNode.LineTo(args[i41], args[i42]);
                } else if ((relativeArcTo instanceof PathNode.RelativeMoveTo) && i41 > 0) {
                    relativeArcTo = new PathNode.RelativeLineTo(args[i41], args[i42]);
                }
                nodes.add(relativeArcTo);
            }
            return;
        }
        if (c10 != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c10);
        }
        int i43 = i10 - 7;
        for (int i44 = 0; i44 <= i43; i44 += 7) {
            int i45 = i44 + 1;
            PathNode arcTo = new PathNode.ArcTo(args[i44], args[i45], args[i44 + 2], Float.compare(args[i44 + 3], 0.0f) != 0, Float.compare(args[i44 + 4], 0.0f) != 0, args[i44 + 5], args[i44 + 6]);
            if ((arcTo instanceof PathNode.MoveTo) && i44 > 0) {
                arcTo = new PathNode.LineTo(args[i44], args[i45]);
            } else if ((arcTo instanceof PathNode.RelativeMoveTo) && i44 > 0) {
                arcTo = new PathNode.RelativeLineTo(args[i44], args[i45]);
            }
            nodes.add(arcTo);
        }
    }
}
