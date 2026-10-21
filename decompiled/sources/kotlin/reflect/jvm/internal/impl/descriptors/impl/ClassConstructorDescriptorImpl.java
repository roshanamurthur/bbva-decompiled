package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class ClassConstructorDescriptorImpl extends FunctionDescriptorImpl implements ClassConstructorDescriptor {
    protected final boolean isPrimary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassConstructorDescriptorImpl(@NotNull ClassDescriptor classDescriptor, @Nullable ConstructorDescriptor constructorDescriptor, @NotNull Annotations annotations, boolean z10, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(classDescriptor, constructorDescriptor, annotations, SpecialNames.INIT, kind, sourceElement);
        if (classDescriptor == null) {
            a(0);
            throw null;
        }
        if (annotations == null) {
            a(1);
            throw null;
        }
        if (kind == null) {
            a(2);
            throw null;
        }
        if (sourceElement == null) {
            a(3);
            throw null;
        }
        this.isPrimary = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static ClassConstructorDescriptorImpl create(@NotNull ClassDescriptor classDescriptor, @NotNull Annotations annotations, boolean z10, @NotNull SourceElement sourceElement) {
        if (classDescriptor == null) {
            a(4);
            throw null;
        }
        if (annotations == null) {
            a(5);
            throw null;
        }
        if (sourceElement != null) {
            return new ClassConstructorDescriptorImpl(classDescriptor, null, annotations, z10, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
        }
        a(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d2) {
        return declarationDescriptorVisitor.visitConstructorDescriptor(this, d2);
    }

    @Nullable
    public ReceiverParameterDescriptor calculateDispatchReceiverParameter() {
        ClassDescriptor containingDeclaration = getContainingDeclaration();
        if (!containingDeclaration.isInner()) {
            return null;
        }
        DeclarationDescriptor containingDeclaration2 = containingDeclaration.getContainingDeclaration();
        if (containingDeclaration2 instanceof ClassDescriptor) {
            return ((ClassDescriptor) containingDeclaration2).getThisAsReceiverParameter();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    @NotNull
    public ClassDescriptor getConstructedClass() {
        ClassDescriptor containingDeclaration = getContainingDeclaration();
        if (containingDeclaration != null) {
            return containingDeclaration;
        }
        a(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public Collection<? extends FunctionDescriptor> getOverriddenDescriptors() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        a(21);
        throw null;
    }

    public ClassConstructorDescriptorImpl initialize(@NotNull List<ValueParameterDescriptor> list, @NotNull DescriptorVisibility descriptorVisibility, @NotNull List<TypeParameterDescriptor> list2) {
        List<ReceiverParameterDescriptor> listEmptyList;
        if (list == null) {
            a(10);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(11);
            throw null;
        }
        if (list2 == null) {
            a(12);
            throw null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptorCalculateDispatchReceiverParameter = calculateDispatchReceiverParameter();
        ClassDescriptor containingDeclaration = getContainingDeclaration();
        if (containingDeclaration.getContextReceivers().isEmpty()) {
            listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                a(16);
                throw null;
            }
        } else {
            listEmptyList = containingDeclaration.getContextReceivers();
            if (listEmptyList == null) {
                a(15);
                throw null;
            }
        }
        super.initialize(null, receiverParameterDescriptorCalculateDispatchReceiverParameter, listEmptyList, list2, list, null, Modality.FINAL, descriptorVisibility);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public boolean isPrimary() {
        return this.isPrimary;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            return;
        }
        a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public ClassConstructorDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            a(23);
            throw null;
        }
        if (kind == null) {
            a(24);
            throw null;
        }
        if (annotations == null) {
            a(25);
            throw null;
        }
        if (sourceElement == null) {
            a(26);
            throw null;
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind == kind2 || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            return new ClassConstructorDescriptorImpl((ClassDescriptor) declarationDescriptor, this, annotations, this.isPrimary, kind2, sourceElement);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public ClassConstructorDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) super.copy(declarationDescriptor, modality, descriptorVisibility, kind, z10);
        if (classConstructorDescriptor != null) {
            return classConstructorDescriptor;
        }
        a(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public ClassDescriptor getContainingDeclaration() {
        ClassDescriptor classDescriptor = (ClassDescriptor) super.getContainingDeclaration();
        if (classDescriptor != null) {
            return classDescriptor;
        }
        a(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    public ClassConstructorDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return (ClassConstructorDescriptor) super.substitute(typeSubstitutor);
        }
        a(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public ClassConstructorDescriptor getOriginal() {
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) super.getOriginal();
        if (classConstructorDescriptor != null) {
            return classConstructorDescriptor;
        }
        a(19);
        throw null;
    }

    public ClassConstructorDescriptorImpl initialize(@NotNull List<ValueParameterDescriptor> list, @NotNull DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            a(13);
            throw null;
        }
        if (descriptorVisibility != null) {
            initialize(list, descriptorVisibility, getContainingDeclaration().getDeclaredTypeParameters());
            return this;
        }
        a(14);
        throw null;
    }
}
