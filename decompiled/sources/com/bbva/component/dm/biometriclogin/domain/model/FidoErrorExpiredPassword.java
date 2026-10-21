package com.bbva.component.dm.biometriclogin.domain.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FidoErrorResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/FidoErrorExpiredPassword;", "", "", "Lcom/bbva/component/dm/biometriclogin/domain/model/BodyErrorDefault;", "a", "Ljava/util/List;", "getMessages", "()Ljava/util/List;", "messages", "<init>", "(Ljava/util/List;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class FidoErrorExpiredPassword {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messages")
    @Nullable
    private final List<BodyErrorDefault> messages;

    public FidoErrorExpiredPassword(@Nullable List<BodyErrorDefault> list) {
        this.messages = list;
    }

    @Nullable
    public final List<BodyErrorDefault> getMessages() {
        return this.messages;
    }
}
