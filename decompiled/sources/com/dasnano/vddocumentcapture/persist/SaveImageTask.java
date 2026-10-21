package com.dasnano.vddocumentcapture.persist;

import android.content.Context;
import android.graphics.Point;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.dasnano.vddocumentcapture.BuildConfig;
import com.dasnano.vddocumentcapture.other.VDEnums;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.bidicode.entities.BidiCodeInfo;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;
import com.veridas.graphics.ImageUtils;
import com.veridas.log.Log;
import com.veridas.math.geometry.Matrix;
import com.veridas.math.geometry.Rectangle;
import com.veridas.math.geometry.Vector2;
import com.veridas.metadata.ExifMetadataIO;
import com.veridas.metadata.entities.ArtifactClass;
import com.veridas.metadata.entities.IntegrityCalculation;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SaveImageTask.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 82\u00020\u0001:\u000398:BO\b\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 \u0012\u0006\u0010+\u001a\u00020&¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u001a\u0010\u0012\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u00101\u001a\u00020,8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u0006;"}, d2 = {"Lcom/dasnano/vddocumentcapture/persist/SaveImageTask;", "Ljava/lang/Runnable;", "", "run", "Ljava/nio/ByteBuffer;", AuthConstants.IMAGE, "", "compressed", "Lcom/veridas/camera/resolution/Resolution;", "resolution", "Lcom/veridas/math/geometry/Rectangle;", "detection", "process", "Lcom/veridas/metadata/entities/ArtifactClass;", "s0", "Lcom/veridas/metadata/entities/ArtifactClass;", "getArtifactClass", "()Lcom/veridas/metadata/entities/ArtifactClass;", "artifactClass", "", "Lcom/veridas/bidicode/entities/BidiCodeInfo;", "t0", "Ljava/util/List;", "getBidiCodes", "()Ljava/util/List;", "bidiCodes", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "u0", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "getCaptureType", "()Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "captureType", "Landroid/content/Context;", "v0", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;", "w0", "Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;", "getDelegate", "()Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;", "delegate", "Lcom/veridas/graphics/ImageUtils;", "x0", "Lcom/veridas/graphics/ImageUtils;", "getImageUtils", "()Lcom/veridas/graphics/ImageUtils;", "imageUtils", "", "maximumMegapixels", "Lcom/veridas/camera/picture/Picture;", "picture", "<init>", "(Lcom/veridas/math/geometry/Rectangle;DLcom/veridas/camera/picture/Picture;Lcom/veridas/metadata/entities/ArtifactClass;Ljava/util/List;Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;Landroid/content/Context;Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;)V", "Companion", "Builder", "Delegate", "document-capture_release"}, k = 1, mv = {1, 9, 0})
public class SaveImageTask implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Rectangle f39496p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final double f39497q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Picture f39498r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArtifactClass artifactClass;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<BidiCodeInfo> bidiCodes;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final VDEnums.VDCaptureType captureType;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Delegate delegate;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageUtils imageUtils;

    /* JADX INFO: compiled from: SaveImageTask.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\b\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0013J\u0012\u0010\u0017\u001a\u00020\u00002\n\u0010\u0005\u001a\u00060\u0015j\u0002`\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u001bJ\u008f\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\t\u0010!\u001a\u00020 HÖ\u0001J\u0013\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006&"}, d2 = {"Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Builder;", "", "Lcom/dasnano/vddocumentcapture/persist/SaveImageTask;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/metadata/entities/ArtifactClass;", "value", "artifactClass", "", "Lcom/veridas/bidicode/entities/BidiCodeInfo;", "bidiCodes", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "captureType", "Landroid/content/Context;", "context", "", "cropImage", "cropScreen", "Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;", "delegate", "Lcom/veridas/math/geometry/Rectangle;", "detection", "Lcom/veridas/math/geometry/Vector2;", "Lcom/veridas/math/geometry/Point;", "displaySize", "Landroid/graphics/Point;", "", "maximumMegapixels", "Lcom/veridas/camera/picture/Picture;", "picture", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "<init>", "(ZZLcom/veridas/metadata/entities/ArtifactClass;Ljava/util/List;Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;Landroid/content/Context;Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Vector2;DLcom/veridas/camera/picture/Picture;)V", "document-capture_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f39504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f39505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public ArtifactClass f39506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public List<BidiCodeInfo> f39507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public VDEnums.VDCaptureType f39508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public Context f39509f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Delegate f39510g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public Rectangle f39511h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Vector2 f39512i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f39513j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public Picture f39514k;

        @JvmOverloads
        public Builder() {
            this(false, false, null, null, null, null, null, null, null, 0.0d, null, 2047, null);
        }

        @NotNull
        public final Builder artifactClass(@NotNull ArtifactClass value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f39506c = value;
            return this;
        }

        @NotNull
        public final Builder bidiCodes(@NotNull List<BidiCodeInfo> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f39507d = value;
            return this;
        }

        @NotNull
        public final SaveImageTask build() {
            List<BidiCodeInfo> list = this.f39507d;
            if (list == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Context context = this.f39509f;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Delegate delegate = this.f39510g;
            if (delegate == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Rectangle rectangle = this.f39511h;
            if (rectangle == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Picture picture = this.f39514k;
            if (picture == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            if (!this.f39504a) {
                return new SaveDocumentTask(context, rectangle, this.f39513j, picture, this.f39506c, this.f39508e, delegate, list);
            }
            if (this.f39505b) {
                Vector2 vector2 = this.f39512i;
                if (vector2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                return new SaveDocumentScreenCropTask(context, rectangle, this.f39513j, picture, this.f39506c, this.f39508e, delegate, list, vector2);
            }
            VDEnums.VDCaptureType vDCaptureType = this.f39508e;
            if (vDCaptureType == VDEnums.VDCaptureType.VD_OBVERSE_PASSPORT_WITHOUT_FLASH) {
                return new SavePassportCropTask(context, rectangle, this.f39513j, picture, this.f39506c, vDCaptureType, delegate, list);
            }
            return new SaveDocumentCropTask(context, rectangle, this.f39513j, picture, this.f39506c, vDCaptureType, delegate, list);
        }

        @NotNull
        public final Builder captureType(@NotNull VDEnums.VDCaptureType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f39508e = value;
            return this;
        }

        @NotNull
        public final Builder context(@NotNull Context value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f39509f = value;
            return this;
        }

        @NotNull
        public final Builder copy(boolean cropImage, boolean cropScreen, @NotNull ArtifactClass artifactClass, @Nullable List<BidiCodeInfo> bidiCodes, @NotNull VDEnums.VDCaptureType captureType, @Nullable Context context, @Nullable Delegate delegate, @Nullable Rectangle detection, @Nullable Vector2 displaySize, double maximumMegapixels, @Nullable Picture picture) {
            Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
            Intrinsics.checkNotNullParameter(captureType, "captureType");
            return new Builder(cropImage, cropScreen, artifactClass, bidiCodes, captureType, context, delegate, detection, displaySize, maximumMegapixels, picture);
        }

        @NotNull
        public final Builder cropImage(boolean value) {
            this.f39504a = value;
            return this;
        }

        @NotNull
        public final Builder cropScreen(boolean value) {
            this.f39505b = value;
            return this;
        }

        @NotNull
        public final Builder delegate(@NotNull Delegate value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f39510g = value;
            return this;
        }

        @NotNull
        public final Builder detection(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f39511h = value;
            return this;
        }

        @NotNull
        public final Builder displaySize(@NotNull Vector2 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f39512i = value;
            return this;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return this.f39504a == builder.f39504a && this.f39505b == builder.f39505b && this.f39506c == builder.f39506c && Intrinsics.areEqual(this.f39507d, builder.f39507d) && this.f39508e == builder.f39508e && Intrinsics.areEqual(this.f39509f, builder.f39509f) && Intrinsics.areEqual(this.f39510g, builder.f39510g) && Intrinsics.areEqual(this.f39511h, builder.f39511h) && Intrinsics.areEqual(this.f39512i, builder.f39512i) && Double.compare(this.f39513j, builder.f39513j) == 0 && Intrinsics.areEqual(this.f39514k, builder.f39514k);
        }

        public int hashCode() {
            int iHashCode = (this.f39506c.hashCode() + ((((this.f39504a ? 1231 : 1237) * 31) + (this.f39505b ? 1231 : 1237)) * 31)) * 31;
            List<BidiCodeInfo> list = this.f39507d;
            int iHashCode2 = (this.f39508e.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
            Context context = this.f39509f;
            int iHashCode3 = (iHashCode2 + (context == null ? 0 : context.hashCode())) * 31;
            Delegate delegate = this.f39510g;
            int iHashCode4 = (iHashCode3 + (delegate == null ? 0 : delegate.hashCode())) * 31;
            Rectangle rectangle = this.f39511h;
            int iHashCode5 = (iHashCode4 + (rectangle == null ? 0 : rectangle.hashCode())) * 31;
            Vector2 vector2 = this.f39512i;
            int iHashCode6 = vector2 == null ? 0 : vector2.hashCode();
            long jDoubleToLongBits = Double.doubleToLongBits(this.f39513j);
            int i10 = (((iHashCode5 + iHashCode6) * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
            Picture picture = this.f39514k;
            return i10 + (picture != null ? picture.hashCode() : 0);
        }

        @NotNull
        public final Builder maximumMegapixels(double value) {
            this.f39513j = value;
            return this;
        }

        @NotNull
        public final Builder picture(@NotNull Picture value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f39514k = value;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(cropImage=" + this.f39504a + ", cropScreen=" + this.f39505b + ", artifactClass=" + this.f39506c + ", bidiCodes=" + this.f39507d + ", captureType=" + this.f39508e + ", context=" + this.f39509f + ", delegate=" + this.f39510g + ", detection=" + this.f39511h + ", displaySize=" + this.f39512i + ", maximumMegapixels=" + this.f39513j + ", picture=" + this.f39514k + ")";
        }

        @JvmOverloads
        public Builder(boolean z10) {
            this(z10, false, null, null, null, null, null, null, null, 0.0d, null, 2046, null);
        }

        @NotNull
        public final Builder displaySize(@NotNull Point value) {
            Intrinsics.checkNotNullParameter(value, "value");
            displaySize(Vector2.INSTANCE.from(value));
            return this;
        }

        @JvmOverloads
        public Builder(boolean z10, boolean z11) {
            this(z10, z11, null, null, null, null, null, null, null, 0.0d, null, 2044, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Builder(boolean z10, boolean z11, @NotNull ArtifactClass artifactClass) {
            this(z10, z11, artifactClass, null, null, null, null, null, null, 0.0d, null, 2040, null);
            Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Builder(boolean z10, boolean z11, @NotNull ArtifactClass artifactClass, @Nullable List<BidiCodeInfo> list) {
            this(z10, z11, artifactClass, list, null, null, null, null, null, 0.0d, null, 2032, null);
            Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Builder(boolean z10, boolean z11, @NotNull ArtifactClass artifactClass, @Nullable List<BidiCodeInfo> list, @NotNull VDEnums.VDCaptureType captureType) {
            this(z10, z11, artifactClass, list, captureType, null, null, null, null, 0.0d, null, 2016, null);
            Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
            Intrinsics.checkNotNullParameter(captureType, "captureType");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Builder(boolean z10, boolean z11, @NotNull ArtifactClass artifactClass, @Nullable List<BidiCodeInfo> list, @NotNull VDEnums.VDCaptureType captureType, @Nullable Context context) {
            this(z10, z11, artifactClass, list, captureType, context, null, null, null, 0.0d, null, 1984, null);
            Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
            Intrinsics.checkNotNullParameter(captureType, "captureType");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Builder(boolean z10, boolean z11, @NotNull ArtifactClass artifactClass, @Nullable List<BidiCodeInfo> list, @NotNull VDEnums.VDCaptureType captureType, @Nullable Context context, @Nullable Delegate delegate) {
            this(z10, z11, artifactClass, list, captureType, context, delegate, null, null, 0.0d, null, 1920, null);
            Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
            Intrinsics.checkNotNullParameter(captureType, "captureType");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Builder(boolean z10, boolean z11, @NotNull ArtifactClass artifactClass, @Nullable List<BidiCodeInfo> list, @NotNull VDEnums.VDCaptureType captureType, @Nullable Context context, @Nullable Delegate delegate, @Nullable Rectangle rectangle) {
            this(z10, z11, artifactClass, list, captureType, context, delegate, rectangle, null, 0.0d, null, 1792, null);
            Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
            Intrinsics.checkNotNullParameter(captureType, "captureType");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Builder(boolean z10, boolean z11, @NotNull ArtifactClass artifactClass, @Nullable List<BidiCodeInfo> list, @NotNull VDEnums.VDCaptureType captureType, @Nullable Context context, @Nullable Delegate delegate, @Nullable Rectangle rectangle, @Nullable Vector2 vector2) {
            this(z10, z11, artifactClass, list, captureType, context, delegate, rectangle, vector2, 0.0d, null, 1536, null);
            Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
            Intrinsics.checkNotNullParameter(captureType, "captureType");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Builder(boolean z10, boolean z11, @NotNull ArtifactClass artifactClass, @Nullable List<BidiCodeInfo> list, @NotNull VDEnums.VDCaptureType captureType, @Nullable Context context, @Nullable Delegate delegate, @Nullable Rectangle rectangle, @Nullable Vector2 vector2, double d2) {
            this(z10, z11, artifactClass, list, captureType, context, delegate, rectangle, vector2, d2, null, 1024, null);
            Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
            Intrinsics.checkNotNullParameter(captureType, "captureType");
        }

        @JvmOverloads
        public Builder(boolean z10, boolean z11, @NotNull ArtifactClass artifactClass, @Nullable List<BidiCodeInfo> list, @NotNull VDEnums.VDCaptureType captureType, @Nullable Context context, @Nullable Delegate delegate, @Nullable Rectangle rectangle, @Nullable Vector2 vector2, double d2, @Nullable Picture picture) {
            Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
            Intrinsics.checkNotNullParameter(captureType, "captureType");
            this.f39504a = z10;
            this.f39505b = z11;
            this.f39506c = artifactClass;
            this.f39507d = list;
            this.f39508e = captureType;
            this.f39509f = context;
            this.f39510g = delegate;
            this.f39511h = rectangle;
            this.f39512i = vector2;
            this.f39513j = d2;
            this.f39514k = picture;
        }

        public /* synthetic */ Builder(boolean z10, boolean z11, ArtifactClass artifactClass, List list, VDEnums.VDCaptureType vDCaptureType, Context context, Delegate delegate, Rectangle rectangle, Vector2 vector2, double d2, Picture picture, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) == 0 ? z11 : false, (i10 & 4) != 0 ? ArtifactClass.DOCUMENT_OBVERSE : artifactClass, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? VDEnums.VDCaptureType.VD_OBVERSE_WITHOUT_FLASH : vDCaptureType, (i10 & 32) != 0 ? null : context, (i10 & 64) != 0 ? null : delegate, (i10 & 128) != 0 ? null : rectangle, (i10 & 256) != 0 ? null : vector2, (i10 & 512) != 0 ? 1.0d : d2, (i10 & 1024) == 0 ? picture : null);
        }
    }

    /* JADX INFO: compiled from: SaveImageTask.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/dasnano/vddocumentcapture/persist/SaveImageTask$Delegate;", "", "finish", "", "processed", "data", "", "isCrop", "", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Delegate {
        void finish();

        void processed(@Nullable byte[] data, boolean isCrop);
    }

    public SaveImageTask(@NotNull Rectangle detection, double d2, @NotNull Picture picture, @NotNull ArtifactClass artifactClass, @NotNull List<BidiCodeInfo> bidiCodes, @NotNull VDEnums.VDCaptureType captureType, @NotNull Context context, @NotNull Delegate delegate) {
        Intrinsics.checkNotNullParameter(detection, "detection");
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
        Intrinsics.checkNotNullParameter(bidiCodes, "bidiCodes");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f39496p0 = detection;
        this.f39497q0 = d2;
        this.f39498r0 = picture;
        this.artifactClass = artifactClass;
        this.bidiCodes = bidiCodes;
        this.captureType = captureType;
        this.context = context;
        this.delegate = delegate;
        this.imageUtils = new ImageUtils();
    }

    @NotNull
    public final ArtifactClass getArtifactClass() {
        return this.artifactClass;
    }

    @NotNull
    public final List<BidiCodeInfo> getBidiCodes() {
        return this.bidiCodes;
    }

    @NotNull
    public final VDEnums.VDCaptureType getCaptureType() {
        return this.captureType;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Delegate getDelegate() {
        return this.delegate;
    }

    @NotNull
    public final ImageUtils getImageUtils() {
        return this.imageUtils;
    }

    public void process(@NotNull ByteBuffer image, @NotNull byte[] compressed, @NotNull Resolution resolution, @NotNull Rectangle detection) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(compressed, "compressed");
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        Intrinsics.checkNotNullParameter(detection, "detection");
    }

    @Override // java.lang.Runnable
    public void run() {
        Resolution resolutionFindOptimalResolutionForMegapixels;
        Rectangle rectangleTimes;
        boolean z10;
        boolean z11;
        Picture picture = this.f39498r0;
        int rotation = picture.getRotation();
        ByteBuffer buffer = picture.getBuffer();
        Resolution resolution = picture.getResolution();
        Intrinsics.checkNotNull(buffer);
        Intrinsics.checkNotNull(resolution);
        ImageUtils.Companion companion = ImageUtils.INSTANCE;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(companion.calculateBufferSizeForRgba(resolution.width, resolution.height));
        Intrinsics.checkNotNull(byteBufferAllocateDirect);
        int i10 = resolution.width;
        int i11 = resolution.height;
        ImageUtils imageUtils = this.imageUtils;
        imageUtils.decompressJpeg(buffer, byteBufferAllocateDirect, i10, i11);
        double d2 = ((double) (resolution.width * resolution.height)) / 1000000.0d;
        double d3 = this.f39497q0;
        double d7 = 0.5d + d3;
        Rectangle rectangle = this.f39496p0;
        if (d2 <= d7 || Math.abs(resolution.mp - Resolution.OPTIMAL_ASPECT_RATIO.aspectRatio) >= 0.005f) {
            resolutionFindOptimalResolutionForMegapixels = resolution;
            rectangleTimes = rectangle;
            z10 = false;
        } else {
            resolutionFindOptimalResolutionForMegapixels = Resolution.findOptimalResolutionForMegapixels((float) d3);
            Intrinsics.checkNotNull(resolutionFindOptimalResolutionForMegapixels);
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(companion.calculateBufferSizeForRgba(resolutionFindOptimalResolutionForMegapixels.width, resolutionFindOptimalResolutionForMegapixels.height));
            ImageUtils imageUtils2 = this.imageUtils;
            Intrinsics.checkNotNull(byteBufferAllocateDirect2);
            imageUtils2.scaleTo(byteBufferAllocateDirect, byteBufferAllocateDirect2, resolution.width, resolution.height, resolutionFindOptimalResolutionForMegapixels.width, resolutionFindOptimalResolutionForMegapixels.height);
            Intrinsics.checkNotNull(resolutionFindOptimalResolutionForMegapixels);
            Vector2.Companion companion2 = Vector2.INSTANCE;
            Point point = resolution.toPoint();
            Intrinsics.checkNotNullExpressionValue(point, "toPoint(...)");
            Vector2 vector2From = companion2.from(point);
            Point point2 = resolutionFindOptimalResolutionForMegapixels.toPoint();
            Intrinsics.checkNotNullExpressionValue(point2, "toPoint(...)");
            Vector2 vector2Div = companion2.from(point2).div(vector2From);
            rectangleTimes = rectangle.times(Matrix.INSTANCE.scale(vector2Div.getX(), vector2Div.getY()));
            byteBufferAllocateDirect = byteBufferAllocateDirect2;
            z10 = true;
        }
        if (rotation != 0) {
            imageUtils.rotateUp(byteBufferAllocateDirect, resolutionFindOptimalResolutionForMegapixels.width, resolutionFindOptimalResolutionForMegapixels.height, rotation);
            z11 = true;
        } else {
            z11 = z10;
        }
        int iLimit = buffer.limit();
        if (z11) {
            buffer = ByteBuffer.allocateDirect(companion.calculateBufferSizeForRgba(resolution.width, resolution.height));
            Intrinsics.checkNotNull(buffer);
            iLimit = imageUtils.compressJpeg(byteBufferAllocateDirect, buffer, resolutionFindOptimalResolutionForMegapixels.width, resolutionFindOptimalResolutionForMegapixels.height);
        }
        if (buffer.position() != 0) {
            buffer.flip();
        }
        byte[] bArr = new byte[iLimit];
        buffer.get(bArr);
        IntegrityCalculation.Companion companion3 = IntegrityCalculation.INSTANCE;
        ArtifactClass artifactClass = this.artifactClass;
        byte[] bytes = artifactClass.getClassName().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrHashString = companion3.hashString(bytes, "SHA-256");
        byte[] bArrWriteDocumentCaptureMetadata = new byte[bArrHashString.length + iLimit];
        System.arraycopy(bArr, 0, bArrWriteDocumentCaptureMetadata, 0, iLimit);
        System.arraycopy(bArrHashString, 0, bArrWriteDocumentCaptureMetadata, iLimit, bArrHashString.length);
        try {
            bArrWriteDocumentCaptureMetadata = ExifMetadataIO.writeDocumentCaptureMetadata(this.context, BuildConfig.VERSION_NAME, bArrWriteDocumentCaptureMetadata, this.bidiCodes, artifactClass);
        } catch (IllegalStateException e5) {
            Log.e("SaveImageTask", e5);
        }
        Intrinsics.checkNotNull(resolutionFindOptimalResolutionForMegapixels);
        process(byteBufferAllocateDirect, bArrWriteDocumentCaptureMetadata, resolutionFindOptimalResolutionForMegapixels, rectangleTimes);
        this.delegate.finish();
    }
}
