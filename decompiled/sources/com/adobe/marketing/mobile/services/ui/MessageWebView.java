package com.adobe.marketing.mobile.services.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.webkit.WebView;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.internal.utility.StringUtils;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MessageWebView extends WebView {
    private static final String BASE_URL = "file:///android_asset/";
    private static final String MIME_TYPE_HTML = "text/html";
    private Bitmap bitmap;
    private int bottom;
    private Paint contentPaint;
    private float cornerRadius;
    private Paint framePaint;
    private String htmlPayload;
    private int left;
    private int right;
    private BitmapShader shader;
    private Paint shaderPaint;
    private int top;
    private RectF webviewRect;

    public MessageWebView(Context context, float f6, int i10, int i11, int i12, int i13, String str) throws IllegalArgumentException {
        super(context);
        if (context == null) {
            throw new IllegalArgumentException("Unable to create the MessageWebView, the context is null.");
        }
        this.left = i10;
        this.top = i11;
        this.right = i12;
        this.bottom = i13;
        this.cornerRadius = f6;
        this.htmlPayload = str;
        initialize();
    }

    private void initialize() {
        Paint paint = new Paint(1);
        this.contentPaint = paint;
        paint.setColor(-1);
        this.contentPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint2 = new Paint(1);
        this.framePaint = paint2;
        paint2.setColor(-1);
        this.shaderPaint = new Paint(1);
        this.bitmap = Bitmap.createBitmap(this.right, this.bottom, Bitmap.Config.ARGB_8888);
        Bitmap bitmap = this.bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.shader = bitmapShader;
        this.shaderPaint.setShader(bitmapShader);
        setWillNotDraw(false);
    }

    public Map<String, Object> getDimensions() {
        HashMap map = new HashMap();
        map.put("cornerRadius", Float.valueOf(this.cornerRadius));
        map.put(Parameters.DIRECTION.LEFT, Integer.valueOf(this.left));
        map.put(Parameters.DIRECTION.RIGHT, Integer.valueOf(this.right));
        map.put("top", Integer.valueOf(this.top));
        map.put("bottom", Integer.valueOf(this.bottom));
        return map;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(new Canvas(this.bitmap));
        RectF rectF = this.webviewRect;
        float f6 = this.cornerRadius;
        canvas.drawRoundRect(rectF, f6, f6, this.shaderPaint);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.webviewRect = new RectF(this.left, this.top, i10, i11);
    }

    public void startInAppMessage() {
        if (StringUtils.isNullOrEmpty(this.htmlPayload)) {
            MobileCore.log(LoggingMode.DEBUG, "MessageWebView", "Unable to show the IAM, the html payload is null or empty.");
        } else {
            loadDataWithBaseURL("file:///android_asset/", this.htmlPayload, MIME_TYPE_HTML, "UTF-8", null);
        }
    }
}
