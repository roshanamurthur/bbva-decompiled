package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
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
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ErrorPropertyDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ErrorPropertyDescriptor implements PropertyDescriptor {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PropertyDescriptorImpl f82036p0;

    public ErrorPropertyDescriptor() {
        ErrorUtils errorUtils = ErrorUtils.INSTANCE;
        PropertyDescriptorImpl propertyDescriptorImplCreate = PropertyDescriptorImpl.create(errorUtils.getErrorClass(), Annotations.Companion.getEMPTY(), Modality.OPEN, DescriptorVisibilities.PUBLIC, true, Name.special(ErrorEntity.ERROR_PROPERTY.getDebugText()), CallableMemberDescriptor.Kind.DECLARATION, SourceElement.NO_SOURCE, false, false, false, false, false, false);
        propertyDescriptorImplCreate.setType(errorUtils.getErrorPropertyType(), CollectionsKt__CollectionsKt.emptyList(), null, null, CollectionsKt__CollectionsKt.emptyList());
        this.f82036p0 = propertyDescriptorImplCreate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d2) {
        return (R) this.f82036p0.accept(declarationDescriptorVisitor, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        return this.f82036p0.copy(declarationDescriptor, modality, descriptorVisibility, kind, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    public List<PropertyAccessorDescriptor> getAccessors() {
        return this.f82036p0.getAccessors();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.f82036p0.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public FieldDescriptor getBackingField() {
        return this.f82036p0.getBackingField();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    @Nullable
    /* JADX INFO: renamed from: getCompileTimeInitializer */
    public ConstantValue<?> mo5774getCompileTimeInitializer() {
        return this.f82036p0.mo5774getCompileTimeInitializer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        return this.f82036p0.getContainingDeclaration();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        return this.f82036p0.getContextReceiverParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public FieldDescriptor getDelegateField() {
        return this.f82036p0.getDelegateField();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.f82036p0.getDispatchReceiverParameter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.f82036p0.getExtensionReceiverParameter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertyGetterDescriptor getGetter() {
        return this.f82036p0.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        return this.f82036p0.getKind();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        return this.f82036p0.getModality();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return this.f82036p0.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public PropertyDescriptor getOriginal() {
        return this.f82036p0.getOriginal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public Collection<? extends PropertyDescriptor> getOverriddenDescriptors() {
        return this.f82036p0.getOverriddenDescriptors();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public KotlinType getReturnType() {
        return this.f82036p0.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertySetterDescriptor getSetter() {
        return this.f82036p0.getSetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return this.f82036p0.getSource();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public KotlinType getType() {
        return this.f82036p0.getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        return this.f82036p0.getTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        return (V) this.f82036p0.getUserData(userDataKey);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<ValueParameterDescriptor> getValueParameters() {
        return this.f82036p0.getValueParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public DescriptorVisibility getVisibility() {
        return this.f82036p0.getVisibility();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.f82036p0.hasSynthesizedParameterNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.f82036p0.isActual();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f82036p0.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean isDelegated() {
        return this.f82036p0.isDelegated();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.f82036p0.isExpect();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f82036p0.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return this.f82036p0.isLateInit();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return this.f82036p0.isVar();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(@NotNull Collection<? extends CallableMemberDescriptor> overriddenDescriptors) {
        Intrinsics.checkNotNullParameter(overriddenDescriptors, "overriddenDescriptors");
        this.f82036p0.setOverriddenDescriptors(overriddenDescriptors);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public PropertyDescriptor substitute(@NotNull TypeSubstitutor substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this.f82036p0.substitute(substitutor);
    }
}
