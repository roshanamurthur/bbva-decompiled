package com.facetec.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import android.text.AndroidCharacter;
import android.util.Size;
import android.view.Surface;
import android.view.ViewConfiguration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
@TargetApi(21)
final class dp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f41332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f41333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f41334c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Allocation f41335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Allocation f41336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScriptIntrinsicYuvToRGB f41337f;

    @FunctionalInterface
    public interface b {
        void onImageAvailable(byte[] bArr, Size size);
    }

    public dp(Context context, Size size) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        Type.Builder builder = new Type.Builder(renderScriptCreate, Element.YUV(renderScriptCreate));
        builder.setX(size.getWidth());
        builder.setY(size.getHeight());
        builder.setYuvFormat(35);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, builder.create(), 33);
        this.f41336e = allocationCreateTyped;
        allocationCreateTyped.setOnBufferAvailableListener(new Allocation.OnBufferAvailableListener() { // from class: com.facetec.sdk.u7
            @Override // android.renderscript.Allocation.OnBufferAvailableListener
            public final void onBufferAvailable(Allocation allocation) {
                this.f42904a.cb_(allocation);
            }
        });
        this.f41332a = size;
        ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGBCreate = ScriptIntrinsicYuvToRGB.create(renderScriptCreate, Element.createPixel(renderScriptCreate, Element.DataType.UNSIGNED_8, Element.DataKind.PIXEL_YUV));
        this.f41337f = scriptIntrinsicYuvToRGBCreate;
        scriptIntrinsicYuvToRGBCreate.setInput(allocationCreateTyped);
        this.f41335d = Allocation.createTyped(renderScriptCreate, new Type.Builder(renderScriptCreate, Element.RGBA_8888(renderScriptCreate)).setX(size.getWidth()).setY(size.getHeight()).create(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cb_(Allocation allocation) {
        this.f41336e.ioReceive();
        b bVar = this.f41333b;
        if (bVar == null) {
            return;
        }
        this.f41337f.forEach(this.f41335d);
        int bytesSize = this.f41335d.getBytesSize();
        byte[] bArr = new byte[bytesSize];
        this.f41335d.copyTo(bArr);
        if (this.f41334c.getAndSet(false)) {
            byte[] bArr2 = new byte[bytesSize];
            this.f41335d.copyTo(bArr2);
            bn.a$24662222((Enum) ((Class) bp.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26, AndroidCharacter.getMirror('0') - '0', (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getField("d").get(null), !Arrays.equals(bArr, bArr2));
        }
        bVar.onImageAvailable(bArr, this.f41332a);
    }

    public final Surface ca_() {
        return this.f41336e.getSurface();
    }

    public final void e(b bVar) {
        this.f41333b = bVar;
    }
}
