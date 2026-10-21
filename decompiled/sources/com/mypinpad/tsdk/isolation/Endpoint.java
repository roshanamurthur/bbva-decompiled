package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\u0007\b\t\n\u000b\f"}, d2 = {"Lcom/mypinpad/tsdk/i/Endpoint;", "Ljava/io/Serializable;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setOnFocusChangeListener", "Ljava/lang/Exception;", "setCompoundDrawableTintBlendMode", "Lcom/mypinpad/tsdk/i/getProgressBarColor;", "Lcom/mypinpad/tsdk/i/setKeyboardNavigationCluster;", "Lcom/mypinpad/tsdk/i/setMarqueeRepeatLimit;", "Lcom/mypinpad/tsdk/i/setEditableFactory;", "Lcom/mypinpad/tsdk/i/setOnApplyWindowInsetsListener;", "Lcom/mypinpad/tsdk/i/setVerticalFadingEdgeEnabled;"}, k = 1, mv = {1, 5, 1})
public abstract class Endpoint implements Serializable {

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @Nullable
    public Exception setCompoundDrawableTintBlendMode;

    public /* synthetic */ Endpoint(Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : exc, null);
    }

    public Endpoint(Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
        this.setCompoundDrawableTintBlendMode = exc;
    }
}
