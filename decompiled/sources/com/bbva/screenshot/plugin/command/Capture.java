package com.bbva.screenshot.plugin.command;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.WebView;
import com.bbva.androidtoolkit.helper.LazyGetter;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.screenshot.Screenshot;
import com.bbva.screenshot.plugin.model.CaptureRequest;
import com.bbva.socialsharing.SocialSharing;
import com.bbva.socialsharing.model.ShareData;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Capture.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB#\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u0010"}, d2 = {"Lcom/bbva/screenshot/plugin/command/Capture;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/screenshot/plugin/model/CaptureRequest;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/androidtoolkit/helper/LazyGetter;", "Lcom/bbva/screenshot/Screenshot;", "screenshot", "Lcom/bbva/socialsharing/SocialSharing;", "socialSharing", "<init>", "(Lcom/bbva/androidtoolkit/helper/LazyGetter;Lcom/bbva/androidtoolkit/helper/LazyGetter;)V", "Companion", "screenshot-plugin_release"}, k = 1, mv = {1, 4, 0})
public final class Capture extends AbstractCommand<CaptureRequest> {

    @NotNull
    public static final String ID = "capture";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LazyGetter<Screenshot> f36370p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final LazyGetter<SocialSharing> f36371q0;

    /* JADX INFO: compiled from: Capture.kt */
    public static final class a<T> implements Consumer<WebView> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CaptureRequest f36373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f36374c;

        public a(CaptureRequest captureRequest, CommandCallback commandCallback) {
            this.f36373b = captureRequest;
            this.f36374c = commandCallback;
        }

        @Override // com.bbva.androidtoolkit.optional.function.Consumer
        public final void accept(WebView webView) {
            Rect rectAccess$toRect;
            WebView webView2 = webView;
            CaptureRequest captureRequest = this.f36373b;
            CaptureRequest.Frame frame = captureRequest.getFrame();
            Capture capture = Capture.this;
            if (frame != null) {
                Intrinsics.checkExpressionValueIsNotNull(webView2, "webView");
                Resources resources = webView2.getResources();
                Intrinsics.checkExpressionValueIsNotNull(resources, "webView.resources");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                Intrinsics.checkExpressionValueIsNotNull(displayMetrics, "webView.resources.displayMetrics");
                rectAccess$toRect = Capture.access$toRect(capture, frame, displayMetrics);
            } else {
                rectAccess$toRect = null;
            }
            Screenshot screenshot = (Screenshot) capture.f36370p0.get();
            Intrinsics.checkExpressionValueIsNotNull(webView2, "webView");
            Bitmap bitmapCapture = screenshot.capture(webView2, rectAccess$toRect);
            CommandCallback commandCallback = this.f36374c;
            if (bitmapCapture == null) {
                commandCallback.sendError(Errors.ErrorDefault);
                return;
            }
            String action = captureRequest.getAction();
            Context context = webView2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "webView.context");
            Capture.access$manageAction(capture, action, commandCallback, context, bitmapCapture);
            bitmapCapture.recycle();
        }
    }

    /* JADX INFO: compiled from: Capture.kt */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f36375p0;

        public b(CommandCallback commandCallback) {
            this.f36375p0 = commandCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f36375p0.sendError(Errors.ErrorNotAvailable);
        }
    }

    public Capture(@NotNull LazyGetter<Screenshot> lazyGetter, @NotNull LazyGetter<SocialSharing> lazyGetter2) {
        super(CaptureRequest.class);
        this.f36370p0 = lazyGetter;
        this.f36371q0 = lazyGetter2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void access$manageAction(Capture capture, String str, CommandCallback commandCallback, Context context, Bitmap bitmap) {
        capture.getClass();
        if (str.hashCode() != 109400031 || !str.equals("share")) {
            commandCallback.sendError(Errors.ErrorMalformedParam);
            return;
        }
        try {
            SocialSharing socialSharing = capture.f36371q0.get();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            Intrinsics.checkExpressionValueIsNotNull(strEncodeToString, "capture.toBase64()");
            socialSharing.share(context, null, new ShareData.Raw(strEncodeToString, null, 2, 0 == true ? 1 : 0));
            commandCallback.sendEvent();
        } catch (Exception unused) {
            commandCallback.sendError(Errors.ErrorNotAvailable);
        }
    }

    public static final Rect access$toRect(Capture capture, CaptureRequest.Frame frame, DisplayMetrics displayMetrics) {
        capture.getClass();
        int iApplyDimension = (int) TypedValue.applyDimension(1, frame.getX(), displayMetrics);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, frame.getY(), displayMetrics);
        return new Rect(iApplyDimension, iApplyDimension2, ((int) TypedValue.applyDimension(1, frame.getWidth(), displayMetrics)) + iApplyDimension, ((int) TypedValue.applyDimension(1, frame.getHeight(), displayMetrics)) + iApplyDimension2);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable CaptureRequest params, @NotNull CommandCallback callback) {
        if (params == null) {
            callback.sendError(Errors.ErrorMalformedParam);
        } else {
            this.mWebView.ifPresentOrElse(new a(params, callback), new b(callback));
        }
    }
}
