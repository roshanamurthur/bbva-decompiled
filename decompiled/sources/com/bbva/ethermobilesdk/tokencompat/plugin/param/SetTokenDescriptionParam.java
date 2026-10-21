package com.bbva.ethermobilesdk.tokencompat.plugin.param;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.extension.ExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SetTokenDescriptionParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\rH\u0016J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/plugin/param/SetTokenDescriptionParam;", "Lcom/bbva/ethermobilesdk/tokencompat/plugin/param/MalformedParams;", "refToken", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getRefToken", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "ethertoken-compat-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SetTokenDescriptionParam implements MalformedParams {

    @Nullable
    private final String name;

    @SerializedName("ref_token")
    @Nullable
    private final String refToken;

    /* JADX WARN: Multi-variable type inference failed */
    public SetTokenDescriptionParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SetTokenDescriptionParam copy$default(SetTokenDescriptionParam setTokenDescriptionParam, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = setTokenDescriptionParam.refToken;
        }
        if ((i10 & 2) != 0) {
            str2 = setTokenDescriptionParam.name;
        }
        return setTokenDescriptionParam.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRefToken() {
        return this.refToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final SetTokenDescriptionParam copy(@Nullable String refToken, @Nullable String name) {
        return new SetTokenDescriptionParam(refToken, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetTokenDescriptionParam)) {
            return false;
        }
        SetTokenDescriptionParam setTokenDescriptionParam = (SetTokenDescriptionParam) other;
        return Intrinsics.areEqual(this.refToken, setTokenDescriptionParam.refToken) && Intrinsics.areEqual(this.name, setTokenDescriptionParam.name);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRefToken() {
        return this.refToken;
    }

    public int hashCode() {
        String str = this.refToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.plugin.param.MalformedParams
    public boolean isMalformed() {
        return ExtensionKt.isMalformedParam(this.refToken) || ExtensionKt.isMalformedParam(this.name);
    }

    @NotNull
    public String toString() {
        return u.g("SetTokenDescriptionParam(refToken=", this.refToken, ", name=", this.name, ")");
    }

    public SetTokenDescriptionParam(@Nullable String str, @Nullable String str2) {
        this.refToken = str;
        this.name = str2;
    }

    public /* synthetic */ SetTokenDescriptionParam(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
