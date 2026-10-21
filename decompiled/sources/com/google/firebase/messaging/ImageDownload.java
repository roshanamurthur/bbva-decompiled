package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes10.dex */
public class ImageDownload implements Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final URL f48567p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public volatile Future<?> f48568q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Task<Bitmap> f48569r0;

    public ImageDownload(URL url) {
        this.f48567p0 = url;
    }

    @Nullable
    public static ImageDownload create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w(Constants.TAG, "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public Bitmap blockingDownload() throws IOException {
        boolean zIsLoggable = Log.isLoggable(Constants.TAG, 4);
        URL url = this.f48567p0;
        if (zIsLoggable) {
            Objects.toString(url);
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrB = a.b(new a.C0215a(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable(Constants.TAG, 2)) {
                int length = bArrB.length;
                Objects.toString(url);
            }
            if (bArrB.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length);
            if (bitmapDecodeByteArray != null) {
                if (Log.isLoggable(Constants.TAG, 3)) {
                    Objects.toString(url);
                }
                return bitmapDecodeByteArray;
            }
            throw new IOException("Failed to decode image: " + url);
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48568q0.cancel(true);
    }

    public Task<Bitmap> getTask() {
        return (Task) Preconditions.checkNotNull(this.f48569r0);
    }

    public void start(ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f48568q0 = executorService.submit(new androidx.camera.camera2.interop.a(this, taskCompletionSource, 3));
        this.f48569r0 = taskCompletionSource.getTask();
    }
}
