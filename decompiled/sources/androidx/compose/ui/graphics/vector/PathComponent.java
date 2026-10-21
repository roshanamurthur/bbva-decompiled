package androidx.compose.ui.graphics.vector;

import a1.b;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bV\u0010WJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R*\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR6\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R3\u0010/\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020(8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00103\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR*\u00107\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0019\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001dR.\u0010;\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0011\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010\u0015R3\u0010@\u001a\u00020<2\u0006\u0010\u0007\u001a\u00020<8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b=\u0010*\u001a\u0004\b>\u0010,\"\u0004\b?\u0010.R3\u0010E\u001a\u00020A2\u0006\u0010\u0007\u001a\u00020A8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bB\u0010*\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R*\u0010I\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0019\u001a\u0004\bG\u0010\u001b\"\u0004\bH\u0010\u001dR*\u0010M\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0019\u001a\u0004\bK\u0010\u001b\"\u0004\bL\u0010\u001dR*\u0010Q\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0019\u001a\u0004\bO\u0010\u001b\"\u0004\bP\u0010\u001dR*\u0010U\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0019\u001a\u0004\bS\u0010\u001b\"\u0004\bT\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "draw", "", "toString", "value", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "Landroidx/compose/ui/graphics/Brush;", "c", "Landroidx/compose/ui/graphics/Brush;", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "setFill", "(Landroidx/compose/ui/graphics/Brush;)V", "fill", "", "d", "F", "getFillAlpha", "()F", "setFillAlpha", "(F)V", "fillAlpha", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "e", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "setPathData", "(Ljava/util/List;)V", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPathFillType-Rg-k1Os", "()I", "setPathFillType-oQ8Xj4U", "(I)V", "pathFillType", "g", "getStrokeAlpha", "setStrokeAlpha", "strokeAlpha", "h", "getStrokeLineWidth", "setStrokeLineWidth", "strokeLineWidth", "i", "getStroke", "setStroke", "stroke", "Landroidx/compose/ui/graphics/StrokeCap;", "j", "getStrokeLineCap-KaPHkGw", "setStrokeLineCap-BeK7IIE", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "k", "getStrokeLineJoin-LxFBmk8", "setStrokeLineJoin-Ww9F2mQ", "strokeLineJoin", "l", "getStrokeLineMiter", "setStrokeLineMiter", "strokeLineMiter", "m", "getTrimPathStart", "setTrimPathStart", "trimPathStart", "n", "getTrimPathEnd", "setTrimPathEnd", "trimPathEnd", "o", "getTrimPathOffset", "setTrimPathOffset", "trimPathOffset", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,536:1\n1#2:537\n*E\n"})
public final class PathComponent extends VNode {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Brush fill;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float fillAlpha;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends PathNode> pathData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int pathFillType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public float strokeAlpha;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float strokeLineWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Brush stroke;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int strokeLineCap;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int strokeLineJoin;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float strokeLineMiter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float trimPathStart;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float trimPathEnd;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public float trimPathOffset;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Stroke f15961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Path f15962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public Path f15963u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Lazy f15964v;

    /* JADX INFO: compiled from: Vector.kt */
    public static final class a extends Lambda implements Function0<PathMeasure> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15965p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final PathMeasure invoke() {
            return AndroidPathMeasure_androidKt.PathMeasure();
        }
    }

    public PathComponent() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = VectorKt.getEmptyPath();
        this.pathFillType = VectorKt.getDefaultFillType();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = VectorKt.getDefaultStrokeLineCap();
        this.strokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.f15958p = true;
        this.f15959q = true;
        Path Path = AndroidPath_androidKt.Path();
        this.f15962t = Path;
        this.f15963u = Path;
        this.f15964v = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) a.f15965p0);
    }

    public final void a() {
        float f6 = this.trimPathStart;
        Path path = this.f15962t;
        if (f6 == 0.0f && this.trimPathEnd == 1.0f) {
            this.f15963u = path;
            return;
        }
        if (Intrinsics.areEqual(this.f15963u, path)) {
            this.f15963u = AndroidPath_androidKt.Path();
        } else {
            int iMo2408getFillTypeRgk1Os = this.f15963u.mo2408getFillTypeRgk1Os();
            this.f15963u.rewind();
            this.f15963u.mo2410setFillTypeoQ8Xj4U(iMo2408getFillTypeRgk1Os);
        }
        Lazy lazy = this.f15964v;
        ((PathMeasure) lazy.getValue()).setPath(path, false);
        float length = ((PathMeasure) lazy.getValue()).getLength();
        float f10 = this.trimPathStart;
        float f11 = this.trimPathOffset;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.trimPathEnd + f11) % 1.0f) * length;
        if (f12 <= f13) {
            ((PathMeasure) lazy.getValue()).getSegment(f12, f13, this.f15963u, true);
        } else {
            ((PathMeasure) lazy.getValue()).getSegment(f12, length, this.f15963u, true);
            ((PathMeasure) lazy.getValue()).getSegment(0.0f, f13, this.f15963u, true);
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (this.f15958p) {
            PathParserKt.toPath(this.pathData, this.f15962t);
            a();
        } else if (this.f15960r) {
            a();
        }
        this.f15958p = false;
        this.f15960r = false;
        Brush brush = this.fill;
        if (brush != null) {
            b.F(drawScope, this.f15963u, brush, this.fillAlpha, null, null, 0, 56, null);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke = this.f15961s;
            if (this.f15959q || stroke == null) {
                stroke = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.f15961s = stroke;
                this.f15959q = false;
            }
            b.F(drawScope, this.f15963u, brush2, this.strokeAlpha, stroke, null, 0, 48, null);
        }
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

    public final void setFill(@Nullable Brush brush) {
        this.fill = brush;
        invalidate();
    }

    public final void setFillAlpha(float f6) {
        this.fillAlpha = f6;
        invalidate();
    }

    public final void setName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = value;
        invalidate();
    }

    public final void setPathData(@NotNull List<? extends PathNode> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.pathData = value;
        this.f15958p = true;
        invalidate();
    }

    /* JADX INFO: renamed from: setPathFillType-oQ8Xj4U, reason: not valid java name */
    public final void m3020setPathFillTypeoQ8Xj4U(int i10) {
        this.pathFillType = i10;
        this.f15963u.mo2410setFillTypeoQ8Xj4U(i10);
        invalidate();
    }

    public final void setStroke(@Nullable Brush brush) {
        this.stroke = brush;
        invalidate();
    }

    public final void setStrokeAlpha(float f6) {
        this.strokeAlpha = f6;
        invalidate();
    }

    /* JADX INFO: renamed from: setStrokeLineCap-BeK7IIE, reason: not valid java name */
    public final void m3021setStrokeLineCapBeK7IIE(int i10) {
        this.strokeLineCap = i10;
        this.f15959q = true;
        invalidate();
    }

    /* JADX INFO: renamed from: setStrokeLineJoin-Ww9F2mQ, reason: not valid java name */
    public final void m3022setStrokeLineJoinWw9F2mQ(int i10) {
        this.strokeLineJoin = i10;
        this.f15959q = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f6) {
        this.strokeLineMiter = f6;
        this.f15959q = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f6) {
        this.strokeLineWidth = f6;
        invalidate();
    }

    public final void setTrimPathEnd(float f6) {
        if (this.trimPathEnd == f6) {
            return;
        }
        this.trimPathEnd = f6;
        this.f15960r = true;
        invalidate();
    }

    public final void setTrimPathOffset(float f6) {
        if (this.trimPathOffset == f6) {
            return;
        }
        this.trimPathOffset = f6;
        this.f15960r = true;
        invalidate();
    }

    public final void setTrimPathStart(float f6) {
        if (this.trimPathStart == f6) {
            return;
        }
        this.trimPathStart = f6;
        this.f15960r = true;
        invalidate();
    }

    @NotNull
    public String toString() {
        return this.f15962t.toString();
    }
}
