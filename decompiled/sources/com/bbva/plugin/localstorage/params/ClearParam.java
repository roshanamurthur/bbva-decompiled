package com.bbva.plugin.localstorage.params;

import androidx.annotation.Keep;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClearParam.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/localstorage/params/ClearParam;", "", Constants.SYNC, "", "volatile", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSync", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVolatile", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ClearParam {

    @Nullable
    private final Boolean sync;

    @Nullable
    private final Boolean volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Boolean getSync() {
        return this.sync;
    }

    @Nullable
    public final Boolean getVolatile() {
        return this.volatile;
    }

    public ClearParam(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.sync = bool;
        this.volatile = bool2;
    }

    public /* synthetic */ ClearParam(Boolean bool, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Boolean.FALSE : bool2);
    }
}
