package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\ntypeParameterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n+ 2 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n15#2,2:101\n1549#3:103\n1620#3,3:104\n*S KotlinDebug\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n*L\n37#1:101,2\n42#1:103\n42#1:104,3\n*E\n"})
public final class TypeParameterUtilsKt {

    /* JADX INFO: compiled from: typeParameterUtils.kt */
    public static final class a extends Lambda implements Function1<DeclarationDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80233p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DeclarationDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof CallableDescriptor);
        }
    }

    /* JADX INFO: compiled from: typeParameterUtils.kt */
    public static final class b extends Lambda implements Function1<DeclarationDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f80234p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DeclarationDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!(it instanceof ConstructorDescriptor));
        }
    }

    /* JADX INFO: compiled from: typeParameterUtils.kt */
    public static final class c extends Lambda implements Function1<DeclarationDescriptor, Sequence<? extends TypeParameterDescriptor>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f80235p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Sequence<TypeParameterDescriptor> invoke(@NotNull DeclarationDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) it).getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            return CollectionsKt___CollectionsKt.asSequence(typeParameters);
        }
    }

    public static final PossiblyInnerType a(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i10) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.isError(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i10;
        if (classifierDescriptorWithTypeParameters.isInner()) {
            List<TypeProjection> listSubList = kotlinType.getArguments().subList(i10, size);
            DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, a(kotlinType, containingDeclaration instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) containingDeclaration : null, size));
        }
        if (size != kotlinType.getArguments().size()) {
            DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i10, kotlinType.getArguments().size()), null);
    }

    @Nullable
    public static final PossiblyInnerType buildPossiblyInnerType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        return a(kotlinType, classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo5778getDeclarationDescriptor : null, 0);
    }

    @NotNull
    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> listEmptyList;
        DeclarationDescriptor next;
        TypeConstructor typeConstructor;
        Intrinsics.checkNotNullParameter(classifierDescriptorWithTypeParameters, "<this>");
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        if (!classifierDescriptorWithTypeParameters.isInner() && !(classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        List list = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.flatMap(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.takeWhile(DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters), a.f80233p0), b.f80234p0), c.f80235p0));
        Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters).iterator();
        do {
            listEmptyList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof ClassDescriptor));
        ClassDescriptor classDescriptor = (ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructor = classDescriptor.getTypeConstructor()) != null) {
            listEmptyList = typeConstructor.getParameters();
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (list.isEmpty() && listEmptyList.isEmpty()) {
            List<TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
            Intrinsics.checkNotNullExpressionValue(declaredTypeParameters2, "getDeclaredTypeParameters(...)");
            return declaredTypeParameters2;
        }
        List<TypeParameterDescriptor> listPlus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) listEmptyList);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listPlus, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : listPlus) {
            Intrinsics.checkNotNull(typeParameterDescriptor);
            arrayList.add(new uk.a(typeParameterDescriptor, classifierDescriptorWithTypeParameters, declaredTypeParameters.size()));
        }
        return CollectionsKt___CollectionsKt.plus((Collection) declaredTypeParameters, (Iterable) arrayList);
    }
}
