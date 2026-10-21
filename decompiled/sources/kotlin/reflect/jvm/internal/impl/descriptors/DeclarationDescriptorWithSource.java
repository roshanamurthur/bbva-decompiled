package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface DeclarationDescriptorWithSource extends DeclarationDescriptor {
    @NotNull
    SourceElement getSource();
}
