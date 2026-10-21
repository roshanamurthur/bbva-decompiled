package com.bbva.plugin.showinfo.data;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnackBarDTO.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bbva/plugin/showinfo/data/SnackBarDTO;", "", "id", "", "message", "", "messageAccessibility", TypedValues.TransitionType.S_DURATION, "type", "buttonTitle", "listenToUserDidTapOnSnackbarButton", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V", "getButtonTitle", "()Ljava/lang/String;", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getListenToUserDidTapOnSnackbarButton", "()Z", "getMessage", "getMessageAccessibility", "getType", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnackBarDTO {

    @Nullable
    private final String buttonTitle;

    @Nullable
    private final Integer duration;

    @Nullable
    private final Integer id;
    private final boolean listenToUserDidTapOnSnackbarButton;

    @Nullable
    private final String message;

    @Nullable
    private final String messageAccessibility;

    @Nullable
    private final String type;

    public SnackBarDTO(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, boolean z10) {
        this.id = num;
        this.message = str;
        this.messageAccessibility = str2;
        this.duration = num2;
        this.type = str3;
        this.buttonTitle = str4;
        this.listenToUserDidTapOnSnackbarButton = z10;
    }

    @Nullable
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @Nullable
    public final Integer getDuration() {
        return this.duration;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    public final boolean getListenToUserDidTapOnSnackbarButton() {
        return this.listenToUserDidTapOnSnackbarButton;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getMessageAccessibility() {
        return this.messageAccessibility;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ SnackBarDTO(Integer num, String str, String str2, Integer num2, String str3, String str4, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? false : z10);
    }
}
