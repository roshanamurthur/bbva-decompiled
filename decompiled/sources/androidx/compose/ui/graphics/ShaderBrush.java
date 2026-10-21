package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\b\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n1#2:670\n*E\n"})
public abstract class ShaderBrush extends Brush {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Shader f15718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15719c;

    public ShaderBrush() {
        super(null);
        this.f15719c = Size.INSTANCE.m2352getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* JADX INFO: renamed from: applyTo-Pq9zytI */
    public final void mo2461applyToPq9zytI(long size, @NotNull Paint p4, float alpha) {
        Intrinsics.checkNotNullParameter(p4, "p");
        Shader shaderMo2483createShaderuvyYCjk = this.f15718b;
        if (shaderMo2483createShaderuvyYCjk == null || !Size.m2340equalsimpl0(this.f15719c, size)) {
            if (Size.m2346isEmptyimpl(size)) {
                shaderMo2483createShaderuvyYCjk = null;
                this.f15718b = null;
                this.f15719c = Size.INSTANCE.m2352getUnspecifiedNHjbRc();
            } else {
                shaderMo2483createShaderuvyYCjk = mo2483createShaderuvyYCjk(size);
                this.f15718b = shaderMo2483createShaderuvyYCjk;
                this.f15719c = size;
            }
        }
        long jMo2390getColor0d7_KjU = p4.mo2390getColor0d7_KjU();
        Color.Companion companion = Color.INSTANCE;
        if (!Color.m2509equalsimpl0(jMo2390getColor0d7_KjU, companion.m2534getBlack0d7_KjU())) {
            p4.mo2396setColor8_81llA(companion.m2534getBlack0d7_KjU());
        }
        if (!Intrinsics.areEqual(p4.getShader(), shaderMo2483createShaderuvyYCjk)) {
            p4.setShader(shaderMo2483createShaderuvyYCjk);
        }
        if (p4.getAlpha() == alpha) {
            return;
        }
        p4.setAlpha(alpha);
    }

    @NotNull
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public abstract Shader mo2483createShaderuvyYCjk(long size);
}
