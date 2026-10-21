package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface PropertyAccessorDescriptor extends VariableAccessorDescriptor {
    @NotNull
    PropertyDescriptor getCorrespondingProperty();

    boolean isDefault();
}
