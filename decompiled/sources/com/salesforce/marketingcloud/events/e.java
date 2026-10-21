package com.salesforce.marketingcloud.events;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J)\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/salesforce/marketingcloud/events/e;", "", "Lorg/json/JSONObject;", "g", "()Lorg/json/JSONObject;", "", "a", "b", "c", "id", "activityInstanceId", "type", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "json", "(Lorg/json/JSONObject;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final String activityInstanceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String type;

    public e(@NotNull String id, @Nullable String str, @NotNull String type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.activityInstanceId = str;
        this.type = type;
    }

    public static /* synthetic */ e a(e eVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eVar.id;
        }
        if ((i10 & 2) != 0) {
            str2 = eVar.activityInstanceId;
        }
        if ((i10 & 4) != 0) {
            str3 = eVar.type;
        }
        return eVar.a(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActivityInstanceId() {
        return this.activityInstanceId;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String d() {
        return this.activityInstanceId;
    }

    @NotNull
    public final String e() {
        return this.id;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return Intrinsics.areEqual(this.id, eVar.id) && Intrinsics.areEqual(this.activityInstanceId, eVar.activityInstanceId) && Intrinsics.areEqual(this.type, eVar.type);
    }

    @NotNull
    public final String f() {
        return this.type;
    }

    @NotNull
    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        String str = this.activityInstanceId;
        if (str != null) {
            jSONObject.put("activityInstanceId", str);
        }
        jSONObject.put("type", this.type);
        return jSONObject;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.activityInstanceId;
        return this.type.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Outcome(id=");
        sb2.append(this.id);
        sb2.append(", activityInstanceId=");
        sb2.append(this.activityInstanceId);
        sb2.append(", type=");
        return y2.b(sb2, this.type, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ e(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, str3);
    }

    @NotNull
    public final e a(@NotNull String id, @Nullable String activityInstanceId, @NotNull String type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new e(id, activityInstanceId, type);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(@NotNull JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "json.getString(\"id\")");
        String strG = androidx.databinding.f.g(json, "activityInstanceId", "json.optString(\"activityInstanceId\")");
        String string2 = json.getString("type");
        Intrinsics.checkNotNullExpressionValue(string2, "json.getString(\"type\")");
        this(string, strG, string2);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }
}
