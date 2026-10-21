package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StaticScopeForKotlinEnum.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nStaticScopeForKotlinEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticScopeForKotlinEnum.kt\norg/jetbrains/kotlin/resolve/scopes/StaticScopeForKotlinEnum\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1#2:69\n857#3,2:70\n857#3,2:72\n*S KotlinDebug\n*F\n+ 1 StaticScopeForKotlinEnum.kt\norg/jetbrains/kotlin/resolve/scopes/StaticScopeForKotlinEnum\n*L\n59#1:70,2\n62#1:72,2\n*E\n"})
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f81600e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StaticScopeForKotlinEnum.class), LogKeysKt.PROPERTIES, "getProperties()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClassDescriptor f81601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f81603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f81604d;

    /* JADX INFO: compiled from: StaticScopeForKotlinEnum.kt */
    public static final class a extends Lambda implements Function0<List<? extends SimpleFunctionDescriptor>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends SimpleFunctionDescriptor> invoke() {
            StaticScopeForKotlinEnum staticScopeForKotlinEnum = StaticScopeForKotlinEnum.this;
            return CollectionsKt__CollectionsKt.listOf((Object[]) new SimpleFunctionDescriptor[]{DescriptorFactory.createEnumValueOfMethod(staticScopeForKotlinEnum.f81601a), DescriptorFactory.createEnumValuesMethod(staticScopeForKotlinEnum.f81601a)});
        }
    }

    /* JADX INFO: compiled from: StaticScopeForKotlinEnum.kt */
    public static final class b extends Lambda implements Function0<List<? extends PropertyDescriptor>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends PropertyDescriptor> invoke() {
            StaticScopeForKotlinEnum staticScopeForKotlinEnum = StaticScopeForKotlinEnum.this;
            return staticScopeForKotlinEnum.f81602b ? CollectionsKt__CollectionsKt.listOfNotNull(DescriptorFactory.createEnumEntriesProperty(staticScopeForKotlinEnum.f81601a)) : CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public StaticScopeForKotlinEnum(@NotNull StorageManager storageManager, @NotNull ClassDescriptor containingClass, boolean z10) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f81601a = containingClass;
        this.f81602b = z10;
        containingClass.getKind();
        ClassKind classKind = ClassKind.CLASS;
        this.f81603c = storageManager.createLazyValue(new a());
        this.f81604d = storageManager.createLazyValue(new b());
    }

    @Nullable
    public Void getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public /* bridge */ /* synthetic */ Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        return getContributedDescriptors(descriptorKindFilter, (Function1<? super Name, Boolean>) function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) StorageKt.getValue(this.f81604d, this, (KProperty<?>) f81600e[1]);
        SmartList smartList = new SmartList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo5779getContributedClassifier(Name name, LookupLocation lookupLocation) {
        return (ClassifierDescriptor) getContributedClassifier(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public List<CallableMemberDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        KProperty<Object>[] kPropertyArr = f81600e;
        return CollectionsKt___CollectionsKt.plus((Collection) StorageKt.getValue(this.f81603c, this, (KProperty<?>) kPropertyArr[0]), (Iterable) StorageKt.getValue(this.f81604d, this, (KProperty<?>) kPropertyArr[1]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public SmartList<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) StorageKt.getValue(this.f81603c, this, (KProperty<?>) f81600e[0]);
        SmartList<SimpleFunctionDescriptor> smartList = new SmartList<>();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }
}
