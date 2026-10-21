package m0;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f83325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83326b;

    public u0(@NotNull Object obj, int i10) {
        this.f83325a = obj;
        this.f83326b = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.areEqual(this.f83325a, u0Var.f83325a) && this.f83326b == u0Var.f83326b;
    }

    public final int hashCode() {
        return (this.f83325a.hashCode() * 31) + this.f83326b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SourceInformationSlotTableGroupIdentity(parentIdentity=");
        sb2.append(this.f83325a);
        sb2.append(", index=");
        return androidx.activity.a.d(sb2, this.f83326b, RootService.CLOSE_BRACKET);
    }
}
