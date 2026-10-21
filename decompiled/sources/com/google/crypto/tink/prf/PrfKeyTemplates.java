package com.google.crypto.tink.prf;

import com.google.crypto.tink.proto.AesCmacPrfKeyFormat;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HkdfPrfKeyFormat;
import com.google.crypto.tink.proto.HkdfPrfParams;
import com.google.crypto.tink.proto.HmacPrfKeyFormat;
import com.google.crypto.tink.proto.HmacPrfParams;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;

/* JADX INFO: loaded from: classes10.dex */
public final class PrfKeyTemplates {
    public static final KeyTemplate AES_CMAC_PRF;
    public static final KeyTemplate HKDF_SHA256;
    public static final KeyTemplate HMAC_SHA256_PRF;
    public static final KeyTemplate HMAC_SHA512_PRF;

    static {
        HkdfPrfKeyFormat.Builder keySize = HkdfPrfKeyFormat.newBuilder().setKeySize(32);
        HkdfPrfParams.Builder builderNewBuilder = HkdfPrfParams.newBuilder();
        HashType hashType = HashType.SHA256;
        KeyTemplate.Builder typeUrl = KeyTemplate.newBuilder().setValue(keySize.setParams(builderNewBuilder.setHash(hashType)).build().toByteString()).setTypeUrl(HkdfPrfKeyManager.staticKeyType());
        OutputPrefixType outputPrefixType = OutputPrefixType.RAW;
        HKDF_SHA256 = typeUrl.setOutputPrefixType(outputPrefixType).build();
        HMAC_SHA256_PRF = a(32, hashType);
        HMAC_SHA512_PRF = a(64, HashType.SHA512);
        AES_CMAC_PRF = KeyTemplate.newBuilder().setTypeUrl(new AesCmacPrfKeyManager().getKeyType()).setValue(AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build().toByteString()).setOutputPrefixType(outputPrefixType).build();
    }

    public static KeyTemplate a(int i10, HashType hashType) {
        return KeyTemplate.newBuilder().setTypeUrl(new HmacPrfKeyManager().getKeyType()).setValue(HmacPrfKeyFormat.newBuilder().setParams(HmacPrfParams.newBuilder().setHash(hashType).build()).setKeySize(i10).build().toByteString()).setOutputPrefixType(OutputPrefixType.RAW).build();
    }
}
