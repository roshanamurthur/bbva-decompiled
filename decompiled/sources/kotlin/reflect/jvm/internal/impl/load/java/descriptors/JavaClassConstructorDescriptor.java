package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {
    public Boolean X0;
    public Boolean Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaClassConstructorDescriptor(@NotNull ClassDescriptor classDescriptor, @Nullable JavaClassConstructorDescriptor javaClassConstructorDescriptor, @NotNull Annotations annotations, boolean z10, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z10, kind, sourceElement);
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
        this.X0 = null;
        this.Y0 = null;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static JavaClassConstructorDescriptor createJavaConstructor(@NotNull ClassDescriptor classDescriptor, @NotNull Annotations annotations, boolean z10, @NotNull SourceElement sourceElement) {
        if (classDescriptor == null) {
            a(4);
            throw null;
        }
        if (annotations == null) {
            a(5);
            throw null;
        }
        if (sourceElement != null) {
            return new JavaClassConstructorDescriptor(classDescriptor, null, annotations, z10, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
        }
        a(6);
        throw null;
    }

    @NotNull
    public JavaClassConstructorDescriptor createDescriptor(@NotNull ClassDescriptor classDescriptor, @Nullable JavaClassConstructorDescriptor javaClassConstructorDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, @NotNull Annotations annotations) {
        if (classDescriptor == null) {
            a(12);
            throw null;
        }
        if (kind == null) {
            a(13);
            throw null;
        }
        if (sourceElement == null) {
            a(14);
            throw null;
        }
        if (annotations != null) {
            return new JavaClassConstructorDescriptor(classDescriptor, javaClassConstructorDescriptor, annotations, this.isPrimary, kind, sourceElement);
        }
        a(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    @NotNull
    public /* bridge */ /* synthetic */ JavaCallableMemberDescriptor enhance(@Nullable KotlinType kotlinType, @NotNull List list, @NotNull KotlinType kotlinType2, @Nullable Pair pair) {
        return enhance(kotlinType, (List<KotlinType>) list, kotlinType2, (Pair<CallableDescriptor.UserDataKey<?>, ?>) pair);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean hasStableParameterNames() {
        return this.X0.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.Y0.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasStableParameterNames(boolean z10) {
        this.X0 = Boolean.valueOf(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasSynthesizedParameterNames(boolean z10) {
        this.Y0 = Boolean.valueOf(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    @NotNull
    public JavaClassConstructorDescriptor enhance(@Nullable KotlinType kotlinType, @NotNull List<KotlinType> list, @NotNull KotlinType kotlinType2, @Nullable Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        if (list == null) {
            a(16);
            throw null;
        }
        if (kotlinType2 == null) {
            a(17);
            throw null;
        }
        JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateSubstitutedCopy = createSubstitutedCopy((DeclarationDescriptor) getContainingDeclaration(), (FunctionDescriptor) null, getKind(), (Name) null, getAnnotations(), getSource());
        javaClassConstructorDescriptorCreateSubstitutedCopy.initialize(kotlinType != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(javaClassConstructorDescriptorCreateSubstitutedCopy, kotlinType, Annotations.Companion.getEMPTY()) : null, getDispatchReceiverParameter(), CollectionsKt__CollectionsKt.emptyList(), getTypeParameters(), UtilKt.copyValueParameters(list, getValueParameters(), javaClassConstructorDescriptorCreateSubstitutedCopy), kotlinType2, getModality(), getVisibility());
        if (pair != null) {
            javaClassConstructorDescriptorCreateSubstitutedCopy.putInUserDataMap(pair.getFirst(), pair.getSecond());
        }
        return javaClassConstructorDescriptorCreateSubstitutedCopy;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public JavaClassConstructorDescriptor createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            a(7);
            throw null;
        }
        if (kind == null) {
            a(8);
            throw null;
        }
        if (annotations == null) {
            a(9);
            throw null;
        }
        if (sourceElement != null) {
            if (kind != CallableMemberDescriptor.Kind.DECLARATION && kind != CallableMemberDescriptor.Kind.SYNTHESIZED) {
                throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
            }
            JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateDescriptor = createDescriptor((ClassDescriptor) declarationDescriptor, (JavaClassConstructorDescriptor) functionDescriptor, kind, sourceElement, annotations);
            javaClassConstructorDescriptorCreateDescriptor.setHasStableParameterNames(hasStableParameterNames());
            javaClassConstructorDescriptorCreateDescriptor.setHasSynthesizedParameterNames(hasSynthesizedParameterNames());
            return javaClassConstructorDescriptorCreateDescriptor;
        }
        a(10);
        throw null;
    }
}
