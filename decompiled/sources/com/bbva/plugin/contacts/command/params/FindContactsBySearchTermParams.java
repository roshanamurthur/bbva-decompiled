package com.bbva.plugin.contacts.command.params;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FindContactsBySearchTermParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ*\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/bbva/plugin/contacts/command/params/FindContactsBySearchTermParams;", "", "filter", "", "fields", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "getFields", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getFilter", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/bbva/plugin/contacts/command/params/FindContactsBySearchTermParams;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "contacts-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FindContactsBySearchTermParams {

    @SerializedName("fields")
    @NotNull
    private final String[] fields;

    @SerializedName("filter")
    @Nullable
    private final String filter;

    public FindContactsBySearchTermParams(@Nullable String str, @NotNull String[] fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.filter = str;
        this.fields = fields;
    }

    public static /* synthetic */ FindContactsBySearchTermParams copy$default(FindContactsBySearchTermParams findContactsBySearchTermParams, String str, String[] strArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = findContactsBySearchTermParams.filter;
        }
        if ((i10 & 2) != 0) {
            strArr = findContactsBySearchTermParams.fields;
        }
        return findContactsBySearchTermParams.copy(str, strArr);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFilter() {
        return this.filter;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String[] getFields() {
        return this.fields;
    }

    @NotNull
    public final FindContactsBySearchTermParams copy(@Nullable String filter, @NotNull String[] fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new FindContactsBySearchTermParams(filter, fields);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(FindContactsBySearchTermParams.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.bbva.plugin.contacts.command.params.FindContactsBySearchTermParams");
        FindContactsBySearchTermParams findContactsBySearchTermParams = (FindContactsBySearchTermParams) other;
        return Intrinsics.areEqual(this.filter, findContactsBySearchTermParams.filter) && Arrays.equals(this.fields, findContactsBySearchTermParams.fields);
    }

    @NotNull
    public final String[] getFields() {
        return this.fields;
    }

    @Nullable
    public final String getFilter() {
        return this.filter;
    }

    public int hashCode() {
        String str = this.filter;
        return ((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.fields);
    }

    @NotNull
    public String toString() {
        return u.g("FindContactsBySearchTermParams(filter=", this.filter, ", fields=", Arrays.toString(this.fields), ")");
    }

    public /* synthetic */ FindContactsBySearchTermParams(String str, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, strArr);
    }
}
