package z3;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: JsonUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f94959a = JsonReader.Options.of("x", "y");

    /* JADX INFO: compiled from: JsonUtils.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94960a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f94960a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94960a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94960a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @ColorInt
    public static int a(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static PointF b(JsonReader jsonReader, float f6) throws IOException {
        int i10 = a.f94960a[jsonReader.peek().ordinal()];
        if (i10 == 1) {
            float fNextDouble = (float) jsonReader.nextDouble();
            float fNextDouble2 = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return new PointF(fNextDouble * f6, fNextDouble2 * f6);
        }
        if (i10 == 2) {
            jsonReader.beginArray();
            float fNextDouble3 = (float) jsonReader.nextDouble();
            float fNextDouble4 = (float) jsonReader.nextDouble();
            while (jsonReader.peek() != JsonReader.Token.END_ARRAY) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return new PointF(fNextDouble3 * f6, fNextDouble4 * f6);
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
        }
        jsonReader.beginObject();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f94959a);
            if (iSelectName == 0) {
                fD = d(jsonReader);
            } else if (iSelectName != 1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                fD2 = d(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(fD * f6, fD2 * f6);
    }

    public static ArrayList c(JsonReader jsonReader, float f6) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(b(jsonReader, f6));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static float d(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenPeek = jsonReader.peek();
        int i10 = a.f94960a[tokenPeek.ordinal()];
        if (i10 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + tokenPeek);
        }
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return fNextDouble;
    }
}
