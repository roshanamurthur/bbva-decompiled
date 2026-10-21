package com.bbva.sl.ar.android.secsdk.fido.cache;

/* JADX INFO: loaded from: classes8.dex */
class SystemTimeProvider implements TimeProvider {
    @Override // com.bbva.sl.ar.android.secsdk.fido.cache.TimeProvider
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
