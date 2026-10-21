package com.bbva.ethermobilesdk.plugin.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Base64ToHexParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\nH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/Base64ToHexParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "data", "", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Base64ToHexParam implements MalformedParams {

    @Nullable
    private final String data;

    /* JADX WARN: Multi-variable type inference failed */
    public Base64ToHexParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Base64ToHexParam copy$default(Base64ToHexParam base64ToHexParam, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = base64ToHexParam.data;
        }
        return base64ToHexParam.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final Base64ToHexParam copy(@Nullable String data) {
        return new Base64ToHexParam(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Base64ToHexParam) && Intrinsics.areEqual(this.data, ((Base64ToHexParam) other).data);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        String str = this.data;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str = this.data;
        return str == null || str.length() == 0;
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("Base64ToHexParam(data="), this.data, RootService.CLOSE_BRACKET);
    }

    public Base64ToHexParam(@Nullable String str) {
        this.data = str;
    }

    public /* synthetic */ Base64ToHexParam(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
