package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SubstitutingScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSubstitutingScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n372#2,3:112\n375#2,4:116\n19#3:115\n1#4:120\n*S KotlinDebug\n*F\n+ 1 SubstitutingScope.kt\norg/jetbrains/kotlin/resolve/scopes/SubstitutingScope\n*L\n52#1:112,3\n52#1:116,4\n54#1:115\n*E\n"})
public final class SubstitutingScope implements MemberScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MemberScope f81607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f81608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TypeSubstitutor f81609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public HashMap f81610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f81611e;

    /* JADX INFO: compiled from: SubstitutingScope.kt */
    public static final class a extends Lambda implements Function0<Collection<? extends DeclarationDescriptor>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Collection<? extends DeclarationDescriptor> invoke() {
            SubstitutingScope substitutingScope = SubstitutingScope.this;
            return substitutingScope.a(ResolutionScope.DefaultImpls.getContributedDescriptors$default(substitutingScope.f81607a, null, null, 3, null));
        }
    }

    /* JADX INFO: compiled from: SubstitutingScope.kt */
    public static final class b extends Lambda implements Function0<TypeSubstitutor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TypeSubstitutor f81613p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TypeSubstitutor typeSubstitutor) {
            super(0);
            this.f81613p0 = typeSubstitutor;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TypeSubstitutor invoke() {
            return this.f81613p0.getSubstitution().buildSubstitutor();
        }
    }

    public SubstitutingScope(@NotNull MemberScope workerScope, @NotNull TypeSubstitutor givenSubstitutor) {
        Intrinsics.checkNotNullParameter(workerScope, "workerScope");
        Intrinsics.checkNotNullParameter(givenSubstitutor, "givenSubstitutor");
        this.f81607a = workerScope;
        this.f81608b = LazyKt__LazyJVMKt.lazy(new b(givenSubstitutor));
        TypeSubstitution substitution = givenSubstitutor.getSubstitution();
        Intrinsics.checkNotNullExpressionValue(substitution, "getSubstitution(...)");
        this.f81609c = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
        this.f81611e = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends DeclarationDescriptor> Collection<D> a(Collection<? extends D> collection) {
        if (this.f81609c.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetNewLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetNewLinkedHashSetWithExpectedSize.add(b((DeclarationDescriptor) it.next()));
        }
        return linkedHashSetNewLinkedHashSetWithExpectedSize;
    }

    public final <D extends DeclarationDescriptor> D b(D d2) {
        TypeSubstitutor typeSubstitutor = this.f81609c;
        if (typeSubstitutor.isEmpty()) {
            return d2;
        }
        if (this.f81610d == null) {
            this.f81610d = new HashMap();
        }
        HashMap map = this.f81610d;
        Intrinsics.checkNotNull(map);
        Object objSubstitute = map.get(d2);
        if (objSubstitute == null) {
            if (!(d2 instanceof Substitutable)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d2).toString());
            }
            objSubstitute = ((Substitutable) d2).substitute(typeSubstitutor);
            if (objSubstitute == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d2 + " substitution fails");
            }
            map.put(d2, objSubstitute);
        }
        D d3 = (D) objSubstitute;
        Intrinsics.checkNotNull(d3, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        return this.f81607a.getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo5779getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        ClassifierDescriptor classifierDescriptorMo5779getContributedClassifier = this.f81607a.mo5779getContributedClassifier(name, location);
        if (classifierDescriptorMo5779getContributedClassifier != null) {
            return (ClassifierDescriptor) b(classifierDescriptorMo5779getContributedClassifier);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f81611e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return a(this.f81607a.getContributedFunctions(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<? extends PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return a(this.f81607a.getContributedVariables(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return this.f81607a.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return this.f81607a.getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo5783recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        MemberScope.DefaultImpls.recordLookup(this, name, lookupLocation);
    }
}
