package com.visa.internal;

import android.content.Context;
import com.visa.R;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class mast2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f68040a;

    public mast2(Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.languages);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "context.resources.openRawResource(R.raw.languages)");
        Reader inputStreamReader = new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            HashMap mapA = a(text);
            this.f68040a = mapA;
            mapA.size();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public static HashMap a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "rawObject.keys()");
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(key);
            String name = jSONObject2.getString("name");
            String code = jSONObject2.getString("code");
            String fontFamily = jSONObject2.getString("fontFamily");
            String fontNames = jSONObject2.getString("fontNames");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
            String approve = jSONObject3.getString("approve");
            JSONObject jSONObject4 = jSONObject;
            String success = jSONObject3.getString("success");
            String complete = jSONObject3.getString("complete");
            HashMap map2 = map;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(code, "code");
            Intrinsics.checkNotNullExpressionValue(fontFamily, "fontFamily");
            Intrinsics.checkNotNullExpressionValue(fontNames, "fontNames");
            Intrinsics.checkNotNullExpressionValue(approve, "approve");
            Intrinsics.checkNotNullExpressionValue(success, "success");
            Intrinsics.checkNotNullExpressionValue(complete, "complete");
            ama3 ama3Var = new ama3(name, code, fontFamily, fontNames, new str1(approve, success, complete));
            Intrinsics.checkNotNullExpressionValue(key, "key");
            map2.put(key, ama3Var);
            itKeys = itKeys;
            map = map2;
            jSONObject = jSONObject4;
        }
        return map;
    }
}
