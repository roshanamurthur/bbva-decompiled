package com.bbva.smartassistance.listeners;

import kotlin.Metadata;
import net.ipsoft.amelia.sdk.BaseConversation;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomBaseConversation.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/smartassistance/listeners/CustomBaseConversation;", "", "Lnet/ipsoft/amelia/sdk/BaseConversation;", "a", "Lnet/ipsoft/amelia/sdk/BaseConversation;", "getBaseConversation", "()Lnet/ipsoft/amelia/sdk/BaseConversation;", "setBaseConversation", "(Lnet/ipsoft/amelia/sdk/BaseConversation;)V", "baseConversation", "<init>", "()V", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0})
public final class CustomBaseConversation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public BaseConversation baseConversation;

    @Nullable
    public final BaseConversation getBaseConversation() {
        return this.baseConversation;
    }

    public final void setBaseConversation(@Nullable BaseConversation baseConversation) {
        this.baseConversation = baseConversation;
    }
}
