package da;

import android.net.Uri;
import com.bbva.glomohybrid.qrscanner.view.GalleryView;
import com.bbva.qr.model.input.BarcodeType;
import com.bbva.qr.model.input.DecoderSettings;
import com.bbva.qr.model.input.ImageSourceType;
import com.bbva.qr.model.input.Source;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: GalleryView.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ GalleryView f68151p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Uri f68152q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GalleryView galleryView, Uri uri) {
        super(0);
        this.f68151p0 = galleryView;
        this.f68152q0 = uri;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f68151p0.f34449q0 = new DecoderSettings(BarcodeType.QR, new Source(ImageSourceType.URI, this.f68152q0.toString()));
        return Unit.INSTANCE;
    }
}
