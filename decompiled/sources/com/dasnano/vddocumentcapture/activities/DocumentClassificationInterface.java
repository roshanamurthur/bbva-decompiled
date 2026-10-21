package com.dasnano.vddocumentcapture.activities;

import com.dasnano.vddocumentcapture.other.VDEnums;
import com.noknok.android.client.utils.UIConfigTags;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DocumentClassificationInterface.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/dasnano/vddocumentcapture/activities/DocumentClassificationInterface;", "", "VDTimeWithoutPhotoTaken", "", UIConfigTags.TAG_SECONDS, "", "captureType", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DocumentClassificationInterface {
    void VDTimeWithoutPhotoTaken(int seconds, @Nullable VDEnums.VDCaptureType captureType);
}
