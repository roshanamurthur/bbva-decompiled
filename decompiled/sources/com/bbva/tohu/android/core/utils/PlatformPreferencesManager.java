package com.bbva.tohu.android.core.utils;

import android.content.Context;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.TrustDevicePreferencesManager;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.impl.PropertyManagerImpl;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.impl.TrustDevicePreferencesManagerDefaultImpl;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.impl.UserSharedPreferencesManagerDefaultImpl;

/* JADX INFO: loaded from: classes6.dex */
public class PlatformPreferencesManager {
    private TrustDevicePreferencesManager trustDevicePreferencesManager;

    public PlatformPreferencesManager(Context context) {
        this.trustDevicePreferencesManager = new TrustDevicePreferencesManagerDefaultImpl(new UserSharedPreferencesManagerDefaultImpl(context), new PropertyManagerImpl());
    }

    public String getDid() {
        return this.trustDevicePreferencesManager.getDerivationId();
    }

    public Long getIntegrityCloudProjectNumber() {
        return this.trustDevicePreferencesManager.getIntegrityCloudProjectNumber();
    }

    public String getKmConfig() {
        return this.trustDevicePreferencesManager.getKMConfig();
    }

    public String getPushToken() {
        return this.trustDevicePreferencesManager.getPushToken();
    }
}
