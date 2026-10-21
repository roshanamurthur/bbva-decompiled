package com.noknok.android.client.appsdk_plus.pending_auth;

/* JADX INFO: loaded from: classes11.dex */
public abstract class PendingAuthsUIFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile PendingAuthsUIFactory f63049a;

    public static PendingAuthsUIFactory getInstance() {
        if (f63049a == null) {
            synchronized (PendingAuthsUIFactory.class) {
                try {
                    if (f63049a == null) {
                        setInstance(new DefaultPendingAuthsUIFactory());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f63049a;
    }

    public static void setInstance(PendingAuthsUIFactory pendingAuthsUIFactory) {
        f63049a = pendingAuthsUIFactory;
    }

    public abstract BasePendingAuthsFragment createFragment(PendingAuthsController pendingAuthsController);
}
