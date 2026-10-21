package com.bbva.sl.ar.android.libkeymanagement.communication.dto;

import com.bbva.sl.ar.android.libkeymanagement.exception.ErrorCodeEnum;
import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import com.bbva.sl.ar.android.libkeymanagement.validation.ArgumentValidator;
import com.bbva.sl.ar.keymng.common.exception.JSONManagementException;
import com.bbva.sl.ar.keymng.common.json.JSONManager;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class LoadRequestDTO {
    private static final String DERIVATION_ID_ATTR = "derivationId";
    private static final String KEY_ATTR = "key";
    private Map<String, String> derivationId;
    private PublicRSAKeyManJWK key;

    @JsonCreator
    public LoadRequestDTO(@JsonProperty("derivationId") Map<String, String> map, @JsonProperty("key") PublicRSAKeyManJWK publicRSAKeyManJWK) {
        this.derivationId = map;
        this.key = publicRSAKeyManJWK;
    }

    public static LoadRequestDTO parse(String str) throws KeyManagementException {
        ArgumentValidator.validateNotEmptyString(str, "json");
        try {
            return (LoadRequestDTO) new JSONManager().parseObject(str, LoadRequestDTO.class);
        } catch (JSONManagementException e5) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_GENERAL_JSON_PARSING, (Throwable) e5);
        }
    }

    @JsonProperty("derivationId")
    public Map<String, String> getDerivationId() {
        return this.derivationId;
    }

    @JsonProperty("key")
    public PublicRSAKeyManJWK getKey() {
        return this.key;
    }

    @JsonProperty("derivationId")
    public void setDerivationId(Map<String, String> map) {
        this.derivationId = map;
    }

    @JsonProperty("key")
    public void setKey(PublicRSAKeyManJWK publicRSAKeyManJWK) {
        this.key = publicRSAKeyManJWK;
    }

    public String toJsonString() throws KeyManagementException {
        try {
            return new JSONManager().serializeObject(this);
        } catch (JSONManagementException e5) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_GENERAL_JSON_SERIALIZING, (Throwable) e5);
        }
    }
}
