package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.r;

/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B0\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0015J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "createRenderEffect", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "renderEffect", "", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/TileMode;", "edgeTreatment", "<init>", "(Landroidx/compose/ui/graphics/RenderEffect;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class BlurEffect extends RenderEffect {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final RenderEffect f15597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15600e;

    public BlurEffect(RenderEffect renderEffect, float f6, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        super(null);
        this.f15597b = renderEffect;
        this.f15598c = f6;
        this.f15599d = f10;
        this.f15600e = i10;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    @RequiresApi(31)
    @NotNull
    /* JADX INFO: renamed from: createRenderEffect */
    public android.graphics.RenderEffect getAndroidRenderEffect() {
        return r.f94722a.a(this.f15597b, this.f15598c, this.f15599d, this.f15600e);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) other;
        return this.f15598c == blurEffect.f15598c && this.f15599d == blurEffect.f15599d && TileMode.m2824equalsimpl0(this.f15600e, blurEffect.f15600e) && Intrinsics.areEqual(this.f15597b, blurEffect.f15597b);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.f15597b;
        return TileMode.m2825hashCodeimpl(this.f15600e) + z1.a(this.f15599d, z1.a(this.f15598c, (renderEffect != null ? renderEffect.hashCode() : 0) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "BlurEffect(renderEffect=" + this.f15597b + ", radiusX=" + this.f15598c + ", radiusY=" + this.f15599d + ", edgeTreatment=" + ((Object) TileMode.m2826toStringimpl(this.f15600e)) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f6, float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, f6, (i11 & 4) != 0 ? f6 : f10, (i11 & 8) != 0 ? TileMode.INSTANCE.m2828getClamp3opZhB0() : i10, null);
    }
}
