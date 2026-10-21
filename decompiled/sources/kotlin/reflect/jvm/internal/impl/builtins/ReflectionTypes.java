package kotlin.reflect.jvm.internal.impl.builtins;

import bk.d;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectionTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1549#2:226\n1620#2,3:227\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n*L\n94#1:226\n94#1:227,3\n*E\n"})
public final class ReflectionTypes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NotFoundClasses f80106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f80107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f80108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80105d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    @SourceDebugExtension({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1747#2,3:226\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n*L\n122#1:226,3\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final KotlinType createKPropertyStarType(@NotNull ModuleDescriptor module) {
            Intrinsics.checkNotNullParameter(module, "module");
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, StandardNames.FqNames.kProperty);
            if (classDescriptorFindClassAcrossModuleDependencies == null) {
                return null;
            }
            TypeAttributes empty = TypeAttributes.Companion.getEmpty();
            List<TypeParameterDescriptor> parameters = classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            Object objSingle = CollectionsKt___CollectionsKt.single((List<? extends Object>) parameters);
            Intrinsics.checkNotNullExpressionValue(objSingle, "single(...)");
            return KotlinTypeFactory.simpleNotNullType(empty, classDescriptorFindClassAcrossModuleDependencies, d.listOf(new StarProjectionImpl((TypeParameterDescriptor) objSingle)));
        }
    }

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f80109a;

        public a(int i10) {
            this.f80109a = i10;
        }

        @NotNull
        public final ClassDescriptor getValue(@NotNull ReflectionTypes types, @NotNull KProperty<?> property) {
            Intrinsics.checkNotNullParameter(types, "types");
            Intrinsics.checkNotNullParameter(property, "property");
            return ReflectionTypes.access$find(types, CapitalizeDecapitalizeKt.capitalizeAsciiOnly(property.getName()), this.f80109a);
        }
    }

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    public static final class b extends Lambda implements Function0<MemberScope> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ModuleDescriptor f80110p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ModuleDescriptor moduleDescriptor) {
            super(0);
            this.f80110p0 = moduleDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final MemberScope invoke() {
            return this.f80110p0.getPackage(StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
        }
    }

    public ReflectionTypes(@NotNull ModuleDescriptor module, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f80106a = notFoundClasses;
        this.f80107b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b(module));
        this.f80108c = new a(1);
        new a(1);
        new a(1);
        new a(2);
        new a(3);
        new a(1);
        new a(2);
        new a(3);
    }

    public static final ClassDescriptor access$find(ReflectionTypes reflectionTypes, String str, int i10) {
        reflectionTypes.getClass();
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier = ((MemberScope) reflectionTypes.f80107b.getValue()).mo5779getContributedClassifier(nameIdentifier, NoLookupLocation.FROM_REFLECTION);
        ClassDescriptor classDescriptor = classifierDescriptorMo5779getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5779getContributedClassifier : null;
        if (classDescriptor == null) {
            return reflectionTypes.f80106a.getClass(new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, nameIdentifier), d.listOf(Integer.valueOf(i10)));
        }
        return classDescriptor;
    }

    @NotNull
    public final ClassDescriptor getKClass() {
        return this.f80108c.getValue(this, f80105d[0]);
    }
}
