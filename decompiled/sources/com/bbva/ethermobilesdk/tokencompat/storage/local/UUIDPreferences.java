package com.bbva.ethermobilesdk.tokencompat.storage.local;

import android.content.Context;
import android.content.SharedPreferences;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UUIDPreferences.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/local/UUIDPreferences;", "", "", "clearAll", "", "b", "Ljava/lang/String;", "getCrc", "()Ljava/lang/String;", "crc", "", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getType", "()I", "type", "Landroid/content/Context;", "context", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class UUIDPreferences {

    @Deprecated
    @NotNull
    public static final String CRC_KEY = "CRC";

    @Deprecated
    @NotNull
    public static final String NOT_EXISTS = "notExist";

    @Deprecated
    public static final int NOT_EXISTS_INT = -9;

    @Deprecated
    @NotNull
    public static final String TYPE_KEY = "Type";

    @Deprecated
    @NotNull
    public static final String UNKNOWN = "unknown";

    @Deprecated
    public static final int UNKNOWN_INT = -10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f30651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String crc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int type;

    public UUIDPreferences(@NotNull Context context, @NotNull String name) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        SharedPreferences sharedPreferences = context.getSharedPreferences(name, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.f30651a = sharedPreferences;
        boolean zContains = sharedPreferences.contains(CRC_KEY);
        String str = NOT_EXISTS;
        if (zContains && (string = sharedPreferences.getString(CRC_KEY, "unknown")) != null) {
            str = string;
        }
        Intrinsics.checkNotNullExpressionValue(str, "sharedPreferences.run {\n…else { NOT_EXISTS }\n    }");
        this.crc = str;
        this.type = sharedPreferences.contains(CRC_KEY) ? sharedPreferences.getInt(TYPE_KEY, -10) : -9;
    }

    public final void clearAll() {
        this.f30651a.edit().clear().apply();
    }

    @NotNull
    public final String getCrc() {
        return this.crc;
    }

    public final int getType() {
        return this.type;
    }

    public /* synthetic */ UUIDPreferences(Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? "UuidType" : str);
    }
}
