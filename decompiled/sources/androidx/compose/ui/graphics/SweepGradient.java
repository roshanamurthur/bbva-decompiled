package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/geometry/Offset;", "center", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class SweepGradient extends ShaderBrush {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<Color> f15738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<Float> f15739f;

    public SweepGradient() {
        throw null;
    }

    public SweepGradient(long j10, List colors, List list, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f15737d = j10;
        this.f15738e = colors;
        this.f15739f = list;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo2483createShaderuvyYCjk(long size) {
        long jOffset;
        long j10 = this.f15737d;
        if (OffsetKt.m2296isUnspecifiedk4lQ0M(j10)) {
            jOffset = SizeKt.m2354getCenteruvyYCjk(size);
        } else {
            jOffset = OffsetKt.Offset(Offset.m2275getXimpl(j10) == Float.POSITIVE_INFINITY ? Size.m2344getWidthimpl(size) : Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10) == Float.POSITIVE_INFINITY ? Size.m2341getHeightimpl(size) : Offset.m2276getYimpl(j10));
        }
        return ShaderKt.m2782SweepGradientShader9KIMszo(jOffset, this.f15738e, this.f15739f);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) other;
        return Offset.m2272equalsimpl0(this.f15737d, sweepGradient.f15737d) && Intrinsics.areEqual(this.f15738e, sweepGradient.f15738e) && Intrinsics.areEqual(this.f15739f, sweepGradient.f15739f);
    }

    public int hashCode() {
        int iA = com.google.android.gms.measurement.internal.a.a(this.f15738e, Offset.m2277hashCodeimpl(this.f15737d) * 31, 31);
        List<Float> list = this.f15739f;
        return iA + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str;
        long j10 = this.f15737d;
        if (OffsetKt.m2294isSpecifiedk4lQ0M(j10)) {
            str = "center=" + ((Object) Offset.m2283toStringimpl(j10)) + ", ";
        } else {
            str = "";
        }
        StringBuilder sbD = ci.a.d("SweepGradient(", str, "colors=");
        sbD.append(this.f15738e);
        sbD.append(", stops=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.c(sbD, this.f15739f, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ SweepGradient(long j10, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, list, (i10 & 4) != 0 ? null : list2, null);
    }
}
