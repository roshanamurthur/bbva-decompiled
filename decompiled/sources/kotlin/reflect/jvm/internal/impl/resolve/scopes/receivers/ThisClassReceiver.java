package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImplicitClassReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface ThisClassReceiver extends ReceiverValue {
    @NotNull
    ClassDescriptor getClassDescriptor();
}
