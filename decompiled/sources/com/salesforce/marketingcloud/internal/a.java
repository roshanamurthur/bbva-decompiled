package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/internal/a;", "", "<init>", "()V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.internal.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"Lcom/salesforce/marketingcloud/internal/a$a;", "", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage;", "message", "", "a", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;", "Lorg/json/JSONObject;", "b", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final InAppMessage.CloseButton a() {
            return InAppMessage.CloseButton.INSTANCE.a();
        }

        @JvmStatic
        @NotNull
        public final JSONObject b(@NotNull InAppMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return message.m5416toJson();
        }

        @JvmStatic
        @NotNull
        public final String a(@NotNull InAppMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return message.getActivityInstanceId();
        }
    }

    @JvmStatic
    @NotNull
    public static final InAppMessage.CloseButton a() {
        return INSTANCE.a();
    }

    @JvmStatic
    @NotNull
    public static final JSONObject b(@NotNull InAppMessage inAppMessage) {
        return INSTANCE.b(inAppMessage);
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull InAppMessage inAppMessage) {
        return INSTANCE.a(inAppMessage);
    }
}
