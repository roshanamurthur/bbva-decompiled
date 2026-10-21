package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypeAliasConstructorDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface TypeAliasConstructorDescriptor extends ConstructorDescriptor {
    @NotNull
    ClassConstructorDescriptor getUnderlyingConstructorDescriptor();
}
