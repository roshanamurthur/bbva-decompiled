package com.bbva.ui.compose.theme;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Shapes;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Shape.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/Shapes;", "a", "Landroidx/compose/material/Shapes;", "getShapes", "()Landroidx/compose/material/Shapes;", "Shapes", "ui_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shape.kt\ncom/bbva/ui/compose/theme/ShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,21:1\n154#2:22\n154#2:23\n154#2:24\n*S KotlinDebug\n*F\n+ 1 Shape.kt\ncom/bbva/ui/compose/theme/ShapeKt\n*L\n17#1:22\n18#1:23\n19#1:24\n*E\n"})
public final class ShapeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Shapes f37610a;

    static {
        float f6 = 0;
        f37610a = new Shapes(RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(Dp.m4389constructorimpl(1)), RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(Dp.m4389constructorimpl(f6)), RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(Dp.m4389constructorimpl(f6)));
    }

    @NotNull
    public static final Shapes getShapes() {
        return f37610a;
    }
}
