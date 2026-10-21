package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VersionRequirement.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class VersionRequirementTable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final VersionRequirementTable f81250b = new VersionRequirementTable(CollectionsKt__CollectionsKt.emptyList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<ProtoBuf.VersionRequirement> f81251a;

    /* JADX INFO: compiled from: VersionRequirement.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VersionRequirementTable create(@NotNull ProtoBuf.VersionRequirementTable table) {
            Intrinsics.checkNotNullParameter(table, "table");
            if (table.getRequirementCount() == 0) {
                return getEMPTY();
            }
            List<ProtoBuf.VersionRequirement> requirementList = table.getRequirementList();
            Intrinsics.checkNotNullExpressionValue(requirementList, "getRequirementList(...)");
            return new VersionRequirementTable(requirementList, null);
        }

        @NotNull
        public final VersionRequirementTable getEMPTY() {
            return VersionRequirementTable.f81250b;
        }
    }

    public /* synthetic */ VersionRequirementTable(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public VersionRequirementTable(List<ProtoBuf.VersionRequirement> list) {
        this.f81251a = list;
    }
}
