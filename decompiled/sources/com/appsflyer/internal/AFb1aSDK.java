package com.appsflyer.internal;

import android.util.Base64;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00012\u00020\u000b:\u0001\u0001B)\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\t\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\t\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0003\u001a\u00020\u0002X\u0086\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u0005X\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\u0005X\u0007¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005X\u0007¢\u0006\u0006\n\u0004\b\n\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFb1aSDK;", "AFa1xSDK", "", DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, TransactionType.TRANSACTION_TYPE_DRSP_CODE, "", "AFInAppEventType", "Ljava/lang/String;", "values", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "AFInAppEventParameterName", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", GenerateActivationFormCommand.HASH_CODE, "()I", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AFb1aSDK {

    /* JADX INFO: renamed from: AFa1xSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public final String AFInAppEventParameterName;

    @NotNull
    public final String AFInAppEventType;
    public int AFKeystoreWrapper;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    @NotNull
    public final String valueOf;

    public AFb1aSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.valueOf = str;
        this.AFInAppEventType = str2;
        this.AFInAppEventParameterName = str3;
        this.AFKeystoreWrapper = i10;
    }

    public final boolean equals(@Nullable Object p4) {
        if (this == p4) {
            return true;
        }
        if (!(p4 instanceof AFb1aSDK)) {
            return false;
        }
        AFb1aSDK aFb1aSDK = (AFb1aSDK) p4;
        return Intrinsics.areEqual(this.valueOf, aFb1aSDK.valueOf) && Intrinsics.areEqual(this.AFInAppEventType, aFb1aSDK.AFInAppEventType) && Intrinsics.areEqual(this.AFInAppEventParameterName, aFb1aSDK.AFInAppEventParameterName) && this.AFKeystoreWrapper == aFb1aSDK.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return ((this.AFInAppEventParameterName.hashCode() + ((this.AFInAppEventType.hashCode() + (this.valueOf.hashCode() * 31)) * 31)) * 31) + this.AFKeystoreWrapper;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFb1aSDK(valueOf=");
        sb2.append(this.valueOf);
        sb2.append(", AFInAppEventType=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", AFKeystoreWrapper=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(RootService.CLOSE_BRACKET);
        return sb2.toString();
    }

    @NotNull
    public final JSONObject valueOf() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.valueOf);
        jSONObject.put("hash_name", this.AFInAppEventType);
        jSONObject.put(DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE, this.AFInAppEventParameterName);
        jSONObject.put("c", String.valueOf(this.AFKeystoreWrapper));
        return jSONObject;
    }

    public /* synthetic */ AFb1aSDK(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? 1 : i10);
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1aSDK$AFa1xSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0086\u0003\u0018\u00002\u00020\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFb1aSDK$AFa1xSDK;", "", "p0", "", "", "p1", "", "AFInAppEventType", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFb1aSDK;", DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, "(Ljava/lang/String;)Lcom/appsflyer/internal/AFb1aSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static boolean AFInAppEventType(Integer p4, String... p10) {
            boolean z10 = p4 == null;
            int length = p10.length;
            for (int i10 = 0; i10 < 3; i10++) {
                String str = p10[i10];
                z10 = z10 || str == null || str.length() == 0;
            }
            return z10;
        }

        @Nullable
        public static AFb1aSDK AFKeystoreWrapper(@NotNull String p4) {
            Intrinsics.checkNotNullParameter(p4, "");
            List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) p4, new String[]{RootService.LINE_BREAK}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            String strAFKeystoreWrapper = null;
            String strAFKeystoreWrapper2 = null;
            String strAFKeystoreWrapper3 = null;
            Integer numValueOf = null;
            for (String str : listSplit$default) {
                if (l.startsWith$default(str, "label=", false, 2, null)) {
                    strAFKeystoreWrapper = AFKeystoreWrapper(str, "label=");
                } else if (l.startsWith$default(str, "hashName=", false, 2, null)) {
                    strAFKeystoreWrapper2 = AFKeystoreWrapper(str, "hashName=");
                } else if (!l.startsWith$default(str, "stackTrace=", false, 2, null)) {
                    if (!l.startsWith$default(str, "c=", false, 2, null)) {
                        break;
                    }
                    String strSubstring = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    numValueOf = Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) strSubstring).toString()));
                } else {
                    strAFKeystoreWrapper3 = AFKeystoreWrapper(str, "stackTrace=");
                }
            }
            if (AFInAppEventType(numValueOf, strAFKeystoreWrapper, strAFKeystoreWrapper2, strAFKeystoreWrapper3)) {
                return null;
            }
            Intrinsics.checkNotNull(strAFKeystoreWrapper);
            Intrinsics.checkNotNull(strAFKeystoreWrapper2);
            Intrinsics.checkNotNull(strAFKeystoreWrapper3);
            Intrinsics.checkNotNull(numValueOf);
            return new AFb1aSDK(strAFKeystoreWrapper, strAFKeystoreWrapper2, strAFKeystoreWrapper3, numValueOf.intValue());
        }

        private static String AFKeystoreWrapper(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            return new String(bArrDecode, charset);
        }
    }
}
