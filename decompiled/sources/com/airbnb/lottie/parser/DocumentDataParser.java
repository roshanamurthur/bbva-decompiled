package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import java.io.IOException;
import z3.h;
import z3.t;

/* JADX INFO: loaded from: classes2.dex */
public class DocumentDataParser implements t<DocumentData> {
    public static final DocumentDataParser INSTANCE = new DocumentDataParser();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f26148a = JsonReader.Options.of("t", "f", "s", "j", "tr", "lh", "ls", "fc", SqlContracts.TokenEntry.SC, "sw", "of", "ps", "sz");

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // z3.t
    public DocumentData parse(JsonReader jsonReader, float f6) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.beginObject();
        DocumentData.Justification justification2 = justification;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f26148a)) {
                case 0:
                    strNextString = jsonReader.nextString();
                    break;
                case 1:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 2:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = jsonReader.nextInt();
                    justification2 = DocumentData.Justification.CENTER;
                    if (iNextInt2 <= justification2.ordinal() && iNextInt2 >= 0) {
                        justification2 = DocumentData.Justification.values()[iNextInt2];
                    }
                    break;
                case 4:
                    iNextInt = jsonReader.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    iA = h.a(jsonReader);
                    break;
                case 8:
                    iA2 = h.a(jsonReader);
                    break;
                case 9:
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 11:
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f6, ((float) jsonReader.nextDouble()) * f6);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case 12:
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f6, ((float) jsonReader.nextDouble()) * f6);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new DocumentData(strNextString, strNextString2, fNextDouble, justification2, iNextInt, fNextDouble2, fNextDouble3, iA, iA2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
