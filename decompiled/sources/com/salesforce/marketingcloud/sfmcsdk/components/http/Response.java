package com.salesforce.marketingcloud.sfmcsdk.components.http;

import android.os.Parcel;
import android.os.Parcelable;
import bk.q;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002!\"BM\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006#"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Response;", "Landroid/os/Parcelable;", "code", "", "body", "", "message", "startTimeMillis", "", "endTimeMillis", "headers", "", "", "(ILjava/lang/String;Ljava/lang/String;JJLjava/util/Map;)V", "getBody", "()Ljava/lang/String;", "getCode", "()I", "getEndTimeMillis", "()J", "getHeaders", "()Ljava/util/Map;", "getMessage", "getStartTimeMillis", "describeContents", "isSuccessful", "", "timeToExecute", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Response implements Parcelable {

    @Nullable
    private final String body;
    private final int code;
    private final long endTimeMillis;

    @NotNull
    private final Map<String, List<String>> headers;

    @Nullable
    private final String message;
    private final long startTimeMillis;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Response> CREATOR = new Creator();

    /* JADX INFO: compiled from: Response.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\u00002\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\nJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Response$Builder;", "", "()V", "body", "", "code", "", "endTimeMillis", "", "headers", "", "", "message", "startTimeMillis", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Response;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String body;
        private int code;
        private long endTimeMillis;

        @Nullable
        private Map<String, ? extends List<String>> headers;

        @Nullable
        private String message;
        private long startTimeMillis;

        @NotNull
        public final Builder body(@NotNull String body) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
            return this;
        }

        @NotNull
        public final Response build() {
            int i10 = this.code;
            String str = this.body;
            String str2 = this.message;
            long j10 = this.startTimeMillis;
            long j11 = this.endTimeMillis;
            Map<String, ? extends List<String>> mapEmptyMap = this.headers;
            if (mapEmptyMap == null) {
                mapEmptyMap = q.emptyMap();
            }
            return new Response(i10, str, str2, j10, j11, mapEmptyMap);
        }

        @NotNull
        public final Builder code(int code) {
            this.code = code;
            return this;
        }

        @NotNull
        public final Builder endTimeMillis(long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            return this;
        }

        @NotNull
        public final Builder headers(@NotNull Map<String, ? extends List<String>> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers;
            return this;
        }

        @NotNull
        public final Builder message(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            return this;
        }

        @NotNull
        public final Builder startTimeMillis(long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            return this;
        }
    }

    /* JADX INFO: compiled from: Response.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Response$Companion;", "", "()V", "error", "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Response;", "message", "", "code", "", "error$sfmcsdk_release", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Response error$sfmcsdk_release(@NotNull String message, int code) {
            Intrinsics.checkNotNullParameter(message, "message");
            long jCurrentTimeMillis = System.currentTimeMillis();
            return new Builder().code(code).message(message).startTimeMillis(jCurrentTimeMillis).endTimeMillis(jCurrentTimeMillis).build();
        }
    }

    /* JADX INFO: compiled from: Response.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Response> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Response createFromParcel(@NotNull Parcel parcel) {
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
            return new Response(i10, string, string2, j10, j11, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Response[] newArray(int i10) {
            return new Response[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Response(int i10, @Nullable String str, @Nullable String str2, long j10, long j11, @NotNull Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.code = i10;
        this.body = str;
        this.message = str2;
        this.startTimeMillis = j10;
        this.endTimeMillis = j11;
        this.headers = headers;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final long getEndTimeMillis() {
        return this.endTimeMillis;
    }

    @NotNull
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public final boolean isSuccessful() {
        int i10 = this.code;
        return 200 <= i10 && i10 < 300;
    }

    public final long timeToExecute() {
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
}
