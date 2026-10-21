package com.caverock.androidsvg;

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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class SVGImageView extends ImageView {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Method f39092r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SVG f39093p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final RenderOptions f39094q0;

    public class a extends AsyncTask<Integer, Integer, SVG> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f39095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39096b;

        public a(Context context, int i10) {
            this.f39095a = context;
            this.f39096b = i10;
        }

        @Override // android.os.AsyncTask
        public final SVG doInBackground(Integer[] numArr) {
            int i10 = this.f39096b;
            try {
                return SVG.getFromResource(this.f39095a, i10);
            } catch (SVGParseException e5) {
                String.format("Error loading resource 0x%x: %s", Integer.valueOf(i10), e5.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(SVG svg) {
            SVGImageView sVGImageView = SVGImageView.this;
            sVGImageView.f39093p0 = svg;
            sVGImageView.a();
        }
    }

    public class b extends AsyncTask<InputStream, Integer, SVG> {
        public b() {
        }

        @Override // android.os.AsyncTask
        public final SVG doInBackground(InputStream[] inputStreamArr) {
            InputStream[] inputStreamArr2 = inputStreamArr;
            try {
                SVG fromInputStream = SVG.getFromInputStream(inputStreamArr2[0]);
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
                    inputStreamArr2[0].close();
                } catch (IOException unused2) {
                }
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(SVG svg) {
            SVGImageView sVGImageView = SVGImageView.this;
            sVGImageView.f39093p0 = svg;
            sVGImageView.a();
        }
    }

    static {
        try {
            f39092r0 = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context) {
        super(context);
        this.f39093p0 = null;
        this.f39094q0 = new RenderOptions();
    }

    private void setFromString(String str) {
        try {
            this.f39093p0 = SVG.getFromString(str);
            a();
        } catch (SVGParseException unused) {
        }
    }

    public final void a() {
        SVG svg = this.f39093p0;
        if (svg == null) {
            return;
        }
        Picture pictureRenderToPicture = svg.renderToPicture(this.f39094q0);
        Method method = f39092r0;
        if (method != null) {
            try {
                method.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
            } catch (Exception e5) {
                Log.w("SVGImageView", "Unexpected failure calling setLayerType", e5);
            }
        }
        setImageDrawable(new PictureDrawable(pictureRenderToPicture));
    }

    public final void b(AttributeSet attributeSet, int i10) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.SVGImageView, i10, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.SVGImageView_css);
            if (string != null) {
                this.f39094q0.css(string);
            }
            int i11 = R.styleable.SVGImageView_svg;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                return;
            }
            String string2 = typedArrayObtainStyledAttributes.getString(i11);
            if (string2 != null) {
                if (d(Uri.parse(string2))) {
                    return;
                }
                if (c(string2)) {
                } else {
                    setFromString(string2);
                }
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean c(String str) {
        try {
            new b().execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean d(Uri uri) {
        try {
            new b().execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public void setCSS(String str) {
        this.f39094q0.css(str);
        a();
    }

    public void setImageAsset(String str) {
        c(str);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        new a(getContext(), i10).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (d(uri)) {
            return;
        }
        Objects.toString(uri);
    }

    public void setSVG(SVG svg) {
        if (svg == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        this.f39093p0 = svg;
        a();
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f39093p0 = null;
        this.f39094q0 = new RenderOptions();
        b(attributeSet, 0);
    }

    public void setSVG(SVG svg, String str) {
        if (svg != null) {
            this.f39093p0 = svg;
            this.f39094q0.css(str);
            a();
            return;
        }
        throw new IllegalArgumentException("Null value passed to setSVG()");
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39093p0 = null;
        this.f39094q0 = new RenderOptions();
        b(attributeSet, i10);
    }
}
