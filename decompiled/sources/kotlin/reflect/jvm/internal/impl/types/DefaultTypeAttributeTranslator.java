package kotlin.reflect.jvm.internal.impl.types;

import bk.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeAttributeTranslator.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DefaultTypeAttributeTranslator implements TypeAttributeTranslator {

    @NotNull
    public static final DefaultTypeAttributeTranslator INSTANCE = new DefaultTypeAttributeTranslator();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    @NotNull
    public TypeAttributes toAttributes(@NotNull Annotations annotations, @Nullable TypeConstructor typeConstructor, @Nullable DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations.isEmpty() ? TypeAttributes.Companion.getEmpty() : TypeAttributes.Companion.create(d.listOf(new AnnotationsTypeAttribute(annotations)));
    }
}
