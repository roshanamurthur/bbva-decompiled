package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.measurement.internal.a;
import com.mypinpad.tsdk.isolation.z1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u009e\u0001\b\u0000\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010&\u001a\u00020!\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010,\u001a\u00020!\u0012\b\b\u0002\u0010/\u001a\u00020!\u0012\b\b\u0002\u00103\u001a\u000200\u0012\b\b\u0002\u00107\u001a\u000204\u0012\b\b\u0002\u0010:\u001a\u00020!\u0012\b\b\u0002\u0010=\u001a\u00020!\u0012\b\b\u0002\u0010@\u001a\u00020!\u0012\b\b\u0002\u0010C\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001a\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010)\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010,\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010/\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R \u00103\u001a\u0002008\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010\u0017\u001a\u0004\b2\u0010\u0019R \u00107\u001a\u0002048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0017\u001a\u0004\b6\u0010\u0019R\u0017\u0010:\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b8\u0010#\u001a\u0004\b9\u0010%R\u0017\u0010=\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b;\u0010#\u001a\u0004\b<\u0010%R\u0017\u0010@\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b>\u0010#\u001a\u0004\b?\u0010%R\u0017\u0010C\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bA\u0010#\u001a\u0004\bB\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPath;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "p0", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "q0", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPathFillType-Rg-k1Os", "()I", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "s0", "Landroidx/compose/ui/graphics/Brush;", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "fill", "", "t0", "F", "getFillAlpha", "()F", "fillAlpha", "u0", "getStroke", "stroke", "v0", "getStrokeAlpha", "strokeAlpha", "w0", "getStrokeLineWidth", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "x0", "getStrokeLineCap-KaPHkGw", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "y0", "getStrokeLineJoin-LxFBmk8", "strokeLineJoin", "E0", "getStrokeLineMiter", "strokeLineMiter", "F0", "getTrimPathStart", "trimPathStart", "G0", "getTrimPathEnd", "trimPathEnd", "H0", "getTrimPathOffset", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public final float strokeLineMiter;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public final float trimPathStart;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public final float trimPathEnd;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public final float trimPathOffset;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<PathNode> pathData;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int pathFillType;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Brush fill;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public final float fillAlpha;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Brush stroke;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public final float strokeAlpha;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public final float strokeLineWidth;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public final int strokeLineCap;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    public final int strokeLineJoin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPath(String name, List pathData, int i10, Brush brush, float f6, Brush brush2, float f10, float f11, int i11, int i12, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        this.name = name;
        this.pathData = pathData;
        this.pathFillType = i10;
        this.fill = brush;
        this.fillAlpha = f6;
        this.stroke = brush2;
        this.strokeAlpha = f10;
        this.strokeLineWidth = f11;
        this.strokeLineCap = i11;
        this.strokeLineJoin = i12;
        this.strokeLineMiter = f12;
        this.trimPathStart = f13;
        this.trimPathEnd = f14;
        this.trimPathOffset = f15;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && VectorPath.class == other.getClass()) {
            VectorPath vectorPath = (VectorPath) other;
            return Intrinsics.areEqual(this.name, vectorPath.name) && Intrinsics.areEqual(this.fill, vectorPath.fill) && this.fillAlpha == vectorPath.fillAlpha && Intrinsics.areEqual(this.stroke, vectorPath.stroke) && this.strokeAlpha == vectorPath.strokeAlpha && this.strokeLineWidth == vectorPath.strokeLineWidth && StrokeCap.m2804equalsimpl0(this.strokeLineCap, vectorPath.strokeLineCap) && StrokeJoin.m2814equalsimpl0(this.strokeLineJoin, vectorPath.strokeLineJoin) && this.strokeLineMiter == vectorPath.strokeLineMiter && this.trimPathStart == vectorPath.trimPathStart && this.trimPathEnd == vectorPath.trimPathEnd && this.trimPathOffset == vectorPath.trimPathOffset && PathFillType.m2744equalsimpl0(this.pathFillType, vectorPath.pathFillType) && Intrinsics.areEqual(this.pathData, vectorPath.pathData);
        }
        return false;
    }

    @Nullable
    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* JADX INFO: renamed from: getPathFillType-Rg-k1Os, reason: not valid java name and from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    @Nullable
    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* JADX INFO: renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name and from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name and from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public int hashCode() {
        int iA = a.a(this.pathData, this.name.hashCode() * 31, 31);
        Brush brush = this.fill;
        int iA2 = z1.a(this.fillAlpha, (iA + (brush != null ? brush.hashCode() : 0)) * 31, 31);
        Brush brush2 = this.stroke;
        return PathFillType.m2745hashCodeimpl(this.pathFillType) + z1.a(this.trimPathOffset, z1.a(this.trimPathEnd, z1.a(this.trimPathStart, z1.a(this.strokeLineMiter, (StrokeJoin.m2815hashCodeimpl(this.strokeLineJoin) + ((StrokeCap.m2805hashCodeimpl(this.strokeLineCap) + z1.a(this.strokeLineWidth, z1.a(this.strokeAlpha, (iA2 + (brush2 != null ? brush2.hashCode() : 0)) * 31, 31), 31)) * 31)) * 31, 31), 31), 31), 31);
    }

    public /* synthetic */ VectorPath(String str, List list, int i10, Brush brush, float f6, Brush brush2, float f10, float f11, int i11, int i12, float f12, float f13, float f14, float f15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, list, i10, (i13 & 8) != 0 ? null : brush, (i13 & 16) != 0 ? 1.0f : f6, (i13 & 32) != 0 ? null : brush2, (i13 & 64) != 0 ? 1.0f : f10, (i13 & 128) != 0 ? 0.0f : f11, (i13 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i11, (i13 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i12, (i13 & 1024) != 0 ? 4.0f : f12, (i13 & 2048) != 0 ? 0.0f : f13, (i13 & 4096) != 0 ? 1.0f : f14, (i13 & 8192) != 0 ? 0.0f : f15, null);
    }
}
