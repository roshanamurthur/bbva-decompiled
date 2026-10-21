package com.noknok.android.client.asm.descriptor.fps;

import android.content.Context;
import android.os.Build;
import androidx.camera.core.impl.v;
import com.noknok.android.client.asm.akselector.fps.FpAkSelector;
import com.noknok.android.client.asm.api.MatcherProtection;
import com.noknok.android.client.asm.api.UserVerification;
import com.noknok.android.client.asm.authui.fps.BiometricMatcher;
import com.noknok.android.client.asm.authui.fps.FpMatcher;
import com.noknok.android.client.asm.authui.fps.R;
import com.noknok.android.client.asm.json.FingerprintUIConfig;
import com.noknok.android.client.asm.sdk.IAKSelector;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IMatcher;
import java.util.ArrayList;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes11.dex */
public class FpAuthDescriptor extends IAuthenticatorDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63270a;

    public FpAuthDescriptor(Context context) {
        this.f63270a = context;
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo.aaid = "4e4e#4010";
        aAIDInfo.label = "NNL_KS_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB = v.b(this.mAAIDInfoList, "NNL_KS_UAF", aAIDInfo);
        aAIDInfoB.aaid = "4e4e#4013";
        aAIDInfoB.label = "NNL_KS_SFT_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB2 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_UAF", aAIDInfoB);
        aAIDInfoB2.aaid = "4e4e#4018";
        aAIDInfoB2.label = "NNL_KS_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB3 = v.b(this.mAAIDInfoList, "NNL_KS_RSA_UAF", aAIDInfoB2);
        aAIDInfoB3.aaid = "4e4e#40a1";
        aAIDInfoB3.label = "NNL_KS_SFT_RSA_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB4 = v.b(this.mAAIDInfoList, "NNL_KS_SFT_RSA_UAF", aAIDInfoB3);
        aAIDInfoB4.aaid = "4e4e#4038";
        aAIDInfoB4.label = "NNL_KS_SE_UAF";
        IAuthenticatorDescriptor.AAIDInfo aAIDInfoB5 = v.b(this.mAAIDInfoList, "NNL_KS_SE_UAF", aAIDInfoB4);
        aAIDInfoB5.aaid = "4e4e#403a";
        aAIDInfoB5.label = "NNL_KS_SE_RSA_UAF";
        this.mAAIDInfoList.put("NNL_KS_SE_RSA_UAF", aAIDInfoB5);
    }

    public static boolean useBiometric(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            return false;
        }
        if (i10 >= 30) {
            return true;
        }
        return FingerprintUIConfig.get(context).currentDevice().useBiometric();
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IAKSelector> getAuthenticatorSelectorClass() {
        return FpAkSelector.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getDescription() {
        return useBiometric(this.f63270a) ? R.string.nnl_asm_native_fps_bm_description : R.string.nnl_asm_native_fps_description;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public ArrayList<String> getExtensionProcessors() {
        return null;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getIcon() {
        return useBiometric(this.f63270a) ? R.drawable.nnl_asm_native_bm_launcher_icon : R.drawable.nnl_asm_native_fps_launcher_icon;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IMatcher> getMatcherClass() {
        return useBiometric(this.f63270a) ? BiometricMatcher.StrongMatcher.class : FpMatcher.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public MatcherProtection getMatcherProtection() {
        return MatcherProtection.MATCHER_PROTECTION_TEE;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getTitle() {
        return useBiometric(this.f63270a) ? R.string.nnl_asm_native_fps_bm_title : R.string.nnl_asm_native_fps_title;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public EnumSet<UserVerification> getUserVerification() {
        return useBiometric(this.f63270a) ? EnumSet.of(UserVerification.USER_VERIFY_FINGERPRINT, UserVerification.USER_VERIFY_EYEPRINT, UserVerification.USER_VERIFY_FACEPRINT) : EnumSet.of(UserVerification.USER_VERIFY_FINGERPRINT);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public boolean isAKManagedMatcher() {
        return true;
    }
}
