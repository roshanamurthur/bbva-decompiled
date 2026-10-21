package u0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
public final class d extends androidx.compose.ui.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Object[] f93714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull String fqName, @NotNull Object[] keys, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f93713d = fqName;
        this.f93714e = keys;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (Intrinsics.areEqual(this.f93713d, dVar.f93713d) && Arrays.equals(this.f93714e, dVar.f93714e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f93714e) + (this.f93713d.hashCode() * 31);
    }
}
