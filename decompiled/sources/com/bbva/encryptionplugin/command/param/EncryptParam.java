package com.bbva.encryptionplugin.command.param;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EncryptParam.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/bbva/encryptionplugin/command/param/EncryptParam;", "", "", "component1", "component2", "value", "keyTag", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "b", "getKeyTag", "setKeyTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "encryption_plugin_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class EncryptParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    @NotNull
    private String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("key_tag")
    @Nullable
    private String keyTag;

    public EncryptParam(@NotNull String str, @Nullable String str2) {
        this.value = str;
        this.keyTag = str2;
    }

    public static /* synthetic */ EncryptParam copy$default(EncryptParam encryptParam, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = encryptParam.value;
        }
        if ((i10 & 2) != 0) {
            str2 = encryptParam.keyTag;
        }
        return encryptParam.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeyTag() {
        return this.keyTag;
    }

    @NotNull
    public final EncryptParam copy(@NotNull String value, @Nullable String keyTag) {
        return new EncryptParam(value, keyTag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptParam)) {
            return false;
        }
        EncryptParam encryptParam = (EncryptParam) other;
        return Intrinsics.areEqual(this.value, encryptParam.value) && Intrinsics.areEqual(this.keyTag, encryptParam.keyTag);
    }

    @Nullable
    public final String getKeyTag() {
        return this.keyTag;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.keyTag;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setKeyTag(@Nullable String str) {
        this.keyTag = str;
    }

    public final void setValue(@NotNull String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EncryptParam(value=");
        sb2.append(this.value);
        sb2.append(", keyTag=");
        return d.f(sb2, this.keyTag, ")");
    }

    public /* synthetic */ EncryptParam(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
