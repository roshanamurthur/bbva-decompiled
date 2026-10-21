package com.bbva.document.scanner.plugin.model;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationParam.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/NotificationParam;", "", "text", "", TypedValues.TransitionType.S_DURATION, "", "(Ljava/lang/String;J)V", "getDuration", "()J", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NotificationParam {
    private final long duration;

    @NotNull
    private final String text;

    public NotificationParam(@NotNull String text, long j10) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.duration = j10;
    }

    public static /* synthetic */ NotificationParam copy$default(NotificationParam notificationParam, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationParam.text;
        }
        if ((i10 & 2) != 0) {
            j10 = notificationParam.duration;
        }
        return notificationParam.copy(str, j10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final NotificationParam copy(@NotNull String text, long duration) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new NotificationParam(text, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationParam)) {
            return false;
        }
        NotificationParam notificationParam = (NotificationParam) other;
        return Intrinsics.areEqual(this.text, notificationParam.text) && this.duration == notificationParam.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        long j10 = this.duration;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "NotificationParam(text=" + this.text + ", duration=" + this.duration + ")";
    }
}
