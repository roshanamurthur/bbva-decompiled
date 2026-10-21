package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {
    public final boolean E0;
    public final boolean F0;
    public final boolean G0;
    public final boolean H0;
    public final boolean I0;
    public final boolean J0;
    public List<ReceiverParameterDescriptor> K0;
    public ReceiverParameterDescriptor L0;
    public ReceiverParameterDescriptor M0;
    public ArrayList N0;
    public PropertyGetterDescriptorImpl O0;
    public PropertySetterDescriptor P0;
    public boolean Q0;
    public FieldDescriptor R0;
    public FieldDescriptor S0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Modality f80372u0;
    public DescriptorVisibility v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Collection<? extends PropertyDescriptor> f80373w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final PropertyDescriptor f80374x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final CallableMemberDescriptor.Kind f80375y0;

    public class CopyConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DeclarationDescriptor f80376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Modality f80377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DescriptorVisibility f80378c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CallableMemberDescriptor.Kind f80380e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ReceiverParameterDescriptor f80383h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Name f80384i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final KotlinType f80385j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PropertyDescriptor f80379d = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TypeSubstitution f80381f = TypeSubstitution.EMPTY;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f80382g = true;

        public CopyConfiguration() {
            this.f80376a = PropertyDescriptorImpl.this.getContainingDeclaration();
            this.f80377b = PropertyDescriptorImpl.this.getModality();
            this.f80378c = PropertyDescriptorImpl.this.getVisibility();
            this.f80380e = PropertyDescriptorImpl.this.getKind();
            this.f80383h = PropertyDescriptorImpl.this.L0;
            this.f80384i = PropertyDescriptorImpl.this.getName();
            this.f80385j = PropertyDescriptorImpl.this.getType();
        }

        public static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Nullable
        public PropertyDescriptor build() {
            return PropertyDescriptorImpl.this.doSubstitute(this);
        }

        @NotNull
        public CopyConfiguration setCopyOverrides(boolean z10) {
            this.f80382g = z10;
            return this;
        }

        @NotNull
        public CopyConfiguration setKind(@NotNull CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.f80380e = kind;
                return this;
            }
            a(10);
            throw null;
        }

        @NotNull
        public CopyConfiguration setModality(@NotNull Modality modality) {
            if (modality != null) {
                this.f80377b = modality;
                return this;
            }
            a(6);
            throw null;
        }

        @NotNull
        public CopyConfiguration setOriginal(@Nullable CallableMemberDescriptor callableMemberDescriptor) {
            this.f80379d = (PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        @NotNull
        public CopyConfiguration setOwner(@NotNull DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                this.f80376a = declarationDescriptor;
                return this;
            }
            a(0);
            throw null;
        }

        @NotNull
        public CopyConfiguration setSubstitution(@NotNull TypeSubstitution typeSubstitution) {
            if (typeSubstitution != null) {
                this.f80381f = typeSubstitution;
                return this;
            }
            a(15);
            throw null;
        }

        @NotNull
        public CopyConfiguration setVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility != null) {
                this.f80378c = descriptorVisibility;
                return this;
            }
            a(8);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z10, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(declarationDescriptor, annotations, name, null, z10, sourceElement);
        if (declarationDescriptor == null) {
            a(0);
            throw null;
        }
        if (annotations == null) {
            a(1);
            throw null;
        }
        if (modality == null) {
            a(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(3);
            throw null;
        }
        if (name == null) {
            a(4);
            throw null;
        }
        if (kind == null) {
            a(5);
            throw null;
        }
        if (sourceElement == null) {
            a(6);
            throw null;
        }
        this.f80373w0 = null;
        this.K0 = Collections.emptyList();
        this.f80372u0 = modality;
        this.v0 = descriptorVisibility;
        this.f80374x0 = propertyDescriptor == null ? this : propertyDescriptor;
        this.f80375y0 = kind;
        this.E0 = z11;
        this.F0 = z12;
        this.G0 = z13;
        this.H0 = z14;
        this.I0 = z15;
        this.J0 = z16;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i10 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i10 == 38) {
            objArr[1] = "getOriginal";
        } else if (i10 == 39) {
            objArr[1] = "getKind";
        } else if (i10 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 42) {
            switch (i10) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static PropertyDescriptorImpl create(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z10, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (declarationDescriptor == null) {
            a(7);
            throw null;
        }
        if (annotations == null) {
            a(8);
            throw null;
        }
        if (modality == null) {
            a(9);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(10);
            throw null;
        }
        if (name == null) {
            a(11);
            throw null;
        }
        if (kind == null) {
            a(12);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyDescriptorImpl(declarationDescriptor, null, annotations, modality, descriptorVisibility, z10, name, kind, sourceElement, z11, z12, z13, z14, z15, z16);
        }
        a(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d2) {
        return declarationDescriptorVisitor.visitPropertyDescriptor(this, d2);
    }

    @NotNull
    public PropertyDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, @Nullable PropertyDescriptor propertyDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @NotNull Name name, @NotNull SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            a(32);
            throw null;
        }
        if (modality == null) {
            a(33);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(34);
            throw null;
        }
        if (kind == null) {
            a(35);
            throw null;
        }
        if (name == null) {
            a(36);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, isVar(), name, kind, sourceElement, isLateInit(), isConst(), isExpect(), isActual(), isExternal(), isDelegated());
        }
        a(37);
        throw null;
    }

    @Nullable
    public PropertyDescriptor doSubstitute(@NotNull CopyConfiguration copyConfiguration) {
        ReceiverParameterDescriptor receiverParameterDescriptor;
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        Function0<NullableLazyValue<ConstantValue<?>>> function0;
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2 = null;
        if (copyConfiguration == null) {
            a(29);
            throw null;
        }
        DeclarationDescriptor declarationDescriptor = copyConfiguration.f80376a;
        Modality modality = copyConfiguration.f80377b;
        DescriptorVisibility descriptorVisibility = copyConfiguration.f80378c;
        PropertyDescriptor propertyDescriptor = copyConfiguration.f80379d;
        CallableMemberDescriptor.Kind kind = copyConfiguration.f80380e;
        Name name = copyConfiguration.f80384i;
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        if (sourceElement == null) {
            a(28);
            throw null;
        }
        PropertyDescriptorImpl propertyDescriptorImplCreateSubstitutedCopy = createSubstitutedCopy(declarationDescriptor, modality, descriptorVisibility, propertyDescriptor, kind, name, sourceElement);
        List<TypeParameterDescriptor> typeParameters = getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorSubstituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(typeParameters, copyConfiguration.f80381f, propertyDescriptorImplCreateSubstitutedCopy, arrayList);
        Variance variance = Variance.OUT_VARIANCE;
        KotlinType kotlinType = copyConfiguration.f80385j;
        KotlinType kotlinTypeSubstitute = typeSubstitutorSubstituteTypeParameters.substitute(kotlinType, variance);
        if (kotlinTypeSubstitute == null) {
            return null;
        }
        Variance variance2 = Variance.IN_VARIANCE;
        KotlinType kotlinTypeSubstitute2 = typeSubstitutorSubstituteTypeParameters.substitute(kotlinType, variance2);
        if (kotlinTypeSubstitute2 != null) {
            propertyDescriptorImplCreateSubstitutedCopy.setInType(kotlinTypeSubstitute2);
        }
        ReceiverParameterDescriptor receiverParameterDescriptor2 = copyConfiguration.f80383h;
        if (receiverParameterDescriptor2 != null) {
            ReceiverParameterDescriptor receiverParameterDescriptorSubstitute = receiverParameterDescriptor2.substitute(typeSubstitutorSubstituteTypeParameters);
            if (receiverParameterDescriptorSubstitute == null) {
                return null;
            }
            receiverParameterDescriptor = receiverParameterDescriptorSubstitute;
        } else {
            receiverParameterDescriptor = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = this.M0;
        if (receiverParameterDescriptor3 != null) {
            KotlinType kotlinTypeSubstitute3 = typeSubstitutorSubstituteTypeParameters.substitute(receiverParameterDescriptor3.getType(), variance2);
            receiverParameterDescriptorImpl = kotlinTypeSubstitute3 == null ? null : new ReceiverParameterDescriptorImpl(propertyDescriptorImplCreateSubstitutedCopy, new ExtensionReceiver(propertyDescriptorImplCreateSubstitutedCopy, kotlinTypeSubstitute3, receiverParameterDescriptor3.getValue()), receiverParameterDescriptor3.getAnnotations());
        } else {
            receiverParameterDescriptorImpl = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ReceiverParameterDescriptor receiverParameterDescriptor4 : this.K0) {
            KotlinType kotlinTypeSubstitute4 = typeSubstitutorSubstituteTypeParameters.substitute(receiverParameterDescriptor4.getType(), Variance.IN_VARIANCE);
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl3 = kotlinTypeSubstitute4 == null ? receiverParameterDescriptorImpl2 : new ReceiverParameterDescriptorImpl(propertyDescriptorImplCreateSubstitutedCopy, new ContextReceiver(propertyDescriptorImplCreateSubstitutedCopy, kotlinTypeSubstitute4, ((ImplicitContextReceiver) receiverParameterDescriptor4.getValue()).getCustomLabelName(), receiverParameterDescriptor4.getValue()), receiverParameterDescriptor4.getAnnotations());
            if (receiverParameterDescriptorImpl3 != null) {
                arrayList2.add(receiverParameterDescriptorImpl3);
            }
            receiverParameterDescriptorImpl2 = null;
        }
        propertyDescriptorImplCreateSubstitutedCopy.setType(kotlinTypeSubstitute, arrayList, receiverParameterDescriptor, receiverParameterDescriptorImpl, arrayList2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = this.O0;
        if (propertyGetterDescriptorImpl2 == null) {
            propertyGetterDescriptorImpl = null;
        } else {
            Annotations annotations = propertyGetterDescriptorImpl2.getAnnotations();
            Modality modality2 = copyConfiguration.f80377b;
            DescriptorVisibility visibility = this.O0.getVisibility();
            if (copyConfiguration.f80380e == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(visibility.normalize())) {
                visibility = DescriptorVisibilities.INVISIBLE_FAKE;
            }
            DescriptorVisibility descriptorVisibility2 = visibility;
            boolean zIsDefault = this.O0.isDefault();
            boolean zIsExternal = this.O0.isExternal();
            boolean zIsInline = this.O0.isInline();
            CallableMemberDescriptor.Kind kind2 = copyConfiguration.f80380e;
            PropertyDescriptor propertyDescriptor2 = copyConfiguration.f80379d;
            propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(propertyDescriptorImplCreateSubstitutedCopy, annotations, modality2, descriptorVisibility2, zIsDefault, zIsExternal, zIsInline, kind2, propertyDescriptor2 == null ? null : propertyDescriptor2.getGetter(), SourceElement.NO_SOURCE);
        }
        if (propertyGetterDescriptorImpl != null) {
            KotlinType returnType = this.O0.getReturnType();
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3 = this.O0;
            if (propertyGetterDescriptorImpl3 == null) {
                a(31);
                throw null;
            }
            propertyGetterDescriptorImpl.setInitialSignatureDescriptor(propertyGetterDescriptorImpl3.getInitialSignatureDescriptor() != null ? propertyGetterDescriptorImpl3.getInitialSignatureDescriptor().substitute(typeSubstitutorSubstituteTypeParameters) : null);
            propertyGetterDescriptorImpl.initialize(returnType != null ? typeSubstitutorSubstituteTypeParameters.substitute(returnType, Variance.OUT_VARIANCE) : null);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.P0;
        if (propertySetterDescriptor == null) {
            propertySetterDescriptorImpl = null;
        } else {
            Annotations annotations2 = propertySetterDescriptor.getAnnotations();
            Modality modality3 = copyConfiguration.f80377b;
            DescriptorVisibility visibility2 = this.P0.getVisibility();
            if (copyConfiguration.f80380e == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.isPrivate(visibility2.normalize())) {
                visibility2 = DescriptorVisibilities.INVISIBLE_FAKE;
            }
            DescriptorVisibility descriptorVisibility3 = visibility2;
            boolean zIsDefault2 = this.P0.isDefault();
            boolean zIsExternal2 = this.P0.isExternal();
            boolean zIsInline2 = this.P0.isInline();
            CallableMemberDescriptor.Kind kind3 = copyConfiguration.f80380e;
            PropertyDescriptor propertyDescriptor3 = copyConfiguration.f80379d;
            propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptorImplCreateSubstitutedCopy, annotations2, modality3, descriptorVisibility3, zIsDefault2, zIsExternal2, zIsInline2, kind3, propertyDescriptor3 == null ? null : propertyDescriptor3.getSetter(), SourceElement.NO_SOURCE);
        }
        if (propertySetterDescriptorImpl != null) {
            List<ValueParameterDescriptor> substitutedValueParameters = FunctionDescriptorImpl.getSubstitutedValueParameters(propertySetterDescriptorImpl, this.P0.getValueParameters(), typeSubstitutorSubstituteTypeParameters, false, false, null);
            if (substitutedValueParameters == null) {
                propertyDescriptorImplCreateSubstitutedCopy.setSetterProjectedOut(true);
                substitutedValueParameters = Collections.singletonList(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, DescriptorUtilsKt.getBuiltIns(copyConfiguration.f80376a).getNothingType(), this.P0.getValueParameters().get(0).getAnnotations()));
            }
            if (substitutedValueParameters.size() != 1) {
                throw new IllegalStateException();
            }
            PropertySetterDescriptor propertySetterDescriptor2 = this.P0;
            if (propertySetterDescriptor2 == null) {
                a(31);
                throw null;
            }
            propertySetterDescriptorImpl.setInitialSignatureDescriptor(propertySetterDescriptor2.getInitialSignatureDescriptor() != null ? propertySetterDescriptor2.getInitialSignatureDescriptor().substitute(typeSubstitutorSubstituteTypeParameters) : null);
            propertySetterDescriptorImpl.initialize(substitutedValueParameters.get(0));
        }
        FieldDescriptor fieldDescriptor = this.R0;
        FieldDescriptorImpl fieldDescriptorImpl = fieldDescriptor == null ? null : new FieldDescriptorImpl(fieldDescriptor.getAnnotations(), propertyDescriptorImplCreateSubstitutedCopy);
        FieldDescriptor fieldDescriptor2 = this.S0;
        propertyDescriptorImplCreateSubstitutedCopy.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 == null ? null : new FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), propertyDescriptorImplCreateSubstitutedCopy));
        if (copyConfiguration.f80382g) {
            SmartSet smartSetCreate = SmartSet.create();
            Iterator<? extends PropertyDescriptor> it = getOverriddenDescriptors().iterator();
            while (it.hasNext()) {
                smartSetCreate.add(it.next().substitute(typeSubstitutorSubstituteTypeParameters));
            }
            propertyDescriptorImplCreateSubstitutedCopy.setOverriddenDescriptors(smartSetCreate);
        }
        if (isConst() && (function0 = this.compileTimeInitializerFactory) != null) {
            propertyDescriptorImplCreateSubstitutedCopy.setCompileTimeInitializer(this.compileTimeInitializer, function0);
        }
        return propertyDescriptorImplCreateSubstitutedCopy;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    public List<PropertyAccessorDescriptor> getAccessors() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.O0;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.P0;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public FieldDescriptor getBackingField() {
        return this.R0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        List<ReceiverParameterDescriptor> list = this.K0;
        if (list != null) {
            return list;
        }
        a(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public FieldDescriptor getDelegateField() {
        return this.S0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.L0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.M0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f80375y0;
        if (kind != null) {
            return kind;
        }
        a(39);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality = this.f80372u0;
        if (modality != null) {
            return modality;
        }
        a(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public Collection<? extends PropertyDescriptor> getOverriddenDescriptors() {
        Collection<? extends PropertyDescriptor> collectionEmptyList = this.f80373w0;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        a(41);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public KotlinType getReturnType() {
        KotlinType type = getType();
        if (type != null) {
            return type;
        }
        a(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertySetterDescriptor getSetter() {
        return this.P0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        ArrayList arrayList = this.N0;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.v0;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        a(25);
        throw null;
    }

    public void initialize(@Nullable PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, @Nullable PropertySetterDescriptor propertySetterDescriptor) {
        initialize(propertyGetterDescriptorImpl, propertySetterDescriptor, null, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.H0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean isDelegated() {
        return this.J0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.I0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return this.E0;
    }

    public boolean isSetterProjectedOut() {
        return this.Q0;
    }

    @NotNull
    public CopyConfiguration newCopyBuilder() {
        return new CopyConfiguration();
    }

    public void setInType(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return;
        }
        a(14);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != 0) {
            this.f80373w0 = collection;
        } else {
            a(40);
            throw null;
        }
    }

    public void setSetterProjectedOut(boolean z10) {
        this.Q0 = z10;
    }

    public void setType(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeParameterDescriptor> list, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor2, @NotNull List<ReceiverParameterDescriptor> list2) {
        if (kotlinType == null) {
            a(17);
            throw null;
        }
        if (list == null) {
            a(18);
            throw null;
        }
        if (list2 == null) {
            a(19);
            throw null;
        }
        setOutType(kotlinType);
        this.N0 = new ArrayList(list);
        this.M0 = receiverParameterDescriptor2;
        this.L0 = receiverParameterDescriptor;
        this.K0 = list2;
    }

    public void setVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            this.v0 = descriptorVisibility;
        } else {
            a(20);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public PropertyDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        PropertyDescriptor propertyDescriptorBuild = newCopyBuilder().setOwner(declarationDescriptor).setOriginal(null).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z10).build();
        if (propertyDescriptorBuild != null) {
            return propertyDescriptorBuild;
        }
        a(42);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertyGetterDescriptorImpl getGetter() {
        return this.O0;
    }

    public void initialize(@Nullable PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, @Nullable PropertySetterDescriptor propertySetterDescriptor, @Nullable FieldDescriptor fieldDescriptor, @Nullable FieldDescriptor fieldDescriptor2) {
        this.O0 = propertyGetterDescriptorImpl;
        this.P0 = propertySetterDescriptor;
        this.R0 = fieldDescriptor;
        this.S0 = fieldDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public PropertyDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : newCopyBuilder().setSubstitution(typeSubstitutor.getSubstitution()).setOriginal(getOriginal()).build();
        }
        a(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public PropertyDescriptor getOriginal() {
        PropertyDescriptor propertyDescriptor = this.f80374x0;
        PropertyDescriptor original = propertyDescriptor == this ? this : propertyDescriptor.getOriginal();
        if (original != null) {
            return original;
        }
        a(38);
        throw null;
    }
}
