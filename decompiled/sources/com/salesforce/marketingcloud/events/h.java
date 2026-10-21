package com.salesforce.marketingcloud.events;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import com.salesforce.marketingcloud.extensions.PushExtensionsKt;
import com.salesforce.marketingcloud.internal.m;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.k;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b(\u0010)B\u0011\b\u0010\u0012\u0006\u0010*\u001a\u00020\u0002¢\u0006\u0004\b(\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003JW\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b%\u0010$R$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b\u0005\u0010'¨\u0006,"}, d2 = {"Lcom/salesforce/marketingcloud/events/h;", "", "Lorg/json/JSONObject;", "m", "", "a", "b", "Ljava/util/Date;", "c", "", "Lcom/salesforce/marketingcloud/events/g;", "d", "Lcom/salesforce/marketingcloud/events/e;", "e", "f", "id", "key", "startDateUtc", "rules", "outcomes", "evalLogic", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "i", "Ljava/util/Date;", "l", "()Ljava/util/Date;", "Ljava/util/List;", "k", "()Ljava/util/List;", "j", "g", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "json", "(Lorg/json/JSONObject;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTrigger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Trigger.kt\ncom/salesforce/marketingcloud/events/Trigger\n+ 2 -GeneralUtils.kt\ncom/salesforce/marketingcloud/internal/_GeneralUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n41#2:131\n42#2,8:135\n51#2:144\n41#2:158\n42#2,8:162\n51#2:171\n1549#3:132\n1620#3,2:133\n1622#3:143\n1603#3,9:145\n1855#3:154\n1856#3:156\n1612#3:157\n1549#3:159\n1620#3,2:160\n1622#3:170\n1603#3,9:172\n1855#3:181\n1856#3:183\n1612#3:184\n1855#3,2:185\n1855#3,2:187\n1855#3,2:189\n1#4:155\n1#4:182\n1#4:191\n*S KotlinDebug\n*F\n+ 1 Trigger.kt\ncom/salesforce/marketingcloud/events/Trigger\n*L\n22#1:131\n22#1:135,8\n22#1:144\n31#1:158\n31#1:162,8\n31#1:171\n22#1:132\n22#1:133,2\n22#1:143\n23#1:145,9\n23#1:154\n23#1:156\n23#1:157\n31#1:159\n31#1:160,2\n31#1:170\n32#1:172,9\n32#1:181\n32#1:183\n32#1:184\n50#1:185,2\n72#1:187,2\n76#1:189,2\n23#1:155\n32#1:182\n*E\n"})
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final Date startDateUtc;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private final List<g> rules;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final List<e> outcomes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private String evalLogic;

    public h(@NotNull String id, @NotNull String key, @Nullable Date date, @Nullable List<g> list, @NotNull List<e> outcomes, @Nullable String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(outcomes, "outcomes");
        this.id = id;
        this.key = key;
        this.startDateUtc = date;
        this.rules = list;
        this.outcomes = outcomes;
        this.evalLogic = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h a(h hVar, String str, String str2, Date date, List list, List list2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hVar.id;
        }
        if ((i10 & 2) != 0) {
            str2 = hVar.key;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            date = hVar.startDateUtc;
        }
        Date date2 = date;
        if ((i10 & 8) != 0) {
            list = hVar.rules;
        }
        List list3 = list;
        if ((i10 & 16) != 0) {
            list2 = hVar.outcomes;
        }
        List list4 = list2;
        if ((i10 & 32) != 0) {
            str3 = hVar.evalLogic;
        }
        return hVar.a(str, str4, date2, list3, list4, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Date getStartDateUtc() {
        return this.startDateUtc;
    }

    @Nullable
    public final List<g> d() {
        return this.rules;
    }

    @NotNull
    public final List<e> e() {
        return this.outcomes;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return Intrinsics.areEqual(this.id, hVar.id) && Intrinsics.areEqual(this.key, hVar.key) && Intrinsics.areEqual(this.startDateUtc, hVar.startDateUtc) && Intrinsics.areEqual(this.rules, hVar.rules) && Intrinsics.areEqual(this.outcomes, hVar.outcomes) && Intrinsics.areEqual(this.evalLogic, hVar.evalLogic);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEvalLogic() {
        return this.evalLogic;
    }

    @Nullable
    public final String g() {
        return this.evalLogic;
    }

    @NotNull
    public final String h() {
        return this.id;
    }

    public int hashCode() {
        int iC = n1.c(this.key, this.id.hashCode() * 31, 31);
        Date date = this.startDateUtc;
        int iHashCode = (iC + (date == null ? 0 : date.hashCode())) * 31;
        List<g> list = this.rules;
        int iA = com.google.android.gms.measurement.internal.a.a(this.outcomes, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str = this.evalLogic;
        return iA + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String i() {
        return this.key;
    }

    @NotNull
    public final List<e> j() {
        return this.outcomes;
    }

    @Nullable
    public final List<g> k() {
        return this.rules;
    }

    @Nullable
    public final Date l() {
        return this.startDateUtc;
    }

    @NotNull
    public final JSONObject m() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        jSONObject.put("key", this.key);
        Date date = this.startDateUtc;
        if (date != null) {
            jSONObject.put("startDateUtc", m.a(date));
        }
        List<g> list = this.rules;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((g) it.next()).k());
            }
            Unit unit = Unit.INSTANCE;
            jSONObject.put("rules", jSONArray);
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it2 = this.outcomes.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((e) it2.next()).g());
        }
        Unit unit2 = Unit.INSTANCE;
        jSONObject.put("outcomes", jSONArray2);
        String str = this.evalLogic;
        if (str != null) {
            jSONObject.put("evalLogic", str);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Trigger(id=");
        sb2.append(this.id);
        sb2.append(", key=");
        sb2.append(this.key);
        sb2.append(", startDateUtc=");
        sb2.append(this.startDateUtc);
        sb2.append(", rules=");
        sb2.append(this.rules);
        sb2.append(", outcomes=");
        sb2.append(this.outcomes);
        sb2.append(", evalLogic=");
        return y2.b(sb2, this.evalLogic, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ h(String str, String str2, Date date, List list, List list2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : date, (i10 & 8) != 0 ? null : list, list2, (i10 & 32) != 0 ? null : str3);
    }

    @NotNull
    public final h a(@NotNull String id, @NotNull String key, @Nullable Date startDateUtc, @Nullable List<g> rules, @NotNull List<e> outcomes, @Nullable String evalLogic) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(outcomes, "outcomes");
        return new h(id, key, startDateUtc, rules, outcomes, evalLogic);
    }

    public h(@NotNull JSONObject json) throws JSONException {
        ArrayList arrayList;
        String strReplace$default;
        e eVar;
        Object string;
        JSONObject jSONObject;
        g gVar;
        Object string2;
        JSONObject jSONObject2;
        Intrinsics.checkNotNullParameter(json, "json");
        String string3 = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string3, "json.getString(\"id\")");
        String string4 = json.getString("key");
        Intrinsics.checkNotNullExpressionValue(string4, "json.getString(\"key\")");
        String strOptString = json.optString("startDateUtc");
        Intrinsics.checkNotNullExpressionValue(strOptString, "json.optString(\"startDateUtc\")");
        String strB = m.b(strOptString);
        Date dateA = strB != null ? m.a(strB) : null;
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("rules");
        if (jSONArrayOptJSONArray != null) {
            IntRange intRangeUntil = kotlin.ranges.c.until(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    jSONObject2 = jSONArrayOptJSONArray.getJSONObject(iNextInt);
                    if (jSONObject2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        string2 = Integer.valueOf(jSONArrayOptJSONArray.getInt(iNextInt));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                        string2 = Double.valueOf(jSONArrayOptJSONArray.getDouble(iNextInt));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        string2 = Long.valueOf(jSONArrayOptJSONArray.getLong(iNextInt));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        string2 = Boolean.valueOf(jSONArrayOptJSONArray.getBoolean(iNextInt));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        string2 = jSONArrayOptJSONArray.getString(iNextInt);
                        if (string2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        string2 = jSONArrayOptJSONArray.get(iNextInt);
                        if (string2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    }
                    jSONObject2 = (JSONObject) string2;
                }
                arrayList2.add(jSONObject2);
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    gVar = new g((JSONObject) it2.next());
                } catch (Exception unused) {
                    gVar = null;
                }
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
        } else {
            arrayList = null;
        }
        JSONArray jSONArray = json.getJSONArray("outcomes");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "json.getJSONArray(\"outcomes\")");
        IntRange intRangeUntil2 = kotlin.ranges.c.until(0, jSONArray.length());
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil2, 10));
        Iterator<Integer> it3 = intRangeUntil2.iterator();
        while (it3.hasNext()) {
            int iNextInt2 = ((IntIterator) it3).nextInt();
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = jSONArray.getJSONObject(iNextInt2);
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    string = Integer.valueOf(jSONArray.getInt(iNextInt2));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    string = Double.valueOf(jSONArray.getDouble(iNextInt2));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    string = Long.valueOf(jSONArray.getLong(iNextInt2));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    string = Boolean.valueOf(jSONArray.getBoolean(iNextInt2));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                    string = jSONArray.getString(iNextInt2);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    string = jSONArray.get(iNextInt2);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
                jSONObject = (JSONObject) string;
            }
            arrayList3.add(jSONObject);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            try {
                eVar = new e((JSONObject) it4.next());
            } catch (Exception unused2) {
                eVar = null;
            }
            if (eVar != null) {
                arrayList4.add(eVar);
            }
        }
        String stringOrNull = PushExtensionsKt.getStringOrNull(json, "evalLogic");
        if (stringOrNull != null) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) stringOrNull, new String[]{"&&"}, false, 0, 6, (Object) null);
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) stringOrNull, new String[]{"||"}, false, 0, 6, (Object) null);
            if (!l.isBlank(stringOrNull)) {
                boolean z10 = true;
                if (listSplit$default.size() <= 1 || listSplit$default2.size() <= 1) {
                    ArrayList arrayList5 = new ArrayList();
                    if (listSplit$default.size() > 1) {
                        arrayList5.addAll(listSplit$default);
                    } else {
                        arrayList5.addAll(listSplit$default2);
                    }
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        String string5 = StringsKt__StringsKt.trim((CharSequence) it5.next()).toString();
                        if (l.isBlank(string5) || k.toLongOrNull(string5) == null || Long.parseLong(string5) < 0) {
                            z10 = false;
                        }
                    }
                    if (!z10) {
                        throw new IllegalArgumentException("evalLogic contained non-numeric indexes.");
                    }
                    strReplace$default = l.replace$default(stringOrNull, " ", "", false, 4, (Object) null);
                }
            }
            throw new IllegalArgumentException("evalLogic was blank or contained both && and || operators");
        }
        strReplace$default = null;
        this(string3, string4, dateA, arrayList, arrayList4, strReplace$default);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final void a(@Nullable String str) {
        this.evalLogic = str;
    }
}
