package com.noknok.android.client.utils;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IAntiHammeringCallback {
    protected static ITimeProvider mTimeProvider;
    protected int mMaxFalseAttempts = 3;
    protected long mProbationPeriod = 0;
    protected long mLockoutPeriod = 0;

    public interface ITimeProvider {
        long getCurrentTime();
    }

    public static void setTimeProvider(ITimeProvider iTimeProvider) {
        mTimeProvider = iTimeProvider;
    }

    public abstract int getFailedCount();

    public abstract long getLockedState();

    public abstract boolean incrementFailedCount();

    public abstract boolean resetFailedCount();

    public IAntiHammeringCallback setLockoutPeriod(long j10) {
        this.mLockoutPeriod = j10;
        return this;
    }

    public IAntiHammeringCallback setMaxFalseAttempts(int i10) {
        this.mMaxFalseAttempts = i10;
        return this;
    }

    public IAntiHammeringCallback setProbationPeriod(long j10) {
        this.mProbationPeriod = j10;
        return this;
    }
}
