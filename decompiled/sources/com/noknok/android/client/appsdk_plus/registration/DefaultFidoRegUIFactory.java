package com.noknok.android.client.appsdk_plus.registration;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultFidoRegUIFactory extends FidoRegUIFactory {
    @Override // com.noknok.android.client.appsdk_plus.registration.FidoRegUIFactory
    public BaseFidoRegFragment createFragment(FidoRegistrationController fidoRegistrationController) {
        return new FidoRegisterFragment(fidoRegistrationController);
    }
}
