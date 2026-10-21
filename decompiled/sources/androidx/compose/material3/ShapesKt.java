package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0013\u0010\n\u001a\u00020\b*\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\" \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "top", "bottom", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/material3/Shapes;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "value", "Landroidx/compose/ui/graphics/Shape;", "fromToken", "toShape", "(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalShapes", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalShapes", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material3/ShapesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,195:1\n164#2:196\n164#2:197\n164#2:198\n164#2:199\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material3/ShapesKt\n*L\n145#1:196\n152#1:197\n157#1:198\n162#1:199\n*E\n"})
public final class ShapesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Shapes> f11278a = CompositionLocalKt.staticCompositionLocalOf(a.f11279p0);

    /* JADX INFO: compiled from: Shapes.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShapeKeyTokens.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ShapeKeyTokens.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: Shapes.kt */
    public static final class a extends Lambda implements Function0<Shapes> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f11279p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Shapes invoke() {
            return new Shapes(null, null, null, null, null, 31, null);
        }
    }

    @NotNull
    public static final CornerBasedShape bottom(@NotNull CornerBasedShape cornerBasedShape) {
        Intrinsics.checkNotNullParameter(cornerBasedShape, "<this>");
        float f6 = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(f6)), CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(f6)), null, null, 12, null);
    }

    @NotNull
    public static final CornerBasedShape end(@NotNull CornerBasedShape cornerBasedShape) {
        Intrinsics.checkNotNullParameter(cornerBasedShape, "<this>");
        float f6 = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(f6)), null, null, CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(f6)), 6, null);
    }

    @NotNull
    public static final Shape fromToken(@NotNull Shapes shapes, @NotNull ShapeKeyTokens value) {
        Intrinsics.checkNotNullParameter(shapes, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return top(shapes.getExtraLarge());
            case 3:
                return shapes.getExtraSmall();
            case 4:
                return top(shapes.getExtraSmall());
            case 5:
                return RoundedCornerShapeKt.getCircleShape();
            case 6:
                return shapes.getLarge();
            case 7:
                return end(shapes.getLarge());
            case 8:
                return top(shapes.getLarge());
            case 9:
                return shapes.getMedium();
            case 10:
                return RectangleShapeKt.getRectangleShape();
            case 11:
                return shapes.getSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return f11278a;
    }

    @NotNull
    public static final CornerBasedShape start(@NotNull CornerBasedShape cornerBasedShape) {
        Intrinsics.checkNotNullParameter(cornerBasedShape, "<this>");
        float f6 = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, null, CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(f6)), CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(f6)), null, 9, null);
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final Shape toShape(@NotNull ShapeKeyTokens shapeKeyTokens, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(shapeKeyTokens, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-612531606, i10, -1, "androidx.compose.material3.toShape (Shapes.kt:188)");
        }
        Shape shapeFromToken = fromToken(MaterialTheme.INSTANCE.getShapes(composer, 6), shapeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapeFromToken;
    }

    @NotNull
    public static final CornerBasedShape top(@NotNull CornerBasedShape cornerBasedShape) {
        Intrinsics.checkNotNullParameter(cornerBasedShape, "<this>");
        float f6 = (float) 0.0d;
        return CornerBasedShape.copy$default(cornerBasedShape, null, null, CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(f6)), CornerSizeKt.m478CornerSize0680j_4(Dp.m4389constructorimpl(f6)), 3, null);
    }
}
