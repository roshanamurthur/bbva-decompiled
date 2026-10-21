package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShaderBrushSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "Landroidx/compose/ui/graphics/ShaderBrush;", "p0", "Landroidx/compose/ui/graphics/ShaderBrush;", "getShaderBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", "shaderBrush", "", "q0", "F", "getAlpha", "()F", "alpha", "Landroidx/compose/ui/geometry/Size;", "r0", "J", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "size", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;F)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,57:1\n159#2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:58\n*E\n"})
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ShaderBrush shaderBrush;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final float alpha;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public long size;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public Pair<Size, ? extends Shader> f18216s0;

    public ShaderBrushSpan(@NotNull ShaderBrush shaderBrush, float f6) {
        Intrinsics.checkNotNullParameter(shaderBrush, "shaderBrush");
        this.shaderBrush = shaderBrush;
        this.alpha = f6;
        this.size = Size.INSTANCE.m2352getUnspecifiedNHjbRc();
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m4196setSizeuvyYCjk(long j10) {
        this.size = j10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        if (this.size == Size.INSTANCE.m2352getUnspecifiedNHjbRc()) {
            return;
        }
        Pair<Size, ? extends Shader> pair = this.f18216s0;
        Shader shaderMo2483createShaderuvyYCjk = (pair == null || !Size.m2340equalsimpl0(pair.getFirst().getF15551a(), this.size)) ? this.shaderBrush.mo2483createShaderuvyYCjk(this.size) : pair.getSecond();
        textPaint.setShader(shaderMo2483createShaderuvyYCjk);
        this.f18216s0 = TuplesKt.to(Size.m2332boximpl(this.size), shaderMo2483createShaderuvyYCjk);
    }
}
