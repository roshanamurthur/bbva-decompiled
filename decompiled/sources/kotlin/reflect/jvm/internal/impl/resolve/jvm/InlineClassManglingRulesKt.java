package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: inlineClassManglingRules.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\ninlineClassManglingRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 inlineClassManglingRules.kt\norg/jetbrains/kotlin/resolve/jvm/InlineClassManglingRulesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1747#2,3:54\n1747#2,3:57\n1#3:60\n*S KotlinDebug\n*F\n+ 1 inlineClassManglingRules.kt\norg/jetbrains/kotlin/resolve/jvm/InlineClassManglingRulesKt\n*L\n21#1:54,3\n27#1:57,3\n*E\n"})
public final class InlineClassManglingRulesKt {
    public static final boolean a(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return false;
        }
        KotlinType representativeUpperBound = TypeUtilsKt.getRepresentativeUpperBound(typeParameterDescriptor);
        return isValueClassThatRequiresMangling(representativeUpperBound) || a(representativeUpperBound);
    }

    public static final boolean isValueClassThatRequiresMangling(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return InlineClassesUtilsKt.isValueClass(declarationDescriptor) && !Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) declarationDescriptor), StandardNames.RESULT_FQ_NAME);
    }

    public static final boolean shouldHideConstructorDueToValueClassTypeValueParameters(@NotNull CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ClassConstructorDescriptor classConstructorDescriptor = descriptor instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) descriptor : null;
        if (classConstructorDescriptor == null || DescriptorVisibilities.isPrivate(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        ClassDescriptor constructedClass = classConstructorDescriptor.getConstructedClass();
        Intrinsics.checkNotNullExpressionValue(constructedClass, "getConstructedClass(...)");
        if (InlineClassesUtilsKt.isValueClass(constructedClass) || DescriptorUtils.isSealedClass(classConstructorDescriptor.getConstructedClass())) {
            return false;
        }
        List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (isValueClassThatRequiresMangling(type) || a(type)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isValueClassThatRequiresMangling(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor != null) {
            return (InlineClassesUtilsKt.isInlineClass(classifierDescriptorMo5778getDeclarationDescriptor) && isValueClassThatRequiresMangling(classifierDescriptorMo5778getDeclarationDescriptor)) || InlineClassesUtilsKt.needsMfvcFlattening(kotlinType);
        }
        return false;
    }
}
