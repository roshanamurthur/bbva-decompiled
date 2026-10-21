package com.salesforce.marketingcloud.messages.iam;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0001\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0001\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u0007H\u0001¨\u0006\n"}, d2 = {"Lorg/json/JSONObject;", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$CloseButton;", "a", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$TextField;", "c", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Media;", "b", "Lorg/json/JSONArray;", "", "Lcom/salesforce/marketingcloud/messages/iam/InAppMessage$Button;", "sdk_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInAppMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessage.kt\ncom/salesforce/marketingcloud/messages/iam/InAppMessageKt\n+ 2 -GeneralUtils.kt\ncom/salesforce/marketingcloud/internal/_GeneralUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,743:1\n73#2,2:744\n73#2,2:746\n73#2,2:748\n73#2,2:750\n73#2,2:752\n73#2,2:754\n41#2:756\n42#2,8:760\n51#2:769\n73#2,2:780\n73#2,2:782\n73#2,2:784\n73#2,2:786\n1549#3:757\n1620#3,2:758\n1622#3:768\n1603#3,9:770\n1855#3:779\n1856#3:789\n1612#3:790\n1#4:788\n*S KotlinDebug\n*F\n+ 1 InAppMessage.kt\ncom/salesforce/marketingcloud/messages/iam/InAppMessageKt\n*L\n695#1:744,2\n703#1:746,2\n705#1:748,2\n713#1:750,2\n715#1:752,2\n717#1:754,2\n723#1:756\n723#1:760,8\n723#1:769\n730#1:780,2\n733#1:782,2\n736#1:784,2\n737#1:786,2\n723#1:757\n723#1:758,2\n723#1:768\n724#1:770,9\n724#1:779\n724#1:789\n724#1:790\n724#1:788\n*E\n"})
public final class h {
    @NotNull
    public static final InAppMessage.CloseButton a(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        InAppMessage.Alignment alignmentValueOf = InAppMessage.Alignment.end;
        String strG = androidx.databinding.f.g(jSONObject, "alignment", "optString(name)");
        if (strG != null) {
            alignmentValueOf = InAppMessage.Alignment.valueOf(strG);
        }
        return new InAppMessage.CloseButton(alignmentValueOf);
    }

    @VisibleForTesting
    @NotNull
    public static final InAppMessage.Media b(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string = jSONObject.getString("url");
        Intrinsics.checkNotNullExpressionValue(string, "getString(\"url\")");
        InAppMessage.Media.ImageSize imageSizeValueOf = InAppMessage.Media.ImageSize.e2e;
        String strG = androidx.databinding.f.g(jSONObject, "size", "optString(name)");
        if (strG != null) {
            imageSizeValueOf = InAppMessage.Media.ImageSize.valueOf(strG);
        }
        InAppMessage.Media.ImageSize imageSize = imageSizeValueOf;
        String strG2 = androidx.databinding.f.g(jSONObject, "altText", "optString(\"altText\")");
        InAppMessage.Size size = InAppMessage.Size.s;
        String strG3 = androidx.databinding.f.g(jSONObject, "borderWidth", "optString(name)");
        InAppMessage.Size sizeValueOf = strG3 != null ? InAppMessage.Size.valueOf(strG3) : size;
        String strG4 = androidx.databinding.f.g(jSONObject, "borderColor", "optString(\"borderColor\")");
        String strG5 = androidx.databinding.f.g(jSONObject, "cornerRadius", "optString(name)");
        return new InAppMessage.Media(string, imageSize, strG2, sizeValueOf, strG4, strG5 != null ? InAppMessage.Size.valueOf(strG5) : size);
    }

    @VisibleForTesting
    @NotNull
    public static final InAppMessage.TextField c(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string = jSONObject.getString("text");
        Intrinsics.checkNotNullExpressionValue(string, "getString(\"text\")");
        InAppMessage.Size sizeValueOf = InAppMessage.Size.s;
        String strG = androidx.databinding.f.g(jSONObject, "fontSize", "optString(name)");
        if (strG != null) {
            sizeValueOf = InAppMessage.Size.valueOf(strG);
        }
        String strG2 = androidx.databinding.f.g(jSONObject, "fontColor", "optString(\"fontColor\")");
        InAppMessage.Alignment alignmentValueOf = InAppMessage.Alignment.center;
        String strG3 = androidx.databinding.f.g(jSONObject, "alignment", "optString(name)");
        if (strG3 != null) {
            alignmentValueOf = InAppMessage.Alignment.valueOf(strG3);
        }
        return new InAppMessage.TextField(string, sizeValueOf, strG2, alignmentValueOf);
    }

