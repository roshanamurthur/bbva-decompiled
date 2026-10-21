package kotlin.reflect.jvm.internal.impl.load.java;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JavaTypeEnhancementState.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaTypeEnhancementState {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final JavaTypeEnhancementState f80512d = new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings$default(null, 1, null), a.f80516p0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Jsr305Settings f80513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<FqName, ReportLevel> f80514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80515c;

    /* JADX INFO: compiled from: JavaTypeEnhancementState.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JavaTypeEnhancementState getDEFAULT() {
            return JavaTypeEnhancementState.f80512d;
        }
    }

    /* JADX INFO: compiled from: JavaTypeEnhancementState.kt */
    public /* synthetic */ class a extends FunctionReference implements Function1<FqName, ReportLevel> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80516p0 = new a(1);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinPackage(JavaNullabilityAnnotationSettingsKt.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ReportLevel invoke(@NotNull FqName p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return JavaNullabilityAnnotationSettingsKt.getDefaultReportLevelForAnnotation(p4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(@NotNull Jsr305Settings jsr305, @NotNull Function1<? super FqName, ? extends ReportLevel> getReportLevelForAnnotation) {
        Intrinsics.checkNotNullParameter(jsr305, "jsr305");
        Intrinsics.checkNotNullParameter(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f80513a = jsr305;
        this.f80514b = getReportLevelForAnnotation;
        this.f80515c = jsr305.isDisabled() || getReportLevelForAnnotation.invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == ReportLevel.IGNORE;
    }

    public final boolean getDisabledDefaultAnnotations() {
        return this.f80515c;
    }

    @NotNull
    public final Function1<FqName, ReportLevel> getGetReportLevelForAnnotation() {
        return this.f80514b;
    }

    @NotNull
    public final Jsr305Settings getJsr305() {
        return this.f80513a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("JavaTypeEnhancementState(jsr305=");
        sb2.append(this.f80513a);
        sb2.append(", getReportLevelForAnnotation=");
        return ci.a.c(sb2, this.f80514b, RootService.CLOSE_BRACKET);
    }
}
