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
public final class b extends androidx.compose.ui.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Object f93707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Object f93708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull String fqName, @Nullable Object obj, @Nullable Object obj2, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f93706d = fqName;
        this.f93707e = obj;
        this.f93708f = obj2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (Intrinsics.areEqual(this.f93706d, bVar.f93706d) && Intrinsics.areEqual(this.f93707e, bVar.f93707e) && Intrinsics.areEqual(this.f93708f, bVar.f93708f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f93706d.hashCode() * 31;
        Object obj = this.f93707e;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f93708f;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }
}
