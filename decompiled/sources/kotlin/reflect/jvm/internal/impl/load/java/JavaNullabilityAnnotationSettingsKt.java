package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.camera.camera2.internal.compat.u;
import bk.q;
import kotlin.KotlinVersion;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJavaNullabilityAnnotationSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaNullabilityAnnotationSettings.kt\norg/jetbrains/kotlin/load/java/JavaNullabilityAnnotationSettingsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
public final class JavaNullabilityAnnotationSettingsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final FqName f80504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final FqName[] f80505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final NullabilityAnnotationStatesImpl f80506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final JavaNullabilityAnnotationsStatus f80507d;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        FqName fqName2 = new FqName("org.jspecify.annotations");
        f80504a = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        String strAsString = fqName3.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        f80505b = new FqName[]{new FqName(u.f(strAsString, ".Nullable")), new FqName(u.f(strAsString, ".NonNull"))};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        KotlinVersion kotlinVersion = new KotlinVersion(2, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f80506c = new NullabilityAnnotationStatesImpl(q.mapOf(TuplesKt.to(fqName5, companion.getDEFAULT()), TuplesKt.to(new FqName("androidx.annotation"), companion.getDEFAULT()), TuplesKt.to(new FqName("android.support.annotation"), companion.getDEFAULT()), TuplesKt.to(new FqName("android.annotation"), companion.getDEFAULT()), TuplesKt.to(new FqName("com.android.annotations"), companion.getDEFAULT()), TuplesKt.to(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT()), TuplesKt.to(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT()), TuplesKt.to(fqName4, companion.getDEFAULT()), TuplesKt.to(new FqName("javax.annotation"), companion.getDEFAULT()), TuplesKt.to(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT()), TuplesKt.to(new FqName("io.reactivex.annotations"), companion.getDEFAULT()), TuplesKt.to(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null)), TuplesKt.to(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null)), TuplesKt.to(new FqName("lombok"), companion.getDEFAULT()), TuplesKt.to(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kotlinVersion, reportLevel2)), TuplesKt.to(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(2, 0), reportLevel2)), TuplesKt.to(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 8), reportLevel2))));
        f80507d = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    @NotNull
    public static final Jsr305Settings getDefaultJsr305Settings(@NotNull KotlinVersion configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = f80507d;
        ReportLevel reportLevelBefore = (javaNullabilityAnnotationsStatus.getSinceVersion() == null || javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(configuredKotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.getReportLevelBefore() : javaNullabilityAnnotationsStatus.getReportLevelAfter();
        return new Jsr305Settings(reportLevelBefore, getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevelBefore), null, 4, null);
    }

    public static /* synthetic */ Jsr305Settings getDefaultJsr305Settings$default(KotlinVersion kotlinVersion, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kotlinVersion = KotlinVersion.CURRENT;
        }
        return getDefaultJsr305Settings(kotlinVersion);
    }

    @Nullable
    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(@NotNull ReportLevel globalReportLevel) {
        Intrinsics.checkNotNullParameter(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    @NotNull
    public static final ReportLevel getDefaultReportLevelForAnnotation(@NotNull FqName annotationFqName) {
        Intrinsics.checkNotNullParameter(annotationFqName, "annotationFqName");
        return getReportLevelForAnnotation$default(annotationFqName, NullabilityAnnotationStates.Companion.getEMPTY(), null, 4, null);
    }

    @NotNull
    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return f80504a;
    }

    @NotNull
    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return f80505b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ReportLevel getReportLevelForAnnotation(@NotNull FqName annotation, @NotNull NullabilityAnnotationStates<? extends ReportLevel> configuredReportLevels, @NotNull KotlinVersion configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        ReportLevel reportLevel = configuredReportLevels.get(annotation);
        if (reportLevel != null) {
            return reportLevel;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) f80506c.get(annotation);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        return (javaNullabilityAnnotationsStatus.getSinceVersion() == null || javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(configuredKotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.getReportLevelBefore() : javaNullabilityAnnotationsStatus.getReportLevelAfter();
    }

    public static /* synthetic */ ReportLevel getReportLevelForAnnotation$default(FqName fqName, NullabilityAnnotationStates nullabilityAnnotationStates, KotlinVersion kotlinVersion, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            kotlinVersion = new KotlinVersion(1, 7, 20);
        }
        return getReportLevelForAnnotation(fqName, nullabilityAnnotationStates, kotlinVersion);
    }
}
