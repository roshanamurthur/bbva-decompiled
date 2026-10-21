package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class DescriptorFactory {

    public static class a extends ClassConstructorDescriptorImpl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ClassDescriptor classDescriptor, @NotNull SourceElement sourceElement, boolean z10) {
            super(classDescriptor, null, Annotations.Companion.getEMPTY(), true, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
            if (classDescriptor == null) {
                a(0);
                throw null;
            }
            if (sourceElement == null) {
                a(1);
                throw null;
            }
            initialize(Collections.emptyList(), DescriptorUtils.getDefaultConstructorVisibility(classDescriptor, z10));
        }

        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(@NotNull FunctionDescriptor functionDescriptor) {
        if (functionDescriptor != null) {
            return functionDescriptor.getKind() == CallableMemberDescriptor.Kind.SYNTHESIZED && DescriptorUtils.isEnumClass(functionDescriptor.getContainingDeclaration());
        }
        a(29);
        throw null;
    }

    @Nullable
    public static ReceiverParameterDescriptor createContextReceiverParameterForCallable(@NotNull CallableDescriptor callableDescriptor, @Nullable KotlinType kotlinType, @Nullable Name name, @NotNull Annotations annotations, int i10) {
        if (callableDescriptor == null) {
            a(32);
            throw null;
        }
        if (annotations == null) {
            a(33);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ContextReceiver(callableDescriptor, kotlinType, name, null), annotations, NameUtils.contextReceiverName(i10));
    }

    @Nullable
    public static ReceiverParameterDescriptor createContextReceiverParameterForClass(@NotNull ClassDescriptor classDescriptor, @Nullable KotlinType kotlinType, @Nullable Name name, @NotNull Annotations annotations, int i10) {
        if (classDescriptor == null) {
            a(34);
            throw null;
        }
        if (annotations == null) {
            a(35);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(classDescriptor, new ContextClassReceiver(classDescriptor, kotlinType, name, null), annotations, NameUtils.contextReceiverName(i10));
    }

    @NotNull
    public static PropertyGetterDescriptorImpl createDefaultGetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations) {
        if (propertyDescriptor == null) {
            a(13);
            throw null;
        }
        if (annotations != null) {
            return createGetter(propertyDescriptor, annotations, true, false, false);
        }
        a(14);
        throw null;
    }

    @NotNull
    public static PropertySetterDescriptorImpl createDefaultSetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Annotations annotations2) {
        if (propertyDescriptor == null) {
            a(0);
            throw null;
        }
        if (annotations == null) {
            a(1);
            throw null;
        }
        if (annotations2 != null) {
            return createSetter(propertyDescriptor, annotations, annotations2, true, false, false, propertyDescriptor.getSource());
        }
        a(2);
        throw null;
    }

    @Nullable
    public static PropertyDescriptor createEnumEntriesProperty(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(26);
            throw null;
        }
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(classDescriptor);
        ClassDescriptor classDescriptorFindEnumEntriesClass = StdlibClassFinderKt.getStdlibClassFinder(containingModule).findEnumEntriesClass(containingModule);
        if (classDescriptorFindEnumEntriesClass == null) {
            return null;
        }
        Annotations.Companion companion = Annotations.Companion;
        Annotations empty = companion.getEMPTY();
        Modality modality = Modality.FINAL;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        Name name = StandardNames.ENUM_ENTRIES;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
        PropertyDescriptorImpl propertyDescriptorImplCreate = PropertyDescriptorImpl.create(classDescriptor, empty, modality, descriptorVisibility, false, name, kind, classDescriptor.getSource(), false, false, false, false, false, false);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(propertyDescriptorImplCreate, companion.getEMPTY(), modality, descriptorVisibility, false, false, false, kind, null, classDescriptor.getSource());
        propertyDescriptorImplCreate.initialize(propertyGetterDescriptorImpl, null);
        propertyDescriptorImplCreate.setType(KotlinTypeFactory.simpleType(TypeAttributes.Companion.getEmpty(), classDescriptorFindEnumEntriesClass.getTypeConstructor(), Collections.singletonList(new TypeProjectionImpl(classDescriptor.getDefaultType())), false), Collections.emptyList(), null, null, Collections.emptyList());
        propertyGetterDescriptorImpl.initialize(propertyDescriptorImplCreate.getReturnType());
        return propertyDescriptorImplCreate;
    }

    @NotNull
    public static SimpleFunctionDescriptor createEnumValueOfMethod(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(24);
            throw null;
        }
        Annotations.Companion companion = Annotations.Companion;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplCreate = SimpleFunctionDescriptorImpl.create(classDescriptor, companion.getEMPTY(), StandardNames.ENUM_VALUE_OF, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource());
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplInitialize = simpleFunctionDescriptorImplCreate.initialize((ReceiverParameterDescriptor) null, (ReceiverParameterDescriptor) null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new ValueParameterDescriptorImpl(simpleFunctionDescriptorImplCreate, null, 0, companion.getEMPTY(), Name.identifier("value"), DescriptorUtilsKt.getBuiltIns(classDescriptor).getStringType(), false, false, false, null, classDescriptor.getSource())), (KotlinType) classDescriptor.getDefaultType(), Modality.FINAL, DescriptorVisibilities.PUBLIC);
        if (simpleFunctionDescriptorImplInitialize != null) {
            return simpleFunctionDescriptorImplInitialize;
        }
        a(25);
        throw null;
    }

    @NotNull
    public static SimpleFunctionDescriptor createEnumValuesMethod(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(22);
            throw null;
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplInitialize = SimpleFunctionDescriptorImpl.create(classDescriptor, Annotations.Companion.getEMPTY(), StandardNames.ENUM_VALUES, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource()).initialize((ReceiverParameterDescriptor) null, (ReceiverParameterDescriptor) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (KotlinType) DescriptorUtilsKt.getBuiltIns(classDescriptor).getArrayType(Variance.INVARIANT, classDescriptor.getDefaultType()), Modality.FINAL, DescriptorVisibilities.PUBLIC);
        if (simpleFunctionDescriptorImplInitialize != null) {
            return simpleFunctionDescriptorImplInitialize;
        }
        a(23);
        throw null;
    }

    @Nullable
    public static ReceiverParameterDescriptor createExtensionReceiverParameterForCallable(@NotNull CallableDescriptor callableDescriptor, @Nullable KotlinType kotlinType, @NotNull Annotations annotations) {
        if (callableDescriptor == null) {
            a(30);
            throw null;
        }
        if (annotations == null) {
            a(31);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }

    @NotNull
    public static PropertyGetterDescriptorImpl createGetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, boolean z10, boolean z11, boolean z12) {
        if (propertyDescriptor == null) {
            a(15);
            throw null;
        }
        if (annotations != null) {
            return createGetter(propertyDescriptor, annotations, z10, z11, z12, propertyDescriptor.getSource());
        }
        a(16);
        throw null;
    }

    @NotNull
    public static ClassConstructorDescriptorImpl createPrimaryConstructorForObject(@NotNull ClassDescriptor classDescriptor, @NotNull SourceElement sourceElement) {
        if (classDescriptor == null) {
            a(20);
            throw null;
        }
        if (sourceElement != null) {
            return new a(classDescriptor, sourceElement, false);
        }
        a(21);
        throw null;
    }

    @NotNull
    public static PropertySetterDescriptorImpl createSetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Annotations annotations2, boolean z10, boolean z11, boolean z12, @NotNull SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            a(3);
            throw null;
        }
        if (annotations == null) {
            a(4);
            throw null;
        }
        if (annotations2 == null) {
            a(5);
            throw null;
        }
        if (sourceElement != null) {
            return createSetter(propertyDescriptor, annotations, annotations2, z10, z11, z12, propertyDescriptor.getVisibility(), sourceElement);
        }
        a(6);
        throw null;
    }

    public static boolean isEnumValueOfMethod(@NotNull FunctionDescriptor functionDescriptor) {
        if (functionDescriptor != null) {
            return functionDescriptor.getName().equals(StandardNames.ENUM_VALUE_OF) && b(functionDescriptor);
        }
        a(28);
        throw null;
    }

    public static boolean isEnumValuesMethod(@NotNull FunctionDescriptor functionDescriptor) {
        if (functionDescriptor != null) {
            return functionDescriptor.getName().equals(StandardNames.ENUM_VALUES) && b(functionDescriptor);
        }
        a(27);
        throw null;
    }

    @NotNull
    public static PropertyGetterDescriptorImpl createGetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, boolean z10, boolean z11, boolean z12, @NotNull SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            a(17);
            throw null;
        }
        if (annotations == null) {
            a(18);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), propertyDescriptor.getVisibility(), z10, z11, z12, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
        }
        a(19);
        throw null;
    }

    @NotNull
    public static PropertySetterDescriptorImpl createSetter(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Annotations annotations2, boolean z10, boolean z11, boolean z12, @NotNull DescriptorVisibility descriptorVisibility, @NotNull SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            a(7);
            throw null;
        }
        if (annotations == null) {
            a(8);
            throw null;
        }
        if (annotations2 == null) {
            a(9);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(10);
            throw null;
        }
        if (sourceElement != null) {
            PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), descriptorVisibility, z10, z11, z12, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
            propertySetterDescriptorImpl.initialize(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2));
            return propertySetterDescriptorImpl;
        }
        a(11);
        throw null;
    }
}
