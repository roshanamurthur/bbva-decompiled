package com.bbva.document.scanner.presentation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.camera.core.impl.utils.c;
import androidx.core.view.ViewCompat;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FrameBackground.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u001d\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001eB%\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001a\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R/\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/bbva/document/scanner/presentation/view/FrameBackground;", "Landroid/view/View;", "Lcom/bbva/document/scanner/presentation/view/BoxProvider;", "boxProvider", "", "attachBoxProvider", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/graphics/Rect;", "<set-?>", "p0", "Lkotlin/properties/ReadWriteProperty;", "getClearBox", "()Landroid/graphics/Rect;", "setClearBox", "(Landroid/graphics/Rect;)V", "clearBox", "Landroid/graphics/Paint;", "q0", "Lkotlin/Lazy;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFrameBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameBackground.kt\ncom/bbva/document/scanner/presentation/view/FrameBackground\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,53:1\n33#2,3:54\n66#3,4:57\n38#3:61\n54#3:62\n73#3:63\n*S KotlinDebug\n*F\n+ 1 FrameBackground.kt\ncom/bbva/document/scanner/presentation/view/FrameBackground\n*L\n23#1:54,3\n40#1:57,4\n40#1:61\n40#1:62\n40#1:63\n*E\n"})
public final class FrameBackground extends View {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f29201r0 = {c.e(FrameBackground.class, "clearBox", "getClearBox()Landroid/graphics/Rect;", 0)};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ObservableProperty f29202p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy paint;

    /* JADX INFO: compiled from: FrameBackground.kt */
    public static final class a extends Lambda implements Function0<Paint> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f29204p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setStyle(Paint.Style.FILL);
            return paint;
        }
    }

    public FrameBackground(@Nullable Context context) {
        super(context);
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.f29202p0 = new ObservableProperty<Rect>(obj) { // from class: com.bbva.document.scanner.presentation.view.FrameBackground$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Rect oldValue, Rect newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.invalidate();
            }
        };
        setLayerType(1, null);
        this.paint = LazyKt__LazyJVMKt.lazy(a.f29204p0);
    }

    private final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    public final void attachBoxProvider(@NotNull final BoxProvider boxProvider) {
        Intrinsics.checkNotNullParameter(boxProvider, "boxProvider");
        View view = boxProvider.view();
        if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bbva.document.scanner.presentation.view.FrameBackground$attachBoxProvider$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    this.f29205a.setClearBox(boxProvider.bounds());
                }
            });
        } else {
            setClearBox(boxProvider.bounds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Rect getClearBox() {
        return (Rect) this.f29202p0.getValue(this, f29201r0[0]);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Rect clearBox = getClearBox();
        if (clearBox != null) {
            canvas.drawRect(clearBox, getPaint());
        }
    }

    public final void setClearBox(@Nullable Rect rect) {
        this.f29202p0.setValue(this, f29201r0[0], rect);
    }

    public FrameBackground(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.f29202p0 = new ObservableProperty<Rect>(obj) { // from class: com.bbva.document.scanner.presentation.view.FrameBackground$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Rect oldValue, Rect newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.invalidate();
            }
        };
        setLayerType(1, null);
        this.paint = LazyKt__LazyJVMKt.lazy(a.f29204p0);
    }

    public FrameBackground(@Nullable Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.f29202p0 = new ObservableProperty<Rect>(obj) { // from class: com.bbva.document.scanner.presentation.view.FrameBackground$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Rect oldValue, Rect newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.invalidate();
            }
        };
        setLayerType(1, null);
        this.paint = LazyKt__LazyJVMKt.lazy(a.f29204p0);
    }
}
