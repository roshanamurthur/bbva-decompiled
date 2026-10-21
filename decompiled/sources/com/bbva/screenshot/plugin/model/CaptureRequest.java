package com.bbva.screenshot.plugin.model;

import ad.d;
import androidx.appcompat.widget.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CaptureRequest.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0003\u0014\u0015\u0016B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/bbva/screenshot/plugin/model/CaptureRequest;", "", TypedValues.AttributesType.S_FRAME, "Lcom/bbva/screenshot/plugin/model/CaptureRequest$Frame;", "action", "", "(Lcom/bbva/screenshot/plugin/model/CaptureRequest$Frame;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getFrame", "()Lcom/bbva/screenshot/plugin/model/CaptureRequest$Frame;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "CaptureAction", "Companion", "Frame", "screenshot-plugin_release"}, k = 1, mv = {1, 1, 13})
public final /* data */ class CaptureRequest {

    @NotNull
    public static final String ACTION_SHARE = "share";

    @NotNull
    private final String action;

    @Nullable
    private final Frame frame;

    /* JADX INFO: compiled from: CaptureRequest.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/bbva/screenshot/plugin/model/CaptureRequest$CaptureAction;", "", "screenshot-plugin_release"}, k = 1, mv = {1, 1, 13})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface CaptureAction {
    }

    /* JADX INFO: compiled from: CaptureRequest.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/bbva/screenshot/plugin/model/CaptureRequest$Frame;", "", "x", "", "y", "width", "height", "(IIII)V", "getHeight", "()I", "getWidth", "getX", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "screenshot-plugin_release"}, k = 1, mv = {1, 1, 13})
    public static final /* data */ class Frame {
        private final int height;
        private final int width;
        private final int x;
        private final int y;

        public Frame(int i10, int i11, int i12, int i13) {
            this.x = i10;
            this.y = i11;
            this.width = i12;
            this.height = i13;
        }

        @NotNull
        public static /* synthetic */ Frame copy$default(Frame frame, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = frame.x;
            }
            if ((i14 & 2) != 0) {
                i11 = frame.y;
            }
            if ((i14 & 4) != 0) {
                i12 = frame.width;
            }
            if ((i14 & 8) != 0) {
                i13 = frame.height;
            }
            return frame.copy(i10, i11, i12, i13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getY() {
            return this.y;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final Frame copy(int x4, int y7, int width, int height) {
            return new Frame(x4, y7, width, height);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return this.x == frame.x && this.y == frame.y && this.width == frame.width && this.height == frame.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public int hashCode() {
            return (((((this.x * 31) + this.y) * 31) + this.width) * 31) + this.height;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Frame(x=");
            sb2.append(this.x);
            sb2.append(", y=");
            sb2.append(this.y);
            sb2.append(", width=");
            sb2.append(this.width);
            sb2.append(", height=");
            return a.c(sb2, this.height, ")");
        }
    }

    public CaptureRequest(@Nullable Frame frame, @NotNull String str) {
        this.frame = frame;
        this.action = str;
    }

    @NotNull
    public static /* synthetic */ CaptureRequest copy$default(CaptureRequest captureRequest, Frame frame, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            frame = captureRequest.frame;
        }
        if ((i10 & 2) != 0) {
            str = captureRequest.action;
        }
        return captureRequest.copy(frame, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Frame getFrame() {
        return this.frame;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final CaptureRequest copy(@Nullable Frame frame, @NotNull String action) {
        return new CaptureRequest(frame, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureRequest)) {
            return false;
        }
        CaptureRequest captureRequest = (CaptureRequest) other;
        return Intrinsics.areEqual(this.frame, captureRequest.frame) && Intrinsics.areEqual(this.action, captureRequest.action);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final Frame getFrame() {
        return this.frame;
    }

    public int hashCode() {
        Frame frame = this.frame;
        int iHashCode = (frame != null ? frame.hashCode() : 0) * 31;
        String str = this.action;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CaptureRequest(frame=");
        sb2.append(this.frame);
        sb2.append(", action=");
        return d.f(sb2, this.action, ")");
    }
}
