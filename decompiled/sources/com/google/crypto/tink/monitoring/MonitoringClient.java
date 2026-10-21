package com.google.crypto.tink.monitoring;

import com.google.crypto.tink.annotations.Alpha;

/* JADX INFO: loaded from: classes10.dex */
@Alpha
public interface MonitoringClient {

    public interface Logger {
        void log(int i10, long j10);

        void logFailure();
    }

    Logger createLogger(MonitoringKeysetInfo monitoringKeysetInfo, String str, String str2);
}
