package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import z3.h;
import z3.t;

/* JADX INFO: loaded from: classes2.dex */
public class IntegerParser implements t<Integer> {
    public static final IntegerParser INSTANCE = new IntegerParser();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // z3.t
    public Integer parse(JsonReader jsonReader, float f6) throws IOException {
        return Integer.valueOf(Math.round(h.d(jsonReader) * f6));
    }
}