    @VisibleForTesting
    @NotNull
    public static final List<InAppMessage.Button> a(@NotNull JSONArray jSONArray) throws JSONException {
        InAppMessage.Button button;
        Object string;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        IntRange intRangeUntil = kotlin.ranges.c.until(0, jSONArray.length());
        ArrayList<JSONObject> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = jSONArray.getJSONObject(iNextInt);
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    string = Integer.valueOf(jSONArray.getInt(iNextInt));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    string = Double.valueOf(jSONArray.getDouble(iNextInt));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    string = Long.valueOf(jSONArray.getLong(iNextInt));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    string = Boolean.valueOf(jSONArray.getBoolean(iNextInt));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    string = jSONArray.getString(iNextInt);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    string = jSONArray.get(iNextInt);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
                jSONObject = (JSONObject) string;
            }
            arrayList.add(jSONObject);
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject2 : arrayList) {
            try {
                String string2 = jSONObject2.getString("id");
                Intrinsics.checkNotNullExpressionValue(string2, "btnJson.getString(\"id\")");
                int iOptInt = jSONObject2.optInt(FirebaseAnalytics.Param.INDEX, 0);
                String string3 = jSONObject2.getString("text");
                Intrinsics.checkNotNullExpressionValue(string3, "btnJson.getString(\"text\")");
                InAppMessage.Button.ActionType actionTypeValueOf = InAppMessage.Button.ActionType.close;
                String strOptString = jSONObject2.optString("actionType");
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(name)");
                String strB = com.salesforce.marketingcloud.internal.m.b(strOptString);
                if (strB != null) {
                    actionTypeValueOf = InAppMessage.Button.ActionType.valueOf(strB);
                }
                String strOptString2 = jSONObject2.optString("actionAndroid");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "btnJson.optString(\"actionAndroid\")");
                String strB2 = com.salesforce.marketingcloud.internal.m.b(strOptString2);
                String strOptString3 = jSONObject2.optString("fontColor");
                Intrinsics.checkNotNullExpressionValue(strOptString3, "btnJson.optString(\"fontColor\")");
                String strB3 = com.salesforce.marketingcloud.internal.m.b(strOptString3);
                InAppMessage.Size size = InAppMessage.Size.s;
                String strOptString4 = jSONObject2.optString("fontSize");
                Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(name)");
                String strB4 = com.salesforce.marketingcloud.internal.m.b(strOptString4);
                InAppMessage.Size sizeValueOf = strB4 != null ? InAppMessage.Size.valueOf(strB4) : size;
                String strOptString5 = jSONObject2.optString("backgroundColor");
                Intrinsics.checkNotNullExpressionValue(strOptString5, "btnJson.optString(\"backgroundColor\")");
                String strB5 = com.salesforce.marketingcloud.internal.m.b(strOptString5);
                String strOptString6 = jSONObject2.optString("borderColor");
                Intrinsics.checkNotNullExpressionValue(strOptString6, "btnJson.optString(\"borderColor\")");
                String strB6 = com.salesforce.marketingcloud.internal.m.b(strOptString6);
                String strOptString7 = jSONObject2.optString("borderWidth");
                Intrinsics.checkNotNullExpressionValue(strOptString7, "optString(name)");
                String strB7 = com.salesforce.marketingcloud.internal.m.b(strOptString7);
                InAppMessage.Size sizeValueOf2 = strB7 != null ? InAppMessage.Size.valueOf(strB7) : size;
                String strOptString8 = jSONObject2.optString("cornerRadius");
                Intrinsics.checkNotNullExpressionValue(strOptString8, "optString(name)");
                String strB8 = com.salesforce.marketingcloud.internal.m.b(strOptString8);
                button = new InAppMessage.Button(string2, iOptInt, string3, actionTypeValueOf, strB2, strB3, sizeValueOf, strB5, strB6, sizeValueOf2, strB8 != null ? InAppMessage.Size.valueOf(strB8) : size);
            } catch (Exception unused) {
                button = null;
            }
            InAppMessage.Button button2 = button;
            if (button2 != null) {
                arrayList2.add(button2);
            }
        }
        return arrayList2;
    }
}
