package androidx.compose.ui.layout;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/layout/FixedScale;", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/geometry/Size;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/ScaleFactor;", "computeScaleFactor-H7hwNQA", "(JJ)J", "computeScaleFactor", "", "component1", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "F", "getValue", "()F", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class FixedScale implements ContentScale {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float value;

    public FixedScale(float f6) {
        this.value = f6;
    }

    public static /* synthetic */ FixedScale copy$default(FixedScale fixedScale, float f6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = fixedScale.value;
        }
        return fixedScale.copy(f6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
    public long mo3570computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
        float f6 = this.value;
        return ScaleFactorKt.ScaleFactor(f6, f6);
    }

    @NotNull
    public final FixedScale copy(float value) {
        return new FixedScale(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FixedScale) && Float.compare(this.value, ((FixedScale) other).value) == 0;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    @NotNull
    public String toString() {
        return u.i(new StringBuilder("FixedScale(value="), this.value, RootService.CLOSE_BRACKET);
    }
}
