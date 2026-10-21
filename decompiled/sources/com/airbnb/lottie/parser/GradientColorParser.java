package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import z3.t;

/* JADX INFO: loaded from: classes2.dex */
public class GradientColorParser implements t<GradientColor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26161a;

    public GradientColorParser(int i10) {
        this.f26161a = i10;
    }

    public static float[] mergeUniqueElements(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            float f6 = i11 < fArr.length ? fArr[i11] : Float.NaN;
            float f10 = i12 < fArr2.length ? fArr2[i12] : Float.NaN;
            if (Float.isNaN(f10) || f6 < f10) {
                fArr3[i13] = f6;
                i11++;
            } else if (Float.isNaN(f6) || f10 < f6) {
                fArr3[i13] = f10;
                i12++;
            } else {
                fArr3[i13] = f6;
                i11++;
                i12++;
                i10++;
            }
        }
        return i10 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i10);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    @Override // z3.t
    public GradientColor parse(JsonReader jsonReader, float f6) throws IOException {
        boolean z10;
        int i10;
        float f10;
        int iArgb;
        int iArgb2;
        float f11;
        float fLerp;
        ArrayList arrayList = new ArrayList();
        char c10 = 0;
        boolean z11 = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z11) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        int i11 = 3;
        int i12 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f26161a = 2;
        }
        if (z11) {
            jsonReader.endArray();
        }
        if (this.f26161a == -1) {
            this.f26161a = arrayList.size() / 4;
        }
        int i13 = this.f26161a;
        float[] fArr = new float[i13];
        int[] iArr = new int[i13];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < this.f26161a * 4) {
            int i17 = i14 / 4;
            double dFloatValue = ((Float) arrayList.get(i14)).floatValue();
            int i18 = i14 % 4;
            if (i18 != 0) {
                if (i18 == 1) {
                    i15 = (int) (dFloatValue * 255.0d);
                } else if (i18 == 2) {
                    i16 = (int) (dFloatValue * 255.0d);
                } else if (i18 == i11) {
                    iArr[i17] = Color.argb(255, i15, i16, (int) (dFloatValue * 255.0d));
                }
            } else if (i17 > 0) {
                float f12 = (float) dFloatValue;
                if (fArr[i17 - 1] >= f12) {
                    fArr[i17] = f12 + 0.01f;
                } else {
                    fArr[i17] = (float) dFloatValue;
                }
            } else {
                fArr[i17] = (float) dFloatValue;
            }
            i14++;
            i11 = 3;
        }
        GradientColor gradientColor = new GradientColor(fArr, iArr);
        int i19 = this.f26161a * 4;
        if (arrayList.size() <= i19) {
            return gradientColor;
        }
        float[] positions = gradientColor.getPositions();
        int[] colors = gradientColor.getColors();
        int size = (arrayList.size() - i19) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i20 = 0;
        while (i19 < arrayList.size()) {
            if (i19 % 2 == 0) {
                fArr2[i20] = ((Float) arrayList.get(i19)).floatValue();
            } else {
                fArr3[i20] = ((Float) arrayList.get(i19)).floatValue();
                i20++;
            }
            i19++;
        }
        float[] fArrMergeUniqueElements = mergeUniqueElements(gradientColor.getPositions(), fArr2);
        int length = fArrMergeUniqueElements.length;
        int[] iArr2 = new int[length];
        int i21 = 0;
        while (i21 < length) {
            float f13 = fArrMergeUniqueElements[i21];
            int iBinarySearch = Arrays.binarySearch(positions, f13);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f13);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f14 = fArr3[iBinarySearch2];
                if (colors.length < 2 || f13 == positions[c10]) {
                    z10 = true;
                    i10 = colors[c10];
                } else {
                    int i22 = 1;
                    while (true) {
                        if (i22 >= positions.length) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f10 = positions[i22];
                        if (f10 >= f13) {
                            z10 = true;
                            break;
                        }
                        z10 = true;
                        if (i22 == positions.length - 1) {
                            break;
                        }
                        i22++;
                    }
                    if (i22 != positions.length - 1 || f13 < f10) {
                        int i23 = i22 - 1;
                        float f15 = positions[i23];
                        int iEvaluate = GammaEvaluator.evaluate((f13 - f15) / (f10 - f15), colors[i23], colors[i22]);
                        iArgb = Color.argb((int) (f14 * 255.0f), Color.red(iEvaluate), Color.green(iEvaluate), Color.blue(iEvaluate));
                    } else {
                        iArgb = Color.argb((int) (f14 * 255.0f), Color.red(colors[i22]), Color.green(colors[i22]), Color.blue(colors[i22]));
                    }
                    i10 = iArgb;
                    c10 = 0;
                }
                iArr2[i21] = i10;
            } else {
                int i24 = colors[iBinarySearch];
                if (size < i12 || f13 <= fArr2[c10]) {
                    iArgb2 = Color.argb((int) (fArr3[c10] * 255.0f), Color.red(i24), Color.green(i24), Color.blue(i24));
                } else {
                    int i25 = 1;
                    while (true) {
                        if (i25 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f11 = fArr2[i25];
                        if (f11 >= f13 || i25 == size - 1) {
                            break;
                        }
                        i25++;
                    }
                    if (f11 <= f13) {
                        fLerp = fArr3[i25];
                    } else {
                        int i26 = i25 - 1;
                        float f16 = fArr2[i26];
                        fLerp = MiscUtils.lerp(fArr3[i26], fArr3[i25], (f13 - f16) / (f11 - f16));
                    }
                    iArgb2 = Color.argb((int) (fLerp * 255.0f), Color.red(i24), Color.green(i24), Color.blue(i24));
                }
                iArr2[i21] = iArgb2;
                z10 = true;
            }
            i21++;
            i12 = 2;
        }
        return new GradientColor(fArrMergeUniqueElements, iArr2);
    }
}
