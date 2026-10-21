package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.p;
import bk.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1446#2,5:891\n1747#2,2:897\n1747#2,3:899\n1749#2:902\n1603#2,9:903\n1855#2:912\n1856#2:914\n1612#2:915\n1747#2,3:916\n1549#2:919\n1620#2,3:920\n819#2:923\n847#2,2:924\n766#2:926\n857#2,2:927\n1747#2,3:929\n1747#2,3:932\n2624#2,3:935\n766#2:938\n857#2,2:939\n766#2:941\n857#2,2:942\n1549#2:944\n1620#2,3:945\n2624#2,3:948\n288#2,2:951\n1549#2:953\n1620#2,3:954\n1446#2,5:957\n2624#2,3:962\n1360#2:965\n1446#2,2:966\n1549#2:968\n1620#2,3:969\n1448#2,3:972\n1549#2:975\n1620#2,3:976\n3190#2,10:979\n1446#2,5:989\n1#3:896\n1#3:913\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope\n*L\n74#1:891,5\n160#1:897,2\n161#1:899,3\n160#1:902\n189#1:903,9\n189#1:912\n189#1:914\n189#1:915\n193#1:916,3\n199#1:919\n199#1:920,3\n202#1:923\n202#1:924,2\n211#1:926\n211#1:927,2\n216#1:929,3\n222#1:932,3\n322#1:935,3\n327#1:938\n327#1:939,2\n354#1:941\n354#1:942,2\n376#1:944\n376#1:945,3\n461#1:948,3\n470#1:951,2\n476#1:953\n476#1:954,3\n489#1:957,5\n495#1:962,3\n649#1:965\n649#1:966,2\n650#1:968\n650#1:969,3\n649#1:972,3\n698#1:975\n698#1:976,3\n749#1:979,10\n879#1:989,5\n189#1:913\n*E\n"})
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    @NotNull
    public final ClassDescriptor m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final JavaClass f80678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f80679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue<List<ClassConstructorDescriptor>> f80680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue<Set<Name>> f80681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue<Set<Name>> f80682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue<Map<Name, JavaField>> f80683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNullable<Name, ClassDescriptor> f80684t;

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    public static final class a extends Lambda implements Function1<JavaMember, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80685p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull JavaMember it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isStatic());
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    public /* synthetic */ class b extends FunctionReference implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(LazyJavaClassMemberScope.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return LazyJavaClassMemberScope.access$searchMethodsByNameWithoutBuiltinMagic((LazyJavaClassMemberScope) this.receiver, p4);
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    public /* synthetic */ class c extends FunctionReference implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(LazyJavaClassMemberScope.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return LazyJavaClassMemberScope.access$searchMethodsInSupertypesWithoutBuiltinMagic((LazyJavaClassMemberScope) this.receiver, p4);
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    public static final class d extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return LazyJavaClassMemberScope.access$searchMethodsByNameWithoutBuiltinMagic(LazyJavaClassMemberScope.this, it);
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    public static final class e extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return LazyJavaClassMemberScope.access$searchMethodsInSupertypesWithoutBuiltinMagic(LazyJavaClassMemberScope.this, it);
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$constructors$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n1#1,890:1\n2624#2,3:891\n1#3:894\n55#4:895\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$constructors$1\n*L\n95#1:891,3\n105#1:895\n*E\n"})
    public static final class f extends Lambda implements Function0<List<? extends ClassConstructorDescriptor>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaClassMemberScope f80688p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaResolverContext f80689q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
            super(0);
            this.f80688p0 = lazyJavaClassMemberScope;
            this.f80689q0 = lazyJavaResolverContext;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends ClassConstructorDescriptor> invoke() {
            LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f80688p0;
            Collection<JavaConstructor> constructors = lazyJavaClassMemberScope.f80678n.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.size());
            Iterator<JavaConstructor> it = constructors.iterator();
            while (it.hasNext()) {
                arrayList.add(LazyJavaClassMemberScope.access$resolveConstructor(lazyJavaClassMemberScope, it.next()));
            }
            boolean zIsRecord = lazyJavaClassMemberScope.f80678n.isRecord();
            LazyJavaResolverContext lazyJavaResolverContext = this.f80689q0;
            if (zIsRecord) {
                ClassConstructorDescriptor classConstructorDescriptorAccess$createDefaultRecordConstructor = LazyJavaClassMemberScope.access$createDefaultRecordConstructor(lazyJavaClassMemberScope);
                String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptorAccess$createDefaultRecordConstructor, false, false, 2, null);
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            arrayList.add(classConstructorDescriptorAccess$createDefaultRecordConstructor);
                            lazyJavaResolverContext.getComponents().getJavaResolverCache().recordConstructor(lazyJavaClassMemberScope.f80678n, classConstructorDescriptorAccess$createDefaultRecordConstructor);
                            break;
                        }
                    } while (!Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default((ClassConstructorDescriptor) it2.next(), false, false, 2, null), strComputeJvmDescriptor$default));
                } else {
                    arrayList.add(classConstructorDescriptorAccess$createDefaultRecordConstructor);
                    lazyJavaResolverContext.getComponents().getJavaResolverCache().recordConstructor(lazyJavaClassMemberScope.f80678n, classConstructorDescriptorAccess$createDefaultRecordConstructor);
                    break;
                }
            }
            lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateConstructors(lazyJavaResolverContext, lazyJavaClassMemberScope.getOwnerDescriptor(), arrayList);
            SignatureEnhancement signatureEnhancement = lazyJavaResolverContext.getComponents().getSignatureEnhancement();
            boolean zIsEmpty = arrayList.isEmpty();
            List listListOfNotNull = arrayList;
            if (zIsEmpty) {
                listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(LazyJavaClassMemberScope.access$createDefaultConstructor(lazyJavaClassMemberScope));
            }
            return CollectionsKt___CollectionsKt.toList(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext, listListOfNotNull));
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$enumEntryIndex$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,890:1\n766#2:891\n857#2,2:892\n1194#2,2:894\n1222#2,4:896\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$enumEntryIndex$1\n*L\n811#1:891\n811#1:892,2\n811#1:894,2\n811#1:896,4\n*E\n"})
    public static final class g extends Lambda implements Function0<Map<Name, ? extends JavaField>> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<Name, ? extends JavaField> invoke() {
            Collection<JavaField> fields = LazyJavaClassMemberScope.this.f80678n.getFields();
            ArrayList arrayList = new ArrayList();
            for (Object obj : fields) {
                if (((JavaField) obj).isEnumEntry()) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.c.coerceAtLeast(p.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((JavaField) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$generatedNestedClassNames$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1#2:891\n*E\n"})
    public static final class h extends Lambda implements Function0<Set<? extends Name>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaResolverContext f80691p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaClassMemberScope f80692q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
            super(0);
            this.f80691p0 = lazyJavaResolverContext;
            this.f80692q0 = lazyJavaClassMemberScope;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends Name> invoke() {
            LazyJavaResolverContext lazyJavaResolverContext = this.f80691p0;
            return CollectionsKt___CollectionsKt.toSet(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getNestedClassNames(lazyJavaResolverContext, this.f80692q0.getOwnerDescriptor()));
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    public static final class i extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SimpleFunctionDescriptor f80693p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaClassMemberScope f80694q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
            super(1);
            this.f80693p0 = simpleFunctionDescriptor;
            this.f80694q0 = lazyJavaClassMemberScope;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name accessorName) {
            Intrinsics.checkNotNullParameter(accessorName, "accessorName");
            SimpleFunctionDescriptor simpleFunctionDescriptor = this.f80693p0;
            if (Intrinsics.areEqual(simpleFunctionDescriptor.getName(), accessorName)) {
                return bk.d.listOf(simpleFunctionDescriptor);
            }
            LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f80694q0;
            return CollectionsKt___CollectionsKt.plus(LazyJavaClassMemberScope.access$searchMethodsByNameWithoutBuiltinMagic(lazyJavaClassMemberScope, accessorName), (Iterable) LazyJavaClassMemberScope.access$searchMethodsInSupertypesWithoutBuiltinMagic(lazyJavaClassMemberScope, accessorName));
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    public static final class j extends Lambda implements Function0<Set<? extends Name>> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends Name> invoke() {
            return CollectionsKt___CollectionsKt.toSet(LazyJavaClassMemberScope.this.f80678n.getInnerClassNames());
        }
    }

    /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
    @SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$nestedClasses$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1#2:891\n*E\n"})
    public static final class k extends Lambda implements Function1<Name, ClassDescriptor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaClassMemberScope f80696p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaResolverContext f80697q0;

        /* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
        public static final class a extends Lambda implements Function0<Set<? extends Name>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LazyJavaClassMemberScope f80698p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
                super(0);
                this.f80698p0 = lazyJavaClassMemberScope;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f80698p0;
                return x.plus((Set) lazyJavaClassMemberScope.getFunctionNames(), (Iterable) lazyJavaClassMemberScope.getVariableNames());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
            super(1);
            this.f80696p0 = lazyJavaClassMemberScope;
            this.f80697q0 = lazyJavaResolverContext;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final ClassDescriptor invoke(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f80696p0;
            boolean zContains = ((Set) lazyJavaClassMemberScope.f80681q.invoke()).contains(name);
            LazyJavaResolverContext lazyJavaResolverContext = this.f80697q0;
            if (zContains) {
                JavaClassFinder finder = lazyJavaResolverContext.getComponents().getFinder();
                ClassId classId = DescriptorUtilsKt.getClassId(lazyJavaClassMemberScope.getOwnerDescriptor());
                Intrinsics.checkNotNull(classId);
                ClassId classIdCreateNestedClassId = classId.createNestedClassId(name);
                Intrinsics.checkNotNullExpressionValue(classIdCreateNestedClassId, "createNestedClassId(...)");
                JavaClass javaClassFindClass = finder.findClass(new JavaClassFinder.Request(classIdCreateNestedClassId, null, lazyJavaClassMemberScope.f80678n, 2, null));
                if (javaClassFindClass == null) {
                    return null;
                }
                LazyJavaResolverContext lazyJavaResolverContext2 = this.f80697q0;
                LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext2, lazyJavaClassMemberScope.getOwnerDescriptor(), javaClassFindClass, null, 8, null);
                lazyJavaResolverContext2.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                return lazyJavaClassDescriptor;
            }
            if (!((Set) lazyJavaClassMemberScope.f80682r.invoke()).contains(name)) {
                JavaField javaField = (JavaField) ((Map) lazyJavaClassMemberScope.f80683s.invoke()).get(name);
                if (javaField == null) {
                    return null;
                }
                return EnumEntrySyntheticClassDescriptor.create(lazyJavaResolverContext.getStorageManager(), lazyJavaClassMemberScope.getOwnerDescriptor(), name, lazyJavaResolverContext.getStorageManager().createLazyValue(new a(lazyJavaClassMemberScope)), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaField), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaField));
            }
            List<ClassDescriptor> listCreateListBuilder = bk.d.createListBuilder();
            lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateNestedClass(lazyJavaResolverContext, lazyJavaClassMemberScope.getOwnerDescriptor(), name, listCreateListBuilder);
            List listBuild = bk.d.build(listCreateListBuilder);
            int size = listBuild.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return (ClassDescriptor) CollectionsKt___CollectionsKt.single(listBuild);
            }
            throw new IllegalStateException(("Multiple classes with same name are generated: " + listBuild).toString());
        }
    }

    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z10, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z10, (i10 & 16) != 0 ? null : lazyJavaClassMemberScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v0, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope] */
    public static final ClassConstructorDescriptor access$createDefaultConstructor(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        ?? EmptyList;
        Pair pair;
        JavaClass javaClass = lazyJavaClassMemberScope.f80678n;
        boolean zIsAnnotationType = javaClass.isAnnotationType();
        if ((javaClass.isInterface() || !javaClass.hasDefaultConstructor()) && !zIsAnnotationType) {
            return null;
        }
        ClassDescriptor ownerDescriptor = lazyJavaClassMemberScope.getOwnerDescriptor();
        ?? CreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, Annotations.Companion.getEMPTY(), true, lazyJavaClassMemberScope.getC().getComponents().getSourceElementFactory().source(javaClass));
        Intrinsics.checkNotNullExpressionValue(CreateJavaConstructor, "createJavaConstructor(...)");
        if (zIsAnnotationType) {
            Collection<JavaMethod> methods = javaClass.getMethods();
            EmptyList = new ArrayList(methods.size());
            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, true, false, null, 6, null);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : methods) {
                if (Intrinsics.areEqual(((JavaMethod) obj).getName(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair2 = new Pair(arrayList, arrayList2);
            List list = (List) pair2.component1();
            List<JavaMethod> list2 = (List) pair2.component2();
            list.size();
            JavaMethod javaMethod = (JavaMethod) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (javaMethod != null) {
                JavaType returnType = javaMethod.getReturnType();
                if (returnType instanceof JavaArrayType) {
                    JavaArrayType javaArrayType = (JavaArrayType) returnType;
                    pair = new Pair(lazyJavaClassMemberScope.getC().getTypeResolver().transformArrayType(javaArrayType, attributes$default, true), lazyJavaClassMemberScope.getC().getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default));
                } else {
                    pair = new Pair(lazyJavaClassMemberScope.getC().getTypeResolver().transformJavaType(returnType, attributes$default), null);
                }
                lazyJavaClassMemberScope.a(EmptyList, CreateJavaConstructor, 0, javaMethod, (KotlinType) pair.component1(), (KotlinType) pair.component2());
            }
            int i10 = javaMethod != null ? 1 : 0;
            int i11 = 0;
            for (JavaMethod javaMethod2 : list2) {
                lazyJavaClassMemberScope.a(EmptyList, CreateJavaConstructor, i11 + i10, javaMethod2, lazyJavaClassMemberScope.getC().getTypeResolver().transformJavaType(javaMethod2.getReturnType(), attributes$default), null);
                i11++;
            }
        } else {
            EmptyList = Collections.emptyList();
        }
        CreateJavaConstructor.setHasSynthesizedParameterNames(false);
        DescriptorVisibility PROTECTED_AND_PACKAGE = ownerDescriptor.getVisibility();
        Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "getVisibility(...)");
        if (Intrinsics.areEqual(PROTECTED_AND_PACKAGE, JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
            PROTECTED_AND_PACKAGE = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
            Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        }
        CreateJavaConstructor.initialize(EmptyList, PROTECTED_AND_PACKAGE);
        CreateJavaConstructor.setHasStableParameterNames(true);
        CreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        lazyJavaClassMemberScope.getC().getComponents().getJavaResolverCache().recordConstructor(javaClass, CreateJavaConstructor);
        return CreateJavaConstructor;
    }

    public static final ClassConstructorDescriptor access$createDefaultRecordConstructor(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        ClassDescriptor ownerDescriptor = lazyJavaClassMemberScope.getOwnerDescriptor();
        Annotations empty = Annotations.Companion.getEMPTY();
        JavaSourceElementFactory sourceElementFactory = lazyJavaClassMemberScope.getC().getComponents().getSourceElementFactory();
        JavaClass javaClass = lazyJavaClassMemberScope.f80678n;
        JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, empty, true, sourceElementFactory.source(javaClass));
        Intrinsics.checkNotNullExpressionValue(javaClassConstructorDescriptorCreateJavaConstructor, "createJavaConstructor(...)");
        Collection<JavaRecordComponent> recordComponents = javaClass.getRecordComponents();
        ArrayList arrayList = new ArrayList(recordComponents.size());
        JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null);
        boolean z10 = false;
        int i10 = 0;
        for (JavaRecordComponent javaRecordComponent : recordComponents) {
            int i11 = i10 + 1;
            KotlinType kotlinTypeTransformJavaType = lazyJavaClassMemberScope.getC().getTypeResolver().transformJavaType(javaRecordComponent.getType(), attributes$default);
            arrayList.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptorCreateJavaConstructor, null, i10, Annotations.Companion.getEMPTY(), javaRecordComponent.getName(), kotlinTypeTransformJavaType, false, false, false, javaRecordComponent.isVararg() ? lazyJavaClassMemberScope.getC().getComponents().getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformJavaType) : null, lazyJavaClassMemberScope.getC().getComponents().getSourceElementFactory().source(javaRecordComponent)));
            i10 = i11;
            z10 = false;
        }
        boolean z11 = z10;
        javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(z11);
        DescriptorVisibility PROTECTED_AND_PACKAGE = ownerDescriptor.getVisibility();
        Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "getVisibility(...)");
        if (Intrinsics.areEqual(PROTECTED_AND_PACKAGE, JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
            PROTECTED_AND_PACKAGE = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
            Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        }
        javaClassConstructorDescriptorCreateJavaConstructor.initialize(arrayList, PROTECTED_AND_PACKAGE);
        javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(z11);
        javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        return javaClassConstructorDescriptorCreateJavaConstructor;
    }

    public static final JavaClassConstructorDescriptor access$resolveConstructor(LazyJavaClassMemberScope lazyJavaClassMemberScope, JavaConstructor javaConstructor) {
        ClassDescriptor ownerDescriptor = lazyJavaClassMemberScope.getOwnerDescriptor();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaClassMemberScope.getC(), javaConstructor), false, lazyJavaClassMemberScope.getC().getComponents().getSourceElementFactory().source(javaConstructor));
        Intrinsics.checkNotNullExpressionValue(javaClassConstructorDescriptorCreateJavaConstructor, "createJavaConstructor(...)");
        LazyJavaResolverContext lazyJavaResolverContextChildForMethod = ContextKt.childForMethod(lazyJavaClassMemberScope.getC(), javaClassConstructorDescriptorCreateJavaConstructor, javaConstructor, ownerDescriptor.getDeclaredTypeParameters().size());
        LazyJavaScope.ResolvedValueParameters resolvedValueParametersResolveValueParameters = lazyJavaClassMemberScope.resolveValueParameters(lazyJavaResolverContextChildForMethod, javaClassConstructorDescriptorCreateJavaConstructor, javaConstructor.getValueParameters());
        List<TypeParameterDescriptor> declaredTypeParameters = ownerDescriptor.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> list = declaredTypeParameters;
        List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
            Intrinsics.checkNotNull(typeParameterDescriptorResolveTypeParameter);
            arrayList.add(typeParameterDescriptorResolveTypeParameter);
        }
        javaClassConstructorDescriptorCreateJavaConstructor.initialize(resolvedValueParametersResolveValueParameters.getDescriptors(), UtilsKt.toDescriptorVisibility(javaConstructor.getVisibility()), CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList));
        javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(resolvedValueParametersResolveValueParameters.getHasSynthesizedNames());
        javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        lazyJavaResolverContextChildForMethod.getComponents().getJavaResolverCache().recordConstructor(javaConstructor, javaClassConstructorDescriptorCreateJavaConstructor);
        return javaClassConstructorDescriptorCreateJavaConstructor;
    }

    public static final Collection access$searchMethodsByNameWithoutBuiltinMagic(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name name) {
        Collection<JavaMethod> collectionFindMethodsByName = lazyJavaClassMemberScope.getDeclaredMemberIndex().invoke().findMethodsByName(name);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collectionFindMethodsByName, 10));
        Iterator<T> it = collectionFindMethodsByName.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaClassMemberScope.resolveMethodToFunctionDescriptor((JavaMethod) it.next()));
        }
        return arrayList;
    }

    public static final Collection access$searchMethodsInSupertypesWithoutBuiltinMagic(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name name) {
        LinkedHashSet linkedHashSetM = lazyJavaClassMemberScope.m(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetM) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (!SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static SimpleFunctionDescriptor f(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor, Collection collection) {
        Collection<SimpleFunctionDescriptor> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : collection2) {
            if (!Intrinsics.areEqual(simpleFunctionDescriptor, simpleFunctionDescriptor2) && simpleFunctionDescriptor2.getInitialSignatureDescriptor() == null && i(simpleFunctionDescriptor2, functionDescriptor)) {
                FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
                Intrinsics.checkNotNull(functionDescriptorBuild);
                return (SimpleFunctionDescriptor) functionDescriptorBuild;
            }
        }
        return simpleFunctionDescriptor;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    public static SimpleFunctionDescriptor g(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FqName safe;
        FqNameUnsafe fqNameUnsafe;
        List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt___CollectionsKt.lastOrNull((List) valueParameters);
        if (valueParameterDescriptor != null) {
            ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = valueParameterDescriptor.getType().getConstructor().mo5778getDeclarationDescriptor();
            if (classifierDescriptorMo5778getDeclarationDescriptor == null || (fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo5778getDeclarationDescriptor)) == null) {
                safe = null;
            } else {
                if (!fqNameUnsafe.isSafe()) {
                    fqNameUnsafe = null;
                }
                if (fqNameUnsafe != null) {
                    safe = fqNameUnsafe.toSafe();
                } else {
                    safe = null;
                }
            }
            if (!Intrinsics.areEqual(safe, StandardNames.CONTINUATION_INTERFACE_FQ_NAME)) {
                valueParameterDescriptor = null;
            }
            if (valueParameterDescriptor != null) {
                FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
                List<ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) copyBuilderNewCopyBuilder.setValueParameters(CollectionsKt___CollectionsKt.dropLast(valueParameters2, 1)).setReturnType(valueParameterDescriptor.getType().getArguments().get(0).getType()).build();
                SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = (SimpleFunctionDescriptorImpl) simpleFunctionDescriptor2;
                if (simpleFunctionDescriptorImpl != null) {
                    simpleFunctionDescriptorImpl.setSuspend(true);
                }
                return simpleFunctionDescriptor2;
            }
        }
        return null;
    }

    public static boolean i(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor2, callableDescriptor, true).getResult();
        Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
        return result == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor2, callableDescriptor);
    }

    public static SimpleFunctionDescriptor j(PropertyDescriptor propertyDescriptor, String str, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(nameIdentifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType != null && kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    public static SimpleFunctionDescriptor l(PropertyDescriptor propertyDescriptor, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String strAsString = propertyDescriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        Name nameIdentifier = Name.identifier(JvmAbi.setterName(strAsString));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(nameIdentifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.isUnit(returnType)) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor2.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                if (kotlinTypeChecker.equalTypes(((ValueParameterDescriptor) CollectionsKt___CollectionsKt.single((List) valueParameters)).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    public static boolean o(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor original = functionDescriptor.getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
        return Intrinsics.areEqual(strComputeJvmDescriptor$default, MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null)) && !i(simpleFunctionDescriptor, functionDescriptor);
    }

    public final void a(ArrayList arrayList, JavaClassConstructorDescriptor javaClassConstructorDescriptor, int i10, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = javaMethod.getName();
        KotlinType kotlinTypeMakeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNotNullable, "makeNotNullable(...)");
        arrayList.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptor, null, i10, empty, name, kotlinTypeMakeNotNullable, javaMethod.getHasAnnotationParameterDefaultValue(), false, false, kotlinType2 != null ? TypeUtils.makeNotNullable(kotlinType2) : null, getC().getComponents().getSourceElementFactory().source(javaMethod)));
    }

    public final void b(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z10) {
        Collection<? extends SimpleFunctionDescriptor> collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, collection2, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        if (!z10) {
            collection.addAll(collectionResolveOverridesForNonStaticMembers);
            return;
        }
        Collection<? extends SimpleFunctionDescriptor> collection3 = collectionResolveOverridesForNonStaticMembers;
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) collection, (Iterable) collection3);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection3, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptorF : collection3) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenSpecialBuiltin(simpleFunctionDescriptorF);
            if (simpleFunctionDescriptor == null) {
                Intrinsics.checkNotNull(simpleFunctionDescriptorF);
            } else {
                Intrinsics.checkNotNull(simpleFunctionDescriptorF);
                simpleFunctionDescriptorF = f(simpleFunctionDescriptorF, simpleFunctionDescriptor, listPlus);
            }
            arrayList.add(simpleFunctionDescriptorF);
        }
        collection.addAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    public final void c(Name name, Collection<? extends SimpleFunctionDescriptor> collection, Collection<? extends SimpleFunctionDescriptor> collection2, Collection<SimpleFunctionDescriptor> collection3, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptorF;
        Object next;
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        SimpleFunctionDescriptor simpleFunctionDescriptorF2;
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : collection2) {
            SimpleFunctionDescriptor simpleFunctionDescriptor3 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor2);
            SimpleFunctionDescriptor simpleFunctionDescriptor4 = null;
            if (simpleFunctionDescriptor3 == null) {
                simpleFunctionDescriptorF = null;
                break;
            }
            String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor3);
            Intrinsics.checkNotNull(jvmMethodNameIfSpecial);
            Name nameIdentifier = Name.identifier(jvmMethodNameIfSpecial);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            Iterator<? extends SimpleFunctionDescriptor> it = function1.invoke(nameIdentifier).iterator();
            while (true) {
                if (!it.hasNext()) {
                    simpleFunctionDescriptorF = null;
                    break;
                }
                FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = it.next().newCopyBuilder();
                copyBuilderNewCopyBuilder.setName(name);
                copyBuilderNewCopyBuilder.setSignatureChange();
                copyBuilderNewCopyBuilder.setPreserveSourceElement();
                FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
                Intrinsics.checkNotNull(functionDescriptorBuild);
                SimpleFunctionDescriptor simpleFunctionDescriptor5 = (SimpleFunctionDescriptor) functionDescriptorBuild;
                FunctionDescriptor original = BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor3) ? simpleFunctionDescriptor5.getOriginal() : simpleFunctionDescriptor5;
                Intrinsics.checkNotNull(original);
                if (i(original, simpleFunctionDescriptor3)) {
                    simpleFunctionDescriptorF = f(simpleFunctionDescriptor5, simpleFunctionDescriptor3, collection);
                    break;
                }
            }
            CollectionsKt.addIfNotNull(collection3, simpleFunctionDescriptorF);
            FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor2);
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava == null) {
                simpleFunctionDescriptorF2 = null;
            } else {
                Name name2 = overriddenBuiltinFunctionWithErasedValueParametersInJava.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                Iterator<T> it2 = function1.invoke(name2).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!o((SimpleFunctionDescriptor) next, overriddenBuiltinFunctionWithErasedValueParametersInJava));
                SimpleFunctionDescriptor simpleFunctionDescriptor6 = (SimpleFunctionDescriptor) next;
                if (simpleFunctionDescriptor6 != null) {
                    FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder2 = simpleFunctionDescriptor6.newCopyBuilder();
                    List<ValueParameterDescriptor> valueParameters = overriddenBuiltinFunctionWithErasedValueParametersInJava.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    List<ValueParameterDescriptor> list = valueParameters;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((ValueParameterDescriptor) it3.next()).getType());
                    }
                    List<ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor6.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
                    copyBuilderNewCopyBuilder2.setValueParameters(UtilKt.copyValueParameters(arrayList, valueParameters2, overriddenBuiltinFunctionWithErasedValueParametersInJava));
                    copyBuilderNewCopyBuilder2.setSignatureChange();
                    copyBuilderNewCopyBuilder2.setPreserveSourceElement();
                    copyBuilderNewCopyBuilder2.putUserData(JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS, Boolean.TRUE);
                    simpleFunctionDescriptor = (SimpleFunctionDescriptor) copyBuilderNewCopyBuilder2.build();
                } else {
                    simpleFunctionDescriptor = null;
                }
                if (simpleFunctionDescriptor == null) {
                    simpleFunctionDescriptorF2 = null;
                } else {
                    if (!p(simpleFunctionDescriptor)) {
                        simpleFunctionDescriptor = null;
                    }
                    if (simpleFunctionDescriptor != null) {
                        simpleFunctionDescriptorF2 = f(simpleFunctionDescriptor, overriddenBuiltinFunctionWithErasedValueParametersInJava, collection);
                    } else {
                        simpleFunctionDescriptorF2 = null;
                    }
                }
            }
            CollectionsKt.addIfNotNull(collection3, simpleFunctionDescriptorF2);
            if (simpleFunctionDescriptor2.isSuspend()) {
                Name name3 = simpleFunctionDescriptor2.getName();
                Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                Iterator<T> it4 = function1.invoke(name3).iterator();
                while (it4.hasNext()) {
                    SimpleFunctionDescriptor simpleFunctionDescriptorG = g((SimpleFunctionDescriptor) it4.next());
                    if (simpleFunctionDescriptorG == null || !i(simpleFunctionDescriptorG, simpleFunctionDescriptor2)) {
                        simpleFunctionDescriptorG = null;
                    }
                    if (simpleFunctionDescriptorG != null) {
                        simpleFunctionDescriptor4 = simpleFunctionDescriptorG;
                        break;
                    }
                }
            }
            CollectionsKt.addIfNotNull(collection3, simpleFunctionDescriptor4);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computeClassNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return x.plus((Set) this.f80681q.invoke(), (Iterable) this.f80683s.invoke().keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public /* bridge */ /* synthetic */ Set computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        return computeFunctionNames(descriptorKindFilter, (Function1<? super Name, Boolean>) function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeImplicitlyDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> result, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f80678n.isRecord() && getDeclaredMemberIndex().invoke().findRecordComponentByName(name) != null) {
            Collection<SimpleFunctionDescriptor> collection = result;
            if (collection.isEmpty()) {
                JavaRecordComponent javaRecordComponentFindRecordComponentByName = getDeclaredMemberIndex().invoke().findRecordComponentByName(name);
                Intrinsics.checkNotNull(javaRecordComponentFindRecordComponentByName);
                JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaRecordComponentFindRecordComponentByName), javaRecordComponentFindRecordComponentByName.getName(), getC().getComponents().getSourceElementFactory().source(javaRecordComponentFindRecordComponentByName), true);
                Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorCreateJavaMethod, "createJavaMethod(...)");
                javaMethodDescriptorCreateJavaMethod.initialize(null, getDispatchReceiverParameter(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), getC().getTypeResolver().transformJavaType(javaRecordComponentFindRecordComponentByName.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null)), Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
                javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(false, false);
                getC().getComponents().getJavaResolverCache().recordMethod(javaRecordComponentFindRecordComponentByName, javaMethodDescriptorCreateJavaMethod);
                result.add(javaMethodDescriptorCreateJavaMethod);
            } else {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (((SimpleFunctionDescriptor) it.next()).getValueParameters().isEmpty()) {
                    }
                }
                JavaRecordComponent javaRecordComponentFindRecordComponentByName2 = getDeclaredMemberIndex().invoke().findRecordComponentByName(name);
                Intrinsics.checkNotNull(javaRecordComponentFindRecordComponentByName2);
                JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod2 = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaRecordComponentFindRecordComponentByName2), javaRecordComponentFindRecordComponentByName2.getName(), getC().getComponents().getSourceElementFactory().source(javaRecordComponentFindRecordComponentByName2), true);
                Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorCreateJavaMethod2, "createJavaMethod(...)");
                javaMethodDescriptorCreateJavaMethod2.initialize(null, getDispatchReceiverParameter(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList(), getC().getTypeResolver().transformJavaType(javaRecordComponentFindRecordComponentByName2.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null)), Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
                javaMethodDescriptorCreateJavaMethod2.setParameterNamesStatus(false, false);
                getC().getComponents().getJavaResolverCache().recordMethod(javaRecordComponentFindRecordComponentByName2, javaMethodDescriptorCreateJavaMethod2);
                result.add(javaMethodDescriptorCreateJavaMethod2);
            }
        }
        getC().getComponents().getSyntheticPartsProvider().generateMethods(getC(), getOwnerDescriptor(), name, result);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> result, @NotNull Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        LinkedHashSet linkedHashSetM = m(name);
        if (!SpecialGenericSignatures.Companion.getSameAsRenamedInJvmBuiltin(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            if (!linkedHashSetM.isEmpty()) {
                Iterator it = linkedHashSetM.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((FunctionDescriptor) it.next()).isSuspend()) {
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : linkedHashSetM) {
                if (p((SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            b(result, name, arrayList, false);
            return;
        }
        Collection<SimpleFunctionDescriptor> collectionCreate = SmartSet.Companion.create();
        Collection<? extends SimpleFunctionDescriptor> collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, linkedHashSetM, CollectionsKt__CollectionsKt.emptyList(), getOwnerDescriptor(), ErrorReporter.DO_NOTHING, getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        c(name, result, collectionResolveOverridesForNonStaticMembers, result, new b(1, this));
        c(name, result, collectionResolveOverridesForNonStaticMembers, collectionCreate, new c(1, this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedHashSetM) {
            if (p((SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        b(result, name, CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) collectionCreate), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> result) {
        JavaMethod javaMethod;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.f80678n.isAnnotationType() && (javaMethod = (JavaMethod) CollectionsKt___CollectionsKt.singleOrNull(getDeclaredMemberIndex().invoke().findMethodsByName(name))) != null) {
            JavaPropertyDescriptor javaPropertyDescriptorCreate = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaMethod), Modality.FINAL, UtilsKt.toDescriptorVisibility(javaMethod.getVisibility()), false, javaMethod.getName(), getC().getComponents().getSourceElementFactory().source(javaMethod), false);
            Intrinsics.checkNotNullExpressionValue(javaPropertyDescriptorCreate, "create(...)");
            PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(javaPropertyDescriptorCreate, Annotations.Companion.getEMPTY());
            Intrinsics.checkNotNullExpressionValue(propertyGetterDescriptorImplCreateDefaultGetter, "createDefaultGetter(...)");
            javaPropertyDescriptorCreate.initialize(propertyGetterDescriptorImplCreateDefaultGetter, null);
            KotlinType kotlinTypeComputeMethodReturnType = computeMethodReturnType(javaMethod, ContextKt.childForMethod$default(getC(), javaPropertyDescriptorCreate, javaMethod, 0, 4, null));
            javaPropertyDescriptorCreate.setType(kotlinTypeComputeMethodReturnType, CollectionsKt__CollectionsKt.emptyList(), getDispatchReceiverParameter(), null, CollectionsKt__CollectionsKt.emptyList());
            propertyGetterDescriptorImplCreateDefaultGetter.initialize(kotlinTypeComputeMethodReturnType);
            result.add(javaPropertyDescriptorCreate);
        }
        Set<PropertyDescriptor> setN = n(name);
        if (setN.isEmpty()) {
            return;
        }
        SmartSet.Companion companion = SmartSet.Companion;
        SmartSet smartSetCreate = companion.create();
        SmartSet smartSetCreate2 = companion.create();
        d(setN, result, smartSetCreate, new d());
        d(x.minus((Set) setN, (Iterable) smartSetCreate), smartSetCreate2, null, new e());
        Collection<? extends PropertyDescriptor> collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, x.plus((Set) setN, (Iterable) smartSetCreate2), result, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(collectionResolveOverridesForNonStaticMembers);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public Set<Name> computePropertyNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (this.f80678n.isAnnotationType()) {
            return getFunctionNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(getDeclaredMemberIndex().invoke().getFieldNames());
        Collection<KotlinType> supertypes = getOwnerDescriptor().getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            bk.g.addAll(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getVariableNames());
        }
        return linkedHashSet;
    }

    public final void d(Set set, Collection collection, SmartSet smartSet, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptorL;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) it.next();
            JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = null;
            PropertySetterDescriptorImpl propertySetterDescriptorImplCreateSetter = null;
            if (h(propertyDescriptor, function1)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorK = k(propertyDescriptor, function1);
                Intrinsics.checkNotNull(simpleFunctionDescriptorK);
                if (propertyDescriptor.isVar()) {
                    simpleFunctionDescriptorL = l(propertyDescriptor, function1);
                    Intrinsics.checkNotNull(simpleFunctionDescriptorL);
                } else {
                    simpleFunctionDescriptorL = null;
                }
                if (simpleFunctionDescriptorL != null) {
                    simpleFunctionDescriptorL.getModality();
                    simpleFunctionDescriptorK.getModality();
                }
                JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor2 = new JavaForKotlinOverridePropertyDescriptor(getOwnerDescriptor(), simpleFunctionDescriptorK, simpleFunctionDescriptorL, propertyDescriptor);
                KotlinType returnType = simpleFunctionDescriptorK.getReturnType();
                Intrinsics.checkNotNull(returnType);
                javaForKotlinOverridePropertyDescriptor2.setType(returnType, CollectionsKt__CollectionsKt.emptyList(), getDispatchReceiverParameter(), null, CollectionsKt__CollectionsKt.emptyList());
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateGetter = DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorK.getAnnotations(), false, false, false, simpleFunctionDescriptorK.getSource());
                propertyGetterDescriptorImplCreateGetter.setInitialSignatureDescriptor(simpleFunctionDescriptorK);
                propertyGetterDescriptorImplCreateGetter.initialize(javaForKotlinOverridePropertyDescriptor2.getType());
                Intrinsics.checkNotNullExpressionValue(propertyGetterDescriptorImplCreateGetter, "apply(...)");
                if (simpleFunctionDescriptorL != null) {
                    List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptorL.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt___CollectionsKt.firstOrNull((List) valueParameters);
                    if (valueParameterDescriptor == null) {
                        throw new AssertionError("No parameter found for " + simpleFunctionDescriptorL);
                    }
                    propertySetterDescriptorImplCreateSetter = DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorL.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptorL.getVisibility(), simpleFunctionDescriptorL.getSource());
                    propertySetterDescriptorImplCreateSetter.setInitialSignatureDescriptor(simpleFunctionDescriptorL);
                    propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateGetter;
                } else {
                    propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateGetter;
                }
                javaForKotlinOverridePropertyDescriptor2.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImplCreateSetter);
                javaForKotlinOverridePropertyDescriptor = javaForKotlinOverridePropertyDescriptor2;
            }
            if (javaForKotlinOverridePropertyDescriptor != null) {
                collection.add(javaForKotlinOverridePropertyDescriptor);
                if (smartSet != null) {
                    smartSet.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    public final Collection<KotlinType> e() {
        if (!this.f80679o) {
            return getC().getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(getOwnerDescriptor());
        }
        Collection<KotlinType> supertypes = getOwnerDescriptor().getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        return supertypes;
    }

    @NotNull
    public final NotNullLazyValue<List<ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.f80680p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo5779getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        MemoizedFunctionToNullable<Name, ClassDescriptor> memoizedFunctionToNullable;
        ClassDescriptor classDescriptorInvoke;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo5783recordLookup(name, location);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) getMainScope();
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.f80684t) == null || (classDescriptorInvoke = memoizedFunctionToNullable.invoke(name)) == null) ? this.f80684t.invoke(name) : classDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo5783recordLookup(name, location);
        return super.getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo5783recordLookup(name, location);
        return super.getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(getOwnerDescriptor());
    }

    public final boolean h(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorK = k(propertyDescriptor, function1);
        SimpleFunctionDescriptor simpleFunctionDescriptorL = l(propertyDescriptor, function1);
        if (simpleFunctionDescriptorK == null) {
            return false;
        }
        if (propertyDescriptor.isVar()) {
            return simpleFunctionDescriptorL != null && simpleFunctionDescriptorL.getModality() == simpleFunctionDescriptorK.getModality();
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public boolean isVisibleAsFunction(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "<this>");
        if (this.f80678n.isAnnotationType()) {
            return false;
        }
        return p(javaMethodDescriptor);
    }

    public final SimpleFunctionDescriptor k(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter) : null;
        String builtinSpecialPropertyGetterName = propertyGetterDescriptor != null ? ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor) : null;
        if (builtinSpecialPropertyGetterName != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(getOwnerDescriptor(), propertyGetterDescriptor)) {
            return j(propertyDescriptor, builtinSpecialPropertyGetterName, function1);
        }
        String strAsString = propertyDescriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return j(propertyDescriptor, JvmAbi.getterName(strAsString), function1);
    }

    public final LinkedHashSet m(Name name) {
        Collection<KotlinType> collectionE = e();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionE.iterator();
        while (it.hasNext()) {
            bk.g.addAll(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    public final Set<PropertyDescriptor> n(Name name) {
        Collection<KotlinType> collectionE = e();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionE.iterator();
        while (it.hasNext()) {
            Collection<? extends PropertyDescriptor> contributedVariables = ((KotlinType) it.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(contributedVariables, 10));
            Iterator<T> it2 = contributedVariables.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            bk.g.addAll(arrayList, arrayList2);
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }

    public final boolean p(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        List<Name> propertyNamesCandidatesByAccessorName = PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(name);
        if (!(propertyNamesCandidatesByAccessorName instanceof Collection) || !propertyNamesCandidatesByAccessorName.isEmpty()) {
            Iterator<T> it = propertyNamesCandidatesByAccessorName.iterator();
            while (it.hasNext()) {
                Set<PropertyDescriptor> setN = n((Name) it.next());
                if (!(setN instanceof Collection) || !setN.isEmpty()) {
                    for (PropertyDescriptor propertyDescriptor : setN) {
                        if (h(propertyDescriptor, new i(simpleFunctionDescriptor, this))) {
                            if (!propertyDescriptor.isVar()) {
                                String strAsString = simpleFunctionDescriptor.getName().asString();
                                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                                if (!JvmAbi.isSetterName(strAsString)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        Name name2 = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        Name builtinFunctionNamesByJvmName = companion.getBuiltinFunctionNamesByJvmName(name2);
        if (builtinFunctionNamesByJvmName != null) {
            LinkedHashSet linkedHashSetM = m(builtinFunctionNamesByJvmName);
            ArrayList<SimpleFunctionDescriptor> arrayList = new ArrayList();
            for (Object obj : linkedHashSetM) {
                if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
                copyBuilderNewCopyBuilder.setName(builtinFunctionNamesByJvmName);
                copyBuilderNewCopyBuilder.setSignatureChange();
                copyBuilderNewCopyBuilder.setPreserveSourceElement();
                FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
                Intrinsics.checkNotNull(functionDescriptorBuild);
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild;
                if (!arrayList.isEmpty()) {
                    for (SimpleFunctionDescriptor simpleFunctionDescriptor3 : arrayList) {
                        FunctionDescriptor original = BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor3) ? simpleFunctionDescriptor2.getOriginal() : simpleFunctionDescriptor2;
                        Intrinsics.checkNotNull(original);
                        if (i(original, simpleFunctionDescriptor3)) {
                            return false;
                        }
                    }
                }
            }
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name3 = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name3)) {
            Name name4 = simpleFunctionDescriptor.getName();
            Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
            LinkedHashSet linkedHashSetM2 = m(name4);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = linkedHashSetM2.iterator();
            while (it2.hasNext()) {
                FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((SimpleFunctionDescriptor) it2.next());
                if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                    arrayList2.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (o(simpleFunctionDescriptor, (FunctionDescriptor) it3.next())) {
                        return false;
                    }
                }
            }
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorG = g(simpleFunctionDescriptor);
        if (simpleFunctionDescriptorG != null) {
            Name name5 = simpleFunctionDescriptor.getName();
            Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
            LinkedHashSet<SimpleFunctionDescriptor> linkedHashSetM3 = m(name5);
            if (!linkedHashSetM3.isEmpty()) {
                for (SimpleFunctionDescriptor simpleFunctionDescriptor4 : linkedHashSetM3) {
                    if (simpleFunctionDescriptor4.isSuspend() && i(simpleFunctionDescriptorG, simpleFunctionDescriptor4)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo5783recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(getC().getComponents().getLookupTracker(), location, getOwnerDescriptor(), name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public LazyJavaScope.MethodSignatureData resolveMethodSignature(@NotNull JavaMethod method, @NotNull List<? extends TypeParameterDescriptor> methodTypeParameters, @NotNull KotlinType returnType, @NotNull List<? extends ValueParameterDescriptor> valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        SignaturePropagator.PropagatedSignature propagatedSignatureResolvePropagatedSignature = getC().getComponents().getSignaturePropagator().resolvePropagatedSignature(method, getOwnerDescriptor(), returnType, null, valueParameters, methodTypeParameters);
        Intrinsics.checkNotNullExpressionValue(propagatedSignatureResolvePropagatedSignature, "resolvePropagatedSignature(...)");
        KotlinType returnType2 = propagatedSignatureResolvePropagatedSignature.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
        KotlinType receiverType = propagatedSignatureResolvePropagatedSignature.getReceiverType();
        List<ValueParameterDescriptor> valueParameters2 = propagatedSignatureResolvePropagatedSignature.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
        List<TypeParameterDescriptor> typeParameters = propagatedSignatureResolvePropagatedSignature.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        boolean zHasStableParameterNames = propagatedSignatureResolvePropagatedSignature.hasStableParameterNames();
        List<String> errors = propagatedSignatureResolvePropagatedSignature.getErrors();
        Intrinsics.checkNotNullExpressionValue(errors, "getErrors(...)");
        return new LazyJavaScope.MethodSignatureData(returnType2, receiverType, valueParameters2, typeParameters, zHasStableParameterNames, errors);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public String toString() {
        return "Lazy Java member scope for " + this.f80678n.getFqName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(@NotNull LazyJavaResolverContext c10, @NotNull ClassDescriptor ownerDescriptor, @NotNull JavaClass jClass, boolean z10, @Nullable LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c10, lazyJavaClassMemberScope);
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.m = ownerDescriptor;
        this.f80678n = jClass;
        this.f80679o = z10;
        this.f80680p = c10.getStorageManager().createLazyValue(new f(c10, this));
        this.f80681q = c10.getStorageManager().createLazyValue(new j());
        this.f80682r = c10.getStorageManager().createLazyValue(new h(c10, this));
        this.f80683s = c10.getStorageManager().createLazyValue(new g());
        this.f80684t = c10.getStorageManager().createMemoizedFunctionWithNullableValues(new k(c10, this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public LinkedHashSet<Name> computeFunctionNames(@NotNull DescriptorKindFilter kindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Collection<KotlinType> supertypes = getOwnerDescriptor().getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        LinkedHashSet<Name> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            bk.g.addAll(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getFunctionNames());
        }
        linkedHashSet.addAll(getDeclaredMemberIndex().invoke().getMethodNames());
        linkedHashSet.addAll(getDeclaredMemberIndex().invoke().getRecordComponentNames());
        linkedHashSet.addAll(computeClassNames(kindFilter, function1));
        linkedHashSet.addAll(getC().getComponents().getSyntheticPartsProvider().getMethodNames(getC(), getOwnerDescriptor()));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.f80678n, a.f80685p0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public ClassDescriptor getOwnerDescriptor() {
        return this.m;
    }
}
