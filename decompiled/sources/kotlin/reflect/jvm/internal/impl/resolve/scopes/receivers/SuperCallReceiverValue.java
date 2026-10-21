package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SuperCallReceiverValue.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface SuperCallReceiverValue extends ReceiverValue {
    @NotNull
    KotlinType getThisType();
}
