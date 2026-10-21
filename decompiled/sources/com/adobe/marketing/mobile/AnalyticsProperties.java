package com.adobe.marketing.mobile;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsProperties {
    static final String CHARSET = "UTF-8";
    static final String TIMESTAMP_TIMEZONE_OFFSET;
    private String aid;
    private long lifecyclePreviousSessionPauseTimestamp;
    private long lifecyclePrevoiusPauseEventTimestamp;
    private String vid;
    private long lastResetIdentitiesTimestamp = 0;
    private TimerState referrerTimerState = new TimerState("ADBReferrerTimer");
    private TimerState lifecycleTimerState = new TimerState("ADBLifecycleTimer");

    static {
        Calendar calendar = Calendar.getInstance();
        TIMESTAMP_TIMEZONE_OFFSET = "00/00/0000 00:00:00 0 " + TimeUnit.MILLISECONDS.toMinutes(((long) (calendar.get(15) * (-1))) - ((long) calendar.get(16)));
    }

    public String getAid() {
        return this.aid;
    }

    public long getLastResetIdentitiesTimestamp() {
        return this.lastResetIdentitiesTimestamp;
    }

    public long getLifecyclePreviousSessionPauseTimestamp() {
        return this.lifecyclePreviousSessionPauseTimestamp;
    }

    public long getLifecyclePrevoiusPauseEventTimestamp() {
        return this.lifecyclePrevoiusPauseEventTimestamp;
    }

    public TimerState getLifecycleTimerState() {
        return this.lifecycleTimerState;
    }

    public TimerState getReferrerTimerState() {
        return this.referrerTimerState;
    }

    public String getVid() {
        return this.vid;
    }

    public boolean isDatabaseWaiting() {
        TimerState timerState;
        TimerState timerState2 = this.referrerTimerState;
        return (timerState2 != null && timerState2.isTimerRunning()) || ((timerState = this.lifecycleTimerState) != null && timerState.isTimerRunning());
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setLastResetIdentitiesTimestamp(long j10) {
        this.lastResetIdentitiesTimestamp = j10;
    }

    public void setLifecyclePreviousSessionPauseTimestamp(long j10) {
        this.lifecyclePreviousSessionPauseTimestamp = j10;
    }

    public void setLifecyclePrevoiusPauseEventTimestamp(long j10) {
        this.lifecyclePrevoiusPauseEventTimestamp = j10;
    }

    public void setVid(String str) {
        this.vid = str;
    }
}
