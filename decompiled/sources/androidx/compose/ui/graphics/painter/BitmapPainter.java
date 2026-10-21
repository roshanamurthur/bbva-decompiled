package androidx.compose.ui.graphics.painter;

import a1.b;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BitmapPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R+\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "", "alpha", "", "applyAlpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/compose/ui/graphics/FilterQuality;", "i", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFilterQuality-f-v9h1I$ui_graphics_release", "()I", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "filterQuality", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "Landroidx/compose/ui/graphics/ImageBitmap;", AuthConstants.IMAGE, "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "<init>", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class BitmapPainter extends Painter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ImageBitmap f15871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int filterQuality;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f15875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ColorFilter f15877l;

    public BitmapPainter(ImageBitmap image, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f15871f = image;
        this.f15872g = j10;
        this.f15873h = j11;
        this.filterQuality = FilterQuality.INSTANCE.m2600getLowfv9h1I();
        if (IntOffset.m4507getXimpl(j10) < 0 || IntOffset.m4508getYimpl(j10) < 0 || IntSize.m4549getWidthimpl(j11) < 0 || IntSize.m4548getHeightimpl(j11) < 0 || IntSize.m4549getWidthimpl(j11) > image.getWidth() || IntSize.m4548getHeightimpl(j11) > image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f15875j = j11;
        this.f15876k = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.f15876k = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.f15877l = colorFilter;
        return true;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) other;
        return Intrinsics.areEqual(this.f15871f, bitmapPainter.f15871f) && IntOffset.m4506equalsimpl0(this.f15872g, bitmapPainter.f15872g) && IntSize.m4547equalsimpl0(this.f15873h, bitmapPainter.f15873h) && FilterQuality.m2595equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name and from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo3001getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m4559toSizeozmzZPI(this.f15875j);
    }

    public int hashCode() {
        return FilterQuality.m2596hashCodeimpl(this.filterQuality) + ((IntSize.m4550hashCodeimpl(this.f15873h) + ((IntOffset.m4509hashCodeimpl(this.f15872g) + (this.f15871f.hashCode() * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        b.z(drawScope, this.f15871f, this.f15872g, this.f15873h, 0L, IntSizeKt.IntSize(c.roundToInt(Size.m2344getWidthimpl(drawScope.mo2909getSizeNHjbRc())), c.roundToInt(Size.m2341getHeightimpl(drawScope.mo2909getSizeNHjbRc()))), this.f15876k, null, this.f15877l, 0, this.filterQuality, 328, null);
    }

    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m3002setFilterQualityvDHp3xo$ui_graphics_release(int i10) {
        this.filterQuality = i10;
    }

    @NotNull
    public String toString() {
        return "BitmapPainter(image=" + this.f15871f + ", srcOffset=" + ((Object) IntOffset.m4514toStringimpl(this.f15872g)) + ", srcSize=" + ((Object) IntSize.m4552toStringimpl(this.f15873h)) + ", filterQuality=" + ((Object) FilterQuality.m2597toStringimpl(this.filterQuality)) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, (i10 & 2) != 0 ? IntOffset.INSTANCE.m4517getZeronOccac() : j10, (i10 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j11, null);
    }
}
