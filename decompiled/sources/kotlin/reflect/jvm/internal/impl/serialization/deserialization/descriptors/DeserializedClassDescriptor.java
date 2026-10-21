package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import bk.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n288#2,2:428\n766#2:430\n857#2,2:431\n1549#2:433\n1620#2,3:434\n1549#2:437\n1620#2,3:438\n1603#2,9:441\n1855#2:450\n1856#2:452\n1612#2:453\n661#2,11:455\n1#3:451\n1#3:454\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor\n*L\n139#1:428,2\n151#1:430\n151#1:431,2\n151#1:433\n151#1:434,3\n157#1:437\n157#1:438,3\n188#1:441,9\n188#1:450\n188#1:452\n188#1:453\n218#1:455,11\n188#1:451\n*E\n"})
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {

    @NotNull
    public final DeserializationContext E0;

    @NotNull
    public final MemberScopeImpl F0;

    @NotNull
    public final b G0;

    @NotNull
    public final ScopesHolderForClass<a> H0;

    @Nullable
    public final c I0;

    @NotNull
    public final DeclarationDescriptor J0;

    @NotNull
    public final NullableLazyValue<ClassConstructorDescriptor> K0;

    @NotNull
    public final NotNullLazyValue<Collection<ClassConstructorDescriptor>> L0;

    @NotNull
    public final NullableLazyValue<ClassDescriptor> M0;

    @NotNull
    public final NotNullLazyValue<Collection<ClassDescriptor>> N0;

    @NotNull
    public final NullableLazyValue<ValueClassRepresentation<SimpleType>> O0;

    @NotNull
    public final ProtoContainer.Class P0;

    @NotNull
    public final Annotations Q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ProtoBuf.Class f81765s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final BinaryVersion f81766t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final SourceElement f81767u0;

    @NotNull
    public final ClassId v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Modality f81768w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final DescriptorVisibility f81769x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final ClassKind f81770y0;

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    @SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassMemberScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,427:1\n1549#2:428\n1620#2,3:429\n1446#2,5:433\n1446#2,5:438\n1#3:432\n206#4,5:443\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassMemberScope\n*L\n272#1:428\n272#1:429,3\n352#1:433,5\n358#1:438,5\n364#1:443,5\n*E\n"})
    public final class a extends DeserializedMemberScope {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final KotlinTypeRefiner f81772f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue<Collection<DeclarationDescriptor>> f81773g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue<Collection<KotlinType>> f81774h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ DeserializedClassDescriptor f81775i;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
        public static final class C0447a extends Lambda implements Function0<List<? extends Name>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ List<Name> f81776p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0447a(ArrayList arrayList) {
                super(0);
                this.f81776p0 = arrayList;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends Name> invoke() {
                return this.f81776p0;
            }
        }

        /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
        public static final class b extends Lambda implements Function0<Collection<? extends DeclarationDescriptor>> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Collection<? extends DeclarationDescriptor> invoke() {
                return a.this.computeDescriptors(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
        public static final class c extends Lambda implements Function0<Collection<? extends KotlinType>> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Collection<? extends KotlinType> invoke() {
                a aVar = a.this;
                return aVar.f81772f.refineSupertypes(aVar.f81775i);
            }
        }

        public a(@NotNull DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f81775i = deserializedClassDescriptor;
            DeserializationContext c10 = deserializedClassDescriptor.getC();
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
            List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.getClassProto().getPropertyList();
            Intrinsics.checkNotNullExpressionValue(propertyList, "getPropertyList(...)");
            List<ProtoBuf.TypeAlias> typeAliasList = deserializedClassDescriptor.getClassProto().getTypeAliasList();
            Intrinsics.checkNotNullExpressionValue(typeAliasList, "getTypeAliasList(...)");
            List<Integer> nestedClassNameList = deserializedClassDescriptor.getClassProto().getNestedClassNameList();
            Intrinsics.checkNotNullExpressionValue(nestedClassNameList, "getNestedClassNameList(...)");
            List<Integer> list = nestedClassNameList;
            NameResolver nameResolver = deserializedClassDescriptor.getC().getNameResolver();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(NameResolverUtilKt.getName(nameResolver, ((Number) it.next()).intValue()));
            }
            super(c10, functionList, propertyList, typeAliasList, new C0447a(arrayList));
            this.f81772f = kotlinTypeRefiner;
            this.f81773g = getC().getStorageManager().createLazyValue(new b());
            this.f81774h = getC().getStorageManager().createLazyValue(new c());
        }

        public final void a(Name name, ArrayList arrayList, final List list) {
            getC().getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(name, arrayList, new ArrayList(list), this.f81775i, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public void addFakeOverride(@NotNull CallableMemberDescriptor fakeOverride) {
                    Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
                    OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                    list.add(fakeOverride);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                public void conflict(@NotNull CallableMemberDescriptor fromSuper, @NotNull CallableMemberDescriptor fromCurrent) {
                    Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
                    Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
                    if (fromCurrent instanceof FunctionDescriptorImpl) {
                        ((FunctionDescriptorImpl) fromCurrent).putInUserDataMap(DeserializedDeclarationsFromSupertypeConflictDataKey.INSTANCE, fromSuper);
                    }
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void addEnumEntryDescriptors(@NotNull Collection<DeclarationDescriptor> result, @NotNull Function1<? super Name, Boolean> nameFilter) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            c cVar = this.f81775i.I0;
            List listAll = cVar != null ? cVar.all() : null;
            if (listAll == null) {
                listAll = CollectionsKt__CollectionsKt.emptyList();
            }
            result.addAll(listAll);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void computeNonDeclaredFunctions(@NotNull Name name, @NotNull List<SimpleFunctionDescriptor> functions) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = this.f81774h.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            functions.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name, this.f81775i));
            a(name, arrayList, functions);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final void computeNonDeclaredProperties(@NotNull Name name, @NotNull List<PropertyDescriptor> descriptors) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = this.f81774h.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            a(name, arrayList, descriptors);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        public final ClassId createClassId(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            ClassId classIdCreateNestedClassId = this.f81775i.v0.createNestedClassId(name);
            Intrinsics.checkNotNullExpressionValue(classIdCreateNestedClassId, "createNestedClassId(...)");
            return classIdCreateNestedClassId;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @Nullable
        /* JADX INFO: renamed from: getContributedClassifier */
        public ClassifierDescriptor mo5779getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
            ClassDescriptor classDescriptorFindEnumEntry;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            mo5783recordLookup(name, location);
            c cVar = this.f81775i.I0;
            return (cVar == null || (classDescriptorFindEnumEntry = cVar.findEnumEntry(name)) == null) ? super.mo5779getContributedClassifier(name, location) : classDescriptorFindEnumEntry;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            return this.f81773g.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            mo5783recordLookup(name, location);
            return super.getContributedFunctions(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            mo5783recordLookup(name, location);
            return super.getContributedVariables(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @Nullable
        public final Set<Name> getNonDeclaredClassifierNames() {
            List<KotlinType> supertypes = this.f81775i.G0.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                Set<Name> classifierNames = ((KotlinType) it.next()).getMemberScope().getClassifierNames();
                if (classifierNames == null) {
                    return null;
                }
                bk.g.addAll(linkedHashSet, classifierNames);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        public final Set<Name> getNonDeclaredFunctionNames() {
            DeserializedClassDescriptor deserializedClassDescriptor = this.f81775i;
            List<KotlinType> supertypes = deserializedClassDescriptor.G0.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                bk.g.addAll(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getFunctionNames());
            }
            linkedHashSet.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(deserializedClassDescriptor));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        @NotNull
        public final Set<Name> getNonDeclaredVariableNames() {
            List<KotlinType> supertypes = this.f81775i.G0.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                bk.g.addAll(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getVariableNames());
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        public final boolean isDeclaredFunctionAvailable(@NotNull SimpleFunctionDescriptor function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.f81775i, function);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* JADX INFO: renamed from: recordLookup */
        public void mo5783recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            UtilsKt.record(getC().getComponents().getLookupTracker(), location, this.f81775i, name);
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    @SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$EnumEntryClassDescriptors\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1194#2,2:428\n1222#2,4:430\n1620#2,3:434\n1620#2,3:437\n1603#2,9:440\n1855#2:449\n1856#2:451\n1612#2:452\n1#3:450\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$EnumEntryClassDescriptors\n*L\n387#1:428,2\n387#1:430,4\n419#1:434,3\n420#1:437,3\n424#1:440,9\n424#1:449\n424#1:451\n424#1:452\n424#1:450\n*E\n"})
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final LinkedHashMap f81782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MemoizedFunctionToNullable<Name, ClassDescriptor> f81783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue<Set<Name>> f81784c;

        /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
        public static final class a extends Lambda implements Function1<Name, ClassDescriptor> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ DeserializedClassDescriptor f81787q0;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
            public static final class C0448a extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ DeserializedClassDescriptor f81788p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ ProtoBuf.EnumEntry f81789q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0448a(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
                    super(0);
                    this.f81788p0 = deserializedClassDescriptor;
                    this.f81789q0 = enumEntry;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final List<? extends AnnotationDescriptor> invoke() {
                    DeserializedClassDescriptor deserializedClassDescriptor = this.f81788p0;
                    return CollectionsKt___CollectionsKt.toList(deserializedClassDescriptor.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(deserializedClassDescriptor.getThisAsProtoContainer$deserialization(), this.f81789q0));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeserializedClassDescriptor deserializedClassDescriptor) {
                super(1);
                this.f81787q0 = deserializedClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final ClassDescriptor invoke(@NotNull Name name) {
                Intrinsics.checkNotNullParameter(name, "name");
                c cVar = c.this;
                ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) cVar.f81782a.get(name);
                if (enumEntry == null) {
                    return null;
                }
                DeserializedClassDescriptor deserializedClassDescriptor = this.f81787q0;
                return EnumEntrySyntheticClassDescriptor.create(deserializedClassDescriptor.getC().getStorageManager(), deserializedClassDescriptor, name, cVar.f81784c, new DeserializedAnnotations(deserializedClassDescriptor.getC().getStorageManager(), new C0448a(deserializedClassDescriptor, enumEntry)), SourceElement.NO_SOURCE);
            }
        }

        /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
        public static final class b extends Lambda implements Function0<Set<? extends Name>> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                return c.access$computeEnumMemberNames(c.this);
            }
        }

        public c() {
            List<ProtoBuf.EnumEntry> enumEntryList = DeserializedClassDescriptor.this.getClassProto().getEnumEntryList();
            Intrinsics.checkNotNullExpressionValue(enumEntryList, "getEnumEntryList(...)");
            List<ProtoBuf.EnumEntry> list = enumEntryList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(androidx.camera.core.processing.f.a(list, 10, 16));
            for (Object obj : list) {
                linkedHashMap.put(NameResolverUtilKt.getName(DeserializedClassDescriptor.this.getC().getNameResolver(), ((ProtoBuf.EnumEntry) obj).getName()), obj);
            }
            this.f81782a = linkedHashMap;
            this.f81783b = DeserializedClassDescriptor.this.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new a(DeserializedClassDescriptor.this));
            this.f81784c = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new b());
        }

        public static final Set access$computeEnumMemberNames(c cVar) {
            cVar.getClass();
            HashSet hashSet = new HashSet();
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            Iterator<KotlinType> it = deserializedClassDescriptor.getTypeConstructor().getSupertypes().iterator();
            while (it.hasNext()) {
                for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(it.next().getMemberScope(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(declarationDescriptor.getName());
                    }
                }
            }
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
            Iterator<T> it2 = functionList.iterator();
            while (it2.hasNext()) {
                hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it2.next()).getName()));
            }
            List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.getClassProto().getPropertyList();
            Intrinsics.checkNotNullExpressionValue(propertyList, "getPropertyList(...)");
            Iterator<T> it3 = propertyList.iterator();
            while (it3.hasNext()) {
                hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Property) it3.next()).getName()));
            }
            return x.plus((Set) hashSet, (Iterable) hashSet);
        }

        @NotNull
        public final Collection<ClassDescriptor> all() {
            Set setKeySet = this.f81782a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                ClassDescriptor classDescriptorFindEnumEntry = findEnumEntry((Name) it.next());
                if (classDescriptorFindEnumEntry != null) {
                    arrayList.add(classDescriptorFindEnumEntry);
                }
            }
            return arrayList;
        }

        @Nullable
        public final ClassDescriptor findEnumEntry(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f81783b.invoke(name);
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public static final class d extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends AnnotationDescriptor> invoke() {
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            return CollectionsKt___CollectionsKt.toList(deserializedClassDescriptor.getC().getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(deserializedClassDescriptor.getThisAsProtoContainer$deserialization()));
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public static final class e extends Lambda implements Function0<ClassDescriptor> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final ClassDescriptor invoke() {
            return DeserializedClassDescriptor.access$computeCompanionObjectDescriptor(DeserializedClassDescriptor.this);
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public static final class f extends Lambda implements Function0<Collection<? extends ClassConstructorDescriptor>> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Collection<? extends ClassConstructorDescriptor> invoke() {
            return DeserializedClassDescriptor.access$computeConstructors(DeserializedClassDescriptor.this);
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public /* synthetic */ class g extends FunctionReference implements Function1<KotlinTypeRefiner, a> {
        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(a.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final a invoke(@NotNull KotlinTypeRefiner p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return new a((DeserializedClassDescriptor) this.receiver, p4);
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public static final class h extends Lambda implements Function0<ClassConstructorDescriptor> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final ClassConstructorDescriptor invoke() {
            return DeserializedClassDescriptor.access$computePrimaryConstructor(DeserializedClassDescriptor.this);
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public static final class i extends Lambda implements Function0<Collection<? extends ClassDescriptor>> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Collection<? extends ClassDescriptor> invoke() {
            return DeserializedClassDescriptor.access$computeSubclassesForSealedClass(DeserializedClassDescriptor.this);
        }
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    public static final class j extends Lambda implements Function0<ValueClassRepresentation<SimpleType>> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final ValueClassRepresentation<SimpleType> invoke() {
            return DeserializedClassDescriptor.access$computeValueClassRepresentation(DeserializedClassDescriptor.this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(@NotNull DeserializationContext outerContext, @NotNull ProtoBuf.Class classProto, @NotNull NameResolver nameResolver, @NotNull BinaryVersion metadataVersion, @NotNull SourceElement sourceElement) {
        MemberScopeImpl staticScopeForKotlinEnum;
        super(outerContext.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName()).getShortClassName());
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f81765s0 = classProto;
        this.f81766t0 = metadataVersion;
        this.f81767u0 = sourceElement;
        this.v0 = NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        this.f81768w0 = protoEnumFlags.modality(Flags.MODALITY.get(classProto.getFlags()));
        this.f81769x0 = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(classProto.getFlags()));
        ClassKind classKind = protoEnumFlags.classKind(Flags.CLASS_KIND.get(classProto.getFlags()));
        this.f81770y0 = classKind;
        List<ProtoBuf.TypeParameter> typeParameterList = classProto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        ProtoBuf.TypeTable typeTable = classProto.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = classProto.getVersionRequirementTable();
        Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "getVersionRequirementTable(...)");
        DeserializationContext deserializationContextChildContext = outerContext.childContext(this, typeParameterList, nameResolver, typeTable2, companion.create(versionRequirementTable), metadataVersion);
        this.E0 = deserializationContextChildContext;
        ClassKind classKind2 = ClassKind.ENUM_CLASS;
        if (classKind == classKind2) {
            Boolean bool = Flags.HAS_ENUM_ENTRIES.get(classProto.getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            staticScopeForKotlinEnum = new StaticScopeForKotlinEnum(deserializationContextChildContext.getStorageManager(), this, bool.booleanValue() || Intrinsics.areEqual(deserializationContextChildContext.getComponents().getEnumEntriesDeserializationSupport().canSynthesizeEnumEntries(), Boolean.TRUE));
        } else {
            staticScopeForKotlinEnum = MemberScope.Empty.INSTANCE;
        }
        this.F0 = staticScopeForKotlinEnum;
        this.G0 = new b();
        this.H0 = ScopesHolderForClass.Companion.create(this, deserializationContextChildContext.getStorageManager(), deserializationContextChildContext.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new g(1, this));
        this.I0 = classKind == classKind2 ? new c() : null;
        DeclarationDescriptor containingDeclaration = outerContext.getContainingDeclaration();
        this.J0 = containingDeclaration;
        this.K0 = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new h());
        this.L0 = deserializationContextChildContext.getStorageManager().createLazyValue(new f());
        this.M0 = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new e());
        this.N0 = deserializationContextChildContext.getStorageManager().createLazyValue(new i());
        this.O0 = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new j());
        NameResolver nameResolver2 = deserializationContextChildContext.getNameResolver();
        TypeTable typeTable3 = deserializationContextChildContext.getTypeTable();
        DeserializedClassDescriptor deserializedClassDescriptor = containingDeclaration instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) containingDeclaration : null;
        this.P0 = new ProtoContainer.Class(classProto, nameResolver2, typeTable3, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.P0 : null);
        this.Q0 = !Flags.HAS_ANNOTATIONS.get(classProto.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContextChildContext.getStorageManager(), new d());
    }

    public static final ClassDescriptor access$computeCompanionObjectDescriptor(DeserializedClassDescriptor deserializedClassDescriptor) {
        ProtoBuf.Class r1 = deserializedClassDescriptor.f81765s0;
        if (!r1.hasCompanionObjectName()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier = deserializedClassDescriptor.b().mo5779getContributedClassifier(NameResolverUtilKt.getName(deserializedClassDescriptor.E0.getNameResolver(), r1.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo5779getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo5779getContributedClassifier;
        }
        return null;
    }

    public static final Collection access$computeConstructors(DeserializedClassDescriptor deserializedClassDescriptor) {
        List<ProtoBuf.Constructor> constructorList = deserializedClassDescriptor.f81765s0.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "getConstructorList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : constructorList) {
            Boolean bool = Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) obj).getFlags());
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            if (bool.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            DeserializationContext deserializationContext = deserializedClassDescriptor.E0;
            if (!zHasNext) {
                return CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) CollectionsKt__CollectionsKt.listOfNotNull(deserializedClassDescriptor.mo5772getUnsubstitutedPrimaryConstructor())), (Iterable) deserializationContext.getComponents().getAdditionalClassPartsProvider().getConstructors(deserializedClassDescriptor));
            }
            ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) it.next();
            MemberDeserializer memberDeserializer = deserializationContext.getMemberDeserializer();
            Intrinsics.checkNotNull(constructor);
            arrayList2.add(memberDeserializer.loadConstructor(constructor, false));
        }
    }

    public static final ClassConstructorDescriptor access$computePrimaryConstructor(DeserializedClassDescriptor deserializedClassDescriptor) {
        Object next;
        if (deserializedClassDescriptor.f81770y0.isSingleton()) {
            ClassConstructorDescriptorImpl classConstructorDescriptorImplCreatePrimaryConstructorForObject = DescriptorFactory.createPrimaryConstructorForObject(deserializedClassDescriptor, SourceElement.NO_SOURCE);
            classConstructorDescriptorImplCreatePrimaryConstructorForObject.setReturnType(deserializedClassDescriptor.getDefaultType());
            return classConstructorDescriptorImplCreatePrimaryConstructorForObject;
        }
        List<ProtoBuf.Constructor> constructorList = deserializedClassDescriptor.f81765s0.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "getConstructorList(...)");
        Iterator<T> it = constructorList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) next).getFlags()).booleanValue()));
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
        if (constructor != null) {
            return deserializedClassDescriptor.E0.getMemberDeserializer().loadConstructor(constructor, true);
        }
        return null;
    }

    public static final Collection access$computeSubclassesForSealedClass(DeserializedClassDescriptor deserializedClassDescriptor) {
        if (deserializedClassDescriptor.f81768w0 != Modality.SEALED) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Integer> sealedSubclassFqNameList = deserializedClassDescriptor.f81765s0.getSealedSubclassFqNameList();
        Intrinsics.checkNotNull(sealedSubclassFqNameList);
        if (!(!sealedSubclassFqNameList.isEmpty())) {
            return CliSealedClassInheritorsProvider.INSTANCE.computeSealedSubclasses(deserializedClassDescriptor, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            DeserializationContext deserializationContext = deserializedClassDescriptor.E0;
            DeserializationComponents components = deserializationContext.getComponents();
            NameResolver nameResolver = deserializationContext.getNameResolver();
            Intrinsics.checkNotNull(num);
            ClassDescriptor classDescriptorDeserializeClass = components.deserializeClass(NameResolverUtilKt.getClassId(nameResolver, num.intValue()));
            if (classDescriptorDeserializeClass != null) {
                arrayList.add(classDescriptorDeserializeClass);
            }
        }
        return arrayList;
    }

    public static final ValueClassRepresentation access$computeValueClassRepresentation(DeserializedClassDescriptor deserializedClassDescriptor) {
        if (!deserializedClassDescriptor.isInline() && !deserializedClassDescriptor.isValue()) {
            return null;
        }
        DeserializationContext deserializationContext = deserializedClassDescriptor.E0;
        ValueClassRepresentation valueClassRepresentationLoadValueClassRepresentation = ValueClassUtilKt.loadValueClassRepresentation(deserializedClassDescriptor.f81765s0, deserializationContext.getNameResolver(), deserializationContext.getTypeTable(), new gl.a(1, deserializationContext.getTypeDeserializer()), new gl.b(1, deserializedClassDescriptor));
        if (valueClassRepresentationLoadValueClassRepresentation != null) {
            return valueClassRepresentationLoadValueClassRepresentation;
        }
        if (deserializedClassDescriptor.f81766t0.isAtLeast(1, 5, 1)) {
            return null;
        }
        ClassConstructorDescriptor classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor = deserializedClassDescriptor.mo5772getUnsubstitutedPrimaryConstructor();
        if (classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + deserializedClassDescriptor).toString());
        }
        List<ValueParameterDescriptor> valueParameters = classConstructorDescriptorMo5772getUnsubstitutedPrimaryConstructor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        Name name = ((ValueParameterDescriptor) CollectionsKt___CollectionsKt.first((List) valueParameters)).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        SimpleType simpleTypeC = deserializedClassDescriptor.c(name);
        if (simpleTypeC != null) {
            return new InlineClassRepresentation(name, simpleTypeC);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + deserializedClassDescriptor).toString());
    }

    public final a b() {
        return (a) this.H0.getScope(this.E0.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner());
    }

    public final SimpleType c(Name name) {
        Iterator<T> it = b().getContributedVariables(name, NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((PropertyDescriptor) next).getExtensionReceiverParameter() == null) {
                if (!z10) {
                    z10 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
        return (SimpleType) (propertyDescriptor != null ? propertyDescriptor.getType() : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.Q0;
    }

    @NotNull
    public final DeserializationContext getC() {
        return this.E0;
    }

    @NotNull
    public final ProtoBuf.Class getClassProto() {
        return this.f81765s0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo5771getCompanionObjectDescriptor() {
        return this.M0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        return this.L0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        return this.J0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        DeserializationContext deserializationContext = this.E0;
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(this.f81765s0, deserializationContext.getTypeTable());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listContextReceiverTypes, 10));
        Iterator<T> it = listContextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReceiverParameterDescriptorImpl(getThisAsReceiverParameter(), new ContextClassReceiver(this, deserializationContext.getTypeDeserializer().type((ProtoBuf.Type) it.next()), null, null), Annotations.Companion.getEMPTY()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.E0.getTypeDeserializer().getOwnTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        return this.f81770y0;
    }

    @NotNull
    public final BinaryVersion getMetadataVersion() {
        return this.f81766t0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        return this.f81768w0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassDescriptor> getSealedSubclasses() {
        return this.N0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return this.f81767u0;
    }

    @NotNull
    public final ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.P0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.H0.getScope(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo5772getUnsubstitutedPrimaryConstructor() {
        return this.K0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return this.O0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.f81769x0;
    }

    public final boolean hasNestedClass$deserialization(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return b().getClassNames$deserialization().contains(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return Flags.CLASS_KIND.get(this.f81765s0.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        Boolean bool = Flags.IS_DATA.get(this.f81765s0.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        Boolean bool = Flags.IS_EXPECT_CLASS.get(this.f81765s0.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean bool = Flags.IS_EXTERNAL_CLASS.get(this.f81765s0.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        Boolean bool = Flags.IS_FUN_INTERFACE.get(this.f81765s0.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        Boolean bool = Flags.IS_VALUE_CLASS.get(this.f81765s0.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue() && this.f81766t0.isAtMost(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        Boolean bool = Flags.IS_INNER.get(this.f81765s0.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        Boolean bool = Flags.IS_VALUE_CLASS.get(this.f81765s0.getFlags());
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return bool.booleanValue() && this.f81766t0.isAtLeast(1, 4, 2);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("deserialized ");
        sb2.append(isExpect() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
    @SourceDebugExtension({"SMAP\nDeserializedClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1549#2:428\n1620#2,3:429\n1603#2,9:432\n1855#2:441\n1856#2:443\n1612#2:444\n1549#2:445\n1620#2,3:446\n1#3:442\n*S KotlinDebug\n*F\n+ 1 DeserializedClassDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor$DeserializedClassTypeConstructor\n*L\n239#1:428\n239#1:429,3\n243#1:432,9\n243#1:441\n243#1:443\n243#1:444\n250#1:445\n250#1:446,3\n243#1:442\n*E\n"})
    public final class b extends AbstractClassTypeConstructor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue<List<TypeParameterDescriptor>> f81779c;

        /* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
        public static final class a extends Lambda implements Function0<List<? extends TypeParameterDescriptor>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DeserializedClassDescriptor f81781p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeserializedClassDescriptor deserializedClassDescriptor) {
                super(0);
                this.f81781p0 = deserializedClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends TypeParameterDescriptor> invoke() {
                return TypeParameterUtilsKt.computeConstructorTypeParameters(this.f81781p0);
            }
        }

        public b() {
            super(DeserializedClassDescriptor.this.getC().getStorageManager());
            this.f81779c = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new a(DeserializedClassDescriptor.this));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public final Collection<KotlinType> computeSupertypes() {
            String strAsString;
            FqName fqNameAsSingleFqName;
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            List<ProtoBuf.Type> listSupertypes = ProtoTypeTableUtilKt.supertypes(deserializedClassDescriptor.getClassProto(), deserializedClassDescriptor.getC().getTypeTable());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSupertypes, 10));
            Iterator<T> it = listSupertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializedClassDescriptor.getC().getTypeDeserializer().type((ProtoBuf.Type) it.next()));
            }
            List listPlus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) deserializedClassDescriptor.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(deserializedClassDescriptor));
            ArrayList<NotFoundClasses.MockClassDescriptor> arrayList2 = new ArrayList();
            Iterator it2 = listPlus.iterator();
            while (it2.hasNext()) {
                ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((KotlinType) it2.next()).getConstructor().mo5778getDeclarationDescriptor();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorMo5778getDeclarationDescriptor instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = deserializedClassDescriptor.getC().getComponents().getErrorReporter();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList2) {
                    ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    if (classId == null || (fqNameAsSingleFqName = classId.asSingleFqName()) == null || (strAsString = fqNameAsSingleFqName.asString()) == null) {
                        strAsString = mockClassDescriptor2.getName().asString();
                    }
                    arrayList3.add(strAsString);
                }
                errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor, arrayList3);
            }
            return CollectionsKt___CollectionsKt.toList(listPlus);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return this.f81779c.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        @NotNull
        public final SupertypeLoopChecker getSupertypeLoopChecker() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @NotNull
        public String toString() {
            String string = DeserializedClassDescriptor.this.getName().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public DeserializedClassDescriptor mo5778getDeclarationDescriptor() {
            return DeserializedClassDescriptor.this;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScopeImpl getStaticScope() {
        return this.F0;
    }
}
