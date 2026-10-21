package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import com.bbva.tohu.android.core.utils.DeviceInfo;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.managers.OperationLockManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class OperationLockManagerDefaultImpl implements OperationLockManager {
    private static final String TAG = "OperationLockManagerDefaultImpl";
    private DeviceInfo deviceInfo;
    private final Long lockMaxTimeInMillis;
    private final Map<String, Long> map = new HashMap();

    public OperationLockManagerDefaultImpl(Long l6, DeviceInfo deviceInfo) {
        this.lockMaxTimeInMillis = l6;
        this.deviceInfo = deviceInfo;
    }

    private boolean isUnlocked(Long l6, Long l7) {
        return l6 == null || l7.longValue() - l6.longValue() >= this.lockMaxTimeInMillis.longValue();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.OperationLockManager
    public synchronized boolean lock(String str) {
        boolean z10;
        try {
            Long l6 = this.map.get(str);
            Long currentTimeInMillis = this.deviceInfo.getCurrentTimeInMillis();
            if (isUnlocked(l6, currentTimeInMillis)) {
                LogTohu.d(TAG, "Acquired lock for id %s", str);
                this.map.put(str, currentTimeInMillis);
                z10 = true;
            } else {
                z10 = false;
            }
            LogTohu.d(TAG, "Tried to acquire lock for id  %s, result %b", str, Boolean.valueOf(z10));
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.OperationLockManager
    public synchronized void unlock(String str) {
        this.map.remove(str);
        LogTohu.d(TAG, "Removed lock from id %s", str);
    }
}
