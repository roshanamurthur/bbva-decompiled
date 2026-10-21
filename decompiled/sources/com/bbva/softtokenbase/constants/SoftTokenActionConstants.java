package com.bbva.softtokenbase.constants;

import com.bbva.cells.component.kit.model.ActionSpec;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SoftTokenActionConstants.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/softtokenbase/constants/SoftTokenActionConstants;", "", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Ljava/lang/Void;", "a", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getAUTHENTICATE", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "AUTHENTICATE", "<init>", "()V", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
public final class SoftTokenActionConstants {

    @NotNull
    public static final SoftTokenActionConstants INSTANCE = new SoftTokenActionConstants();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ActionSpec<Void> AUTHENTICATE = new ActionSpec<>("init-authentication");

    @NotNull
    public final ActionSpec<Void> getAUTHENTICATE() {
        return AUTHENTICATE;
    }
}
