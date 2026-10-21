package androidx.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.h0;
import com.bbva.nativesettings.common.Constants;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class PrintHelper {

    @SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_COLOR = 2;

    @SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_MONOCHROME = 1;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f22462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f22463h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BitmapFactory.Options f22465b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22466c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22467d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22468e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22469f = 1;

    public interface OnPrintFinishCallback {
        void onFinish();
    }

    public class a extends AsyncTask<Void, Void, Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f22470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f22471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f22472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f22473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f22474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f22475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f22476g;

        public a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i10, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f22470a = cancellationSignal;
            this.f22471b = printAttributes;
            this.f22472c = bitmap;
            this.f22473d = printAttributes2;
            this.f22474e = i10;
            this.f22475f = parcelFileDescriptor;
            this.f22476g = writeResultCallback;
        }

        @Override // android.os.AsyncTask
        public final Throwable doInBackground(Void[] voidArr) {
            RectF rectF;
            PrintAttributes printAttributes = this.f22471b;
            PrintHelper printHelper = PrintHelper.this;
            CancellationSignal cancellationSignal = this.f22470a;
            ParcelFileDescriptor parcelFileDescriptor = this.f22475f;
            Bitmap bitmap = this.f22472c;
            try {
                if (cancellationSignal.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(printHelper.f22464a, printAttributes);
                Bitmap bitmapA = PrintHelper.a(bitmap, printAttributes.getColorMode());
                if (cancellationSignal.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                    boolean z10 = PrintHelper.f22463h;
                    if (z10) {
                        rectF = new RectF(pageStartPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(printHelper.f22464a, this.f22473d);
                        PdfDocument.Page pageStartPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(pageStartPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(pageStartPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    int width = bitmapA.getWidth();
                    int height = bitmapA.getHeight();
                    int i10 = this.f22474e;
                    Matrix matrix = new Matrix();
                    float f6 = width;
                    float fWidth = rectF.width() / f6;
                    float fMax = i10 == 2 ? Math.max(fWidth, rectF.height() / height) : Math.min(fWidth, rectF.height() / height);
                    matrix.postScale(fMax, fMax);
                    matrix.postTranslate(h0.a(f6, fMax, rectF.width(), 2.0f), h0.a(height, fMax, rectF.height(), 2.0f));
                    if (!z10) {
                        matrix.postTranslate(rectF.left, rectF.top);
                        pageStartPage.getCanvas().clipRect(rectF);
                    }
                    pageStartPage.getCanvas().drawBitmap(bitmapA, matrix, null);
                    printedPdfDocument.finishPage(pageStartPage);
                    if (cancellationSignal.isCanceled()) {
                        printedPdfDocument.close();
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (bitmapA == bitmap) {
                            return null;
                        }
                    } else {
                        printedPdfDocument.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                        printedPdfDocument.close();
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused2) {
                        }
                        if (bitmapA == bitmap) {
                            return null;
                        }
                    }
                    bitmapA.recycle();
                    return null;
                } catch (Throwable th2) {
                    printedPdfDocument.close();
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (bitmapA == bitmap) {
                        throw th2;
                    }
                    bitmapA.recycle();
                    throw th2;
                }
            } catch (Throwable th3) {
                return th3;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Throwable th2) {
            Throwable th3 = th2;
            boolean zIsCanceled = this.f22470a.isCanceled();
            PrintDocumentAdapter.WriteResultCallback writeResultCallback = this.f22476g;
            if (zIsCanceled) {
                writeResultCallback.onWriteCancelled();
            } else if (th3 == null) {
                writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                writeResultCallback.onWriteFailed(null);
            }
        }
    }

    @RequiresApi(19)
    public class b extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bitmap f22480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final OnPrintFinishCallback f22481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PrintAttributes f22482e;

        public b(String str, int i10, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
            this.f22478a = str;
            this.f22479b = i10;
            this.f22480c = bitmap;
            this.f22481d = onPrintFinishCallback;
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onFinish() {
            OnPrintFinishCallback onPrintFinishCallback = this.f22481d;
            if (onPrintFinishCallback != null) {
                onPrintFinishCallback.onFinish();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f22482e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f22478a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            PrintHelper.this.d(this.f22482e, this.f22479b, this.f22480c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @RequiresApi(19)
    public class c extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f22485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OnPrintFinishCallback f22486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f22487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PrintAttributes f22488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AsyncTask<Uri, Boolean, Bitmap> f22489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bitmap f22490g = null;

        public class a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CancellationSignal f22492a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f22493b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f22494c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f22495d;

            /* JADX INFO: renamed from: androidx.print.PrintHelper$c$a$a, reason: collision with other inner class name */
            public class C0098a implements CancellationSignal.OnCancelListener {
                public C0098a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    a aVar = a.this;
                    c.this.a();
                    aVar.cancel(false);
                }
            }

            public a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f22492a = cancellationSignal;
                this.f22493b = printAttributes;
                this.f22494c = printAttributes2;
                this.f22495d = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            public final Bitmap doInBackground(Uri[] uriArr) {
                try {
                    c cVar = c.this;
                    return PrintHelper.this.c(cVar.f22485b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final void onCancelled(Bitmap bitmap) {
                this.f22495d.onLayoutCancelled();
                c.this.f22489f = null;
            }

            @Override // android.os.AsyncTask
            public final void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                Bitmap bitmapCreateBitmap = bitmap;
                super.onPostExecute(bitmapCreateBitmap);
                if (bitmapCreateBitmap != null && (!PrintHelper.f22462g || PrintHelper.this.f22469f == 0)) {
                    synchronized (this) {
                        mediaSize = c.this.f22488e.getMediaSize();
                    }
                    if (mediaSize != null) {
                        if (mediaSize.isPortrait() != (bitmapCreateBitmap.getWidth() <= bitmapCreateBitmap.getHeight())) {
                            Matrix matrix = new Matrix();
                            matrix.postRotate(90.0f);
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                        }
                    }
                }
                c.this.f22490g = bitmapCreateBitmap;
                if (bitmapCreateBitmap != null) {
                    this.f22495d.onLayoutFinished(new PrintDocumentInfo.Builder(c.this.f22484a).setContentType(1).setPageCount(1).build(), true ^ this.f22493b.equals(this.f22494c));
                } else {
                    this.f22495d.onLayoutFailed(null);
                }
                c.this.f22489f = null;
            }

            @Override // android.os.AsyncTask
            public final void onPreExecute() {
                this.f22492a.setOnCancelListener(new C0098a());
            }
        }

        public c(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback, int i10) {
            this.f22484a = str;
            this.f22485b = uri;
            this.f22486c = onPrintFinishCallback;
            this.f22487d = i10;
        }

        public final void a() {
            synchronized (PrintHelper.this.f22466c) {
                try {
                    BitmapFactory.Options options = PrintHelper.this.f22465b;
                    if (options != null) {
                        if (Build.VERSION.SDK_INT < 24) {
                            options.requestCancelDecode();
                        }
                        PrintHelper.this.f22465b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f22489f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            OnPrintFinishCallback onPrintFinishCallback = this.f22486c;
            if (onPrintFinishCallback != null) {
                onPrintFinishCallback.onFinish();
            }
            Bitmap bitmap = this.f22490g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f22490g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f22488e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f22490g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f22484a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f22489f = new a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            PrintHelper.this.d(this.f22488e, this.f22487d, this.f22490g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f22462g = i10 > 23;
        f22463h = i10 != 23;
    }

    public PrintHelper(@NonNull Context context) {
        this.f22464a = context;
    }

    public static Bitmap a(Bitmap bitmap, int i10) {
        if (i10 != 1) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static boolean systemSupportsPrint() {
        return true;
    }

    public final Bitmap b(Uri uri, BitmapFactory.Options options) throws Throwable {
        Context context;
        if (uri == null || (context = this.f22464a) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException e5) {
                        Log.w("PrintHelper", "close fail ", e5);
                    }
                }
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e7) {
                        Log.w("PrintHelper", "close fail ", e7);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Bitmap c(Uri uri) throws Throwable {
        BitmapFactory.Options options;
        if (uri == null || this.f22464a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        b(uri, options2);
        int i10 = options2.outWidth;
        int i11 = options2.outHeight;
        if (i10 > 0 && i11 > 0) {
            int iMax = Math.max(i10, i11);
            int i12 = 1;
            while (iMax > 3500) {
                iMax >>>= 1;
                i12 <<= 1;
            }
            if (i12 > 0 && Math.min(i10, i11) / i12 > 0) {
                synchronized (this.f22466c) {
                    options = new BitmapFactory.Options();
                    this.f22465b = options;
                    options.inMutable = true;
                    options.inSampleSize = i12;
                }
                try {
                    Bitmap bitmapB = b(uri, options);
                    synchronized (this.f22466c) {
                        this.f22465b = null;
                    }
                    return bitmapB;
                } catch (Throwable th2) {
                    synchronized (this.f22466c) {
                        this.f22465b = null;
                        throw th2;
                    }
                }
            }
        }
        return null;
    }

    @RequiresApi(19)
    public final void d(PrintAttributes printAttributes, int i10, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PrintAttributes printAttributesBuild;
        if (f22463h) {
            printAttributesBuild = printAttributes;
        } else {
            PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
            if (printAttributes.getColorMode() != 0) {
                minMargins.setColorMode(printAttributes.getColorMode());
            }
            if (printAttributes.getDuplexMode() != 0) {
                minMargins.setDuplexMode(printAttributes.getDuplexMode());
            }
            printAttributesBuild = minMargins.setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build();
        }
        new a(cancellationSignal, printAttributesBuild, bitmap, printAttributes, i10, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }

    public int getColorMode() {
        return this.f22468e;
    }

    public int getOrientation() {
        int i10 = this.f22469f;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public int getScaleMode() {
        return this.f22467d;
    }

    public void printBitmap(@NonNull String str, @NonNull Bitmap bitmap) {
        printBitmap(str, bitmap, (OnPrintFinishCallback) null);
    }

    public void setColorMode(int i10) {
        this.f22468e = i10;
    }

    public void setOrientation(int i10) {
        this.f22469f = i10;
    }

    public void setScaleMode(int i10) {
        this.f22467d = i10;
    }

    public void printBitmap(@NonNull String str, @NonNull Bitmap bitmap, @Nullable OnPrintFinishCallback onPrintFinishCallback) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f22464a.getSystemService(Constants.PRINT)).print(str, new b(str, this.f22467d, bitmap, onPrintFinishCallback), new PrintAttributes.Builder().setMediaSize(bitmap.getWidth() <= bitmap.getHeight() ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f22468e).build());
    }

    public void printBitmap(@NonNull String str, @NonNull Uri uri) throws FileNotFoundException {
        printBitmap(str, uri, (OnPrintFinishCallback) null);
    }

    public void printBitmap(@NonNull String str, @NonNull Uri uri, @Nullable OnPrintFinishCallback onPrintFinishCallback) throws FileNotFoundException {
        c cVar = new c(str, uri, onPrintFinishCallback, this.f22467d);
        PrintManager printManager = (PrintManager) this.f22464a.getSystemService(Constants.PRINT);
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f22468e);
        int i10 = this.f22469f;
        if (i10 == 1 || i10 == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i10 == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, cVar, builder.build());
    }
}
