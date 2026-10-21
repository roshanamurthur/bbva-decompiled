package com.bbva.showinfo.model;

import android.view.View;
import androidx.collection.k;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.material.snackbar.Snackbar;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\bC\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010#\u001a\u00020\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bk\u0010lJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003J®\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010#\u001a\u00020\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b&\u0010'J\t\u0010(\u001a\u00020\nHÖ\u0001J\t\u0010)\u001a\u00020\u0002HÖ\u0001J\u0013\u0010,\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0004\"\u0004\b0\u00101R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\u0004\"\u0004\b4\u00101R$\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R.\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR$\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010!\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010#\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010$\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010%\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j¨\u0006m"}, d2 = {"Lcom/bbva/showinfo/model/InfoSnackBar;", "Lcom/bbva/showinfo/model/InfoElement;", "", "getImageResourceId", "()Ljava/lang/Integer;", "component1", "component2", "Lcom/bbva/showinfo/model/SnackBarType;", "component3", "", "", "component4", "component5", "component6", "Lcom/bbva/showinfo/model/SnackBarDuration;", "component7", "component8", "Lkotlin/Function0;", "", "component9", "", "component10", "Lcom/google/android/material/snackbar/Snackbar$Callback;", "component11", "Landroid/view/View$OnClickListener;", "component12", "id", "imageId", "type", "images", "message", "messageAccessibility", TypedValues.TransitionType.S_DURATION, "actionName", "onActionClickListener", "actionListenToUserDidTap", "onDismissedCallback", "onClickListener", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/bbva/showinfo/model/SnackBarType;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/showinfo/model/SnackBarDuration;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLcom/google/android/material/snackbar/Snackbar$Callback;Landroid/view/View$OnClickListener;)Lcom/bbva/showinfo/model/InfoSnackBar;", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "b", "getImageId", "setImageId", "c", "Lcom/bbva/showinfo/model/SnackBarType;", "getType", "()Lcom/bbva/showinfo/model/SnackBarType;", "setType", "(Lcom/bbva/showinfo/model/SnackBarType;)V", "d", "Ljava/util/Map;", "getImages", "()Ljava/util/Map;", "setImages", "(Ljava/util/Map;)V", "e", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "f", "getMessageAccessibility", "setMessageAccessibility", "g", "Lcom/bbva/showinfo/model/SnackBarDuration;", "getDuration", "()Lcom/bbva/showinfo/model/SnackBarDuration;", "setDuration", "(Lcom/bbva/showinfo/model/SnackBarDuration;)V", "h", "getActionName", "setActionName", "i", "Lkotlin/jvm/functions/Function0;", "getOnActionClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnActionClickListener", "(Lkotlin/jvm/functions/Function0;)V", "j", "Z", "getActionListenToUserDidTap", "()Z", "setActionListenToUserDidTap", "(Z)V", "k", "Lcom/google/android/material/snackbar/Snackbar$Callback;", "getOnDismissedCallback", "()Lcom/google/android/material/snackbar/Snackbar$Callback;", "setOnDismissedCallback", "(Lcom/google/android/material/snackbar/Snackbar$Callback;)V", "l", "Landroid/view/View$OnClickListener;", "getOnClickListener", "()Landroid/view/View$OnClickListener;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/bbva/showinfo/model/SnackBarType;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/showinfo/model/SnackBarDuration;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLcom/google/android/material/snackbar/Snackbar$Callback;Landroid/view/View$OnClickListener;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InfoSnackBar extends InfoElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer imageId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SnackBarType type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, Integer> images;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String message;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String messageAccessibility;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SnackBarDuration duration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String actionName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onActionClickListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean actionListenToUserDidTap;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Snackbar.Callback onDismissedCallback;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View.OnClickListener onClickListener;

    public InfoSnackBar() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, 4095, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getActionListenToUserDidTap() {
        return this.actionListenToUserDidTap;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Snackbar.Callback getOnDismissedCallback() {
        return this.onDismissedCallback;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final View.OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getImageId() {
        return this.imageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SnackBarType getType() {
        return this.type;
    }

    @NotNull
    public final Map<String, Integer> component4() {
        return this.images;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessageAccessibility() {
        return this.messageAccessibility;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SnackBarDuration getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    @Nullable
    public final Function0<Unit> component9() {
        return this.onActionClickListener;
    }

    @NotNull
    public final InfoSnackBar copy(@Nullable Integer id, @Nullable Integer imageId, @Nullable SnackBarType type, @NotNull Map<String, Integer> images, @Nullable String message, @Nullable String messageAccessibility, @Nullable SnackBarDuration duration, @Nullable String actionName, @Nullable Function0<Unit> onActionClickListener, boolean actionListenToUserDidTap, @Nullable Snackbar.Callback onDismissedCallback, @Nullable View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(images, "images");
        return new InfoSnackBar(id, imageId, type, images, message, messageAccessibility, duration, actionName, onActionClickListener, actionListenToUserDidTap, onDismissedCallback, onClickListener);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoSnackBar)) {
            return false;
        }
        InfoSnackBar infoSnackBar = (InfoSnackBar) other;
        return Intrinsics.areEqual(this.id, infoSnackBar.id) && Intrinsics.areEqual(this.imageId, infoSnackBar.imageId) && this.type == infoSnackBar.type && Intrinsics.areEqual(this.images, infoSnackBar.images) && Intrinsics.areEqual(this.message, infoSnackBar.message) && Intrinsics.areEqual(this.messageAccessibility, infoSnackBar.messageAccessibility) && Intrinsics.areEqual(this.duration, infoSnackBar.duration) && Intrinsics.areEqual(this.actionName, infoSnackBar.actionName) && Intrinsics.areEqual(this.onActionClickListener, infoSnackBar.onActionClickListener) && this.actionListenToUserDidTap == infoSnackBar.actionListenToUserDidTap && Intrinsics.areEqual(this.onDismissedCallback, infoSnackBar.onDismissedCallback) && Intrinsics.areEqual(this.onClickListener, infoSnackBar.onClickListener);
    }

    public final boolean getActionListenToUserDidTap() {
        return this.actionListenToUserDidTap;
    }

    @Nullable
    public final String getActionName() {
        return this.actionName;
    }

    @Nullable
    public final SnackBarDuration getDuration() {
        return this.duration;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Integer getImageId() {
        return this.imageId;
    }

    @Nullable
    public final Integer getImageResourceId() {
        Integer num = this.imageId;
        if (num != null) {
            return num;
        }
        Map<String, Integer> map = this.images;
        SnackBarType snackBarType = this.type;
        return map.get(snackBarType != null ? snackBarType.getValue() : null);
    }

    @NotNull
    public final Map<String, Integer> getImages() {
        return this.images;
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
    public final Function0<Unit> getOnActionClickListener() {
        return this.onActionClickListener;
    }

    @Nullable
    public final View.OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    @Nullable
    public final Snackbar.Callback getOnDismissedCallback() {
        return this.onDismissedCallback;
    }

    @Nullable
    public final SnackBarType getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.imageId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        SnackBarType snackBarType = this.type;
        int iHashCode3 = (this.images.hashCode() + ((iHashCode2 + (snackBarType == null ? 0 : snackBarType.hashCode())) * 31)) * 31;
        String str = this.message;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.messageAccessibility;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SnackBarDuration snackBarDuration = this.duration;
        int iHashCode6 = (iHashCode5 + (snackBarDuration == null ? 0 : snackBarDuration.hashCode())) * 31;
        String str3 = this.actionName;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Function0<Unit> function0 = this.onActionClickListener;
        int iHashCode8 = (((iHashCode7 + (function0 == null ? 0 : function0.hashCode())) * 31) + (this.actionListenToUserDidTap ? 1231 : 1237)) * 31;
        Snackbar.Callback callback = this.onDismissedCallback;
        int iHashCode9 = (iHashCode8 + (callback == null ? 0 : callback.hashCode())) * 31;
        View.OnClickListener onClickListener = this.onClickListener;
        return iHashCode9 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    public final void setActionListenToUserDidTap(boolean z10) {
        this.actionListenToUserDidTap = z10;
    }

    public final void setActionName(@Nullable String str) {
        this.actionName = str;
    }

    public final void setDuration(@Nullable SnackBarDuration snackBarDuration) {
        this.duration = snackBarDuration;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setImageId(@Nullable Integer num) {
        this.imageId = num;
    }

    public final void setImages(@NotNull Map<String, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.images = map;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setMessageAccessibility(@Nullable String str) {
        this.messageAccessibility = str;
    }

    public final void setOnActionClickListener(@Nullable Function0<Unit> function0) {
        this.onActionClickListener = function0;
    }

    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public final void setOnDismissedCallback(@Nullable Snackbar.Callback callback) {
        this.onDismissedCallback = callback;
    }

    public final void setType(@Nullable SnackBarType snackBarType) {
        this.type = snackBarType;
    }

    @NotNull
    public String toString() {
        Integer num = this.id;
        Integer num2 = this.imageId;
        SnackBarType snackBarType = this.type;
        Map<String, Integer> map = this.images;
        String str = this.message;
        String str2 = this.messageAccessibility;
        SnackBarDuration snackBarDuration = this.duration;
        String str3 = this.actionName;
        Function0<Unit> function0 = this.onActionClickListener;
        boolean z10 = this.actionListenToUserDidTap;
        Snackbar.Callback callback = this.onDismissedCallback;
        View.OnClickListener onClickListener = this.onClickListener;
        StringBuilder sb2 = new StringBuilder("InfoSnackBar(id=");
        sb2.append(num);
        sb2.append(", imageId=");
        sb2.append(num2);
        sb2.append(", type=");
        sb2.append(snackBarType);
        sb2.append(", images=");
        sb2.append(map);
        sb2.append(", message=");
        k.e(sb2, str, ", messageAccessibility=", str2, ", duration=");
        sb2.append(snackBarDuration);
        sb2.append(", actionName=");
        sb2.append(str3);
        sb2.append(", onActionClickListener=");
        sb2.append(function0);
        sb2.append(", actionListenToUserDidTap=");
        sb2.append(z10);
        sb2.append(", onDismissedCallback=");
        sb2.append(callback);
        sb2.append(", onClickListener=");
        sb2.append(onClickListener);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ InfoSnackBar(Integer num, Integer num2, SnackBarType snackBarType, Map map, String str, String str2, SnackBarDuration snackBarDuration, String str3, Function0 function0, boolean z10, Snackbar.Callback callback, View.OnClickListener onClickListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : snackBarType, (i10 & 8) != 0 ? q.emptyMap() : map, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : snackBarDuration, (i10 & 128) != 0 ? null : str3, (i10 & 256) != 0 ? null : function0, (i10 & 512) != 0 ? false : z10, (i10 & 1024) != 0 ? null : callback, (i10 & 2048) == 0 ? onClickListener : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoSnackBar(@Nullable Integer num, @Nullable Integer num2, @Nullable SnackBarType snackBarType, @NotNull Map<String, Integer> images, @Nullable String str, @Nullable String str2, @Nullable SnackBarDuration snackBarDuration, @Nullable String str3, @Nullable Function0<Unit> function0, boolean z10, @Nullable Snackbar.Callback callback, @Nullable View.OnClickListener onClickListener) {
        super(null);
        Intrinsics.checkNotNullParameter(images, "images");
        this.id = num;
        this.imageId = num2;
        this.type = snackBarType;
        this.images = images;
        this.message = str;
        this.messageAccessibility = str2;
        this.duration = snackBarDuration;
        this.actionName = str3;
        this.onActionClickListener = function0;
        this.actionListenToUserDidTap = z10;
        this.onDismissedCallback = callback;
        this.onClickListener = onClickListener;
    }
}
