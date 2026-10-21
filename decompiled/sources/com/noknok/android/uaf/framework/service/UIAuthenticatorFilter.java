package com.noknok.android.uaf.framework.service;

import android.content.Intent;
import com.fido.android.framework.service.Mfac;
import com.noknok.android.client.appsdk.AsmSelectionUI;
import com.noknok.android.client.appsdk.AsmSelectionUIFactory;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.AuthenticatorFilterInParams;
import com.noknok.android.client.utils.AuthenticatorFilterOutParams;
import com.noknok.android.client.utils.IAuthenticatorFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class UIAuthenticatorFilter implements IAuthenticatorFilter {
    @Override // com.noknok.android.client.utils.IAuthenticatorFilter
    public AuthenticatorFilterOutParams process(AuthenticatorFilterInParams authenticatorFilterInParams) {
        Integer numValueOf;
        if (authenticatorFilterInParams.authenticators.size() <= 1 || authenticatorFilterInParams.checkPolicy) {
            return new AuthenticatorFilterOutParams().setAuthenticators(authenticatorFilterInParams.authenticators);
        }
        if (!Mfac.Instance().getConfig().get(AppSDKConfig.Key.asmSelectionEnabled).getAsBoolean()) {
            numValueOf = 0;
        } else if (AsmSelectionUIFactory.getInstance() != null) {
            numValueOf = Integer.valueOf(AsmSelectionUIFactory.getInstance().createAsmSelectionUIInstance().openUI(authenticatorFilterInParams.activityProxy, authenticatorFilterInParams.authenticators, authenticatorFilterInParams.operationType.equals(IAuthenticatorFilter.OperationType.Reg) ? AsmSelectionUI.OperationType.Reg : AsmSelectionUI.OperationType.Auth, authenticatorFilterInParams.showWhenLocked));
        } else {
            if (!authenticatorFilterInParams.activityProxy.hasActivity()) {
                throw new IllegalArgumentException("Caller Activity is required for starting ASM selection UI");
            }
            Intent intentCreateIntent = authenticatorFilterInParams.activityProxy.createIntent(SelectAuthenticatorActivity.class);
            intentCreateIntent.putExtra("KEY_SHOW_WHEN_LOCKED", authenticatorFilterInParams.showWhenLocked);
            numValueOf = (Integer) authenticatorFilterInParams.activityProxy.startActivityForResult(intentCreateIntent, authenticatorFilterInParams.authenticators);
        }
        if (numValueOf == null || numValueOf.intValue() == -1) {
            return new AuthenticatorFilterOutParams().setOperationCanceled(true);
        }
        if (numValueOf.intValue() == -2) {
            return new AuthenticatorFilterOutParams().setOperationSystemCanceled(true);
        }
        if (numValueOf.intValue() == -3) {
            return new AuthenticatorFilterOutParams().setOperationTimeout(true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(authenticatorFilterInParams.authenticators.get(numValueOf.intValue()));
        return new AuthenticatorFilterOutParams().setAuthenticators(arrayList);
    }
}
