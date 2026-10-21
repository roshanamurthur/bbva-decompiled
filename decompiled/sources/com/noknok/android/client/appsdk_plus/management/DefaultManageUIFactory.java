package com.noknok.android.client.appsdk_plus.management;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultManageUIFactory extends ManageUIFactory {
    @Override // com.noknok.android.client.appsdk_plus.management.ManageUIFactory
    public BaseManageFragment createFragment(ManageRegistrationController manageRegistrationController) {
        return new TokenDeregistrationFragment(manageRegistrationController);
    }
}
