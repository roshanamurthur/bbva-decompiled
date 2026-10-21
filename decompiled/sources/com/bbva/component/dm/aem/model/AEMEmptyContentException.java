package com.bbva.component.dm.aem.model;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AEMEmptyContentException.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/aem/model/AEMEmptyContentException;", "", "", "component1", "message", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "p0", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "component-dm-aem_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AEMEmptyContentException extends Throwable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public AEMEmptyContentException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AEMEmptyContentException copy$default(AEMEmptyContentException aEMEmptyContentException, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aEMEmptyContentException.getMessage();
        }
        return aEMEmptyContentException.copy(str);
    }

    @Nullable
    public final String component1() {
        return getMessage();
    }

    @NotNull
    public final AEMEmptyContentException copy(@Nullable String message) {
        return new AEMEmptyContentException(message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AEMEmptyContentException) && Intrinsics.areEqual(getMessage(), ((AEMEmptyContentException) other).getMessage());
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        if (getMessage() == null) {
            return 0;
        }
        return getMessage().hashCode();
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "AEMEmptyContentException(message=" + ((Object) getMessage()) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ AEMEmptyContentException(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "AEM content data it's empty" : str);
    }

    public AEMEmptyContentException(@Nullable String str) {
        this.message = str;
    }
}
