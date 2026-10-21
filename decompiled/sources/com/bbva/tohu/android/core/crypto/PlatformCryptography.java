package com.bbva.tohu.android.core.crypto;

import android.content.Context;
import androidx.camera.core.processing.f;
import com.bbva.sl.ar.android.libkeymanagement.LibKeyManagement;
import com.bbva.sl.ar.android.libkeymanagement.configuration.id.DeviceIdentificator;
import com.bbva.sl.ar.android.libkeymanagement.crypto.EncryptedData;
import com.bbva.sl.ar.android.libkeymanagement.crypto.ICrypto;
import com.bbva.sl.ar.android.libkeymanagement.exception.InitializationException;
import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import com.bbva.sl.ar.android.libkeymanagement.management.AuthenticationObject;
import com.bbva.sl.ar.android.libkeymanagement.management.IManagement;
import com.bbva.tohu.android.core.exceptions.CryptoException;
import com.bbva.tohu.android.core.managers.NetworkManagerUtil;
import com.bbva.tohu.android.core.utils.DeviceInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class PlatformCryptography {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String DERIVATION_ID_KEY = "derivationId";
    public static final String ERROR_NO_RENEW_IS_NEEDED_ALLOWED = "1803";
    public static final String ERROR_NO_RENEW_RETRY = "1807";
    public static final String JWT_HEADER = "jwt ";
    public static final int MAX_LOAD_RETRIES = 3;
    private ICrypto crypto;
    private Context ctx;
    private DeviceInfo deviceInfo;
    private String did;
    private String kmConfig;
    private LibKeyManagement libKeyManagement;
    private IManagement management;
    private NetworkManagerUtil networkManagerUtil;
    private List<String> renewIgnorableErrorsArray = Arrays.asList(ERROR_NO_RENEW_IS_NEEDED_ALLOWED, ERROR_NO_RENEW_RETRY);
    private boolean forceLoadKeys = false;

    public PlatformCryptography(String str, NetworkManagerUtil networkManagerUtil, DeviceInfo deviceInfo, Context context, String str2) {
        this.ctx = context;
        this.did = str;
        this.networkManagerUtil = networkManagerUtil;
        this.deviceInfo = deviceInfo;
        this.kmConfig = str2;
    }

    private Map<String, AuthenticationObject> getAuthObject(String str) {
        AuthenticationObject authenticationObject = new AuthenticationObject(f.d("jwt ", str), true, true, true);
        HashMap map = new HashMap();
        map.put("Authorization", authenticationObject);
        return map;
    }

    public static PlatformCryptography getInstance(Context context, String str, String str2) {
        return new PlatformCryptography(str, NetworkManagerUtil.getInstance(context), DeviceInfo.getInstance(context), context, str2);
    }

    private void initializeCryptoIfNeeded() throws CryptoException, KeyManagementException {
        if (this.crypto == null) {
            initializeLibKeyManagerIfNeeded();
            this.crypto = this.libKeyManagement.getCrypto();
        }
    }

    private void initializeLibKeyManagerIfNeeded() throws CryptoException, KeyManagementException {
        if (this.libKeyManagement == null) {
            if (this.did == null) {
                throw new CryptoException("Derivation id null on initializeLibKeyManagerIfNeeded");
            }
            HashMap map = new HashMap();
            map.put(DERIVATION_ID_KEY, this.did);
            setDeviceIdentificatorInLibKeyManagement();
            this.libKeyManagement = LibKeyManagement.getInstance(map, this.kmConfig, this.ctx, null);
        }
    }

    private void managementLoadWithRetries(Map<String, AuthenticationObject> map) throws KeyManagementException {
        int i10 = 3;
        boolean z10 = false;
        do {
            try {
                this.management.load(map);
                z10 = true;
            } catch (KeyManagementException e5) {
                i10--;
                if (i10 == 0) {
                    throw e5;
                }
            }
        } while (!z10);
    }

    private void setDeviceIdentificatorInLibKeyManagement() throws InitializationException {
        LibKeyManagement.setDeviceIdentificator(new DeviceIdentificator() { // from class: com.bbva.tohu.android.core.crypto.PlatformCryptography.1
            @Override // com.bbva.sl.ar.android.libkeymanagement.configuration.id.DeviceIdentificator
            public String getId() {
                return PlatformCryptography.this.deviceInfo.getDeviceCode();
            }
        });
    }

    public void clearData(Context context) throws CryptoException {
        try {
            LibKeyManagement.clearData(context);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public void createKeysIfNeeded(String str) throws CryptoException {
        try {
            initializeKeyManagerIfNeeded();
            if (!this.management.needsLoad() && !this.forceLoadKeys) {
                return;
            }
            if (this.networkManagerUtil.isOnline()) {
                managementLoadWithRetries(getAuthObject(str));
                this.forceLoadKeys = false;
            }
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public byte[] decryptJWE(String str, String str2) throws CryptoException {
        try {
            initializeCryptoIfNeeded();
            return this.crypto.decrypt(str, str2);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public byte[] decryptRaw(byte[] bArr, String str) throws CryptoException {
        try {
            initializeCryptoIfNeeded();
            return this.crypto.decryptRaw(bArr, str);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public EncryptedData encryptJWE(byte[] bArr, String str) throws CryptoException {
        try {
            initializeCryptoIfNeeded();
            return this.crypto.encrypt(bArr, str);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public byte[] encryptRaw(byte[] bArr, String str) throws CryptoException {
        try {
            initializeCryptoIfNeeded();
            return this.crypto.encryptRaw(bArr, str);
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public LibKeyManagement getLibKeyManagement() {
        return this.libKeyManagement;
    }

    public void initializeKeyManagerIfNeeded() throws CryptoException, KeyManagementException {
        if (this.management == null) {
            initializeLibKeyManagerIfNeeded();
            this.management = this.libKeyManagement.getManagement();
        }
    }

    public void loadKeysNeeded() throws CryptoException {
        try {
            initializeKeyManagerIfNeeded();
            if (this.management.needsLoad()) {
                this.forceLoadKeys = true;
                throw new CryptoException("Its necessary forceLoadKey");
            }
        } catch (KeyManagementException e5) {
            throw new CryptoException(e5);
        }
    }

    public void renewKeysNeeded() throws CryptoException {
        try {
            initializeKeyManagerIfNeeded();
            if (this.networkManagerUtil.isOnline()) {
                this.management.renew(new HashMap(), false);
            }
        } catch (KeyManagementException e5) {
            if (this.renewIgnorableErrorsArray.contains(e5.getErrorCode())) {
                return;
            }
            this.forceLoadKeys = true;
            throw new CryptoException(e5);
        }
    }

    public void setForceLoadKeys(boolean z10) {
        this.forceLoadKeys = z10;
    }
}
