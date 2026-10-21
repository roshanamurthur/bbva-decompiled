package com.bbva.plugin.localstorage.params;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetParam.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/localstorage/params/GetParam;", "Lcom/bbva/plugin/localstorage/params/MalformedParams;", "key", "", "secure", "", "volatile", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getKey", "()Ljava/lang/String;", "getSecure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVolatile", "isMalformed", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetParam implements MalformedParams {

    @Nullable
    private final String key;

    @Nullable
    private final Boolean secure;

    @Nullable
    private final Boolean volatile;

    public GetParam() {
        this(null, null, null, 7, null);
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
    public final Boolean getVolatile() {
        return this.volatile;
    }

    @Override // com.bbva.plugin.localstorage.params.MalformedParams
    public boolean isMalformed() {
        String str = this.key;
        return str == null || str.length() == 0;
    }

    public GetParam(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.key = str;
        this.secure = bool;
        this.volatile = bool2;
    }

    public /* synthetic */ GetParam(String str, Boolean bool, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? Boolean.FALSE : bool, (i10 & 4) != 0 ? Boolean.FALSE : bool2);
    }
}
