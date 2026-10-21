package com.noknok.android.client.appsdk_plus.management;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ManageUIFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ManageUIFactory f63005a;

    public static synchronized ManageUIFactory getInstance() {
        try {
            if (f63005a == null) {
                setInstance(new DefaultManageUIFactory());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63005a;
    }

    public static void setInstance(ManageUIFactory manageUIFactory) {
        f63005a = manageUIFactory;
    }

    public abstract BaseManageFragment createFragment(ManageRegistrationController manageRegistrationController);
}
