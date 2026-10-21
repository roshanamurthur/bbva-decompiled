package androidx.compose.foundation.layout;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "", "component1", "", "component2", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "component3", "weight", "fill", "crossAxisAlignment", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "F", "getWeight", "()F", "setWeight", "(F)V", "b", "Z", "getFill", "()Z", "setFill", "(Z)V", "c", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "setCrossAxisAlignment", "(Landroidx/compose/foundation/layout/CrossAxisAlignment;)V", "<init>", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RowColumnParentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public float weight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean fill;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CrossAxisAlignment crossAxisAlignment;

    public RowColumnParentData() {
        this(0.0f, false, null, 7, null);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f6, boolean z10, CrossAxisAlignment crossAxisAlignment, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = rowColumnParentData.weight;
        }
        if ((i10 & 2) != 0) {
            z10 = rowColumnParentData.fill;
        }
        if ((i10 & 4) != 0) {
            crossAxisAlignment = rowColumnParentData.crossAxisAlignment;
        }
        return rowColumnParentData.copy(f6, z10, crossAxisAlignment);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @NotNull
    public final RowColumnParentData copy(float weight, boolean fill, @Nullable CrossAxisAlignment crossAxisAlignment) {
        return new RowColumnParentData(weight, fill, crossAxisAlignment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) other;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && Intrinsics.areEqual(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment);
    }

    @Nullable
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final float getWeight() {
        return this.weight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.weight) * 31;
        boolean z10 = this.fill;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = (iFloatToIntBits + r1) * 31;
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        return i10 + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode());
    }

    public final void setCrossAxisAlignment(@Nullable CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final void setFill(boolean z10) {
        this.fill = z10;
    }

    public final void setWeight(float f6) {
        this.weight = f6;
    }

    @NotNull
    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + RootService.CLOSE_BRACKET;
    }

    public RowColumnParentData(float f6, boolean z10, @Nullable CrossAxisAlignment crossAxisAlignment) {
        this.weight = f6;
        this.fill = z10;
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public /* synthetic */ RowColumnParentData(float f6, boolean z10, CrossAxisAlignment crossAxisAlignment, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f6, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : crossAxisAlignment);
    }
}
