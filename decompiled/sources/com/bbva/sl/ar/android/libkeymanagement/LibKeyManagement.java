package com.bbva.sl.ar.android.libkeymanagement;

import android.content.Context;
import com.bbva.sl.ar.android.libkeymanagement.configuration.Configuration;
import com.bbva.sl.ar.android.libkeymanagement.configuration.id.DeviceIdentificator;
import com.bbva.sl.ar.android.libkeymanagement.crypto.Crypto;
import com.bbva.sl.ar.android.libkeymanagement.crypto.ICrypto;
import com.bbva.sl.ar.android.libkeymanagement.exception.ErrorCodeEnum;
import com.bbva.sl.ar.android.libkeymanagement.exception.InitializationException;
import com.bbva.sl.ar.android.libkeymanagement.exception.KeyManagementException;
import com.bbva.sl.ar.android.libkeymanagement.management.IManagement;
import com.bbva.sl.ar.android.libkeymanagement.management.Management;
import com.bbva.sl.ar.android.libkeymanagement.payment.IPayment;
import com.bbva.sl.ar.android.libkeymanagement.payment.Payment;
import com.bbva.sl.ar.android.libkeymanagement.repository.IStorage;
import com.bbva.sl.ar.android.libkeymanagement.repository.Storage;
import com.bbva.sl.ar.android.libkeymanagement.repository.Store;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class LibKeyManagement {
    private static DeviceIdentificator deviceIdentificator;
    protected static LibKeyManagement lkm;
    private Context context;
    private ICrypto crypto;
    private IManagement management;
    private IPayment payment;
    private IStorage storage;
    private Store store;

    private LibKeyManagement(Map<String, String> map, String str, Context context, String str2, DeviceIdentificator deviceIdentificator2) throws KeyManagementException {
        if (map == null) {
            throw new InitializationException(ErrorCodeEnum.ERR_INIT_BAD_PARAMS.stringValue(), "Invalid parameter [map]");
        }
        if (str == null || str.isEmpty()) {
            throw new InitializationException(ErrorCodeEnum.ERR_INIT_BAD_PARAMS.stringValue(), "Invalid parameter [origen]");
        }
        if (context == null) {
            throw new InitializationException(ErrorCodeEnum.ERR_INIT_BAD_PARAMS.stringValue(), "Invalid parameter [context]");
        }
        this.context = context;
        Configuration configuration = new Configuration(this.context, str, str2);
        this.store = new Store(this.context, false, deviceIdentificator2);
        this.management = new Management(map, configuration, this.store, this.context);
        this.crypto = new Crypto(map, configuration, this.store);
        this.payment = new Payment(this.store);
        this.storage = new Storage(this.store);
    }

    public static void clearData(Context context) throws KeyManagementException {
        Store.clearAllData(context);
        clearInstance();
        clearDeviceIdentificator();
    }

    private static void clearDeviceIdentificator() {
        if (deviceIdentificator != null) {
            deviceIdentificator = null;
        }
    }

    private static void clearInstance() {
        LibKeyManagement libKeyManagement = lkm;
        if (libKeyManagement != null) {
            libKeyManagement.context = null;
            libKeyManagement.store = null;
            libKeyManagement.storage = null;
            libKeyManagement.crypto = null;
            libKeyManagement.management = null;
            libKeyManagement.payment = null;
        }
        lkm = null;
    }

    public static LibKeyManagement getInstance(Map<String, String> map, String str, Context context, String str2) throws KeyManagementException {
        if (lkm == null) {
            lkm = new LibKeyManagement(map, str, context, str2, deviceIdentificator);
        }
        return lkm;
    }

    public static void setDeviceIdentificator(DeviceIdentificator deviceIdentificator2) throws InitializationException {
        if (lkm != null) {
            if (deviceIdentificator2 == null && deviceIdentificator != null) {
                throw new InitializationException(ErrorCodeEnum.ERR_INIT_DEVICEID_ALREADY_DEFINED.stringValue(), "The deviceIdentificator must not be redefined in initied instance");
            }
            if (deviceIdentificator2 != null && deviceIdentificator == null) {
                throw new InitializationException(ErrorCodeEnum.ERR_INIT_DEVICEID_ALREADY_DEFINED.stringValue(), "The deviceIdentificator must not be redefined in initied instance");
            }
            if (deviceIdentificator2 != null && !deviceIdentificator2.getId().equals(deviceIdentificator.getId())) {
                throw new InitializationException(ErrorCodeEnum.ERR_INIT_DEVICEID_ALREADY_DEFINED.stringValue(), "The deviceIdentificator must not be redefined in initied instance");
            }
        }
        deviceIdentificator = deviceIdentificator2;
    }

    public ICrypto getCrypto() {
        return lkm.crypto;
    }

    public IManagement getManagement() {
        return lkm.management;
    }

    public IPayment getPayment() {
        return lkm.payment;
    }

    public IStorage getStorage() {
        return lkm.storage;
    }
}
