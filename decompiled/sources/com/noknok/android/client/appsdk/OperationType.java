package com.noknok.android.client.appsdk;

import com.noknok.android.client.utils.Logger;

/* JADX INFO: loaded from: classes11.dex */
public enum OperationType {
    INIT_REG(false),
    FINISH_REG(false),
    INIT_AUTH(false),
    FINISH_AUTH(false),
    LIST_REG(false),
    LIST_OOB_AUTH(false),
    CANCEL_REG(false),
    CANCEL_AUTH(false),
    CANCEL_OOB_REG(false),
    CANCEL_OOB_AUTH(false),
    CANCEL_DELETE_REG(false),
    FINISH_OOB_REG(false),
    FINISH_OOB_AUTH(false),
    FINISH_DELETE_REG(false),
    INIT_OOB_REG(false),
    INIT_OOB_AUTH(false),
    INIT_DELETE_REG(false),
    START_OOB_REG(false),
    CANCEL_STATUS_OOB_REG(false),
    STATUS_OOB_REG(false),
    START_OOB_AUTH(false),
    CANCEL_STATUS_OOB_AUTH(false),
    STATUS_OOB_AUTH(false),
    DELETE_REG(false),
    FETCH_USER_DATA(false),
    PURGE_USER_DATA(false),
    UPDATE_REG(false),
    INIT_ADAPTIVE(true),
    INIT_ADAPTIVE_REG(true),
    INIT_SETUP(true),
    SETUP(true),
    CANCEL_SETUP(true),
    LIST_METHODS(true),
    DELETE_METHODS(true),
    INIT_VERIFY(true),
    VERIFY(true),
    CANCEL_VERIFY(true);

    final boolean mIsAdaptive;

    OperationType(boolean z10) {
        this.mIsAdaptive = z10;
    }

    public static OperationType getByName(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            Logger.w(OperationType.class.getName(), "not found " + str);
            return null;
        }
    }

    public boolean isAdaptive() {
        return this.mIsAdaptive;
    }
}
