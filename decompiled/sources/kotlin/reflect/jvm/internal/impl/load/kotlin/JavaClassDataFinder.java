package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaClassDataFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KotlinClassFinder f80898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeserializedDescriptorResolver f80899b;

    public JavaClassDataFinder(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f80898a = kotlinClassFinder;
        this.f80899b = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    public ClassData findClassData(@NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        DeserializedDescriptorResolver deserializedDescriptorResolver = this.f80899b;
        KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.f80898a, classId, DeserializationHelpersKt.jvmMetadataVersionOrDefault(deserializedDescriptorResolver.getComponents().getConfiguration()));
        if (kotlinJvmBinaryClassFindKotlinClass == null) {
            return null;
        }
        Intrinsics.areEqual(kotlinJvmBinaryClassFindKotlinClass.getClassId(), classId);
        return deserializedDescriptorResolver.readClassData$descriptors_jvm(kotlinJvmBinaryClassFindKotlinClass);
    }
}
