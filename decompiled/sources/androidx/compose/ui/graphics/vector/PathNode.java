package androidx.compose.ui.graphics.vector;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PathNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0013\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode;", "", "", "a", "Z", "isCurve", "()Z", "b", "isQuad", "ArcTo", "Close", "CurveTo", "HorizontalTo", "LineTo", "MoveTo", "QuadTo", "ReflectiveCurveTo", "ReflectiveQuadTo", "RelativeArcTo", "RelativeCurveTo", "RelativeHorizontalTo", "RelativeLineTo", "RelativeMoveTo", "RelativeQuadTo", "RelativeReflectiveCurveTo", "RelativeReflectiveQuadTo", "RelativeVerticalTo", "VerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public abstract class PathNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isCurve;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isQuad;

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JO\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000e\u0010$R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\u000f\u0010$R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001d¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "component7", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "isMoreThanHalf", "isPositiveArc", "arcStartX", "arcStartY", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "c", "F", "getHorizontalEllipseRadius", "()F", "d", "getVerticalEllipseRadius", "e", "getTheta", "f", "Z", "()Z", "g", "h", "getArcStartX", "i", "getArcStartY", "<init>", "(FFFZZFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class ArcTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float horizontalEllipseRadius;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float verticalEllipseRadius;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final float theta;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final boolean isMoreThanHalf;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final boolean isPositiveArc;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final float arcStartX;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final float arcStartY;

        /* JADX WARN: Illegal instructions before constructor call */
        public ArcTo(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.horizontalEllipseRadius = f6;
            this.verticalEllipseRadius = f10;
            this.theta = f11;
            this.isMoreThanHalf = z10;
            this.isPositiveArc = z11;
            this.arcStartX = f12;
            this.arcStartY = f13;
        }

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = arcTo.horizontalEllipseRadius;
            }
            if ((i10 & 2) != 0) {
                f10 = arcTo.verticalEllipseRadius;
            }
            float f14 = f10;
            if ((i10 & 4) != 0) {
                f11 = arcTo.theta;
            }
            float f15 = f11;
            if ((i10 & 8) != 0) {
                z10 = arcTo.isMoreThanHalf;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = arcTo.isPositiveArc;
            }
            boolean z13 = z11;
            if ((i10 & 32) != 0) {
                f12 = arcTo.arcStartX;
            }
            float f16 = f12;
            if ((i10 & 64) != 0) {
                f13 = arcTo.arcStartY;
            }
            return arcTo.copy(f6, f14, f15, z12, z13, f16, f13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getTheta() {
            return this.theta;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsPositiveArc() {
            return this.isPositiveArc;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getArcStartX() {
            return this.arcStartX;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final float getArcStartY() {
            return this.arcStartY;
        }

        @NotNull
        public final ArcTo copy(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float arcStartX, float arcStartY) {
            return new ArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, arcStartX, arcStartY);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) other;
            return Float.compare(this.horizontalEllipseRadius, arcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, arcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, arcTo.theta) == 0 && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && Float.compare(this.arcStartX, arcTo.arcStartX) == 0 && Float.compare(this.arcStartY, arcTo.arcStartY) == 0;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        public int hashCode() {
            int iA = z1.a(this.theta, z1.a(this.verticalEllipseRadius, Float.floatToIntBits(this.horizontalEllipseRadius) * 31, 31), 31);
            boolean z10 = this.isMoreThanHalf;
            ?? r3 = z10;
            if (z10) {
                r3 = 1;
            }
            int i10 = (iA + r3) * 31;
            boolean z11 = this.isPositiveArc;
            return Float.floatToIntBits(this.arcStartY) + z1.a(this.arcStartX, (i10 + (z11 ? 1 : z11)) * 31, 31);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb2.append(this.horizontalEllipseRadius);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.verticalEllipseRadius);
            sb2.append(", theta=");
            sb2.append(this.theta);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.isMoreThanHalf);
            sb2.append(", isPositiveArc=");
            sb2.append(this.isPositiveArc);
            sb2.append(", arcStartX=");
            sb2.append(this.arcStartX);
            sb2.append(", arcStartY=");
            return u.i(sb2, this.arcStartY, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode;", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Close extends PathNode {

        @NotNull
        public static final Close INSTANCE = new Close();

        /* JADX WARN: Illegal instructions before constructor call */
        public Close() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003JE\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "component3", "component4", "component5", "component6", "x1", "y1", "x2", "y2", "x3", "y3", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getX1", "()F", "d", "getY1", "e", "getX2", "f", "getY2", "g", "getX3", "h", "getY3", "<init>", "(FFFFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class CurveTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float x1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float y1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final float x2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final float y2;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final float x3;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final float y3;

        public CurveTo(float f6, float f10, float f11, float f12, float f13, float f14) {
            super(true, false, 2, null);
            this.x1 = f6;
            this.y1 = f10;
            this.x2 = f11;
            this.y2 = f12;
            this.x3 = f13;
            this.y3 = f14;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f6, float f10, float f11, float f12, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = curveTo.x1;
            }
            if ((i10 & 2) != 0) {
                f10 = curveTo.y1;
            }
            float f15 = f10;
            if ((i10 & 4) != 0) {
                f11 = curveTo.x2;
            }
            float f16 = f11;
            if ((i10 & 8) != 0) {
                f12 = curveTo.y2;
            }
            float f17 = f12;
            if ((i10 & 16) != 0) {
                f13 = curveTo.x3;
            }
            float f18 = f13;
            if ((i10 & 32) != 0) {
                f14 = curveTo.y3;
            }
            return curveTo.copy(f6, f15, f16, f17, f18, f14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getX3() {
            return this.x3;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getY3() {
            return this.y3;
        }

        @NotNull
        public final CurveTo copy(float x4, float y7, float x6, float y10, float x7, float y11) {
            return new CurveTo(x4, y7, x6, y10, x7, y11);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) other;
            return Float.compare(this.x1, curveTo.x1) == 0 && Float.compare(this.y1, curveTo.y1) == 0 && Float.compare(this.x2, curveTo.x2) == 0 && Float.compare(this.y2, curveTo.y2) == 0 && Float.compare(this.x3, curveTo.x3) == 0 && Float.compare(this.y3, curveTo.y3) == 0;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getX3() {
            return this.x3;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        public final float getY3() {
            return this.y3;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y3) + z1.a(this.x3, z1.a(this.y2, z1.a(this.x2, z1.a(this.y1, Float.floatToIntBits(this.x1) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
            sb2.append(this.x1);
            sb2.append(", y1=");
            sb2.append(this.y1);
            sb2.append(", x2=");
            sb2.append(this.x2);
            sb2.append(", y2=");
            sb2.append(this.y2);
            sb2.append(", x3=");
            sb2.append(this.x3);
            sb2.append(", y3=");
            return u.i(sb2, this.y3, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "x", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getX", "()F", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class HorizontalTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float x;

        /* JADX WARN: Illegal instructions before constructor call */
        public HorizontalTo(float f6) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.x = f6;
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = horizontalTo.x;
            }
            return horizontalTo.copy(f6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        @NotNull
        public final HorizontalTo copy(float x4) {
            return new HorizontalTo(x4);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HorizontalTo) && Float.compare(this.x, ((HorizontalTo) other).x) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.x);
        }

        @NotNull
        public String toString() {
            return u.i(new StringBuilder("HorizontalTo(x="), this.x, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "x", "y", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getX", "()F", "d", "getY", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class LineTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float x;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public LineTo(float f6, float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.x = f6;
            this.y = f10;
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f6, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = lineTo.x;
            }
            if ((i10 & 2) != 0) {
                f10 = lineTo.y;
            }
            return lineTo.copy(f6, f10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @NotNull
        public final LineTo copy(float x4, float y7) {
            return new LineTo(x4, y7);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) other;
            return Float.compare(this.x, lineTo.x) == 0 && Float.compare(this.y, lineTo.y) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LineTo(x=");
            sb2.append(this.x);
            sb2.append(", y=");
            return u.i(sb2, this.y, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "x", "y", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getX", "()F", "d", "getY", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class MoveTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float x;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public MoveTo(float f6, float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.x = f6;
            this.y = f10;
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f6, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = moveTo.x;
            }
            if ((i10 & 2) != 0) {
                f10 = moveTo.y;
            }
            return moveTo.copy(f6, f10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @NotNull
        public final MoveTo copy(float x4, float y7) {
            return new MoveTo(x4, y7);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) other;
            return Float.compare(this.x, moveTo.x) == 0 && Float.compare(this.y, moveTo.y) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MoveTo(x=");
            sb2.append(this.x);
            sb2.append(", y=");
            return u.i(sb2, this.y, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "component3", "component4", "x1", "y1", "x2", "y2", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getX1", "()F", "d", "getY1", "e", "getX2", "f", "getY2", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class QuadTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float x1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float y1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final float x2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final float y2;

        public QuadTo(float f6, float f10, float f11, float f12) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x1 = f6;
            this.y1 = f10;
            this.x2 = f11;
            this.y2 = f12;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f6, float f10, float f11, float f12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = quadTo.x1;
            }
            if ((i10 & 2) != 0) {
                f10 = quadTo.y1;
            }
            if ((i10 & 4) != 0) {
                f11 = quadTo.x2;
            }
            if ((i10 & 8) != 0) {
                f12 = quadTo.y2;
            }
            return quadTo.copy(f6, f10, f11, f12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        @NotNull
        public final QuadTo copy(float x4, float y7, float x6, float y10) {
            return new QuadTo(x4, y7, x6, y10);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) other;
            return Float.compare(this.x1, quadTo.x1) == 0 && Float.compare(this.y1, quadTo.y1) == 0 && Float.compare(this.x2, quadTo.x2) == 0 && Float.compare(this.y2, quadTo.y2) == 0;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y2) + z1.a(this.x2, z1.a(this.y1, Float.floatToIntBits(this.x1) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
            sb2.append(this.x1);
            sb2.append(", y1=");
            sb2.append(this.y1);
            sb2.append(", x2=");
            sb2.append(this.x2);
            sb2.append(", y2=");
            return u.i(sb2, this.y2, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "component3", "component4", "x1", "y1", "x2", "y2", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getX1", "()F", "d", "getY1", "e", "getX2", "f", "getY2", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class ReflectiveCurveTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float x1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float y1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final float x2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final float y2;

        public ReflectiveCurveTo(float f6, float f10, float f11, float f12) {
            super(true, false, 2, null);
            this.x1 = f6;
            this.y1 = f10;
            this.x2 = f11;
            this.y2 = f12;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f6, float f10, float f11, float f12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = reflectiveCurveTo.x1;
            }
            if ((i10 & 2) != 0) {
                f10 = reflectiveCurveTo.y1;
            }
            if ((i10 & 4) != 0) {
                f11 = reflectiveCurveTo.x2;
            }
            if ((i10 & 8) != 0) {
                f12 = reflectiveCurveTo.y2;
            }
            return reflectiveCurveTo.copy(f6, f10, f11, f12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX1() {
            return this.x1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY1() {
            return this.y1;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getX2() {
            return this.x2;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getY2() {
            return this.y2;
        }

        @NotNull
        public final ReflectiveCurveTo copy(float x4, float y7, float x6, float y10) {
            return new ReflectiveCurveTo(x4, y7, x6, y10);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) other;
            return Float.compare(this.x1, reflectiveCurveTo.x1) == 0 && Float.compare(this.y1, reflectiveCurveTo.y1) == 0 && Float.compare(this.x2, reflectiveCurveTo.x2) == 0 && Float.compare(this.y2, reflectiveCurveTo.y2) == 0;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y2) + z1.a(this.x2, z1.a(this.y1, Float.floatToIntBits(this.x1) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
            sb2.append(this.x1);
            sb2.append(", y1=");
            sb2.append(this.y1);
            sb2.append(", x2=");
            sb2.append(this.x2);
            sb2.append(", y2=");
            return u.i(sb2, this.y2, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "x", "y", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getX", "()F", "d", "getY", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class ReflectiveQuadTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float x;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float y;

        public ReflectiveQuadTo(float f6, float f10) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.x = f6;
            this.y = f10;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f6, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = reflectiveQuadTo.x;
            }
            if ((i10 & 2) != 0) {
                f10 = reflectiveQuadTo.y;
            }
            return reflectiveQuadTo.copy(f6, f10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @NotNull
        public final ReflectiveQuadTo copy(float x4, float y7) {
            return new ReflectiveQuadTo(x4, y7);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) other;
            return Float.compare(this.x, reflectiveQuadTo.x) == 0 && Float.compare(this.y, reflectiveQuadTo.y) == 0;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y) + (Float.floatToIntBits(this.x) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
            sb2.append(this.x);
            sb2.append(", y=");
            return u.i(sb2, this.y, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JO\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000e\u0010$R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\u000f\u0010$R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001d¨\u0006,"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "component7", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "isMoreThanHalf", "isPositiveArc", "arcStartDx", "arcStartDy", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "c", "F", "getHorizontalEllipseRadius", "()F", "d", "getVerticalEllipseRadius", "e", "getTheta", "f", "Z", "()Z", "g", "h", "getArcStartDx", "i", "getArcStartDy", "<init>", "(FFFZZFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RelativeArcTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float horizontalEllipseRadius;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float verticalEllipseRadius;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final float theta;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final boolean isMoreThanHalf;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final boolean isPositiveArc;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final float arcStartDx;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final float arcStartDy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeArcTo(float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.horizontalEllipseRadius = f6;
            this.verticalEllipseRadius = f10;
            this.theta = f11;
            this.isMoreThanHalf = z10;
            this.isPositiveArc = z11;
            this.arcStartDx = f12;
            this.arcStartDy = f13;
        }

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f6, float f10, float f11, boolean z10, boolean z11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i10 & 2) != 0) {
                f10 = relativeArcTo.verticalEllipseRadius;
            }
            float f14 = f10;
            if ((i10 & 4) != 0) {
                f11 = relativeArcTo.theta;
            }
            float f15 = f11;
            if ((i10 & 8) != 0) {
                z10 = relativeArcTo.isMoreThanHalf;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = relativeArcTo.isPositiveArc;
            }
            boolean z13 = z11;
            if ((i10 & 32) != 0) {
                f12 = relativeArcTo.arcStartDx;
            }
            float f16 = f12;
            if ((i10 & 64) != 0) {
                f13 = relativeArcTo.arcStartDy;
            }
            return relativeArcTo.copy(f6, f14, f15, z12, z13, f16, f13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getTheta() {
            return this.theta;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getIsPositiveArc() {
            return this.isPositiveArc;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        @NotNull
        public final RelativeArcTo copy(float horizontalEllipseRadius, float verticalEllipseRadius, float theta, boolean isMoreThanHalf, boolean isPositiveArc, float arcStartDx, float arcStartDy) {
            return new RelativeArcTo(horizontalEllipseRadius, verticalEllipseRadius, theta, isMoreThanHalf, isPositiveArc, arcStartDx, arcStartDy);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) other;
            return Float.compare(this.horizontalEllipseRadius, relativeArcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, relativeArcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, relativeArcTo.theta) == 0 && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && Float.compare(this.arcStartDx, relativeArcTo.arcStartDx) == 0 && Float.compare(this.arcStartDy, relativeArcTo.arcStartDy) == 0;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        public int hashCode() {
            int iA = z1.a(this.theta, z1.a(this.verticalEllipseRadius, Float.floatToIntBits(this.horizontalEllipseRadius) * 31, 31), 31);
            boolean z10 = this.isMoreThanHalf;
            ?? r3 = z10;
            if (z10) {
                r3 = 1;
            }
            int i10 = (iA + r3) * 31;
            boolean z11 = this.isPositiveArc;
            return Float.floatToIntBits(this.arcStartDy) + z1.a(this.arcStartDx, (i10 + (z11 ? 1 : z11)) * 31, 31);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb2.append(this.horizontalEllipseRadius);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.verticalEllipseRadius);
            sb2.append(", theta=");
            sb2.append(this.theta);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.isMoreThanHalf);
            sb2.append(", isPositiveArc=");
            sb2.append(this.isPositiveArc);
            sb2.append(", arcStartDx=");
            sb2.append(this.arcStartDx);
            sb2.append(", arcStartDy=");
            return u.i(sb2, this.arcStartDy, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003JE\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "component3", "component4", "component5", "component6", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getDx1", "()F", "d", "getDy1", "e", "getDx2", "f", "getDy2", "g", "getDx3", "h", "getDy3", "<init>", "(FFFFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RelativeCurveTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float dx1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float dy1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final float dx2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final float dy2;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final float dx3;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final float dy3;

        public RelativeCurveTo(float f6, float f10, float f11, float f12, float f13, float f14) {
            super(true, false, 2, null);
            this.dx1 = f6;
            this.dy1 = f10;
            this.dx2 = f11;
            this.dy2 = f12;
            this.dx3 = f13;
            this.dy3 = f14;
        }

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f6, float f10, float f11, float f12, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = relativeCurveTo.dx1;
            }
            if ((i10 & 2) != 0) {
                f10 = relativeCurveTo.dy1;
            }
            float f15 = f10;
            if ((i10 & 4) != 0) {
                f11 = relativeCurveTo.dx2;
            }
            float f16 = f11;
            if ((i10 & 8) != 0) {
                f12 = relativeCurveTo.dy2;
            }
            float f17 = f12;
            if ((i10 & 16) != 0) {
                f13 = relativeCurveTo.dx3;
            }
            float f18 = f13;
            if ((i10 & 32) != 0) {
                f14 = relativeCurveTo.dy3;
            }
            return relativeCurveTo.copy(f6, f15, f16, f17, f18, f14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getDx3() {
            return this.dx3;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getDy3() {
            return this.dy3;
        }

        @NotNull
        public final RelativeCurveTo copy(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
            return new RelativeCurveTo(dx1, dy1, dx2, dy2, dx3, dy3);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) other;
            return Float.compare(this.dx1, relativeCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeCurveTo.dy2) == 0 && Float.compare(this.dx3, relativeCurveTo.dx3) == 0 && Float.compare(this.dy3, relativeCurveTo.dy3) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDy3() {
            return this.dy3;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy3) + z1.a(this.dx3, z1.a(this.dy2, z1.a(this.dx2, z1.a(this.dy1, Float.floatToIntBits(this.dx1) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
            sb2.append(this.dx1);
            sb2.append(", dy1=");
            sb2.append(this.dy1);
            sb2.append(", dx2=");
            sb2.append(this.dx2);
            sb2.append(", dy2=");
            sb2.append(this.dy2);
            sb2.append(", dx3=");
            sb2.append(this.dx3);
            sb2.append(", dy3=");
            return u.i(sb2, this.dy3, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "dx", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getDx", "()F", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RelativeHorizontalTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float dx;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeHorizontalTo(float f6) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.dx = f6;
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = relativeHorizontalTo.dx;
            }
            return relativeHorizontalTo.copy(f6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        @NotNull
        public final RelativeHorizontalTo copy(float dx) {
            return new RelativeHorizontalTo(dx);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RelativeHorizontalTo) && Float.compare(this.dx, ((RelativeHorizontalTo) other).dx) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dx);
        }

        @NotNull
        public String toString() {
            return u.i(new StringBuilder("RelativeHorizontalTo(dx="), this.dx, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "dx", "dy", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getDx", "()F", "d", "getDy", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RelativeLineTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float dx;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeLineTo(float f6, float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.dx = f6;
            this.dy = f10;
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f6, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = relativeLineTo.dx;
            }
            if ((i10 & 2) != 0) {
                f10 = relativeLineTo.dy;
            }
            return relativeLineTo.copy(f6, f10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @NotNull
        public final RelativeLineTo copy(float dx, float dy) {
            return new RelativeLineTo(dx, dy);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) other;
            return Float.compare(this.dx, relativeLineTo.dx) == 0 && Float.compare(this.dy, relativeLineTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy) + (Float.floatToIntBits(this.dx) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
            sb2.append(this.dx);
            sb2.append(", dy=");
            return u.i(sb2, this.dy, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "dx", "dy", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getDx", "()F", "d", "getDy", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RelativeMoveTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float dx;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeMoveTo(float f6, float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.dx = f6;
            this.dy = f10;
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f6, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = relativeMoveTo.dx;
            }
            if ((i10 & 2) != 0) {
                f10 = relativeMoveTo.dy;
            }
            return relativeMoveTo.copy(f6, f10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @NotNull
        public final RelativeMoveTo copy(float dx, float dy) {
            return new RelativeMoveTo(dx, dy);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) other;
            return Float.compare(this.dx, relativeMoveTo.dx) == 0 && Float.compare(this.dy, relativeMoveTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy) + (Float.floatToIntBits(this.dx) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
            sb2.append(this.dx);
            sb2.append(", dy=");
            return u.i(sb2, this.dy, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "component3", "component4", "dx1", "dy1", "dx2", "dy2", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getDx1", "()F", "d", "getDy1", "e", "getDx2", "f", "getDy2", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RelativeQuadTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float dx1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float dy1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final float dx2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final float dy2;

        public RelativeQuadTo(float f6, float f10, float f11, float f12) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx1 = f6;
            this.dy1 = f10;
            this.dx2 = f11;
            this.dy2 = f12;
        }

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f6, float f10, float f11, float f12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = relativeQuadTo.dx1;
            }
            if ((i10 & 2) != 0) {
                f10 = relativeQuadTo.dy1;
            }
            if ((i10 & 4) != 0) {
                f11 = relativeQuadTo.dx2;
            }
            if ((i10 & 8) != 0) {
                f12 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.copy(f6, f10, f11, f12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        @NotNull
        public final RelativeQuadTo copy(float dx1, float dy1, float dx2, float dy2) {
            return new RelativeQuadTo(dx1, dy1, dx2, dy2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) other;
            return Float.compare(this.dx1, relativeQuadTo.dx1) == 0 && Float.compare(this.dy1, relativeQuadTo.dy1) == 0 && Float.compare(this.dx2, relativeQuadTo.dx2) == 0 && Float.compare(this.dy2, relativeQuadTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy2) + z1.a(this.dx2, z1.a(this.dy1, Float.floatToIntBits(this.dx1) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
            sb2.append(this.dx1);
            sb2.append(", dy1=");
            sb2.append(this.dy1);
            sb2.append(", dx2=");
            sb2.append(this.dx2);
            sb2.append(", dy2=");
            return u.i(sb2, this.dy2, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "component3", "component4", "dx1", "dy1", "dx2", "dy2", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getDx1", "()F", "d", "getDy1", "e", "getDx2", "f", "getDy2", "<init>", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RelativeReflectiveCurveTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float dx1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float dy1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final float dx2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final float dy2;

        public RelativeReflectiveCurveTo(float f6, float f10, float f11, float f12) {
            super(true, false, 2, null);
            this.dx1 = f6;
            this.dy1 = f10;
            this.dx2 = f11;
            this.dy2 = f12;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f6, float f10, float f11, float f12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = relativeReflectiveCurveTo.dx1;
            }
            if ((i10 & 2) != 0) {
                f10 = relativeReflectiveCurveTo.dy1;
            }
            if ((i10 & 4) != 0) {
                f11 = relativeReflectiveCurveTo.dx2;
            }
            if ((i10 & 8) != 0) {
                f12 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.copy(f6, f10, f11, f12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getDx1() {
            return this.dx1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getDy1() {
            return this.dy1;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getDx2() {
            return this.dx2;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getDy2() {
            return this.dy2;
        }

        @NotNull
        public final RelativeReflectiveCurveTo copy(float dx1, float dy1, float dx2, float dy2) {
            return new RelativeReflectiveCurveTo(dx1, dy1, dx2, dy2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) other;
            return Float.compare(this.dx1, relativeReflectiveCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeReflectiveCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeReflectiveCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeReflectiveCurveTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy2) + z1.a(this.dx2, z1.a(this.dy1, Float.floatToIntBits(this.dx1) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb2.append(this.dx1);
            sb2.append(", dy1=");
            sb2.append(this.dy1);
            sb2.append(", dx2=");
            sb2.append(this.dx2);
            sb2.append(", dy2=");
            return u.i(sb2, this.dy2, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "component2", "dx", "dy", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getDx", "()F", "d", "getDy", "<init>", "(FF)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RelativeReflectiveQuadTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float dx;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float dy;

        public RelativeReflectiveQuadTo(float f6, float f10) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx = f6;
            this.dy = f10;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f6, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = relativeReflectiveQuadTo.dx;
            }
            if ((i10 & 2) != 0) {
                f10 = relativeReflectiveQuadTo.dy;
            }
            return relativeReflectiveQuadTo.copy(f6, f10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getDx() {
            return this.dx;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @NotNull
        public final RelativeReflectiveQuadTo copy(float dx, float dy) {
            return new RelativeReflectiveQuadTo(dx, dy);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) other;
            return Float.compare(this.dx, relativeReflectiveQuadTo.dx) == 0 && Float.compare(this.dy, relativeReflectiveQuadTo.dy) == 0;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy) + (Float.floatToIntBits(this.dx) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb2.append(this.dx);
            sb2.append(", dy=");
            return u.i(sb2, this.dy, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "dy", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getDy", "()F", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class RelativeVerticalTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float dy;

        /* JADX WARN: Illegal instructions before constructor call */
        public RelativeVerticalTo(float f6) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.dy = f6;
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = relativeVerticalTo.dy;
            }
            return relativeVerticalTo.copy(f6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getDy() {
            return this.dy;
        }

        @NotNull
        public final RelativeVerticalTo copy(float dy) {
            return new RelativeVerticalTo(dy);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RelativeVerticalTo) && Float.compare(this.dy, ((RelativeVerticalTo) other).dy) == 0;
        }

        public final float getDy() {
            return this.dy;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.dy);
        }

        @NotNull
        public String toString() {
            return u.i(new StringBuilder("RelativeVerticalTo(dy="), this.dy, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    @Immutable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "component1", "y", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "F", "getY", "()F", "<init>", "(F)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class VerticalTo extends PathNode {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public VerticalTo(float f6) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.y = f6;
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f6, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = verticalTo.y;
            }
            return verticalTo.copy(f6);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getY() {
            return this.y;
        }

        @NotNull
        public final VerticalTo copy(float y7) {
            return new VerticalTo(y7);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalTo) && Float.compare(this.y, ((VerticalTo) other).y) == 0;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.y);
        }

        @NotNull
        public String toString() {
            return u.i(new StringBuilder("VerticalTo(y="), this.y, RootService.CLOSE_BRACKET);
        }
    }

    public PathNode(boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this.isCurve = z10;
        this.isQuad = z11;
    }

    /* JADX INFO: renamed from: isCurve, reason: from getter */
    public final boolean getIsCurve() {
        return this.isCurve;
    }

    /* JADX INFO: renamed from: isQuad, reason: from getter */
    public final boolean getIsQuad() {
        return this.isQuad;
    }

    public /* synthetic */ PathNode(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}
