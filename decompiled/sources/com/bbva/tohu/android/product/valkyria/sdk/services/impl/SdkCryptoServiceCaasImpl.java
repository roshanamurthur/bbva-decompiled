package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.request.backend.CypheredRequest;
import com.bbva.tohu.android.core.response.backend.CypheredResponse;
import com.bbva.tohu.android.product.valkyria.sdk.managers.CryptoKeyManager;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.CardProfileDataMdesCmsC;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.DecTokenInfo;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.IccCrtPrivateKeyContainer;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.VtsCardProfile;
import com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService;
import com.bbva.tohu.android.product.valkyria.sdk.services.SdkCryptoServiceCaas;
import com.bbva.tohu.android.product.valkyria.sdk.services.SerializerService;

/* JADX INFO: loaded from: classes6.dex */
public class SdkCryptoServiceCaasImpl implements SdkCryptoServiceCaas {
    private EncoderService encoderService;
    private CryptoKeyManager mCryptoKeyManager;
    private SerializerService serializerService;

    public SdkCryptoServiceCaasImpl(CryptoKeyManager cryptoKeyManager, SerializerService serializerService, EncoderService encoderService) {
        this.mCryptoKeyManager = cryptoKeyManager;
        this.serializerService = serializerService;
        this.encoderService = encoderService;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SdkCryptoServiceCaas
    public Object decryptTransportWithSecChannelAndDeserialize(CypheredResponse cypheredResponse, Class cls) throws CryptoInitException {
        return this.serializerService.deserialize(this.mCryptoKeyManager.decryptTransportWithSecChannel(cypheredResponse), cls);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SdkCryptoServiceCaas
    public String serializeAndDeserializeForDecryptMcCardProfile(String str) throws CryptoInitException {
        CardProfileDataMdesCmsC cardProfileDataMdesCmsCDeserializeMcCardProfile = this.serializerService.deserializeMcCardProfile(this.encoderService.decodeBase64url(str));
        cardProfileDataMdesCmsCDeserializeMcCardProfile.setIccKek(this.encoderService.hexStringFromBytes(this.mCryptoKeyManager.decryptSecContent(this.encoderService.bytesFromHexString(cardProfileDataMdesCmsCDeserializeMcCardProfile.getIccKek()))));
        return this.serializerService.serializeMcCardProfile(cardProfileDataMdesCmsCDeserializeMcCardProfile);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SdkCryptoServiceCaas
    public String serializeAndDeserializeForDecryptVtsCardProfile(String str) throws CryptoInitException {
        VtsCardProfile vtsCardProfileDeserializeVtsCardProfile = this.serializerService.deserializeVtsCardProfile(this.encoderService.decodeBase64url(str));
        vtsCardProfileDeserializeVtsCardProfile.setToken(((DecTokenInfo) this.serializerService.deserialize(this.encoderService.decodeBase64url(vtsCardProfileDeserializeVtsCardProfile.getDecTokenInfo()).trim(), DecTokenInfo.class)).getToken());
        if (vtsCardProfileDeserializeVtsCardProfile.getIccPrivateKey() != null) {
            vtsCardProfileDeserializeVtsCardProfile.setIccCRTPrivateKey(((IccCrtPrivateKeyContainer) this.serializerService.deserialize(new String(this.mCryptoKeyManager.decryptSecContent(this.encoderService.base64ToBytes(vtsCardProfileDeserializeVtsCardProfile.getIccPrivateKey()))).trim(), IccCrtPrivateKeyContainer.class)).getIccCRTPrivateKey());
        }
        return this.serializerService.serializeVtsCardProfile(vtsCardProfileDeserializeVtsCardProfile);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.SdkCryptoServiceCaas
    public CypheredRequest serializeAndEncryptTransportWithSecChannel(Object obj) throws CryptoInitException {
        return this.mCryptoKeyManager.encryptTransportWithSecChannel(this.serializerService.serialize(obj));
    }
}
