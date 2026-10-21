package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.appcompat.widget.g0;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaToKotlinClassMap.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJavaToKotlinClassMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n49#1,2:221\n49#1,2:223\n49#1,2:225\n49#1,2:227\n49#1,2:229\n49#1,2:231\n49#1,2:233\n49#1,2:235\n1#2:220\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n*L\n54#1:221,2\n55#1:223,2\n56#1:225,2\n57#1:227,2\n58#1:229,2\n59#1:231,2\n60#1:233,2\n61#1:235,2\n*E\n"})
public final class JavaToKotlinClassMap {

    @NotNull
    public static final JavaToKotlinClassMap INSTANCE = new JavaToKotlinClassMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f80136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f80137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f80138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f80139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ClassId f80140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final FqName f80141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final ClassId f80142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final HashMap<FqNameUnsafe, ClassId> f80143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final HashMap<FqNameUnsafe, ClassId> f80144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final HashMap<FqNameUnsafe, FqName> f80145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final HashMap<FqNameUnsafe, FqName> f80146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final HashMap<ClassId, ClassId> f80147l;

    @NotNull
    public static final HashMap<ClassId, ClassId> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final List<PlatformMutabilityMapping> f80148n;

    /* JADX INFO: compiled from: JavaToKotlinClassMap.kt */
    public static final class PlatformMutabilityMapping {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ClassId f80149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ClassId f80150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ClassId f80151c;

        public PlatformMutabilityMapping(@NotNull ClassId javaClass, @NotNull ClassId kotlinReadOnly, @NotNull ClassId kotlinMutable) {
            Intrinsics.checkNotNullParameter(javaClass, "javaClass");
            Intrinsics.checkNotNullParameter(kotlinReadOnly, "kotlinReadOnly");
            Intrinsics.checkNotNullParameter(kotlinMutable, "kotlinMutable");
            this.f80149a = javaClass;
            this.f80150b = kotlinReadOnly;
            this.f80151c = kotlinMutable;
        }

        @NotNull
        public final ClassId component1() {
            return this.f80149a;
        }

        @NotNull
        public final ClassId component2() {
            return this.f80150b;
        }

        @NotNull
        public final ClassId component3() {
            return this.f80151c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.areEqual(this.f80149a, platformMutabilityMapping.f80149a) && Intrinsics.areEqual(this.f80150b, platformMutabilityMapping.f80150b) && Intrinsics.areEqual(this.f80151c, platformMutabilityMapping.f80151c);
        }

        @NotNull
        public final ClassId getJavaClass() {
            return this.f80149a;
        }

