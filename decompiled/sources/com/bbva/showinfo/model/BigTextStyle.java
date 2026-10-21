package com.bbva.showinfo.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/bbva/showinfo/model/BigTextStyle;", "", "", "component1", "component2", "component3", "title", "source", "summaryText", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "b", "getSource", "setSource", "c", "getSummaryText", "setSummaryText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class BigTextStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String summaryText;

    public BigTextStyle(@NotNull String title, @NotNull String source, @NotNull String summaryText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        this.title = title;
        this.source = source;
        this.summaryText = summaryText;
    }

    public static /* synthetic */ BigTextStyle copy$default(BigTextStyle bigTextStyle, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bigTextStyle.title;
        }
        if ((i10 & 2) != 0) {
            str2 = bigTextStyle.source;
        }
        if ((i10 & 4) != 0) {
            str3 = bigTextStyle.summaryText;
        }
        return bigTextStyle.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSummaryText() {
        return this.summaryText;
    }

    @NotNull
    public final BigTextStyle copy(@NotNull String title, @NotNull String source, @NotNull String summaryText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        return new BigTextStyle(title, source, summaryText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BigTextStyle)) {
            return false;
        }
        BigTextStyle bigTextStyle = (BigTextStyle) other;
        return Intrinsics.areEqual(this.title, bigTextStyle.title) && Intrinsics.areEqual(this.source, bigTextStyle.source) && Intrinsics.areEqual(this.summaryText, bigTextStyle.summaryText);
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final String getSummaryText() {
        return this.summaryText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.summaryText.hashCode() + n1.c(this.source, this.title.hashCode() * 31, 31);
    }

    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    public final void setSummaryText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.summaryText = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.source;
        return d.f(a.c("BigTextStyle(title=", str, ", source=", str2, ", summaryText="), this.summaryText, ")");
    }
}
