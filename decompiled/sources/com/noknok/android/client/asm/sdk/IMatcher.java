package com.noknok.android.client.asm.sdk;

import android.app.Activity;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Outcome;
import java.security.InvalidParameterException;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IMatcher {

    public enum EnrollState {
        ENROLLED,
        NOT_ENROLLED,
        UNAVAILABLE
    }

    public static class Extension {
        public byte[] data;
        public boolean fail_if_unknown;
        public String id;
    }

    public static abstract class IAntiHammeringCallback {
        protected static ITimeProvider mTimeProvider;
        protected int mMaxFalseAttempts = 10;
        protected long mProbationPeriod = 0;
        protected long mLockoutPeriod = 0;

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

    public interface ITimeProvider {
        long getCurrentTime();
    }

    public static class MatcherDefinedParamsClassList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<? extends MatcherInParams> f63299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<? extends MatcherOutParams> f63300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<? extends MatcherSettingsInParams> f63301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Class<? extends MatcherSettingsOutParams> f63302d;

        public MatcherDefinedParamsClassList(Class<? extends MatcherInParams> cls, Class<? extends MatcherOutParams> cls2, Class<? extends MatcherSettingsInParams> cls3, Class<? extends MatcherSettingsOutParams> cls4) {
            if (cls == null || cls2 == null) {
                throw new InvalidParameterException("MatcherInParams and MatcherOutParams are mandatory");
            }
            this.f63299a = cls;
            this.f63300b = cls2;
            this.f63301c = cls3;
            this.f63302d = cls4;
        }

        public Class<? extends MatcherInParams> getMatcherInParamsClass() {
            return this.f63299a;
        }

        public Class<? extends MatcherSettingsInParams> getMatcherManageInParamsClass() {
            return this.f63301c;
        }

        public Class<? extends MatcherSettingsOutParams> getMatcherManageOutParamsClass() {
            return this.f63302d;
        }

        public Class<? extends MatcherOutParams> getMatcherOutParamsClass() {
            return this.f63300b;
        }
    }

    public static class MatcherSettingsInParams {
        protected final ActivityProxy mActivityProxy;
        protected final String m_AAID;
        protected final IAntiHammeringCallback m_antihammeringCallback;

        public MatcherSettingsInParams(IAntiHammeringCallback iAntiHammeringCallback, String str, ActivityProxy activityProxy) {
            this.m_antihammeringCallback = iAntiHammeringCallback;
            this.m_AAID = str;
            this.mActivityProxy = activityProxy;
        }

        public String getAAID() {
            return this.m_AAID;
        }

        public IAntiHammeringCallback getAntiHammeringCallback() {
            return this.m_antihammeringCallback;
        }

        @Deprecated
        public Activity getCallerActivity() {
            return this.mActivityProxy.getWorkerActivity();
        }

        public ActivityProxy getCallerActivityProxy() {
            return this.mActivityProxy;
        }
    }

    public enum RESULT {
        SUCCESS(Outcome.SUCCESS),
        CANCEL(Outcome.CANCELED),
        CHANGE_AUTHENTICATOR(Outcome.CHANGE_AUTHENTICATOR),
        MISMATCH(Outcome.MISMATCH),
        KEY_DISAPPEARED_PERMANENTLY(Outcome.KEY_DISAPPEARED_PERMANENTLY),
        TIMEOUT(Outcome.USER_NOT_RESPONSIVE),
        ERRORAUTH(Outcome.FAILURE),
        USER_LOCKOUT(Outcome.USER_LOCKOUT),
        USER_NOT_ENROLLED(Outcome.USER_NOT_ENROLLED),
        FALLBACK(Outcome.FALLBACK),
        SYSTEM_CANCELED(Outcome.SYSTEM_CANCELED),
        AUTHENTICATOR_UNAVAILABLE(Outcome.AUTHENTICATOR_UNAVAILABLE);

        final Outcome mOutcome;

        RESULT(Outcome outcome) {
            this.mOutcome = outcome;
        }

        public static RESULT fromOutcome(Outcome outcome) {
            for (RESULT result : values()) {
                if (result.mOutcome == outcome) {
                    return result;
                }
            }
            return ERRORAUTH;
        }

        public static Outcome fromResult(RESULT result) {
            for (RESULT result2 : values()) {
                if (result2 == result) {
                    return result2.mOutcome;
                }
            }
            return Outcome.FAILURE;
        }

        private Outcome getmOutcome() {
            return this.mOutcome;
        }
    }

    MatcherOutParams authenticate(MatcherInParams matcherInParams);

    void cancel();

    MatcherDefinedParamsClassList getMatcherDefinedParamsClassList();

    EnrollState isUserEnrolled();

    boolean isUserIDValid(byte[] bArr) throws AuthenticatorException;

    MatcherOutParams register(MatcherInParams matcherInParams);

    MatcherSettingsOutParams settings(MatcherSettingsInParams matcherSettingsInParams);

    public static class MatcherSettingsOutParams {
        protected RESULT m_Result;

        public MatcherSettingsOutParams(RESULT result) {
            this.m_Result = result;
        }

        public RESULT getResult() {
            return this.m_Result;
        }

        public MatcherSettingsOutParams() {
        }
    }

    public static class MatcherOutParams {
        protected Byte authIndex;
        protected List<Extension> m_Exts;
        protected RESULT m_MatchResult;
        protected byte[] m_UserID;

        public MatcherOutParams(RESULT result, byte[] bArr, List<Extension> list) {
            this.authIndex = null;
            this.m_MatchResult = result;
            this.m_UserID = bArr;
            this.m_Exts = list;
        }

        public Byte getAuthIndex() {
            return this.authIndex;
        }

        public List<Extension> getExtensions() {
            return this.m_Exts;
        }

        public RESULT getMatchResult() {
            return this.m_MatchResult;
        }

        public byte[] getUserID() {
            return this.m_UserID;
        }

        public MatcherOutParams setAuthIndex(Byte b10) {
            this.authIndex = b10;
            return this;
        }

        public MatcherOutParams(RESULT result) {
            this.authIndex = null;
            this.m_MatchResult = result;
            this.m_UserID = null;
            this.m_Exts = null;
        }

        public MatcherOutParams() {
            this.authIndex = null;
        }
    }

    public static class MatcherInParams {
        protected byte[] FinalChallenge;
        protected ActivityProxy mActivityProxy;
        protected String mAppId;
        protected String mCallerId;
        protected List<Extension> mExtensions;
        protected Boolean mHasRegistrations;
        protected String mKeyId;
        protected String m_AAID;
        protected IAntiHammeringCallback m_antihammeringCallback;
        protected String m_customUI;
        protected String m_transText;

        public MatcherInParams(String str, String str2, byte[] bArr, IAntiHammeringCallback iAntiHammeringCallback, String str3, Boolean bool, ActivityProxy activityProxy) {
            this.m_customUI = str;
            this.m_transText = str2;
            this.FinalChallenge = bArr;
            this.m_antihammeringCallback = iAntiHammeringCallback;
            this.m_AAID = str3;
            this.mHasRegistrations = bool;
            this.mActivityProxy = activityProxy;
        }

        public String getAAID() {
            return this.m_AAID;
        }

        public IAntiHammeringCallback getAntiHammeringCallback() {
            return this.m_antihammeringCallback;
        }

        public String getAppId() {
            return this.mAppId;
        }

        @Deprecated
        public Activity getCallerActivity() {
            return this.mActivityProxy.getWorkerActivity();
        }

        public ActivityProxy getCallerActivityProxy() {
            return this.mActivityProxy;
        }

        public String getCallerId() {
            return this.mCallerId;
        }

        public String getCustomUI() {
            return this.m_customUI;
        }

        public List<Extension> getExtensions() {
            return this.mExtensions;
        }

        public byte[] getFinalChallenge() {
            return this.FinalChallenge;
        }

        public String getKeyId() {
            return this.mKeyId;
        }

        public String getTransText() {
            return this.m_transText;
        }

        public boolean hasRegistrations() {
            return this.mHasRegistrations.booleanValue();
        }

        public MatcherInParams setAppId(String str) {
            this.mAppId = str;
            return this;
        }

        public MatcherInParams setCallerId(String str) {
            this.mCallerId = str;
            return this;
        }

        public MatcherInParams setExtensions(List<Extension> list) {
            this.mExtensions = list;
            return this;
        }

        public MatcherInParams setKeyId(String str) {
            this.mKeyId = str;
            return this;
        }

        public MatcherInParams setTransactionText(String str) {
            this.m_transText = str;
            return this;
        }

        public MatcherInParams() {
        }
    }
}
