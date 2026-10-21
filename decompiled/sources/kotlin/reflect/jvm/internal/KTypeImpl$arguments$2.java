package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KTypeImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nKTypeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl$arguments$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1559#2:137\n1590#2,4:138\n*S KotlinDebug\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl$arguments$2\n*L\n81#1:137\n81#1:138,4\n*E\n"})
public final class KTypeImpl$arguments$2 extends Lambda implements Function0<List<? extends KTypeProjection>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ KTypeImpl f80018p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Type> f80019q0;

    /* JADX INFO: compiled from: KTypeImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: KTypeImpl.kt */
    public static final class a extends Lambda implements Function0<Type> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KTypeImpl f80020p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f80021q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Lazy<List<Type>> f80022r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(KTypeImpl kTypeImpl, int i10, Lazy<? extends List<? extends Type>> lazy) {
            super(0);
            this.f80020p0 = kTypeImpl;
            this.f80021q0 = i10;
            this.f80022r0 = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Type invoke() {
            KTypeImpl kTypeImpl = this.f80020p0;
            Type javaType = kTypeImpl.getJavaType();
            if (javaType instanceof Class) {
                Class cls = (Class) javaType;
                Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                Intrinsics.checkNotNull(componentType);
                return componentType;
            }
            boolean z10 = javaType instanceof GenericArrayType;
            int i10 = this.f80021q0;
            if (z10) {
                if (i10 == 0) {
                    Type genericComponentType = ((GenericArrayType) javaType).getGenericComponentType();
                    Intrinsics.checkNotNull(genericComponentType);
                    return genericComponentType;
                }
                throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl);
            }
            if (!(javaType instanceof ParameterizedType)) {
                throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl);
            }
            Type type = (Type) KTypeImpl$arguments$2.access$invoke$lambda$0(this.f80022r0).get(i10);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
                Type type2 = (Type) ArraysKt___ArraysKt.firstOrNull(lowerBounds);
                if (type2 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                    type = (Type) ArraysKt___ArraysKt.first(upperBounds);
                } else {
                    type = type2;
                }
            }
            Intrinsics.checkNotNull(type);
            return type;
        }
    }

    /* JADX INFO: compiled from: KTypeImpl.kt */
    public static final class b extends Lambda implements Function0<List<? extends Type>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KTypeImpl f80023p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(KTypeImpl kTypeImpl) {
            super(0);
            this.f80023p0 = kTypeImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends Type> invoke() {
            Type javaType = this.f80023p0.getJavaType();
            Intrinsics.checkNotNull(javaType);
            return ReflectClassUtilKt.getParameterizedTypeArguments(javaType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl, Function0<? extends Type> function0) {
        super(0);
        this.f80018p0 = kTypeImpl;
        this.f80019q0 = function0;
    }

    public static final List access$invoke$lambda$0(Lazy lazy) {
        return (List) lazy.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends KTypeProjection> invoke() {
        KTypeProjection kTypeProjectionInvariant;
        KTypeImpl kTypeImpl = this.f80018p0;
        List<TypeProjection> arguments = kTypeImpl.getF80013p0().getArguments();
        if (arguments.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b(kTypeImpl));
        List<TypeProjection> list = arguments;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.isStarProjection()) {
                kTypeProjectionInvariant = KTypeProjection.INSTANCE.getSTAR();
            } else {
                KotlinType type = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                KTypeImpl kTypeImpl2 = new KTypeImpl(type, this.f80019q0 == null ? null : new a(kTypeImpl, i10, lazy));
                int i12 = WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                if (i12 == 1) {
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.invariant(kTypeImpl2);
                } else if (i12 == 2) {
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.contravariant(kTypeImpl2);
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kTypeProjectionInvariant = KTypeProjection.INSTANCE.covariant(kTypeImpl2);
                }
            }
            arrayList.add(kTypeProjectionInvariant);
            i10 = i11;
        }
        return arrayList;
    }
}
