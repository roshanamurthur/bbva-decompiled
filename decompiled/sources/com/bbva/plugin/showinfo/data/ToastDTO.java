package com.bbva.plugin.showinfo.data;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ToastDTO.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/showinfo/data/ToastDTO;", "", "content", "", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ToastDTO {

    @Nullable
    private final String content;

    public ToastDTO(@Nullable String str) {
        this.content = str;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }
}
