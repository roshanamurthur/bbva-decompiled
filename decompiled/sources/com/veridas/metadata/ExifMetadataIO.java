package com.veridas.metadata;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.veridas.Veridas;
import com.veridas.bidicode.entities.BidiCodeInfo;
import com.veridas.log.Log;
import com.veridas.metadata.entities.Agent;
import com.veridas.metadata.entities.ArtifactClass;
import com.veridas.metadata.entities.ImageValidator;
import com.veridas.metadata.entities.Integrity;
import com.veridas.metadata.entities.IntegrityImage;
import com.veridas.util.ByteArrayUtil;
import com.veridas.util.StringUtil;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExifMetadataIO.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J6\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0006J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0013¨\u0006\u0017"}, d2 = {"Lcom/veridas/metadata/ExifMetadataIO;", "", "Landroid/content/Context;", "context", "", "agentVersion", "", "imageData", "", "Lcom/veridas/bidicode/entities/BidiCodeInfo;", "bidiCodeInfoList", "Lcom/veridas/metadata/entities/ArtifactClass;", "artifactClass", "writeDocumentCaptureMetadata", "", "isSelfieAlive", "writePhotoSelfieCaptureMetadata", "byteArray", "readMetadata", "Ljava/io/InputStream;", "inputStream", "<init>", "()V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nExifMetadataIO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExifMetadataIO.kt\ncom/veridas/metadata/ExifMetadataIO\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
public final class ExifMetadataIO {

    @NotNull
    public static final ExifMetadataIO INSTANCE = new ExifMetadataIO();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static final String f67231a = Reflection.getOrCreateKotlinClass(ExifMetadataIO.class).getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SimpleDateFormat f67232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final SimpleDateFormat f67233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f67234d;

    static {
        Locale locale = Locale.ROOT;
        f67232b = new SimpleDateFormat(Veridas.EXIF_FULL_DATE_FORMAT, locale);
        f67233c = new SimpleDateFormat(Veridas.EXIF_SHORT_DATE_FORMAT, locale);
        f67234d = StringUtil.INSTANCE.convertToString(ByteArrayUtil.byteArrayOfInts(65, 83, 67, 73, 73, 0, 0, 0));
    }

    public static byte[] a(Context context, ImageValidator imageValidator, List list, MetadataBuilder metadataBuilder) throws Throwable {
        String attribute;
        Date date;
        byte[] bytes = imageValidator.getBytes();
        File file = new File(context.getCacheDir().getPath(), "tempExifFile_" + UUID.randomUUID());
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            ExifInterface exifInterface = new ExifInterface(file);
            String attribute2 = exifInterface.getAttribute(ExifInterface.TAG_IMAGE_LENGTH);
            if (attribute2 == null) {
                attribute2 = "-1";
            }
            String attribute3 = exifInterface.getAttribute(ExifInterface.TAG_IMAGE_WIDTH);
            String str = attribute3 != null ? attribute3 : "-1";
            Date date2 = new Date();
            if (exifInterface.hasAttribute(ExifInterface.TAG_DATETIME) && (attribute = exifInterface.getAttribute(ExifInterface.TAG_DATETIME)) != null) {
                Veridas veridas = Veridas.INSTANCE;
                boolean zMatches = veridas.getFULL_DATE_PATTERN().matches(attribute);
                String str2 = f67231a;
                if (zMatches) {
                    try {
                        date = f67232b.parse(attribute);
                        Intrinsics.checkNotNull(date);
                        date2 = date;
                    } catch (Exception e5) {
                        Log.e(str2, e5);
                    }
                } else if (veridas.getSHORT_DATE_PATTERN().matches(attribute)) {
                    try {
                        date = f67233c.parse(attribute);
                        Intrinsics.checkNotNull(date);
                        date2 = date;
                    } catch (Exception e7) {
                        Log.e(str2, e7);
                    }
                }
            }
            Integrity integrity = new Integrity();
            String string = metadataBuilder.setTimestamp(date2).setMimeType(Veridas.JPEG_MIME_TYPE).setWidth(str).setHeight(attribute2).setIntegrity(integrity).setBidis(list).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            exifInterface.setAttribute(ExifInterface.TAG_USER_COMMENT, f67234d + l.replace$default(string, "\\", "", false, 4, (Object) null));
            exifInterface.saveAttributes();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bytes2 = ByteStreamsKt.readBytes(fileInputStream);
                CloseableKt.closeFinally(fileInputStream, null);
                if (file.exists()) {
                    file.delete();
                }
                return imageValidator.getCom.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID java.lang.String() ? new IntegrityImage(integrity, date2, bytes2).getCom.bbva.zoomauth.facialauth.constant.AuthConstants.IMAGE java.lang.String() : new IntegrityImage(new Integrity(), date2, bytes2).getCom.bbva.zoomauth.facialauth.constant.AuthConstants.IMAGE java.lang.String();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(fileOutputStream, th4);
                throw th5;
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final byte[] writeDocumentCaptureMetadata(@NotNull Context context, @NotNull String agentVersion, @NotNull byte[] imageData, @NotNull List<BidiCodeInfo> bidiCodeInfoList, @NotNull ArtifactClass artifactClass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(agentVersion, "agentVersion");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Intrinsics.checkNotNullParameter(bidiCodeInfoList, "bidiCodeInfoList");
        Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
        MetadataBuilder artifactClass2 = new MetadataBuilder().setAgent(Agent.SDK_DOCUMENT_CAPTURE).setAgentVersion(agentVersion).setArtifactClass(artifactClass);
        ImageValidator imageValidator = new ImageValidator(imageData, artifactClass);
        INSTANCE.getClass();
        return a(context, imageValidator, bidiCodeInfoList, artifactClass2);
    }

    @JvmStatic
    @NotNull
    public static final byte[] writePhotoSelfieCaptureMetadata(@NotNull Context context, @NotNull String agentVersion, @NotNull byte[] imageData, boolean isSelfieAlive) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(agentVersion, "agentVersion");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Agent agent = Agent.SDK_PHOTO_SELFIE_CAPTURE;
        if (isSelfieAlive) {
            agent = Agent.SDK_SELFIE_ALIVE_CAPTURE;
        }
        MetadataBuilder agentVersion2 = new MetadataBuilder().setAgent(agent).setAgentVersion(agentVersion);
        ArtifactClass artifactClass = ArtifactClass.SELFIE;
        MetadataBuilder artifactClass2 = agentVersion2.setArtifactClass(artifactClass);
        ImageValidator imageValidator = new ImageValidator(imageData, artifactClass);
        INSTANCE.getClass();
        return a(context, imageValidator, null, artifactClass2);
    }

    @Nullable
    public final String readMetadata(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return readMetadata(new ByteArrayInputStream(byteArray));
    }

    @Nullable
    public final String readMetadata(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            return new ExifInterface(inputStream).getAttribute(ExifInterface.TAG_USER_COMMENT);
        } catch (Exception e5) {
            Log.e(f67231a, e5);
            return null;
        }
    }
}
