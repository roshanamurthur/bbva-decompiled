package mx.openpay.library.ui.component.signature;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.e;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002;<B\u0019\u0012\u0006\u00106\u001a\u000205\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0006\u0010\u000b\u001a\u00020\u0006J0\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0001H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0001H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0014J\u0010\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001fH\u0016R\"\u0010%\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0013\u00103\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00104\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b4\u0010&¨\u0006="}, d2 = {"Lmx/openpay/library/ui/component/signature/SignatureView;", "Landroid/view/View;", "Landroid/view/View$OnAttachStateChangeListener;", "", "getPenColor", "penColor", "", "setPenColor", "getBackgroundColor", "backgroundColor", "setBackgroundColor", "clearCanvas", "", "changed", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "onLayout", SharedPrefsStorage.VERSION_KEY, "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "Landroid/os/Parcelable;", "onSaveInstanceState", "state", "onRestoreInstanceState", "s", "Z", "isEnableSignature", "()Z", "setEnableSignature", "(Z)V", "", "t", "F", "getPenSize", "()F", "setPenSize", "(F)V", "penSize", "getSignatureBitmap", "()Landroid/graphics/Bitmap;", "signatureBitmap", "isBitmapEmpty", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "SavedState", "library_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSignatureView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureView.kt\nmx/openpay/library/ui/component/signature/SignatureView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,499:1\n1#2:500\n*E\n"})
public final class SignatureView extends View implements View.OnAttachStateChangeListener {
    public static final float MAX_VELOCITY_BOUND = 15.0f;
    public static final float MIN_PEN_SIZE = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f84315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Canvas f84316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Point f84318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Point f84319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Point f84320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f84321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f84322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f84323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f84325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f84326l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f84327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f84328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f84329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f84330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f84331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean isEnableSignature;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public float penSize;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lmx/openpay/library/ui/component/signature/SignatureView$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcel;", "out", "", "flags", "", "writeToParcel", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "bitmap", "Landroid/os/Parcelable;", "superState", "<init>", "(Landroid/os/Parcelable;Landroid/graphics/Bitmap;)V", "Companion", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class SavedState extends View.BaseSavedState {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final SignatureView$SavedState$Companion$creator$1 f84334b = new Parcelable.Creator<SavedState>() { // from class: mx.openpay.library.ui.component.signature.SignatureView$SavedState$Companion$creator$1
            @Override // android.os.Parcelable.Creator
            @NotNull
            public SignatureView.SavedState createFromParcel(@NotNull Parcel inParcel) {
                Intrinsics.checkNotNullParameter(inParcel, "inParcel");
                return new SignatureView.SavedState(inParcel, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public SignatureView.SavedState[] newArray(int size) {
                return new SignatureView.SavedState[size];
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public Bitmap bitmap;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmx/openpay/library/ui/component/signature/SignatureView$SavedState$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lmx/openpay/library/ui/component/signature/SignatureView$SavedState;", "creator", "Landroid/os/Parcelable$Creator;", "getCreator", "()Landroid/os/Parcelable$Creator;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final byte[] access$compress(Companion companion, Bitmap bitmap) {
                companion.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Intrinsics.checkNotNull(bitmap);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "stream.toByteArray()");
                return byteArray;
            }

            public static final Bitmap access$deCompress(Companion companion, byte[] bArr) {
                companion.getClass();
                Intrinsics.checkNotNull(bArr);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(byteArray, 0, byteArray!!.size)");
                return bitmapDecodeByteArray;
            }

            @NotNull
            public final Parcelable.Creator<SavedState> getCreator() {
                return SavedState.f84334b;
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.bitmap = Companion.access$deCompress(INSTANCE, parcel.createByteArray());
        }

        @Nullable
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final void setBitmap(@Nullable Bitmap bitmap) {
            this.bitmap = bitmap;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeByteArray(Companion.access$compress(INSTANCE, this.bitmap));
        }

        public /* synthetic */ SavedState(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        public SavedState(@Nullable Parcelable parcelable, @Nullable Bitmap bitmap) {
            super(parcelable);
            this.bitmap = bitmap;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84315a = context;
        addOnAttachStateChangeListener(this);
        setWillNotDraw(false);
        setDrawingCacheEnabled(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.signature, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…tyleable.signature, 0, 0)");
        try {
            this.f84331r = typedArrayObtainStyledAttributes.getColor(R.styleable.signature_backgroundColor, context.getResources().getColor(R.color.white));
            this.f84330q = typedArrayObtainStyledAttributes.getColor(R.styleable.signature_penColor, context.getResources().getColor(R.color.black));
            this.penSize = typedArrayObtainStyledAttributes.getDimension(R.styleable.signature_penSize, context.getResources().getDimension(R.dimen.signature_view_pen_size));
            this.isEnableSignature = typedArrayObtainStyledAttributes.getBoolean(R.styleable.signature_enableSignature, true);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.f84328o = paint;
            paint.setColor(this.f84330q);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            Paint.Join join = Paint.Join.ROUND;
            paint.setStrokeJoin(join);
            Paint.Cap cap = Paint.Cap.ROUND;
            paint.setStrokeCap(cap);
            paint.setStrokeWidth(this.penSize);
            Paint paint2 = new Paint(1);
            this.f84329p = paint2;
            paint2.setAntiAlias(true);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeJoin(join);
            paint2.setStrokeCap(cap);
            paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a(float f6, float f10, float f11) {
        Point point = this.f84318d;
        Point point2 = this.f84319e;
        Intrinsics.checkNotNull(point);
        float x4 = point.getX();
        Intrinsics.checkNotNull(point2);
        float f12 = 2;
        long j10 = 2;
        Point point3 = new Point((point2.getX() + x4) / 2.0f, (point2.getY() + point.getY()) / f12, (point2.getTime() + point.getTime()) / j10);
        Point point4 = this.f84320f;
        Point point5 = this.f84318d;
        Intrinsics.checkNotNull(point4);
        float x6 = point4.getX();
        Intrinsics.checkNotNull(point5);
        Point point6 = new Point((point5.getX() + x6) / 2.0f, (point5.getY() + point4.getY()) / f12, (point5.getTime() + point4.getTime()) / j10);
        Point point7 = this.f84318d;
        if (this.f84316b == null) {
            return;
        }
        float f13 = (f11 <= 1.6f || f11 >= 15.0f) ? 0.01f : 0.0085f - (f11 * 5.0E-4f);
        float f14 = 0.0f;
        while (true) {
            if (f14 >= 1.0f) {
                return;
            }
            if (point7 != null) {
                float x7 = point3.getX();
                float x10 = ((point7.getX() - x7) * f14) + x7;
                float y7 = point3.getY();
                float y10 = ((point7.getY() - y7) * f14) + y7;
                float x11 = point7.getX();
                float x12 = ((point6.getX() - x11) * f14) + x11;
                float y11 = point7.getY();
                float y12 = ((point6.getY() - y11) * f14) + y11;
                float fA = e.a(x12, x10, f14, x10);
                float fA2 = e.a(y12, y10, f14, y10);
                float fA3 = e.a(f10, f6, f14, f6);
                this.f84328o.setStrokeWidth(fA3 >= 1.0f ? fA3 : 1.0f);
                Canvas canvas = this.f84316b;
                if (canvas != null) {
                    canvas.drawPoint(fA, fA2, this.f84328o);
                }
            }
            f14 += f13;
        }
    }

    public final void clearCanvas() {
        this.f84318d = null;
        this.f84319e = null;
        this.f84320f = null;
        this.f84321g = 0.0f;
        this.f84322h = 0.0f;
        a(this.f84324j, this.f84325k, this.f84326l, this.m);
        postInvalidate();
    }

    /* JADX INFO: renamed from: getBackgroundColor, reason: from getter */
    public final int getF84331r() {
        return this.f84331r;
    }

    /* JADX INFO: renamed from: getPenColor, reason: from getter */
    public final int getF84330q() {
        return this.f84330q;
    }

    public final float getPenSize() {
        return this.penSize;
    }

    @Nullable
    public final Bitmap getSignatureBitmap() {
        Bitmap bitmap = this.f84323i;
        if (bitmap == null) {
            return null;
        }
        Intrinsics.checkNotNull(bitmap);
        Bitmap bitmap2 = this.f84323i;
        Intrinsics.checkNotNull(bitmap2);
        int width = bitmap2.getWidth();
        Bitmap bitmap3 = this.f84323i;
        Intrinsics.checkNotNull(bitmap3);
        return Bitmap.createScaledBitmap(bitmap, width, bitmap3.getHeight(), true);
    }

    public final boolean isBitmapEmpty() {
        Bitmap bitmap = this.f84323i;
        if (bitmap == null) {
            return false;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        new Canvas(bitmapCreateBitmap).drawColor(this.f84331r);
        return bitmap.sameAs(bitmapCreateBitmap);
    }

    /* JADX INFO: renamed from: isEnableSignature, reason: from getter */
    public final boolean getIsEnableSignature() {
        return this.isEnableSignature;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.f84323i;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f84329p);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.f84324j = left;
        this.f84325k = top;
        this.f84326l = right;
        this.m = bottom;
        Bitmap bitmap = this.f84323i;
        if (bitmap == null) {
            a(left, top, right, bottom);
            return;
        }
        if (changed) {
            a(left, top, Math.max(right, bitmap.getWidth()), Math.max(bottom, bitmap.getHeight()));
            Canvas canvas = this.f84316b;
            if (canvas != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setBitmap(savedState.getBitmap());
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f84323i);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f9  */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        float x4;
        float y7;
        Point point;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnableSignature || event.getPointerCount() > 1) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            this.f84317c = false;
            this.f84327n = new Rect(getLeft(), getTop(), getRight(), getBottom());
            float x6 = event.getX();
            float y10 = event.getY();
            this.f84318d = null;
            this.f84319e = null;
            this.f84320f = null;
            this.f84321g = 0.0f;
            this.f84322h = this.penSize;
            Point point2 = new Point(x6, y10, System.currentTimeMillis());
            this.f84320f = point2;
            this.f84318d = point2;
            this.f84319e = point2;
            postInvalidate();
        } else if (action == 1) {
            x4 = event.getX();
            y7 = event.getY();
            point = this.f84318d;
            if (point != null) {
                this.f84319e = point;
                this.f84318d = this.f84320f;
                this.f84320f = new Point(x4, y7, System.currentTimeMillis());
                a(this.f84322h, 0.0f, this.f84321g);
                postInvalidate();
            }
        } else if (action == 2) {
            Rect rect = this.f84327n;
            Intrinsics.checkNotNull(rect);
            if (rect.contains(getLeft() + ((int) event.getX()), getTop() + ((int) event.getY()))) {
                if (this.f84317c) {
                    this.f84317c = false;
                    float x7 = event.getX();
                    float y11 = event.getY();
                    this.f84318d = null;
                    this.f84319e = null;
                    this.f84320f = null;
                    this.f84321g = 0.0f;
                    this.f84322h = this.penSize;
                    Point point3 = new Point(x7, y11, System.currentTimeMillis());
                    this.f84320f = point3;
                    this.f84318d = point3;
                    this.f84319e = point3;
                    postInvalidate();
                } else {
                    float x10 = event.getX();
                    float y12 = event.getY();
                    Point point4 = this.f84318d;
                    if (point4 != null) {
                        this.f84319e = point4;
                        this.f84318d = this.f84320f;
                        Point point5 = new Point(x10, y12, System.currentTimeMillis());
                        this.f84320f = point5;
                        Intrinsics.checkNotNull(point5);
                        Point point6 = this.f84318d;
                        Intrinsics.checkNotNull(point6);
                        float fVelocityFrom = (this.f84321g * 0.8f) + (point5.velocityFrom(point6) * 0.2f);
                        float f6 = this.penSize - (1.0f * fVelocityFrom);
                        a(this.f84322h, f6, fVelocityFrom);
                        this.f84321g = fVelocityFrom;
                        this.f84322h = f6;
                        postInvalidate();
                    }
                }
            } else if (!this.f84317c) {
                this.f84317c = true;
                float x11 = event.getX();
                float y13 = event.getY();
                Point point7 = this.f84318d;
                if (point7 != null) {
                    this.f84319e = point7;
                    this.f84318d = this.f84320f;
                    this.f84320f = new Point(x11, y13, System.currentTimeMillis());
                    a(this.f84322h, 0.0f, this.f84321g);
                    postInvalidate();
                }
            }
        } else if (action == 3) {
            x4 = event.getX();
            y7 = event.getY();
            point = this.f84318d;
            if (point != null) {
                this.f84319e = point;
                this.f84318d = this.f84320f;
                this.f84320f = new Point(x4, y7, System.currentTimeMillis());
                a(this.f84322h, 0.0f, this.f84321g);
                postInvalidate();
            }
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        setBackgroundColor(ContextCompat.getColor(this.f84315a, R.color.digital_signature_view_background_color));
        setPenColor(ContextCompat.getColor(this.f84315a, R.color.digital_signature_pen_color));
        Canvas canvas = this.f84316b;
        if (canvas != null) {
            canvas.drawColor(this.f84331r);
        }
        invalidate();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        this.f84331r = backgroundColor;
    }

    public final void setBitmap(@Nullable Bitmap bitmap) {
        if (bitmap != null) {
            this.f84323i = bitmap;
            this.f84316b = new Canvas(bitmap);
            postInvalidate();
        }
    }

    public final void setEnableSignature(boolean z10) {
        this.isEnableSignature = z10;
    }

    public final void setPenColor(int penColor) {
        this.f84330q = penColor;
        this.f84328o.setColor(penColor);
    }

    public final void setPenSize(float f6) {
        this.penSize = f6;
    }

    public final void a(int i10, int i11, int i12, int i13) {
        int i14;
        this.f84323i = null;
        this.f84316b = null;
        int i15 = i12 - i10;
        if (i15 <= 0 || (i14 = i13 - i11) <= 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i15, i14, Bitmap.Config.ARGB_8888);
        this.f84323i = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            this.f84316b = canvas;
            canvas.drawColor(this.f84331r);
        }
    }
}
