package com.bbva.cellswidgets;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.bbva.cellswidgets.CellsButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsButton.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0012J$\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\u0013"}, d2 = {"Lcom/bbva/cellswidgets/CellsButton;", "Landroidx/appcompat/widget/AppCompatButton;", "", "blockDelay", "Lkotlin/Function1;", "Landroid/view/View;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnClickListenerBlocked", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final class CellsButton extends AppCompatButton {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f27229q0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f27230p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellsButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setOnClickListenerBlocked$default(CellsButton cellsButton, long j10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 1000;
        }
        cellsButton.setOnClickListenerBlocked(j10, function1);
    }

    public final void setOnClickListenerBlocked(final long blockDelay, @NotNull final Function1<? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setOnClickListener(new View.OnClickListener() { // from class: n4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = CellsButton.f27229q0;
                CellsButton this$0 = this.f84420p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 listener2 = listener;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                if (SystemClock.elapsedRealtime() - this$0.f27230p0 >= blockDelay) {
                    this$0.f27230p0 = SystemClock.elapsedRealtime();
                    Intrinsics.checkNotNull(view);
                    listener2.invoke(view);
                }
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellsButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellsButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
