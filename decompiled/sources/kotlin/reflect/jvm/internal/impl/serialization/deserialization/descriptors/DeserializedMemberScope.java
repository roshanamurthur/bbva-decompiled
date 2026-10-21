package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import bk.f;
import bk.p;
import bk.q;
import bk.x;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeserializedMemberScope.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f81797e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeserializationContext f81798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f81799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f81800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NullableLazyValue f81801d;

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n269#1:513\n269#1:528\n269#1:543\n287#1,17:581\n305#1,2:604\n296#1:606\n303#1:607\n305#1,2:613\n287#1,17:620\n305#1,2:642\n296#1:644\n370#1,11:645\n370#1,11:656\n1477#2:514\n1502#2,3:515\n1505#2,3:525\n1477#2:529\n1502#2,3:530\n1505#2,3:540\n1477#2:544\n1502#2,3:545\n1505#2,3:555\n1238#2,2:560\n1549#2:562\n1620#2,3:563\n1241#2:566\n1477#2:567\n1502#2,3:568\n1505#2,3:578\n1611#2:598\n1855#2:599\n1856#2:602\n1612#2:603\n1611#2:608\n1855#2:609\n1856#2:611\n1612#2:612\n1611#2:615\n1855#2:616\n1856#2:618\n1612#2:619\n1611#2:637\n1855#2:638\n1856#2:640\n1612#2:641\n372#3,7:518\n372#3,7:533\n372#3,7:548\n453#3:558\n403#3:559\n372#3,7:571\n1#4:600\n1#4:601\n1#4:610\n1#4:617\n1#4:639\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n*L\n233#1:513\n235#1:528\n239#1:543\n272#1:581,17\n272#1:604,2\n272#1:606\n287#1:607\n287#1:613,2\n310#1:620,17\n310#1:642,2\n310#1:644\n348#1:645,11\n356#1:656,11\n233#1:514\n233#1:515,3\n233#1:525,3\n235#1:529\n235#1:530,3\n235#1:540,3\n239#1:544\n239#1:545,3\n239#1:555,3\n244#1:560,2\n246#1:562\n246#1:563,3\n244#1:566\n269#1:567\n269#1:568,3\n269#1:578,3\n272#1:598\n272#1:599\n272#1:602\n272#1:603\n287#1:608\n287#1:609\n287#1:611\n287#1:612\n303#1:615\n303#1:616\n303#1:618\n303#1:619\n310#1:637\n310#1:638\n310#1:640\n310#1:641\n233#1:518,7\n235#1:533,7\n239#1:548,7\n244#1:558\n244#1:559\n269#1:571,7\n272#1:601\n287#1:610\n303#1:617\n310#1:639\n*E\n"})
    public final class OptimizedImplementation implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ KProperty<Object>[] f81802j = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OptimizedImplementation.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(OptimizedImplementation.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final LinkedHashMap f81803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final LinkedHashMap f81804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Map<Name, byte[]> f81805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f81806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> f81807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> f81808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81810h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ DeserializedMemberScope f81811i;

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        public static final class a extends Lambda implements Function0<Set<? extends Name>> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ DeserializedMemberScope f81813q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeserializedMemberScope deserializedMemberScope) {
                super(0);
                this.f81813q0 = deserializedMemberScope;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                return x.plus(OptimizedImplementation.this.f81803a.keySet(), (Iterable) this.f81813q0.getNonDeclaredFunctionNames());
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        public static final class b extends Lambda implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
            public b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Collection<SimpleFunctionDescriptor> invoke(@NotNull Name it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptimizedImplementation.access$computeFunctions(OptimizedImplementation.this, it);
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        public static final class c extends Lambda implements Function1<Name, Collection<? extends PropertyDescriptor>> {
            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Collection<PropertyDescriptor> invoke(@NotNull Name it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptimizedImplementation.access$computeProperties(OptimizedImplementation.this, it);
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        public static final class d extends Lambda implements Function1<Name, TypeAliasDescriptor> {
            public d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final TypeAliasDescriptor invoke(@NotNull Name it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptimizedImplementation.access$createTypeAlias(OptimizedImplementation.this, it);
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        public static final class e extends Lambda implements Function0<Set<? extends Name>> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ DeserializedMemberScope f81821q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(DeserializedMemberScope deserializedMemberScope) {
                super(0);
                this.f81821q0 = deserializedMemberScope;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                return x.plus(OptimizedImplementation.this.f81804b.keySet(), (Iterable) this.f81821q0.getNonDeclaredVariableNames());
            }
        }

        public OptimizedImplementation(@NotNull DeserializedMemberScope deserializedMemberScope, @NotNull List<ProtoBuf.Function> functionList, @NotNull List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) throws IOException {
            Map<Name, byte[]> mapEmptyMap;
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.f81811i = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                Name name = NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) obj)).getName());
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f81803a = a(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.f81811i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                Name name2 = NameResolverUtilKt.getName(deserializedMemberScope2.getC().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) obj2)).getName());
                Object arrayList2 = linkedHashMap2.get(name2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(name2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f81804b = a(linkedHashMap2);
            if (this.f81811i.getC().getComponents().getConfiguration().getTypeAliasesAllowed()) {
                DeserializedMemberScope deserializedMemberScope3 = this.f81811i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    Name name3 = NameResolverUtilKt.getName(deserializedMemberScope3.getC().getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).getName());
                    Object arrayList3 = linkedHashMap3.get(name3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(name3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapEmptyMap = a(linkedHashMap3);
            } else {
                mapEmptyMap = q.emptyMap();
            }
            this.f81805c = mapEmptyMap;
            this.f81806d = this.f81811i.getC().getStorageManager().createMemoizedFunction(new b());
            this.f81807e = this.f81811i.getC().getStorageManager().createMemoizedFunction(new c());
            this.f81808f = this.f81811i.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new d());
            this.f81809g = this.f81811i.getC().getStorageManager().createLazyValue(new a(this.f81811i));
            this.f81810h = this.f81811i.getC().getStorageManager().createLazyValue(new e(this.f81811i));
        }

        public static LinkedHashMap a(LinkedHashMap linkedHashMap) throws IOException {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(p.mapCapacity(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((AbstractMessageLite) it.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(Unit.INSTANCE);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        public static final Collection access$computeFunctions(OptimizedImplementation optimizedImplementation, Name name) {
            List list;
            LinkedHashMap linkedHashMap = optimizedImplementation.f81803a;
            Parser<ProtoBuf.Function> PARSER = ProtoBuf.Function.PARSER;
            Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
            byte[] bArr = (byte[]) linkedHashMap.get(name);
            DeserializedMemberScope deserializedMemberScope = optimizedImplementation.f81811i;
            List<ProtoBuf.Function> listEmptyList = (bArr == null || (list = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(PARSER, new ByteArrayInputStream(bArr), deserializedMemberScope)))) == null) ? CollectionsKt__CollectionsKt.emptyList() : list;
            ArrayList arrayList = new ArrayList(listEmptyList.size());
            for (ProtoBuf.Function function : listEmptyList) {
                MemberDeserializer memberDeserializer = deserializedMemberScope.getC().getMemberDeserializer();
                Intrinsics.checkNotNull(function);
                SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = memberDeserializer.loadFunction(function);
                if (!deserializedMemberScope.isDeclaredFunctionAvailable(simpleFunctionDescriptorLoadFunction)) {
                    simpleFunctionDescriptorLoadFunction = null;
                }
                if (simpleFunctionDescriptorLoadFunction != null) {
                    arrayList.add(simpleFunctionDescriptorLoadFunction);
                }
            }
            deserializedMemberScope.computeNonDeclaredFunctions(name, arrayList);
            return CollectionsKt.compact(arrayList);
        }

        public static final Collection access$computeProperties(OptimizedImplementation optimizedImplementation, Name name) {
            List list;
            LinkedHashMap linkedHashMap = optimizedImplementation.f81804b;
            Parser<ProtoBuf.Property> PARSER = ProtoBuf.Property.PARSER;
            Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
            byte[] bArr = (byte[]) linkedHashMap.get(name);
            DeserializedMemberScope deserializedMemberScope = optimizedImplementation.f81811i;
            List<ProtoBuf.Property> listEmptyList = (bArr == null || (list = SequencesKt___SequencesKt.toList(SequencesKt__SequencesKt.generateSequence(new DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(PARSER, new ByteArrayInputStream(bArr), deserializedMemberScope)))) == null) ? CollectionsKt__CollectionsKt.emptyList() : list;
            ArrayList arrayList = new ArrayList(listEmptyList.size());
            for (ProtoBuf.Property property : listEmptyList) {
                MemberDeserializer memberDeserializer = deserializedMemberScope.getC().getMemberDeserializer();
                Intrinsics.checkNotNull(property);
                PropertyDescriptor propertyDescriptorLoadProperty = memberDeserializer.loadProperty(property);
                if (propertyDescriptorLoadProperty != null) {
                    arrayList.add(propertyDescriptorLoadProperty);
                }
            }
            deserializedMemberScope.computeNonDeclaredProperties(name, arrayList);
            return CollectionsKt.compact(arrayList);
        }

        public static final TypeAliasDescriptor access$createTypeAlias(OptimizedImplementation optimizedImplementation, Name name) throws IOException {
            byte[] bArr = optimizedImplementation.f81805c.get(name);
            if (bArr == null) {
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            DeserializedMemberScope deserializedMemberScope = optimizedImplementation.f81811i;
            ProtoBuf.TypeAlias delimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(byteArrayInputStream, deserializedMemberScope.getC().getComponents().getExtensionRegistryLite());
            if (delimitedFrom == null) {
                return null;
            }
            return deserializedMemberScope.getC().getMemberDeserializer().loadTypeAlias(delimitedFrom);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public void addFunctionsAndPropertiesTo(@NotNull Collection<DeclarationDescriptor> result, @NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
                Set<Name> variableNames = getVariableNames();
                ArrayList arrayList = new ArrayList();
                for (Name name : variableNames) {
                    if (nameFilter.invoke(name).booleanValue()) {
                        arrayList.addAll(getContributedVariables(name, location));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator INSTANCE = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
                f.sortWith(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                Set<Name> functionNames = getFunctionNames();
                ArrayList arrayList2 = new ArrayList();
                for (Name name2 : functionNames) {
                    if (nameFilter.invoke(name2).booleanValue()) {
                        arrayList2.addAll(getContributedFunctions(name2, location));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator INSTANCE2 = MemberComparator.NameAndTypeMemberComparator.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(INSTANCE2, "INSTANCE");
                f.sortWith(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !getFunctionNames().contains(name) ? CollectionsKt__CollectionsKt.emptyList() : this.f81806d.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !getVariableNames().contains(name) ? CollectionsKt__CollectionsKt.emptyList() : this.f81807e.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> getFunctionNames() {
            return (Set) StorageKt.getValue(this.f81809g, this, (KProperty<?>) f81802j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @Nullable
        public TypeAliasDescriptor getTypeAliasByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f81808f.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> getTypeAliasNames() {
            return this.f81805c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> getVariableNames() {
            return (Set) StorageKt.getValue(this.f81810h, this, (KProperty<?>) f81802j[1]);
        }
    }

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    public interface a {
        void addFunctionsAndPropertiesTo(@NotNull Collection<DeclarationDescriptor> collection, @NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation);

        @NotNull
        Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation);

        @NotNull
        Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation);

        @NotNull
        Set<Name> getFunctionNames();

        @Nullable
        TypeAliasDescriptor getTypeAliasByName(@NotNull Name name);

        @NotNull
        Set<Name> getTypeAliasNames();

        @NotNull
        Set<Name> getVariableNames();
    }

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n502#1:513\n508#1:517\n508#1:532\n508#1:546\n492#1:572\n493#1,5:575\n492#1:580\n493#1,5:583\n1620#2,3:514\n1603#2,9:518\n1855#2:527\n1856#2:530\n1612#2:531\n1603#2,9:533\n1855#2:542\n1856#2:544\n1612#2:545\n1603#2,9:547\n1855#2:556\n1856#2:558\n1612#2:559\n1360#2:560\n1446#2,5:561\n1360#2:566\n1446#2,5:567\n857#2,2:573\n857#2,2:581\n857#2,2:588\n857#2,2:590\n857#2,2:592\n1620#2,3:594\n1603#2,9:597\n1855#2:606\n1856#2:608\n1612#2:609\n1#3:528\n1#3:529\n1#3:543\n1#3:557\n1#3:607\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n*L\n429#1:513\n432#1:517\n435#1:532\n438#1:546\n447#1:572\n447#1:575,5\n450#1:580\n450#1:583,5\n429#1:514,3\n432#1:518,9\n432#1:527\n432#1:530\n432#1:531\n435#1:533,9\n435#1:542\n435#1:544\n435#1:545\n438#1:547,9\n438#1:556\n438#1:558\n438#1:559\n441#1:560\n441#1:561,5\n444#1:566\n444#1:567,5\n447#1:573,2\n450#1:581,2\n473#1:588,2\n477#1:590,2\n492#1:592,2\n502#1:594,3\n508#1:597,9\n508#1:606\n508#1:608\n508#1:609\n432#1:529\n435#1:543\n438#1:557\n508#1:607\n*E\n"})
    public final class b implements a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ KProperty<Object>[] f81822o = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<ProtoBuf.Function> f81823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<ProtoBuf.Property> f81824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<ProtoBuf.TypeAlias> f81825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81829g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81830h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81831i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81832j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81833k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final NotNullLazyValue f81834l;

        @NotNull
        public final NotNullLazyValue m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ DeserializedMemberScope f81835n;

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        public static final class a extends Lambda implements Function0<List<? extends SimpleFunctionDescriptor>> {
            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends SimpleFunctionDescriptor> invoke() {
                b bVar = b.this;
                return CollectionsKt___CollectionsKt.plus((Collection) b.access$getDeclaredFunctions(bVar), (Iterable) b.access$computeAllNonDeclaredFunctions(bVar));
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        public static final class C0449b extends Lambda implements Function0<List<? extends PropertyDescriptor>> {
            public C0449b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends PropertyDescriptor> invoke() {
                b bVar = b.this;
                return CollectionsKt___CollectionsKt.plus((Collection) b.access$getDeclaredProperties(bVar), (Iterable) b.access$computeAllNonDeclaredProperties(bVar));
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        public static final class c extends Lambda implements Function0<List<? extends TypeAliasDescriptor>> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends TypeAliasDescriptor> invoke() {
                return b.access$computeTypeAliases(b.this);
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        public static final class d extends Lambda implements Function0<List<? extends SimpleFunctionDescriptor>> {
            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends SimpleFunctionDescriptor> invoke() {
                return b.access$computeFunctions(b.this);
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        public static final class e extends Lambda implements Function0<List<? extends PropertyDescriptor>> {
            public e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends PropertyDescriptor> invoke() {
                return b.access$computeProperties(b.this);
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$functionNames$2\n+ 2 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n502#2:513\n1620#3,3:514\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$functionNames$2\n*L\n421#1:513\n421#1:514,3\n*E\n"})
        public static final class f extends Lambda implements Function0<Set<? extends Name>> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ DeserializedMemberScope f81842q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(DeserializedMemberScope deserializedMemberScope) {
                super(0);
                this.f81842q0 = deserializedMemberScope;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                b bVar = b.this;
                List list = bVar.f81823a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                DeserializedMemberScope deserializedMemberScope = bVar.f81835n;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((ProtoBuf.Function) ((MessageLite) it.next())).getName()));
                }
                return x.plus((Set) linkedHashSet, (Iterable) this.f81842q0.getNonDeclaredFunctionNames());
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$functionsByName$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,512:1\n1477#2:513\n1502#2,3:514\n1505#2,3:524\n372#3,7:517\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$functionsByName$2\n*L\n415#1:513\n415#1:514,3\n415#1:524,3\n415#1:517,7\n*E\n"})
        public static final class g extends Lambda implements Function0<Map<Name, ? extends List<? extends SimpleFunctionDescriptor>>> {
            public g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<Name, ? extends List<? extends SimpleFunctionDescriptor>> invoke() {
                List listAccess$getAllFunctions = b.access$getAllFunctions(b.this);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listAccess$getAllFunctions) {
                    Name name = ((SimpleFunctionDescriptor) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    Object arrayList = linkedHashMap.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(name, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$propertiesByName$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,512:1\n1477#2:513\n1502#2,3:514\n1505#2,3:524\n372#3,7:517\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$propertiesByName$2\n*L\n418#1:513\n418#1:514,3\n418#1:524,3\n418#1:517,7\n*E\n"})
        public static final class h extends Lambda implements Function0<Map<Name, ? extends List<? extends PropertyDescriptor>>> {
            public h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<Name, ? extends List<? extends PropertyDescriptor>> invoke() {
                List listAccess$getAllProperties = b.access$getAllProperties(b.this);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listAccess$getAllProperties) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    Object arrayList = linkedHashMap.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(name, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n1194#2,2:513\n1222#2,4:515\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2\n*L\n412#1:513,2\n412#1:515,4\n*E\n"})
        public static final class i extends Lambda implements Function0<Map<Name, ? extends TypeAliasDescriptor>> {
            public i() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Map<Name, ? extends TypeAliasDescriptor> invoke() {
                List listAccess$getAllTypeAliases = b.access$getAllTypeAliases(b.this);
                LinkedHashMap linkedHashMap = new LinkedHashMap(androidx.camera.core.processing.f.a(listAccess$getAllTypeAliases, 10, 16));
                for (Object obj : listAccess$getAllTypeAliases) {
                    Name name = ((TypeAliasDescriptor) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: compiled from: DeserializedMemberScope.kt */
        @SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$variableNames$2\n+ 2 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n502#2:513\n1620#3,3:514\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$variableNames$2\n*L\n425#1:513\n425#1:514,3\n*E\n"})
        public static final class j extends Lambda implements Function0<Set<? extends Name>> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ DeserializedMemberScope f81847q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(DeserializedMemberScope deserializedMemberScope) {
                super(0);
                this.f81847q0 = deserializedMemberScope;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Set<? extends Name> invoke() {
                b bVar = b.this;
                List list = bVar.f81824b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                DeserializedMemberScope deserializedMemberScope = bVar.f81835n;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((ProtoBuf.Property) ((MessageLite) it.next())).getName()));
                }
                return x.plus((Set) linkedHashSet, (Iterable) this.f81847q0.getNonDeclaredVariableNames());
            }
        }

        public b(@NotNull DeserializedMemberScope deserializedMemberScope, @NotNull List<ProtoBuf.Function> functionList, @NotNull List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) {
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.f81835n = deserializedMemberScope;
            this.f81823a = functionList;
            this.f81824b = propertyList;
            this.f81825c = deserializedMemberScope.getC().getComponents().getConfiguration().getTypeAliasesAllowed() ? typeAliasList : CollectionsKt__CollectionsKt.emptyList();
            this.f81826d = deserializedMemberScope.getC().getStorageManager().createLazyValue(new d());
            this.f81827e = deserializedMemberScope.getC().getStorageManager().createLazyValue(new e());
            this.f81828f = deserializedMemberScope.getC().getStorageManager().createLazyValue(new c());
            this.f81829g = deserializedMemberScope.getC().getStorageManager().createLazyValue(new a());
            this.f81830h = deserializedMemberScope.getC().getStorageManager().createLazyValue(new C0449b());
            this.f81831i = deserializedMemberScope.getC().getStorageManager().createLazyValue(new i());
            this.f81832j = deserializedMemberScope.getC().getStorageManager().createLazyValue(new g());
            this.f81833k = deserializedMemberScope.getC().getStorageManager().createLazyValue(new h());
            this.f81834l = deserializedMemberScope.getC().getStorageManager().createLazyValue(new f(deserializedMemberScope));
            this.m = deserializedMemberScope.getC().getStorageManager().createLazyValue(new j(deserializedMemberScope));
        }

        public static final List access$computeAllNonDeclaredFunctions(b bVar) {
            DeserializedMemberScope deserializedMemberScope = bVar.f81835n;
            Set<Name> nonDeclaredFunctionNames = deserializedMemberScope.getNonDeclaredFunctionNames();
            ArrayList arrayList = new ArrayList();
            for (Name name : nonDeclaredFunctionNames) {
                List list = (List) StorageKt.getValue(bVar.f81826d, bVar, (KProperty<?>) f81822o[0]);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                        arrayList2.add(obj);
                    }
                }
                int size = arrayList2.size();
                deserializedMemberScope.computeNonDeclaredFunctions(name, arrayList2);
                bk.g.addAll(arrayList, arrayList2.subList(size, arrayList2.size()));
            }
            return arrayList;
        }

        public static final List access$computeAllNonDeclaredProperties(b bVar) {
            DeserializedMemberScope deserializedMemberScope = bVar.f81835n;
            Set<Name> nonDeclaredVariableNames = deserializedMemberScope.getNonDeclaredVariableNames();
            ArrayList arrayList = new ArrayList();
            for (Name name : nonDeclaredVariableNames) {
                List list = (List) StorageKt.getValue(bVar.f81827e, bVar, (KProperty<?>) f81822o[1]);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.areEqual(((DeclarationDescriptor) obj).getName(), name)) {
                        arrayList2.add(obj);
                    }
                }
                int size = arrayList2.size();
                deserializedMemberScope.computeNonDeclaredProperties(name, arrayList2);
                bk.g.addAll(arrayList, arrayList2.subList(size, arrayList2.size()));
            }
            return arrayList;
        }

        public static final List access$computeFunctions(b bVar) {
            List<ProtoBuf.Function> list = bVar.f81823a;
            ArrayList arrayList = new ArrayList();
            for (MessageLite messageLite : list) {
                DeserializedMemberScope deserializedMemberScope = bVar.f81835n;
                SimpleFunctionDescriptor simpleFunctionDescriptorLoadFunction = deserializedMemberScope.getC().getMemberDeserializer().loadFunction((ProtoBuf.Function) messageLite);
                if (!deserializedMemberScope.isDeclaredFunctionAvailable(simpleFunctionDescriptorLoadFunction)) {
                    simpleFunctionDescriptorLoadFunction = null;
                }
                if (simpleFunctionDescriptorLoadFunction != null) {
                    arrayList.add(simpleFunctionDescriptorLoadFunction);
                }
            }
            return arrayList;
        }

        public static final List access$computeProperties(b bVar) {
            List<ProtoBuf.Property> list = bVar.f81824b;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                PropertyDescriptor propertyDescriptorLoadProperty = bVar.f81835n.getC().getMemberDeserializer().loadProperty((ProtoBuf.Property) ((MessageLite) it.next()));
                if (propertyDescriptorLoadProperty != null) {
                    arrayList.add(propertyDescriptorLoadProperty);
                }
            }
            return arrayList;
        }

        public static final List access$computeTypeAliases(b bVar) {
            List<ProtoBuf.TypeAlias> list = bVar.f81825c;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeAliasDescriptor typeAliasDescriptorLoadTypeAlias = bVar.f81835n.getC().getMemberDeserializer().loadTypeAlias((ProtoBuf.TypeAlias) ((MessageLite) it.next()));
                if (typeAliasDescriptorLoadTypeAlias != null) {
                    arrayList.add(typeAliasDescriptorLoadTypeAlias);
                }
            }
            return arrayList;
        }

        public static final List access$getAllFunctions(b bVar) {
            bVar.getClass();
            return (List) StorageKt.getValue(bVar.f81829g, bVar, (KProperty<?>) f81822o[3]);
        }

        public static final List access$getAllProperties(b bVar) {
            bVar.getClass();
            return (List) StorageKt.getValue(bVar.f81830h, bVar, (KProperty<?>) f81822o[4]);
        }

        public static final List access$getAllTypeAliases(b bVar) {
            bVar.getClass();
            return (List) StorageKt.getValue(bVar.f81828f, bVar, (KProperty<?>) f81822o[2]);
        }

        public static final List access$getDeclaredFunctions(b bVar) {
            bVar.getClass();
            return (List) StorageKt.getValue(bVar.f81826d, bVar, (KProperty<?>) f81822o[0]);
        }

        public static final List access$getDeclaredProperties(b bVar) {
            bVar.getClass();
            return (List) StorageKt.getValue(bVar.f81827e, bVar, (KProperty<?>) f81822o[1]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public void addFunctionsAndPropertiesTo(@NotNull Collection<DeclarationDescriptor> result, @NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            boolean zAcceptsKinds = kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK());
            KProperty<Object>[] kPropertyArr = f81822o;
            if (zAcceptsKinds) {
                for (Object obj : (List) StorageKt.getValue(this.f81830h, this, (KProperty<?>) kPropertyArr[4])) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
                for (Object obj2 : (List) StorageKt.getValue(this.f81829g, this, (KProperty<?>) kPropertyArr[3])) {
                    Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!getFunctionNames().contains(name)) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            Collection<SimpleFunctionDescriptor> collection = (Collection) ((Map) StorageKt.getValue(this.f81832j, this, (KProperty<?>) f81822o[6])).get(name);
            return collection == null ? CollectionsKt__CollectionsKt.emptyList() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!getVariableNames().contains(name)) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            Collection<PropertyDescriptor> collection = (Collection) ((Map) StorageKt.getValue(this.f81833k, this, (KProperty<?>) f81822o[7])).get(name);
            return collection == null ? CollectionsKt__CollectionsKt.emptyList() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> getFunctionNames() {
            return (Set) StorageKt.getValue(this.f81834l, this, (KProperty<?>) f81822o[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @Nullable
        public TypeAliasDescriptor getTypeAliasByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return (TypeAliasDescriptor) ((Map) StorageKt.getValue(this.f81831i, this, (KProperty<?>) f81822o[5])).get(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> getTypeAliasNames() {
            List<ProtoBuf.TypeAlias> list = this.f81825c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.getName(this.f81835n.getC().getNameResolver(), ((ProtoBuf.TypeAlias) ((MessageLite) it.next())).getName()));
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        @NotNull
        public Set<Name> getVariableNames() {
            return (Set) StorageKt.getValue(this.m, this, (KProperty<?>) f81822o[9]);
        }
    }

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    public static final class c extends Lambda implements Function0<Set<? extends Name>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Collection<Name>> f81848p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<? extends Collection<Name>> function0) {
            super(0);
            this.f81848p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Set<? extends Name> invoke() {
            return CollectionsKt___CollectionsKt.toSet(this.f81848p0.invoke());
        }
    }

    /* JADX INFO: compiled from: DeserializedMemberScope.kt */
    public static final class d extends Lambda implements Function0<Set<? extends Name>> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Set<? extends Name> invoke() {
            DeserializedMemberScope deserializedMemberScope = DeserializedMemberScope.this;
            Set<Name> nonDeclaredClassifierNames = deserializedMemberScope.getNonDeclaredClassifierNames();
            if (nonDeclaredClassifierNames == null) {
                return null;
            }
            return x.plus(x.plus((Set) deserializedMemberScope.getClassNames$deserialization(), (Iterable) deserializedMemberScope.f81799b.getTypeAliasNames()), (Iterable) nonDeclaredClassifierNames);
        }
    }

    public DeserializedMemberScope(@NotNull DeserializationContext c10, @NotNull List<ProtoBuf.Function> functionList, @NotNull List<ProtoBuf.Property> propertyList, @NotNull List<ProtoBuf.TypeAlias> typeAliasList, @NotNull Function0<? extends Collection<Name>> classNames) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        this.f81798a = c10;
        this.f81799b = c10.getComponents().getConfiguration().getPreserveDeclarationsOrdering() ? new b(this, functionList, propertyList, typeAliasList) : new OptimizedImplementation(this, functionList, propertyList, typeAliasList);
        this.f81800c = c10.getStorageManager().createLazyValue(new c(classNames));
        this.f81801d = c10.getStorageManager().createNullableLazyValue(new d());
    }

    public abstract void addEnumEntryDescriptors(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    public final Collection<DeclarationDescriptor> computeDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (kindFilter.acceptsKinds(companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, nameFilter);
        }
        a aVar = this.f81799b;
        aVar.addFunctionsAndPropertiesTo(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.acceptsKinds(companion.getCLASSIFIERS_MASK())) {
            for (Name name : getClassNames$deserialization()) {
                if (nameFilter.invoke(name).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList, this.f81798a.getComponents().deserializeClass(createClassId(name)));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK())) {
            for (Name name2 : aVar.getTypeAliasNames()) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList, aVar.getTypeAliasByName(name2));
                }
            }
        }
        return CollectionsKt.compact(arrayList);
    }

    public void computeNonDeclaredFunctions(@NotNull Name name, @NotNull List<SimpleFunctionDescriptor> functions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
    }

    public void computeNonDeclaredProperties(@NotNull Name name, @NotNull List<PropertyDescriptor> descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
    }

    @NotNull
    public abstract ClassId createClassId(@NotNull Name name);

    @NotNull
    public final DeserializationContext getC() {
        return this.f81798a;
    }

    @NotNull
    public final Set<Name> getClassNames$deserialization() {
        return (Set) StorageKt.getValue(this.f81800c, this, (KProperty<?>) f81797e[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        return (Set) StorageKt.getValue(this.f81801d, this, (KProperty<?>) f81797e[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo5779getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (hasClass(name)) {
            return this.f81798a.getComponents().deserializeClass(createClassId(name));
        }
        a aVar = this.f81799b;
        if (aVar.getTypeAliasNames().contains(name)) {
            return aVar.getTypeAliasByName(name);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f81799b.getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f81799b.getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return this.f81799b.getFunctionNames();
    }

    @Nullable
    public abstract Set<Name> getNonDeclaredClassifierNames();

    @NotNull
    public abstract Set<Name> getNonDeclaredFunctionNames();

    @NotNull
    public abstract Set<Name> getNonDeclaredVariableNames();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return this.f81799b.getVariableNames();
    }

    public boolean hasClass(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getClassNames$deserialization().contains(name);
    }

    public boolean isDeclaredFunctionAvailable(@NotNull SimpleFunctionDescriptor function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return true;
    }
}
