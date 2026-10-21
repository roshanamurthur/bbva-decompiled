package com.noknok.android.client.asm.authenticator.matcherparams;

import android.content.Context;
import com.noknok.android.client.asm.core.ICryptoLayer;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Charsets;
import java.security.Signature;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class KSMatcherOutParams extends ICryptoLayer.OutParams {
    private static final byte[] MANAGED_MATCHER_UVI = "fakeRawUVI".getBytes(Charsets.utf8Charset);
    private Signature m_Signature;

    public static class KSMatcherOutParamsBuilder {
        private Signature mAuthSignature;
        private IMatcher.RESULT matchResult;
        private byte[] userID;

        public KSMatcherOutParams createKSMatcherOutParams(Context context) {
            return new KSMatcherOutParams(context, this.matchResult, this.userID, null, this.mAuthSignature);
        }

        public KSMatcherOutParamsBuilder setAuthSignature(Signature signature) {
            this.mAuthSignature = signature;
            return this;
        }

        public KSMatcherOutParamsBuilder setMatchResult(IMatcher.RESULT result) {
            this.matchResult = result;
            return this;
        }

        public KSMatcherOutParamsBuilder setUserID(byte[] bArr) {
            this.userID = bArr;
            return this;
        }
    }

    public KSMatcherOutParams(Context context, IMatcher.RESULT result, byte[] bArr, List<IMatcher.Extension> list, Signature signature) {
        super(result, bArr, list);
        if (signature != null) {
            this.m_Signature = signature;
        }
        if (AppSDKConfig.getInstance(context).get(AppSDKConfig.Key.sendFakeUVI).getAsBoolean()) {
            this.m_RawUVI = MANAGED_MATCHER_UVI;
        }
    }

    public Signature getSignature() {
        return this.m_Signature;
    }

    public KSMatcherOutParams setResult(IMatcher.RESULT result) {
        this.m_MatchResult = result;
        return this;
    }

    public KSMatcherOutParams setUserID(byte[] bArr) {
        this.m_UserID = bArr;
        return this;
    }
}
