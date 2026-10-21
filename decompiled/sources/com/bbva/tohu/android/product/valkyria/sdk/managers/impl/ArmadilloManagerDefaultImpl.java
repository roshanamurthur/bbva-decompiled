package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import com.bbva.tohu.android.product.valkyria.sdk.managers.ArmadilloManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager;

/* JADX INFO: loaded from: classes6.dex */
public class ArmadilloManagerDefaultImpl implements ArmadilloManager {
    private static final String AUTH_BASIC_KEY_NAME = "AUTH_BASE_URL_";
    private PropertiesManager propertiesManager;

    public ArmadilloManagerDefaultImpl(PropertiesManager propertiesManager) {
        this.propertiesManager = propertiesManager;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.ArmadilloManager
    public String getAuthBasic() {
        return this.propertiesManager.getArmadilloAuthBasic();
    }
}
