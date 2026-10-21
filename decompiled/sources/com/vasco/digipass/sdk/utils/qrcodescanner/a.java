package com.vasco.digipass.sdk.utils.qrcodescanner;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends SurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a f65855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f65856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Activity f65857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f65858d;

    public a(Activity activity) {
        super(activity);
        this.f65858d = false;
        this.f65857c = activity;
        setFilterTouchesWhenObscured(true);
    }

    public float a(float f6, float f10) {
        return Math.max(f6, f10) / Math.min(f6, f10);
    }

    public abstract void a();

    public int getDeviceDefaultOrientation() {
        Configuration configuration = getResources().getConfiguration();
        int iA = a(this.f65857c);
        return (((iA == 0 || iA == 2) && configuration.orientation == 2) || ((iA == 1 || iA == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    public void setCodeType(int i10) {
        this.f65856b = i10;
    }

    public void setImageScannerCallback(com.vasco.digipass.sdk.utils.qrcodescanner.obfuscated.a aVar) {
        this.f65855a = aVar;
    }

    private int a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            return activity.getDisplay().getRotation();
        }
        return activity.getWindowManager().getDefaultDisplay().getRotation();
    }

    public Rect a(int i10, int i11) {
        if (((QRCodeScannerSDKActivity) this.f65857c).isOverlayEnabled()) {
            int iMin = Math.min(i10, i11);
            int iMax = Math.max(i10, i11);
            if (iMax / 2 > iMin) {
                iMax = iMin * 2;
            }
            int i12 = iMax / 2;
            int i13 = (i10 - i12) / 2;
            int i14 = (i11 - i12) / 2;
            return new Rect(i13, i14, i13 + i12, i12 + i14);
        }
        return new Rect(0, 0, i10, i11);
    }

    public byte[] a(byte[] bArr, int i10, Rect rect) {
        byte[] bArr2 = new byte[rect.height() * rect.width()];
        for (int i11 = rect.top; i11 < rect.bottom; i11++) {
            int i12 = i11 * i10;
            int iWidth = rect.width() * (i11 - rect.top);
            for (int i13 = rect.left; i13 < rect.right; i13++) {
                bArr2[(i13 - rect.left) + iWidth] = bArr[i12 + i13];
            }
        }
        return bArr2;
    }
}
