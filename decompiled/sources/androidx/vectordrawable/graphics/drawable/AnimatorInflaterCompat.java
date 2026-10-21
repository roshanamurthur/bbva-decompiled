package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.AnimatorRes;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class AnimatorInflaterCompat {

    public static class a implements TypeEvaluator<PathParser.PathDataNode[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PathParser.PathDataNode[] f23766a;

        @Override // android.animation.TypeEvaluator
        public final PathParser.PathDataNode[] evaluate(float f6, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            PathParser.PathDataNode[] pathDataNodeArr3 = pathDataNodeArr;
            PathParser.PathDataNode[] pathDataNodeArr4 = pathDataNodeArr2;
            if (!PathParser.canMorph(pathDataNodeArr3, pathDataNodeArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!PathParser.canMorph(this.f23766a, pathDataNodeArr3)) {
                this.f23766a = PathParser.deepCopyNodes(pathDataNodeArr3);
            }
            for (int i10 = 0; i10 < pathDataNodeArr3.length; i10++) {
                this.f23766a[i10].interpolatePathDataNode(pathDataNodeArr3[i10], pathDataNodeArr4[i10], f6);
            }
            return this.f23766a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0350  */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10, float f6) throws XmlPullParserException, IOException {
        int i11;
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        PropertyValuesHolder propertyValuesHolderB;
        int size;
        int i17;
        int i18;
        int i19;
        Keyframe keyframeOfFloat;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        int depth = xmlResourceParser.getDepth();
        Animator animatorD = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i20 = 3;
            int i21 = 0;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i22 = 1;
            if (next == 1) {
                break;
            }
            int i23 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, f6, xmlResourceParser);
                    animatorD = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorD = d(context, resources, theme, attributeSet, null, f6, xmlResourceParser);
                    } else if (name.equals(SetCommand.ID)) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources2, theme2, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23839h);
                        a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlResourceParser, "ordering", 0, 0), f6);
                        typedArrayObtainAttributes.recycle();
                        i11 = depth;
                        animatorD = animatorSet2;
                    } else {
                        String str2 = "propertyValuesHolder";
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                        }
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlResourceParser.getEventType();
                            if (eventType == i20 || eventType == i22) {
                                break;
                            }
                            if (eventType != i23) {
                                xmlResourceParser.next();
                            } else {
                                if (xmlResourceParser.getName().equals(str2)) {
                                    TypedArray typedArrayObtainAttributes2 = TypedArrayUtils.obtainAttributes(resources2, theme2, attributeSetAsAttributeSet, androidx.vectordrawable.graphics.drawable.a.f23840i);
                                    String namedString = TypedArrayUtils.getNamedString(typedArrayObtainAttributes2, xmlResourceParser, "propertyName", i20);
                                    int namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes2, xmlResourceParser, "valueType", i23, 4);
                                    int i24 = namedInt;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlResourceParser.next();
                                        attributeSet2 = attributeSetAsAttributeSet;
                                        if (next2 == i20 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlResourceParser.getName().equals("keyframe")) {
                                            int[] iArr = androidx.vectordrawable.graphics.drawable.a.f23841j;
                                            i18 = i24;
                                            if (i18 == 4) {
                                                TypedArray typedArrayObtainAttributes3 = TypedArrayUtils.obtainAttributes(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                TypedValue typedValuePeekNamedValue = TypedArrayUtils.peekNamedValue(typedArrayObtainAttributes3, xmlResourceParser, "value", 0);
                                                int i25 = (typedValuePeekNamedValue == null || !c(typedValuePeekNamedValue.type)) ? 0 : 3;
                                                typedArrayObtainAttributes3.recycle();
                                                i18 = i25;
                                            }
                                            TypedArray typedArrayObtainAttributes4 = TypedArrayUtils.obtainAttributes(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            float namedFloat = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlResourceParser, "fraction", 3, -1.0f);
                                            TypedValue typedValuePeekNamedValue2 = TypedArrayUtils.peekNamedValue(typedArrayObtainAttributes4, xmlResourceParser, "value", 0);
                                            boolean z10 = typedValuePeekNamedValue2 != null;
                                            int i26 = i18 == 4 ? (z10 && c(typedValuePeekNamedValue2.type)) ? 3 : 0 : i18;
                                            if (!z10) {
                                                i19 = 0;
                                                keyframeOfFloat = i26 == 0 ? Keyframe.ofFloat(namedFloat) : Keyframe.ofInt(namedFloat);
                                            } else if (i26 == 0) {
                                                i19 = 0;
                                                keyframeOfFloat = Keyframe.ofFloat(namedFloat, TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlResourceParser, "value", 0, 0.0f));
                                            } else if (i26 == 1 || i26 == 3) {
                                                i19 = 0;
                                                keyframeOfFloat = Keyframe.ofInt(namedFloat, TypedArrayUtils.getNamedInt(typedArrayObtainAttributes4, xmlResourceParser, "value", 0, 0));
                                            } else {
                                                keyframeOfFloat = null;
                                                i19 = 0;
                                            }
                                            int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArrayObtainAttributes4, xmlResourceParser, "interpolator", 1, i19);
                                            if (namedResourceId > 0) {
                                                keyframeOfFloat.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
                                            }
                                            typedArrayObtainAttributes4.recycle();
                                            if (keyframeOfFloat != null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(keyframeOfFloat);
                                            }
                                            xmlResourceParser.next();
                                        } else {
                                            depth = depth;
                                            i18 = i24;
                                        }
                                        resources2 = resources;
                                        theme2 = theme;
                                        str2 = str2;
                                        attributeSetAsAttributeSet = attributeSet2;
                                        depth = depth;
                                        i24 = i18;
                                        i20 = 3;
                                    }
                                    i13 = depth;
                                    int i27 = i24;
                                    str = str2;
                                    if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                        i15 = 3;
                                        i12 = 2;
                                        propertyValuesHolderB = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                        float fraction = keyframe2.getFraction();
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                arrayList3.add(arrayList3.size(), keyframe2.getType() == Float.TYPE ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == Integer.TYPE ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                size++;
                                            }
                                        }
                                        float fraction2 = keyframe.getFraction();
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe.setFraction(0.0f);
                                            } else {
                                                arrayList3.add(0, keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(0.0f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                size++;
                                            }
                                        }
                                        Keyframe[] keyframeArr = new Keyframe[size];
                                        arrayList3.toArray(keyframeArr);
                                        int i28 = 0;
                                        while (i28 < size) {
                                            Keyframe keyframe3 = keyframeArr[i28];
                                            if (keyframe3.getFraction() >= 0.0f) {
                                                i17 = size;
                                            } else if (i28 == 0) {
                                                keyframe3.setFraction(0.0f);
                                                i17 = size;
                                            } else {
                                                int i29 = size - 1;
                                                if (i28 == i29) {
                                                    keyframe3.setFraction(1.0f);
                                                    i17 = size;
                                                } else {
                                                    int i30 = i28;
                                                    for (int i31 = i28 + 1; i31 < i29 && keyframeArr[i31].getFraction() < 0.0f; i31++) {
                                                        i30 = i31;
                                                    }
                                                    float fraction3 = (keyframeArr[i30 + 1].getFraction() - keyframeArr[i28 - 1].getFraction()) / ((i30 - i28) + 2);
                                                    int i32 = i28;
                                                    while (i32 <= i30) {
                                                        keyframeArr[i32].setFraction(keyframeArr[i32 - 1].getFraction() + fraction3);
                                                        i32++;
                                                        size = size;
                                                    }
                                                    i17 = size;
                                                }
                                            }
                                            i28++;
                                            size = i17;
                                        }
                                        i12 = 2;
                                        propertyValuesHolderB = PropertyValuesHolder.ofKeyframe(namedString, keyframeArr);
                                        i15 = 3;
                                        if (i27 == 3) {
                                            propertyValuesHolderB.setEvaluator(ArgbEvaluator.getInstance());
                                        }
                                    }
                                    i16 = 0;
                                    i14 = 1;
                                    if (propertyValuesHolderB == null) {
                                        propertyValuesHolderB = b(typedArrayObtainAttributes2, namedInt, 0, 1, namedString);
                                    }
                                    if (propertyValuesHolderB != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolderB);
                                    }
                                    typedArrayObtainAttributes2.recycle();
                                } else {
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    i12 = i23;
                                    str = str2;
                                    i13 = depth;
                                    i14 = i22;
                                    i15 = i20;
                                    i16 = i21;
                                }
                                xmlResourceParser.next();
                                resources2 = resources;
                                theme2 = theme;
                                i21 = i16;
                                i20 = i15;
                                i22 = i14;
                                i23 = i12;
                                str2 = str;
                                attributeSetAsAttributeSet = attributeSet2;
                                depth = i13;
                            }
                        }
                        int i33 = i22;
                        i11 = depth;
                        int i34 = i21;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i35 = i34; i35 < size2; i35++) {
                                propertyValuesHolderArr[i35] = (PropertyValuesHolder) arrayList2.get(i35);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (animatorD instanceof ValueAnimator)) {
                            ((ValueAnimator) animatorD).setValues(propertyValuesHolderArr);
                        }
                        i21 = i33;
                    }
                    if (animatorSet != null && i21 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animatorD);
                    }
                    resources2 = resources;
                    theme2 = theme;
                    depth = i11;
                }
                i11 = depth;
                if (animatorSet != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animatorD);
                }
                resources2 = resources;
                theme2 = theme;
                depth = i11;
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i36 = 0;
            while (it.hasNext()) {
                animatorArr[i36] = (Animator) it.next();
                i36++;
            }
            if (i10 == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animatorD;
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue != null;
        int i13 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue2 != null;
        int i14 = z11 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && c(i13)) || (z11 && c(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            PathParser.PathDataNode[] pathDataNodeArrCreateNodesFromPathData = PathParser.createNodesFromPathData(string);
            PathParser.PathDataNode[] pathDataNodeArrCreateNodesFromPathData2 = PathParser.createNodesFromPathData(string2);
            if (pathDataNodeArrCreateNodesFromPathData == null && pathDataNodeArrCreateNodesFromPathData2 == null) {
                return null;
            }
            if (pathDataNodeArrCreateNodesFromPathData == null) {
                if (pathDataNodeArrCreateNodesFromPathData2 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), pathDataNodeArrCreateNodesFromPathData2);
                }
                return null;
            }
            a aVar = new a();
            if (pathDataNodeArrCreateNodesFromPathData2 == null) {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, pathDataNodeArrCreateNodesFromPathData);
            } else {
                if (!PathParser.canMorph(pathDataNodeArrCreateNodesFromPathData, pathDataNodeArrCreateNodesFromPathData2)) {
                    throw new InflateException(c.a(" Can't morph from ", string, " to ", string2));
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, pathDataNodeArrCreateNodesFromPathData, pathDataNodeArrCreateNodesFromPathData2);
            }
            return propertyValuesHolderOfObject;
        }
        ArgbEvaluator argbEvaluator = i10 == 3 ? ArgbEvaluator.getInstance() : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z10) {
            if (i13 == 5) {
                color2 = (int) typedArray.getDimension(i11, 0.0f);
            } else {
                color2 = c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i14 == 5) {
                    color3 = (int) typedArray.getDimension(i12, 0.0f);
                } else {
                    color3 = c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z11) {
            if (i14 == 5) {
                color = (int) typedArray.getDimension(i12, 0.0f);
            } else {
                color = c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || argbEvaluator == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(argbEvaluator);
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, float f6, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23838g);
        TypedArray typedArrayObtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23842k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlResourceParser, TypedValues.TransitionType.S_DURATION, 1, 300);
        int i10 = 0;
        long namedInt2 = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlResourceParser, "startOffset", 2, 0);
        int namedInt3 = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlResourceParser, "valueType", 7, 4);
        if (TypedArrayUtils.hasAttribute(xmlResourceParser, "valueFrom") && TypedArrayUtils.hasAttribute(xmlResourceParser, "valueTo")) {
            if (namedInt3 == 4) {
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(5);
                boolean z10 = typedValuePeekValue != null;
                int i11 = z10 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayObtainAttributes.peekValue(6);
                boolean z11 = typedValuePeekValue2 != null;
                namedInt3 = ((z10 && c(i11)) || (z11 && c(z11 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayObtainAttributes, namedInt3, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(namedInt);
        valueAnimator3.setStartDelay(namedInt2);
        valueAnimator3.setRepeatCount(TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator3.setRepeatMode(TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlResourceParser, "repeatMode", 4, 1));
        if (typedArrayObtainAttributes2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String namedString = TypedArrayUtils.getNamedString(typedArrayObtainAttributes2, xmlResourceParser, "pathData", 1);
            if (namedString != null) {
                String namedString2 = TypedArrayUtils.getNamedString(typedArrayObtainAttributes2, xmlResourceParser, "propertyXName", 2);
                String namedString3 = TypedArrayUtils.getNamedString(typedArrayObtainAttributes2, xmlResourceParser, "propertyYName", 3);
                if (namedString2 == null && namedString3 == null) {
                    throw new InflateException(typedArrayObtainAttributes2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathCreatePathFromPathData = PathParser.createPathFromPathData(namedString);
                float f10 = 0.5f * f6;
                PathMeasure pathMeasure = new PathMeasure(pathCreatePathFromPathData, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathCreatePathFromPathData, false);
                int iMin = Math.min(100, ((int) (length / f10)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f11 = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                typedArray = typedArrayObtainAttributes;
                int i12 = 0;
                float f12 = 0.0f;
                while (true) {
                    if (i10 >= iMin) {
                        break;
                    }
                    int i13 = iMin;
                    pathMeasure2.getPosTan(f12 - ((Float) arrayList.get(i12)).floatValue(), fArr3, null);
                    fArr[i10] = fArr3[0];
                    fArr2[i10] = fArr3[1];
                    f12 += f11;
                    int i14 = i12 + 1;
                    if (i14 < arrayList.size() && f12 > ((Float) arrayList.get(i14)).floatValue()) {
                        pathMeasure2.nextContour();
                        i12 = i14;
                    }
                    i10++;
                    iMin = i13;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = namedString2 != null ? PropertyValuesHolder.ofFloat(namedString2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = namedString3 != null ? PropertyValuesHolder.ofFloat(namedString3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    i10 = 0;
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else {
                    i10 = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayObtainAttributes;
                objectAnimator2.setPropertyName(TypedArrayUtils.getNamedString(typedArrayObtainAttributes2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = typedArrayObtainAttributes;
        }
        TypedArray typedArray2 = typedArray;
        int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArray2, xmlResourceParser, "interpolator", i10, i10);
        if (namedResourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayObtainAttributes2 != null) {
            typedArrayObtainAttributes2.recycle();
        }
        return valueAnimator2;
    }

    public static Animator loadAnimator(Context context, @AnimatorRes int i10) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i10) : loadAnimator(context, context.getResources(), context.getTheme(), i10);
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i10) throws Resources.NotFoundException {
        return loadAnimator(context, resources, theme, i10, 1.0f);
    }

    public static Animator loadAnimator(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i10, float f6) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i10);
                    Animator animatorA = a(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0, f6);
                    animation.close();
                    return animatorA;
                } catch (XmlPullParserException e5) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                    notFoundException.initCause(e5);
                    throw notFoundException;
                }
            } catch (IOException e7) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e7);
                throw notFoundException2;
            }
        } catch (Throwable th2) {
            if (animation != null) {
                animation.close();
            }
            throw th2;
        }
    }
}
