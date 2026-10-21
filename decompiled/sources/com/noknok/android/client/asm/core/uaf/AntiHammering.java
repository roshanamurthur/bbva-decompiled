package com.noknok.android.client.asm.core.uaf;

import androidx.appcompat.widget.o1;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.uaf.asmcore.AuthenticatorDatabase;

/* JADX INFO: loaded from: classes11.dex */
public final class AntiHammering extends IMatcher.IAntiHammeringCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IEraseCallback f63230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AuthenticatorDatabase f63231b;

    /* JADX INFO: renamed from: com.noknok.android.client.asm.core.uaf.AntiHammering$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63232a;

        static {
            int[] iArr = new int[State.values().length];
            f63232a = iArr;
            try {
                iArr[State.BASELINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63232a[State.PROBATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63232a[State.LOCKOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface IEraseCallback {
        void onErase();
    }

    public enum State {
        BASELINE,
        PROBATION,
        LOCKOUT
    }

    public AntiHammering(AuthenticatorDatabase authenticatorDatabase, IEraseCallback iEraseCallback) {
        this.f63230a = iEraseCallback;
        this.f63231b = authenticatorDatabase;
        IMatcher.IAntiHammeringCallback.mTimeProvider = new o1();
    }

    private State a() {
        int failedCount = getFailedCount();
        if (failedCount >= this.mMaxFalseAttempts) {
            return State.LOCKOUT;
        }
        return failedCount > 0 ? State.PROBATION : State.BASELINE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long b() {
        return System.currentTimeMillis() / 1000;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher.IAntiHammeringCallback
    public int getFailedCount() {
        String antiHammeringFailedAttempts = this.f63231b.getAntiHammeringFailedAttempts();
        if (antiHammeringFailedAttempts != null) {
            return Integer.parseInt(antiHammeringFailedAttempts);
        }
        a(0);
        return 0;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher.IAntiHammeringCallback
    public long getLockedState() {
        State stateA = a();
        State state = State.LOCKOUT;
        if (stateA == state && this.mLockoutPeriod == 0) {
            String aKConfig = this.f63231b.getAKConfig();
            this.f63230a.onErase();
            this.f63231b.eraseDatabase();
            this.f63231b.storeAKConfig(aKConfig);
        }
        if (a() != state) {
            return 0L;
        }
        long j10 = this.mLockoutPeriod;
        if (j10 == 0) {
            return 0L;
        }
        long currentTime = IMatcher.IAntiHammeringCallback.mTimeProvider.getCurrentTime();
        String antiHammeringFailedTime = this.f63231b.getAntiHammeringFailedTime();
        long j11 = j10 - (currentTime - (antiHammeringFailedTime != null ? Long.parseLong(antiHammeringFailedTime) : 0L));
        if (j11 > 0) {
            return j11;
        }
        a(0);
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    @Override // com.noknok.android.client.asm.sdk.IMatcher.IAntiHammeringCallback
    public boolean incrementFailedCount() {
        int i10 = AnonymousClass1.f63232a[a().ordinal()];
        if (i10 == 1) {
            a(1);
            if (this.mProbationPeriod == 0) {
                return false;
            }
            a(IMatcher.IAntiHammeringCallback.mTimeProvider.getCurrentTime());
            return false;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            throw new IllegalArgumentException("Lockout state was not checked");
        }
        long currentTime = IMatcher.IAntiHammeringCallback.mTimeProvider.getCurrentTime();
        if (this.mProbationPeriod == 0) {
            a(getFailedCount() + 1);
        } else {
            String antiHammeringFailedTime = this.f63231b.getAntiHammeringFailedTime();
            if (currentTime - (antiHammeringFailedTime != null ? Long.parseLong(antiHammeringFailedTime) : 0L) > this.mProbationPeriod) {
                a(1);
                a(currentTime);
            } else {
                a(getFailedCount() + 1);
            }
        }
        if (a() != State.LOCKOUT) {
            return false;
        }
        if (this.mLockoutPeriod != 0) {
            a(currentTime);
        } else {
            String aKConfig = this.f63231b.getAKConfig();
            this.f63230a.onErase();
            this.f63231b.eraseDatabase();
            this.f63231b.storeAKConfig(aKConfig);
        }
        return true;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher.IAntiHammeringCallback
    public boolean resetFailedCount() {
        int i10 = AnonymousClass1.f63232a[a().ordinal()];
        if (i10 == 2) {
            a(0);
            return true;
        }
        if (i10 != 3) {
            return true;
        }
        throw new IllegalArgumentException("Lockout state was not checked");
    }

    private void a(int i10) {
        this.f63231b.storeAntiHammeringFailedAttempts(Integer.toString(i10));
    }

    private void a(long j10) {
        this.f63231b.storeAntiHammeringFailedTime(Long.toString(j10));
    }
}
