package com.noknok.android.client.asm.core;

import android.util.Base64;
import androidx.datastore.preferences.protobuf.q;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.UVTMatcherInParams;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.Outcome;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes11.dex */
public class MatcherParamsHelper {

    /* JADX INFO: renamed from: com.noknok.android.client.asm.core.MatcherParamsHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63228a;

        static {
            int[] iArr = new int[AuthenticatorMatcherType.values().length];
            f63228a = iArr;
            try {
                iArr[AuthenticatorMatcherType.MATCHER_TYPE_UVT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63228a[AuthenticatorMatcherType.MATCHER_TYPE_UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63228a[AuthenticatorMatcherType.MATCHER_TYPE_AKMANAGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum AuthenticatorMatcherType {
        MATCHER_TYPE_UVT,
        MATCHER_TYPE_AKMANAGED,
        MATCHER_TYPE_UNKNOWN
    }

    public static IMatcher.MatcherInParams createMatcherInParams(AuthenticatorMatcherType authenticatorMatcherType, GetInfoParams getInfoParams, byte[] bArr, IMatcher.IAntiHammeringCallback iAntiHammeringCallback, String str, ActivityProxy activityProxy, Boolean bool) {
        String customUIJson;
        String str2;
        String str3;
        int i10 = AnonymousClass1.f63228a[authenticatorMatcherType.ordinal()];
        if (i10 == 1) {
            if (getInfoParams != null) {
                customUIJson = getInfoParams.getCustomUIJson();
                str2 = getInfoParams.getTransText();
            } else {
                customUIJson = null;
                str2 = null;
            }
            if (str2 != null) {
                try {
                    str2 = new String(Base64.decode(str2, 11), Charsets.utf8Charset);
                } catch (IllegalArgumentException unused) {
                    throw new AsmException(Outcome.FAILURE, "Error building UVT matcher.");
                }
            }
            return new UVTMatcherInParams().setAntihammeringCallback(iAntiHammeringCallback).setCustomUI(customUIJson).setFinalChallenge(bArr).setTransText(str2).setAAID(str).setCallerActivity(activityProxy).setHasRegistrations(bool);
        }
        if (i10 != 2 && i10 != 3) {
            throw new InvalidParameterException("UnSupported Matcher Type " + authenticatorMatcherType);
        }
        if (getInfoParams == null) {
            throw new InvalidParameterException("GetInfoParams is NULL");
        }
        String transText = getInfoParams.getTransText();
        String customUIJson2 = getInfoParams.getCustomUIJson();
        if (transText != null) {
            try {
                str3 = new String(Base64.decode(transText, 11), Charsets.utf8Charset);
            } catch (IllegalArgumentException unused2) {
                throw new AsmException(Outcome.FAILURE, "Error while building base matcher.");
            }
        } else {
            str3 = transText;
        }
        return new IMatcher.MatcherInParams(customUIJson2, str3, bArr, iAntiHammeringCallback, null, null, activityProxy);
    }

    public static IMatcher.MatcherSettingsInParams createMatcherManageInParams(IMatcher iMatcher, IMatcher.IAntiHammeringCallback iAntiHammeringCallback, String str, ActivityProxy activityProxy) {
        Class<? extends IMatcher.MatcherSettingsInParams> matcherManageInParamsClass = iMatcher.getMatcherDefinedParamsClassList().getMatcherManageInParamsClass();
        if (matcherManageInParamsClass == IMatcher.MatcherSettingsInParams.class) {
            return new IMatcher.MatcherSettingsInParams(iAntiHammeringCallback, str, activityProxy);
        }
        throw new InvalidParameterException(q.c("Unsupported ManageInparams class : ", matcherManageInParamsClass));
    }

    public static AuthenticatorMatcherType getMatcherType(boolean z10, boolean z11, IMatcher iMatcher) {
        if (z10 || z11) {
            return AuthenticatorMatcherType.MATCHER_TYPE_AKMANAGED;
        }
        return iMatcher.getMatcherDefinedParamsClassList().getMatcherInParamsClass() == UVTMatcherInParams.class ? AuthenticatorMatcherType.MATCHER_TYPE_UVT : AuthenticatorMatcherType.MATCHER_TYPE_UNKNOWN;
    }
}
