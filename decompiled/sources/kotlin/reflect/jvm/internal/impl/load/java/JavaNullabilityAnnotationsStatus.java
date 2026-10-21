package kotlin.reflect.jvm.internal.impl.load.java;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaNullabilityAnnotationsStatus.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaNullabilityAnnotationsStatus {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final JavaNullabilityAnnotationsStatus f80508d = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ReportLevel f80509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final KotlinVersion f80510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ReportLevel f80511c;

    /* JADX INFO: compiled from: JavaNullabilityAnnotationsStatus.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JavaNullabilityAnnotationsStatus getDEFAULT() {
            return JavaNullabilityAnnotationsStatus.f80508d;
        }
    }

    public JavaNullabilityAnnotationsStatus(@NotNull ReportLevel reportLevelBefore, @Nullable KotlinVersion kotlinVersion, @NotNull ReportLevel reportLevelAfter) {
        Intrinsics.checkNotNullParameter(reportLevelBefore, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevelAfter, "reportLevelAfter");
        this.f80509a = reportLevelBefore;
        this.f80510b = kotlinVersion;
        this.f80511c = reportLevelAfter;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.f80509a == javaNullabilityAnnotationsStatus.f80509a && Intrinsics.areEqual(this.f80510b, javaNullabilityAnnotationsStatus.f80510b) && this.f80511c == javaNullabilityAnnotationsStatus.f80511c;
    }

    @NotNull
    public final ReportLevel getReportLevelAfter() {
        return this.f80511c;
    }

    @NotNull
    public final ReportLevel getReportLevelBefore() {
        return this.f80509a;
    }

    @Nullable
    public final KotlinVersion getSinceVersion() {
        return this.f80510b;
    }

    public int hashCode() {
        int iHashCode = this.f80509a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f80510b;
        return this.f80511c.hashCode() + ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.getF79386s0())) * 31);
    }

    @NotNull
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f80509a + ", sinceVersion=" + this.f80510b + ", reportLevelAfter=" + this.f80511c + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i10 & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i10 & 4) != 0 ? reportLevel : reportLevel2);
    }
}
