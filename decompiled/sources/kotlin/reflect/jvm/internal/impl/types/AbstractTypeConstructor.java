package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractTypeConstructor.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue<b> f81884b;

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    public final class a implements TypeConstructor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final KotlinTypeRefiner f81885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Lazy f81886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractTypeConstructor f81887c;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
        public static final class C0450a extends Lambda implements Function0<List<? extends KotlinType>> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ AbstractTypeConstructor f81889q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0450a(AbstractTypeConstructor abstractTypeConstructor) {
                super(0);
                this.f81889q0 = abstractTypeConstructor;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends KotlinType> invoke() {
                return KotlinTypeRefinerKt.refineTypes(a.this.f81885a, this.f81889q0.getSupertypes());
            }
        }

        public a(@NotNull AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f81887c = abstractTypeConstructor;
            this.f81885a = kotlinTypeRefiner;
            this.f81886b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new C0450a(abstractTypeConstructor));
        }

        public boolean equals(@Nullable Object obj) {
            return this.f81887c.equals(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = this.f81887c.getBuiltIns();
            Intrinsics.checkNotNullExpressionValue(builtIns, "getBuiltIns(...)");
            return builtIns;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public ClassifierDescriptor mo5778getDeclarationDescriptor() {
            return this.f81887c.mo5778getDeclarationDescriptor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.f81887c.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f81887c.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return this.f81887c.isDenotable();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f81887c.refine(kotlinTypeRefiner);
        }

        @NotNull
        public String toString() {
            return this.f81887c.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<KotlinType> getSupertypes() {
            return (List) this.f81886b.getValue();
        }
    }

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Collection<KotlinType> f81890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public List<? extends KotlinType> f81891b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Collection<? extends KotlinType> allSupertypes) {
            Intrinsics.checkNotNullParameter(allSupertypes, "allSupertypes");
            this.f81890a = allSupertypes;
            this.f81891b = bk.d.listOf(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes());
        }

        @NotNull
        public final Collection<KotlinType> getAllSupertypes() {
            return this.f81890a;
        }

        @NotNull
        public final List<KotlinType> getSupertypesWithoutCycles() {
            return this.f81891b;
        }

        public final void setSupertypesWithoutCycles(@NotNull List<? extends KotlinType> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f81891b = list;
        }
    }

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    public static final class c extends Lambda implements Function0<b> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final b invoke() {
            return new b(AbstractTypeConstructor.this.computeSupertypes());
        }
    }

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    public static final class d extends Lambda implements Function1<Boolean, b> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f81893p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ b invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }

        @NotNull
        public final b invoke(boolean z10) {
            return new b(bk.d.listOf(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
        }
    }

    /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
    @SourceDebugExtension({"SMAP\nAbstractTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeConstructor.kt\norg/jetbrains/kotlin/types/AbstractTypeConstructor$supertypes$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static final class e extends Lambda implements Function1<b, Unit> {

        /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
        public static final class a extends Lambda implements Function1<TypeConstructor, Iterable<? extends KotlinType>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AbstractTypeConstructor f81895p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractTypeConstructor abstractTypeConstructor) {
                super(1);
                this.f81895p0 = abstractTypeConstructor;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Iterable<KotlinType> invoke(@NotNull TypeConstructor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractTypeConstructor.access$computeNeighbours(this.f81895p0, it, true);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
        public static final class b extends Lambda implements Function1<KotlinType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AbstractTypeConstructor f81896p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractTypeConstructor abstractTypeConstructor) {
                super(1);
                this.f81896p0 = abstractTypeConstructor;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KotlinType kotlinType) {
                invoke2(kotlinType);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KotlinType it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f81896p0.reportScopesLoopError(it);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
        public static final class c extends Lambda implements Function1<TypeConstructor, Iterable<? extends KotlinType>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AbstractTypeConstructor f81897p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractTypeConstructor abstractTypeConstructor) {
                super(1);
                this.f81897p0 = abstractTypeConstructor;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Iterable<KotlinType> invoke(@NotNull TypeConstructor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractTypeConstructor.access$computeNeighbours(this.f81897p0, it, false);
            }
        }

        /* JADX INFO: compiled from: AbstractTypeConstructor.kt */
        public static final class d extends Lambda implements Function1<KotlinType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ AbstractTypeConstructor f81898p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(AbstractTypeConstructor abstractTypeConstructor) {
                super(1);
                this.f81898p0 = abstractTypeConstructor;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KotlinType kotlinType) {
                invoke2(kotlinType);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull KotlinType it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f81898p0.reportSupertypeLoopError(it);
            }
        }

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
            invoke2(bVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull b supertypes) {
            Intrinsics.checkNotNullParameter(supertypes, "supertypes");
            AbstractTypeConstructor abstractTypeConstructor = AbstractTypeConstructor.this;
            List listFindLoopsInSupertypesAndDisconnect = abstractTypeConstructor.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, supertypes.getAllSupertypes(), new c(abstractTypeConstructor), new d(abstractTypeConstructor));
            if (listFindLoopsInSupertypesAndDisconnect.isEmpty()) {
                KotlinType kotlinTypeDefaultSupertypeIfEmpty = abstractTypeConstructor.defaultSupertypeIfEmpty();
                List listListOf = kotlinTypeDefaultSupertypeIfEmpty != null ? bk.d.listOf(kotlinTypeDefaultSupertypeIfEmpty) : null;
                if (listListOf == null) {
                    listListOf = CollectionsKt__CollectionsKt.emptyList();
                }
                listFindLoopsInSupertypesAndDisconnect = listListOf;
            }
            if (abstractTypeConstructor.getShouldReportCyclicScopeWithCompanionWarning()) {
                abstractTypeConstructor.getSupertypeLoopChecker().findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, listFindLoopsInSupertypesAndDisconnect, new a(abstractTypeConstructor), new b(abstractTypeConstructor));
            }
            List<KotlinType> list = listFindLoopsInSupertypesAndDisconnect instanceof List ? (List) listFindLoopsInSupertypesAndDisconnect : null;
            if (list == null) {
                list = CollectionsKt___CollectionsKt.toList(listFindLoopsInSupertypesAndDisconnect);
            }
            supertypes.setSupertypesWithoutCycles(abstractTypeConstructor.processSupertypesWithoutCycles(list));
        }
    }

    public AbstractTypeConstructor(@NotNull StorageManager storageManager) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f81884b = storageManager.createLazyValueWithPostCompute(new c(), d.f81893p0, new e());
    }

    public static final Collection access$computeNeighbours(AbstractTypeConstructor abstractTypeConstructor, TypeConstructor typeConstructor, boolean z10) {
        List listPlus;
        abstractTypeConstructor.getClass();
        AbstractTypeConstructor abstractTypeConstructor2 = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
        if (abstractTypeConstructor2 != null && (listPlus = CollectionsKt___CollectionsKt.plus((Collection) abstractTypeConstructor2.f81884b.invoke().getAllSupertypes(), (Iterable) abstractTypeConstructor2.getAdditionalNeighboursInSupertypeGraph(z10))) != null) {
            return listPlus;
        }
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        return supertypes;
    }

    @NotNull
    public abstract Collection<KotlinType> computeSupertypes();

    @Nullable
    public KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    @NotNull
    public Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z10) {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return false;
    }

    @NotNull
    public abstract SupertypeLoopChecker getSupertypeLoopChecker();

    @NotNull
    public List<KotlinType> processSupertypesWithoutCycles(@NotNull List<KotlinType> supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        return supertypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    public void reportScopesLoopError(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    public void reportSupertypeLoopError(@NotNull KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<KotlinType> getSupertypes() {
        return this.f81884b.invoke().getSupertypesWithoutCycles();
    }
}
