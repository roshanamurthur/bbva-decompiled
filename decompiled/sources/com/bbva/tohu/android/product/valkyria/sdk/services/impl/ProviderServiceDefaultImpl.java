package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.UnknowProviderException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import com.bbva.tohu.android.product.valkyria.sdk.payments.HceLogic;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.apdu.PaypassHceLogic;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;
import com.bbva.tohu.android.product.valkyria.sdk.response.backend.GetToken;
import com.bbva.tohu.android.product.valkyria.sdk.services.ProviderService;
import com.bbva.tohu.android.product.valkyria.sdk.services.SdkCryptoServiceCaas;
import com.bbva.tohu.android.product.valkyria.sdk.utils.CardUtils;

/* JADX INFO: loaded from: classes6.dex */
public class ProviderServiceDefaultImpl implements ProviderService {
    private static final String MDES_PAN_JSON_TEMPLATE = "{\"accountNumber\":\"%s\",\"expiryMonth\":\"%s\",\"expiryYear\":\"%s\",\"source\":\"CARD_ON_FILE\"}";
    private static final String TAG = "ProviderServiceDefaultImpl";
    private static final String VTS_PAN_JSON_TEMPLATE = "{\"accountNumber\":\"%s\",\"expirationDate\":{\"month\":\"%s\",\"year\":\"%s\"}}";
    private SdkCryptoServiceCaas msdkCryptoServiceCaas;
    private final HceLogic paypassHceLogic;
    private final HceLogic paywaveHceLogic;

    public ProviderServiceDefaultImpl(SdkCryptoServiceCaas sdkCryptoServiceCaas, PaywaveHceLogic paywaveHceLogic, PaypassHceLogic paypassHceLogic) {
        this.msdkCryptoServiceCaas = sdkCryptoServiceCaas;
        this.paypassHceLogic = paypassHceLogic;
        this.paywaveHceLogic = paywaveHceLogic;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ProviderService
    public HceLogic getHceLogicByProvider(String str) throws TohuSdkException {
        if (ProviderType.PROVIDER_ID_MASTERCARD.equals(str)) {
            return this.paypassHceLogic;
        }
        if (ProviderType.PROVIDER_ID_VISA.equals(str)) {
            return this.paywaveHceLogic;
        }
        throw new UnknowProviderException(str);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ProviderService
    public String getPanInfoJsonByProvider(Card card, String str) {
        if (str != null && card != null) {
            if (str.equals(ProviderType.PROVIDER_ID_MASTERCARD)) {
                return String.format(MDES_PAN_JSON_TEMPLATE, card.getPan(), card.getExpiryMonth(), CardUtils.formatYear(card.getExpiryYear(), true));
            }
            if (str.equals(ProviderType.PROVIDER_ID_VISA)) {
                return String.format(VTS_PAN_JSON_TEMPLATE, card.getPan(), card.getExpiryMonth(), card.getExpiryYear());
            }
        }
        return null;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ProviderService
    public String getTokenByProvider(GetToken getToken) throws CryptoInitException {
        String provider = getToken.getProvider();
        if (provider != null) {
            if (provider.equals(ProviderType.PROVIDER_ID_MASTERCARD)) {
                String strSerializeAndDeserializeForDecryptMcCardProfile = this.msdkCryptoServiceCaas.serializeAndDeserializeForDecryptMcCardProfile(getToken.getCardProfile());
                LogTohu.d(TAG, "MDES card profile: %s", strSerializeAndDeserializeForDecryptMcCardProfile);
                return strSerializeAndDeserializeForDecryptMcCardProfile;
            }
            if (provider.equals(ProviderType.PROVIDER_ID_VISA)) {
                String strSerializeAndDeserializeForDecryptVtsCardProfile = this.msdkCryptoServiceCaas.serializeAndDeserializeForDecryptVtsCardProfile(getToken.getCardProfile());
                LogTohu.d(TAG, "VTS card profile: %s", strSerializeAndDeserializeForDecryptVtsCardProfile);
                return strSerializeAndDeserializeForDecryptVtsCardProfile;
            }
        }
        return null;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.ProviderService
    public boolean needConfirmReplenishInBackend(String str) {
        return !ProviderType.PROVIDER_ID_MASTERCARD.equals(str);
    }
}
