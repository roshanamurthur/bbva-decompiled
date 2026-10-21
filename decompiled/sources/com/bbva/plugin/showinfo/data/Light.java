package com.bbva.plugin.showinfo.data;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: compiled from: NotificationDTO.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/showinfo/data/Light;", "", "color", "", "ledOnMilliseconds", "ledOffMilliseconds", "(III)V", "getColor", "()I", "getLedOffMilliseconds", "getLedOnMilliseconds", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Light {
    private final int color;

    @SerializedName("ledOfMilliseconds")
    private final int ledOffMilliseconds;
    private final int ledOnMilliseconds;

    public Light(int i10, int i11, int i12) {
        this.color = i10;
        this.ledOnMilliseconds = i11;
        this.ledOffMilliseconds = i12;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getLedOffMilliseconds() {
        return this.ledOffMilliseconds;
    }

    public final int getLedOnMilliseconds() {
        return this.ledOnMilliseconds;
    }
}
