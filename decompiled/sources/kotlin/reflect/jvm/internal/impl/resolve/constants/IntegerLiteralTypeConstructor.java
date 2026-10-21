package kotlin.reflect.jvm.internal.impl.resolve.constants;

import bk.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1726#2,3:182\n1747#2,3:185\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n*L\n132#1:182,3\n176#1:185,3\n*E\n"})
public final class IntegerLiteralTypeConstructor implements TypeConstructor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ModuleDescriptor f81548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Set<KotlinType> f81549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SimpleType f81550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f81551e;

    /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
    @SourceDebugExtension({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n2661#2,7:182\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n*L\n40#1:182,7\n*E\n"})
    public static final class Companion {

        /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
        public static final class a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a COMMON_SUPER_TYPE;
            public static final a INTERSECTION_TYPE;

            static {
                a aVar = new a("COMMON_SUPER_TYPE", 0);
                COMMON_SUPER_TYPE = aVar;
                a aVar2 = new a("INTERSECTION_TYPE", 1);
                INTERSECTION_TYPE = aVar2;
                a[] aVarArr = {aVar, aVar2};
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

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v17, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v1 */
        @Nullable
        public final SimpleType findIntersectionType(@NotNull Collection<? extends SimpleType> types) {
            Set setIntersect;
            Intrinsics.checkNotNullParameter(types, "types");
            a aVar = a.INTERSECTION_TYPE;
            if (types.isEmpty()) {
                return null;
            }
            Iterator it = types.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            ?? next = it.next();
            while (it.hasNext()) {
                SimpleType simpleType = (SimpleType) it.next();
                next = (SimpleType) next;
                IntegerLiteralTypeConstructor.Companion.getClass();
                if (next != 0 && simpleType != null) {
                    TypeConstructor constructor = next.getConstructor();
                    TypeConstructor constructor2 = simpleType.getConstructor();
                    boolean z10 = constructor instanceof IntegerLiteralTypeConstructor;
                    if (z10 && (constructor2 instanceof IntegerLiteralTypeConstructor)) {
                        IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) constructor;
                        IntegerLiteralTypeConstructor integerLiteralTypeConstructor2 = (IntegerLiteralTypeConstructor) constructor2;
                        int i10 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
                        if (i10 == 1) {
                            setIntersect = CollectionsKt___CollectionsKt.intersect(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
                        } else {
                            if (i10 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            setIntersect = CollectionsKt___CollectionsKt.union(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
                        }
                        next = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f81547a, integerLiteralTypeConstructor.f81548b, setIntersect, null), false);
                    } else if (z10) {
                        if (!((IntegerLiteralTypeConstructor) constructor).getPossibleTypes().contains(simpleType)) {
                            simpleType = null;
                        }
                        next = simpleType;
                    } else if (!(constructor2 instanceof IntegerLiteralTypeConstructor) || !((IntegerLiteralTypeConstructor) constructor2).getPossibleTypes().contains(next)) {
                    }
                }
                next = 0;
            }
            return (SimpleType) next;
        }
    }

    /* JADX INFO: compiled from: IntegerLiteralTypeConstructor.kt */
    public static final class a extends Lambda implements Function0<List<SimpleType>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<SimpleType> invoke() {
            IntegerLiteralTypeConstructor integerLiteralTypeConstructor = IntegerLiteralTypeConstructor.this;
            SimpleType defaultType = integerLiteralTypeConstructor.getBuiltIns().getComparable().getDefaultType();
            Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
            List<SimpleType> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(TypeSubstitutionKt.replace$default(defaultType, d.listOf(new TypeProjectionImpl(Variance.IN_VARIANCE, integerLiteralTypeConstructor.f81550d)), null, 2, null));
            if (!IntegerLiteralTypeConstructor.access$isContainsOnlyUnsignedTypes(integerLiteralTypeConstructor)) {
                listMutableListOf.add(integerLiteralTypeConstructor.getBuiltIns().getNumberType());
            }
            return listMutableListOf;
        }
    }

    public IntegerLiteralTypeConstructor() {
        throw null;
    }

    public IntegerLiteralTypeConstructor(long j10, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this.f81550d = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), this, false);
        this.f81551e = LazyKt__LazyJVMKt.lazy(new a());
        this.f81547a = j10;
        this.f81548b = moduleDescriptor;
        this.f81549c = set;
    }

    public static final boolean access$isContainsOnlyUnsignedTypes(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        Collection<KotlinType> allSignedLiteralTypes = PrimitiveTypeUtilKt.getAllSignedLiteralTypes(integerLiteralTypeConstructor.f81548b);
        if ((allSignedLiteralTypes instanceof Collection) && allSignedLiteralTypes.isEmpty()) {
            return true;
        }
        Iterator<T> it = allSignedLiteralTypes.iterator();
        while (it.hasNext()) {
            if (!(!integerLiteralTypeConstructor.f81549c.contains((KotlinType) it.next()))) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.f81548b.getBuiltIns();
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

    @NotNull
    public final Set<KotlinType> getPossibleTypes() {
        return this.f81549c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public Collection<KotlinType> getSupertypes() {
        return (List) this.f81551e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append(Constant.BRACKET_OPEN + CollectionsKt___CollectionsKt.joinToString$default(this.f81549c, ",", null, null, 0, null, el.a.f68365p0, 30, null) + AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }
}
