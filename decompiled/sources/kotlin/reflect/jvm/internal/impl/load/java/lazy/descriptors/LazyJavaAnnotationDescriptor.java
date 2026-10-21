package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJavaAnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1549#2:125\n1620#2,3:126\n*S KotlinDebug\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor\n*L\n94#1:125\n94#1:126,3\n*E\n"})
public final class LazyJavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80657i = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyJavaResolverContext f80658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final JavaAnnotation f80659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NullableLazyValue f80660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final JavaSourceElement f80662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f80664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f80665h;

    /* JADX INFO: compiled from: LazyJavaAnnotationDescriptor.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor$allValueArguments$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1603#2,9:125\n1855#2:134\n1856#2:137\n1612#2:138\n1#3:135\n1#3:136\n*S KotlinDebug\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor$allValueArguments$2\n*L\n62#1:125,9\n62#1:134\n62#1:137\n62#1:138\n62#1:136\n*E\n"})
    public static final class a extends Lambda implements Function0<Map<Name, ? extends ConstantValue<?>>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<Name, ? extends ConstantValue<?>> invoke() {
            LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = LazyJavaAnnotationDescriptor.this;
            Collection<JavaAnnotationArgument> arguments = lazyJavaAnnotationDescriptor.f80659b.getArguments();
            ArrayList arrayList = new ArrayList();
            for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
                Name name = javaAnnotationArgument.getName();
                if (name == null) {
                    name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                }
                ConstantValue constantValueA = lazyJavaAnnotationDescriptor.a(javaAnnotationArgument);
                Pair pair = constantValueA != null ? TuplesKt.to(name, constantValueA) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return q.toMap(arrayList);
        }
    }

    /* JADX INFO: compiled from: LazyJavaAnnotationDescriptor.kt */
    public static final class b extends Lambda implements Function0<FqName> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final FqName invoke() {
            ClassId classId = LazyJavaAnnotationDescriptor.this.f80659b.getClassId();
            if (classId != null) {
                return classId.asSingleFqName();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: LazyJavaAnnotationDescriptor.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaAnnotationDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaAnnotationDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaAnnotationDescriptor$type$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    public static final class c extends Lambda implements Function0<SimpleType> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleType invoke() {
            LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = LazyJavaAnnotationDescriptor.this;
            FqName fqName = lazyJavaAnnotationDescriptor.getFqName();
            if (fqName == null) {
                return ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, lazyJavaAnnotationDescriptor.f80659b.toString());
            }
            ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(JavaToKotlinClassMapper.INSTANCE, fqName, lazyJavaAnnotationDescriptor.f80658a.getModule().getBuiltIns(), null, 4, null);
            if (classDescriptorMapJavaToKotlin$default == null) {
                JavaClass javaClassResolve = lazyJavaAnnotationDescriptor.f80659b.resolve();
                classDescriptorMapJavaToKotlin$default = javaClassResolve != null ? lazyJavaAnnotationDescriptor.f80658a.getComponents().getModuleClassResolver().resolveClass(javaClassResolve) : null;
                if (classDescriptorMapJavaToKotlin$default == null) {
                    classDescriptorMapJavaToKotlin$default = LazyJavaAnnotationDescriptor.access$createTypeForMissingDependencies(lazyJavaAnnotationDescriptor, fqName);
                }
            }
            return classDescriptorMapJavaToKotlin$default.getDefaultType();
        }
    }

    public LazyJavaAnnotationDescriptor(@NotNull LazyJavaResolverContext c10, @NotNull JavaAnnotation javaAnnotation, boolean z10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(javaAnnotation, "javaAnnotation");
        this.f80658a = c10;
        this.f80659b = javaAnnotation;
        this.f80660c = c10.getStorageManager().createNullableLazyValue(new b());
        this.f80661d = c10.getStorageManager().createLazyValue(new c());
        this.f80662e = c10.getComponents().getSourceElementFactory().source(javaAnnotation);
        this.f80663f = c10.getStorageManager().createLazyValue(new a());
        this.f80664g = javaAnnotation.isIdeExternalAnnotation();
        this.f80665h = javaAnnotation.isFreshlySupportedTypeUseAnnotation() || z10;
    }

    public static final ClassDescriptor access$createTypeForMissingDependencies(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor, FqName fqName) {
        LazyJavaResolverContext lazyJavaResolverContext = lazyJavaAnnotationDescriptor.f80658a;
        ModuleDescriptor module = lazyJavaResolverContext.getModule();
        ClassId classId = ClassId.topLevel(fqName);
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(module, classId, lazyJavaResolverContext.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
    }

    public final ConstantValue<?> a(JavaAnnotationArgument javaAnnotationArgument) {
        KotlinType arrayType;
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.createConstantValue$default(ConstantValueFactory.INSTANCE, ((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null, 2, null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            ClassId enumClassId = javaEnumValueAnnotationArgument.getEnumClassId();
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            if (enumClassId == null || entryName == null) {
                return null;
            }
            return new EnumValue(enumClassId, entryName);
        }
        boolean z10 = javaAnnotationArgument instanceof JavaArrayAnnotationArgument;
        LazyJavaResolverContext lazyJavaResolverContext = this.f80658a;
        if (!z10) {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f80658a, ((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation(), false, 4, null));
            }
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                return KClassValue.Companion.create(lazyJavaResolverContext.getTypeResolver().transformJavaType(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null)));
            }
            return null;
        }
        JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
        Name name = javaArrayAnnotationArgument.getName();
        if (name == null) {
            name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
        }
        Intrinsics.checkNotNull(name);
        List<JavaAnnotationArgument> elements = javaArrayAnnotationArgument.getElements();
        SimpleType type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "<get-type>(...)");
        if (KotlinTypeKt.isError(type)) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(this);
        Intrinsics.checkNotNull(annotationClass);
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, annotationClass);
        if (annotationParameterByName == null || (arrayType = annotationParameterByName.getType()) == null) {
            arrayType = lazyJavaResolverContext.getComponents().getModule().getBuiltIns().getArrayType(Variance.INVARIANT, ErrorUtils.createErrorType(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        Intrinsics.checkNotNull(arrayType);
        List<JavaAnnotationArgument> list = elements;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ConstantValue<?> constantValueA = a((JavaAnnotationArgument) it.next());
            if (constantValueA == null) {
                constantValueA = new NullValue();
            }
            arrayList.add(constantValueA);
        }
        return ConstantValueFactory.INSTANCE.createArrayValue(arrayList, arrayType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.f80663f, this, (KProperty<?>) f80657i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    public FqName getFqName() {
        return (FqName) StorageKt.getValue(this.f80660c, this, (KProperty<?>) f80657i[0]);
    }

    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return this.f80665h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.f80664g;
    }

    @NotNull
    public String toString() {
        return DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public JavaSourceElement getSource() {
        return this.f80662e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.f80661d, this, (KProperty<?>) f80657i[1]);
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i10 & 4) != 0 ? false : z10);
    }
}
