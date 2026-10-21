package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import bk.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaTypeAttributes.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJavaTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeAttributes.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class JavaTypeAttributesKt {
    @NotNull
    public static final JavaTypeAttributes toAttributes(@NotNull TypeUsage typeUsage, boolean z10, boolean z11, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.checkNotNullParameter(typeUsage, "<this>");
        return new JavaTypeAttributes(typeUsage, null, z11, z10, typeParameterDescriptor != null ? v.setOf(typeParameterDescriptor) : null, null, 34, null);
    }

    public static /* synthetic */ JavaTypeAttributes toAttributes$default(TypeUsage typeUsage, boolean z10, boolean z11, TypeParameterDescriptor typeParameterDescriptor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            typeParameterDescriptor = null;
        }
        return toAttributes(typeUsage, z10, z11, typeParameterDescriptor);
    }
}
