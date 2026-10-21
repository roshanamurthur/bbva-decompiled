package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.ScaleXY;
import java.io.IOException;
import z3.t;

/* JADX INFO: loaded from: classes2.dex */
public class ScaleXYParser implements t<ScaleXY> {
    public static final ScaleXYParser INSTANCE = new ScaleXYParser();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // z3.t
    public ScaleXY parse(JsonReader jsonReader, float f6) throws IOException {
        boolean z10 = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z10) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z10) {
            jsonReader.endArray();
        }
        return new ScaleXY((fNextDouble / 100.0f) * f6, (fNextDouble2 / 100.0f) * f6);
    }
}
