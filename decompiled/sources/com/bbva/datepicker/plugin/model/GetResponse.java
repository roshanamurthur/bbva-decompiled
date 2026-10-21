package com.bbva.datepicker.plugin.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: GetResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, d2 = {"Lcom/bbva/datepicker/plugin/model/GetResponse;", "", "Lorg/json/JSONObject;", "toJson", "", "selectedDate", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "<init>", "(Ljava/lang/String;)V", "datepicker-plugin_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class GetResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29010a;

    public GetResponse(@NotNull String selectedDate) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        this.f29010a = selectedDate;
    }

    public static /* synthetic */ GetResponse copy$default(GetResponse getResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getResponse.f29010a;
        }
        return getResponse.copy(str);
    }

    @NotNull
    public final GetResponse copy(@NotNull String selectedDate) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        return new GetResponse(selectedDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof GetResponse) && Intrinsics.areEqual(this.f29010a, ((GetResponse) other).f29010a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f29010a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("selectedDate", this.f29010a);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("GetResponse(selectedDate="), this.f29010a, ")");
    }
}
