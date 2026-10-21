package com.dasnano.vddocumentcapture.model;

import androidx.annotation.Keep;
import androidx.lifecycle.SavedStateHandle;
import com.dasnano.vddocumentcapture.GenericDocumentState;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.dasnano.vddocumentcapture.document.DocumentFace;
import com.dasnano.vddocumentcapture.other.VDEnums;
import com.veridas.lifecycle.DasViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DocumentClassificationViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010J\u001a\u00020\u0002¢\u0006\u0004\bK\u0010LR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR4\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001f2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010*\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010-\u001a\u0004\u0018\u00010\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR(\u00100\u001a\u0004\u0018\u00010\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aR$\u00106\u001a\u0002012\u0006\u0010\u0004\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010<\u001a\u0002072\u0006\u0010\u0004\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010?\u001a\u0002072\u0006\u0010\u0004\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R(\u0010B\u001a\u0004\u0018\u00010\u00162\b\u0010\u0004\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010\u001aR$\u0010E\u001a\u0002072\u0006\u0010\u0004\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00109\"\u0004\bD\u0010;R$\u0010F\u001a\u0002072\u0006\u0010\u0004\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u00109\"\u0004\bG\u0010;¨\u0006M"}, d2 = {"Lcom/dasnano/vddocumentcapture/model/DocumentClassificationViewModel;", "Lcom/veridas/lifecycle/DasViewModel;", "Lcom/dasnano/vddocumentcapture/config/VDDocumentConfiguration;", "Lcom/dasnano/vddocumentcapture/GenericDocumentState;", "value", "getGenericDocumentState", "()Lcom/dasnano/vddocumentcapture/GenericDocumentState;", "setGenericDocumentState", "(Lcom/dasnano/vddocumentcapture/GenericDocumentState;)V", "genericDocumentState", "Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "getCaptureType", "()Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;", "setCaptureType", "(Lcom/dasnano/vddocumentcapture/other/VDEnums$VDCaptureType;)V", "captureType", "Ljava/lang/Class;", "getCurrentAction", "()Ljava/lang/Class;", "setCurrentAction", "(Ljava/lang/Class;)V", "currentAction", "", "getCutObversePath", "()Ljava/lang/String;", "setCutObversePath", "(Ljava/lang/String;)V", "cutObversePath", "getCutReversePath", "setCutReversePath", "cutReversePath", "", "getDocuments", "()Ljava/util/List;", "setDocuments", "(Ljava/util/List;)V", "documents", "Lcom/dasnano/vddocumentcapture/document/DocumentFace;", "getDocumentFace", "()Lcom/dasnano/vddocumentcapture/document/DocumentFace;", "setDocumentFace", "(Lcom/dasnano/vddocumentcapture/document/DocumentFace;)V", "documentFace", "getObversePath", "setObversePath", "obversePath", "getReversePath", "setReversePath", "reversePath", "", "getScreenOrientation", "()I", "setScreenOrientation", "(I)V", "screenOrientation", "", "getAlreadyFlipped", "()Z", "setAlreadyFlipped", "(Z)V", "alreadyFlipped", "getShouldCaptureReverse", "setShouldCaptureReverse", "shouldCaptureReverse", "getCheckImagePath", "setCheckImagePath", "checkImagePath", "getHasBrights", "setHasBrights", "hasBrights", "isBlurry", "setBlurry", "Landroidx/lifecycle/SavedStateHandle;", "state", "configuration", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/dasnano/vddocumentcapture/config/VDDocumentConfiguration;)V", "document-capture_release"}, k = 1, mv = {1, 9, 0})
public final class DocumentClassificationViewModel extends DasViewModel<VDDocumentConfiguration> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentClassificationViewModel(@NotNull SavedStateHandle state, @NotNull VDDocumentConfiguration configuration) {
        super(state, configuration);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    public final boolean getAlreadyFlipped() {
        Boolean bool = (Boolean) getState().get("FLIP_ANIMATION_HAS_PLAYED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @NotNull
    public final VDEnums.VDCaptureType getCaptureType() {
        Integer num = (Integer) getState().get("CAPTURE_TYPE");
        return VDEnums.VDCaptureType.values()[num != null ? num.intValue() : VDEnums.VDCaptureType.VD_OBVERSE_WITHOUT_FLASH.ordinal()];
    }

    @Nullable
    public final String getCheckImagePath() {
        return (String) getState().get("CHECK_IMAGE_PATH");
    }

    @Nullable
    public final Class<?> getCurrentAction() {
        return (Class) getState().get("CURRENT_ACTION");
    }

    @Nullable
    public final String getCutObversePath() {
        return (String) getState().get("CUT_OBVERSE_PATH");
    }

    @Nullable
    public final String getCutReversePath() {
        return (String) getState().get("CUT_REVERSE_PATH");
    }

    @NotNull
    public final DocumentFace getDocumentFace() {
        Integer num = (Integer) getState().get("DOCUMENT_FACE");
        return DocumentFace.values()[num != null ? num.intValue() : DocumentFace.OBVERSE.ordinal()];
    }

    @Nullable
    public final List<String> getDocuments() {
        return (List) getState().get("DOCUMENTS");
    }

    @NotNull
    public final GenericDocumentState getGenericDocumentState() {
        Integer num = (Integer) getState().get("GENERIC_DOCUMENT_STATE");
        return GenericDocumentState.values()[num != null ? num.intValue() : GenericDocumentState.CALCULATING_AWAITING.ordinal()];
    }

    public final boolean getHasBrights() {
        Boolean bool = (Boolean) getState().get("HAS_BRIGHTS");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Nullable
    public final String getObversePath() {
        return (String) getState().get("OBVERSE_PATH");
    }

    @Nullable
    public final String getReversePath() {
        return (String) getState().get("REVERSE_PATH");
    }

    public final int getScreenOrientation() {
        Integer num = (Integer) getState().get("SCREEN_ORIENTATION");
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final boolean getShouldCaptureReverse() {
        Boolean bool = (Boolean) getState().get("SHOULD_CAPTURE_REVERSE");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isBlurry() {
        Boolean bool = (Boolean) getState().get("IS_BLURRY");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void setAlreadyFlipped(boolean z10) {
        getState().set("FLIP_ANIMATION_HAS_PLAYED", Boolean.valueOf(z10));
    }

    public final void setBlurry(boolean z10) {
        getState().set("IS_BLURRY", Boolean.valueOf(z10));
    }

    public final void setCaptureType(@NotNull VDEnums.VDCaptureType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getState().set("CAPTURE_TYPE", Integer.valueOf(value.ordinal()));
    }

    public final void setCheckImagePath(@Nullable String str) {
        getState().set("CHECK_IMAGE_PATH", str);
    }

    public final void setCurrentAction(@Nullable Class<?> cls) {
        getState().set("CURRENT_ACTION", cls);
    }

    public final void setCutObversePath(@Nullable String str) {
        getState().set("CUT_OBVERSE_PATH", str);
    }

    public final void setCutReversePath(@Nullable String str) {
        getState().set("CUT_REVERSE_PATH", str);
    }

    public final void setDocumentFace(@NotNull DocumentFace value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getState().set("DOCUMENT_FACE", Integer.valueOf(value.ordinal()));
    }

    public final void setDocuments(@Nullable List<String> list) {
        getState().set("DOCUMENTS", list);
    }

    public final void setGenericDocumentState(@NotNull GenericDocumentState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getState().set("GENERIC_DOCUMENT_STATE", Integer.valueOf(value.ordinal()));
    }

    public final void setHasBrights(boolean z10) {
        getState().set("HAS_BRIGHTS", Boolean.valueOf(z10));
    }

    public final void setObversePath(@Nullable String str) {
        getState().set("OBVERSE_PATH", str);
    }

    public final void setReversePath(@Nullable String str) {
        getState().set("REVERSE_PATH", str);
    }

    public final void setScreenOrientation(int i10) {
        getState().set("SCREEN_ORIENTATION", Integer.valueOf(i10));
    }

    public final void setShouldCaptureReverse(boolean z10) {
        getState().set("SHOULD_CAPTURE_REVERSE", Boolean.valueOf(z10));
    }
}
