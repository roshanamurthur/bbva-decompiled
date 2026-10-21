package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.salesforce.marketingcloud.MCLogListener;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/internal/d;", "", "<init>", "()V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.internal.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J&\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\u000e"}, d2 = {"Lcom/salesforce/marketingcloud/internal/d$a;", "", "Lcom/salesforce/marketingcloud/MCLogListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "a", "", "level", "", "appId", "accessToken", "senderId", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int a() {
            return com.salesforce.marketingcloud.g.f64223a.b();
        }

        @JvmStatic
        public final void a(int level) {
            com.salesforce.marketingcloud.g.f64223a.a(level);
        }

        @JvmStatic
        public final void a(@Nullable MCLogListener listener) {
            com.salesforce.marketingcloud.g.f64223a.a(listener);
        }

        @JvmStatic
        public final void a(@Nullable String appId, @Nullable String accessToken, @Nullable String senderId) {
            com.salesforce.marketingcloud.g.a(appId, accessToken, senderId);
        }
    }

    @JvmStatic
    public static final int a() {
        return INSTANCE.a();
    }

    @JvmStatic
    public static final void a(int i10) {
        INSTANCE.a(i10);
    }

    @JvmStatic
    public static final void a(@Nullable MCLogListener mCLogListener) {
        INSTANCE.a(mCLogListener);
    }

    @JvmStatic
    public static final void a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        INSTANCE.a(str, str2, str3);
    }
}
