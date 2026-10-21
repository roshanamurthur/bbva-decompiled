package com.adobe.marketing.mobile;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
class TimerState {
    private static final String LOG_TAG = "TimerState";
    private AdobeCallback<Boolean> callback;
    private final String debugName;
    private Timer timer;
    private TimerTask timerTask;
    private long timeout = 0;
    private boolean isTimerRunning = false;
    private final Object timerMutex = new Object();

    public TimerState(String str) {
        this.debugName = str;
    }

    public void cancel() {
        synchronized (this.timerMutex) {
            Timer timer = this.timer;
            if (timer != null) {
                try {
                    timer.cancel();
                    Log.trace(LOG_TAG, "%s timer was canceled", this.debugName);
                } catch (Exception e5) {
                    Log.warning(LOG_TAG, "Error cancelling %s timer, failed with error: (%s)", this.debugName, e5);
                }
                this.timerTask = null;
                this.isTimerRunning = false;
            } else {
                this.isTimerRunning = false;
            }
            throw th;
        }
    }

    public boolean isTimerRunning() {
        boolean z10;
        synchronized (this.timerMutex) {
            try {
                z10 = this.timerTask != null && this.isTimerRunning;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void startTimer(long j10, AdobeCallback<Boolean> adobeCallback) {
        synchronized (this.timerMutex) {
            try {
                if (this.timerTask != null) {
                    Log.debug(LOG_TAG, "Timer has already started.", new Object[0]);
                    return;
                }
                this.timeout = j10;
                this.isTimerRunning = true;
                this.callback = adobeCallback;
                try {
                    this.timerTask = new TimerTask() { // from class: com.adobe.marketing.mobile.TimerState.1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            TimerState.this.isTimerRunning = false;
                            if (TimerState.this.callback != null) {
                                TimerState.this.callback.call(Boolean.TRUE);
                            }
                        }
                    };
                    Timer timer = new Timer(this.debugName);
                    this.timer = timer;
                    timer.schedule(this.timerTask, j10);
                    Log.trace(LOG_TAG, "%s timer scheduled having timeout %s ms", this.debugName, Long.valueOf(this.timeout));
                } catch (Exception e5) {
                    Log.warning(LOG_TAG, "Error creating %s timer, failed with error: (%s)", this.debugName, e5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
