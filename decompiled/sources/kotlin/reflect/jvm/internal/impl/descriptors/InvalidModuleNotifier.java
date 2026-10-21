package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InvalidModuleException.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface InvalidModuleNotifier {
    void notifyModuleInvalidated(@NotNull ModuleDescriptor moduleDescriptor);
}
