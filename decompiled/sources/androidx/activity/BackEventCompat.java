package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BackEventCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB+\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Landroidx/activity/BackEventCompat;", "", "Landroid/window/BackEvent;", "toBackEvent", "", "toString", "", "a", "F", "getTouchX", "()F", "touchX", "b", "getTouchY", "touchY", "c", "getProgress", "progress", "", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSwipeEdge", "()I", "swipeEdge", "<init>", "(FFFI)V", "backEvent", "(Landroid/window/BackEvent;)V", "Companion", "SwipeEdge", "activity_release"}, k = 1, mv = {1, 8, 0})
public final class BackEventCompat {
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float touchX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float touchY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float progress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int swipeEdge;

    /* JADX INFO: compiled from: BackEventCompat.kt */
    @Target({ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/BackEventCompat$SwipeEdge;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface SwipeEdge {
    }

    @VisibleForTesting
    public BackEventCompat(float f6, float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, int i10) {
        this.touchX = f6;
        this.touchY = f10;
        this.progress = f11;
        this.swipeEdge = i10;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    public final float getTouchX() {
        return this.touchX;
    }

    public final float getTouchY() {
        return this.touchY;
    }

    @RequiresApi(34)
    @NotNull
    public final BackEvent toBackEvent() {
        if (Build.VERSION.SDK_INT < 34) {
            throw new UnsupportedOperationException("This method is only supported on API level 34+");
        }
        return Api34Impl.INSTANCE.createOnBackEvent(this.touchX, this.touchY, this.progress, this.swipeEdge);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.touchX);
        sb2.append(", touchY=");
        sb2.append(this.touchY);
        sb2.append(", progress=");
        sb2.append(this.progress);
        sb2.append(", swipeEdge=");
        return a.d(sb2, this.swipeEdge, AbstractJsonLexerKt.END_OBJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @RequiresApi(34)
    public BackEventCompat(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Api34Impl api34Impl = Api34Impl.INSTANCE;
        this(api34Impl.touchX(backEvent), api34Impl.touchY(backEvent), api34Impl.progress(backEvent), api34Impl.swipeEdge(backEvent));
    }
}
