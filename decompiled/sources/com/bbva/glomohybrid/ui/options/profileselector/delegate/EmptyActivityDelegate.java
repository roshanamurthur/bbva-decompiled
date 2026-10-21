package com.bbva.glomohybrid.ui.options.profileselector.delegate;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EmptyActivityDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/EmptyActivityDelegate;", "Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeActivityDelegate;", "()V", "registerObservers", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EmptyActivityDelegate implements UserTypeActivityDelegate {

    @NotNull
    public static final EmptyActivityDelegate INSTANCE = new EmptyActivityDelegate();

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeActivityDelegate
    public void registerObservers(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }
}
