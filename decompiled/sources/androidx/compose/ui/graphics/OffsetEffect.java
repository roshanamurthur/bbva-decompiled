package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.r;

/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001c\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0015J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/OffsetEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "createRenderEffect", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "renderEffect", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(Landroidx/compose/ui/graphics/RenderEffect;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class OffsetEffect extends RenderEffect {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final RenderEffect f15673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15674c;

    public OffsetEffect(RenderEffect renderEffect, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        super(null);
        this.f15673b = renderEffect;
        this.f15674c = j10;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    @RequiresApi(31)
    @NotNull
    /* JADX INFO: renamed from: createRenderEffect */
    public android.graphics.RenderEffect getAndroidRenderEffect() {
        return r.f94722a.b(this.f15673b, this.f15674c);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) other;
        return Intrinsics.areEqual(this.f15673b, offsetEffect.f15673b) && Offset.m2272equalsimpl0(this.f15674c, offsetEffect.f15674c);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.f15673b;
        return Offset.m2277hashCodeimpl(this.f15674c) + ((renderEffect != null ? renderEffect.hashCode() : 0) * 31);
    }

    @NotNull
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.f15673b + ", offset=" + ((Object) Offset.m2283toStringimpl(this.f15674c)) + RootService.CLOSE_BRACKET;
    }
}
