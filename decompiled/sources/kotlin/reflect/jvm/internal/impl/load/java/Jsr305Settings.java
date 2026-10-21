package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.datastore.preferences.protobuf.e;
import bk.d;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Jsr305Settings.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Jsr305Settings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ReportLevel f80518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ReportLevel f80519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<FqName, ReportLevel> f80520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f80521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f80522e;

    /* JADX INFO: compiled from: Jsr305Settings.kt */
    @SourceDebugExtension({"SMAP\nJsr305Settings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jsr305Settings.kt\norg/jetbrains/kotlin/load/java/Jsr305Settings$description$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,27:1\n1#2:28\n215#3,2:29\n37#4,2:31\n*S KotlinDebug\n*F\n+ 1 Jsr305Settings.kt\norg/jetbrains/kotlin/load/java/Jsr305Settings$description$2\n*L\n20#1:29,2\n21#1:31,2\n*E\n"})
    public static final class a extends Lambda implements Function0<String[]> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String[] invoke() {
            List listCreateListBuilder = d.createListBuilder();
            Jsr305Settings jsr305Settings = Jsr305Settings.this;
            listCreateListBuilder.add(jsr305Settings.getGlobalLevel().getDescription());
            ReportLevel migrationLevel = jsr305Settings.getMigrationLevel();
            if (migrationLevel != null) {
                listCreateListBuilder.add("under-migration:" + migrationLevel.getDescription());
            }
            for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.getUserDefinedLevelForSpecificAnnotation().entrySet()) {
                listCreateListBuilder.add("@" + entry.getKey() + AbstractJsonLexerKt.COLON + entry.getValue().getDescription());
            }
            return (String[]) d.build(listCreateListBuilder).toArray(new String[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(@NotNull ReportLevel globalLevel, @Nullable ReportLevel reportLevel, @NotNull Map<FqName, ? extends ReportLevel> userDefinedLevelForSpecificAnnotation) {
        Intrinsics.checkNotNullParameter(globalLevel, "globalLevel");
        Intrinsics.checkNotNullParameter(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f80518a = globalLevel;
        this.f80519b = reportLevel;
        this.f80520c = userDefinedLevelForSpecificAnnotation;
        this.f80521d = LazyKt__LazyJVMKt.lazy(new a());
        ReportLevel reportLevel2 = ReportLevel.IGNORE;
        this.f80522e = globalLevel == reportLevel2 && reportLevel == reportLevel2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f80518a == jsr305Settings.f80518a && this.f80519b == jsr305Settings.f80519b && Intrinsics.areEqual(this.f80520c, jsr305Settings.f80520c);
    }

    @NotNull
    public final ReportLevel getGlobalLevel() {
        return this.f80518a;
    }

    @Nullable
    public final ReportLevel getMigrationLevel() {
        return this.f80519b;
    }

    @NotNull
    public final Map<FqName, ReportLevel> getUserDefinedLevelForSpecificAnnotation() {
        return this.f80520c;
    }

    public int hashCode() {
        int iHashCode = this.f80518a.hashCode() * 31;
        ReportLevel reportLevel = this.f80519b;
        return this.f80520c.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final boolean isDisabled() {
        return this.f80522e;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Jsr305Settings(globalLevel=");
        sb2.append(this.f80518a);
        sb2.append(", migrationLevel=");
        sb2.append(this.f80519b);
        sb2.append(", userDefinedLevelForSpecificAnnotation=");
        return e.g(sb2, this.f80520c, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i10 & 2) != 0 ? null : reportLevel2, (i10 & 4) != 0 ? q.emptyMap() : map);
    }
}
