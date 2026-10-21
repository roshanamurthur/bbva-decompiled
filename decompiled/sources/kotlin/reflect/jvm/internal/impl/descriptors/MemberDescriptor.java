package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface MemberDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility {
    @NotNull
    Modality getModality();

    @NotNull
    DescriptorVisibility getVisibility();

    boolean isActual();

    boolean isExpect();

    boolean isExternal();
}
