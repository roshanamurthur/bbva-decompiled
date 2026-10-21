package com.veridas.metadata.entities;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.veridas.util.ByteArrayUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageValidator.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/veridas/metadata/entities/ImageValidator;", "", "", "<set-?>", "a", "Z", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "()Z", "", "b", "[B", "getBytes", "()[B", "bytes", "Lcom/veridas/metadata/entities/ArtifactClass;", "artifactClass", "<init>", "([BLcom/veridas/metadata/entities/ArtifactClass;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class ImageValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isValid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] bytes;

    public ImageValidator(@NotNull byte[] bytes, @NotNull ArtifactClass artifactClass) {
        boolean z10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(artifactClass, "artifactClass");
        byte[] bArrHashString = IntegrityCalculation.INSTANCE.hashString(ByteArrayUtil.toByteArray(artifactClass.getClassName()), "SHA-256");
        int length = bArrHashString.length;
        if (Arrays.equals(CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.takeLast(bytes, length)), bArrHashString)) {
            this.bytes = CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.dropLast(bytes, length));
            z10 = true;
        } else {
            this.bytes = bytes;
            z10 = false;
        }
        this.isValid = z10;
    }

    @NotNull
    public final byte[] getBytes() {
        return this.bytes;
    }

    /* JADX INFO: renamed from: isValid, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }
}
