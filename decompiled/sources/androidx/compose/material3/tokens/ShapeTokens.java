package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShapeTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006¨\u0006+"}, d2 = {"Landroidx/compose/material3/tokens/ShapeTokens;", "", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "a", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCornerExtraLarge", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CornerExtraLarge", "b", "getCornerExtraLargeTop", "CornerExtraLargeTop", "c", "getCornerExtraSmall", "CornerExtraSmall", "d", "getCornerExtraSmallTop", "CornerExtraSmallTop", "e", "getCornerFull", "CornerFull", "f", "getCornerLarge", "CornerLarge", "g", "getCornerLargeEnd", "CornerLargeEnd", "h", "getCornerLargeTop", "CornerLargeTop", "i", "getCornerMedium", "CornerMedium", "Landroidx/compose/ui/graphics/Shape;", "j", "Landroidx/compose/ui/graphics/Shape;", "getCornerNone", "()Landroidx/compose/ui/graphics/Shape;", "CornerNone", "k", "getCornerSmall", "CornerSmall", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShapeTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeTokens.kt\nandroidx/compose/material3/tokens/ShapeTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,61:1\n164#2:62\n164#2:63\n164#2:64\n164#2:65\n164#2:66\n164#2:67\n164#2:68\n164#2:69\n164#2:70\n164#2:71\n164#2:72\n164#2:73\n164#2:74\n164#2:75\n164#2:76\n164#2:77\n164#2:78\n164#2:79\n164#2:80\n164#2:81\n164#2:82\n*S KotlinDebug\n*F\n+ 1 ShapeTokens.kt\nandroidx/compose/material3/tokens/ShapeTokens\n*L\n27#1:62\n30#1:63\n31#1:64\n32#1:65\n33#1:66\n35#1:67\n37#1:68\n38#1:69\n39#1:70\n40#1:71\n43#1:72\n46#1:73\n47#1:74\n48#1:75\n49#1:76\n53#1:77\n54#1:78\n55#1:79\n56#1:80\n58#1:81\n60#1:82\n*E\n"})
public final class ShapeTokens {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape CornerExtraLarge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape CornerExtraLargeTop;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape CornerExtraSmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape CornerExtraSmallTop;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape CornerLarge;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape CornerLargeEnd;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape CornerLargeTop;

    @NotNull
    public static final ShapeTokens INSTANCE = new ShapeTokens();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape CornerFull = RoundedCornerShapeKt.getCircleShape();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape CornerMedium = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(Dp.m4389constructorimpl((float) 12.0d));

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Shape CornerNone = RectangleShapeKt.getRectangleShape();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape CornerSmall = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(Dp.m4389constructorimpl((float) 8.0d));

    static {
        float f6 = (float) 28.0d;
        CornerExtraLarge = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(Dp.m4389constructorimpl(f6));
        float f10 = (float) 0.0d;
        CornerExtraLargeTop = RoundedCornerShapeKt.m483RoundedCornerShapea9UjIt4(Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f10), Dp.m4389constructorimpl(f10));
        float f11 = (float) 4.0d;
        CornerExtraSmall = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(Dp.m4389constructorimpl(f11));
        CornerExtraSmallTop = RoundedCornerShapeKt.m483RoundedCornerShapea9UjIt4(Dp.m4389constructorimpl(f11), Dp.m4389constructorimpl(f11), Dp.m4389constructorimpl(f10), Dp.m4389constructorimpl(f10));
        float f12 = (float) 16.0d;
        CornerLarge = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(Dp.m4389constructorimpl(f12));
        CornerLargeEnd = RoundedCornerShapeKt.m483RoundedCornerShapea9UjIt4(Dp.m4389constructorimpl(f10), Dp.m4389constructorimpl(f12), Dp.m4389constructorimpl(f12), Dp.m4389constructorimpl(f10));
        CornerLargeTop = RoundedCornerShapeKt.m483RoundedCornerShapea9UjIt4(Dp.m4389constructorimpl(f12), Dp.m4389constructorimpl(f12), Dp.m4389constructorimpl(f10), Dp.m4389constructorimpl(f10));
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraLarge() {
        return CornerExtraLarge;
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraLargeTop() {
        return CornerExtraLargeTop;
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraSmall() {
        return CornerExtraSmall;
    }

    @NotNull
    public final RoundedCornerShape getCornerExtraSmallTop() {
        return CornerExtraSmallTop;
    }

    @NotNull
    public final RoundedCornerShape getCornerFull() {
        return CornerFull;
    }

    @NotNull
    public final RoundedCornerShape getCornerLarge() {
        return CornerLarge;
    }

    @NotNull
    public final RoundedCornerShape getCornerLargeEnd() {
        return CornerLargeEnd;
    }

    @NotNull
    public final RoundedCornerShape getCornerLargeTop() {
        return CornerLargeTop;
    }

    @NotNull
    public final RoundedCornerShape getCornerMedium() {
        return CornerMedium;
    }

    @NotNull
    public final Shape getCornerNone() {
        return CornerNone;
    }

    @NotNull
    public final RoundedCornerShape getCornerSmall() {
        return CornerSmall;
    }
}
