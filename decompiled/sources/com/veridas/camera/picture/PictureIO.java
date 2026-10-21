package com.veridas.camera.picture;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class PictureIO {
    public static void writeAsJpeg(Picture picture, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        writeAsJpeg(picture, fileOutputStream);
        fileOutputStream.close();
    }

    public static void writeAsJpeg(Picture picture, OutputStream outputStream) throws IOException {
        picture.getBitmap().compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
        outputStream.close();
    }
}
