package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.ExifOrientationStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class ThumbFetcher implements DataFetcher<InputStream> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Uri f38166p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final sc.b f38167q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public InputStream f38168r0;

    public static class a implements sc.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f38169b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f38170a;

        public a(ContentResolver contentResolver) {
            this.f38170a = contentResolver;
        }

        @Override // sc.a
        public final Cursor a(Uri uri) {
            return this.f38170a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f38169b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class b implements sc.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f38171b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f38172a;

        public b(ContentResolver contentResolver) {
            this.f38172a = contentResolver;
        }

        @Override // sc.a
        public final Cursor a(Uri uri) {
            return this.f38172a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f38171b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public ThumbFetcher(Uri uri, sc.b bVar) {
        this.f38166p0 = uri;
        this.f38167q0 = bVar;
    }

    public static ThumbFetcher a(Context context, Uri uri, sc.a aVar) {
        return new ThumbFetcher(uri, new sc.b(Glide.get(context).getRegistry().getImageHeaderParsers(), aVar, Glide.get(context).getArrayPool(), context.getContentResolver()));
    }

    public static ThumbFetcher buildImageFetcher(Context context, Uri uri) {
        return a(context, uri, new a(context.getContentResolver()));
    }

    public static ThumbFetcher buildVideoFetcher(Context context, Uri uri) {
        return a(context, uri, new b(context.getContentResolver()));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public final InputStream b() throws Throwable {
        Cursor cursorA;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int orientation;
        Uri uri = this.f38166p0;
        sc.b bVar = this.f38167q0;
        bVar.getClass();
        Cursor cursor = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            cursorA = bVar.f93158a.a(uri);
            if (cursorA != null) {
                try {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorA != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            bVar.getClass();
                            try {
                                try {
                                    inputStreamOpenInputStream2 = bVar.f93160c.openInputStream(uri);
                                    orientation = ImageHeaderParserUtils.getOrientation(bVar.f93161d, inputStreamOpenInputStream2, bVar.f93159b);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    throw th2;
                                }
                            } catch (IOException | NullPointerException unused4) {
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Objects.toString(uri);
                                }
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                orientation = -1;
                            }
                        } else {
                            orientation = -1;
                        }
                        if (orientation != -1) {
                            return new ExifOrientationStream(inputStreamOpenInputStream, orientation);
                        }
                        return inputStreamOpenInputStream;
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() || 0 >= file.length()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = bVar.f93160c.openInputStream(uriFromFile);
                            } catch (NullPointerException e5) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e5));
                            }
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        bVar.getClass();
                        inputStreamOpenInputStream2 = bVar.f93160c.openInputStream(uri);
                        orientation = ImageHeaderParserUtils.getOrientation(bVar.f93161d, inputStreamOpenInputStream2, bVar.f93159b);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } else {
                        orientation = -1;
                    }
                    if (orientation != -1) {
                        return new ExifOrientationStream(inputStreamOpenInputStream, orientation);
                    }
                    return inputStreamOpenInputStream;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (SecurityException unused6) {
            cursorA = null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
        if (inputStreamOpenInputStream != null) {
            bVar.getClass();
            inputStreamOpenInputStream2 = bVar.f93160c.openInputStream(uri);
            orientation = ImageHeaderParserUtils.getOrientation(bVar.f93161d, inputStreamOpenInputStream2, bVar.f93159b);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            orientation = -1;
        }
        if (orientation != -1) {
            return new ExifOrientationStream(inputStreamOpenInputStream, orientation);
        }
        return inputStreamOpenInputStream;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        InputStream inputStream = this.f38168r0;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super InputStream> dataCallback) throws Throwable {
        try {
            InputStream inputStreamB = b();
            this.f38168r0 = inputStreamB;
            dataCallback.onDataReady(inputStreamB);
        } catch (FileNotFoundException e5) {
            dataCallback.onLoadFailed(e5);
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }
}
