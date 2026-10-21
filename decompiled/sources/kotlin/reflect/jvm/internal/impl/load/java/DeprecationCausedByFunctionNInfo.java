package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final DeclarationDescriptor f80493p0;

    public DeprecationCausedByFunctionNInfo(@NotNull DeclarationDescriptor target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f80493p0 = target;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    @NotNull
    public DeprecationLevelValue getDeprecationLevel() {
        return DeprecationLevelValue.ERROR;
    }
}
