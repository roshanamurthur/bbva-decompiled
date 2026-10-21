package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ModalityUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ModalityUtilsKt {
    public static final boolean isFinalClass(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        return classDescriptor.getModality() == Modality.FINAL && classDescriptor.getKind() != ClassKind.ENUM_CLASS;
    }
}
