package com.noknok.android.client.asm.core;

import com.noknok.android.client.asm.sdk.IAuthenticatorKernel;
import com.noknok.android.client.asm.sdk.IMatcher;
import java.security.Signature;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface ICryptoLayer {

    public static class OutParams extends IMatcher.MatcherOutParams {
        protected byte m_MatcherVersion;
        protected byte[] m_MatchingScore;
        protected byte[] m_RawUVI;
        protected byte[] m_RawUVS;
        protected int m_UserVerificationMethod;

        public OutParams(IMatcher.RESULT result, byte[] bArr, List<IMatcher.Extension> list) {
            super(result, bArr, list);
            this.m_MatcherVersion = (byte) 0;
            this.m_UserVerificationMethod = 0;
        }
    }

    byte[] exportPublicKey(byte[] bArr);

    byte[] generateKey(Map<IAuthenticatorKernel.AKDataKeys, Object> map);

    String getLabel();

    void removeKey(byte[] bArr);

    byte[] signData(byte[] bArr, byte[] bArr2, Map<IAuthenticatorKernel.AKDataKeys, Object> map, Signature signature);

    int unwrapGetLength(int i10, byte b10);

    byte[] unwrapObject(byte[] bArr);

    OutParams verifyUser(byte[] bArr, boolean z10, Map<IAuthenticatorKernel.AKDataKeys, Object> map);

    int wrapGetLength(int i10);

    byte[] wrapObject(byte[] bArr);
}
