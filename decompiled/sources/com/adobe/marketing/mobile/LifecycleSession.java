package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class LifecycleSession {
    private static final String LOG_TAG = "LifecycleSession";
    private final LocalStorageService.DataStore dataStore;
    private boolean lifecycleHasRun;

    public static class SessionInfo {
        private final boolean isCrash;
        private final long pauseTimestampInSeconds;
        private final long startTimestampInSeconds;

        public SessionInfo(long j10, long j11, boolean z10) {
            this.startTimestampInSeconds = j10;
            this.pauseTimestampInSeconds = j11;
            this.isCrash = z10;
        }

        public long getPauseTimestampInSeconds() {
            return this.pauseTimestampInSeconds;
        }

        public long getStartTimestampInSeconds() {
            return this.startTimestampInSeconds;
        }

        public boolean isCrash() {
            return this.isCrash;
        }
    }

    public LifecycleSession(LocalStorageService.DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public Map<String, String> getSessionData(long j10, long j11, SessionInfo sessionInfo) {
        HashMap map = new HashMap();
        if (this.dataStore == null) {
            Log.debug(LOG_TAG, "%s (data store), Failed to get session length data", "Unexpected Null Value");
            return map;
        }
        if (sessionInfo == null) {
            Log.debug(LOG_TAG, "%s (previous session info), Failed to get session length data", "Unexpected Null Value");
            return map;
        }
        long pauseTimestampInSeconds = j10 - sessionInfo.getPauseTimestampInSeconds();
        long pauseTimestampInSeconds2 = sessionInfo.getPauseTimestampInSeconds() - sessionInfo.getStartTimestampInSeconds();
        if (pauseTimestampInSeconds < j11) {
            return map;
        }
        if (pauseTimestampInSeconds2 <= 0 || pauseTimestampInSeconds2 >= LifecycleConstants.MAX_SESSION_LENGTH_SECONDS) {
            map.put("ignoredsessionlength", Long.toString(pauseTimestampInSeconds2));
        } else {
            map.put("prevsessionlength", Long.toString(pauseTimestampInSeconds2));
        }
        return map;
    }

    public void pause(long j10) {
        LocalStorageService.DataStore dataStore = this.dataStore;
        if (dataStore == null) {
            Log.debug(LOG_TAG, "Failed to pause session, %s (persisted data)", "Unexpected Null Value");
            return;
        }
        dataStore.setBoolean("SuccessfulClose", true);
        this.dataStore.setLong("PauseDate", j10);
        Log.trace(LOG_TAG, "Lifecycle session paused", new Object[0]);
        this.lifecycleHasRun = false;
    }

    public SessionInfo start(long j10, long j11, Map<String, String> map) {
        if (this.lifecycleHasRun) {
            return null;
        }
        LocalStorageService.DataStore dataStore = this.dataStore;
        if (dataStore == null) {
            Log.debug(LOG_TAG, "Failed to start session, %s (persisted data)", "Unexpected Null Value");
            return null;
        }
        this.lifecycleHasRun = true;
        long j12 = dataStore.getLong("SessionStart", 0L);
        long j13 = this.dataStore.getLong("PauseDate", 0L);
        boolean z10 = !this.dataStore.getBoolean("SuccessfulClose", true);
        if (j13 > 0) {
            long j14 = j10 - j13;
            if (j14 < j11 && j12 > 0) {
                this.dataStore.setLong("SessionStart", j12 + j14);
                this.dataStore.setBoolean("SuccessfulClose", false);
                this.dataStore.remove("PauseDate");
                return null;
            }
        }
        this.dataStore.setLong("SessionStart", j10);
        this.dataStore.remove("PauseDate");
        this.dataStore.setBoolean("SuccessfulClose", false);
        this.dataStore.setInt("Launches", this.dataStore.getInt("Launches", 0) + 1);
        this.dataStore.setString("OsVersion", map.get("osversion"));
        this.dataStore.setString("AppId", map.get("appid"));
        Log.trace(LOG_TAG, "New lifecycle session started", new Object[0]);
        return new SessionInfo(j12, j13, z10);
    }
}
