package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InvalidModuleException.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class InvalidModuleExceptionKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ModuleCapability<InvalidModuleNotifier> f80206a = new ModuleCapability<>("InvalidModuleNotifier");

    public static final void moduleInvalidated(@NotNull ModuleDescriptor moduleDescriptor) {
        Unit unit;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) moduleDescriptor.getCapability(f80206a);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.notifyModuleInvalidated(moduleDescriptor);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + moduleDescriptor);
    }
}
