package com.mastercard.sonic.androidsvg;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.mastercard.sonic.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SVGImageView.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002¨\u0006\u001d"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGImageView;", "Landroid/widget/ImageView;", "", "url", "", "setFromString", "Lcom/mastercard/sonic/androidsvg/SVG;", "svg", "setSVG", "css", "setCSS", "", "resourceId", "setImageResource", "Landroid/net/Uri;", "uri", "setImageURI", "filename", "setImageAsset", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "b", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"AppCompatCustomView"})
@SourceDebugExtension({"SMAP\nSVGImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGImageView.kt\ncom/mastercard/sonic/androidsvg/SVGImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,277:1\n1#2:278\n*E\n"})
public final class SVGImageView extends ImageView {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public static Method f51379r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public SVG f51380p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final RenderOptions f51381q0;

    /* JADX INFO: compiled from: SVGImageView.kt */
    @SuppressLint({"StaticFieldLeak"})
    public final class a extends AsyncTask<Integer, Integer, SVG> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f51382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SVGImageView f51384c;

        public a(@NotNull SVGImageView sVGImageView, Context context, int i10) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f51384c = sVGImageView;
            this.f51382a = context;
            this.f51383b = i10;
        }

        @Override // android.os.AsyncTask
        public final SVG doInBackground(Integer[] numArr) {
            Integer[] params = numArr;
            int i10 = this.f51383b;
            Intrinsics.checkNotNullParameter(params, "params");
            try {
                return SVG.INSTANCE.getFromResource(this.f51382a, i10);
            } catch (SVGParseException e5) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(String.format("Error loading resource 0x%x: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), e5.getMessage()}, 2)), "format(format, *args)");
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(SVG svg) {
            SVGImageView sVGImageView = this.f51384c;
            sVGImageView.f51380p0 = svg;
            sVGImageView.a();
        }
    }

    /* JADX INFO: compiled from: SVGImageView.kt */
    @SuppressLint({"StaticFieldLeak"})
    public final class b extends AsyncTask<InputStream, Integer, SVG> {
        public b() {
        }

        @Override // android.os.AsyncTask
        public final SVG doInBackground(InputStream[] inputStreamArr) {
            InputStream[] is = inputStreamArr;
            Intrinsics.checkNotNullParameter(is, "is");
            try {
                SVG.Companion companion = SVG.INSTANCE;
                InputStream inputStream = is[0];
                Intrinsics.checkNotNull(inputStream);
                SVG fromInputStream = companion.getFromInputStream(inputStream);
                try {
                    return fromInputStream;
                } catch (IOException unused) {
                    return fromInputStream;
                }
            } catch (SVGParseException e5) {
                e5.getMessage();
                return null;
            } finally {
                try {
                    InputStream inputStream2 = is[0];
                    Intrinsics.checkNotNull(inputStream2);
                    inputStream2.close();
                } catch (IOException unused2) {
                }
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(SVG svg) {
            SVGImageView sVGImageView = SVGImageView.this;
            sVGImageView.f51380p0 = svg;
            sVGImageView.a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setFromString(String url) {
        try {
            this.f51380p0 = SVG.INSTANCE.getFromString(url);
            a();
        } catch (SVGParseException unused) {
        }
    }

    public final void a() {
        SVG svg = this.f51380p0;
        if (svg == null) {
            return;
        }
        Intrinsics.checkNotNull(svg);
        Picture pictureRenderToPicture = svg.renderToPicture(this.f51381q0);
        Method method = f51379r0;
        if (method != null) {
            try {
                method.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
            } catch (Exception e5) {
                Log.w("SVGImageView", "Unexpected failure calling setLayerType", e5);
            }
        }
        setImageDrawable(new PictureDrawable(pictureRenderToPicture));
    }

    public final boolean b(String str) {
        try {
            InputStream inputStreamOpen = getContext().getAssets().open(str);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(filename)");
            new b().execute(inputStreamOpen);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean c(Uri uri) {
        try {
            ContentResolver contentResolver = getContext().getContentResolver();
            Intrinsics.checkNotNull(uri);
            new b().execute(contentResolver.openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public final void setCSS(@NotNull String css) {
        Intrinsics.checkNotNullParameter(css, "css");
        this.f51381q0.css(css);
        a();
    }

    public final void setImageAsset(@NotNull String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        b(filename);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int resourceId) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        new a(this, context, resourceId).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        if (c(uri)) {
            return;
        }
        Objects.toString(uri);
    }

    public final void setSVG(@Nullable SVG svg) {
        if (svg == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()".toString());
        }
        this.f51380p0 = svg;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SVGImageView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51381q0 = new RenderOptions(null, 1, null);
        try {
            f51379r0 = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
        if (attributeSet == null || isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.SVGImageView, i10, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme\n          …          0\n            )");
        try {
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.SVGImageView_css);
            if (string != null) {
                this.f51381q0.css(string);
            }
            int i11 = R.styleable.SVGImageView_svg;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
            } else {
                String string2 = typedArrayObtainStyledAttributes.getString(i11);
                if (string2 != null && !c(Uri.parse(string2)) && !b(string2)) {
                    setFromString(string2);
                }
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setSVG(@Nullable SVG svg, @NotNull String css) {
        Intrinsics.checkNotNullParameter(css, "css");
        if (svg != null) {
            this.f51380p0 = svg;
            this.f51381q0.css(css);
            a();
            return;
        }
        throw new IllegalArgumentException("Null value passed to setSVG()".toString());
    }
}
