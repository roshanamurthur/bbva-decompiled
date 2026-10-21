package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StdlibClassFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface StdlibClassFinder {
    @Nullable
    ClassDescriptor findEnumEntriesClass(@NotNull ModuleDescriptor moduleDescriptor);
}
