package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class MemberComparator implements Comparator<DeclarationDescriptor> {
    public static final MemberComparator INSTANCE = new MemberComparator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final DescriptorRenderer f81509p0 = DescriptorRenderer.Companion.withOptions(new a());

    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {
        public static final NameAndTypeMemberComparator INSTANCE = new NameAndTypeMemberComparator();

        @Nullable
        public static Integer a(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int iB = b(declarationDescriptor2) - b(declarationDescriptor);
            if (iB != 0) {
                return Integer.valueOf(iB);
            }
            if (DescriptorUtils.isEnumEntry(declarationDescriptor) && DescriptorUtils.isEnumEntry(declarationDescriptor2)) {
                return 0;
            }
            int iCompareTo = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            if (iCompareTo != 0) {
                return Integer.valueOf(iCompareTo);
            }
            return null;
        }

        public static int b(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.isEnumEntry(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                return ((PropertyDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 6 : 5;
            }
            if (declarationDescriptor instanceof FunctionDescriptor) {
                return ((FunctionDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 4 : 3;
            }
            if (declarationDescriptor instanceof ClassDescriptor) {
                return 2;
            }
            return declarationDescriptor instanceof TypeAliasDescriptor ? 1 : 0;
        }

        @Override // java.util.Comparator
        public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Integer numA = a(declarationDescriptor, declarationDescriptor2);
            if (numA != null) {
                return numA.intValue();
            }
            return 0;
        }
    }

    public static class a implements Function1<DescriptorRendererOptions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.setWithDefinedIn(false);
            descriptorRendererOptions.setVerbose(true);
            descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
            return Unit.INSTANCE;
        }
    }

    @Override // java.util.Comparator
    public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        int iOrdinal;
        int iCompareTo;
        Integer numA = NameAndTypeMemberComparator.a(declarationDescriptor, declarationDescriptor2);
        if (numA != null) {
            return numA.intValue();
        }
        boolean z10 = declarationDescriptor instanceof TypeAliasDescriptor;
        DescriptorRenderer descriptorRenderer = f81509p0;
        if (z10 && (declarationDescriptor2 instanceof TypeAliasDescriptor)) {
            int iCompareTo2 = descriptorRenderer.renderType(((TypeAliasDescriptor) declarationDescriptor).getUnderlyingType()).compareTo(descriptorRenderer.renderType(((TypeAliasDescriptor) declarationDescriptor2).getUnderlyingType()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        } else if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor2;
            ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
            ReceiverParameterDescriptor extensionReceiverParameter2 = callableDescriptor2.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null && (iCompareTo = descriptorRenderer.renderType(extensionReceiverParameter.getType()).compareTo(descriptorRenderer.renderType(extensionReceiverParameter2.getType()))) != 0) {
                return iCompareTo;
            }
            List<ValueParameterDescriptor> valueParameters = callableDescriptor.getValueParameters();
            List<ValueParameterDescriptor> valueParameters2 = callableDescriptor2.getValueParameters();
            for (int i10 = 0; i10 < Math.min(valueParameters.size(), valueParameters2.size()); i10++) {
                int iCompareTo3 = descriptorRenderer.renderType(valueParameters.get(i10).getType()).compareTo(descriptorRenderer.renderType(valueParameters2.get(i10).getType()));
                if (iCompareTo3 != 0) {
                    return iCompareTo3;
                }
            }
            int size = valueParameters.size() - valueParameters2.size();
            if (size != 0) {
                return size;
            }
            List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
            List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
            for (int i11 = 0; i11 < Math.min(typeParameters.size(), typeParameters2.size()); i11++) {
                List<KotlinType> upperBounds = typeParameters.get(i11).getUpperBounds();
                List<KotlinType> upperBounds2 = typeParameters2.get(i11).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i12 = 0; i12 < upperBounds.size(); i12++) {
                    int iCompareTo4 = descriptorRenderer.renderType(upperBounds.get(i12)).compareTo(descriptorRenderer.renderType(upperBounds2.get(i12)));
                    if (iCompareTo4 != 0) {
                        return iCompareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof CallableMemberDescriptor) && (iOrdinal = ((CallableMemberDescriptor) callableDescriptor).getKind().ordinal() - ((CallableMemberDescriptor) callableDescriptor2).getKind().ordinal()) != 0) {
                return iOrdinal;
            }
        } else {
            if (!(declarationDescriptor instanceof ClassDescriptor) || !(declarationDescriptor2 instanceof ClassDescriptor)) {
                throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", declarationDescriptor, declarationDescriptor.getClass(), declarationDescriptor2, declarationDescriptor2.getClass()));
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor2;
            if (classDescriptor.getKind().ordinal() != classDescriptor2.getKind().ordinal()) {
                return classDescriptor.getKind().ordinal() - classDescriptor2.getKind().ordinal();
            }
            if (classDescriptor.isCompanionObject() != classDescriptor2.isCompanionObject()) {
                return classDescriptor.isCompanionObject() ? 1 : -1;
            }
        }
        int iCompareTo5 = descriptorRenderer.render(declarationDescriptor).compareTo(descriptorRenderer.render(declarationDescriptor2));
        return iCompareTo5 != 0 ? iCompareTo5 : DescriptorUtils.getContainingModule(declarationDescriptor).getName().compareTo(DescriptorUtils.getContainingModule(declarationDescriptor2).getName());
    }
}
