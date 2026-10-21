package kotlin.reflect.jvm.internal.impl.types.checker;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeProjection f82014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function0<? extends List<? extends UnwrappedType>> f82015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final NewCapturedTypeConstructor f82016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TypeParameterDescriptor f82017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f82018e;

    /* JADX INFO: compiled from: NewCapturedType.kt */
    public static final class a extends Lambda implements Function0<List<? extends UnwrappedType>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<UnwrappedType> f82019p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends UnwrappedType> list) {
            super(0);
            this.f82019p0 = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends UnwrappedType> invoke() {
            return this.f82019p0;
        }
    }

    /* JADX INFO: compiled from: NewCapturedType.kt */
    public static final class b extends Lambda implements Function0<List<? extends UnwrappedType>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends UnwrappedType> invoke() {
            Function0 function0 = NewCapturedTypeConstructor.this.f82015b;
            if (function0 != null) {
                return (List) function0.invoke();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: NewCapturedType.kt */
    public static final class c extends Lambda implements Function0<List<? extends UnwrappedType>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<UnwrappedType> f82021p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends UnwrappedType> list) {
            super(0);
            this.f82021p0 = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends UnwrappedType> invoke() {
            return this.f82021p0;
        }
    }

    /* JADX INFO: compiled from: NewCapturedType.kt */
    @SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeConstructor$refine$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1549#2:291\n1620#2,3:292\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeConstructor$refine$1$1\n*L\n271#1:291\n271#1:292,3\n*E\n"})
    public static final class d extends Lambda implements Function0<List<? extends UnwrappedType>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ KotlinTypeRefiner f82023q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(KotlinTypeRefiner kotlinTypeRefiner) {
            super(0);
            this.f82023q0 = kotlinTypeRefiner;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends UnwrappedType> invoke() {
            List<UnwrappedType> supertypes = NewCapturedTypeConstructor.this.getSupertypes();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes, 10));
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(((UnwrappedType) it.next()).refine(this.f82023q0));
            }
            return arrayList;
        }
    }

    public NewCapturedTypeConstructor(@NotNull TypeProjection projection, @Nullable Function0<? extends List<? extends UnwrappedType>> function0, @Nullable NewCapturedTypeConstructor newCapturedTypeConstructor, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f82014a = projection;
        this.f82015b = function0;
        this.f82016c = newCapturedTypeConstructor;
        this.f82017d = typeParameterDescriptor;
        this.f82018e = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(NewCapturedTypeConstructor.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f82016c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f82016c;
        if (newCapturedTypeConstructor3 != null) {
            newCapturedTypeConstructor = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == newCapturedTypeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinType type = getProjection().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return TypeUtilsKt.getBuiltIns(type);
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

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    @NotNull
    public TypeProjection getProjection() {
        return this.f82014a;
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f82016c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    public final void initializeSupertypes(@NotNull List<? extends UnwrappedType> supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        this.f82015b = new c(supertypes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @NotNull
    public String toString() {
        return "CapturedType(" + getProjection() + RootService.CLOSE_BRACKET;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<UnwrappedType> getSupertypes() {
        List<UnwrappedType> list = (List) this.f82018e.getValue();
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public NewCapturedTypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = getProjection().refine(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(typeProjectionRefine, "refine(...)");
        d dVar = this.f82015b != null ? new d(kotlinTypeRefiner) : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f82016c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(typeProjectionRefine, dVar, newCapturedTypeConstructor, this.f82017d);
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, Function0 function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i10 & 2) != 0 ? null : function0, (i10 & 4) != 0 ? null : newCapturedTypeConstructor, (i10 & 8) != 0 ? null : typeParameterDescriptor);
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, list, (i10 & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(@NotNull TypeProjection projection, @NotNull List<? extends UnwrappedType> supertypes, @Nullable NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(projection, new a(supertypes), newCapturedTypeConstructor, null, 8, null);
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
    }
}