        public int hashCode() {
            return this.f80151c.hashCode() + ((this.f80150b.hashCode() + (this.f80149a.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f80149a + ", kotlinReadOnly=" + this.f80150b + ", kotlinMutable=" + this.f80151c + RootService.CLOSE_BRACKET;
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        sb2.append(function.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(function.getClassNamePrefix());
        f80136a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.INSTANCE;
        sb3.append(kFunction.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(kFunction.getClassNamePrefix());
        f80137b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
        sb4.append(suspendFunction.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(suspendFunction.getClassNamePrefix());
        f80138c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.INSTANCE;
        sb5.append(kSuspendFunction.getPackageFqName().toString());
        sb5.append('.');
        sb5.append(kSuspendFunction.getClassNamePrefix());
        f80139d = sb5.toString();
        ClassId classId = ClassId.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
        f80140e = classId;
        FqName fqNameAsSingleFqName = classId.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName, "asSingleFqName(...)");
        f80141f = fqNameAsSingleFqName;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        f80142g = standardClassIds.getKFunction();
        standardClassIds.getKClass();
        e(Class.class);
        f80143h = new HashMap<>();
        f80144i = new HashMap<>();
        f80145j = new HashMap<>();
        f80146k = new HashMap<>();
        f80147l = new HashMap<>();
        m = new HashMap<>();
        ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.iterable);
        Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(...)");
        FqName fqName = StandardNames.FqNames.mutableIterable;
        FqName packageFqName = classId2.getPackageFqName();
        FqName packageFqName2 = classId2.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName2, "getPackageFqName(...)");
        FqName fqNameTail = FqNamesUtilKt.tail(fqName, packageFqName2);
        ClassId classId3 = new ClassId(packageFqName, fqNameTail, false);
        ClassId classId4 = ClassId.topLevel(StandardNames.FqNames.iterator);
        Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(...)");
        FqName fqName2 = StandardNames.FqNames.mutableIterator;
        FqName packageFqName3 = classId4.getPackageFqName();
        FqName packageFqName4 = classId4.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName4, "getPackageFqName(...)");
        ClassId classId5 = new ClassId(packageFqName3, FqNamesUtilKt.tail(fqName2, packageFqName4), false);
        ClassId classId6 = ClassId.topLevel(StandardNames.FqNames.collection);
        Intrinsics.checkNotNullExpressionValue(classId6, "topLevel(...)");
        FqName fqName3 = StandardNames.FqNames.mutableCollection;
        FqName packageFqName5 = classId6.getPackageFqName();
        FqName packageFqName6 = classId6.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName6, "getPackageFqName(...)");
        ClassId classId7 = new ClassId(packageFqName5, FqNamesUtilKt.tail(fqName3, packageFqName6), false);
        ClassId classId8 = ClassId.topLevel(StandardNames.FqNames.list);
        Intrinsics.checkNotNullExpressionValue(classId8, "topLevel(...)");
        FqName fqName4 = StandardNames.FqNames.mutableList;
        FqName packageFqName7 = classId8.getPackageFqName();
        FqName packageFqName8 = classId8.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName8, "getPackageFqName(...)");
        ClassId classId9 = new ClassId(packageFqName7, FqNamesUtilKt.tail(fqName4, packageFqName8), false);
        ClassId classId10 = ClassId.topLevel(StandardNames.FqNames.set);
        Intrinsics.checkNotNullExpressionValue(classId10, "topLevel(...)");
        FqName fqName5 = StandardNames.FqNames.mutableSet;
        FqName packageFqName9 = classId10.getPackageFqName();
        FqName packageFqName10 = classId10.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName10, "getPackageFqName(...)");
        ClassId classId11 = new ClassId(packageFqName9, FqNamesUtilKt.tail(fqName5, packageFqName10), false);
        ClassId classId12 = ClassId.topLevel(StandardNames.FqNames.listIterator);
        Intrinsics.checkNotNullExpressionValue(classId12, "topLevel(...)");
        FqName fqName6 = StandardNames.FqNames.mutableListIterator;
        FqName packageFqName11 = classId12.getPackageFqName();
        FqName packageFqName12 = classId12.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName12, "getPackageFqName(...)");
        ClassId classId13 = new ClassId(packageFqName11, FqNamesUtilKt.tail(fqName6, packageFqName12), false);
        FqName fqName7 = StandardNames.FqNames.map;
        ClassId classId14 = ClassId.topLevel(fqName7);
        Intrinsics.checkNotNullExpressionValue(classId14, "topLevel(...)");
        FqName fqName8 = StandardNames.FqNames.mutableMap;
        FqName packageFqName13 = classId14.getPackageFqName();
        FqName packageFqName14 = classId14.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName14, "getPackageFqName(...)");
        ClassId classId15 = new ClassId(packageFqName13, FqNamesUtilKt.tail(fqName8, packageFqName14), false);
        ClassId classIdCreateNestedClassId = ClassId.topLevel(fqName7).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        Intrinsics.checkNotNullExpressionValue(classIdCreateNestedClassId, "createNestedClassId(...)");
        FqName fqName9 = StandardNames.FqNames.mutableMapEntry;
        FqName packageFqName15 = classIdCreateNestedClassId.getPackageFqName();
        FqName packageFqName16 = classIdCreateNestedClassId.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName16, "getPackageFqName(...)");
        List<PlatformMutabilityMapping> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new PlatformMutabilityMapping[]{new PlatformMutabilityMapping(e(Iterable.class), classId2, classId3), new PlatformMutabilityMapping(e(Iterator.class), classId4, classId5), new PlatformMutabilityMapping(e(Collection.class), classId6, classId7), new PlatformMutabilityMapping(e(List.class), classId8, classId9), new PlatformMutabilityMapping(e(Set.class), classId10, classId11), new PlatformMutabilityMapping(e(ListIterator.class), classId12, classId13), new PlatformMutabilityMapping(e(Map.class), classId14, classId15), new PlatformMutabilityMapping(e(Map.Entry.class), classIdCreateNestedClassId, new ClassId(packageFqName15, FqNamesUtilKt.tail(fqName9, packageFqName16), false))});
        f80148n = listListOf;
        d(Object.class, StandardNames.FqNames.any);
        d(String.class, StandardNames.FqNames.string);
        d(CharSequence.class, StandardNames.FqNames.charSequence);
        c(Throwable.class, StandardNames.FqNames.throwable);
        d(Cloneable.class, StandardNames.FqNames.cloneable);
        d(Number.class, StandardNames.FqNames.number);
        c(Comparable.class, StandardNames.FqNames.comparable);
        d(Enum.class, StandardNames.FqNames._enum);
        c(Annotation.class, StandardNames.FqNames.annotation);
        for (PlatformMutabilityMapping platformMutabilityMapping : listListOf) {
            INSTANCE.getClass();
            ClassId classIdComponent1 = platformMutabilityMapping.component1();
            ClassId classIdComponent2 = platformMutabilityMapping.component2();
            ClassId classIdComponent3 = platformMutabilityMapping.component3();
            a(classIdComponent1, classIdComponent2);
            FqName fqNameAsSingleFqName2 = classIdComponent3.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName2, "asSingleFqName(...)");
            b(fqNameAsSingleFqName2, classIdComponent1);
            f80147l.put(classIdComponent3, classIdComponent2);
            m.put(classIdComponent2, classIdComponent3);
            FqName fqNameAsSingleFqName3 = classIdComponent2.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName3, "asSingleFqName(...)");
            FqName fqNameAsSingleFqName4 = classIdComponent3.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName4, "asSingleFqName(...)");
            FqNameUnsafe unsafe = classIdComponent3.asSingleFqName().toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "toUnsafe(...)");
            f80145j.put(unsafe, fqNameAsSingleFqName3);
            FqNameUnsafe unsafe2 = fqNameAsSingleFqName3.toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe2, "toUnsafe(...)");
            f80146k.put(unsafe2, fqNameAsSingleFqName4);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap = INSTANCE;
            ClassId classId16 = ClassId.topLevel(jvmPrimitiveType.getWrapperFqName());
            Intrinsics.checkNotNullExpressionValue(classId16, "topLevel(...)");
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
            ClassId classId17 = ClassId.topLevel(StandardNames.getPrimitiveFqName(primitiveType));
            Intrinsics.checkNotNullExpressionValue(classId17, "topLevel(...)");
            javaToKotlinClassMap.getClass();
            a(classId16, classId17);
        }
        for (ClassId classId18 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId classId19 = ClassId.topLevel(new FqName("kotlin.jvm.internal." + classId18.getShortClassName().asString() + "CompanionObject"));
            Intrinsics.checkNotNullExpressionValue(classId19, "topLevel(...)");
            ClassId classIdCreateNestedClassId2 = classId18.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            Intrinsics.checkNotNullExpressionValue(classIdCreateNestedClassId2, "createNestedClassId(...)");
            javaToKotlinClassMap2.getClass();
            a(classId19, classIdCreateNestedClassId2);
        }
        for (int i10 = 0; i10 < 23; i10++) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            ClassId classId20 = ClassId.topLevel(new FqName(g0.c("kotlin.jvm.functions.Function", i10)));
            Intrinsics.checkNotNullExpressionValue(classId20, "topLevel(...)");
            ClassId functionClassId = StandardNames.getFunctionClassId(i10);
            javaToKotlinClassMap3.getClass();
            a(classId20, functionClassId);
            b(new FqName(f80137b + i10), f80142g);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.INSTANCE;
            String str = kSuspendFunction2.getPackageFqName().toString() + '.' + kSuspendFunction2.getClassNamePrefix();
            JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
            FqName fqName10 = new FqName(str + i11);
            ClassId classId21 = f80142g;
            javaToKotlinClassMap4.getClass();
            b(fqName10, classId21);
        }
        JavaToKotlinClassMap javaToKotlinClassMap5 = INSTANCE;
        FqName safe = StandardNames.FqNames.nothing.toSafe();
        Intrinsics.checkNotNullExpressionValue(safe, "toSafe(...)");
        javaToKotlinClassMap5.getClass();
        b(safe, e(Void.class));
    }

    public static void a(ClassId classId, ClassId classId2) {
        FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "toUnsafe(...)");
        f80143h.put(unsafe, classId2);
        FqName fqNameAsSingleFqName = classId2.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName, "asSingleFqName(...)");
        b(fqNameAsSingleFqName, classId);
    }

    public static void b(FqName fqName, ClassId classId) {
        FqNameUnsafe unsafe = fqName.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "toUnsafe(...)");
        f80144i.put(unsafe, classId);
    }

    public static void c(Class cls, FqName fqName) {
        ClassId classIdE = e(cls);
        ClassId classId = ClassId.topLevel(fqName);
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
        a(classIdE, classId);
    }

    public static void d(Class cls, FqNameUnsafe fqNameUnsafe) {
        FqName safe = fqNameUnsafe.toSafe();
        Intrinsics.checkNotNullExpressionValue(safe, "toSafe(...)");
        c(cls, safe);
    }

    public static ClassId e(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId classId = ClassId.topLevel(new FqName(cls.getCanonicalName()));
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
            return classId;
        }
        ClassId classIdCreateNestedClassId = e(declaringClass).createNestedClassId(Name.identifier(cls.getSimpleName()));
        Intrinsics.checkNotNullExpressionValue(classIdCreateNestedClassId, "createNestedClassId(...)");
        return classIdCreateNestedClassId;
    }

    public static boolean f(FqNameUnsafe fqNameUnsafe, String str) {
        Integer intOrNull;
        String strAsString = fqNameUnsafe.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        String strSubstringAfter = StringsKt__StringsKt.substringAfter(strAsString, str, "");
        return strSubstringAfter.length() > 0 && !StringsKt__StringsKt.startsWith$default((CharSequence) strSubstringAfter, '0', false, 2, (Object) null) && (intOrNull = k.toIntOrNull(strSubstringAfter)) != null && intOrNull.intValue() >= 23;
    }

    @NotNull
    public final FqName getFUNCTION_N_FQ_NAME() {
        return f80141f;
    }

    @NotNull
    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return f80148n;
    }

    public final boolean isMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f80145j.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f80146k.containsKey(fqNameUnsafe);
    }

    @Nullable
    public final ClassId mapJavaToKotlin(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return f80143h.get(fqName.toUnsafe());
    }

    @Nullable
    public final ClassId mapKotlinToJava(@NotNull FqNameUnsafe kotlinFqName) {
        Intrinsics.checkNotNullParameter(kotlinFqName, "kotlinFqName");
        boolean zF = f(kotlinFqName, f80136a);
        ClassId classId = f80140e;
        if (zF || f(kotlinFqName, f80138c)) {
            return classId;
        }
        boolean zF2 = f(kotlinFqName, f80137b);
        ClassId classId2 = f80142g;
        return (zF2 || f(kotlinFqName, f80139d)) ? classId2 : f80144i.get(kotlinFqName);
    }

    @Nullable
    public final FqName mutableToReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f80145j.get(fqNameUnsafe);
    }

    @Nullable
    public final FqName readOnlyToMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f80146k.get(fqNameUnsafe);
    }
}
