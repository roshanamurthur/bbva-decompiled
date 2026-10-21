package com.bbva.plugin.smsregex.request.command.model;

import com.bbva.androidtoolkit.plugin.postmessage.PayloadDTO;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/smsregex/request/command/model/ConsentDeniedDTO;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PayloadDTO;", "", "a", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "action", "<init>", "(Ljava/lang/String;)V", "smsregex-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class ConsentDeniedDTO extends PayloadDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("action")
    @NotNull
    private final String action;

    /* JADX WARN: Multi-variable type inference failed */
    public ConsentDeniedDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public /* synthetic */ ConsentDeniedDTO(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "onConsentDenied" : str);
    }

    public ConsentDeniedDTO(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
    }
}
