package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface DeclarationDescriptorNonRoot extends DeclarationDescriptorWithSource {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    DeclarationDescriptor getContainingDeclaration();
}
