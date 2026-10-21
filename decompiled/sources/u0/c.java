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
public final class c extends androidx.compose.ui.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Object f93710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Object f93711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Object f93712g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull String fqName, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f93709d = fqName;
        this.f93710e = obj;
        this.f93711f = obj2;
        this.f93712g = obj3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (Intrinsics.areEqual(this.f93709d, cVar.f93709d) && Intrinsics.areEqual(this.f93710e, cVar.f93710e) && Intrinsics.areEqual(this.f93711f, cVar.f93711f) && Intrinsics.areEqual(this.f93712g, cVar.f93712g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f93709d.hashCode() * 31;
        Object obj = this.f93710e;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f93711f;
        int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.f93712g;
        return iHashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }
}
