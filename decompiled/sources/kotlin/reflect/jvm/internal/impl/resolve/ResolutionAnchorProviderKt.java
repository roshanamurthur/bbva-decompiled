package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResolutionAnchorProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ResolutionAnchorProviderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ModuleCapability<ResolutionAnchorProvider> f81529a = new ModuleCapability<>("ResolutionAnchorProvider");

    @Nullable
    public static final ModuleDescriptor getResolutionAnchorIfAny(@NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        ResolutionAnchorProvider resolutionAnchorProvider = (ResolutionAnchorProvider) moduleDescriptor.getCapability(f81529a);
        if (resolutionAnchorProvider != null) {
            return resolutionAnchorProvider.getResolutionAnchor(moduleDescriptor);
        }
        return null;
    }
}
