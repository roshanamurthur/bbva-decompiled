package net.ipsoft.amelia.sdk;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseConversation implements Parcelable {
    public abstract String getConversationId();

    public abstract BaseDomain getInitialDomain();

    public abstract String getMood();

    public abstract long getTimeOfLastMessage();

    public abstract boolean isExistingConversation();

    public abstract boolean isInputEnabled();

    public abstract boolean isMuted();

    public abstract boolean isSecureInputEnabled();
}
