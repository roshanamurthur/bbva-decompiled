package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import y0.c;

/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bo\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010!\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J%\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0017\u0010*\u001a\u00020'*\u00020\u001dø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J-\u00100\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J0\u00101\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J@\u00104\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J0\u00105\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J-\u0010:\u001a\u00020\u00022\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109JH\u0010?\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n2\u0006\u0010>\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010@\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0016J-\u0010F\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJE\u0010O\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020I2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJ3\u0010V\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020P2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020+0R2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ\b\u0010W\u001a\u00020\u0002H\u0016J\b\u0010X\u001a\u00020\u0002H\u0016J-\u0010\\\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020P2\u0006\u0010S\u001a\u00020Y2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010[J-\u0010c\u001a\u00020\u00022\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010bR,\u0010n\u001a\u00060dj\u0002`e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bl\u0010m\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006p"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "saveLayer", "", "dx", "dy", "translate", "sx", "sy", ImageScaleTypeHandler.ID, "degrees", "rotate", "skew", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "radiusX", "radiusY", "drawRoundRect", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "drawPath", "Landroidx/compose/ui/graphics/ImageBitmap;", AuthConstants.IMAGE, "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "", "points", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "enableZ", "disableZ", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "a", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "()V", "internalCanvas", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,431:1\n35#2,5:432\n35#2,5:437\n33#3,6:442\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:432,5\n242#1:437,5\n315#1:442,6\n*E\n"})
public final class AndroidCanvas implements Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public android.graphics.Canvas internalCanvas = AndroidCanvas_androidKt.f15555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Rect f15553b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Rect f15554c = new Rect();

    public final void a(int i10, List list, Paint paint) {
        if (list.size() >= 2) {
            android.graphics.Paint f15557a = paint.getF15557a();
            int i11 = 0;
            while (i11 < list.size() - 1) {
                long f15533a = ((Offset) list.get(i11)).getF15533a();
                long f15533a2 = ((Offset) list.get(i11 + 1)).getF15533a();
                this.internalCanvas.drawLine(Offset.m2275getXimpl(f15533a), Offset.m2276getYimpl(f15533a), Offset.m2275getXimpl(f15533a2), Offset.m2276getYimpl(f15533a2), f15557a);
                i11 += i10;
            }
        }
    }

    public final void b(int i10, float[] fArr, Paint paint) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        android.graphics.Paint f15557a = paint.getF15557a();
        int i11 = 0;
        while (i11 < fArr.length - 3) {
            this.internalCanvas.drawLine(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], f15557a);
            i11 += i10 * 2;
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo2369clipPathmtrdDE(@NotNull Path path, int clipOp) {
        Intrinsics.checkNotNullParameter(path, "path");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m2380toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo2370clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, m2380toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: clipRect-mtrdD-E, reason: not valid java name */
    public final /* synthetic */ void mo2371clipRectmtrdDE(androidx.compose.ui.geometry.Rect rect, int i10) {
        c.a(this, rect, i10);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo2372concat58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (MatrixKt.m2723isIdentity58bKbWc(matrix)) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m2387setFromEL8BTi8(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final /* synthetic */ void drawArc(androidx.compose.ui.geometry.Rect rect, float f6, float f10, boolean z10, Paint paint) {
        c.b(this, rect, f6, f10, z10, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final /* synthetic */ void drawArcRad(androidx.compose.ui.geometry.Rect rect, float f6, float f10, boolean z10, Paint paint) {
        c.c(this, rect, f6, f10, z10, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo2373drawCircle9KIMszo(long center, float radius, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawCircle(Offset.m2275getXimpl(center), Offset.m2276getYimpl(center), radius, paint.getF15557a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo2374drawImaged4ec7I(@NotNull ImageBitmap image, long topLeftOffset, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Offset.m2275getXimpl(topLeftOffset), Offset.m2276getYimpl(topLeftOffset), paint.getF15557a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo2375drawImageRectHPBpro0(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        int iM4507getXimpl = IntOffset.m4507getXimpl(srcOffset);
        Rect rect = this.f15553b;
        rect.left = iM4507getXimpl;
        rect.top = IntOffset.m4508getYimpl(srcOffset);
        rect.right = IntSize.m4549getWidthimpl(srcSize) + IntOffset.m4507getXimpl(srcOffset);
        rect.bottom = IntSize.m4548getHeightimpl(srcSize) + IntOffset.m4508getYimpl(srcOffset);
        Unit unit = Unit.INSTANCE;
        int iM4507getXimpl2 = IntOffset.m4507getXimpl(dstOffset);
        Rect rect2 = this.f15554c;
        rect2.left = iM4507getXimpl2;
        rect2.top = IntOffset.m4508getYimpl(dstOffset);
        rect2.right = IntSize.m4549getWidthimpl(dstSize) + IntOffset.m4507getXimpl(dstOffset);
        rect2.bottom = IntSize.m4548getHeightimpl(dstSize) + IntOffset.m4508getYimpl(dstOffset);
        canvas.drawBitmap(bitmapAsAndroidBitmap, rect, rect2, paint.getF15557a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo2376drawLineWko1d7g(long p4, long p10, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawLine(Offset.m2275getXimpl(p4), Offset.m2276getYimpl(p4), Offset.m2275getXimpl(p10), Offset.m2276getYimpl(p10), paint.getF15557a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final /* synthetic */ void drawOval(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        c.d(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.getF15557a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo2377drawPointsO7TthRY(int pointMode, @NotNull List<Offset> points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m2766equalsimpl0(pointMode, companion.m2770getLinesr_lszbg())) {
            a(2, points, paint);
            return;
        }
        if (PointMode.m2766equalsimpl0(pointMode, companion.m2772getPolygonr_lszbg())) {
            a(1, points, paint);
            return;
        }
        if (PointMode.m2766equalsimpl0(pointMode, companion.m2771getPointsr_lszbg())) {
            int size = points.size();
            for (int i10 = 0; i10 < size; i10++) {
                long f15533a = points.get(i10).getF15533a();
                this.internalCanvas.drawPoint(Offset.m2275getXimpl(f15533a), Offset.m2276getYimpl(f15533a), paint.getF15557a());
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawRawPoints-O7TthRY, reason: not valid java name */
    public void mo2378drawRawPointsO7TthRY(int pointMode, @NotNull float[] points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m2766equalsimpl0(pointMode, companion.m2770getLinesr_lszbg())) {
            b(2, points, paint);
            return;
        }
        if (PointMode.m2766equalsimpl0(pointMode, companion.m2772getPolygonr_lszbg())) {
            b(1, points, paint);
            return;
        }
        if (PointMode.m2766equalsimpl0(pointMode, companion.m2771getPointsr_lszbg()) && points.length % 2 == 0) {
            android.graphics.Paint f15557a = paint.getF15557a();
            for (int i10 = 0; i10 < points.length - 1; i10 += 2) {
                this.internalCanvas.drawPoint(points[i10], points[i10 + 1], f15557a);
            }
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final /* synthetic */ void drawRect(androidx.compose.ui.geometry.Rect rect, Paint paint) {
        c.e(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint.getF15557a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* JADX INFO: renamed from: drawVertices-TPEHhCM, reason: not valid java name */
    public void mo2379drawVerticesTPEHhCM(@NotNull Vertices vertices, int blendMode, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m2423toAndroidVertexModeJOOmi9M(vertices.getVertexMode()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.getF15557a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @NotNull
    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@NotNull androidx.compose.ui.geometry.Rect bounds, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.getF15557a(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    public final void setInternalCanvas(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float sx, float sy) {
        this.internalCanvas.skew(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public final /* synthetic */ void skewRad(float f6, float f10) {
        c.f(this, f6, f10);
    }

    @NotNull
    /* JADX INFO: renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m2380toRegionOp7u2Bmg(int i10) {
        return ClipOp.m2492equalsimpl0(i10, ClipOp.INSTANCE.m2496getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint.getF15557a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawOval(left, top, right, bottom, paint.getF15557a());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRect(left, top, right, bottom, paint.getF15557a());
    }

    @PublishedApi
    public static /* synthetic */ void getInternalCanvas$annotations() {
    }
}
