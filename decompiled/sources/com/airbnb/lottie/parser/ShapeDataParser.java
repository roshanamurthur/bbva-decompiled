package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import z3.h;
import z3.t;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeDataParser implements t<ShapeData> {
    public static final ShapeDataParser INSTANCE = new ShapeDataParser();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f26171a = JsonReader.Options.of("c", SharedPrefsStorage.VERSION_KEY, "i", "o");

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // z3.t
    public ShapeData parse(JsonReader jsonReader, float f6) throws IOException {
        if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f26171a);
            if (iSelectName == 0) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (iSelectName == 1) {
                arrayListC = h.c(jsonReader, f6);
            } else if (iSelectName == 2) {
                arrayListC2 = h.c(jsonReader, f6);
            } else if (iSelectName != 3) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                arrayListC3 = h.c(jsonReader, f6);
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonReader.Token.END_ARRAY) {
            jsonReader.endArray();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new ShapeData(new PointF(), false, Collections.emptyList());
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = (PointF) arrayListC.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new CubicCurveData(MiscUtils.addPoints((PointF) arrayListC.get(i11), (PointF) arrayListC3.get(i11)), MiscUtils.addPoints(pointF2, (PointF) arrayListC2.get(i10)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i12 = size - 1;
            arrayList.add(new CubicCurveData(MiscUtils.addPoints((PointF) arrayListC.get(i12), (PointF) arrayListC3.get(i12)), MiscUtils.addPoints(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new ShapeData(pointF, zNextBoolean, arrayList);
    }
}
