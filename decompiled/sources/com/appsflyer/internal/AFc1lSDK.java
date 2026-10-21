package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public class AFc1lSDK {
    public final long AFInAppEventType;

    public AFc1lSDK(long j10) {
        this.AFInAppEventType = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFInAppEventType == ((AFc1lSDK) obj).AFInAppEventType;
    }

    public int hashCode() {
        long j10 = this.AFInAppEventType;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
