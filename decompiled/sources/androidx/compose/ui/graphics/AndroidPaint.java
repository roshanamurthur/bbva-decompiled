package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010H\u001a\u00020\u0002¢\u0006\u0004\bI\u0010JB\t\b\u0016¢\u0006\u0004\bI\u0010KJ\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016R.\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R-\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR-\u0010$\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u001f8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R-\u0010(\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020%8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R$\u0010+\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R-\u0010/\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020,8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b-\u0010!\"\u0004\b.\u0010#R-\u00103\u001a\u0002002\u0006\u0010\u0006\u001a\u0002008V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R$\u00106\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0010\"\u0004\b5\u0010\u0012R-\u0010:\u001a\u0002072\u0006\u0010\u0006\u001a\u0002078V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R4\u0010A\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<2\u000e\u0010\u0006\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010G\u001a\u0004\u0018\u00010B2\b\u0010\u0006\u001a\u0004\u0018\u00010B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPaint;", "Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "asFrameworkPaint", "Landroidx/compose/ui/graphics/PathEffect;", "value", "e", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "setPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;)V", "pathEffect", "", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "", "isAntiAlias", "()Z", "setAntiAlias", "(Z)V", "Landroidx/compose/ui/graphics/Color;", "color", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/PaintingStyle;", "getStyle-TiuSbCo", "setStyle-k9PVt8s", "style", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getStrokeCap-KaPHkGw", "setStrokeCap-BeK7IIE", "strokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeJoin-LxFBmk8", "setStrokeJoin-Ww9F2mQ", "strokeJoin", "getStrokeMiterLimit", "setStrokeMiterLimit", "strokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I", "setFilterQuality-vDHp3xo", "filterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "getShader", "()Landroid/graphics/Shader;", "setShader", "(Landroid/graphics/Shader;)V", "shader", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidPaint implements Paint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final android.graphics.Paint f15557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Shader f15559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ColorFilter f15560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public PathEffect pathEffect;

    public AndroidPaint(@NotNull android.graphics.Paint internalPaint) {
        Intrinsics.checkNotNullParameter(internalPaint, "internalPaint");
        this.f15557a = internalPaint;
        this.f15558b = BlendMode.INSTANCE.m2459getSrcOver0nO6VwU();
    }

    @Override // androidx.compose.ui.graphics.Paint
    @NotNull
    /* JADX INFO: renamed from: asFrameworkPaint, reason: from getter */
    public android.graphics.Paint getF15557a() {
        return this.f15557a;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.f15557a);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public int getF15558b() {
        return this.f15558b;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo2390getColor0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.f15557a);
    }

    @Override // androidx.compose.ui.graphics.Paint
    @Nullable
    /* JADX INFO: renamed from: getColorFilter, reason: from getter */
    public ColorFilter getF15560d() {
        return this.f15560d;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I, reason: not valid java name */
    public int mo2391getFilterQualityfv9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.f15557a);
    }

    @Override // androidx.compose.ui.graphics.Paint
    @Nullable
    public PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    @Nullable
    /* JADX INFO: renamed from: getShader, reason: from getter */
    public Shader getF15559c() {
        return this.f15559c;
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getStrokeCap-KaPHkGw, reason: not valid java name */
    public int mo2392getStrokeCapKaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.f15557a);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getStrokeJoin-LxFBmk8, reason: not valid java name */
    public int mo2393getStrokeJoinLxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.f15557a);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.f15557a);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.f15557a);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: getStyle-TiuSbCo, reason: not valid java name */
    public int mo2394getStyleTiuSbCo() {
        return AndroidPaint_androidKt.getNativeStyle(this.f15557a);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public boolean isAntiAlias() {
        return AndroidPaint_androidKt.getNativeAntiAlias(this.f15557a);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setAlpha(float f6) {
        AndroidPaint_androidKt.setNativeAlpha(this.f15557a, f6);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setAntiAlias(boolean z10) {
        AndroidPaint_androidKt.setNativeAntiAlias(this.f15557a, z10);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public void mo2395setBlendModes9anfk8(int i10) {
        if (BlendMode.m2428equalsimpl0(this.f15558b, i10)) {
            return;
        }
        this.f15558b = i10;
        AndroidPaint_androidKt.m2401setNativeBlendModeGB0RdKg(this.f15557a, i10);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public void mo2396setColor8_81llA(long j10) {
        AndroidPaint_androidKt.m2402setNativeColor4WTKRHQ(this.f15557a, j10);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f15560d = colorFilter;
        AndroidPaint_androidKt.setNativeColorFilter(this.f15557a, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo, reason: not valid java name */
    public void mo2397setFilterQualityvDHp3xo(int i10) {
        AndroidPaint_androidKt.m2403setNativeFilterQuality50PEsBU(this.f15557a, i10);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setPathEffect(@Nullable PathEffect pathEffect) {
        AndroidPaint_androidKt.setNativePathEffect(this.f15557a, pathEffect);
        this.pathEffect = pathEffect;
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setShader(@Nullable Shader shader) {
        this.f15559c = shader;
        AndroidPaint_androidKt.setNativeShader(this.f15557a, shader);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setStrokeCap-BeK7IIE, reason: not valid java name */
    public void mo2398setStrokeCapBeK7IIE(int i10) {
        AndroidPaint_androidKt.m2404setNativeStrokeCapCSYIeUk(this.f15557a, i10);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setStrokeJoin-Ww9F2mQ, reason: not valid java name */
    public void mo2399setStrokeJoinWw9F2mQ(int i10) {
        AndroidPaint_androidKt.m2405setNativeStrokeJoinkLtJ_vA(this.f15557a, i10);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setStrokeMiterLimit(float f6) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.f15557a, f6);
    }

    @Override // androidx.compose.ui.graphics.Paint
    public void setStrokeWidth(float f6) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.f15557a, f6);
    }

    @Override // androidx.compose.ui.graphics.Paint
    /* JADX INFO: renamed from: setStyle-k9PVt8s, reason: not valid java name */
    public void mo2400setStylek9PVt8s(int i10) {
        AndroidPaint_androidKt.m2406setNativeStyle5YerkU(this.f15557a, i10);
    }

    public AndroidPaint() {
        this(AndroidPaint_androidKt.makeNativePaint());
    }
}
