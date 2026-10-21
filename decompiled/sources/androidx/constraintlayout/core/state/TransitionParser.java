package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.h0;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.image.transform.MonochromeImageTransformer;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class TransitionParser {
    public static int a(String str, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        return 0;
    }

    @Deprecated
    public static void parse(CLObject cLObject, Transition transition, CorePixelDp corePixelDp) throws CLParsingException {
        parse(cLObject, transition);
    }

    /* JADX WARN: Code duplicated, block: B:235:0x0587  */
    /* JADX WARN: Code duplicated, block: B:237:0x058e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0595  */
    /* JADX WARN: Code duplicated, block: B:303:0x059a A[SYNTHETIC] */
    public static void parseKeyFrames(CLObject cLObject, Transition transition) throws CLParsingException {
        String str;
        int i10;
        String str2;
        String str3;
        TypedBundle[] typedBundleArr;
        int i11;
        String str4;
        String str5;
        CLArray cLArray;
        CustomVariable[][] customVariableArr;
        CLObject cLObject2;
        int i12;
        CLArray cLArray2;
        Transition transition2;
        Transition transition3 = transition;
        CLObject objectOrNull = cLObject.getObjectOrNull("KeyFrames");
        if (objectOrNull == null) {
            return;
        }
        CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
        String str6 = "curveFit";
        String str7 = "transitionEasing";
        String str8 = "frames";
        String str9 = "target";
        if (arrayOrNull != null) {
            int i13 = 0;
            while (i13 < arrayOrNull.size()) {
                CLElement cLElement = arrayOrNull.get(i13);
                if (cLElement instanceof CLObject) {
                    CLObject cLObject3 = (CLObject) cLElement;
                    TypedBundle typedBundle = new TypedBundle();
                    CLArray array = cLObject3.getArray(str9);
                    CLArray array2 = cLObject3.getArray(str8);
                    CLArray arrayOrNull2 = cLObject3.getArrayOrNull("percentX");
                    CLArray arrayOrNull3 = cLObject3.getArrayOrNull("percentY");
                    CLArray arrayOrNull4 = cLObject3.getArrayOrNull("percentWidth");
                    CLArray arrayOrNull5 = cLObject3.getArrayOrNull("percentHeight");
                    String stringOrNull = cLObject3.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
                    String stringOrNull2 = cLObject3.getStringOrNull(str7);
                    String stringOrNull3 = cLObject3.getStringOrNull(str6);
                    String stringOrNull4 = cLObject3.getStringOrNull("type");
                    if (stringOrNull4 == null) {
                        stringOrNull4 = "parentRelative";
                    }
                    if ((arrayOrNull2 == null || array2.size() == arrayOrNull2.size()) && (arrayOrNull3 == null || array2.size() == arrayOrNull3.size())) {
                        int i14 = 0;
                        while (i14 < array.size()) {
                            String string = array.getString(i14);
                            CLArray cLArray3 = array;
                            int i15 = i14;
                            int iA = a(stringOrNull4, "deltaRelative", "pathRelative", "parentRelative");
                            typedBundle.clear();
                            typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, iA);
                            if (stringOrNull3 != null) {
                                String[] strArr = {"spline", "linear"};
                                for (int i16 = 0; i16 < 2; i16++) {
                                    if (strArr[i16].equals(stringOrNull3)) {
                                        typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, i16);
                                    }
                                }
                            }
                            typedBundle.addIfNotNull(501, stringOrNull2);
                            if (stringOrNull != null) {
                                String[] strArr2 = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                for (int i17 = 0; i17 < 6; i17++) {
                                    if (strArr2[i17].equals(stringOrNull)) {
                                        typedBundle.add(509, i17);
                                    }
                                }
                            }
                            for (int i18 = 0; i18 < array2.size(); i18++) {
                                typedBundle.add(100, array2.getInt(i18));
                                if (arrayOrNull2 != null) {
                                    typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_X, arrayOrNull2.getFloat(i18));
                                }
                                if (arrayOrNull3 != null) {
                                    typedBundle.add(TypedValues.PositionType.TYPE_PERCENT_Y, arrayOrNull3.getFloat(i18));
                                }
                                if (arrayOrNull4 != null) {
                                    typedBundle.add(503, arrayOrNull4.getFloat(i18));
                                }
                                if (arrayOrNull5 != null) {
                                    typedBundle.add(504, arrayOrNull5.getFloat(i18));
                                }
                                transition.addKeyPosition(string, typedBundle);
                            }
                            i14 = i15 + 1;
                            array = cLArray3;
                            stringOrNull4 = stringOrNull4;
                        }
                    }
                    transition2 = transition;
                } else {
                    transition2 = transition3;
                }
                i13++;
                transition3 = transition2;
                arrayOrNull = arrayOrNull;
                str8 = str8;
                str9 = str9;
                objectOrNull = objectOrNull;
                str7 = str7;
                str6 = str6;
            }
        }
        Transition transition4 = transition3;
        String str10 = str6;
        String str11 = str7;
        String str12 = str8;
        String str13 = str9;
        CLObject cLObject4 = objectOrNull;
        CLArray arrayOrNull6 = cLObject4.getArrayOrNull(TypedValues.AttributesType.NAME);
        if (arrayOrNull6 != null) {
            int i19 = 0;
            while (i19 < arrayOrNull6.size()) {
                CLElement cLElement2 = arrayOrNull6.get(i19);
                if (cLElement2 instanceof CLObject) {
                    CLObject cLObject5 = (CLObject) cLElement2;
                    str4 = str13;
                    CLArray arrayOrNull7 = cLObject5.getArrayOrNull(str4);
                    if (arrayOrNull7 == null) {
                        str5 = str12;
                    } else {
                        String str14 = str12;
                        CLArray arrayOrNull8 = cLObject5.getArrayOrNull(str14);
                        if (arrayOrNull8 == null) {
                            str5 = str14;
                        } else {
                            String stringOrNull5 = cLObject5.getStringOrNull(str11);
                            String[] strArr3 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
                            int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
                            arrayOrNull6 = arrayOrNull6;
                            boolean[] zArr = {false, false, true, true, true, false, false, false, false};
                            int size = arrayOrNull8.size();
                            TypedBundle[] typedBundleArr2 = new TypedBundle[size];
                            str4 = str4;
                            str5 = str14;
                            for (int i20 = 0; i20 < arrayOrNull8.size(); i20++) {
                                typedBundleArr2[i20] = new TypedBundle();
                            }
                            int i21 = 0;
                            while (i21 < 9) {
                                String str15 = strArr3[i21];
                                String[] strArr4 = strArr3;
                                int i22 = iArr[i21];
                                boolean z10 = zArr[i21];
                                boolean[] zArr2 = zArr;
                                CLArray arrayOrNull9 = cLObject5.getArrayOrNull(str15);
                                int[] iArr2 = iArr;
                                if (arrayOrNull9 != null && arrayOrNull9.size() != size) {
                                    throw new CLParsingException(h0.b("incorrect size for ", str15, " array, not matching targets array!"), cLObject5);
                                }
                                if (arrayOrNull9 != null) {
                                    int i23 = 0;
                                    while (i23 < size) {
                                        float pixels = arrayOrNull9.getFloat(i23);
                                        CLArray cLArray4 = arrayOrNull9;
                                        if (z10) {
                                            pixels = transition4.f19045i.toPixels(pixels);
                                        }
                                        typedBundleArr2[i23].add(i22, pixels);
                                        i23++;
                                        arrayOrNull9 = cLArray4;
                                    }
                                } else {
                                    float floatOrNaN = cLObject5.getFloatOrNaN(str15);
                                    if (!Float.isNaN(floatOrNaN)) {
                                        if (z10) {
                                            floatOrNaN = transition4.f19045i.toPixels(floatOrNaN);
                                        }
                                        for (int i24 = 0; i24 < size; i24++) {
                                            typedBundleArr2[i24].add(i22, floatOrNaN);
                                        }
                                    }
                                }
                                i21++;
                                strArr3 = strArr4;
                                zArr = zArr2;
                                iArr = iArr2;
                            }
                            CLElement orNull = cLObject5.getOrNull("custom");
                            if (orNull == null || !(orNull instanceof CLObject)) {
                                cLObject4 = cLObject4;
                                i19 = i19;
                                cLArray = arrayOrNull8;
                                customVariableArr = null;
                            } else {
                                CLObject cLObject6 = (CLObject) orNull;
                                int size2 = cLObject6.size();
                                customVariableArr = (CustomVariable[][]) Array.newInstance((Class<?>) CustomVariable.class, arrayOrNull8.size(), size2);
                                int i25 = 0;
                                while (i25 < size2) {
                                    CLKey cLKey = (CLKey) cLObject6.get(i25);
                                    String strContent = cLKey.content();
                                    CLObject cLObject7 = cLObject6;
                                    int i26 = size2;
                                    if (cLKey.getValue() instanceof CLArray) {
                                        CLArray cLArray5 = (CLArray) cLKey.getValue();
                                        int size3 = cLArray5.size();
                                        if (size3 != size || size3 <= 0) {
                                            cLObject2 = cLObject4;
                                        } else {
                                            cLObject2 = cLObject4;
                                            if (cLArray5.get(0) instanceof CLNumber) {
                                                int i27 = 0;
                                                while (i27 < size) {
                                                    customVariableArr[i27][i25] = new CustomVariable(strContent, 901, cLArray5.get(i27).getFloat());
                                                    i27++;
                                                    i19 = i19;
                                                    arrayOrNull8 = arrayOrNull8;
                                                }
                                            } else {
                                                i12 = i19;
                                                cLArray2 = arrayOrNull8;
                                                for (int i28 = 0; i28 < size; i28++) {
                                                    long jC = ConstraintSetParser.c(cLArray5.get(i28).content());
                                                    if (jC != -1) {
                                                        customVariableArr[i28][i25] = new CustomVariable(strContent, 902, (int) jC);
                                                    }
                                                }
                                            }
                                        }
                                        i12 = i19;
                                        cLArray2 = arrayOrNull8;
                                    } else {
                                        cLObject2 = cLObject4;
                                        i12 = i19;
                                        cLArray2 = arrayOrNull8;
                                        CLElement value = cLKey.getValue();
                                        if (value instanceof CLNumber) {
                                            float f6 = value.getFloat();
                                            for (int i29 = 0; i29 < size; i29++) {
                                                customVariableArr[i29][i25] = new CustomVariable(strContent, 901, f6);
                                            }
                                        } else {
                                            long jC2 = ConstraintSetParser.c(value.content());
                                            if (jC2 != -1) {
                                                int i30 = 0;
                                                while (i30 < size) {
                                                    customVariableArr[i30][i25] = new CustomVariable(strContent, 902, (int) jC2);
                                                    i30++;
                                                    jC2 = jC2;
                                                }
                                            }
                                        }
                                    }
                                    i25++;
                                    cLObject6 = cLObject7;
                                    size2 = i26;
                                    cLObject4 = cLObject2;
                                    i19 = i12;
                                    arrayOrNull8 = cLArray2;
                                }
                                cLObject4 = cLObject4;
                                i19 = i19;
                                cLArray = arrayOrNull8;
                            }
                            String stringOrNull6 = cLObject5.getStringOrNull(str10);
                            for (int i31 = 0; i31 < arrayOrNull7.size(); i31++) {
                                int i32 = 0;
                                while (i32 < size) {
                                    String string2 = arrayOrNull7.getString(i31);
                                    TypedBundle typedBundle2 = typedBundleArr2[i32];
                                    if (stringOrNull6 != null) {
                                        typedBundle2.add(TypedValues.PositionType.TYPE_CURVE_FIT, a(stringOrNull6, "spline", "linear"));
                                    }
                                    typedBundle2.addIfNotNull(501, stringOrNull5);
                                    CLArray cLArray6 = cLArray;
                                    typedBundle2.add(100, cLArray6.getInt(i32));
                                    transition.addKeyAttribute(string2, typedBundle2, customVariableArr != null ? customVariableArr[i32] : null);
                                    i32++;
                                    cLArray = cLArray6;
                                }
                            }
                            transition4 = transition;
                        }
                    }
                    str10 = str10;
                } else {
                    arrayOrNull6 = arrayOrNull6;
                    cLObject4 = cLObject4;
                    i19 = i19;
                    transition4 = transition4;
                    str4 = str13;
                    str10 = str10;
                    str5 = str12;
                }
                i19++;
                str10 = str10;
                transition4 = transition4;
                arrayOrNull6 = arrayOrNull6;
                str12 = str5;
                str13 = str4;
                cLObject4 = cLObject4;
            }
        }
        Transition transition5 = transition4;
        String str16 = str13;
        String str17 = str10;
        String str18 = str12;
        CLArray arrayOrNull10 = cLObject4.getArrayOrNull("KeyCycles");
        if (arrayOrNull10 != null) {
            int i33 = 0;
            while (i33 < arrayOrNull10.size()) {
                CLElement cLElement3 = arrayOrNull10.get(i33);
                if (cLElement3 instanceof CLObject) {
                    CLObject cLObject8 = (CLObject) cLElement3;
                    String str19 = str16;
                    CLArray array3 = cLObject8.getArray(str19);
                    String str20 = str18;
                    CLArray array4 = cLObject8.getArray(str20);
                    String str21 = str11;
                    String stringOrNull7 = cLObject8.getStringOrNull(str21);
                    String[] strArr5 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", TypedValues.CycleType.S_WAVE_PERIOD, TypedValues.CycleType.S_WAVE_OFFSET, TypedValues.CycleType.S_WAVE_PHASE};
                    int[] iArr3 = {311, 312, 304, 305, 306, 308, 309, 310, 403, TypedValues.CycleType.TYPE_WAVE_PERIOD, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_WAVE_PHASE};
                    int[] iArr4 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
                    int size4 = array4.size();
                    str3 = str19;
                    TypedBundle[] typedBundleArr3 = new TypedBundle[size4];
                    str2 = str20;
                    for (int i34 = 0; i34 < size4; i34++) {
                        typedBundleArr3[i34] = new TypedBundle();
                    }
                    str11 = str21;
                    int i35 = 0;
                    boolean z11 = false;
                    while (i35 < 12) {
                        if (cLObject8.has(strArr5[i35])) {
                            i11 = i33;
                            if (iArr4[i35] == 1) {
                                z11 = true;
                            }
                        } else {
                            i11 = i33;
                        }
                        i35++;
                        i33 = i11;
                    }
                    i10 = i33;
                    int i36 = 0;
                    for (int i37 = 12; i36 < i37; i37 = 12) {
                        String str22 = strArr5[i36];
                        int i38 = iArr3[i36];
                        String[] strArr6 = strArr5;
                        int i39 = iArr4[i36];
                        int[] iArr5 = iArr4;
                        CLArray arrayOrNull11 = cLObject8.getArrayOrNull(str22);
                        int[] iArr6 = iArr3;
                        if (arrayOrNull11 != null && arrayOrNull11.size() != size4) {
                            throw new CLParsingException("incorrect size for $attrName array, not matching targets array!", cLObject8);
                        }
                        if (arrayOrNull11 != null) {
                            int i40 = 0;
                            while (i40 < size4) {
                                float pixels2 = arrayOrNull11.getFloat(i40);
                                CLArray cLArray7 = arrayOrNull11;
                                if (i39 == 1) {
                                    pixels2 = transition5.f19045i.toPixels(pixels2);
                                } else if (i39 == 2 && z11) {
                                    pixels2 = transition5.f19045i.toPixels(pixels2);
                                }
                                typedBundleArr3[i40].add(i38, pixels2);
                                i40++;
                                arrayOrNull11 = cLArray7;
                            }
                        } else {
                            float floatOrNaN2 = cLObject8.getFloatOrNaN(str22);
                            if (!Float.isNaN(floatOrNaN2)) {
                                if (i39 == 1) {
                                    floatOrNaN2 = transition5.f19045i.toPixels(floatOrNaN2);
                                } else if (i39 == 2 && z11) {
                                    floatOrNaN2 = transition5.f19045i.toPixels(floatOrNaN2);
                                }
                                for (int i41 = 0; i41 < size4; i41++) {
                                    typedBundleArr3[i41].add(i38, floatOrNaN2);
                                }
                            }
                            i36++;
                            strArr5 = strArr6;
                            iArr4 = iArr5;
                            iArr3 = iArr6;
                        }
                        i36++;
                        strArr5 = strArr6;
                        iArr4 = iArr5;
                        iArr3 = iArr6;
                    }
                    String stringOrNull8 = cLObject8.getStringOrNull(str17);
                    String stringOrNull9 = cLObject8.getStringOrNull("easing");
                    String stringOrNull10 = cLObject8.getStringOrNull("waveShape");
                    String stringOrNull11 = cLObject8.getStringOrNull(TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE);
                    int i42 = 0;
                    while (i42 < array3.size()) {
                        int i43 = 0;
                        while (i43 < size4) {
                            String string3 = array3.getString(i42);
                            String str23 = str17;
                            TypedBundle typedBundle3 = typedBundleArr3[i43];
                            if (stringOrNull8 != null) {
                                typedBundleArr = typedBundleArr3;
                                if (stringOrNull8.equals("linear")) {
                                    stringOrNull8 = stringOrNull8;
                                    typedBundle3.add(401, 1);
                                } else if (stringOrNull8.equals("spline")) {
                                    typedBundle3.add(401, 0);
                                }
                                typedBundle3.addIfNotNull(501, stringOrNull7);
                                if (stringOrNull9 != null) {
                                    typedBundle3.add(TypedValues.CycleType.TYPE_EASING, stringOrNull9);
                                }
                                if (stringOrNull10 != null) {
                                    typedBundle3.add(421, stringOrNull10);
                                }
                                if (stringOrNull11 != null) {
                                    typedBundle3.add(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, stringOrNull11);
                                }
                                typedBundle3.add(100, array4.getInt(i43));
                                transition5.addKeyCycle(string3, typedBundle3);
                                i43++;
                                str17 = str23;
                                stringOrNull8 = stringOrNull8;
                                typedBundleArr3 = typedBundleArr;
                            } else {
                                typedBundleArr = typedBundleArr3;
                            }
                            typedBundle3.addIfNotNull(501, stringOrNull7);
                            if (stringOrNull9 != null) {
                                typedBundle3.add(TypedValues.CycleType.TYPE_EASING, stringOrNull9);
                            }
                            if (stringOrNull10 != null) {
                                typedBundle3.add(421, stringOrNull10);
                            }
                            if (stringOrNull11 != null) {
                                typedBundle3.add(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, stringOrNull11);
                            }
                            typedBundle3.add(100, array4.getInt(i43));
                            transition5.addKeyCycle(string3, typedBundle3);
                            i43++;
                            str17 = str23;
                            stringOrNull8 = stringOrNull8;
                            typedBundleArr3 = typedBundleArr;
                        }
                        i42++;
                        typedBundleArr3 = typedBundleArr3;
                    }
                    str = str17;
                } else {
                    str = str17;
                    i10 = i33;
                    str2 = str18;
                    str3 = str16;
                }
                i33 = i10 + 1;
                arrayOrNull10 = arrayOrNull10;
                str17 = str;
                str16 = str3;
                str18 = str2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x0182  */
    /* JADX WARN: Code duplicated, block: B:60:0x018e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0197  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01af  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3  */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void parse(@NonNull CLObject cLObject, @NonNull Transition transition) throws CLParsingException {
        boolean z10;
        CLObject objectOrNull;
        float floatOrNaN;
        float floatOrNaN2;
        float floatOrNaN3;
        float floatOrNaN4;
        float floatOrNaN5;
        float floatOrNaN6;
        float floatOrNaN7;
        Transition.b bVar;
        transition.f19044h = null;
        transition.f19039c.clear();
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        TypedBundle typedBundle = new TypedBundle();
        boolean z11 = true;
        if (stringOrNull != null) {
            switch (stringOrNull) {
                case "startVertical":
                    typedBundle.add(509, 1);
                    break;
                case "startHorizontal":
                    typedBundle.add(509, 2);
                    break;
                case "flip":
                    typedBundle.add(509, 3);
                    break;
                case "none":
                    typedBundle.add(509, 0);
                    break;
                case "above":
                    typedBundle.add(509, 5);
                    break;
                case "below":
                    typedBundle.add(509, 4);
                    break;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        String stringOrNull2 = cLObject.getStringOrNull("interpolator");
        if (stringOrNull2 != null) {
            typedBundle.add(TypedValues.TransitionType.TYPE_INTERPOLATOR, stringOrNull2);
        } else {
            z11 = z10;
        }
        float floatOrNaN8 = cLObject.getFloatOrNaN(TypedValues.TransitionType.S_STAGGERED);
        if (Float.isNaN(floatOrNaN8)) {
            if (z11) {
            }
            objectOrNull = cLObject.getObjectOrNull("onSwipe");
            if (objectOrNull != null) {
                String stringOrNull3 = objectOrNull.getStringOrNull("anchor");
                int iA = a(objectOrNull.getStringOrNull("side"), Transition.b.f19065r);
                int iA2 = a(objectOrNull.getStringOrNull("direction"), Transition.b.f19067t);
                floatOrNaN = objectOrNull.getFloatOrNaN(ImageScaleTypeHandler.ID);
                float floatOrNaN9 = objectOrNull.getFloatOrNaN(MonochromeImageTransformer.THRESHOLD);
                floatOrNaN2 = objectOrNull.getFloatOrNaN("maxVelocity");
                floatOrNaN3 = objectOrNull.getFloatOrNaN("maxAccel");
                String stringOrNull4 = objectOrNull.getStringOrNull("limitBounds");
                int iA3 = a(objectOrNull.getStringOrNull("mode"), Transition.b.f19068u);
                int iA4 = a(objectOrNull.getStringOrNull("touchUp"), Transition.b.f19069v);
                floatOrNaN4 = objectOrNull.getFloatOrNaN("springMass");
                floatOrNaN5 = objectOrNull.getFloatOrNaN("springStiffness");
                floatOrNaN6 = objectOrNull.getFloatOrNaN("springDamping");
                floatOrNaN7 = objectOrNull.getFloatOrNaN("stopThreshold");
                int iA5 = a(objectOrNull.getStringOrNull("springBoundary"), Transition.b.f19070w);
                objectOrNull.getStringOrNull("around");
                bVar = new Transition.b();
                bVar.f19077f = 1.0f;
                bVar.f19078g = 0;
                bVar.f19079h = 4.0f;
                bVar.f19080i = 1.2f;
                bVar.f19081j = 0;
                bVar.f19082k = 1.0f;
                bVar.f19083l = 400.0f;
                bVar.m = 10.0f;
                bVar.f19084n = 0.01f;
                bVar.f19085o = 0.0f;
                bVar.f19086p = 0;
                transition.f19044h = bVar;
                bVar.f19072a = stringOrNull3;
                bVar.f19073b = iA;
                bVar.f19076e = iA2;
                if (!Float.isNaN(floatOrNaN)) {
                    bVar.f19077f = floatOrNaN;
                }
                Float.isNaN(floatOrNaN9);
                if (!Float.isNaN(floatOrNaN2)) {
                    bVar.f19079h = floatOrNaN2;
                }
                if (!Float.isNaN(floatOrNaN3)) {
                    bVar.f19080i = floatOrNaN3;
                }
                bVar.f19075d = stringOrNull4;
                bVar.f19078g = iA3;
                bVar.f19081j = iA4;
                if (!Float.isNaN(floatOrNaN4)) {
                    bVar.f19082k = floatOrNaN4;
                }
                if (!Float.isNaN(floatOrNaN5)) {
                    bVar.f19083l = floatOrNaN5;
                }
                if (!Float.isNaN(floatOrNaN6)) {
                    bVar.m = floatOrNaN6;
                }
                if (!Float.isNaN(floatOrNaN7)) {
                    bVar.f19084n = floatOrNaN7;
                }
                bVar.f19086p = iA5;
            }
            parseKeyFrames(cLObject, transition);
        }
        typedBundle.add(TypedValues.TransitionType.TYPE_STAGGERED, floatOrNaN8);
        transition.setTransitionProperties(typedBundle);
        objectOrNull = cLObject.getObjectOrNull("onSwipe");
        if (objectOrNull != null) {
            String stringOrNull5 = objectOrNull.getStringOrNull("anchor");
            int iA6 = a(objectOrNull.getStringOrNull("side"), Transition.b.f19065r);
            int iA7 = a(objectOrNull.getStringOrNull("direction"), Transition.b.f19067t);
            floatOrNaN = objectOrNull.getFloatOrNaN(ImageScaleTypeHandler.ID);
            float floatOrNaN10 = objectOrNull.getFloatOrNaN(MonochromeImageTransformer.THRESHOLD);
            floatOrNaN2 = objectOrNull.getFloatOrNaN("maxVelocity");
            floatOrNaN3 = objectOrNull.getFloatOrNaN("maxAccel");
            String stringOrNull6 = objectOrNull.getStringOrNull("limitBounds");
            int iA8 = a(objectOrNull.getStringOrNull("mode"), Transition.b.f19068u);
            int iA9 = a(objectOrNull.getStringOrNull("touchUp"), Transition.b.f19069v);
            floatOrNaN4 = objectOrNull.getFloatOrNaN("springMass");
            floatOrNaN5 = objectOrNull.getFloatOrNaN("springStiffness");
            floatOrNaN6 = objectOrNull.getFloatOrNaN("springDamping");
            floatOrNaN7 = objectOrNull.getFloatOrNaN("stopThreshold");
            int iA10 = a(objectOrNull.getStringOrNull("springBoundary"), Transition.b.f19070w);
            objectOrNull.getStringOrNull("around");
            bVar = new Transition.b();
            bVar.f19077f = 1.0f;
            bVar.f19078g = 0;
            bVar.f19079h = 4.0f;
            bVar.f19080i = 1.2f;
            bVar.f19081j = 0;
            bVar.f19082k = 1.0f;
            bVar.f19083l = 400.0f;
            bVar.m = 10.0f;
            bVar.f19084n = 0.01f;
            bVar.f19085o = 0.0f;
            bVar.f19086p = 0;
            transition.f19044h = bVar;
            bVar.f19072a = stringOrNull5;
            bVar.f19073b = iA6;
            bVar.f19076e = iA7;
            if (!Float.isNaN(floatOrNaN)) {
                bVar.f19077f = floatOrNaN;
            }
            Float.isNaN(floatOrNaN10);
            if (!Float.isNaN(floatOrNaN2)) {
                bVar.f19079h = floatOrNaN2;
            }
            if (!Float.isNaN(floatOrNaN3)) {
                bVar.f19080i = floatOrNaN3;
            }
            bVar.f19075d = stringOrNull6;
            bVar.f19078g = iA8;
            bVar.f19081j = iA9;
            if (!Float.isNaN(floatOrNaN4)) {
                bVar.f19082k = floatOrNaN4;
            }
            if (!Float.isNaN(floatOrNaN5)) {
                bVar.f19083l = floatOrNaN5;
            }
            if (!Float.isNaN(floatOrNaN6)) {
                bVar.m = floatOrNaN6;
            }
            if (!Float.isNaN(floatOrNaN7)) {
                bVar.f19084n = floatOrNaN7;
            }
            bVar.f19086p = iA10;
        }
        parseKeyFrames(cLObject, transition);
    }
}
