package com.dasnano.vdvideoselfiecapture.fragments;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.veridas.lib.entities.resources.Document;
import com.veridas.resource.AndroidResourcesUtil;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f39837p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39838q0;

    public g(VideoFragment videoFragment, String str) {
        this.f39838q0 = videoFragment;
        this.f39837p0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] obverseStencilBytes;
        VideoFragment videoFragment = this.f39838q0;
        String str = this.f39837p0;
        if (str == null || str.equalsIgnoreCase("")) {
            videoFragment.f39734e1.setImageBitmap(null);
            videoFragment.f39734e1.requestLayout();
            return;
        }
        boolean zIsPassport = Document.isPassport(str);
        Document documentById = videoFragment.getBlockingResourcesDatabaseLazy().getDocumentById(str);
        if (documentById != null) {
            obverseStencilBytes = (zIsPassport || !videoFragment.x()) ? videoFragment.getBlockingResourcesDatabaseLazy().getObverseStencilBytes(documentById.getId()) : videoFragment.getBlockingResourcesDatabaseLazy().getReverseStencilBytes(documentById.getId());
        } else {
            obverseStencilBytes = null;
        }
        Bitmap bitmapBytesToBitmap = obverseStencilBytes != null ? AndroidResourcesUtil.bytesToBitmap(obverseStencilBytes) : null;
        if (bitmapBytesToBitmap == null) {
            videoFragment.f39734e1.setImageBitmap(null);
            videoFragment.f39734e1.requestLayout();
            return;
        }
        int width = bitmapBytesToBitmap.getWidth();
        int height = bitmapBytesToBitmap.getHeight();
        float fWidth = videoFragment.f39736f1.width() / width;
        float fHeight = videoFragment.f39736f1.height() / height;
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        matrix.postScale(fWidth, fHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapBytesToBitmap, 0, 0, width, height, matrix, true);
        videoFragment.f39734e1.setX(videoFragment.f39736f1.left);
        videoFragment.f39734e1.setY(videoFragment.f39736f1.top);
        videoFragment.f39734e1.setImageBitmap(bitmapCreateBitmap);
        videoFragment.f39734e1.requestLayout();
    }
}
