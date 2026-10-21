package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class PossiblyInnerType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClassifierDescriptorWithTypeParameters f80223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<TypeProjection> f80224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final PossiblyInnerType f80225c;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptor, @NotNull List<? extends TypeProjection> arguments, @Nullable PossiblyInnerType possiblyInnerType) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f80223a = classifierDescriptor;
        this.f80224b = arguments;
        this.f80225c = possiblyInnerType;
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.f80224b;
    }

    @NotNull
    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.f80223a;
    }

    @Nullable
    public final PossiblyInnerType getOuterType() {
        return this.f80225c;
    }
}
