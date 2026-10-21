package com.salesforce.marketingcloud.config;

import android.net.Uri;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0004\u0005B)\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0004\u0010\fJ\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/salesforce/marketingcloud/config/b;", "", "", "toString", "a", "b", "", "c", "()Ljava/lang/Integer;", a.f64109t, "path", a.f64111v, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/salesforce/marketingcloud/config/b;", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "f", "Ljava/lang/Integer;", "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String endpoint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final String path;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final Integer maxBatchSize;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.config.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0087\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/salesforce/marketingcloud/config/b$a;", "", "", "endpointIn", "pathIn", "", "maxBatchSizeIn", "Lcom/salesforce/marketingcloud/config/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/salesforce/marketingcloud/config/b;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b a(Companion companion, String str, String str2, Integer num, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                num = null;
            }
            return companion.a(str, str2, num);
        }

        @JvmOverloads
        @NotNull
        public final b a(@NotNull String endpointIn) {
            Intrinsics.checkNotNullParameter(endpointIn, "endpointIn");
            return a(this, endpointIn, null, null, 6, null);
        }

        @JvmOverloads
        @NotNull
        public final b a(@NotNull String endpointIn, @Nullable String str) {
            Intrinsics.checkNotNullParameter(endpointIn, "endpointIn");
            return a(this, endpointIn, str, null, 4, null);
        }

        @JvmOverloads
        @NotNull
        public final b a(@NotNull String endpointIn, @Nullable String pathIn, @Nullable Integer maxBatchSizeIn) {
            String string;
            Intrinsics.checkNotNullParameter(endpointIn, "endpointIn");
            String string2 = StringsKt__StringsKt.trim((CharSequence) endpointIn).toString();
            if (string2.length() == 0 || !ArraysKt___ArraysKt.contains(EnumC0247b.values(), EnumC0247b.valueOf(string2))) {
                throw new IllegalArgumentException("Invalid 'endpoint' for endpoint config.");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (pathIn == null || (string = StringsKt__StringsKt.trim((CharSequence) pathIn).toString()) == null) {
                string = null;
            } else if (string.length() == 0 || !l.startsWith$default(string, "/", false, 2, null) || !Intrinsics.areEqual(string, Uri.parse(string).getPath())) {
                throw new IllegalArgumentException(h0.b("Invalid 'path' for ", string2, " endpoint config."));
            }
            if (maxBatchSizeIn != null && !new IntRange(10, Integer.MAX_VALUE).contains(maxBatchSizeIn.intValue())) {
                throw new IllegalArgumentException(h0.b("Invalid 'maxBatchSize' for ", string2, " endpoint config."));
            }
            if (string == null && maxBatchSizeIn == null) {
                throw new IllegalArgumentException(h0.b("Empty endpoint config for ", string2, " is pointless."));
            }
            return new b(string2, string, maxBatchSizeIn, defaultConstructorMarker);
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.config.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/config/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public enum EnumC0247b {
        EVENTS
    }

    private b(String str, String str2, Integer num) {
        this.endpoint = str;
        this.path = str2;
        this.maxBatchSize = num;
    }

    public static /* synthetic */ b a(b bVar, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.endpoint;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.path;
        }
        if ((i10 & 4) != 0) {
            num = bVar.maxBatchSize;
        }
        return bVar.a(str, str2, num);
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getMaxBatchSize() {
        return this.maxBatchSize;
    }

    @NotNull
    public final String d() {
        return this.endpoint;
    }

    @Nullable
    public final Integer e() {
        return this.maxBatchSize;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return Intrinsics.areEqual(this.endpoint, bVar.endpoint) && Intrinsics.areEqual(this.path, bVar.path) && Intrinsics.areEqual(this.maxBatchSize, bVar.maxBatchSize);
    }

    @Nullable
    public final String f() {
        return this.path;
    }

    public int hashCode() {
        int iHashCode = this.endpoint.hashCode() * 31;
        String str = this.path;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxBatchSize;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EndpointConfig(endpoint=" + this.endpoint + ", path=" + this.path + ", maxBatchSize=" + this.maxBatchSize + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ b(String str, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
    }

    @NotNull
    public final b a(@NotNull String endpoint, @Nullable String path, @Nullable Integer maxBatchSize) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        return new b(endpoint, path, maxBatchSize);
    }

    public /* synthetic */ b(String str, String str2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }
}
