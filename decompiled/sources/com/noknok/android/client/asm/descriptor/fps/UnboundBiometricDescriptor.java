package com.noknok.android.client.asm.descriptor.fps;

import android.content.Context;
import androidx.camera.core.impl.v;
import com.noknok.android.client.asm.akselector.fps.UnboundBiometricAkSelector;
import com.noknok.android.client.asm.api.MatcherProtection;
import com.noknok.android.client.asm.api.UserVerification;
import com.noknok.android.client.asm.authui.fps.BiometricMatcher;
import com.noknok.android.client.asm.authui.fps.R;
import com.noknok.android.client.asm.sdk.IAKSelector;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IMatcher;
import java.util.ArrayList;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes11.dex */
public class UnboundBiometricDescriptor extends IAuthenticatorDescriptor {
    public UnboundBiometricDescriptor(Context context) {
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo.aaid = "4e4e#40aa";
        aAIDInfo.label = "NNL_KS_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB = v.b(this.mAAIDInfoList, "NNL_KS_UAF", aAIDInfo);
        aAIDInfoB.aaid = "4e4e#40ab";
        aAIDInfoB.label = "NNL_KS_SFT_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB2 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_UAF", aAIDInfoB);
        aAIDInfoB2.aaid = "4e4e#40ac";
        aAIDInfoB2.label = "NNL_KS_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB3 = v.b(this.mAAIDInfoList, "NNL_KS_RSA_UAF", aAIDInfoB2);
        aAIDInfoB3.aaid = "4e4e#40ad";
        aAIDInfoB3.label = "NNL_KS_SFT_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB4 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_RSA_UAF", aAIDInfoB3);
        aAIDInfoB4.aaid = "4e4e#40ae";
        aAIDInfoB4.label = "NNL_KS_SE_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB5 = v.b(this.mAAIDInfoList, "NNL_KS_SE_UAF", aAIDInfoB4);
        aAIDInfoB5.aaid = "4e4e#40af";
        aAIDInfoB5.label = "NNL_KS_SE_RSA_UAF";
        this.mAAIDInfoList.put("NNL_KS_SE_RSA_UAF", aAIDInfoB5);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IAKSelector> getAuthenticatorSelectorClass() {
        return UnboundBiometricAkSelector.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getDescription() {
        return R.string.nnl_asm_native_fps_bm_description;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public ArrayList<String> getExtensionProcessors() {
        return null;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getIcon() {
        return R.drawable.nnl_asm_native_bm_launcher_icon;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IMatcher> getMatcherClass() {
        return BiometricMatcher.WeakMatcher.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public MatcherProtection getMatcherProtection() {
        return MatcherProtection.MATCHER_PROTECTION_SOFTWARE;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getTitle() {
        return R.string.nnl_asm_native_fps_bm_title;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public EnumSet<UserVerification> getUserVerification() {
        return EnumSet.of(UserVerification.USER_VERIFY_FINGERPRINT, UserVerification.USER_VERIFY_EYEPRINT, UserVerification.USER_VERIFY_FACEPRINT);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public boolean isAKManagedMatcher() {
        return true;
    }
}
