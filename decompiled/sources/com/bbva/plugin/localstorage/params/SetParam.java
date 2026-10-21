package com.bbva.plugin.localstorage.params;

import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SetParam.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/bbva/plugin/localstorage/params/SetParam;", "Lcom/bbva/plugin/localstorage/params/MalformedParams;", "key", "", "secure", "", "value", "Lcom/google/gson/JsonElement;", "volatile", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/gson/JsonElement;Ljava/lang/Boolean;)V", "getKey", "()Ljava/lang/String;", "getSecure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getValue", "()Lcom/google/gson/JsonElement;", "getVolatile", "isMalformed", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SetParam implements MalformedParams {

    @Nullable
    private final String key;

    @Nullable
    private final Boolean secure;

    @Nullable
    private final JsonElement value;

    @Nullable
    private final Boolean volatile;

    public SetParam(@Nullable String str, @Nullable Boolean bool, @Nullable JsonElement jsonElement, @Nullable Boolean bool2) {
        this.key = str;
        this.secure = bool;
        this.value = jsonElement;
        this.volatile = bool2;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Boolean getSecure() {
        return this.secure;
    }

    @Nullable
    public final JsonElement getValue() {
        return this.value;
    }

    @Nullable
    public final Boolean getVolatile() {
        return this.volatile;
    }

    @Override // com.bbva.plugin.localstorage.params.MalformedParams
    public boolean isMalformed() {
        String str = this.key;
        return str == null || str.length() == 0;
    }

    public /* synthetic */ SetParam(String str, Boolean bool, JsonElement jsonElement, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? Boolean.FALSE : bool, jsonElement, (i10 & 8) != 0 ? Boolean.FALSE : bool2);
    }
}
