package com.viergegroup.sdk.taptophone.vierge.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/models/MessageLectureType;", "", "()V", "message", "", "idMessage", "", "(Ljava/lang/String;I)V", "getIdMessage", "()I", "setIdMessage", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MessageLectureType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f67967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67968b;

    public MessageLectureType() {
        this.f67967a = "";
        this.f67968b = -1;
    }

    /* JADX INFO: renamed from: getIdMessage, reason: from getter */
    public final int getF67968b() {
        return this.f67968b;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public final String getF67967a() {
        return this.f67967a;
    }

    public final void setIdMessage(int i10) {
        this.f67968b = i10;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67967a = str;
    }

    public MessageLectureType(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f67967a = str;
        this.f67968b = i10;
    }
}
