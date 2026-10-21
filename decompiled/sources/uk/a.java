package uk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements TypeParameterDescriptor {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final TypeParameterDescriptor f93874p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final DeclarationDescriptor f93875q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f93876r0;

    public a(@NotNull TypeParameterDescriptor originalDescriptor, @NotNull DeclarationDescriptor declarationDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(originalDescriptor, "originalDescriptor");
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        this.f93874p0 = originalDescriptor;
        this.f93875q0 = declarationDescriptor;
        this.f93876r0 = i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d2) {
        return (R) this.f93874p0.accept(declarationDescriptorVisitor, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.f93874p0.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        return this.f93875q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        return this.f93874p0.getDefaultType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.f93874p0.getIndex() + this.f93876r0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        return this.f93874p0.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return this.f93874p0.getSource();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public StorageManager getStorageManager() {
        return this.f93874p0.getStorageManager();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.f93874p0.getTypeConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public List<KotlinType> getUpperBounds() {
        return this.f93874p0.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public Variance getVariance() {
        return this.f93874p0.getVariance();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isCapturedFromOuterDeclaration() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isReified() {
        return this.f93874p0.isReified();
    }

    @NotNull
    public String toString() {
        return this.f93874p0 + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor original = this.f93874p0.getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
        return original;
    }
}
