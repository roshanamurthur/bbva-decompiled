package com.bbva.ethermobile.elogger.model;

import android.os.Build;
import bk.q;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.devicemanager.data.logger.repository.EtherLoggerRepositoryImpl;
import com.bbva.notifications.extensions.SalesforceDeepLinkModelExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ErrorPayload.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0013\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/bbva/ethermobile/elogger/model/ErrorPayload;", "", "", "", "toMap", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getVersionCode", "()I", "versionCode", "b", "Ljava/lang/String;", "getVersionName", "()Ljava/lang/String;", "versionName", "", "c", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "exception", "d", "getOriginClass", "originClass", "e", "getMessage", "message", "f", "Ljava/util/Map;", "getExtra", "()Ljava/util/Map;", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "elogger_release"}, k = 1, mv = {1, 8, 0})
public final class ErrorPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int versionCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String versionName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Throwable exception;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String originClass;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String message;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Object> extra;

    public ErrorPayload(int i10, @NotNull String versionName, @NotNull Throwable exception, @NotNull String originClass, @Nullable String str, @NotNull Map<String, ? extends Object> extra) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(originClass, "originClass");
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.versionCode = i10;
        this.versionName = versionName;
        this.exception = exception;
        this.originClass = originClass;
        this.message = str;
        this.extra = extra;
    }

    @NotNull
    public final Throwable getException() {
        return this.exception;
    }

    @NotNull
    public final Map<String, Object> getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getOriginClass() {
        return this.originClass;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("device_os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = "";
        if (str == null) {
            str = "";
        } else {
            Intrinsics.checkNotNullExpressionValue(str, "Build.MANUFACTURER ?: \"\"");
        }
        linkedHashMap.put("device_manufacturer", str);
        String str3 = Build.MODEL;
        if (str3 != null) {
            Intrinsics.checkNotNullExpressionValue(str3, "Build.MODEL ?: \"\"");
            str2 = str3;
        }
        linkedHashMap.put("device_model", str2);
        linkedHashMap.put("device_timestamp", String.valueOf(Calendar.getInstance().getTimeInMillis()));
        linkedHashMap.put("library_version_code", Integer.valueOf(this.versionCode));
        linkedHashMap.put("library_version_name", this.versionName);
        StackTraceElement[] stackTrace = this.exception.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "exception.stackTrace");
        linkedHashMap.put(EtherLoggerRepositoryImpl.PARAM_EXCEPTION_STACKTRACE, ArraysKt___ArraysKt.joinToString$default(stackTrace, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        linkedHashMap.put("exception_origin", this.originClass);
        String str4 = this.message;
        if (str4 == null) {
            str4 = "<empty message>";
        }
        linkedHashMap.put("message", str4);
        linkedHashMap.put("level", Integer.valueOf(LoggerLevel.ERROR.ordinal()));
        return q.plus(linkedHashMap, this.extra);
    }

    public /* synthetic */ ErrorPayload(int i10, String str, Throwable th2, String str2, String str3, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, th2, str2, (i11 & 16) != 0 ? th2.getMessage() : str3, (i11 & 32) != 0 ? q.emptyMap() : map);
    }
}
