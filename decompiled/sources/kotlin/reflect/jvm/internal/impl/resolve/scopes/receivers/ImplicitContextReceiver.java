package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImplicitReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface ImplicitContextReceiver extends ImplicitReceiver {
    @Nullable
    Name getCustomLabelName();
}
