package com.bbva.glomoutils.semanticversion;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.networkplugin.command.impl.PatchCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GlomoSemanticVersion.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/bbva/glomoutils/semanticversion/GlomoSemanticVersion;", "", "version", "", "compareTo", "", "a", "Z", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "()Z", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMajor", "()I", "setMajor", "(I)V", "major", "c", "getMinor", "setMinor", "minor", "d", "getPatch", "setPatch", PatchCommand.ID, "", "<init>", "(Ljava/lang/String;)V", "gl-utils_release"}, k = 1, mv = {1, 9, 0})
public final class GlomoSemanticVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isValid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int major;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int minor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int patch;

    public GlomoSemanticVersion(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        boolean zMatches = new Regex("(\\d{1,3})(\\.\\d{1,3}){2}").matches(version);
        this.isValid = zMatches;
        if (zMatches) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) version, new String[]{Constant.DOT_STRING}, false, 0, 6, (Object) null);
            String str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 0);
            this.major = str != null ? Integer.parseInt(str) : 0;
            String str2 = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1);
            this.minor = str2 != null ? Integer.parseInt(str2) : 0;
            String str3 = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 2);
            this.patch = str3 != null ? Integer.parseInt(str3) : 0;
        }
    }

    public final int compareTo(@NotNull GlomoSemanticVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        int i10 = this.major;
        int i11 = version.major;
        if (i10 > i11 || i10 < i11) {
            return Intrinsics.compare(i10, i11);
        }
        int i12 = this.minor;
        int i13 = version.minor;
        if (i12 > i13 || i12 < i13) {
            return Intrinsics.compare(i12, i13);
        }
        int i14 = this.patch;
        int i15 = version.patch;
        if (i14 > i15 || i14 < i15) {
            return Intrinsics.compare(i14, i15);
        }
        return 0;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    /* JADX INFO: renamed from: isValid, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public final void setMajor(int i10) {
        this.major = i10;
    }

    public final void setMinor(int i10) {
        this.minor = i10;
    }

    public final void setPatch(int i10) {
        this.patch = i10;
    }
}
