package u0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
public final class a extends androidx.compose.ui.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Object f93705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String fqName, @Nullable Object obj, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f93704d = fqName;
        this.f93705e = obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Intrinsics.areEqual(this.f93704d, aVar.f93704d) && Intrinsics.areEqual(this.f93705e, aVar.f93705e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f93704d.hashCode() * 31;
        Object obj = this.f93705e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
