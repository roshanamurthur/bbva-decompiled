package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import z3.h;
import z3.t;

/* JADX INFO: loaded from: classes2.dex */
public class PathParser implements t<PointF> {
    public static final PathParser INSTANCE = new PathParser();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // z3.t
    public PointF parse(JsonReader jsonReader, float f6) throws IOException {
        return h.b(jsonReader, f6);
    }
}
