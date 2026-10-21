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
public class ConfirmRequestDTO {
    protected static final String DER_COMP_ATTR = "derivationComplement";
    protected static final String DER_ID_ATTR = "derivationId";
    protected String derivationComplement;
    protected Map<String, String> derivationId;

    @JsonCreator
    public ConfirmRequestDTO(@JsonProperty("derivationId") Map<String, String> map, @JsonProperty(DER_COMP_ATTR) String str) {
        this.derivationId = map;
        this.derivationComplement = str;
    }

    public static ConfirmRequestDTO parse(String str) throws KeyManagementException {
        ArgumentValidator.validateNotEmptyString(str, "json");
        try {
            return (ConfirmRequestDTO) new JSONManager().parseObject(str, ConfirmRequestDTO.class);
        } catch (JSONManagementException e5) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_GENERAL_JSON_PARSING, (Throwable) e5);
        }
    }

    public String getDerivationComplement() {
        return this.derivationComplement;
    }

    public Map<String, String> getDerivationId() {
        return this.derivationId;
    }

    public void setDerivationComplement(String str) {
        this.derivationComplement = str;
    }

    public void setDerivationId(Map<String, String> map) {
        this.derivationId = map;
    }

    public String toJsonString() throws KeyManagementException {
        try {
            return new JSONManager().serializeObject(this);
        } catch (JSONManagementException e5) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_GENERAL_JSON_SERIALIZING, (Throwable) e5);
        }
    }
}
