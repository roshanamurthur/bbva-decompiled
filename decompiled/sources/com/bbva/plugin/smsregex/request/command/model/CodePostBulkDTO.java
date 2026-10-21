package com.bbva.plugin.smsregex.request.command.model;

import com.bbva.androidtoolkit.plugin.postmessage.PayloadDTO;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Models.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/smsregex/request/command/model/CodePostBulkDTO;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PayloadDTO;", "", "a", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "action", "", "b", "Ljava/util/List;", "getMatches", "()Ljava/util/List;", "matches", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "smsregex-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class CodePostBulkDTO extends PayloadDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("action")
    @NotNull
    private final String action;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("matches")
    @NotNull
    private final List<String> matches;

    public /* synthetic */ CodePostBulkDTO(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "onSmsReceived" : str, list);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final List<String> getMatches() {
        return this.matches;
    }

    public CodePostBulkDTO(@NotNull String action, @NotNull List<String> matches) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(matches, "matches");
        this.action = action;
        this.matches = matches;
    }
}
