package com.veridas.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class Util {
    public static String a(Activity activity, byte[] bArr, String str, String str2) throws IOException {
        String str3 = String.format(str2, activity.getFilesDir(), File.separator, str);
        FileOutputStream fileOutputStream = new FileOutputStream(str3);
        fileOutputStream.write(bArr);
        fileOutputStream.close();
        return str3;
    }

    public static ByteArrayInputStream compressSmallImageToByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    public static void copyTo(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public static void deletePrivateLocation(Context context) {
        deleteRecursive(context.getFilesDir());
    }

    public static void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    public static byte[] fileToByteArray(File file) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        if (fileInputStream.read(bArr) == -1) {
            throw new IOException("EOF reached while trying to read");
        }
        fileInputStream.close();
        return bArr;
    }

    public static void saveBitmap(Activity activity, Bitmap bitmap, String str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(String.format("%s%spicture_%s.jpg", activity.getExternalFilesDir(null), File.separator, str));
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        fileOutputStream.close();
    }

    public static String saveBitmapInPrivateLocation(Activity activity, Bitmap bitmap, String str) throws IOException {
        String str2 = String.format("%s%s%s.jpg", activity.getFilesDir(), File.separator, str);
        FileOutputStream fileOutputStream = new FileOutputStream(str2);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        fileOutputStream.close();
        return str2;
    }

    public static String saveBitmapInPublicLocation(Activity activity, Bitmap bitmap, String str) throws IOException {
        String str2 = activity.getExternalFilesDir(null) + str;
        FileOutputStream fileOutputStream = new FileOutputStream(str2);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.close();
        return str2;
    }

    public static String saveInPublicLocation(Activity activity, byte[] bArr, String str) throws IOException {
        String str2 = String.format("%s%sraw_%s", activity.getExternalFilesDir(null), File.separator, str);
        FileOutputStream fileOutputStream = new FileOutputStream(str2);
        fileOutputStream.write(bArr);
        fileOutputStream.close();
        return str2;
    }

    public static String saveJpgInPrivateLocation(Activity activity, byte[] bArr, String str) throws IOException {
        return a(activity, bArr, str, "%s%s%s.jpg");
    }

    public static String saveMp4InPrivateLocation(Activity activity, byte[] bArr, String str) throws IOException {
        return a(activity, bArr, str, "%s%s%s.mp4");
    }

    public static String saveTxtInPrivateLocation(Activity activity, byte[] bArr, String str) throws IOException {
        return a(activity, bArr, str, "%s%s%s.txt");
    }

    public static String saveVttInPrivateLocation(Activity activity, byte[] bArr, String str) throws IOException {
        return a(activity, bArr, str, "%s%s%s.vtt");
    }

    public static byte[] toByteArray(int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("The argument intArray cannot be null.");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iArr.length * 4);
        byteBufferAllocate.asIntBuffer().put(iArr);
        return byteBufferAllocate.array();
    }
}
