package com.noknok.android.client.appsdk_plus.pending_auth;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultPendingAuthsUIFactory extends PendingAuthsUIFactory {
    @Override // com.noknok.android.client.appsdk_plus.pending_auth.PendingAuthsUIFactory
    public BasePendingAuthsFragment createFragment(PendingAuthsController pendingAuthsController) {
        return new PendingAuthsFragment(pendingAuthsController);
    }
}
