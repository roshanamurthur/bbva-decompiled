package com.noknok.android.client.appsdk_plus.registration;

/* JADX INFO: loaded from: classes11.dex */
public abstract class FidoRegUIFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static FidoRegUIFactory f63080a;

    public static synchronized FidoRegUIFactory getInstance() {
        try {
            if (f63080a == null) {
                setInstance(new DefaultFidoRegUIFactory());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63080a;
    }

    public static void setInstance(FidoRegUIFactory fidoRegUIFactory) {
        f63080a = fidoRegUIFactory;
    }

    public abstract BaseFidoRegFragment createFragment(FidoRegistrationController fidoRegistrationController);
}
