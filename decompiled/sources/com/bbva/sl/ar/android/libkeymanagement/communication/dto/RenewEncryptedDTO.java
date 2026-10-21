package com.bbva.sl.ar.android.libkeymanagement.communication.dto;

import com.bbva.sl.ar.android.libkeymanagement.exception.ErrorCodeEnum;
import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import com.bbva.sl.ar.android.libkeymanagement.validation.ArgumentValidator;
import com.bbva.sl.ar.keymng.common.exception.JSONManagementException;
import com.bbva.sl.ar.keymng.common.json.JSONManager;
import com.bbva.tohu.android.core.crypto.PlatformCryptography;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class RenewEncryptedDTO extends RenewRequestDTO {
    protected static final String DATA_ATTR = "msg";
    protected String msg;

    @JsonCreator
    public RenewEncryptedDTO(@JsonProperty(PlatformCryptography.DERIVATION_ID_KEY) Map<String, String> map, @JsonProperty("derivationComplement") String str, @JsonProperty("msg") String str2) throws KeyManagementException {
        super(map, str);
        this.msg = str2;
    }

    public static RenewEncryptedDTO parse(String str) throws KeyManagementException {
        ArgumentValidator.validateNotEmptyString(str, "json");
        try {
            return (RenewEncryptedDTO) new JSONManager().parseObject(str, RenewEncryptedDTO.class);
        } catch (JSONManagementException e5) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_GENERAL_JSON_PARSING, (Throwable) e5);
        }
    }

    @JsonProperty("msg")
    public String getMsg() {
        return this.msg;
    }

    @JsonProperty("msg")
    public void setMsg(String str) {
        this.msg = str;
    }

    @Override // com.bbva.sl.ar.android.libkeymanagement.communication.dto.RenewRequestDTO
    public String toJsonString() throws KeyManagementException {
        try {
            return new JSONManager().serializeObject(this);
        } catch (JSONManagementException e5) {
            throw new KeyManagementException(ErrorCodeEnum.ERR_GENERAL_JSON_SERIALIZING, (Throwable) e5);
        }
    }

    public RenewEncryptedDTO(RenewRequestDTO renewRequestDTO, String str) throws KeyManagementException {
        super(renewRequestDTO.getDerivationId(), renewRequestDTO.getDerivationComplement());
        this.msg = str;
    }
}
