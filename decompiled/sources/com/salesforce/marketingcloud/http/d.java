package com.salesforce.marketingcloud.http;

import android.os.Parcel;
import android.os.Parcelable;
import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0002\r\u000fBO\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120 0\u001f¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0016\u0010\u001cR)\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120 0\u001f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006&"}, d2 = {"Lcom/salesforce/marketingcloud/http/d;", "Landroid/os/Parcelable;", "", "g", "", "h", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "b", "()I", "code", "", "Ljava/lang/String;", "()Ljava/lang/String;", "body", "c", "e", "message", "d", "J", "f", "()J", "startTimeMillis", "endTimeMillis", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "headers", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJLjava/util/Map;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class d implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final String body;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final String message;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long startTimeMillis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long endTimeMillis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Map<String, List<String>> headers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new c();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ \u0010\u0004\u001a\u00020\u00002\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fJ\u0006\u0010\u0004\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R*\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/salesforce/marketingcloud/http/d$a;", "", "", "code", "a", "", "body", "message", "b", "", "startTimeMillis", "endTimeMillis", "", "", "headers", "Lcom/salesforce/marketingcloud/http/d;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Ljava/lang/String;", "c", "d", "J", "e", "f", "Ljava/util/Map;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int code;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private String body;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private String message;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long startTimeMillis;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private long endTimeMillis;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        private Map<String, ? extends List<String>> headers;

        @NotNull
        public final a a(int code) {
            this.code = code;
            return this;
        }

        @NotNull
        public final a b(long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            return this;
        }

        @NotNull
        public final a a(long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            return this;
        }

        @NotNull
        public final a b(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            return this;
        }

        @NotNull
        public final a a(@NotNull String body) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
            return this;
        }

        @NotNull
        public final a a(@NotNull Map<String, ? extends List<String>> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers;
            return this;
        }

        @NotNull
        public final d a() {
            int i10 = this.code;
            String str = this.body;
            String str2 = this.message;
            long j10 = this.startTimeMillis;
            long j11 = this.endTimeMillis;
            Map<String, ? extends List<String>> mapEmptyMap = this.headers;
            if (mapEmptyMap == null) {
                mapEmptyMap = q.emptyMap();
            }
            return new d(i10, str, str2, j10, j11, mapEmptyMap);
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.http.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/salesforce/marketingcloud/http/d$b;", "", "Lcom/salesforce/marketingcloud/http/d$a;", "a", "", "message", "", "code", "Lcom/salesforce/marketingcloud/http/d;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a() {
            return new a();
        }

        @JvmStatic
        @NotNull
        public final d a(@NotNull String message, int code) {
            Intrinsics.checkNotNullParameter(message, "message");
            long jCurrentTimeMillis = System.currentTimeMillis();
            return a().a(code).b(message).b(jCurrentTimeMillis).a(jCurrentTimeMillis).a();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j10 = parcel.readLong();
            long j11 = parcel.readLong();
            int i11 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
            }
            return new d(i10, string, string2, j10, j11, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i10, @Nullable String str, @Nullable String str2, long j10, long j11, @NotNull Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.code = i10;
        this.body = str;
        this.message = str2;
        this.startTimeMillis = j10;
        this.endTimeMillis = j11;
        this.headers = headers;
    }

    @JvmStatic
    @NotNull
    public static final d a(@NotNull String str, int i10) {
        return INSTANCE.a(str, i10);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getEndTimeMillis() {
        return this.endTimeMillis;
    }

    @NotNull
    public final Map<String, List<String>> d() {
        return this.headers;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public final boolean g() {
        int i10 = this.code;
        return 200 <= i10 && i10 < 300;
    }

    public final long h() {
        return this.endTimeMillis - this.startTimeMillis;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.code);
        parcel.writeString(this.body);
        parcel.writeString(this.message);
        parcel.writeLong(this.startTimeMillis);
        parcel.writeLong(this.endTimeMillis);
        Map<String, List<String>> map = this.headers;
        parcel.writeInt(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeStringList(entry.getValue());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }
}
