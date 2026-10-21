package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Adaptation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation;", "", "", "a", "[F", "getTransform$ui_graphics_release", "()[F", "transform", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public abstract class Adaptation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Adaptation$Companion$Bradford$1 f15759b = new Adaptation$Companion$Bradford$1(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Adaptation$Companion$VonKries$1 f15760c = new Adaptation$Companion$VonKries$1(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f}, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Adaptation$Companion$Ciecat02$1 f15761d = new Adaptation$Companion$Ciecat02$1(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f}, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final float[] transform;

    /* JADX INFO: compiled from: Adaptation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation$Companion;", "", "()V", "Bradford", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "getBradford", "()Landroidx/compose/ui/graphics/colorspace/Adaptation;", "Ciecat02", "getCiecat02", "VonKries", "getVonKries", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Adaptation getBradford() {
            return Adaptation.f15759b;
        }

        @NotNull
        public final Adaptation getCiecat02() {
            return Adaptation.f15761d;
        }

        @NotNull
        public final Adaptation getVonKries() {
            return Adaptation.f15760c;
        }
    }

    public Adaptation(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.transform = fArr;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }
}
