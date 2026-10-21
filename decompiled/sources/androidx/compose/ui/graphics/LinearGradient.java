package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BF\b\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001cø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001d\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "Landroidx/compose/ui/geometry/Offset;", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class LinearGradient extends ShaderBrush {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<Color> f15667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<Float> f15668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15671h;

    public LinearGradient(List colors, List list, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f15667d = colors;
        this.f15668e = list;
        this.f15669f = j10;
        this.f15670g = j11;
        this.f15671h = i10;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo2483createShaderuvyYCjk(long size) {
        long j10 = this.f15669f;
        float fM2344getWidthimpl = Offset.m2275getXimpl(j10) == Float.POSITIVE_INFINITY ? Size.m2344getWidthimpl(size) : Offset.m2275getXimpl(j10);
        float fM2341getHeightimpl = Offset.m2276getYimpl(j10) == Float.POSITIVE_INFINITY ? Size.m2341getHeightimpl(size) : Offset.m2276getYimpl(j10);
        long j11 = this.f15670g;
        return ShaderKt.m2778LinearGradientShaderVjE6UOU(OffsetKt.Offset(fM2344getWidthimpl, fM2341getHeightimpl), OffsetKt.Offset(Offset.m2275getXimpl(j11) == Float.POSITIVE_INFINITY ? Size.m2344getWidthimpl(size) : Offset.m2275getXimpl(j11), Offset.m2276getYimpl(j11) == Float.POSITIVE_INFINITY ? Size.m2341getHeightimpl(size) : Offset.m2276getYimpl(j11)), this.f15667d, this.f15668e, this.f15671h);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) other;
        return Intrinsics.areEqual(this.f15667d, linearGradient.f15667d) && Intrinsics.areEqual(this.f15668e, linearGradient.f15668e) && Offset.m2272equalsimpl0(this.f15669f, linearGradient.f15669f) && Offset.m2272equalsimpl0(this.f15670g, linearGradient.f15670g) && TileMode.m2824equalsimpl0(this.f15671h, linearGradient.f15671h);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        float fAbs;
        long j10 = this.f15669f;
        float fM2275getXimpl = Offset.m2275getXimpl(j10);
        boolean zIsInfinite = Float.isInfinite(fM2275getXimpl);
        float fAbs2 = Float.NaN;
        long j11 = this.f15670g;
        if (zIsInfinite || Float.isNaN(fM2275getXimpl)) {
            fAbs = Float.NaN;
        } else {
            float fM2275getXimpl2 = Offset.m2275getXimpl(j11);
            if (Float.isInfinite(fM2275getXimpl2) || Float.isNaN(fM2275getXimpl2)) {
                fAbs = Float.NaN;
            } else {
                fAbs = Math.abs(Offset.m2275getXimpl(j10) - Offset.m2275getXimpl(j11));
            }
        }
        float fM2276getYimpl = Offset.m2276getYimpl(j10);
        if (!Float.isInfinite(fM2276getYimpl) && !Float.isNaN(fM2276getYimpl)) {
            float fM2276getYimpl2 = Offset.m2276getYimpl(j11);
            if (!Float.isInfinite(fM2276getYimpl2) && !Float.isNaN(fM2276getYimpl2)) {
                fAbs2 = Math.abs(Offset.m2276getYimpl(j10) - Offset.m2276getYimpl(j11));
            }
        }
        return SizeKt.Size(fAbs, fAbs2);
    }

    public int hashCode() {
        int iHashCode = this.f15667d.hashCode() * 31;
        List<Float> list = this.f15668e;
        return TileMode.m2825hashCodeimpl(this.f15671h) + ((Offset.m2277hashCodeimpl(this.f15670g) + ((Offset.m2277hashCodeimpl(this.f15669f) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str;
        long j10 = this.f15669f;
        String str2 = "";
        if (OffsetKt.m2292isFinitek4lQ0M(j10)) {
            str = "start=" + ((Object) Offset.m2283toStringimpl(j10)) + ", ";
        } else {
            str = "";
        }
        long j11 = this.f15670g;
        if (OffsetKt.m2292isFinitek4lQ0M(j11)) {
            str2 = "end=" + ((Object) Offset.m2283toStringimpl(j11)) + ", ";
        }
        return "LinearGradient(colors=" + this.f15667d + ", stops=" + this.f15668e + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m2826toStringimpl(this.f15671h)) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j10, long j11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : list2, j10, j11, (i11 & 16) != 0 ? TileMode.INSTANCE.m2828getClamp3opZhB0() : i10, null);
    }
}
