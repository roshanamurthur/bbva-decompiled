package androidx.compose.ui.graphics;

import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import y0.l;

/* JADX INFO: compiled from: AndroidPath.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010K\u001a\u00020F¢\u0006\u0004\bX\u0010YJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J8\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J(\u0010\"\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001cH\u0016J \u0010(\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H\u0016J \u0010)\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0016J%\u00102\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00012\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\b\u00103\u001a\u00020\u0005H\u0016J\b\u00104\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u00020\u0005H\u0016J\u001d\u00108\u001a\u00020\u00052\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u001d\u0010=\u001a\u00020\u00052\u0006\u0010:\u001a\u000209H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\b\u0010>\u001a\u00020\u001cH\u0016J-\u0010E\u001a\u00020 2\u0006\u0010?\u001a\u00020\u00012\u0006\u0010@\u001a\u00020\u00012\u0006\u0010B\u001a\u00020AH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DR\u0017\u0010K\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR-\u0010R\u001a\u00020L2\u0006\u0010M\u001a\u00020L8V@VX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020 8VX\u0096\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010T\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "", "x", "y", "", "moveTo", "dx", "dy", "relativeMoveTo", "lineTo", "relativeLineTo", "x1", "y1", "x2", "y2", "quadraticBezierTo", "dx1", "dy1", "dx2", "dy2", "relativeQuadraticBezierTo", "x3", "y3", "cubicTo", "dx3", "dy3", "relativeCubicTo", "Landroidx/compose/ui/geometry/Rect;", "rect", "startAngleDegrees", "sweepAngleDegrees", "", "forceMoveTo", "arcTo", "addRect", "oval", "addOval", "startAngleRadians", "sweepAngleRadians", "addArcRad", "addArc", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "addRoundRect", "path", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", HearingDisabilitiesConstants.CLOSE_MODAL, "reset", "rewind", "translate-k-4lQ0M", "(J)V", "translate", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "getBounds", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", "operation", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "Landroid/graphics/Path;", "a", "Landroid/graphics/Path;", "getInternalPath", "()Landroid/graphics/Path;", "internalPath", "Landroidx/compose/ui/graphics/PathFillType;", "value", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isConvex$annotations", "()V", "isEmpty", "<init>", "(Landroid/graphics/Path;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,244:1\n35#2,5:245\n35#2,5:250\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n172#1:245,5\n220#1:250,5\n*E\n"})
public final class AndroidPath implements Path {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.graphics.Path internalPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RectF f15563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final float[] f15564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final android.graphics.Matrix f15565d;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static void a(Rect rect) {
        if (!(!Float.isNaN(rect.getLeft()))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        }
        if (!(!Float.isNaN(rect.getTop()))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        if (!(!Float.isNaN(rect.getRight()))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        }
        if (!(!Float.isNaN(rect.getBottom()))) {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArc(@NotNull Rect oval, float startAngleDegrees, float sweepAngleDegrees) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        a(oval);
        RectF rectF = this.f15563b;
        rectF.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        this.internalPath.addArc(rectF, startAngleDegrees, sweepAngleDegrees);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArcRad(@NotNull Rect oval, float startAngleRadians, float sweepAngleRadians) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        addArc(oval, DegreesKt.degrees(startAngleRadians), DegreesKt.degrees(sweepAngleRadians));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(@NotNull Rect oval) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        RectF rectF = this.f15563b;
        rectF.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        this.internalPath.addOval(rectF, android.graphics.Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo2407addPathUv8p0NA(@NotNull Path path, long offset) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.internalPath.addPath(((AndroidPath) path).getInternalPath(), Offset.m2275getXimpl(offset), Offset.m2276getYimpl(offset));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        a(rect);
        RectF rectF = this.f15563b;
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        this.internalPath.addRect(rectF, android.graphics.Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "roundRect");
        RectF rectF = this.f15563b;
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        float fM2250getXimpl = CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs());
        float[] fArr = this.f15564c;
        fArr[0] = fM2250getXimpl;
        fArr[1] = CornerRadius.m2251getYimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs());
        fArr[2] = CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs());
        fArr[3] = CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs());
        fArr[4] = CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs());
        fArr[5] = CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs());
        fArr[6] = CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs());
        fArr[7] = CornerRadius.m2251getYimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs());
        this.internalPath.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void arcTo(@NotNull Rect rect, float startAngleDegrees, float sweepAngleDegrees, boolean forceMoveTo) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        RectF rectF = this.f15563b;
        rectF.set(left, top, right, bottom);
        this.internalPath.arcTo(rectF, startAngleDegrees, sweepAngleDegrees, forceMoveTo);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final /* synthetic */ void arcToRad(Rect rect, float f6, float f10, boolean z10) {
        l.a(this, rect, f6, f10, z10);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float x4, float y7, float x6, float y10, float x7, float y11) {
        this.internalPath.cubicTo(x4, y7, x6, y10, x7, y11);
    }

    @Override // androidx.compose.ui.graphics.Path
    @NotNull
    public Rect getBounds() {
        RectF rectF = this.f15563b;
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public int mo2408getFillTypeRgk1Os() {
        return this.internalPath.getFillType() == android.graphics.Path.FillType.EVEN_ODD ? PathFillType.INSTANCE.m2748getEvenOddRgk1Os() : PathFillType.INSTANCE.m2749getNonZeroRgk1Os();
    }

    @NotNull
    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float x4, float y7) {
        this.internalPath.lineTo(x4, y7);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float x4, float y7) {
        this.internalPath.moveTo(x4, y7);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo2409opN5in7k0(@NotNull Path path1, @NotNull Path path2, int operation) {
        android.graphics.Path.Op op;
        Intrinsics.checkNotNullParameter(path1, "path1");
        Intrinsics.checkNotNullParameter(path2, "path2");
        PathOperation.Companion companion = PathOperation.INSTANCE;
        if (PathOperation.m2753equalsimpl0(operation, companion.m2757getDifferenceb3I0S0c())) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (PathOperation.m2753equalsimpl0(operation, companion.m2758getIntersectb3I0S0c())) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (PathOperation.m2753equalsimpl0(operation, companion.m2759getReverseDifferenceb3I0S0c())) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = PathOperation.m2753equalsimpl0(operation, companion.m2760getUnionb3I0S0c()) ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        }
        if (!(path1 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((AndroidPath) path1).getInternalPath();
        if (path2 instanceof AndroidPath) {
            return this.internalPath.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float x4, float y7, float x6, float y10) {
        this.internalPath.quadTo(x4, y7, x6, y10);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this.internalPath.rCubicTo(dx1, dy1, dx2, dy2, dx3, dy3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float dx, float dy) {
        this.internalPath.rLineTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float dx, float dy) {
        this.internalPath.rMoveTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo2410setFillTypeoQ8Xj4U(int i10) {
        this.internalPath.setFillType(PathFillType.m2744equalsimpl0(i10, PathFillType.INSTANCE.m2748getEvenOddRgk1Os()) ? android.graphics.Path.FillType.EVEN_ODD : android.graphics.Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo2411transform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        android.graphics.Matrix matrix2 = this.f15565d;
        AndroidMatrixConversions_androidKt.m2387setFromEL8BTi8(matrix2, matrix);
        this.internalPath.transform(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo2412translatek4lQ0M(long offset) {
        android.graphics.Matrix matrix = this.f15565d;
        matrix.reset();
        matrix.setTranslate(Offset.m2275getXimpl(offset), Offset.m2276getYimpl(offset));
        this.internalPath.transform(matrix);
    }

    public AndroidPath(@NotNull android.graphics.Path internalPath) {
        Intrinsics.checkNotNullParameter(internalPath, "internalPath");
        this.internalPath = internalPath;
        this.f15563b = new RectF();
        this.f15564c = new float[8];
        this.f15565d = new android.graphics.Matrix();
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new android.graphics.Path() : path);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }
}
