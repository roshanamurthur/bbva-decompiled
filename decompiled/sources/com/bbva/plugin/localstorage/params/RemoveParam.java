package com.bbva.plugin.localstorage.params;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RemoveParam.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/bbva/plugin/localstorage/params/RemoveParam;", "Lcom/bbva/plugin/localstorage/params/MalformedParams;", "key", "", "volatile", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getKey", "()Ljava/lang/String;", "getVolatile", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bbva/plugin/localstorage/params/RemoveParam;", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RemoveParam implements MalformedParams {

    @Nullable
    private final String key;

    @Nullable
    private final Boolean volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoveParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RemoveParam copy$default(RemoveParam removeParam, String str, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = removeParam.key;
        }
        if ((i10 & 2) != 0) {
            bool = removeParam.volatile;
        }
        return removeParam.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getVolatile() {
        return this.volatile;
    }

    @NotNull
    public final RemoveParam copy(@Nullable String key, @Nullable Boolean bool) {
        return new RemoveParam(key, bool);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveParam)) {
            return false;
        }
        RemoveParam removeParam = (RemoveParam) other;
        return Intrinsics.areEqual(this.key, removeParam.key) && Intrinsics.areEqual(this.volatile, removeParam.volatile);
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Boolean getVolatile() {
        return this.volatile;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.volatile;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.bbva.plugin.localstorage.params.MalformedParams
    public boolean isMalformed() {
        String str = this.key;
        return str == null || str.length() == 0;
    }

    @NotNull
    public String toString() {
        return "RemoveParam(key=" + this.key + ", volatile=" + this.volatile + ")";
    }

    public RemoveParam(@Nullable String str, @Nullable Boolean bool) {
        this.key = str;
        this.volatile = bool;
    }

    public /* synthetic */ RemoveParam(String str, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? Boolean.FALSE : bool);
    }
}
