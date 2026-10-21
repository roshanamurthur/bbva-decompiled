package kotlin.reflect.jvm.internal.impl.types;

import dk.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntersectionTypeConstructor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nIntersectionTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,120:1\n1#2:121\n1045#3:122\n1549#3:129\n1620#3,2:130\n1622#3:138\n98#4,6:123\n104#4:132\n105#4,4:134\n112#4,7:139\n99#5:133\n*S KotlinDebug\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n*L\n66#1:122\n89#1:129\n89#1:130,2\n89#1:138\n89#1:123,6\n89#1:132\n89#1:134,4\n89#1:139,7\n89#1:133\n*E\n"})
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public KotlinType f81924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<KotlinType> f81925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81926c;

    /* JADX INFO: compiled from: IntersectionTypeConstructor.kt */
    public static final class a extends Lambda implements Function1<KotlinTypeRefiner, SimpleType> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return IntersectionTypeConstructor.this.refine(kotlinTypeRefiner).createType();
        }
    }

    /* JADX INFO: compiled from: IntersectionTypeConstructor.kt */
    public static final class b extends Lambda implements Function1<KotlinType, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f81928p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final String invoke(@NotNull KotlinType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* JADX INFO: compiled from: IntersectionTypeConstructor.kt */
    public static final class c extends Lambda implements Function1<KotlinType, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<KotlinType, Object> f81929p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super KotlinType, ? extends Object> function1) {
            super(1);
            this.f81929p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(KotlinType kotlinType) {
            Intrinsics.checkNotNull(kotlinType);
            return this.f81929p0.invoke(kotlinType).toString();
        }
    }

    public IntersectionTypeConstructor() {
        throw null;
    }

    public IntersectionTypeConstructor(@NotNull Collection<? extends KotlinType> typesToIntersect) {
        Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<KotlinType> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f81925b = linkedHashSet;
        this.f81926c = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String makeDebugNameForIntersectionType$default(IntersectionTypeConstructor intersectionTypeConstructor, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = b.f81928p0;
        }
        return intersectionTypeConstructor.makeDebugNameForIntersectionType(function1);
    }

    @NotNull
    public final MemberScope createScopeForKotlinType() {
        return TypeIntersectionScope.Companion.create("member scope for intersection type", this.f81925b);
    }

    @NotNull
    public final SimpleType createType() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this, CollectionsKt__CollectionsKt.emptyList(), false, createScopeForKotlinType(), new a());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return Intrinsics.areEqual(this.f81925b, ((IntersectionTypeConstructor) obj).f81925b);
        }
        return false;
    }

    @Nullable
    public final KotlinType getAlternativeType() {
        return this.f81924a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = this.f81925b.iterator().next().getConstructor().getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @Nullable
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo5778getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public Collection<KotlinType> getSupertypes() {
        return this.f81925b;
    }

    public int hashCode() {
        return this.f81926c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @NotNull
    public final String makeDebugNameForIntersectionType(@NotNull final Function1<? super KotlinType, ? extends Object> getProperTypeRelatedToStringify) {
        Intrinsics.checkNotNullParameter(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.sortedWith(this.f81925b, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                KotlinType kotlinType = (KotlinType) t10;
                Intrinsics.checkNotNull(kotlinType);
                Function1 function1 = getProperTypeRelatedToStringify;
                String string = function1.invoke(kotlinType).toString();
                KotlinType kotlinType2 = (KotlinType) t11;
                Intrinsics.checkNotNull(kotlinType2);
                return e.compareValues(string, function1.invoke(kotlinType2).toString());
            }
        }), " & ", "{", "}", 0, null, new c(getProperTypeRelatedToStringify), 24, null);
    }

    @NotNull
    public final IntersectionTypeConstructor setAlternative(@Nullable KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructor = new IntersectionTypeConstructor(this.f81925b);
        intersectionTypeConstructor.f81924a = kotlinType;
        return intersectionTypeConstructor;
    }

    @NotNull
    public String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public IntersectionTypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<KotlinType> supertypes = getSupertypes();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes, 10));
        Iterator<T> it = supertypes.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).refine(kotlinTypeRefiner));
            z10 = true;
        }
        IntersectionTypeConstructor alternative = null;
        if (z10) {
            KotlinType alternativeType = getAlternativeType();
            alternative = new IntersectionTypeConstructor(arrayList).setAlternative(alternativeType != null ? alternativeType.refine(kotlinTypeRefiner) : null);
        }
        return alternative == null ? this : alternative;
    }
}
