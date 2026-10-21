package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.w;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import dk.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n1747#2,3:323\n1747#2,3:326\n1603#2,9:329\n1855#2:338\n1856#2:340\n1612#2:341\n1045#2:342\n1#3:339\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor\n*L\n185#1:323,3\n188#1:326,3\n200#1:329,9\n200#1:338\n200#1:340\n200#1:341\n202#1:342\n200#1:339\n*E\n"})
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Set<String> Q0 = w.setOf((Object[]) new String[]{"equals", GenerateActivationFormCommand.HASH_CODE, "getClass", "wait", "notify", "notifyAll", "toString"});

    @NotNull
    public final Lazy E0;

    @NotNull
    public final ClassKind F0;

    @NotNull
    public final Modality G0;

    @NotNull
    public final Visibility H0;
    public final boolean I0;

    @NotNull
    public final a J0;

    @NotNull
    public final LazyJavaClassMemberScope K0;

    @NotNull
    public final ScopesHolderForClass<LazyJavaClassMemberScope> L0;

    @NotNull
    public final InnerClassesScopeWrapper M0;

    @NotNull
    public final LazyJavaStaticClassScope N0;

    @NotNull
    public final Annotations O0;

    @NotNull
    public final NotNullLazyValue<List<TypeParameterDescriptor>> P0;

    @NotNull
    public final LazyJavaResolverContext v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final JavaClass f80669w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public final ClassDescriptor f80670x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final LazyJavaResolverContext f80671y0;

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$LazyJavaClassTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,322:1\n1549#2:323\n1620#2,3:324\n1549#2:327\n1620#2,3:328\n1549#2:331\n1620#2,3:332\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$LazyJavaClassTypeConstructor\n*L\n254#1:323\n254#1:324,3\n280#1:327\n280#1:328,3\n285#1:331\n285#1:332,3\n*E\n"})
    public final class a extends AbstractClassTypeConstructor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue<List<TypeParameterDescriptor>> f80672c;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
        public static final class C0441a extends Lambda implements Function0<List<? extends TypeParameterDescriptor>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LazyJavaClassDescriptor f80674p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0441a(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
                super(0);
                this.f80674p0 = lazyJavaClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends TypeParameterDescriptor> invoke() {
                return TypeParameterUtilsKt.computeConstructorTypeParameters(this.f80674p0);
            }
        }

        public a() {
            super(LazyJavaClassDescriptor.this.f80671y0.getStorageManager());
            this.f80672c = LazyJavaClassDescriptor.this.f80671y0.getStorageManager().createLazyValue(new C0441a(LazyJavaClassDescriptor.this));
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007f  */
        /* JADX WARN: Code duplicated, block: B:4:0x002d  */
        /* JADX WARN: Code duplicated, block: B:51:0x012b  */
        /* JADX WARN: Code duplicated, block: B:53:0x0169  */
        /* JADX WARN: Code duplicated, block: B:56:0x0172  */
        /* JADX WARN: Code duplicated, block: B:57:0x0177  */
        /* JADX WARN: Code duplicated, block: B:66:0x018f  */
        /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:72:0x01d1 A[LOOP:1: B:70:0x01cb->B:72:0x01d1, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:76:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:78:0x01f7  */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public final Collection<KotlinType> computeSupertypes() {
            String value;
            FqName fqName;
            FqName purelyImplementedInterface;
            ArrayList arrayList;
            SimpleType simpleTypeSimpleNotNullType;
            List listListOf;
            ArrayList arrayList2;
            KotlinType kotlinTypeEnhanceSuperType;
            TypeConstructor constructor;
            TypeConstructor constructor2;
            LazyJavaClassDescriptor lazyJavaClassDescriptor = LazyJavaClassDescriptor.this;
            Collection<JavaClassifierType> supertypes = lazyJavaClassDescriptor.getJClass().getSupertypes();
            ArrayList arrayList3 = new ArrayList(supertypes.size());
            ArrayList<JavaType> arrayList4 = new ArrayList(0);
            Annotations annotations = lazyJavaClassDescriptor.getAnnotations();
            FqName PURELY_IMPLEMENTS_ANNOTATION = JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION;
            Intrinsics.checkNotNullExpressionValue(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            AnnotationDescriptor annotationDescriptorMo5773findAnnotation = annotations.mo5773findAnnotation(PURELY_IMPLEMENTS_ANNOTATION);
            if (annotationDescriptorMo5773findAnnotation == null) {
                fqName = null;
            } else {
                Object objSingleOrNull = CollectionsKt___CollectionsKt.singleOrNull(annotationDescriptorMo5773findAnnotation.getAllValueArguments().values());
                StringValue stringValue = objSingleOrNull instanceof StringValue ? (StringValue) objSingleOrNull : null;
                if (stringValue == null || (value = stringValue.getValue()) == null || !FqNamesUtilKt.isValidJavaFqName(value)) {
                    fqName = null;
                } else {
                    fqName = new FqName(value);
                }
            }
            if (fqName == null || fqName.isRoot() || !fqName.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME)) {
                fqName = null;
            }
            if (fqName == null) {
                purelyImplementedInterface = FakePureImplementationsProvider.INSTANCE.getPurelyImplementedInterface(DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptor));
                if (purelyImplementedInterface == null) {
                    simpleTypeSimpleNotNullType = null;
                }
                for (JavaClassifierType javaClassifierType : supertypes) {
                    kotlinTypeEnhanceSuperType = lazyJavaClassDescriptor.f80671y0.getComponents().getSignatureEnhancement().enhanceSuperType(lazyJavaClassDescriptor.f80671y0.getTypeResolver().transformJavaType(javaClassifierType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.SUPERTYPE, false, false, null, 7, null)), lazyJavaClassDescriptor.f80671y0);
                    if (kotlinTypeEnhanceSuperType.getConstructor().mo5778getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor) {
                        arrayList4.add(javaClassifierType);
                    }
                    constructor = kotlinTypeEnhanceSuperType.getConstructor();
                    if (simpleTypeSimpleNotNullType != null) {
                        constructor2 = simpleTypeSimpleNotNullType.getConstructor();
                    } else {
                        constructor2 = null;
                    }
                    if (!Intrinsics.areEqual(constructor, constructor2) && !KotlinBuiltIns.isAnyOrNullableAny(kotlinTypeEnhanceSuperType)) {
                        arrayList3.add(kotlinTypeEnhanceSuperType);
                    }
                }
                ClassDescriptor classDescriptor = lazyJavaClassDescriptor.f80670x0;
                CollectionsKt.addIfNotNull(arrayList3, classDescriptor != null ? MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptor, lazyJavaClassDescriptor).buildSubstitutor().substitute(classDescriptor.getDefaultType(), Variance.INVARIANT) : null);
                CollectionsKt.addIfNotNull(arrayList3, simpleTypeSimpleNotNullType);
                if (!arrayList4.isEmpty()) {
                    ErrorReporter errorReporter = lazyJavaClassDescriptor.f80671y0.getComponents().getErrorReporter();
                    ClassDescriptor classDescriptorMo5778getDeclarationDescriptor = mo5778getDeclarationDescriptor();
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                    for (JavaType javaType : arrayList4) {
                        Intrinsics.checkNotNull(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                        arrayList2.add(((JavaClassifierType) javaType).getPresentableText());
                    }
                    errorReporter.reportIncompleteHierarchy(classDescriptorMo5778getDeclarationDescriptor, arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    listListOf = CollectionsKt___CollectionsKt.toList(arrayList3);
                } else {
                    listListOf = bk.d.listOf(lazyJavaClassDescriptor.f80671y0.getModule().getBuiltIns().getAnyType());
                }
                return listListOf;
            }
            purelyImplementedInterface = fqName;
            ClassDescriptor classDescriptorResolveTopLevelClass = DescriptorUtilsKt.resolveTopLevelClass(lazyJavaClassDescriptor.f80671y0.getModule(), purelyImplementedInterface, NoLookupLocation.FROM_JAVA_LOADER);
            if (classDescriptorResolveTopLevelClass == null) {
                simpleTypeSimpleNotNullType = null;
            } else {
                int size = classDescriptorResolveTopLevelClass.getTypeConstructor().getParameters().size();
                List<TypeParameterDescriptor> parameters = lazyJavaClassDescriptor.getTypeConstructor().getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                int size2 = parameters.size();
                if (size2 == size) {
                    List<TypeParameterDescriptor> list = parameters;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) it.next()).getDefaultType()));
                    }
                } else if (size2 == 1 && size > 1 && fqName == null) {
                    TypeProjectionImpl typeProjectionImpl = new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) CollectionsKt___CollectionsKt.single((List) parameters)).getDefaultType());
                    IntRange intRange = new IntRange(1, size);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                    Iterator<Integer> it2 = intRange.iterator();
                    while (it2.hasNext()) {
                        ((IntIterator) it2).nextInt();
                        arrayList5.add(typeProjectionImpl);
                    }
                    arrayList = arrayList5;
                } else {
                    simpleTypeSimpleNotNullType = null;
                }
                simpleTypeSimpleNotNullType = KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), classDescriptorResolveTopLevelClass, arrayList);
            }
            while (r2.hasNext()) {
                kotlinTypeEnhanceSuperType = lazyJavaClassDescriptor.f80671y0.getComponents().getSignatureEnhancement().enhanceSuperType(lazyJavaClassDescriptor.f80671y0.getTypeResolver().transformJavaType(javaClassifierType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.SUPERTYPE, false, false, null, 7, null)), lazyJavaClassDescriptor.f80671y0);
                if (kotlinTypeEnhanceSuperType.getConstructor().mo5778getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList4.add(javaClassifierType);
                }
                constructor = kotlinTypeEnhanceSuperType.getConstructor();
                if (simpleTypeSimpleNotNullType != null) {
                    constructor2 = simpleTypeSimpleNotNullType.getConstructor();
                } else {
                    constructor2 = null;
                }
                if (!Intrinsics.areEqual(constructor, constructor2)) {
                    arrayList3.add(kotlinTypeEnhanceSuperType);
                }
            }
            ClassDescriptor classDescriptor2 = lazyJavaClassDescriptor.f80670x0;
            CollectionsKt.addIfNotNull(arrayList3, classDescriptor2 != null ? MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptor2, lazyJavaClassDescriptor).buildSubstitutor().substitute(classDescriptor2.getDefaultType(), Variance.INVARIANT) : null);
            CollectionsKt.addIfNotNull(arrayList3, simpleTypeSimpleNotNullType);
            if (!arrayList4.isEmpty()) {
                ErrorReporter errorReporter2 = lazyJavaClassDescriptor.f80671y0.getComponents().getErrorReporter();
                ClassDescriptor classDescriptorMo5778getDeclarationDescriptor2 = mo5778getDeclarationDescriptor();
                arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                while (r4.hasNext()) {
                    Intrinsics.checkNotNull(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList2.add(((JavaClassifierType) javaType).getPresentableText());
                }
                errorReporter2.reportIncompleteHierarchy(classDescriptorMo5778getDeclarationDescriptor2, arrayList2);
            }
            if (!arrayList3.isEmpty()) {
                listListOf = CollectionsKt___CollectionsKt.toList(arrayList3);
            } else {
                listListOf = bk.d.listOf(lazyJavaClassDescriptor.f80671y0.getModule().getBuiltIns().getAnyType());
            }
            return listListOf;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return this.f80672c.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public final SupertypeLoopChecker getSupertypeLoopChecker() {
            return LazyJavaClassDescriptor.this.f80671y0.getComponents().getSupertypeLoopChecker();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @NotNull
        public String toString() {
            String strAsString = LazyJavaClassDescriptor.this.getName().asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
            return strAsString;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public ClassDescriptor mo5778getDeclarationDescriptor() {
            return LazyJavaClassDescriptor.this;
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$declaredParameters$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,322:1\n1549#2:323\n1620#2,3:324\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$declaredParameters$1\n*L\n151#1:323\n151#1:324,3\n*E\n"})
    public static final class b extends Lambda implements Function0<List<? extends TypeParameterDescriptor>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends TypeParameterDescriptor> invoke() {
            LazyJavaClassDescriptor lazyJavaClassDescriptor = LazyJavaClassDescriptor.this;
            List<JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.getJClass().getTypeParameters();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
            for (JavaTypeParameter javaTypeParameter : typeParameters) {
                TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaClassDescriptor.f80671y0.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
                if (typeParameterDescriptorResolveTypeParameter == null) {
                    throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + lazyJavaClassDescriptor.getJClass() + ", so it must be resolved");
                }
                arrayList.add(typeParameterDescriptorResolveTypeParameter);
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassDescriptor$moduleAnnotations$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n1#2:323\n*E\n"})
    public static final class c extends Lambda implements Function0<List<? extends JavaAnnotation>> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends JavaAnnotation> invoke() {
            LazyJavaClassDescriptor lazyJavaClassDescriptor = LazyJavaClassDescriptor.this;
            ClassId classId = DescriptorUtilsKt.getClassId(lazyJavaClassDescriptor);
            if (classId != null) {
                return lazyJavaClassDescriptor.getOuterContext().getComponents().getJavaModuleResolver().getAnnotationsForModuleOwnerOfClass(classId);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassDescriptor.kt */
    public static final class d extends Lambda implements Function1<KotlinTypeRefiner, LazyJavaClassMemberScope> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final LazyJavaClassMemberScope invoke(@NotNull KotlinTypeRefiner it) {
            Intrinsics.checkNotNullParameter(it, "it");
            LazyJavaClassDescriptor lazyJavaClassDescriptor = LazyJavaClassDescriptor.this;
            LazyJavaResolverContext lazyJavaResolverContext = lazyJavaClassDescriptor.f80671y0;
            LazyJavaClassDescriptor lazyJavaClassDescriptor2 = LazyJavaClassDescriptor.this;
            return new LazyJavaClassMemberScope(lazyJavaResolverContext, lazyJavaClassDescriptor2, lazyJavaClassDescriptor2.getJClass(), lazyJavaClassDescriptor.f80670x0 != null, lazyJavaClassDescriptor.K0);
        }
    }

    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i10 & 8) != 0 ? null : classDescriptor);
    }

    @NotNull
    public final LazyJavaClassDescriptor copy$descriptors_jvm(@NotNull JavaResolverCache javaResolverCache, @Nullable ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        LazyJavaResolverContext lazyJavaResolverContext = this.f80671y0;
        LazyJavaResolverContext lazyJavaResolverContextReplaceComponents = ContextKt.replaceComponents(lazyJavaResolverContext, lazyJavaResolverContext.getComponents().replace(javaResolverCache));
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
        return new LazyJavaClassDescriptor(lazyJavaResolverContextReplaceComponents, containingDeclaration, this.f80669w0, classDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.O0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo5771getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.P0.invoke();
    }

    @NotNull
    public final JavaClass getJClass() {
        return this.f80669w0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return this.F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        return this.G0;
    }

    @Nullable
    public final List<JavaAnnotation> getModuleAnnotations() {
        return (List) this.E0.getValue();
    }

    @NotNull
    public final LazyJavaResolverContext getOuterContext() {
        return this.v0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassDescriptor> getSealedSubclasses() {
        if (this.G0 != Modality.SEALED) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
        Collection<JavaClassifierType> permittedTypes = this.f80669w0.getPermittedTypes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = permittedTypes.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = this.f80671y0.getTypeResolver().transformJavaType((JavaClassifierType) it.next(), attributes$default).getConstructor().mo5778getDeclarationDescriptor();
            ClassDescriptor classDescriptor = classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor : null;
            if (classDescriptor != null) {
                arrayList.add(classDescriptor);
            }
        }
        return CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$getSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t10).asString(), DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t11).asString());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getStaticScope() {
        return this.N0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.J0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedInnerClassesScope() {
        return this.M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo5772getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PRIVATE;
        Visibility visibility = this.H0;
        if (!Intrinsics.areEqual(visibility, descriptorVisibility) || this.f80669w0.getOuterClass() != null) {
            return UtilsKt.toDescriptorVisibility(visibility);
        }
        DescriptorVisibility descriptorVisibility2 = JavaDescriptorVisibilities.PACKAGE_VISIBILITY;
        Intrinsics.checkNotNull(descriptorVisibility2);
        return descriptorVisibility2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.I0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    @NotNull
    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.getFqNameUnsafe(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(@NotNull LazyJavaResolverContext outerContext, @NotNull DeclarationDescriptor containingDeclaration, @NotNull JavaClass jClass, @Nullable ClassDescriptor classDescriptor) {
        Modality modalityConvertFromFlags;
        super(outerContext.getStorageManager(), containingDeclaration, jClass.getName(), outerContext.getComponents().getSourceElementFactory().source(jClass), false);
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.v0 = outerContext;
        this.f80669w0 = jClass;
        this.f80670x0 = classDescriptor;
        LazyJavaResolverContext lazyJavaResolverContextChildForClassOrPackage$default = ContextKt.childForClassOrPackage$default(outerContext, this, jClass, 0, 4, null);
        this.f80671y0 = lazyJavaResolverContextChildForClassOrPackage$default;
        lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getJavaResolverCache().recordClass(jClass, this);
        jClass.getLightClassOriginKind();
        this.E0 = LazyKt__LazyJVMKt.lazy(new c());
        this.F0 = jClass.isAnnotationType() ? ClassKind.ANNOTATION_CLASS : jClass.isInterface() ? ClassKind.INTERFACE : jClass.isEnum() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        if (jClass.isAnnotationType() || jClass.isEnum()) {
            modalityConvertFromFlags = Modality.FINAL;
        } else {
            modalityConvertFromFlags = Modality.Companion.convertFromFlags(jClass.isSealed(), jClass.isSealed() || jClass.isAbstract() || jClass.isInterface(), !jClass.isFinal());
        }
        this.G0 = modalityConvertFromFlags;
        this.H0 = jClass.getVisibility();
        this.I0 = (jClass.getOuterClass() == null || jClass.isStatic()) ? false : true;
        this.J0 = new a();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(lazyJavaResolverContextChildForClassOrPackage$default, this, jClass, classDescriptor != null, null, 16, null);
        this.K0 = lazyJavaClassMemberScope;
        this.L0 = ScopesHolderForClass.Companion.create(this, lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager(), lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new d());
        this.M0 = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.N0 = new LazyJavaStaticClassScope(lazyJavaResolverContextChildForClassOrPackage$default, jClass, this);
        this.O0 = LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContextChildForClassOrPackage$default, jClass);
        this.P0 = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List<ClassConstructorDescriptor> getConstructors() {
        return this.K0.getConstructors$descriptors_jvm().invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope) this.L0.getScope(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = super.getUnsubstitutedMemberScope();
        Intrinsics.checkNotNull(unsubstitutedMemberScope, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope) unsubstitutedMemberScope;
    }
}
