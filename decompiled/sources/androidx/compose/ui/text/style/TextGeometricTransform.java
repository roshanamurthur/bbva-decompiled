package androidx.compose.ui.text.style;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextGeometricTransform.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform;", "", "", "scaleX", "skewX", "copy", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "F", "getScaleX", "()F", "b", "getSkewX", "<init>", "(FF)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextGeometricTransform {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TextGeometricTransform f18270c = new TextGeometricTransform(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float scaleX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float skewX;

    /* JADX WARN: Illegal instructions before constructor call */
    public TextGeometricTransform() {
        float f6 = 0.0f;
        this(f6, f6, 3, null);
    }

    public static /* synthetic */ TextGeometricTransform copy$default(TextGeometricTransform textGeometricTransform, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = textGeometricTransform.scaleX;
        }
        if ((i10 & 2) != 0) {
            f10 = textGeometricTransform.skewX;
        }
        return textGeometricTransform.copy(f6, f10);
    }

    @NotNull
    public final TextGeometricTransform copy(float scaleX, float skewX) {
        return new TextGeometricTransform(scaleX, skewX);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) other;
        return this.scaleX == textGeometricTransform.scaleX && this.skewX == textGeometricTransform.skewX;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.skewX) + (Float.floatToIntBits(this.scaleX) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.scaleX);
        sb2.append(", skewX=");
        return u.i(sb2, this.skewX, RootService.CLOSE_BRACKET);
    }

    public TextGeometricTransform(float f6, float f10) {
        this.scaleX = f6;
        this.skewX = f10;
    }

    public /* synthetic */ TextGeometricTransform(float f6, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f6, (i10 & 2) != 0 ? 0.0f : f10);
    }

    /* JADX INFO: compiled from: TextGeometricTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getNone$ui_text_release$annotations", "getNone$ui_text_release", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextGeometricTransform getNone$ui_text_release() {
            return TextGeometricTransform.f18270c;
        }

        @Stable
        public static /* synthetic */ void getNone$ui_text_release$annotations() {
        }
    }
}
