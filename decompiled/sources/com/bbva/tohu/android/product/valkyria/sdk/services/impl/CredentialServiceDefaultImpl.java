package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.exceptions.NetworkNotPresentException;
import com.bbva.tohu.android.core.exceptions.backend.TohuBackendException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.ArmadilloManager;
import com.bbva.tohu.android.product.valkyria.sdk.managers.PropertiesManager;
import com.bbva.tohu.android.product.valkyria.sdk.services.ArmadilloService;
import com.bbva.tohu.android.product.valkyria.sdk.services.CredentialService;

/* JADX INFO: loaded from: classes6.dex */
public class CredentialServiceDefaultImpl implements CredentialService {
    private ArmadilloManager armadilloManager;
    private ArmadilloService armadilloService;
    private PropertiesManager propertiesManager;

    public CredentialServiceDefaultImpl(ArmadilloService armadilloService, ArmadilloManager armadilloManager, PropertiesManager propertiesManager) {
        this.armadilloService = armadilloService;
        this.armadilloManager = armadilloManager;
        this.propertiesManager = propertiesManager;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.CredentialService
    public String getJwt(String str) throws TohuBackendException, NetworkNotPresentException {
        return this.armadilloService.getAuthToken(this.armadilloManager.getAuthBasic(), str).getAccess_token();
    }
}
