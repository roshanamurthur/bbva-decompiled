package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0016\u0018\u0000 \u00012\u00020\u0016:\u0001\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u00020\u0002X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0013\u0010\u0007\u001a\u00020\u0002X\u0083\u0080\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\rR\u0014\u0010\u0003\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK;", "AFa1ySDK", "", "afErrorLog", "Lkotlin/Lazy;", "AFInAppEventType", "values", "AFInAppEventParameterName", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFb1cSDK;", "Lcom/appsflyer/internal/AFb1cSDK;", DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, "", "()Z", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "Lcom/appsflyer/internal/AFb1fSDK;", "Lcom/appsflyer/internal/AFb1fSDK;", "afInfoLog", "p0", "p1", "<init>", "(Lcom/appsflyer/internal/AFb1cSDK;Lcom/appsflyer/internal/AFb1fSDK;)V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
public class AFc1cSDK {

    @Nullable
    private static AFc1dSDK afRDLog;

    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    private final AFb1cSDK AFKeystoreWrapper;

    /* JADX INFO: renamed from: AFInAppEventType, reason: from kotlin metadata */
    @NotNull
    private final AFb1fSDK afErrorLog;

    /* JADX INFO: renamed from: afErrorLog, reason: from kotlin metadata */
    @NotNull
    private final Lazy AFInAppEventType;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    @NotNull
    public final Lazy AFInAppEventParameterName;

    /* JADX INFO: renamed from: AFa1ySDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String AFKeystoreWrapper = "https://%scdn-%ssettings.%s/android/v1/%s/settings";

    @NotNull
    public static String valueOf = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";

    @NotNull
    private static final List<String> afInfoLog = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"googleplay", "playstore", "googleplaystore"});

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFc1aSDK.values().length];
            iArr[AFc1aSDK.DEFAULT.ordinal()] = 1;
            iArr[AFc1aSDK.API.ordinal()] = 2;
            iArr[AFc1aSDK.RC.ordinal()] = 3;
            AFKeystoreWrapper = iArr;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1cSDK$AFa1ySDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u0012B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0002X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0012\u0010\u000b\u001a\u00020\u0002X\u0087\u0002¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\f@\u0007X\u0087\n¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000b\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFc1cSDK$AFa1ySDK;", "", "", "afInfoLog", "Ljava/util/List;", "AFInAppEventType", "()Ljava/util/List;", DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, "Ljava/lang/String;", "AFInAppEventParameterName", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "values", "Lcom/appsflyer/internal/AFc1dSDK;", "afRDLog", "Lcom/appsflyer/internal/AFc1dSDK;", "(Lcom/appsflyer/internal/AFc1dSDK;)V", "<init>", "()V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "AFInAppEventType")
        @NotNull
        public static List<String> AFInAppEventType() {
            return AFc1cSDK.afInfoLog;
        }

        @JvmName(name = "values")
        public static void values(@Nullable AFc1dSDK aFc1dSDK) {
            AFc1cSDK.afRDLog = aFc1dSDK;
        }
    }

    public AFc1cSDK(@NotNull AFb1cSDK aFb1cSDK, @NotNull AFb1fSDK aFb1fSDK) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        Intrinsics.checkNotNullParameter(aFb1fSDK, "");
        this.AFKeystoreWrapper = aFb1cSDK;
        this.afErrorLog = aFb1fSDK;
        this.AFInAppEventType = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFc1cSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String strValues = AFa1dSDK.values(AFc1cSDK.this.afErrorLog, AFc1cSDK.this.AFKeystoreWrapper.AFKeystoreWrapper());
                if (strValues != null && !l.isBlank(strValues)) {
                    String string = StringsKt__StringsKt.trim((CharSequence) strValues).toString();
                    List<String> listAFInAppEventType = Companion.AFInAppEventType();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = string.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (listAFInAppEventType.contains(lowerCase)) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        AFLogger.afWarnLog(str);
                        strValues = "";
                    } else {
                        strValues = Constant.DASH_STRING.concat(string);
                    }
                }
                return StringsKt__StringsKt.trim((CharSequence) (strValues != null ? strValues : "")).toString();
            }
        });
        this.AFInAppEventParameterName = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.appsflyer.internal.AFc1cSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String packageName = AFc1cSDK.this.AFKeystoreWrapper.values.AFInAppEventParameterName.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFc1cSDK.AFInAppEventParameterName(packageName, AFc1cSDK.AFInAppEventParameterName(AFc1cSDK.this));
            }
        });
    }

    public static final void AFInAppEventType(@Nullable AFc1dSDK aFc1dSDK) {
        Companion.values(aFc1dSDK);
    }

    @JvmName(name = "AFInAppEventParameterName")
    public static boolean AFInAppEventParameterName() {
        return afRDLog == null;
    }

    @JvmName(name = "AFInAppEventType")
    @NotNull
    public final String AFInAppEventType() {
        int i10 = AFa1vSDK.AFKeystoreWrapper[(AFInAppEventParameterName() ? AFc1aSDK.DEFAULT : AFc1aSDK.API).ordinal()];
        if (i10 == 1) {
            return "appsflyersdk.com";
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFc1dSDK aFc1dSDK = afRDLog;
        String str = aFc1dSDK != null ? aFc1dSDK.values : null;
        return str == null ? "" : str;
    }

    @JvmName(name = DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF)
    @NotNull
    public final String valueOf() {
        int i10 = AFa1vSDK.AFKeystoreWrapper[(AFInAppEventParameterName() ? AFc1aSDK.DEFAULT : AFc1aSDK.API).ordinal()];
        if (i10 == 1) {
            return (String) this.AFInAppEventParameterName.getValue();
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        AFc1dSDK aFc1dSDK = afRDLog;
        String str = aFc1dSDK != null ? aFc1dSDK.AFInAppEventParameterName : null;
        return str == null ? "" : str;
    }

    public static final /* synthetic */ String AFInAppEventParameterName(String str, String str2) throws NoSuchAlgorithmException {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(str2);
        String string = sb3.toString();
        Intrinsics.checkNotNullParameter(string, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strSubstring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb2.append(strSubstring);
        sb2.append('-');
        return sb2.toString();
    }

    public static final /* synthetic */ String AFInAppEventParameterName(AFc1cSDK aFc1cSDK) {
        return (String) aFc1cSDK.AFInAppEventType.getValue();
    }
}
