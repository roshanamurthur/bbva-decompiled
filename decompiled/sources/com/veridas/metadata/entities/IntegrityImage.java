package com.veridas.metadata.entities;

import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.veridas.util.ByteArrayUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntegrityImage.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/veridas/metadata/entities/IntegrityImage;", "", "", "a", "[B", "getImage", "()[B", AuthConstants.IMAGE, "Lcom/veridas/metadata/entities/Integrity;", "integrity", "Ljava/util/Date;", "date", "bytes", "<init>", "(Lcom/veridas/metadata/entities/Integrity;Ljava/util/Date;[B)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class IntegrityImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] image;

    public IntegrityImage(@NotNull Integrity integrity, @NotNull Date date, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(integrity, "integrity");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ROOT);
        byte[] bArrByteArrayOfInts = ByteArrayUtil.byteArrayOfInts(255, 224);
        byte[] bArrByteArrayOfInts2 = ByteArrayUtil.byteArrayOfInts(255, 217);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i10 = calendar.get(13);
        IntegrityCalculation.Companion companion = IntegrityCalculation.INSTANCE;
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ByteArrayUtil.toByteArray("VDAS0\u0000"), companion.generateMac(companion.generateMac(companion.hashString(ArraysKt___ArraysJvmKt.plus(ByteArrayUtil.toByteArray(str), FixedValue.INSTANCE.getFixedValueFrom(i10)), "SHA-256"), integrity.getSalt(), "HmacSHA256"), bytes, "HmacSHA256")), bArrByteArrayOfInts2);
        this.image = ArraysKt___ArraysJvmKt.plus(CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.dropLast(bytes, bArrByteArrayOfInts2.length)), ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArrByteArrayOfInts, new byte[]{0, (byte) bArrPlus.length}), bArrPlus));
    }

    @NotNull
    public final byte[] getImage() {
        return this.image;
    }
}
