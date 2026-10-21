package com.noknok.android.client.asm.presence;

import android.content.Context;
import androidx.camera.core.impl.v;
import com.noknok.android.client.asm.akselector.generic.GenericAKSelector;
import com.noknok.android.client.asm.api.UserVerification;
import com.noknok.android.client.asm.sdk.IAKSelector;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IMatcher;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes11.dex */
public class PresenceAuthDescriptor extends IAuthenticatorDescriptor {
    public PresenceAuthDescriptor(Context context) {
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo.aaid = "4e4e#400d";
        aAIDInfo.label = "NNL_KS_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB = v.b(this.mAAIDInfoList, "NNL_KS_UAF", aAIDInfo);
        aAIDInfoB.aaid = "4e4e#4017";
        aAIDInfoB.label = "NNL_KS_SFT_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB2 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_UAF", aAIDInfoB);
        aAIDInfoB2.aaid = "4e4e#401b";
        aAIDInfoB2.label = "NNL_KS_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB3 = v.b(this.mAAIDInfoList, "NNL_KS_RSA_UAF", aAIDInfoB2);
        aAIDInfoB3.aaid = "4e4e#40a4";
        aAIDInfoB3.label = "NNL_KS_SFT_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB4 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_RSA_UAF", aAIDInfoB3);
        aAIDInfoB4.aaid = "4e4e#4030";
        aAIDInfoB4.label = "NNL_KS_SE_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB5 = v.b(this.mAAIDInfoList, "NNL_KS_SE_UAF", aAIDInfoB4);
        aAIDInfoB5.aaid = "4e4e#4032";
        aAIDInfoB5.label = "NNL_KS_SE_RSA_UAF";
        this.mAAIDInfoList.put("NNL_KS_SE_RSA_UAF", aAIDInfoB5);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IAKSelector> getAuthenticatorSelectorClass() {
        return GenericAKSelector.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getDescription() {
        return R.string.nnl_asm_presence_description;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getIcon() {
        return R.drawable.nnl_asm_presence_icon;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IMatcher> getMatcherClass() {
        return PresenceMatcher.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getTitle() {
        return R.string.nnl_asm_presence_title;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public IAuthenticatorDescriptor.TransactionUI getTransactionUIType() {
        return IAuthenticatorDescriptor.TransactionUI.Custom;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public EnumSet<UserVerification> getUserVerification() {
        return EnumSet.of(UserVerification.USER_VERIFY_PRESENCE);
    }
}
