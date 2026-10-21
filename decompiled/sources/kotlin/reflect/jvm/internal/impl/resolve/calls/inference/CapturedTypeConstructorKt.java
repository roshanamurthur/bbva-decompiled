package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nCapturedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,153:1\n1549#2:154\n1620#2,3:155\n37#3,2:158\n*S KotlinDebug\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n*L\n125#1:154\n125#1:155,3\n127#1:158,2\n*E\n"})
public final class CapturedTypeConstructorKt {

    /* JADX INFO: compiled from: CapturedTypeConstructor.kt */
    public static final class a extends Lambda implements Function0<KotlinType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TypeProjection f81537p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TypeProjection typeProjection) {
            super(0);
            this.f81537p0 = typeProjection;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final KotlinType invoke() {
            KotlinType type = this.f81537p0.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return type;
        }
    }

    public static final TypeProjection a(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.getProjectionKind() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.getVariance() != typeProjection.getProjectionKind()) {
            return new TypeProjectionImpl(createCapturedType(typeProjection));
        }
        if (!typeProjection.isStarProjection()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
        Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        return new TypeProjectionImpl(new LazyWrappedType(NO_LOCKS, new a(typeProjection)));
    }

    @NotNull
    public static final KotlinType createCapturedType(@NotNull TypeProjection typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }

    public static final boolean isCaptured(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.getConstructor() instanceof CapturedTypeConstructor;
    }

    @NotNull
    public static final TypeSubstitution wrapWithCapturingSubstitution(@NotNull TypeSubstitution typeSubstitution, final boolean z10) {
        Intrinsics.checkNotNullParameter(typeSubstitution, "<this>");
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution.2
                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateContravariantCapturedTypes() {
                    return z10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                @Nullable
                /* JADX INFO: renamed from: get */
                public TypeProjection mo5782get(@NotNull KotlinType key) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    TypeProjection typeProjectionMo5782get = super.mo5782get(key);
                    if (typeProjectionMo5782get == null) {
                        return null;
                    }
                    ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = key.getConstructor().mo5778getDeclarationDescriptor();
                    return CapturedTypeConstructorKt.a(typeProjectionMo5782get, classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor : null);
                }
            };
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
        List<Pair> listZip = ArraysKt___ArraysKt.zip(indexedParametersSubstitution.getArguments(), indexedParametersSubstitution.getParameters());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listZip, 10));
        for (Pair pair : listZip) {
            arrayList.add(a((TypeProjection) pair.getFirst(), (TypeParameterDescriptor) pair.getSecond()));
        }
        return new IndexedParametersSubstitution(parameters, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), z10);
    }

    public static /* synthetic */ TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z10);
    }
}
