package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FieldDescriptorImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class FieldDescriptorImpl extends AnnotatedImpl implements FieldDescriptor {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final PropertyDescriptor f80314q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(@NotNull Annotations annotations, @NotNull PropertyDescriptor correspondingProperty) {
        super(annotations);
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(correspondingProperty, "correspondingProperty");
        this.f80314q0 = correspondingProperty;
    }
}
