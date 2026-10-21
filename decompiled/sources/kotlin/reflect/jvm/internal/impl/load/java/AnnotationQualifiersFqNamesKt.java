package kotlin.reflect.jvm.internal.impl.load.java;

import bk.d;
import bk.q;
import bk.w;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnnotationQualifiersFqNames.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationQualifiersFqNamesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final FqName f80477a = new FqName("javax.annotation.meta.TypeQualifierNickname");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final FqName f80478b = new FqName("javax.annotation.meta.TypeQualifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FqName f80479c = new FqName("javax.annotation.meta.TypeQualifierDefault");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final FqName f80480d = new FqName("kotlin.annotations.jvm.UnderMigration");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final List<AnnotationQualifierApplicabilityType> f80481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> f80482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> f80483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Set<FqName> f80484h;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AnnotationQualifierApplicabilityType[]{AnnotationQualifierApplicabilityType.FIELD, AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, annotationQualifierApplicabilityType, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE});
        f80481e = listListOf;
        FqName jspecify_old_null_marked = JvmAnnotationNamesKt.getJSPECIFY_OLD_NULL_MARKED();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<FqName, JavaDefaultQualifiers> mapMapOf = q.mapOf(TuplesKt.to(jspecify_old_null_marked, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listListOf, false)), TuplesKt.to(JvmAnnotationNamesKt.getJSPECIFY_NULL_MARKED(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listListOf, false)));
        f80482f = mapMapOf;
        f80483g = q.plus(q.mapOf(TuplesKt.to(new FqName("javax.annotation.ParametersAreNullableByDefault"), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null), d.listOf(annotationQualifierApplicabilityType), false, 4, null)), TuplesKt.to(new FqName("javax.annotation.ParametersAreNonnullByDefault"), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), d.listOf(annotationQualifierApplicabilityType), false, 4, null))), mapMapOf);
        f80484h = w.setOf((Object[]) new FqName[]{JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION(), JvmAnnotationNamesKt.getJAVAX_CHECKFORNULL_ANNOTATION()});
    }

    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS() {
        return f80483g;
    }

    @NotNull
    public static final Set<FqName> getBUILT_IN_TYPE_QUALIFIER_FQ_NAMES() {
        return f80484h;
    }

    @NotNull
    public static final Map<FqName, JavaDefaultQualifiers> getJSPECIFY_DEFAULT_ANNOTATIONS() {
        return f80482f;
    }

    @NotNull
    public static final FqName getMIGRATION_ANNOTATION_FQNAME() {
        return f80480d;
    }

    @NotNull
    public static final FqName getTYPE_QUALIFIER_DEFAULT_FQNAME() {
        return f80479c;
    }

    @NotNull
    public static final FqName getTYPE_QUALIFIER_FQNAME() {
        return f80478b;
    }

    @NotNull
    public static final FqName getTYPE_QUALIFIER_NICKNAME_FQNAME() {
        return f80477a;
    }
}
