package com.salesforce.marketingcloud.events;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0006\bB/\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&B\u0011\b\u0010\u0012\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b%\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J;\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b$\u0010\u001d¨\u0006)"}, d2 = {"Lcom/salesforce/marketingcloud/events/g;", "", "Lorg/json/JSONObject;", "k", "()Lorg/json/JSONObject;", "", "a", "", "b", "Lcom/salesforce/marketingcloud/events/g$a;", "c", "Lcom/salesforce/marketingcloud/events/g$b;", "d", "e", FirebaseAnalytics.Param.INDEX, "key", "operator", "valueType", "value", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "f", "()I", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/salesforce/marketingcloud/events/g$a;", "h", "()Lcom/salesforce/marketingcloud/events/g$a;", "Lcom/salesforce/marketingcloud/events/g$b;", "j", "()Lcom/salesforce/marketingcloud/events/g$b;", "i", "<init>", "(ILjava/lang/String;Lcom/salesforce/marketingcloud/events/g$a;Lcom/salesforce/marketingcloud/events/g$b;Ljava/lang/String;)V", "json", "(Lorg/json/JSONObject;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTrigger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Trigger.kt\ncom/salesforce/marketingcloud/events/Rule\n+ 2 -GeneralUtils.kt\ncom/salesforce/marketingcloud/internal/_GeneralUtilsKt\n*L\n1#1,130:1\n69#2:131\n69#2:132\n*S KotlinDebug\n*F\n+ 1 Trigger.kt\ncom/salesforce/marketingcloud/events/Rule\n*L\n110#1:131\n111#1:132\n*E\n"})
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final a operator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final b valueType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String value;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/salesforce/marketingcloud/events/g$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public enum a {
        EQ,
        NEQ,
        LT,
        GT,
        LTEQ,
        GTEQ,
        REGEX
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/salesforce/marketingcloud/events/g$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public enum b {
        INT,
        DOUBLE,
        BOOL,
        STRING
    }

    public g(int i10, @NotNull String key, @NotNull a operator, @NotNull b valueType, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.index = i10;
        this.key = key;
        this.operator = operator;
        this.valueType = valueType;
        this.value = value;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getOperator() {
        return this.operator;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getValueType() {
        return this.valueType;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return this.index == gVar.index && Intrinsics.areEqual(this.key, gVar.key) && this.operator == gVar.operator && this.valueType == gVar.valueType && Intrinsics.areEqual(this.value, gVar.value);
    }

    public final int f() {
        return this.index;
    }

    @NotNull
    public final String g() {
        return this.key;
    }

    @NotNull
    public final a h() {
        return this.operator;
    }

    public int hashCode() {
        return this.value.hashCode() + ((this.valueType.hashCode() + ((this.operator.hashCode() + n1.c(this.key, this.index * 31, 31)) * 31)) * 31);
    }

    @NotNull
    public final String i() {
        return this.value;
    }

    @NotNull
    public final b j() {
        return this.valueType;
    }

    @NotNull
    public final JSONObject k() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.Param.INDEX, this.index);
        jSONObject.put("key", this.key);
        jSONObject.put("operator", this.operator.name());
        jSONObject.put("valueType", this.valueType.name());
        jSONObject.put("value", this.value);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Rule(index=");
        sb2.append(this.index);
        sb2.append(", key=");
        sb2.append(this.key);
        sb2.append(", operator=");
        sb2.append(this.operator);
        sb2.append(", valueType=");
        sb2.append(this.valueType);
        sb2.append(", value=");
        return y2.b(sb2, this.value, RootService.CLOSE_BRACKET);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(@NotNull JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        int iOptInt = json.optInt(FirebaseAnalytics.Param.INDEX, 0);
        String string = json.getString("key");
        Intrinsics.checkNotNullExpressionValue(string, "json.getString(\"key\")");
        String string2 = json.getString("operator");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(name)");
        a aVarValueOf = a.valueOf(string2);
        String string3 = json.getString("valueType");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(name)");
        b bVarValueOf = b.valueOf(string3);
        String string4 = json.getString("value");
        Intrinsics.checkNotNullExpressionValue(string4, "json.getString(\"value\")");
        this(iOptInt, string, aVarValueOf, bVarValueOf, string4);
    }

    @NotNull
    public final g a(int index, @NotNull String key, @NotNull a operator, @NotNull b valueType, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Intrinsics.checkNotNullParameter(value, "value");
        return new g(index, key, operator, valueType, value);
    }

    public static /* synthetic */ g a(g gVar, int i10, String str, a aVar, b bVar, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = gVar.index;
        }
        if ((i11 & 2) != 0) {
            str = gVar.key;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            aVar = gVar.operator;
        }
        a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            bVar = gVar.valueType;
        }
        b bVar2 = bVar;
        if ((i11 & 16) != 0) {
            str2 = gVar.value;
        }
        return gVar.a(i10, str3, aVar2, bVar2, str2);
    }
}
