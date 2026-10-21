package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import z3.h;
import z3.t;

/* JADX INFO: loaded from: classes2.dex */
public class FloatParser implements t<Float> {
    public static final FloatParser INSTANCE = new FloatParser();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // z3.t
    public Float parse(JsonReader jsonReader, float f6) throws IOException {
        return Float.valueOf(h.d(jsonReader) * f6);
    }
}
