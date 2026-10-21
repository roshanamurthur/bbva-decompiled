package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.Region;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/internal/j;", "", "<init>", "()V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.internal.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000e"}, d2 = {"Lcom/salesforce/marketingcloud/internal/j$a;", "", "Lcom/salesforce/marketingcloud/location/LatLon;", "center", "", "radius", "Lcom/salesforce/marketingcloud/messages/Region;", "a", "region", "", "isInside", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Region a(@NotNull LatLon center, int radius) {
            Intrinsics.checkNotNullParameter(center, "center");
            return Region.INSTANCE.m5391magicFence(center, radius);
        }

        @JvmStatic
        public final void a(@NotNull Region region, boolean isInside) {
            Intrinsics.checkNotNullParameter(region, "region");
            region.m5388isInside(isInside);
        }

        @JvmStatic
        public final boolean a(@NotNull Region region) {
            Intrinsics.checkNotNullParameter(region, "region");
            return region.getIsInside();
        }
    }

    @JvmStatic
    @NotNull
    public static final Region a(@NotNull LatLon latLon, int i10) {
        return INSTANCE.a(latLon, i10);
    }

    @JvmStatic
    public static final void a(@NotNull Region region, boolean z10) {
        INSTANCE.a(region, z10);
    }

    @JvmStatic
    public static final boolean a(@NotNull Region region) {
        return INSTANCE.a(region);
    }
}
