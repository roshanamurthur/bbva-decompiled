package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import z3.h;
import z3.t;

/* JADX INFO: loaded from: classes2.dex */
public class PointFParser implements t<PointF> {
    public static final PointFParser INSTANCE = new PointFParser();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // z3.t
    public PointF parse(JsonReader jsonReader, float f6) throws IOException {
        JsonReader.Token tokenPeek = jsonReader.peek();
        if (tokenPeek == JsonReader.Token.BEGIN_ARRAY) {
            return h.b(jsonReader, f6);
        }
        if (tokenPeek == JsonReader.Token.BEGIN_OBJECT) {
            return h.b(jsonReader, f6);
        }
        if (tokenPeek != JsonReader.Token.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenPeek);
        }
        PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f6, ((float) jsonReader.nextDouble()) * f6);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return pointF;
    }
}
