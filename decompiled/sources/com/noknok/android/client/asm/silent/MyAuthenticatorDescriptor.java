package com.noknok.android.client.asm.silent;

import android.content.Context;
import com.noknok.android.client.asm.akselector.generic.GenericAKSelector;
import com.noknok.android.client.asm.api.UserVerification;
import com.noknok.android.client.asm.sdk.IAKSelector;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IMatcher;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class MyAuthenticatorDescriptor extends IAuthenticatorDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, IAuthenticatorDescriptor.AAIDInfo> f63304a;

    public MyAuthenticatorDescriptor(Context context) {
        HashMap map = new HashMap(3);
        this.f63304a = map;
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo.aaid = "4e4e#4090";
        aAIDInfo.label = "NNL_KS_UAF";
        map.put("NNL_KS_UAF", aAIDInfo);
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo2 = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo2.aaid = "4e4e#4091";
        aAIDInfo2.label = "NNL_KS_SFT_UAF";
        map.put("NNL_KS_SFT_UAF", aAIDInfo2);
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo3 = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo3.aaid = "4e4e#4092";
        aAIDInfo3.label = "NNL_KS_RSA_UAF";
        map.put("NNL_KS_RSA_UAF", aAIDInfo3);
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo4 = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo4.aaid = "4e4e#40a5";
        aAIDInfo4.label = "NNL_KS_SFT_RSA_UAF";
        map.put("NNL_KS_SFT_RSA_UAF", aAIDInfo4);
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo5 = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo5.aaid = "4e4e#403f";
        aAIDInfo5.label = "NNL_KS_SE_UAF";
        map.put("NNL_KS_SE_UAF", aAIDInfo5);
        IAuthenticatorDescriptor.AAIDInfo aAIDInfo6 = new IAuthenticatorDescriptor.AAIDInfo();
        aAIDInfo6.aaid = "4e4e#4040";
        aAIDInfo6.label = "NNL_KS_SE_RSA_UAF";
        map.put("NNL_KS_SE_RSA_UAF", aAIDInfo6);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Map<String, IAuthenticatorDescriptor.AAIDInfo> getAAIDInfo() {
        return this.f63304a;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IAKSelector> getAuthenticatorSelectorClass() {
        return GenericAKSelector.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getDescription() {
        return R.string.nnl_asm_silent_description;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getIcon() {
        return R.drawable.nnl_asm_silent_launcher_icon;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public Class<? extends IMatcher> getMatcherClass() {
        return MyMatcher.class;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getTitle() {
        return R.string.nnl_asm_silent_title;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public EnumSet<UserVerification> getUserVerification() {
        return EnumSet.of(UserVerification.USER_VERIFY_NONE);
    }
}
