package androidx.compose.ui.layout;

import androidx.camera.core.impl.v;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.notifications.extensions.SalesforceDeepLinkModelExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/layout/ModifierInfo;", "", "", "toString", "Landroidx/compose/ui/Modifier;", "a", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/layout/LayoutCoordinates;", "b", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "c", "Ljava/lang/Object;", "getExtra", "()Ljava/lang/Object;", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LayoutCoordinates;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class ModifierInfo {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Modifier modifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutCoordinates coordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object extra;

    public ModifierInfo(@NotNull Modifier modifier, @NotNull LayoutCoordinates coordinates, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.modifier = modifier;
        this.coordinates = coordinates;
        this.extra = obj;
    }

    @NotNull
    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final Object getExtra() {
        return this.extra;
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ModifierInfo(");
        sb2.append(this.modifier);
        sb2.append(", ");
        sb2.append(this.coordinates);
        sb2.append(", ");
        return v.d(sb2, this.extra, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ ModifierInfo(Modifier modifier, LayoutCoordinates layoutCoordinates, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(modifier, layoutCoordinates, (i10 & 4) != 0 ? null : obj);
    }
}
