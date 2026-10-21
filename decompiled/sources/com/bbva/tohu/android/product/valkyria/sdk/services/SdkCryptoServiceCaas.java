package com.bbva.tohu.android.product.valkyria.sdk.services;

import com.bbva.tohu.android.core.exceptions.CryptoInitException;
import com.bbva.tohu.android.core.request.backend.CypheredRequest;
import com.bbva.tohu.android.core.response.backend.CypheredResponse;

/* JADX INFO: loaded from: classes6.dex */
public interface SdkCryptoServiceCaas {
    Object decryptTransportWithSecChannelAndDeserialize(CypheredResponse cypheredResponse, Class cls) throws CryptoInitException;

    String serializeAndDeserializeForDecryptMcCardProfile(String str) throws CryptoInitException;

    String serializeAndDeserializeForDecryptVtsCardProfile(String str) throws CryptoInitException;

    CypheredRequest serializeAndEncryptTransportWithSecChannel(Object obj) throws CryptoInitException;
}
