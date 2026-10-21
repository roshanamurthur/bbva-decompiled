package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OutlineResolver.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J6\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013J\u001b\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "alpha", "", "clipToOutline", "elevation", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "update", "Landroidx/compose/ui/geometry/Offset;", "position", "isInOutline-k-4lQ0M", "(J)Z", "isInOutline", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "", "Landroidx/compose/ui/geometry/Size;", "size", "update-uvyYCjk", "(J)V", "Landroid/graphics/Outline;", "getOutline", "()Landroid/graphics/Outline;", "outline", "getOutlineClipSupported", "()Z", "outlineClipSupported", "Landroidx/compose/ui/graphics/Path;", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "clipPath", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,356:1\n1#2:357\n35#3,5:358\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n330#1:358,5\n*E\n"})
public final class OutlineResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Density f17256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Outline f17258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public Shape f17260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Path f17261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Path f17262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Path f17265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public RoundRect f17266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f17267l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public LayoutDirection f17270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.graphics.Outline f17271q;

    public OutlineResolver(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f17256a = density;
        this.f17257b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f17258c = outline;
        Size.Companion companion = Size.INSTANCE;
        this.f17259d = companion.m2353getZeroNHjbRc();
        this.f17260e = RectangleShapeKt.getRectangleShape();
        this.m = Offset.INSTANCE.m2291getZeroF1C5BW0();
        this.f17268n = companion.m2353getZeroNHjbRc();
        this.f17270p = LayoutDirection.Ltr;
    }

    public final void a() {
        if (this.f17263h) {
            this.m = Offset.INSTANCE.m2291getZeroF1C5BW0();
            long j10 = this.f17259d;
            this.f17268n = j10;
            this.f17267l = 0.0f;
            this.f17262g = null;
            this.f17263h = false;
            this.f17264i = false;
            boolean z10 = this.f17269o;
            Outline outline = this.f17258c;
            if (!z10 || Size.m2344getWidthimpl(j10) <= 0.0f || Size.m2341getHeightimpl(this.f17259d) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f17257b = true;
            androidx.compose.ui.graphics.Outline outlineMo157createOutlinePq9zytI = this.f17260e.mo157createOutlinePq9zytI(this.f17259d, this.f17270p, this.f17256a);
            this.f17271q = outlineMo157createOutlinePq9zytI;
            if (outlineMo157createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
                Rect rect = ((androidx.compose.ui.graphics.Outline.Rectangle) outlineMo157createOutlinePq9zytI).getRect();
                this.m = OffsetKt.Offset(rect.getLeft(), rect.getTop());
                this.f17268n = SizeKt.Size(rect.getWidth(), rect.getHeight());
                outline.setRect(mk.c.roundToInt(rect.getLeft()), mk.c.roundToInt(rect.getTop()), mk.c.roundToInt(rect.getRight()), mk.c.roundToInt(rect.getBottom()));
                return;
            }
            if (!(outlineMo157createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Rounded)) {
                if (outlineMo157createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Generic) {
                    b(((androidx.compose.ui.graphics.Outline.Generic) outlineMo157createOutlinePq9zytI).getPath());
                    return;
                }
                return;
            }
            RoundRect roundRect = ((androidx.compose.ui.graphics.Outline.Rounded) outlineMo157createOutlinePq9zytI).getRoundRect();
            float fM2250getXimpl = CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs());
            this.m = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
            this.f17268n = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
            if (RoundRectKt.isSimple(roundRect)) {
                this.f17258c.setRoundRect(mk.c.roundToInt(roundRect.getLeft()), mk.c.roundToInt(roundRect.getTop()), mk.c.roundToInt(roundRect.getRight()), mk.c.roundToInt(roundRect.getBottom()), fM2250getXimpl);
                this.f17267l = fM2250getXimpl;
                return;
            }
            Path Path = this.f17261f;
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
                this.f17261f = Path;
            }
            Path.reset();
            Path.addRoundRect(roundRect);
            b(Path);
        }
    }

    public final void b(Path path) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f17258c;
        if (i10 <= 28 && !path.isConvex()) {
            this.f17257b = false;
            outline.setEmpty();
            this.f17264i = true;
        } else {
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((AndroidPath) path).getInternalPath());
            this.f17264i = !outline.canClip();
        }
        this.f17262g = path;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    public final void clipToOutline(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path clipPath = getClipPath();
        if (clipPath != null) {
            y0.c.m(canvas, clipPath, 0, 2, null);
            return;
        }
        float f6 = this.f17267l;
        if (f6 <= 0.0f) {
            y0.c.n(canvas, Offset.m2275getXimpl(this.m), Offset.m2276getYimpl(this.m), Size.m2344getWidthimpl(this.f17268n) + Offset.m2275getXimpl(this.m), Size.m2341getHeightimpl(this.f17268n) + Offset.m2276getYimpl(this.m), 0, 16, null);
            return;
        }
        Path Path = this.f17265j;
        RoundRect roundRect = this.f17266k;
        if (Path != null) {
            long j10 = this.m;
            long j11 = this.f17268n;
            if (roundRect != null && RoundRectKt.isSimple(roundRect) && roundRect.getLeft() == Offset.m2275getXimpl(j10) && roundRect.getTop() == Offset.m2276getYimpl(j10)) {
                if (roundRect.getRight() == Size.m2344getWidthimpl(j11) + Offset.m2275getXimpl(j10)) {
                    if (roundRect.getBottom() != Size.m2341getHeightimpl(j11) + Offset.m2276getYimpl(j10) || CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) != f6) {
                        RoundRect roundRectM2329RoundRectgG7oq9Y = RoundRectKt.m2329RoundRectgG7oq9Y(Offset.m2275getXimpl(this.m), Offset.m2276getYimpl(this.m), Size.m2344getWidthimpl(this.f17268n) + Offset.m2275getXimpl(this.m), Size.m2341getHeightimpl(this.f17268n) + Offset.m2276getYimpl(this.m), CornerRadiusKt.CornerRadius$default(this.f17267l, 0.0f, 2, null));
                        if (Path == null) {
                            Path = AndroidPath_androidKt.Path();
                        } else {
                            Path.reset();
                        }
                        Path.addRoundRect(roundRectM2329RoundRectgG7oq9Y);
                        this.f17266k = roundRectM2329RoundRectgG7oq9Y;
                        this.f17265j = Path;
                    }
                } else {
                    RoundRect roundRectM2329RoundRectgG7oq9Y2 = RoundRectKt.m2329RoundRectgG7oq9Y(Offset.m2275getXimpl(this.m), Offset.m2276getYimpl(this.m), Size.m2344getWidthimpl(this.f17268n) + Offset.m2275getXimpl(this.m), Size.m2341getHeightimpl(this.f17268n) + Offset.m2276getYimpl(this.m), CornerRadiusKt.CornerRadius$default(this.f17267l, 0.0f, 2, null));
                    if (Path == null) {
                        Path = AndroidPath_androidKt.Path();
                    } else {
                        Path.reset();
                    }
                    Path.addRoundRect(roundRectM2329RoundRectgG7oq9Y2);
                    this.f17266k = roundRectM2329RoundRectgG7oq9Y2;
                    this.f17265j = Path;
                }
            } else {
                RoundRect roundRectM2329RoundRectgG7oq9Y3 = RoundRectKt.m2329RoundRectgG7oq9Y(Offset.m2275getXimpl(this.m), Offset.m2276getYimpl(this.m), Size.m2344getWidthimpl(this.f17268n) + Offset.m2275getXimpl(this.m), Size.m2341getHeightimpl(this.f17268n) + Offset.m2276getYimpl(this.m), CornerRadiusKt.CornerRadius$default(this.f17267l, 0.0f, 2, null));
                if (Path == null) {
                    Path = AndroidPath_androidKt.Path();
                } else {
                    Path.reset();
                }
                Path.addRoundRect(roundRectM2329RoundRectgG7oq9Y3);
                this.f17266k = roundRectM2329RoundRectgG7oq9Y3;
                this.f17265j = Path;
            }
        } else {
            RoundRect roundRectM2329RoundRectgG7oq9Y4 = RoundRectKt.m2329RoundRectgG7oq9Y(Offset.m2275getXimpl(this.m), Offset.m2276getYimpl(this.m), Size.m2344getWidthimpl(this.f17268n) + Offset.m2275getXimpl(this.m), Size.m2341getHeightimpl(this.f17268n) + Offset.m2276getYimpl(this.m), CornerRadiusKt.CornerRadius$default(this.f17267l, 0.0f, 2, null));
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
            } else {
                Path.reset();
            }
            Path.addRoundRect(roundRectM2329RoundRectgG7oq9Y4);
            this.f17266k = roundRectM2329RoundRectgG7oq9Y4;
            this.f17265j = Path;
        }
        y0.c.m(canvas, Path, 0, 2, null);
    }

    @Nullable
    public final Path getClipPath() {
        a();
        return this.f17262g;
    }

    @Nullable
    public final Outline getOutline() {
        a();
        if (this.f17269o && this.f17257b) {
            return this.f17258c;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.f17264i;
    }

    /* JADX INFO: renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m3811isInOutlinek4lQ0M(long position) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.f17269o && (outline = this.f17271q) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Offset.m2275getXimpl(position), Offset.m2276getYimpl(position), null, null);
        }
        return true;
    }

    public final boolean update(@NotNull Shape shape, float alpha, boolean clipToOutline, float elevation, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f17258c.setAlpha(alpha);
        boolean z10 = !Intrinsics.areEqual(this.f17260e, shape);
        if (z10) {
            this.f17260e = shape;
            this.f17263h = true;
        }
        boolean z11 = clipToOutline || elevation > 0.0f;
        if (this.f17269o != z11) {
            this.f17269o = z11;
            this.f17263h = true;
        }
        if (this.f17270p != layoutDirection) {
            this.f17270p = layoutDirection;
            this.f17263h = true;
        }
        if (!Intrinsics.areEqual(this.f17256a, density)) {
            this.f17256a = density;
            this.f17263h = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: update-uvyYCjk, reason: not valid java name */
    public final void m3812updateuvyYCjk(long size) {
        if (Size.m2340equalsimpl0(this.f17259d, size)) {
            return;
        }
        this.f17259d = size;
        this.f17263h = true;
    }
}
