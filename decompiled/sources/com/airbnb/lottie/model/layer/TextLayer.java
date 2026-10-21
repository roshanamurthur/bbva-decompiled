package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.TextDelegate;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTextRangeSelector;
import com.airbnb.lottie.model.animatable.AnimatableTextStyle;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TextLayer extends BaseLayer {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final a G;
    public final b H;
    public final HashMap I;
    public final LongSparseArray<String> J;
    public final ArrayList K;
    public final TextKeyframeAnimation L;
    public final LottieDrawable M;
    public final LottieComposition N;
    public final TextRangeUnits O;

    @Nullable
    public final BaseKeyframeAnimation<Integer, Integer> P;

    @Nullable
    public ValueCallbackKeyframeAnimation Q;

    @Nullable
    public final BaseKeyframeAnimation<Integer, Integer> R;

    @Nullable
    public ValueCallbackKeyframeAnimation S;

    @Nullable
    public final FloatKeyframeAnimation T;

    @Nullable
    public ValueCallbackKeyframeAnimation U;

    @Nullable
    public final FloatKeyframeAnimation V;

    @Nullable
    public ValueCallbackKeyframeAnimation W;

    @Nullable
    public final BaseKeyframeAnimation<Integer, Integer> X;

    @Nullable
    public ValueCallbackKeyframeAnimation Y;

    @Nullable
    public ValueCallbackKeyframeAnimation Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public final BaseKeyframeAnimation<Integer, Integer> f26124a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @Nullable
    public final BaseKeyframeAnimation<Integer, Integer> f26125b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    public final BaseKeyframeAnimation<Integer, Integer> f26126c0;

    public class a extends Paint {
    }

    public class b extends Paint {
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26127a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f26127a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26127a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26127a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f26128a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f26129b = 0.0f;
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        AnimatableTextRangeSelector animatableTextRangeSelector;
        AnimatableTextRangeSelector animatableTextRangeSelector2;
        AnimatableIntegerValue animatableIntegerValue;
        AnimatableTextRangeSelector animatableTextRangeSelector3;
        AnimatableIntegerValue animatableIntegerValue2;
        AnimatableTextRangeSelector animatableTextRangeSelector4;
        AnimatableIntegerValue animatableIntegerValue3;
        AnimatableTextStyle animatableTextStyle;
        AnimatableIntegerValue animatableIntegerValue4;
        AnimatableTextStyle animatableTextStyle2;
        AnimatableFloatValue animatableFloatValue;
        AnimatableTextStyle animatableTextStyle3;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableTextStyle animatableTextStyle4;
        AnimatableColorValue animatableColorValue;
        AnimatableTextStyle animatableTextStyle5;
        AnimatableColorValue animatableColorValue2;
        super(lottieDrawable, layer);
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        a aVar = new a(1);
        aVar.setStyle(Paint.Style.FILL);
        this.G = aVar;
        b bVar = new b(1);
        bVar.setStyle(Paint.Style.STROKE);
        this.H = bVar;
        this.I = new HashMap();
        this.J = new LongSparseArray<>();
        this.K = new ArrayList();
        this.O = TextRangeUnits.INDEX;
        this.M = lottieDrawable;
        this.N = layer.f26101b;
        TextKeyframeAnimation textKeyframeAnimationCreateAnimation = layer.f26115q.createAnimation();
        this.L = textKeyframeAnimationCreateAnimation;
        textKeyframeAnimationCreateAnimation.addUpdateListener(this);
        addAnimation(textKeyframeAnimationCreateAnimation);
        AnimatableTextProperties animatableTextProperties = layer.f26116r;
        if (animatableTextProperties != null && (animatableTextStyle5 = animatableTextProperties.textStyle) != null && (animatableColorValue2 = animatableTextStyle5.color) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = animatableColorValue2.createAnimation();
            this.P = baseKeyframeAnimationCreateAnimation;
            baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
            addAnimation(baseKeyframeAnimationCreateAnimation);
        }
        if (animatableTextProperties != null && (animatableTextStyle4 = animatableTextProperties.textStyle) != null && (animatableColorValue = animatableTextStyle4.stroke) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation2 = animatableColorValue.createAnimation();
            this.R = baseKeyframeAnimationCreateAnimation2;
            baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
            addAnimation(baseKeyframeAnimationCreateAnimation2);
        }
        if (animatableTextProperties != null && (animatableTextStyle3 = animatableTextProperties.textStyle) != null && (animatableFloatValue2 = animatableTextStyle3.strokeWidth) != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = animatableFloatValue2.createAnimation();
            this.T = floatKeyframeAnimationCreateAnimation;
            floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
            addAnimation(floatKeyframeAnimationCreateAnimation);
        }
        if (animatableTextProperties != null && (animatableTextStyle2 = animatableTextProperties.textStyle) != null && (animatableFloatValue = animatableTextStyle2.tracking) != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation2 = animatableFloatValue.createAnimation();
            this.V = floatKeyframeAnimationCreateAnimation2;
            floatKeyframeAnimationCreateAnimation2.addUpdateListener(this);
            addAnimation(floatKeyframeAnimationCreateAnimation2);
        }
        if (animatableTextProperties != null && (animatableTextStyle = animatableTextProperties.textStyle) != null && (animatableIntegerValue4 = animatableTextStyle.opacity) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation3 = animatableIntegerValue4.createAnimation();
            this.X = baseKeyframeAnimationCreateAnimation3;
            baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
            addAnimation(baseKeyframeAnimationCreateAnimation3);
        }
        if (animatableTextProperties != null && (animatableTextRangeSelector4 = animatableTextProperties.rangeSelector) != null && (animatableIntegerValue3 = animatableTextRangeSelector4.start) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation4 = animatableIntegerValue3.createAnimation();
            this.f26124a0 = baseKeyframeAnimationCreateAnimation4;
            baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
            addAnimation(baseKeyframeAnimationCreateAnimation4);
        }
        if (animatableTextProperties != null && (animatableTextRangeSelector3 = animatableTextProperties.rangeSelector) != null && (animatableIntegerValue2 = animatableTextRangeSelector3.end) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation5 = animatableIntegerValue2.createAnimation();
            this.f26125b0 = baseKeyframeAnimationCreateAnimation5;
            baseKeyframeAnimationCreateAnimation5.addUpdateListener(this);
            addAnimation(baseKeyframeAnimationCreateAnimation5);
        }
        if (animatableTextProperties != null && (animatableTextRangeSelector2 = animatableTextProperties.rangeSelector) != null && (animatableIntegerValue = animatableTextRangeSelector2.offset) != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation6 = animatableIntegerValue.createAnimation();
            this.f26126c0 = baseKeyframeAnimationCreateAnimation6;
            baseKeyframeAnimationCreateAnimation6.addUpdateListener(this);
            addAnimation(baseKeyframeAnimationCreateAnimation6);
        }
        if (animatableTextProperties == null || (animatableTextRangeSelector = animatableTextProperties.rangeSelector) == null) {
            return;
        }
        this.O = animatableTextRangeSelector.units;
    }

    public static void e(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void f(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t10, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t10, lottieValueCallback);
        if (t10 == LottieProperty.COLOR) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.Q;
            if (valueCallbackKeyframeAnimation != null) {
                removeAnimation(valueCallbackKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.Q = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.Q = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            addAnimation(this.Q);
            return;
        }
        if (t10 == LottieProperty.STROKE_COLOR) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = this.S;
            if (valueCallbackKeyframeAnimation3 != null) {
                removeAnimation(valueCallbackKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.S = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.S = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            addAnimation(this.S);
            return;
        }
        if (t10 == LottieProperty.STROKE_WIDTH) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = this.U;
            if (valueCallbackKeyframeAnimation5 != null) {
                removeAnimation(valueCallbackKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.U = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.U = valueCallbackKeyframeAnimation6;
            valueCallbackKeyframeAnimation6.addUpdateListener(this);
            addAnimation(this.U);
            return;
        }
        if (t10 == LottieProperty.TEXT_TRACKING) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation7 = this.W;
            if (valueCallbackKeyframeAnimation7 != null) {
                removeAnimation(valueCallbackKeyframeAnimation7);
            }
            if (lottieValueCallback == null) {
                this.W = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation8 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.W = valueCallbackKeyframeAnimation8;
            valueCallbackKeyframeAnimation8.addUpdateListener(this);
            addAnimation(this.W);
            return;
        }
        if (t10 == LottieProperty.TEXT_SIZE) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation9 = this.Y;
            if (valueCallbackKeyframeAnimation9 != null) {
                removeAnimation(valueCallbackKeyframeAnimation9);
            }
            if (lottieValueCallback == null) {
                this.Y = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation10 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.Y = valueCallbackKeyframeAnimation10;
            valueCallbackKeyframeAnimation10.addUpdateListener(this);
            addAnimation(this.Y);
            return;
        }
        if (t10 != LottieProperty.TYPEFACE) {
            if (t10 == LottieProperty.TEXT) {
                this.L.setStringValueCallback(lottieValueCallback);
                return;
            }
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation11 = this.Z;
        if (valueCallbackKeyframeAnimation11 != null) {
            removeAnimation(valueCallbackKeyframeAnimation11);
        }
        if (lottieValueCallback == null) {
            this.Z = null;
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation12 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
        this.Z = valueCallbackKeyframeAnimation12;
        valueCallbackKeyframeAnimation12.addUpdateListener(this);
        addAnimation(this.Z);
    }

    public final void d(DocumentData documentData, int i10, int i11) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.Q;
        a aVar = this.G;
        if (valueCallbackKeyframeAnimation != null) {
            aVar.setColor(((Integer) valueCallbackKeyframeAnimation.getValue()).intValue());
        } else {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.P;
            if (baseKeyframeAnimation == null || !h(i11)) {
                aVar.setColor(documentData.color);
            } else {
                aVar.setColor(baseKeyframeAnimation.getValue().intValue());
            }
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.S;
        b bVar = this.H;
        if (valueCallbackKeyframeAnimation2 != null) {
            bVar.setColor(((Integer) valueCallbackKeyframeAnimation2.getValue()).intValue());
        } else {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.R;
            if (baseKeyframeAnimation2 == null || !h(i11)) {
                bVar.setColor(documentData.strokeColor);
            } else {
                bVar.setColor(baseKeyframeAnimation2.getValue().intValue());
            }
        }
        int iIntValue = 100;
        int iIntValue2 = this.transform.getOpacity() == null ? 100 : this.transform.getOpacity().getValue().intValue();
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation3 = this.X;
        if (baseKeyframeAnimation3 != null && h(i11)) {
            iIntValue = baseKeyframeAnimation3.getValue().intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i10) / 255.0f);
        aVar.setAlpha(iRound);
        bVar.setAlpha(iRound);
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = this.U;
        if (valueCallbackKeyframeAnimation3 != null) {
            bVar.setStrokeWidth(((Float) valueCallbackKeyframeAnimation3.getValue()).floatValue());
            return;
        }
        FloatKeyframeAnimation floatKeyframeAnimation = this.T;
        if (floatKeyframeAnimation == null || !h(i11)) {
            bVar.setStrokeWidth(Utils.dpScale() * documentData.strokeWidth);
        } else {
            bVar.setStrokeWidth(floatKeyframeAnimation.getValue().floatValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x032f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0338  */
    /* JADX WARN: Code duplicated, block: B:114:0x0343 A[LOOP:9: B:113:0x0341->B:114:0x0343, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0366  */
    /* JADX WARN: Code duplicated, block: B:119:0x036d  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x038d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00df  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:34:0x0106  */
    /* JADX WARN: Code duplicated, block: B:35:0x010e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0119  */
    /* JADX WARN: Code duplicated, block: B:38:0x0124  */
    /* JADX WARN: Code duplicated, block: B:40:0x0138 A[LOOP:4: B:39:0x0136->B:40:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x015e  */
    /* JADX WARN: Code duplicated, block: B:47:0x018e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0195  */
    /* JADX WARN: Code duplicated, block: B:80:0x0286  */
    /* JADX WARN: Code duplicated, block: B:82:0x0291  */
    /* JADX WARN: Code duplicated, block: B:83:0x0293  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:89:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:95:0x02de  */
    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public final void drawLayer(Canvas canvas, Matrix matrix, int i10) {
        Typeface typeface;
        float fFloatValue;
        float fDpScale;
        List listAsList;
        int size;
        int i11;
        int i12;
        int length;
        PointF pointF;
        float f6;
        List<d> listJ;
        int i13;
        d dVar;
        int i14;
        String str;
        int length2;
        int iCodePointAt;
        int iCharCount;
        List list;
        Font font;
        long j10;
        LongSparseArray<String> longSparseArray;
        StringBuilder sb2;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        float fFloatValue2;
        float f10;
        int i15;
        PointF pointF2;
        float f11;
        float f12;
        b bVar;
        List<d> listJ2;
        int i16;
        d dVar2;
        int i17;
        String str2;
        int i18;
        FontCharacter fontCharacter;
        HashMap map;
        List<ShapeGroup> shapes;
        int size2;
        ArrayList arrayList;
        int i19;
        List list2;
        int i20;
        float f13;
        Path path;
        int i21 = i10;
        DocumentData value = this.L.getValue();
        LottieComposition lottieComposition = this.N;
        Font font2 = lottieComposition.getFonts().get(value.fontName);
        if (font2 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        d(value, i21, 0);
        LottieDrawable lottieDrawable = this.M;
        boolean zUseTextGlyphs = lottieDrawable.useTextGlyphs();
        FloatKeyframeAnimation floatKeyframeAnimation = this.V;
        a aVar = this.G;
        b bVar2 = this.H;
        int i22 = -1;
        if (zUseTextGlyphs) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.Y;
            float fFloatValue3 = (valueCallbackKeyframeAnimation != null ? ((Float) valueCallbackKeyframeAnimation.getValue()).floatValue() : value.size) / 100.0f;
            Utils.getScale(matrix);
            List listAsList2 = Arrays.asList(value.text.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(RootService.LINE_BREAK, "\r").split("\r"));
            int size3 = listAsList2.size();
            float f14 = value.tracking / 10.0f;
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.W;
            if (valueCallbackKeyframeAnimation2 != null) {
                fFloatValue2 = ((Float) valueCallbackKeyframeAnimation2.getValue()).floatValue();
            } else {
                if (floatKeyframeAnimation != null) {
                    fFloatValue2 = floatKeyframeAnimation.getValue().floatValue();
                }
                f10 = f14;
                i15 = 0;
                while (i15 < size3) {
                    String str3 = (String) listAsList2.get(i15);
                    pointF2 = value.boxSize;
                    if (pointF2 == null) {
                        f11 = 0.0f;
                    } else {
                        f11 = pointF2.x;
                    }
                    f12 = fFloatValue3;
                    int i23 = i15;
                    int i24 = size3;
                    List list3 = listAsList2;
                    bVar = bVar2;
                    listJ2 = j(str3, f11, font2, f12, f10, true);
                    i16 = 0;
                    while (i16 < listJ2.size()) {
                        dVar2 = listJ2.get(i16);
                        i17 = i22 + 1;
                        canvas.save();
                        if (i(canvas, value, i17, dVar2.f26129b)) {
                            str2 = dVar2.f26128a;
                            i18 = 0;
                            while (i18 < str2.length()) {
                                List<d> list4 = listJ2;
                                fontCharacter = lottieComposition.getCharacters().get(FontCharacter.hashFor(str2.charAt(i18), font2.getFamily(), font2.getStyle()));
                                if (fontCharacter == null) {
                                    f13 = f12;
                                    str2 = str2;
                                    i17 = i17;
                                } else {
                                    d(value, i21, i18);
                                    map = this.I;
                                    if (map.containsKey(fontCharacter)) {
                                        list2 = (List) map.get(fontCharacter);
                                    } else {
                                        shapes = fontCharacter.getShapes();
                                        size2 = shapes.size();
                                        arrayList = new ArrayList(size2);
                                        i19 = 0;
                                        while (i19 < size2) {
                                            arrayList.add(new ContentGroup(lottieDrawable, this, shapes.get(i19), lottieComposition));
                                            i19++;
                                            shapes = shapes;
                                            size2 = size2;
                                        }
                                        map.put(fontCharacter, arrayList);
                                        list2 = arrayList;
                                    }
                                    i20 = 0;
                                    while (i20 < list2.size()) {
                                        path = ((ContentGroup) list2.get(i20)).getPath();
                                        path.computeBounds(this.E, false);
                                        Matrix matrix2 = this.F;
                                        matrix2.reset();
                                        List list5 = list2;
                                        matrix2.preTranslate(0.0f, (-value.baselineShift) * Utils.dpScale());
                                        float f15 = f12;
                                        matrix2.preScale(f15, f15);
                                        path.transform(matrix2);
                                        if (value.strokeOverFill) {
                                            f(path, aVar, canvas);
                                            f(path, bVar, canvas);
                                        } else {
                                            f(path, bVar, canvas);
                                            f(path, aVar, canvas);
                                        }
                                        i20++;
                                        f12 = f15;
                                        list2 = list5;
                                    }
                                    f13 = f12;
                                    canvas.translate((Utils.dpScale() * ((float) fontCharacter.getWidth()) * f13) + f10, 0.0f);
                                }
                                i18++;
                                i21 = i10;
                                f12 = f13;
                                str2 = str2;
                                listJ2 = list4;
                                i17 = i17;
                            }
                        }
                        canvas.restore();
                        i16++;
                        i21 = i10;
                        f12 = f12;
                        listJ2 = listJ2;
                        i22 = i17;
                    }
                    i15 = i23 + 1;
                    i21 = i10;
                    fFloatValue3 = f12;
                    bVar2 = bVar;
                    size3 = i24;
                    listAsList2 = list3;
                }
            }
            f14 += fFloatValue2;
            f10 = f14;
            i15 = 0;
            while (i15 < size3) {
                String str4 = (String) listAsList2.get(i15);
                pointF2 = value.boxSize;
                if (pointF2 == null) {
                    f11 = 0.0f;
                } else {
                    f11 = pointF2.x;
                }
                f12 = fFloatValue3;
                int i25 = i15;
                int i26 = size3;
                List list6 = listAsList2;
                bVar = bVar2;
                listJ2 = j(str4, f11, font2, f12, f10, true);
                i16 = 0;
                while (i16 < listJ2.size()) {
                    dVar2 = listJ2.get(i16);
                    i17 = i22 + 1;
                    canvas.save();
                    if (i(canvas, value, i17, dVar2.f26129b)) {
                        str2 = dVar2.f26128a;
                        i18 = 0;
                        while (i18 < str2.length()) {
                            List<d> list7 = listJ2;
                            fontCharacter = lottieComposition.getCharacters().get(FontCharacter.hashFor(str2.charAt(i18), font2.getFamily(), font2.getStyle()));
                            if (fontCharacter == null) {
                                f13 = f12;
                                str2 = str2;
                                i17 = i17;
                            } else {
                                d(value, i21, i18);
                                map = this.I;
                                if (map.containsKey(fontCharacter)) {
                                    list2 = (List) map.get(fontCharacter);
                                } else {
                                    shapes = fontCharacter.getShapes();
                                    size2 = shapes.size();
                                    arrayList = new ArrayList(size2);
                                    i19 = 0;
                                    while (i19 < size2) {
                                        arrayList.add(new ContentGroup(lottieDrawable, this, shapes.get(i19), lottieComposition));
                                        i19++;
                                        shapes = shapes;
                                        size2 = size2;
                                    }
                                    map.put(fontCharacter, arrayList);
                                    list2 = arrayList;
                                }
                                i20 = 0;
                                while (i20 < list2.size()) {
                                    path = ((ContentGroup) list2.get(i20)).getPath();
                                    path.computeBounds(this.E, false);
                                    Matrix matrix3 = this.F;
                                    matrix3.reset();
                                    List list8 = list2;
                                    matrix3.preTranslate(0.0f, (-value.baselineShift) * Utils.dpScale());
                                    float f16 = f12;
                                    matrix3.preScale(f16, f16);
                                    path.transform(matrix3);
                                    if (value.strokeOverFill) {
                                        f(path, aVar, canvas);
                                        f(path, bVar, canvas);
                                    } else {
                                        f(path, bVar, canvas);
                                        f(path, aVar, canvas);
                                    }
                                    i20++;
                                    f12 = f16;
                                    list2 = list8;
                                }
                                f13 = f12;
                                canvas.translate((Utils.dpScale() * ((float) fontCharacter.getWidth()) * f13) + f10, 0.0f);
                            }
                            i18++;
                            i21 = i10;
                            f12 = f13;
                            str2 = str2;
                            listJ2 = list7;
                            i17 = i17;
                        }
                    }
                    canvas.restore();
                    i16++;
                    i21 = i10;
                    f12 = f12;
                    listJ2 = listJ2;
                    i22 = i17;
                }
                i15 = i25 + 1;
                i21 = i10;
                fFloatValue3 = f12;
                bVar2 = bVar;
                size3 = i26;
                listAsList2 = list6;
            }
        } else {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = this.Z;
            if ((valueCallbackKeyframeAnimation3 == null || (typeface = (Typeface) valueCallbackKeyframeAnimation3.getValue()) == null) && (typeface = lottieDrawable.getTypeface(font2)) == null) {
                typeface = font2.getTypeface();
            }
            if (typeface != null) {
                String textInternal = value.text;
                TextDelegate textDelegate = lottieDrawable.getTextDelegate();
                if (textDelegate != null) {
                    textInternal = textDelegate.getTextInternal(getName(), textInternal);
                }
                aVar.setTypeface(typeface);
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = this.Y;
                float fFloatValue4 = valueCallbackKeyframeAnimation4 != null ? ((Float) valueCallbackKeyframeAnimation4.getValue()).floatValue() : value.size;
                aVar.setTextSize(Utils.dpScale() * fFloatValue4);
                bVar2.setTypeface(aVar.getTypeface());
                bVar2.setTextSize(aVar.getTextSize());
                float f17 = value.tracking / 10.0f;
                ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = this.W;
                if (valueCallbackKeyframeAnimation5 != null) {
                    fFloatValue = ((Float) valueCallbackKeyframeAnimation5.getValue()).floatValue();
                } else {
                    if (floatKeyframeAnimation != null) {
                        fFloatValue = floatKeyframeAnimation.getValue().floatValue();
                    }
                    fDpScale = ((Utils.dpScale() * f17) * fFloatValue4) / 100.0f;
                    listAsList = Arrays.asList(textInternal.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(RootService.LINE_BREAK, "\r").split("\r"));
                    size = listAsList.size();
                    i11 = -1;
                    i12 = 0;
                    length = 0;
                    while (i12 < size) {
                        String str5 = (String) listAsList.get(i12);
                        pointF = value.boxSize;
                        if (pointF == null) {
                            f6 = 0.0f;
                        } else {
                            f6 = pointF.x;
                        }
                        int i27 = i12;
                        listJ = j(str5, f6, font2, 0.0f, fDpScale, false);
                        i13 = 0;
                        while (i13 < listJ.size()) {
                            dVar = listJ.get(i13);
                            i14 = i11 + 1;
                            canvas.save();
                            if (i(canvas, value, i14, dVar.f26129b)) {
                                str = dVar.f26128a;
                                length2 = 0;
                                while (length2 < str.length()) {
                                    iCodePointAt = str.codePointAt(length2);
                                    List<d> list9 = listJ;
                                    iCharCount = Character.charCount(iCodePointAt) + length2;
                                    int i28 = i14;
                                    while (true) {
                                        if (iCharCount < str.length()) {
                                            list = listAsList;
                                            font = font2;
                                            break;
                                        }
                                        iCodePointAt2 = str.codePointAt(iCharCount);
                                        list = listAsList;
                                        font = font2;
                                        if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                            break;
                                        }
                                        iCharCount += Character.charCount(iCodePointAt2);
                                        iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                        listAsList = list;
                                        font2 = font;
                                    }
                                    j10 = iCodePointAt;
                                    longSparseArray = this.J;
                                    if (longSparseArray.containsKey(j10)) {
                                        string = longSparseArray.get(j10);
                                    } else {
                                        sb2 = this.D;
                                        sb2.setLength(0);
                                        iCharCount2 = length2;
                                        while (iCharCount2 < iCharCount) {
                                            int i29 = iCharCount;
                                            int iCodePointAt3 = str.codePointAt(iCharCount2);
                                            sb2.appendCodePoint(iCodePointAt3);
                                            iCharCount2 += Character.charCount(iCodePointAt3);
                                            iCharCount = i29;
                                        }
                                        string = sb2.toString();
                                        longSparseArray.put(j10, string);
                                    }
                                    d(value, i10, length + length2);
                                    if (value.strokeOverFill) {
                                        e(string, aVar, canvas);
                                        e(string, bVar2, canvas);
                                    } else {
                                        e(string, bVar2, canvas);
                                        e(string, aVar, canvas);
                                    }
                                    canvas.translate(aVar.measureText(string) + fDpScale, 0.0f);
                                    length2 += string.length();
                                    listJ = list9;
                                    i14 = i28;
                                    listAsList = list;
                                    font2 = font;
                                    size = size;
                                }
                            }
                            i11 = i14;
                            length = dVar.f26128a.length() + length;
                            canvas.restore();
                            i13++;
                            listJ = listJ;
                            listAsList = listAsList;
                            font2 = font2;
                            size = size;
                        }
                        i12 = i27 + 1;
                        listAsList = listAsList;
                    }
                }
                f17 += fFloatValue;
                fDpScale = ((Utils.dpScale() * f17) * fFloatValue4) / 100.0f;
                listAsList = Arrays.asList(textInternal.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(RootService.LINE_BREAK, "\r").split("\r"));
                size = listAsList.size();
                i11 = -1;
                i12 = 0;
                length = 0;
                while (i12 < size) {
                    String str6 = (String) listAsList.get(i12);
                    pointF = value.boxSize;
                    if (pointF == null) {
                        f6 = 0.0f;
                    } else {
                        f6 = pointF.x;
                    }
                    int i210 = i12;
                    listJ = j(str6, f6, font2, 0.0f, fDpScale, false);
                    i13 = 0;
                    while (i13 < listJ.size()) {
                        dVar = listJ.get(i13);
                        i14 = i11 + 1;
                        canvas.save();
                        if (i(canvas, value, i14, dVar.f26129b)) {
                            str = dVar.f26128a;
                            length2 = 0;
                            while (length2 < str.length()) {
                                iCodePointAt = str.codePointAt(length2);
                                List<d> list10 = listJ;
                                iCharCount = Character.charCount(iCodePointAt) + length2;
                                int i211 = i14;
                                while (true) {
                                    if (iCharCount < str.length()) {
                                        list = listAsList;
                                        font = font2;
                                        break;
                                    }
                                    iCodePointAt2 = str.codePointAt(iCharCount);
                                    list = listAsList;
                                    font = font2;
                                    if (Character.getType(iCodePointAt2) == 16) {
                                    }
                                    iCharCount += Character.charCount(iCodePointAt2);
                                    iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                    listAsList = list;
                                    font2 = font;
                                }
                                j10 = iCodePointAt;
                                longSparseArray = this.J;
                                if (longSparseArray.containsKey(j10)) {
                                    string = longSparseArray.get(j10);
                                } else {
                                    sb2 = this.D;
                                    sb2.setLength(0);
                                    iCharCount2 = length2;
                                    while (iCharCount2 < iCharCount) {
                                        int i212 = iCharCount;
                                        int iCodePointAt4 = str.codePointAt(iCharCount2);
                                        sb2.appendCodePoint(iCodePointAt4);
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                        iCharCount = i212;
                                    }
                                    string = sb2.toString();
                                    longSparseArray.put(j10, string);
                                }
                                d(value, i10, length + length2);
                                if (value.strokeOverFill) {
                                    e(string, aVar, canvas);
                                    e(string, bVar2, canvas);
                                } else {
                                    e(string, bVar2, canvas);
                                    e(string, aVar, canvas);
                                }
                                canvas.translate(aVar.measureText(string) + fDpScale, 0.0f);
                                length2 += string.length();
                                listJ = list10;
                                i14 = i211;
                                listAsList = list;
                                font2 = font;
                                size = size;
                            }
                        }
                        i11 = i14;
                        length = dVar.f26128a.length() + length;
                        canvas.restore();
                        i13++;
                        listJ = listJ;
                        listAsList = listAsList;
                        font2 = font2;
                        size = size;
                    }
                    i12 = i210 + 1;
                    listAsList = listAsList;
                }
            }
        }
        canvas.restore();
    }

    public final d g(int i10) {
        ArrayList arrayList = this.K;
        for (int size = arrayList.size(); size < i10; size++) {
            arrayList.add(new d());
        }
        return (d) arrayList.get(i10 - 1);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        super.getBounds(rectF, matrix, z10);
        LottieComposition lottieComposition = this.N;
        rectF.set(0.0f, 0.0f, lottieComposition.getBounds().width(), lottieComposition.getBounds().height());
    }

    public final boolean h(int i10) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation;
        int length = this.L.getValue().text.length();
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.f26124a0;
        if (baseKeyframeAnimation2 == null || (baseKeyframeAnimation = this.f26125b0) == null) {
            return true;
        }
        int iMin = Math.min(baseKeyframeAnimation2.getValue().intValue(), baseKeyframeAnimation.getValue().intValue());
        int iMax = Math.max(baseKeyframeAnimation2.getValue().intValue(), baseKeyframeAnimation.getValue().intValue());
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation3 = this.f26126c0;
        if (baseKeyframeAnimation3 != null) {
            int iIntValue = baseKeyframeAnimation3.getValue().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.O == TextRangeUnits.INDEX) {
            return i10 >= iMin && i10 < iMax;
        }
        float f6 = (i10 / length) * 100.0f;
        return f6 >= ((float) iMin) && f6 < ((float) iMax);
    }

    public final boolean i(Canvas canvas, DocumentData documentData, int i10, float f6) {
        PointF pointF = documentData.boxPosition;
        PointF pointF2 = documentData.boxSize;
        float fDpScale = Utils.dpScale();
        float f10 = (i10 * documentData.lineHeight * fDpScale) + (pointF == null ? 0.0f : (documentData.lineHeight * fDpScale) + pointF.y);
        if (this.M.getClipTextToBoundingBox() && pointF2 != null && pointF != null && f10 >= pointF.y + pointF2.y + documentData.size) {
            return false;
        }
        float f11 = pointF == null ? 0.0f : pointF.x;
        float f12 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.f26127a[documentData.justification.ordinal()];
        if (i11 == 1) {
            canvas.translate(f11, f10);
        } else if (i11 == 2) {
            canvas.translate((f11 + f12) - f6, f10);
        } else if (i11 == 3) {
            canvas.translate(((f12 / 2.0f) + f11) - (f6 / 2.0f), f10);
        }
        return true;
    }

    public final List<d> j(String str, float f6, Font font, float f10, float f11, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                FontCharacter fontCharacter = this.N.getCharacters().get(FontCharacter.hashFor(cCharAt, font.getFamily(), font.getStyle()));
                if (fontCharacter != null) {
                    fMeasureText = (Utils.dpScale() * ((float) fontCharacter.getWidth()) * f10) + f11;
                }
            } else {
                fMeasureText = this.G.measureText(str.substring(i13, i13 + 1)) + f11;
            }
            if (cCharAt == ' ') {
                z11 = true;
                f14 = fMeasureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f13 = fMeasureText;
            } else {
                f13 += fMeasureText;
            }
            f12 += fMeasureText;
            if (f6 > 0.0f && f12 >= f6 && cCharAt != ' ') {
                i10++;
                d dVarG = g(i10);
                if (i12 == i11) {
                    String strSubstring = str.substring(i11, i13);
                    String strTrim = strSubstring.trim();
                    float length = (f12 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f14);
                    dVarG.f26128a = strTrim;
                    dVarG.f26129b = length;
                    i11 = i13;
                    i12 = i11;
                    f12 = fMeasureText;
                    f13 = f12;
                } else {
                    String strSubstring2 = str.substring(i11, i12 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f12 - f13) - ((strSubstring2.length() - strTrim2.length()) * f14)) - f14;
                    dVarG.f26128a = strTrim2;
                    dVarG.f26129b = length2;
                    f12 = f13;
                    i11 = i12;
                }
            }
        }
        if (f12 > 0.0f) {
            i10++;
            d dVarG2 = g(i10);
            dVarG2.f26128a = str.substring(i11);
            dVarG2.f26129b = f12;
        }
        return this.K.subList(0, i10);
    }
}
