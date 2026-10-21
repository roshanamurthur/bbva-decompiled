package com.bbva.sl.ar.android.secsdk.fido.cache;

import com.bbva.sl.ar.android.secsdk.fido.model.FidoPayload;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;

/* JADX INFO: loaded from: classes8.dex */
public class FidoPayloadManager {
    private FidoPayload cachedPayload;
    private final TimeProvider timeProvider;

    public FidoPayloadManager(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    private boolean isExpired() {
        return this.cachedPayload != null && this.timeProvider.currentTimeMillis() > this.cachedPayload.getExpirationDate();
    }

    private boolean isSameSession(FidoSession fidoSession) {
        return fidoSession.equals(this.cachedPayload.getFidoSession());
    }

    public void clearCache() {
        this.cachedPayload = null;
    }

    public FidoPayload get() {
        try {
            return this.cachedPayload;
        } finally {
            this.cachedPayload = null;
        }
    }

    public boolean isCachedPayloadValid(FidoSession fidoSession) {
        return (this.cachedPayload == null || !isSameSession(fidoSession) || isExpired()) ? false : true;
    }

    public void put(FidoPayload fidoPayload) {
        this.cachedPayload = fidoPayload;
    }

    public FidoPayloadManager() {
        this(new SystemTimeProvider());
    }
}
