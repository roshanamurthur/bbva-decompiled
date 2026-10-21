package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nStarProjectionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StarProjectionImpl.kt\norg/jetbrains/kotlin/types/StarProjectionImplKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n1549#2:106\n1620#2,3:107\n*S KotlinDebug\n*F\n+ 1 StarProjectionImpl.kt\norg/jetbrains/kotlin/types/StarProjectionImplKt\n*L\n66#1:102\n66#1:103,3\n73#1:106\n73#1:107,3\n*E\n"})
public final class StarProjectionImplKt {
    @NotNull
    public static final KotlinType starProjectionType(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        KotlinType kotlinTypeSubstitute;
        Intrinsics.checkNotNullParameter(typeParameterDescriptor, "<this>");
        DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
        if (containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) {
            List<TypeParameterDescriptor> parameters = ((ClassifierDescriptorWithTypeParameters) containingDeclaration).getTypeConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List<TypeParameterDescriptor> list = parameters;
            final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeConstructor typeConstructor = ((TypeParameterDescriptor) it.next()).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
                arrayList.add(typeConstructor);
            }
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor);
            kotlinTypeSubstitute = TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                @Nullable
                public TypeProjection get(@NotNull TypeConstructor key) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    if (!arrayList.contains(key)) {
                        return null;
                    }
                    ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = key.mo5778getDeclarationDescriptor();
                    Intrinsics.checkNotNull(classifierDescriptorMo5778getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                    return TypeUtils.makeStarProjection((TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
                }
            }).substitute((KotlinType) CollectionsKt___CollectionsKt.first((List) upperBounds), Variance.OUT_VARIANCE);
            if (kotlinTypeSubstitute == null) {
                kotlinTypeSubstitute = builtIns.getDefaultBound();
            }
            Intrinsics.checkNotNull(kotlinTypeSubstitute);
        } else {
            if (!(containingDeclaration instanceof FunctionDescriptor)) {
                throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
            }
            List<TypeParameterDescriptor> typeParameters = ((FunctionDescriptor) containingDeclaration).getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            List<TypeParameterDescriptor> list2 = typeParameters;
            final ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                TypeConstructor typeConstructor2 = ((TypeParameterDescriptor) it2.next()).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor2, "getTypeConstructor(...)");
                arrayList2.add(typeConstructor2);
            }
            List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
            KotlinBuiltIns builtIns2 = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor);
            kotlinTypeSubstitute = TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                @Nullable
                public TypeProjection get(@NotNull TypeConstructor key) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    if (!arrayList2.contains(key)) {
                        return null;
                    }
                    ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = key.mo5778getDeclarationDescriptor();
                    Intrinsics.checkNotNull(classifierDescriptorMo5778getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                    return TypeUtils.makeStarProjection((TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
                }
            }).substitute((KotlinType) CollectionsKt___CollectionsKt.first((List) upperBounds2), Variance.OUT_VARIANCE);
            if (kotlinTypeSubstitute == null) {
                kotlinTypeSubstitute = builtIns2.getDefaultBound();
            }
            Intrinsics.checkNotNull(kotlinTypeSubstitute);
        }
        return kotlinTypeSubstitute;
    }
}
