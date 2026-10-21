package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceRenderNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\bX\b\u0080\b\u0018\u00002\u00020\u0001BÖ\u0001\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u000b\u0012\u0006\u0010+\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\u0006\u0010.\u001a\u00020\u000b\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020\u0004\u0012\u0006\u00101\u001a\u00020\u000b\u0012\u0006\u00102\u001a\u00020\u000b\u0012\u0006\u00103\u001a\u00020\u000b\u0012\u0006\u00104\u001a\u00020\u000b\u0012\u0006\u00105\u001a\u00020\u000b\u0012\u0006\u00106\u001a\u00020\u000b\u0012\u0006\u00107\u001a\u00020\u0019\u0012\u0006\u00108\u001a\u00020\u0019\u0012\u0006\u00109\u001a\u00020\u000b\u0012\b\u0010:\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010;\u001a\u00020\u001fø\u0001\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0019HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0019\u0010\"\u001a\u00020\u001fHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010!J\u0092\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\b\b\u0002\u00107\u001a\u00020\u00192\b\b\u0002\u00108\u001a\u00020\u00192\b\b\u0002\u00109\u001a\u00020\u000b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010;\u001a\u00020\u001fHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b<\u0010=J\t\u0010@\u001a\u00020?HÖ\u0001J\t\u0010A\u001a\u00020\u0004HÖ\u0001J\u0013\u0010C\u001a\u00020\u00192\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010!R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010I\u001a\u0004\bL\u0010!R\u0017\u0010&\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010!R\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010I\u001a\u0004\bP\u0010!R\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010I\u001a\u0004\bR\u0010!R\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010I\u001a\u0004\bT\u0010!R\"\u0010*\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010ZR\"\u0010,\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010V\u001a\u0004\b_\u0010X\"\u0004\b`\u0010ZR\"\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010V\u001a\u0004\bb\u0010X\"\u0004\bc\u0010ZR\"\u0010.\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010V\u001a\u0004\be\u0010X\"\u0004\bf\u0010ZR\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010I\u001a\u0004\bh\u0010!\"\u0004\bi\u0010jR\"\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010I\u001a\u0004\bl\u0010!\"\u0004\bm\u0010jR\"\u00101\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010V\u001a\u0004\bo\u0010X\"\u0004\bp\u0010ZR\"\u00102\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010V\u001a\u0004\br\u0010X\"\u0004\bs\u0010ZR\"\u00103\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010V\u001a\u0004\bu\u0010X\"\u0004\bv\u0010ZR\"\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010V\u001a\u0004\bx\u0010X\"\u0004\by\u0010ZR\"\u00105\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010V\u001a\u0004\b{\u0010X\"\u0004\b|\u0010ZR\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010V\u001a\u0004\b~\u0010X\"\u0004\b\u007f\u0010ZR(\u00107\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R(\u00108\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0081\u0001\u001a\u0006\b\u0087\u0001\u0010\u0083\u0001\"\u0006\b\u0088\u0001\u0010\u0085\u0001R%\u00109\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010V\u001a\u0005\b\u008a\u0001\u0010X\"\u0005\b\u008b\u0001\u0010ZR*\u0010:\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R.\u0010;\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010I\u001a\u0005\b\u0093\u0001\u0010!\"\u0005\b\u0094\u0001\u0010j\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0097\u0001"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "", "component21", "component22", "component23", "Landroidx/compose/ui/graphics/RenderEffect;", "component24", "Landroidx/compose/ui/graphics/CompositingStrategy;", "component25--NrFUSI", "()I", "component25", "uniqueId", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "width", "height", "scaleX", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "clipToOutline", "clipToBounds", "alpha", "renderEffect", "compositingStrategy", "copy-fuCbV5c", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;I)Landroidx/compose/ui/platform/DeviceRenderNodeData;", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "J", "getUniqueId", "()J", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLeft", "c", "getTop", "d", "getRight", "e", "getBottom", "f", "getWidth", "g", "getHeight", "h", "F", "getScaleX", "()F", "setScaleX", "(F)V", "i", "getScaleY", "setScaleY", "j", "getTranslationX", "setTranslationX", "k", "getTranslationY", "setTranslationY", "l", "getElevation", "setElevation", "m", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "n", "getSpotShadowColor", "setSpotShadowColor", "o", "getRotationZ", "setRotationZ", "p", "getRotationX", "setRotationX", "q", "getRotationY", "setRotationY", "r", "getCameraDistance", "setCameraDistance", "s", "getPivotX", "setPivotX", "t", "getPivotY", "setPivotY", "u", "Z", "getClipToOutline", "()Z", "setClipToOutline", "(Z)V", SharedPrefsStorage.VERSION_KEY, "getClipToBounds", "setClipToBounds", "w", "getAlpha", "setAlpha", "x", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "y", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DeviceRenderNodeData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long uniqueId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int left;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int top;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int right;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int bottom;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float scaleX;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public float scaleY;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float translationX;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public float translationY;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float elevation;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int ambientShadowColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int spotShadowColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public float rotationZ;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public float rotationX;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public float rotationY;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public float cameraDistance;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public float pivotX;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public float pivotY;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public boolean clipToOutline;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public boolean clipToBounds;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public float alpha;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public RenderEffect renderEffect;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public int compositingStrategy;

    public DeviceRenderNodeData(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f6, float f10, float f11, float f12, float f13, int i16, int i17, float f14, float f15, float f16, float f17, float f18, float f19, boolean z10, boolean z11, float f20, RenderEffect renderEffect, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this.uniqueId = j10;
        this.left = i10;
        this.top = i11;
        this.right = i12;
        this.bottom = i13;
        this.width = i14;
        this.height = i15;
        this.scaleX = f6;
        this.scaleY = f10;
        this.translationX = f11;
        this.translationY = f12;
        this.elevation = f13;
        this.ambientShadowColor = i16;
        this.spotShadowColor = i17;
        this.rotationZ = f14;
        this.rotationX = f15;
        this.rotationY = f16;
        this.cameraDistance = f17;
        this.pivotX = f18;
        this.pivotY = f19;
        this.clipToOutline = z10;
        this.clipToBounds = z11;
        this.alpha = f20;
        this.renderEffect = renderEffect;
        this.compositingStrategy = i18;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUniqueId() {
        return this.uniqueId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: component25--NrFUSI, reason: not valid java name and from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-fuCbV5c, reason: not valid java name */
    public final DeviceRenderNodeData m3795copyfuCbV5c(long uniqueId, int left, int top, int right, int bottom, int width, int height, float scaleX, float scaleY, float translationX, float translationY, float elevation, int ambientShadowColor, int spotShadowColor, float rotationZ, float rotationX, float rotationY, float cameraDistance, float pivotX, float pivotY, boolean clipToOutline, boolean clipToBounds, float alpha, @Nullable RenderEffect renderEffect, int compositingStrategy) {
        return new DeviceRenderNodeData(uniqueId, left, top, right, bottom, width, height, scaleX, scaleY, translationX, translationY, elevation, ambientShadowColor, spotShadowColor, rotationZ, rotationX, rotationY, cameraDistance, pivotX, pivotY, clipToOutline, clipToBounds, alpha, renderEffect, compositingStrategy, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) other;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && Intrinsics.areEqual(this.renderEffect, deviceRenderNodeData.renderEffect) && CompositingStrategy.m2585equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m3796getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    @Nullable
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public int hashCode() {
        long j10 = this.uniqueId;
        int iA = z1.a(this.pivotY, z1.a(this.pivotX, z1.a(this.cameraDistance, z1.a(this.rotationY, z1.a(this.rotationX, z1.a(this.rotationZ, (((z1.a(this.elevation, z1.a(this.translationY, z1.a(this.translationX, z1.a(this.scaleY, z1.a(this.scaleX, ((((((((((((((int) (j10 ^ (j10 >>> 32))) * 31) + this.left) * 31) + this.top) * 31) + this.right) * 31) + this.bottom) * 31) + this.width) * 31) + this.height) * 31, 31), 31), 31), 31), 31) + this.ambientShadowColor) * 31) + this.spotShadowColor) * 31, 31), 31), 31), 31), 31), 31);
        boolean z10 = this.clipToOutline;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iA + r3) * 31;
        boolean z11 = this.clipToBounds;
        int iA2 = z1.a(this.alpha, (i10 + (z11 ? 1 : z11)) * 31, 31);
        RenderEffect renderEffect = this.renderEffect;
        return CompositingStrategy.m2586hashCodeimpl(this.compositingStrategy) + ((iA2 + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31);
    }

    public final void setAlpha(float f6) {
        this.alpha = f6;
    }

    public final void setAmbientShadowColor(int i10) {
        this.ambientShadowColor = i10;
    }

    public final void setCameraDistance(float f6) {
        this.cameraDistance = f6;
    }

    public final void setClipToBounds(boolean z10) {
        this.clipToBounds = z10;
    }

    public final void setClipToOutline(boolean z10) {
        this.clipToOutline = z10;
    }

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m3797setCompositingStrategyaDBOjCE(int i10) {
        this.compositingStrategy = i10;
    }

    public final void setElevation(float f6) {
        this.elevation = f6;
    }

    public final void setPivotX(float f6) {
        this.pivotX = f6;
    }

    public final void setPivotY(float f6) {
        this.pivotY = f6;
    }

    public final void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f6) {
        this.rotationX = f6;
    }

    public final void setRotationY(float f6) {
        this.rotationY = f6;
    }

    public final void setRotationZ(float f6) {
        this.rotationZ = f6;
    }

    public final void setScaleX(float f6) {
        this.scaleX = f6;
    }

    public final void setScaleY(float f6) {
        this.scaleY = f6;
    }

    public final void setSpotShadowColor(int i10) {
        this.spotShadowColor = i10;
    }

    public final void setTranslationX(float f6) {
        this.translationX = f6;
    }

    public final void setTranslationY(float f6) {
        this.translationY = f6;
    }

    @NotNull
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", compositingStrategy=" + ((Object) CompositingStrategy.m2587toStringimpl(this.compositingStrategy)) + RootService.CLOSE_BRACKET;
    }
}
