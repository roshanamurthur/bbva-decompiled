package com.bbva.component.dm.biometriclogin.domain.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FidoErrorResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BodyErrorDefault;", "", "", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "b", "getCode", "code", "c", "getMessage", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class BodyErrorDefault {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("type")
    @Nullable
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("code")
    @Nullable
    private final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    @Nullable
    private final String message;

    public BodyErrorDefault(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.type = str;
        this.code = str2;
        this.message = str3;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }
}
