package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/Shapes;", "", "Landroidx/compose/foundation/shape/CornerBasedShape;", "extraSmall", "small", "medium", "large", "extraLarge", "copy", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraSmall", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "b", "getSmall", "c", "getMedium", "d", "getLarge", "e", "getExtraLarge", "<init>", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class Shapes {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CornerBasedShape extraSmall;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CornerBasedShape small;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CornerBasedShape medium;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CornerBasedShape large;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CornerBasedShape extraLarge;

    public Shapes() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cornerBasedShape = shapes.extraSmall;
        }
        if ((i10 & 2) != 0) {
            cornerBasedShape2 = shapes.small;
        }
        CornerBasedShape cornerBasedShape6 = cornerBasedShape2;
        if ((i10 & 4) != 0) {
            cornerBasedShape3 = shapes.medium;
        }
        CornerBasedShape cornerBasedShape7 = cornerBasedShape3;
        if ((i10 & 8) != 0) {
            cornerBasedShape4 = shapes.large;
        }
        CornerBasedShape cornerBasedShape8 = cornerBasedShape4;
        if ((i10 & 16) != 0) {
            cornerBasedShape5 = shapes.extraLarge;
        }
        return shapes.copy(cornerBasedShape, cornerBasedShape6, cornerBasedShape7, cornerBasedShape8, cornerBasedShape5);
    }

    @NotNull
    public final Shapes copy(@NotNull CornerBasedShape extraSmall, @NotNull CornerBasedShape small, @NotNull CornerBasedShape medium, @NotNull CornerBasedShape large, @NotNull CornerBasedShape extraLarge) {
        Intrinsics.checkNotNullParameter(extraSmall, "extraSmall");
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(large, "large");
        Intrinsics.checkNotNullParameter(extraLarge, "extraLarge");
        return new Shapes(extraSmall, small, medium, large, extraLarge);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) other;
        return Intrinsics.areEqual(this.extraSmall, shapes.extraSmall) && Intrinsics.areEqual(this.small, shapes.small) && Intrinsics.areEqual(this.medium, shapes.medium) && Intrinsics.areEqual(this.large, shapes.large) && Intrinsics.areEqual(this.extraLarge, shapes.extraLarge);
    }

    @NotNull
    public final CornerBasedShape getExtraLarge() {
        return this.extraLarge;
    }

    @NotNull
    public final CornerBasedShape getExtraSmall() {
        return this.extraSmall;
    }

    @NotNull
    public final CornerBasedShape getLarge() {
        return this.large;
    }

    @NotNull
    public final CornerBasedShape getMedium() {
        return this.medium;
    }

    @NotNull
    public final CornerBasedShape getSmall() {
        return this.small;
    }

    public int hashCode() {
        return this.extraLarge.hashCode() + ((this.large.hashCode() + ((this.medium.hashCode() + ((this.small.hashCode() + (this.extraSmall.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Shapes(extraSmall=" + this.extraSmall + ", small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ", extraLarge=" + this.extraLarge + RootService.CLOSE_BRACKET;
    }

    public Shapes(@NotNull CornerBasedShape extraSmall, @NotNull CornerBasedShape small, @NotNull CornerBasedShape medium, @NotNull CornerBasedShape large, @NotNull CornerBasedShape extraLarge) {
        Intrinsics.checkNotNullParameter(extraSmall, "extraSmall");
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(large, "large");
        Intrinsics.checkNotNullParameter(extraLarge, "extraLarge");
        this.extraSmall = extraSmall;
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.extraLarge = extraLarge;
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, CornerBasedShape cornerBasedShape4, CornerBasedShape cornerBasedShape5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ShapeDefaults.INSTANCE.getExtraSmall() : cornerBasedShape, (i10 & 2) != 0 ? ShapeDefaults.INSTANCE.getSmall() : cornerBasedShape2, (i10 & 4) != 0 ? ShapeDefaults.INSTANCE.getMedium() : cornerBasedShape3, (i10 & 8) != 0 ? ShapeDefaults.INSTANCE.getLarge() : cornerBasedShape4, (i10 & 16) != 0 ? ShapeDefaults.INSTANCE.getExtraLarge() : cornerBasedShape5);
    }
}
