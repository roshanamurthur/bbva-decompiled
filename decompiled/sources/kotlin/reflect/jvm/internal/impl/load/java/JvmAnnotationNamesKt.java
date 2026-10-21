package kotlin.reflect.jvm.internal.impl.load.java;

import bk.q;
import bk.w;
import bk.x;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmAnnotationNames.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JvmAnnotationNamesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final FqName f80525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final FqName f80526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FqName f80527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final FqName f80528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final FqName f80529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final FqName f80530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final List<FqName> f80531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final FqName f80532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final FqName f80533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final List<FqName> f80534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final FqName f80535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final FqName f80536l;

    @NotNull
    public static final FqName m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final FqName f80537n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Set<FqName> f80538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Set<FqName> f80539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Set<FqName> f80540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final Map<FqName, FqName> f80541r;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        f80525a = fqName;
        f80526b = new FqName("org.jspecify.nullness.NullnessUnspecified");
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f80527c = fqName2;
        FqName fqName3 = new FqName("org.jspecify.annotations.Nullable");
        f80528d = fqName3;
        f80529e = new FqName("org.jspecify.annotations.NullnessUnspecified");
        FqName fqName4 = new FqName("org.jspecify.annotations.NullMarked");
        f80530f = fqName4;
        List<FqName> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FqName[]{JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("android.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("javax.annotation.Nullable"), new FqName("javax.annotation.CheckForNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable")});
        f80531g = listListOf;
        FqName fqName5 = new FqName("javax.annotation.Nonnull");
        f80532h = fqName5;
        f80533i = new FqName("javax.annotation.CheckForNull");
        List<FqName> listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new FqName[]{JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("android.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("lombok.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull")});
        f80534j = listListOf2;
        FqName fqName6 = new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        f80535k = fqName6;
        FqName fqName7 = new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        f80536l = fqName7;
        FqName fqName8 = new FqName("androidx.annotation.RecentlyNullable");
        m = fqName8;
        FqName fqName9 = new FqName("androidx.annotation.RecentlyNonNull");
        f80537n = fqName9;
        f80538o = x.plus((Set<? extends FqName>) x.plus((Set<? extends FqName>) x.plus((Set<? extends FqName>) x.plus((Set<? extends FqName>) x.plus((Set<? extends FqName>) x.plus((Set<? extends FqName>) x.plus((Set<? extends FqName>) x.plus((Set<? extends FqName>) x.plus(x.plus((Set<? extends FqName>) x.plus((Set) new LinkedHashSet(), (Iterable) listListOf), fqName5), (Iterable) listListOf2), fqName6), fqName7), fqName8), fqName9), fqName), fqName2), fqName3), fqName4);
        f80539p = w.setOf((Object[]) new FqName[]{JvmAnnotationNames.JETBRAINS_READONLY_ANNOTATION, JvmAnnotationNames.READONLY_ANNOTATION});
        f80540q = w.setOf((Object[]) new FqName[]{JvmAnnotationNames.JETBRAINS_MUTABLE_ANNOTATION, JvmAnnotationNames.MUTABLE_ANNOTATION});
        f80541r = q.mapOf(TuplesKt.to(JvmAnnotationNames.TARGET_ANNOTATION, StandardNames.FqNames.target), TuplesKt.to(JvmAnnotationNames.RETENTION_ANNOTATION, StandardNames.FqNames.retention), TuplesKt.to(JvmAnnotationNames.DEPRECATED_ANNOTATION, StandardNames.FqNames.deprecated), TuplesKt.to(JvmAnnotationNames.DOCUMENTED_ANNOTATION, StandardNames.FqNames.mustBeDocumented));
    }

    @NotNull
    public static final FqName getANDROIDX_RECENTLY_NON_NULL_ANNOTATION() {
        return f80537n;
    }

    @NotNull
    public static final FqName getANDROIDX_RECENTLY_NULLABLE_ANNOTATION() {
        return m;
    }

    @NotNull
    public static final FqName getCOMPATQUAL_NONNULL_ANNOTATION() {
        return f80536l;
    }

    @NotNull
    public static final FqName getCOMPATQUAL_NULLABLE_ANNOTATION() {
        return f80535k;
    }

    @NotNull
    public static final FqName getJAVAX_CHECKFORNULL_ANNOTATION() {
        return f80533i;
    }

    @NotNull
    public static final FqName getJAVAX_NONNULL_ANNOTATION() {
        return f80532h;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULLABLE() {
        return f80528d;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULLNESS_UNKNOWN() {
        return f80529e;
    }

    @NotNull
    public static final FqName getJSPECIFY_NULL_MARKED() {
        return f80530f;
    }

    @NotNull
    public static final FqName getJSPECIFY_OLD_NULLABLE() {
        return f80525a;
    }

    @NotNull
    public static final FqName getJSPECIFY_OLD_NULLNESS_UNKNOWN() {
        return f80526b;
    }

    @NotNull
    public static final FqName getJSPECIFY_OLD_NULL_MARKED() {
        return f80527c;
    }

    @NotNull
    public static final Set<FqName> getMUTABLE_ANNOTATIONS() {
        return f80540q;
    }

    @NotNull
    public static final List<FqName> getNOT_NULL_ANNOTATIONS() {
        return f80534j;
    }

    @NotNull
    public static final List<FqName> getNULLABLE_ANNOTATIONS() {
        return f80531g;
    }

    @NotNull
    public static final Set<FqName> getREAD_ONLY_ANNOTATIONS() {
        return f80539p;
    }
}
