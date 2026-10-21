package com.noknok.android.client.appsdk_plus.registration;

/* JADX INFO: loaded from: classes11.dex */
public class FidoMethod {
    public String mAaid;
    public String mAuthenticatorAttachment;
    public String mFido2CredentialId;
    public String mIcon;
    public boolean mIsRegPossible;
    public String mTitle;

    public boolean isFido2() {
        return this.mAuthenticatorAttachment != null;
    }
}
