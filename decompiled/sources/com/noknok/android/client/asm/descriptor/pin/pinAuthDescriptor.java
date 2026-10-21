package com.noknok.android.client.asm.descriptor.pin;

import android.content.Context;
import androidx.camera.core.impl.v;
import com.noknok.android.client.asm.akselector.generic.GenericAKSelector;
import com.noknok.android.client.asm.api.UserVerification;
import com.noknok.android.client.asm.authui.pin.PINMatcher;
import com.noknok.android.client.asm.authui.pin.R;
import com.noknok.android.client.asm.sdk.IAKSelector;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IMatcher;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes11.dex */
public class pinAuthDescriptor extends IAuthenticatorDescriptor {
    public pinAuthDescriptor(Context context) {
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo.aaid = "4e4e#4006";
        aAIDInfo.label = "NNL_KS_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB = v.b(this.mAAIDInfoList, "NNL_KS_UAF", aAIDInfo);
        aAIDInfoB.aaid = "4e4e#4015";
        aAIDInfoB.label = "NNL_KS_SFT_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB2 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_UAF", aAIDInfoB);
        aAIDInfoB2.aaid = "4e4e#4019";
        aAIDInfoB2.label = "NNL_KS_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB3 = v.b(this.mAAIDInfoList, "NNL_KS_RSA_UAF", aAIDInfoB2);
        aAIDInfoB3.aaid = "4e4e#40a0";
        aAIDInfoB3.label = "NNL_KS_SFT_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB4 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_RSA_UAF", aAIDInfoB3);
        aAIDInfoB4.aaid = "4e4e#4037";
        aAIDInfoB4.label = "NNL_KS_SE_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB5 = v.b(this.mAAIDInfoList, "NNL_KS_SE_UAF", aAIDInfoB4);
        aAIDInfoB5.aaid = "4e4e#403b";
        aAIDInfoB5.label = "NNL_KS_SE_RSA_UAF";
        this.mAAIDInfoList.put("NNL_KS_SE_RSA_UAF", aAIDInfoB5);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IAKSelector> getAuthenticatorSelectorClass() {
        return GenericAKSelector.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getDescription() {
        return R.string.nnl_asm_pin_description;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getIcon() {
        return R.drawable.nnl_asm_pin_launcher_icon;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IMatcher> getMatcherClass() {
        return PINMatcher.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getTitle() {
        return R.string.nnl_asm_pin_title;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public EnumSet<UserVerification> getUserVerification() {
        return EnumSet.of(UserVerification.USER_VERIFY_PASSCODE);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public boolean hasSettings() {
        return true;
    }
}
