package com.noknok.android.client.asm.keyguard;

import android.content.Context;
import androidx.camera.core.impl.v;
import com.noknok.android.client.asm.api.UserVerification;
import com.noknok.android.client.asm.sdk.IAKSelector;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IMatcher;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes11.dex */
public class KgAuthDescriptor extends IAuthenticatorDescriptor {
    public KgAuthDescriptor(Context context) {
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo.aaid = "4e4e#401e";
        aAIDInfo.label = "NNL_KS_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB = v.b(this.mAAIDInfoList, "NNL_KS_UAF", aAIDInfo);
        aAIDInfoB.aaid = "4e4e#401f";
        aAIDInfoB.label = "NNL_KS_SFT_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB2 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_UAF", aAIDInfoB);
        aAIDInfoB2.aaid = "4e4e#4022";
        aAIDInfoB2.label = "NNL_KS_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB3 = v.b(this.mAAIDInfoList, "NNL_KS_RSA_UAF", aAIDInfoB2);
        aAIDInfoB3.aaid = "4e4e#40a2";
        aAIDInfoB3.label = "NNL_KS_SFT_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB4 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_RSA_UAF", aAIDInfoB3);
        aAIDInfoB4.aaid = "4e4e#4020";
        aAIDInfoB4.label = "NNL_KS_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB5 = v.b(this.mAAIDInfoList, "NNL_KS_UAF", aAIDInfoB4);
        aAIDInfoB5.aaid = "4e4e#4021";
        aAIDInfoB5.label = "NNL_KS_SFT_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB6 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_UAF", aAIDInfoB5);
        aAIDInfoB6.aaid = "4e4e#4023";
        aAIDInfoB6.label = "NNL_KS_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB7 = v.b(this.mAAIDInfoList, "NNL_KS_RSA_UAF", aAIDInfoB6);
        aAIDInfoB7.aaid = "4e4e#40a3";
        aAIDInfoB7.label = "NNL_KS_SFT_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB8 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_RSA_UAF", aAIDInfoB7);
        aAIDInfoB8.aaid = "4e4e#403c";
        aAIDInfoB8.label = "NNL_KS_SE_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB9 = v.b(this.mAAIDInfoList, "NNL_KS_SE_UAF", aAIDInfoB8);
        aAIDInfoB9.aaid = "4e4e#403d";
        aAIDInfoB9.label = "NNL_KS_SE_RSA_UAF";
        this.mAAIDInfoList.put("NNL_KS_SE_RSA_UAF", aAIDInfoB9);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IAKSelector> getAuthenticatorSelectorClass() {
        return KgAkSelector.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getDescription() {
        return R.string.nnl_kg_description;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getIcon() {
        return R.drawable.nnl_kg_launcher_icon;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IMatcher> getMatcherClass() {
        return KgMatcher.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getTitle() {
        return R.string.nnl_kg_title;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public EnumSet<UserVerification> getUserVerification() {
        return EnumSet.of(UserVerification.USER_VERIFY_FINGERPRINT, UserVerification.USER_VERIFY_PASSCODE, UserVerification.USER_VERIFY_PATTERN);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public boolean isAKManagedMatcher() {
        return true;
    }
}
