package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResolutionAnchorProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface ResolutionAnchorProvider {
    @Nullable
    ModuleDescriptor getResolutionAnchor(@NotNull ModuleDescriptor moduleDescriptor);
}
