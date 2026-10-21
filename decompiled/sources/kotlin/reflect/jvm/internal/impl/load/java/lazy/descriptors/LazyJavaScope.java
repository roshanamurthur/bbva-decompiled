package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.p;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJavaScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nLazyJavaScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,408:1\n1477#2:409\n1502#2,3:410\n1505#2,3:420\n1549#2:423\n1620#2,3:424\n1549#2:427\n1620#2,3:428\n372#3,7:413\n1#4:431\n*S KotlinDebug\n*F\n+ 1 LazyJavaScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaScope\n*L\n129#1:409\n129#1:410,3\n129#1:420,3\n165#1:423\n165#1:424,3\n212#1:427\n212#1:428,3\n129#1:413,7\n*E\n"})
public abstract class LazyJavaScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80715l = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyJavaResolverContext f80716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final LazyJavaScope f80717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue<Collection<DeclarationDescriptor>> f80718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue<DeclaredMemberIndex> f80719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f80720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNullable<Name, PropertyDescriptor> f80721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f80722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> f80726k;

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class MethodSignatureData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final KotlinType f80727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final KotlinType f80728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<ValueParameterDescriptor> f80729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final List<TypeParameterDescriptor> f80730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f80731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final List<String> f80732f;

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(@NotNull KotlinType returnType, @Nullable KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> valueParameters, @NotNull List<? extends TypeParameterDescriptor> typeParameters, boolean z10, @NotNull List<String> errors) {
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
            Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f80727a = returnType;
            this.f80728b = kotlinType;
            this.f80729c = valueParameters;
            this.f80730d = typeParameters;
            this.f80731e = z10;
            this.f80732f = errors;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return Intrinsics.areEqual(this.f80727a, methodSignatureData.f80727a) && Intrinsics.areEqual(this.f80728b, methodSignatureData.f80728b) && Intrinsics.areEqual(this.f80729c, methodSignatureData.f80729c) && Intrinsics.areEqual(this.f80730d, methodSignatureData.f80730d) && this.f80731e == methodSignatureData.f80731e && Intrinsics.areEqual(this.f80732f, methodSignatureData.f80732f);
        }

        @NotNull
        public final List<String> getErrors() {
            return this.f80732f;
        }

        public final boolean getHasStableParameterNames() {
            return this.f80731e;
        }

        @Nullable
        public final KotlinType getReceiverType() {
            return this.f80728b;
        }

        @NotNull
        public final KotlinType getReturnType() {
            return this.f80727a;
        }

        @NotNull
        public final List<TypeParameterDescriptor> getTypeParameters() {
            return this.f80730d;
        }

        @NotNull
        public final List<ValueParameterDescriptor> getValueParameters() {
            return this.f80729c;
        }

        public int hashCode() {
            int iHashCode = this.f80727a.hashCode() * 31;
            KotlinType kotlinType = this.f80728b;
            return this.f80732f.hashCode() + ((com.google.android.gms.measurement.internal.a.a(this.f80730d, com.google.android.gms.measurement.internal.a.a(this.f80729c, (iHashCode + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31, 31), 31) + (this.f80731e ? 1231 : 1237)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MethodSignatureData(returnType=");
            sb2.append(this.f80727a);
            sb2.append(", receiverType=");
            sb2.append(this.f80728b);
            sb2.append(", valueParameters=");
            sb2.append(this.f80729c);
            sb2.append(", typeParameters=");
            sb2.append(this.f80730d);
            sb2.append(", hasStableParameterNames=");
            sb2.append(this.f80731e);
            sb2.append(", errors=");
            return bc.org.bouncycastle.math.ec.custom.sec.a.c(sb2, this.f80732f, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class ResolvedValueParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<ValueParameterDescriptor> f80733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f80734b;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(@NotNull List<? extends ValueParameterDescriptor> descriptors, boolean z10) {
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            this.f80733a = descriptors;
            this.f80734b = z10;
        }

        @NotNull
        public final List<ValueParameterDescriptor> getDescriptors() {
            return this.f80733a;
        }

        public final boolean getHasSynthesizedNames() {
            return this.f80734b;
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class a extends Lambda implements Function0<Collection<? extends DeclarationDescriptor>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Collection<? extends DeclarationDescriptor> invoke() {
            return LazyJavaScope.this.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER());
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class b extends Lambda implements Function0<Set<? extends Name>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends Name> invoke() {
            return LazyJavaScope.this.computeClassNames(DescriptorKindFilter.CLASSIFIERS, null);
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class c extends Lambda implements Function1<Name, PropertyDescriptor> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final PropertyDescriptor invoke(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            LazyJavaScope lazyJavaScope = LazyJavaScope.this;
            if (lazyJavaScope.getMainScope() != null) {
                return (PropertyDescriptor) lazyJavaScope.getMainScope().f80721f.invoke(name);
            }
            JavaField javaFieldFindFieldByName = lazyJavaScope.getDeclaredMemberIndex().invoke().findFieldByName(name);
            if (javaFieldFindFieldByName == null || javaFieldFindFieldByName.isEnumEntry()) {
                return null;
            }
            return LazyJavaScope.access$resolveProperty(lazyJavaScope, javaFieldFindFieldByName);
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class d extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            LazyJavaScope lazyJavaScope = LazyJavaScope.this;
            if (lazyJavaScope.getMainScope() != null) {
                return (Collection) lazyJavaScope.getMainScope().f80720e.invoke(name);
            }
            ArrayList arrayList = new ArrayList();
            for (JavaMethod javaMethod : lazyJavaScope.getDeclaredMemberIndex().invoke().findMethodsByName(name)) {
                JavaMethodDescriptor javaMethodDescriptorResolveMethodToFunctionDescriptor = lazyJavaScope.resolveMethodToFunctionDescriptor(javaMethod);
                if (lazyJavaScope.isVisibleAsFunction(javaMethodDescriptorResolveMethodToFunctionDescriptor)) {
                    lazyJavaScope.getC().getComponents().getJavaResolverCache().recordMethod(javaMethod, javaMethodDescriptorResolveMethodToFunctionDescriptor);
                    arrayList.add(javaMethodDescriptorResolveMethodToFunctionDescriptor);
                }
            }
            lazyJavaScope.computeImplicitlyDeclaredFunctions(arrayList, name);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class e extends Lambda implements Function0<DeclaredMemberIndex> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DeclaredMemberIndex invoke() {
            return LazyJavaScope.this.computeMemberIndex();
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class f extends Lambda implements Function0<Set<? extends Name>> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends Name> invoke() {
            return LazyJavaScope.this.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class g extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            LazyJavaScope lazyJavaScope = LazyJavaScope.this;
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) lazyJavaScope.f80720e.invoke(name));
            LazyJavaScope.access$retainMostSpecificMethods(lazyJavaScope, linkedHashSet);
            lazyJavaScope.computeNonDeclaredFunctions(linkedHashSet, name);
            return CollectionsKt___CollectionsKt.toList(lazyJavaScope.getC().getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaScope.getC(), linkedHashSet));
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class h extends Lambda implements Function1<Name, List<? extends PropertyDescriptor>> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final List<PropertyDescriptor> invoke(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            ArrayList arrayList = new ArrayList();
            LazyJavaScope lazyJavaScope = LazyJavaScope.this;
            CollectionsKt.addIfNotNull(arrayList, lazyJavaScope.f80721f.invoke(name));
            lazyJavaScope.computeNonDeclaredProperties(name, arrayList);
            return DescriptorUtils.isAnnotationClass(lazyJavaScope.getOwnerDescriptor()) ? CollectionsKt___CollectionsKt.toList(arrayList) : CollectionsKt___CollectionsKt.toList(lazyJavaScope.getC().getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaScope.getC(), arrayList));
        }
    }

    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class i extends Lambda implements Function0<Set<? extends Name>> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends Name> invoke() {
            return LazyJavaScope.this.computePropertyNames(DescriptorKindFilter.VARIABLES, null);
        }
    }

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i10 & 2) != 0 ? null : lazyJavaScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor] */
    public static final PropertyDescriptor access$resolveProperty(LazyJavaScope lazyJavaScope, JavaField javaField) {
        lazyJavaScope.getClass();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        boolean z10 = !javaField.isFinal();
        LazyJavaResolverContext lazyJavaResolverContext = lazyJavaScope.f80716a;
        ?? Create = JavaPropertyDescriptor.create(lazyJavaScope.getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaField), Modality.FINAL, UtilsKt.toDescriptorVisibility(javaField.getVisibility()), z10, javaField.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaField), javaField.isFinal() && javaField.isStatic());
        Intrinsics.checkNotNullExpressionValue(Create, "create(...)");
        objectRef.element = Create;
        Create.initialize(null, null, null, null);
        KotlinType kotlinTypeTransformJavaType = lazyJavaResolverContext.getTypeResolver().transformJavaType(javaField.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
        if ((KotlinBuiltIns.isPrimitiveType(kotlinTypeTransformJavaType) || KotlinBuiltIns.isString(kotlinTypeTransformJavaType)) && javaField.isFinal() && javaField.isStatic() && javaField.getHasConstantNotNullInitializer()) {
            kotlinTypeTransformJavaType = TypeUtils.makeNotNullable(kotlinTypeTransformJavaType);
            Intrinsics.checkNotNullExpressionValue(kotlinTypeTransformJavaType, "makeNotNullable(...)");
        }
        ((PropertyDescriptorImpl) objectRef.element).setType(kotlinTypeTransformJavaType, CollectionsKt__CollectionsKt.emptyList(), lazyJavaScope.getDispatchReceiverParameter(), null, CollectionsKt__CollectionsKt.emptyList());
        DeclarationDescriptor ownerDescriptor = lazyJavaScope.getOwnerDescriptor();
        ClassDescriptor classDescriptor = ownerDescriptor instanceof ClassDescriptor ? (ClassDescriptor) ownerDescriptor : null;
        if (classDescriptor != null) {
            objectRef.element = lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().modifyField(lazyJavaResolverContext, classDescriptor, (PropertyDescriptorImpl) objectRef.element);
        }
        T t10 = objectRef.element;
        if (DescriptorUtils.shouldRecordInitializerForProperty((VariableDescriptor) t10, ((PropertyDescriptorImpl) t10).getType())) {
            ((PropertyDescriptorImpl) objectRef.element).setCompileTimeInitializerFactory(new yk.a(lazyJavaScope, javaField, objectRef));
        }
        lazyJavaResolverContext.getComponents().getJavaResolverCache().recordField(javaField, (PropertyDescriptor) objectRef.element);
        return (PropertyDescriptor) objectRef.element;
    }

    public static final void access$retainMostSpecificMethods(LazyJavaScope lazyJavaScope, Set set) {
        lazyJavaScope.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strComputeJvmDescriptor$default);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strComputeJvmDescriptor$default, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection collectionSelectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, yk.b.f94869p0);
                set.removeAll(list2);
                set.addAll(collectionSelectMostSpecificInEachOverridableGroup);
            }
        }
    }

    @NotNull
    public abstract Set<Name> computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    public final List<DeclarationDescriptor> computeDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (Name name : computeClassNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name).booleanValue()) {
                    CollectionsKt.addIfNotNull(linkedHashSet, mo5779getContributedClassifier(name, noLookupLocation));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name2 : computeFunctionNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    linkedHashSet.addAll(getContributedFunctions(name2, noLookupLocation));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name3 : computePropertyNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(getContributedVariables(name3, noLookupLocation));
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(linkedHashSet);
    }

    @NotNull
    public abstract Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    public void computeImplicitlyDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> result, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @NotNull
    public abstract DeclaredMemberIndex computeMemberIndex();

    @NotNull
    public final KotlinType computeMethodReturnType(@NotNull JavaMethod method, @NotNull LazyJavaResolverContext c10) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(c10, "c");
        return c10.getTypeResolver().transformJavaType(method.getReturnType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, method.getContainingClass().isAnnotationType(), false, null, 6, null));
    }

    public abstract void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name);

    public abstract void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection);

    @NotNull
    public abstract Set<Name> computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    public final NotNullLazyValue<Collection<DeclarationDescriptor>> getAllDescriptors() {
        return this.f80718c;
    }

    @NotNull
    public final LazyJavaResolverContext getC() {
        return this.f80716a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getClassifierNames() {
        return (Set) StorageKt.getValue(this.f80725j, this, (KProperty<?>) f80715l[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return this.f80718c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !getFunctionNames().contains(name) ? CollectionsKt__CollectionsKt.emptyList() : this.f80722g.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !getVariableNames().contains(name) ? CollectionsKt__CollectionsKt.emptyList() : this.f80726k.invoke(name);
    }

    @NotNull
    public final NotNullLazyValue<DeclaredMemberIndex> getDeclaredMemberIndex() {
        return this.f80719d;
    }

    @Nullable
    public abstract ReceiverParameterDescriptor getDispatchReceiverParameter();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return (Set) StorageKt.getValue(this.f80723h, this, (KProperty<?>) f80715l[0]);
    }

    @Nullable
    public final LazyJavaScope getMainScope() {
        return this.f80717b;
    }

    @NotNull
    public abstract DeclarationDescriptor getOwnerDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return (Set) StorageKt.getValue(this.f80724i, this, (KProperty<?>) f80715l[1]);
    }

    public boolean isVisibleAsFunction(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "<this>");
        return true;
    }

    @NotNull
    public abstract MethodSignatureData resolveMethodSignature(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2);

    @NotNull
    public final JavaMethodDescriptor resolveMethodToFunctionDescriptor(@NotNull JavaMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        LazyJavaResolverContext lazyJavaResolverContext = this.f80716a;
        JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, method), method.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(method), this.f80719d.invoke().findRecordComponentByName(method.getName()) != null && method.getValueParameters().isEmpty());
        Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorCreateJavaMethod, "createJavaMethod(...)");
        LazyJavaResolverContext lazyJavaResolverContextChildForMethod$default = ContextKt.childForMethod$default(this.f80716a, javaMethodDescriptorCreateJavaMethod, method, 0, 4, null);
        List<JavaTypeParameter> typeParameters = method.getTypeParameters();
        List<? extends TypeParameterDescriptor> arrayList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod$default.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
            Intrinsics.checkNotNull(typeParameterDescriptorResolveTypeParameter);
            arrayList.add(typeParameterDescriptorResolveTypeParameter);
        }
        ResolvedValueParameters resolvedValueParametersResolveValueParameters = resolveValueParameters(lazyJavaResolverContextChildForMethod$default, javaMethodDescriptorCreateJavaMethod, method.getValueParameters());
        MethodSignatureData methodSignatureDataResolveMethodSignature = resolveMethodSignature(method, arrayList, computeMethodReturnType(method, lazyJavaResolverContextChildForMethod$default), resolvedValueParametersResolveValueParameters.getDescriptors());
        KotlinType receiverType = methodSignatureDataResolveMethodSignature.getReceiverType();
        javaMethodDescriptorCreateJavaMethod.initialize(receiverType != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(javaMethodDescriptorCreateJavaMethod, receiverType, Annotations.Companion.getEMPTY()) : null, getDispatchReceiverParameter(), CollectionsKt__CollectionsKt.emptyList(), methodSignatureDataResolveMethodSignature.getTypeParameters(), methodSignatureDataResolveMethodSignature.getValueParameters(), methodSignatureDataResolveMethodSignature.getReturnType(), Modality.Companion.convertFromFlags(false, method.isAbstract(), !method.isFinal()), UtilsKt.toDescriptorVisibility(method.getVisibility()), methodSignatureDataResolveMethodSignature.getReceiverType() != null ? p.mapOf(TuplesKt.to(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, CollectionsKt___CollectionsKt.first((List) resolvedValueParametersResolveValueParameters.getDescriptors()))) : q.emptyMap());
        javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(methodSignatureDataResolveMethodSignature.getHasStableParameterNames(), resolvedValueParametersResolveValueParameters.getHasSynthesizedNames());
        if (!methodSignatureDataResolveMethodSignature.getErrors().isEmpty()) {
            lazyJavaResolverContextChildForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(javaMethodDescriptorCreateJavaMethod, methodSignatureDataResolveMethodSignature.getErrors());
        }
        return javaMethodDescriptorCreateJavaMethod;
    }

    @NotNull
    public final ResolvedValueParameters resolveValueParameters(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull FunctionDescriptor function, @NotNull List<? extends JavaValueParameter> jValueParameters) {
        Pair pair;
        Name name;
        LazyJavaResolverContext c10 = lazyJavaResolverContext;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(jValueParameters, "jValueParameters");
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt___CollectionsKt.withIndex(jValueParameters);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10));
        boolean z10 = false;
        for (IndexedValue indexedValue : iterableWithIndex) {
            int index = indexedValue.getIndex();
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.component2();
            Annotations annotationsResolveAnnotations = LazyJavaAnnotationsKt.resolveAnnotations(c10, javaValueParameter);
            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            if (javaValueParameter.isVararg()) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + javaValueParameter);
                }
                KotlinType kotlinTypeTransformArrayType = lazyJavaResolverContext.getTypeResolver().transformArrayType(javaArrayType, attributes$default, true);
                pair = TuplesKt.to(kotlinTypeTransformArrayType, lazyJavaResolverContext.getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformArrayType));
            } else {
                pair = TuplesKt.to(lazyJavaResolverContext.getTypeResolver().transformJavaType(javaValueParameter.getType(), attributes$default), null);
            }
            KotlinType kotlinType = (KotlinType) pair.component1();
            KotlinType kotlinType2 = (KotlinType) pair.component2();
            if (Intrinsics.areEqual(function.getName().asString(), "equals") && jValueParameters.size() == 1 && Intrinsics.areEqual(lazyJavaResolverContext.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                name = Name.identifier("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    name = Name.identifier("p" + index);
                    Intrinsics.checkNotNullExpressionValue(name, "identifier(...)");
                }
            }
            boolean z11 = z10;
            Name name2 = name;
            Intrinsics.checkNotNull(name2);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(function, null, index, annotationsResolveAnnotations, name2, kotlinType, false, false, false, kotlinType2, lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaValueParameter)));
            arrayList = arrayList2;
            z10 = z11;
            c10 = lazyJavaResolverContext;
        }
        return new ResolvedValueParameters(CollectionsKt___CollectionsKt.toList(arrayList), z10);
    }

    @NotNull
    public String toString() {
        return "Lazy scope for " + getOwnerDescriptor();
    }

    public LazyJavaScope(@NotNull LazyJavaResolverContext c10, @Nullable LazyJavaScope lazyJavaScope) {
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f80716a = c10;
        this.f80717b = lazyJavaScope;
        this.f80718c = c10.getStorageManager().createRecursionTolerantLazyValue(new a(), CollectionsKt__CollectionsKt.emptyList());
        this.f80719d = c10.getStorageManager().createLazyValue(new e());
        this.f80720e = c10.getStorageManager().createMemoizedFunction(new d());
        this.f80721f = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new c());
        this.f80722g = c10.getStorageManager().createMemoizedFunction(new g());
        this.f80723h = c10.getStorageManager().createLazyValue(new f());
        this.f80724i = c10.getStorageManager().createLazyValue(new i());
        this.f80725j = c10.getStorageManager().createLazyValue(new b());
        this.f80726k = c10.getStorageManager().createMemoizedFunction(new h());
    }
}
