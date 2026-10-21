package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.camera.camera2.internal.compat.u;
import bk.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJvmBuiltInsCustomizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInsCustomizer.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1747#2,3:377\n1603#2,9:380\n1855#2:389\n1856#2:391\n1612#2:392\n1549#2:393\n1620#2,3:394\n766#2:397\n857#2:398\n1747#2,3:399\n858#2:402\n766#2:403\n857#2:404\n2624#2,3:405\n858#2:408\n1549#2:409\n1620#2,3:410\n1747#2,3:413\n1603#2,9:416\n1855#2:425\n1856#2:427\n1612#2:428\n1#3:390\n1#3:426\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInsCustomizer.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer\n*L\n120#1:377,3\n136#1:380,9\n136#1:389\n136#1:391\n136#1:392\n195#1:393\n195#1:394,3\n209#1:397\n209#1:398\n214#1:399,3\n209#1:402\n317#1:403\n317#1:404\n319#1:405,3\n317#1:408\n326#1:409\n326#1:410,3\n353#1:413,3\n257#1:416,9\n257#1:425\n257#1:427\n257#1:428\n136#1:390\n257#1:426\n*E\n"})
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80172i = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInsCustomizer.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInsCustomizer.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInsCustomizer.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ModuleDescriptor f80173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final JavaToKotlinClassMapper f80174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SimpleType f80176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CacheWithNotNullValues<FqName, ClassDescriptor> f80178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNotNull<Pair<String, String>, Annotations> f80180h;

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DEPRECATED_LIST_METHODS;
        public static final a DROP;
        public static final a HIDDEN;
        public static final a NOT_CONSIDERED;
        public static final a VISIBLE;

        static {
            a aVar = new a("HIDDEN", 0);
            HIDDEN = aVar;
            a aVar2 = new a("VISIBLE", 1);
            VISIBLE = aVar2;
            a aVar3 = new a("DEPRECATED_LIST_METHODS", 2);
            DEPRECATED_LIST_METHODS = aVar3;
            a aVar4 = new a("NOT_CONSIDERED", 3);
            NOT_CONSIDERED = aVar4;
            a aVar5 = new a("DROP", 4);
            DROP = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = EnumEntriesKt.enumEntries(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class b extends Lambda implements Function0<SimpleType> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ StorageManager f80182q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StorageManager storageManager) {
            super(0);
            this.f80182q0 = storageManager;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleType invoke() {
            JvmBuiltInsCustomizer jvmBuiltInsCustomizer = JvmBuiltInsCustomizer.this;
            return FindClassInModuleKt.findNonGenericClassAcrossDependencies(jvmBuiltInsCustomizer.b().getOwnerModuleDescriptor(), JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID(), new NotFoundClasses(this.f80182q0, jvmBuiltInsCustomizer.b().getOwnerModuleDescriptor())).getDefaultType();
        }
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class c extends Lambda implements Function1<Pair<? extends String, ? extends String>, Annotations> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Annotations invoke(Pair<? extends String, ? extends String> pair) {
            return invoke2((Pair<String, String>) pair);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Annotations invoke2(@NotNull Pair<String, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String strComponent1 = pair.component1();
            String strComponent2 = pair.component2();
            return Annotations.Companion.create(bk.d.listOf(AnnotationUtilKt.createDeprecatedAnnotation(JvmBuiltInsCustomizer.this.f80173a.getBuiltIns(), u.g("'", strComponent1, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", strComponent2, "()' stdlib extension instead"), u.f(strComponent2, "()"), "HIDDEN", false)));
        }
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class d extends Lambda implements Function1<MemberScope, Collection<? extends SimpleFunctionDescriptor>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Name f80184p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Name name) {
            super(1);
            this.f80184p0 = name;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull MemberScope it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getContributedFunctions(this.f80184p0, NoLookupLocation.FROM_BUILTINS);
        }
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final class e extends Lambda implements Function0<Annotations> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Annotations invoke() {
            return Annotations.Companion.create(bk.d.listOf(AnnotationUtilKt.createDeprecatedAnnotation$default(JvmBuiltInsCustomizer.this.f80173a.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
        }
    }

    public JvmBuiltInsCustomizer(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull Function0<JvmBuiltIns.Settings> settingsComputation) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(settingsComputation, "settingsComputation");
        this.f80173a = moduleDescriptor;
        this.f80174b = JavaToKotlinClassMapper.INSTANCE;
        this.f80175c = storageManager.createLazyValue(settingsComputation);
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1(moduleDescriptor, new FqName("java.io")), Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, bk.d.listOf(new LazyWrappedType(storageManager, new tk.c(this))), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(MemberScope.Empty.INSTANCE, w.emptySet(), null);
        SimpleType defaultType = classDescriptorImpl.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        this.f80176d = defaultType;
        this.f80177e = storageManager.createLazyValue(new b(storageManager));
        this.f80178f = storageManager.createCacheWithNotNullValues();
        this.f80179g = storageManager.createLazyValue(new e());
        this.f80180h = storageManager.createMemoizedFunction(new c());
    }

    public final LazyJavaClassDescriptor a(ClassDescriptor classDescriptor) {
        ClassId classIdMapKotlinToJava;
        FqName fqNameAsSingleFqName;
        if (KotlinBuiltIns.isAny(classDescriptor) || !KotlinBuiltIns.isUnderKotlinPackage(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        if (!fqNameUnsafe.isSafe() || (classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe)) == null || (fqNameAsSingleFqName = classIdMapKotlinToJava.asSingleFqName()) == null) {
            return null;
        }
        ClassDescriptor classDescriptorResolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(b().getOwnerModuleDescriptor(), fqNameAsSingleFqName, NoLookupLocation.FROM_BUILTINS);
        if (classDescriptorResolveClassByFqName instanceof LazyJavaClassDescriptor) {
            return (LazyJavaClassDescriptor) classDescriptorResolveClassByFqName;
        }
        return null;
    }

    public final JvmBuiltIns.Settings b() {
        return (JvmBuiltIns.Settings) StorageKt.getValue(this.f80175c, this, (KProperty<?>) f80172i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != ClassKind.CLASS || !b().isAdditionalBuiltInsFeatureSupported()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorA = a(classDescriptor);
        if (lazyJavaClassDescriptorA == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(this.f80174b, DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorA), FallbackBuiltIns.f80134f.getInstance(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        TypeSubstitutor typeSubstitutorBuildSubstitutor = MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptorMapJavaToKotlin$default, lazyJavaClassDescriptorA).buildSubstitutor();
        List<ClassConstructorDescriptor> constructors = lazyJavaClassDescriptorA.getConstructors();
        ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList();
        for (Object obj : constructors) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
            if (classConstructorDescriptor.getVisibility().isPublicAPI()) {
                Collection<ClassConstructorDescriptor> constructors2 = classDescriptorMapJavaToKotlin$default.getConstructors();
                Intrinsics.checkNotNullExpressionValue(constructors2, "getConstructors(...)");
                Collection<ClassConstructorDescriptor> collection = constructors2;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ClassConstructorDescriptor classConstructorDescriptor2 = (ClassConstructorDescriptor) it.next();
                            Intrinsics.checkNotNull(classConstructorDescriptor2);
                            if (OverridingUtil.getBothWaysOverridability(classConstructorDescriptor2, classConstructorDescriptor.substitute(typeSubstitutorBuildSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                            }
                        }
                    }
                }
                if (classConstructorDescriptor.getValueParameters().size() == 1) {
                    List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((ValueParameterDescriptor) CollectionsKt___CollectionsKt.single((List) valueParameters)).getType().getConstructor().mo5778getDeclarationDescriptor();
                    if (Intrinsics.areEqual(classifierDescriptorMo5778getDeclarationDescriptor != null ? DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo5778getDeclarationDescriptor) : null, DescriptorUtilsKt.getFqNameUnsafe(classDescriptor))) {
                    }
                }
                if (!KotlinBuiltIns.isDeprecated(classConstructorDescriptor) && !JvmBuiltInsSignatures.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorA, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ClassConstructorDescriptor classConstructorDescriptor3 : arrayList) {
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> copyBuilderNewCopyBuilder = classConstructorDescriptor3.newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder.setReturnType(classDescriptor.getDefaultType());
            copyBuilderNewCopyBuilder.setPreserveSourceElement();
            copyBuilderNewCopyBuilder.setSubstitution(typeSubstitutorBuildSubstitutor.getSubstitution());
            if (!JvmBuiltInsSignatures.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorA, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor3, false, false, 3, null)))) {
                copyBuilderNewCopyBuilder.setAdditionalAnnotations((Annotations) StorageKt.getValue(this.f80179g, this, (KProperty<?>) f80172i[2]));
            }
            FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
            Intrinsics.checkNotNull(functionDescriptorBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((ClassConstructorDescriptor) functionDescriptorBuild);
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x0209  */
    /* JADX WARN: Code duplicated, block: B:79:0x0298  */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<SimpleFunctionDescriptor> getFunctions(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
        List<SimpleFunctionDescriptor> listEmptyList;
        DeclarationDescriptor containingDeclaration;
        Boolean boolIfAny;
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Annotations annotationsInvoke;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        boolean zAreEqual = Intrinsics.areEqual(name, CloneableClassScope.Companion.getCLONE_NAME());
        KProperty<Object>[] kPropertyArr = f80172i;
        if (zAreEqual && (classDescriptor instanceof DeserializedClassDescriptor) && KotlinBuiltIns.isArrayOrPrimitiveArray(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
            List<ProtoBuf.Function> list = functionList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it.next()).getName()), CloneableClassScope.Companion.getCLONE_NAME())) {
                        return CollectionsKt__CollectionsKt.emptyList();
                    }
                }
            }
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = ((SimpleFunctionDescriptor) CollectionsKt___CollectionsKt.single(((SimpleType) StorageKt.getValue(this.f80177e, this, (KProperty<?>) kPropertyArr[1])).getMemberScope().getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS))).newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(deserializedClassDescriptor);
            copyBuilderNewCopyBuilder.setVisibility(DescriptorVisibilities.PUBLIC);
            copyBuilderNewCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
            copyBuilderNewCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
            FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
            Intrinsics.checkNotNull(functionDescriptorBuild);
            return bk.d.listOf((SimpleFunctionDescriptor) functionDescriptorBuild);
        }
        if (!b().isAdditionalBuiltInsFeatureSupported()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        d dVar = new d(name);
        LazyJavaClassDescriptor lazyJavaClassDescriptorA = a(classDescriptor);
        boolean z10 = false;
        if (lazyJavaClassDescriptorA == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            FqName fqNameSafe = DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorA);
            KotlinBuiltIns companion = FallbackBuiltIns.f80134f.getInstance();
            JavaToKotlinClassMapper javaToKotlinClassMapper = this.f80174b;
            Collection<ClassDescriptor> collectionMapPlatformClass = javaToKotlinClassMapper.mapPlatformClass(fqNameSafe, companion);
            ClassDescriptor classDescriptor2 = (ClassDescriptor) CollectionsKt___CollectionsKt.lastOrNull(collectionMapPlatformClass);
            if (classDescriptor2 == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            } else {
                SmartSet.Companion companion2 = SmartSet.Companion;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collectionMapPlatformClass, 10));
                Iterator<T> it2 = collectionMapPlatformClass.iterator();
                while (it2.hasNext()) {
                    arrayList.add(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) it2.next()));
                }
                SmartSet smartSetCreate = companion2.create(arrayList);
                boolean zIsMutable = javaToKotlinClassMapper.isMutable(classDescriptor);
                MemberScope unsubstitutedMemberScope = this.f80178f.computeIfAbsent(DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorA), new tk.d(lazyJavaClassDescriptorA, classDescriptor2)).getUnsubstitutedMemberScope();
                Intrinsics.checkNotNullExpressionValue(unsubstitutedMemberScope, "getUnsubstitutedMemberScope(...)");
                Collection<? extends SimpleFunctionDescriptor> collectionInvoke = dVar.invoke(unsubstitutedMemberScope);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionInvoke) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) obj;
                    if (simpleFunctionDescriptor2.getKind() == CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor2.getVisibility().isPublicAPI() && !KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor2)) {
                        Collection<? extends FunctionDescriptor> overriddenDescriptors = simpleFunctionDescriptor2.getOverriddenDescriptors();
                        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
                        Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                        if ((collection instanceof Collection) && collection.isEmpty()) {
                            containingDeclaration = simpleFunctionDescriptor2.getContainingDeclaration();
                            Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor2, z10, z10, 3, null))) ^ zIsMutable) {
                                boolIfAny = DFS.ifAny(bk.d.listOf(simpleFunctionDescriptor2), tk.a.f93618a, new tk.e(this));
                                Intrinsics.checkNotNullExpressionValue(boolIfAny, "ifAny(...)");
                                if (!boolIfAny.booleanValue()) {
                                    arrayList2.add(obj);
                                }
                            }
                        } else {
                            Iterator<T> it3 = collection.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    DeclarationDescriptor containingDeclaration2 = ((FunctionDescriptor) it3.next()).getContainingDeclaration();
                                    Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
                                    if (smartSetCreate.contains(DescriptorUtilsKt.getFqNameSafe(containingDeclaration2))) {
                                    }
                                } else {
                                    containingDeclaration = simpleFunctionDescriptor2.getContainingDeclaration();
                                    Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor2, z10, z10, 3, null))) ^ zIsMutable) {
                                        boolIfAny = DFS.ifAny(bk.d.listOf(simpleFunctionDescriptor2), tk.a.f93618a, new tk.e(this));
                                        Intrinsics.checkNotNullExpressionValue(boolIfAny, "ifAny(...)");
                                        if (!boolIfAny.booleanValue()) {
                                            arrayList2.add(obj);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                listEmptyList = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor3 : listEmptyList) {
            DeclarationDescriptor containingDeclaration3 = simpleFunctionDescriptor3.getContainingDeclaration();
            Intrinsics.checkNotNull(containingDeclaration3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            FunctionDescriptor functionDescriptorSubstitute = simpleFunctionDescriptor3.substitute(MappingUtilKt.createMappedTypeParametersSubstitution((ClassDescriptor) containingDeclaration3, classDescriptor).buildSubstitutor());
            Intrinsics.checkNotNull(functionDescriptorSubstitute, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder2 = ((SimpleFunctionDescriptor) functionDescriptorSubstitute).newCopyBuilder();
            copyBuilderNewCopyBuilder2.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder2.setDispatchReceiverParameter(classDescriptor.getThisAsReceiverParameter());
            copyBuilderNewCopyBuilder2.setPreserveSourceElement();
            DeclarationDescriptor containingDeclaration4 = simpleFunctionDescriptor3.getContainingDeclaration();
            Intrinsics.checkNotNull(containingDeclaration4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            final String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor3, false, false, 3, null);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Object objDfs = DFS.dfs(bk.d.listOf((ClassDescriptor) containingDeclaration4), new tk.b(this), new DFS.AbstractNodeHandler<ClassDescriptor, a>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
                /* JADX WARN: Type inference failed for: r4v3, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
                /* JADX WARN: Type inference failed for: r4v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
                /* JADX WARN: Type inference failed for: r4v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
                /* JADX WARN: Type inference failed for: r4v9, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public boolean beforeChildren(@NotNull ClassDescriptor javaClassDescriptor) {
                    Intrinsics.checkNotNullParameter(javaClassDescriptor, "javaClassDescriptor");
                    String strSignature = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaClassDescriptor, strComputeJvmDescriptor$default);
                    JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
                    boolean zContains = jvmBuiltInsSignatures.getHIDDEN_METHOD_SIGNATURES().contains(strSignature);
                    Ref.ObjectRef<JvmBuiltInsCustomizer.a> objectRef2 = objectRef;
                    if (zContains) {
                        objectRef2.element = JvmBuiltInsCustomizer.a.HIDDEN;
                    } else if (jvmBuiltInsSignatures.getVISIBLE_METHOD_SIGNATURES().contains(strSignature)) {
                        objectRef2.element = JvmBuiltInsCustomizer.a.VISIBLE;
                    } else if (jvmBuiltInsSignatures.getDEPRECATED_LIST_METHODS().contains(strSignature)) {
                        objectRef2.element = JvmBuiltInsCustomizer.a.DEPRECATED_LIST_METHODS;
                    } else if (jvmBuiltInsSignatures.getDROP_LIST_METHOD_SIGNATURES().contains(strSignature)) {
                        objectRef2.element = JvmBuiltInsCustomizer.a.DROP;
                    }
                    return objectRef2.element == null;
                }

                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                @NotNull
                public JvmBuiltInsCustomizer.a result() {
                    JvmBuiltInsCustomizer.a aVar = objectRef.element;
                    return aVar == null ? JvmBuiltInsCustomizer.a.NOT_CONSIDERED : aVar;
                }
            });
            Intrinsics.checkNotNullExpressionValue(objDfs, "dfs(...)");
            int i10 = WhenMappings.$EnumSwitchMapping$0[((a) objDfs).ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    Name name2 = simpleFunctionDescriptor3.getName();
                    boolean zAreEqual2 = Intrinsics.areEqual(name2, JvmBuiltInsCustomizerKt.f80188a);
                    MemoizedFunctionToNotNull<Pair<String, String>, Annotations> memoizedFunctionToNotNull = this.f80180h;
                    if (zAreEqual2) {
                        annotationsInvoke = memoizedFunctionToNotNull.invoke(TuplesKt.to(simpleFunctionDescriptor3.getName().asString(), "first"));
                    } else {
                        if (!Intrinsics.areEqual(name2, JvmBuiltInsCustomizerKt.f80189b)) {
                            throw new IllegalStateException(("Unexpected name: " + simpleFunctionDescriptor3.getName()).toString());
                        }
                        annotationsInvoke = memoizedFunctionToNotNull.invoke(TuplesKt.to(simpleFunctionDescriptor3.getName().asString(), "last"));
                    }
                    copyBuilderNewCopyBuilder2.setAdditionalAnnotations(annotationsInvoke);
                } else if (i10 == 3) {
                    copyBuilderNewCopyBuilder2.setAdditionalAnnotations((Annotations) StorageKt.getValue(this.f80179g, this, (KProperty<?>) kPropertyArr[2]));
                } else if (i10 == 4) {
                    simpleFunctionDescriptor = null;
                }
                FunctionDescriptor functionDescriptorBuild2 = copyBuilderNewCopyBuilder2.build();
                Intrinsics.checkNotNull(functionDescriptorBuild2);
                simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptorBuild2;
            } else if (ModalityUtilsKt.isFinalClass(classDescriptor)) {
                simpleFunctionDescriptor = null;
            } else {
                copyBuilderNewCopyBuilder2.setHiddenForResolutionEverywhereBesideSupercalls();
                FunctionDescriptor functionDescriptorBuild3 = copyBuilderNewCopyBuilder2.build();
                Intrinsics.checkNotNull(functionDescriptorBuild3);
                simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptorBuild3;
            }
            if (simpleFunctionDescriptor != null) {
                arrayList3.add(simpleFunctionDescriptor);
            }
        }
        return arrayList3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<KotlinType> getSupertypes(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
        boolean zIsArrayOrPrimitiveArray = jvmBuiltInsSignatures.isArrayOrPrimitiveArray(fqNameUnsafe);
        SimpleType simpleType = this.f80176d;
        if (!zIsArrayOrPrimitiveArray) {
            return jvmBuiltInsSignatures.isSerializableInJava(fqNameUnsafe) ? bk.d.listOf(simpleType) : CollectionsKt__CollectionsKt.emptyList();
        }
        SimpleType simpleType2 = (SimpleType) StorageKt.getValue(this.f80177e, this, (KProperty<?>) f80172i[1]);
        Intrinsics.checkNotNullExpressionValue(simpleType2, "<get-cloneableType>(...)");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinType[]{simpleType2, simpleType});
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptorA = a(classDescriptor);
        if (lazyJavaClassDescriptorA == null || !functionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (!b().isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope unsubstitutedMemberScope = lazyJavaClassDescriptorA.getUnsubstitutedMemberScope();
        Name name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Collection<SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
        if (!(contributedFunctions instanceof Collection) || !contributedFunctions.isEmpty()) {
            Iterator<T> it = contributedFunctions.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) it.next(), false, false, 3, null), strComputeJvmDescriptor$default)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Set<Name> getFunctionsNames(@NotNull ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope unsubstitutedMemberScope;
        Set<Name> functionNames;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (!b().isAdditionalBuiltInsFeatureSupported()) {
            return w.emptySet();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorA = a(classDescriptor);
        return (lazyJavaClassDescriptorA == null || (unsubstitutedMemberScope = lazyJavaClassDescriptorA.getUnsubstitutedMemberScope()) == null || (functionNames = unsubstitutedMemberScope.getFunctionNames()) == null) ? w.emptySet() : functionNames;
    }
}
