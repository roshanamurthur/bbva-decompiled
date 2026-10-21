package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/internal/e;", "", "<init>", "()V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.internal.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/salesforce/marketingcloud/internal/e$a;", "", "Lcom/salesforce/marketingcloud/MarketingCloudConfig;", "self", "other", "", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean a(@NotNull MarketingCloudConfig self, @NotNull MarketingCloudConfig other) {
            Intrinsics.checkNotNullParameter(self, "self");
            Intrinsics.checkNotNullParameter(other, "other");
            return self.m5310applicationChanged(other);
        }
    }

    @JvmStatic
    public static final boolean a(@NotNull MarketingCloudConfig marketingCloudConfig, @NotNull MarketingCloudConfig marketingCloudConfig2) {
        return INSTANCE.a(marketingCloudConfig, marketingCloudConfig2);
    }
}
