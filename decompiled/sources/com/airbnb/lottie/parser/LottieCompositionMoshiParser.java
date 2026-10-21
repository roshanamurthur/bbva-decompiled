package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import z3.c;
import z3.d;
import z3.e;

/* JADX INFO: loaded from: classes2.dex */
public class LottieCompositionMoshiParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f26166a = JsonReader.Options.of("w", "h", "ip", "op", "fr", SharedPrefsStorage.VERSION_KEY, "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.Options f26167b = JsonReader.Options.of("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.Options f26168c = JsonReader.Options.of(NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final JsonReader.Options f26169d = JsonReader.Options.of("cm", "tm", "dr");

    public static LottieComposition parse(JsonReader jsonReader) throws IOException {
        float f6;
        float f10;
        SparseArrayCompat<FontCharacter> sparseArrayCompat;
        ArrayList arrayList;
        int i10;
        float fDpScale = Utils.dpScale();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<FontCharacter> sparseArrayCompat2 = new SparseArrayCompat<>();
        LottieComposition lottieComposition = new LottieComposition();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f26166a)) {
                case 0:
                    iNextInt = jsonReader.nextInt();
                    break;
                case 1:
                    iNextInt2 = jsonReader.nextInt();
                    arrayList3 = arrayList3;
                    break;
                case 2:
                    fNextDouble = (float) jsonReader.nextDouble();
                    arrayList3 = arrayList3;
                    break;
                case 3:
                    fNextDouble2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    arrayList3 = arrayList3;
                    break;
                case 4:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    arrayList3 = arrayList3;
                    break;
                case 5:
                    f6 = fNextDouble2;
                    f10 = fNextDouble3;
                    sparseArrayCompat = sparseArrayCompat2;
                    arrayList = arrayList3;
                    i10 = iNextInt;
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!Utils.isAtLeastVersion(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        lottieComposition.addWarning("Lottie only supports bodymovin >= 4.4.0");
                    }
                    iNextInt = i10;
                    arrayList3 = arrayList;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fNextDouble3 = f10;
                    fNextDouble2 = f6;
                    break;
                case 6:
                    f6 = fNextDouble2;
                    f10 = fNextDouble3;
                    sparseArrayCompat = sparseArrayCompat2;
                    arrayList = arrayList3;
                    i10 = iNextInt;
                    jsonReader.beginArray();
                    int i11 = 0;
                    while (jsonReader.hasNext()) {
                        Layer layer = LayerParser.parse(jsonReader, lottieComposition);
                        if (layer.getLayerType() == Layer.LayerType.IMAGE) {
                            i11++;
                        }
                        arrayList2.add(layer);
                        longSparseArray.put(layer.getId(), layer);
                        if (i11 > 4) {
                            Logger.warning("You have " + i11 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    jsonReader.endArray();
                    iNextInt = i10;
                    arrayList3 = arrayList;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fNextDouble3 = f10;
                    fNextDouble2 = f6;
                    break;
                case 7:
                    f6 = fNextDouble2;
                    f10 = fNextDouble3;
                    sparseArrayCompat = sparseArrayCompat2;
                    arrayList = arrayList3;
                    i10 = iNextInt;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ArrayList arrayList4 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray();
                        jsonReader.beginObject();
                        String strNextString = null;
                        String strNextString2 = null;
                        String strNextString3 = null;
                        int iNextInt3 = 0;
                        int iNextInt4 = 0;
                        while (jsonReader.hasNext()) {
                            int iSelectName = jsonReader.selectName(f26167b);
                            if (iSelectName == 0) {
                                strNextString = jsonReader.nextString();
                            } else if (iSelectName == 1) {
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    Layer layer2 = LayerParser.parse(jsonReader, lottieComposition);
                                    longSparseArray2.put(layer2.getId(), layer2);
                                    arrayList4.add(layer2);
                                }
                                jsonReader.endArray();
                            } else if (iSelectName == 2) {
                                iNextInt3 = jsonReader.nextInt();
                            } else if (iSelectName == 3) {
                                iNextInt4 = jsonReader.nextInt();
                            } else if (iSelectName == 4) {
                                strNextString2 = jsonReader.nextString();
                            } else if (iSelectName != 5) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else {
                                strNextString3 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        if (strNextString2 != null) {
                            LottieImageAsset lottieImageAsset = new LottieImageAsset(iNextInt3, iNextInt4, strNextString, strNextString2, strNextString3);
                            map2.put(lottieImageAsset.getId(), lottieImageAsset);
                        } else {
                            map.put(strNextString, arrayList4);
                        }
                    }
                    jsonReader.endArray();
                    iNextInt = i10;
                    arrayList3 = arrayList;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fNextDouble3 = f10;
                    fNextDouble2 = f6;
                    break;
                case 8:
                    f6 = fNextDouble2;
                    f10 = fNextDouble3;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.selectName(f26168c) != 0) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                JsonReader.Options options = e.f94953a;
                                jsonReader.beginObject();
                                String strNextString4 = null;
                                String strNextString5 = null;
                                String strNextString6 = null;
                                float fNextDouble4 = 0.0f;
                                while (jsonReader.hasNext()) {
                                    arrayList3 = arrayList3;
                                    int iSelectName2 = jsonReader.selectName(e.f94953a);
                                    if (iSelectName2 != 0) {
                                        SparseArrayCompat<FontCharacter> sparseArrayCompat3 = sparseArrayCompat2;
                                        if (iSelectName2 == 1) {
                                            strNextString5 = jsonReader.nextString();
                                        } else if (iSelectName2 == 2) {
                                            strNextString6 = jsonReader.nextString();
                                        } else if (iSelectName2 != 3) {
                                            jsonReader.skipName();
                                            jsonReader.skipValue();
                                        } else {
                                            fNextDouble4 = (float) jsonReader.nextDouble();
                                            iNextInt = iNextInt;
                                        }
                                        sparseArrayCompat2 = sparseArrayCompat3;
                                    } else {
                                        strNextString4 = jsonReader.nextString();
                                    }
                                }
                                ArrayList arrayList5 = arrayList3;
                                int i12 = iNextInt;
                                jsonReader.endObject();
                                Font font = new Font(strNextString4, strNextString5, strNextString6, fNextDouble4);
                                map3.put(font.getName(), font);
                                iNextInt = i12;
                                arrayList3 = arrayList5;
                                sparseArrayCompat2 = sparseArrayCompat2;
                            }
                            jsonReader.endArray();
                            arrayList3 = arrayList3;
                        }
                    }
                    sparseArrayCompat = sparseArrayCompat2;
                    arrayList = arrayList3;
                    i10 = iNextInt;
                    jsonReader.endObject();
                    iNextInt = i10;
                    arrayList3 = arrayList;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fNextDouble3 = f10;
                    fNextDouble2 = f6;
                    break;
                case 9:
                    f6 = fNextDouble2;
                    f10 = fNextDouble3;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        JsonReader.Options options2 = d.f94951a;
                        ArrayList arrayList6 = new ArrayList();
                        jsonReader.beginObject();
                        double dNextDouble = 0.0d;
                        double dNextDouble2 = 0.0d;
                        String strNextString7 = null;
                        String strNextString8 = null;
                        char cCharAt = 0;
                        while (jsonReader.hasNext()) {
                            int iSelectName3 = jsonReader.selectName(d.f94951a);
                            if (iSelectName3 == 0) {
                                cCharAt = jsonReader.nextString().charAt(0);
                            } else if (iSelectName3 == 1) {
                                dNextDouble = jsonReader.nextDouble();
                            } else if (iSelectName3 == 2) {
                                dNextDouble2 = jsonReader.nextDouble();
                            } else if (iSelectName3 == 3) {
                                strNextString7 = jsonReader.nextString();
                            } else if (iSelectName3 == 4) {
                                strNextString8 = jsonReader.nextString();
                            } else if (iSelectName3 != 5) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.selectName(d.f94952b) != 0) {
                                        jsonReader.skipName();
                                        jsonReader.skipValue();
                                    } else {
                                        jsonReader.beginArray();
                                        while (jsonReader.hasNext()) {
                                            arrayList6.add((ShapeGroup) c.a(jsonReader, lottieComposition));
                                        }
                                        jsonReader.endArray();
                                    }
                                }
                                jsonReader.endObject();
                            }
                        }
                        jsonReader.endObject();
                        FontCharacter fontCharacter = new FontCharacter(arrayList6, cCharAt, dNextDouble, dNextDouble2, strNextString7, strNextString8);
                        sparseArrayCompat2.put(fontCharacter.hashCode(), fontCharacter);
                    }
                    jsonReader.endArray();
                    sparseArrayCompat = sparseArrayCompat2;
                    arrayList = arrayList3;
                    i10 = iNextInt;
                    iNextInt = i10;
                    arrayList3 = arrayList;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fNextDouble3 = f10;
                    fNextDouble2 = f6;
                    break;
                case 10:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString9 = null;
                        float fNextDouble5 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int iSelectName4 = jsonReader.selectName(f26169d);
                            if (iSelectName4 != 0) {
                                float f11 = fNextDouble3;
                                if (iSelectName4 == 1) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                } else if (iSelectName4 != 2) {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                    fNextDouble3 = f11;
                                } else {
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                }
                                fNextDouble3 = f11;
                                fNextDouble2 = fNextDouble2;
                            } else {
                                strNextString9 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        arrayList3.add(new Marker(strNextString9, fNextDouble5, fNextDouble6));
                        fNextDouble3 = fNextDouble3;
                        fNextDouble2 = fNextDouble2;
                    }
                    f6 = fNextDouble2;
                    f10 = fNextDouble3;
                    jsonReader.endArray();
                    sparseArrayCompat = sparseArrayCompat2;
                    arrayList = arrayList3;
                    i10 = iNextInt;
                    iNextInt = i10;
                    arrayList3 = arrayList;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fNextDouble3 = f10;
                    fNextDouble2 = f6;
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    f6 = fNextDouble2;
                    f10 = fNextDouble3;
                    sparseArrayCompat = sparseArrayCompat2;
                    arrayList = arrayList3;
                    i10 = iNextInt;
                    iNextInt = i10;
                    arrayList3 = arrayList;
                    sparseArrayCompat2 = sparseArrayCompat;
                    fNextDouble3 = f10;
                    fNextDouble2 = f6;
                    break;
            }
        }
        ArrayList arrayList7 = arrayList3;
        int i13 = iNextInt;
        lottieComposition.init(new Rect(0, 0, (int) (i13 * fDpScale), (int) (iNextInt2 * fDpScale)), fNextDouble, fNextDouble2, fNextDouble3, arrayList2, longSparseArray, map, map2, Utils.dpScale(), sparseArrayCompat2, map3, arrayList7, i13, iNextInt2);
        return lottieComposition;
    }
}
