package com.noknok.android.client.asm.sdk;

import com.noknok.android.client.asm.api.MatcherProtection;
import com.noknok.android.client.asm.api.UserVerification;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IAuthenticatorDescriptor {
    protected final Map<String, AAIDInfo> mAAIDInfoList = new HashMap();

    public static class AAIDInfo {
        public String aaid;
        public String label;
    }

    public enum TransactionUI {
        None,
        Default,
        Custom
    }

    public Map<String, AAIDInfo> getAAIDInfo() {
        return this.mAAIDInfoList;
    }

    public abstract Class<? extends IAKSelector> getAuthenticatorSelectorClass();

    public abstract int getDescription();

    public ArrayList<String> getExtensionProcessors() {
        return null;
    }

    public abstract int getIcon();

    public abstract Class<? extends IMatcher> getMatcherClass();

    public MatcherProtection getMatcherProtection() {
        return MatcherProtection.MATCHER_PROTECTION_SOFTWARE;
    }

    public abstract int getTitle();

    public TransactionUI getTransactionUIType() {
        return TransactionUI.Default;
    }

    public abstract EnumSet<UserVerification> getUserVerification();

    public boolean hasSettings() {
        return false;
    }

    public boolean isAKManagedMatcher() {
        return false;
    }
}
