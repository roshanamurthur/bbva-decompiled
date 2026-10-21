package com.bbva.plugin.showinfo;

import android.graphics.Color;
import com.bbva.plugin.showinfo.data.HideDTO;
import com.bbva.showinfo.ShowInfoKt;
import com.bbva.showinfo.model.InfoElement;
import com.bbva.showinfo.model.InfoNotification;
import com.bbva.showinfo.model.InfoSnackBar;
import com.bbva.showinfo.model.InfoSnackBarTextAlignment;
import com.bbva.showinfo.model.SnackBarDuration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Mapper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"createInfoElement", "Lcom/bbva/showinfo/model/InfoElement;", "info", "Lcom/bbva/plugin/showinfo/data/HideDTO;", "toARGB", "", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toSnackbarDuration", "Lcom/bbva/showinfo/model/SnackBarDuration;", "(Ljava/lang/Integer;)Lcom/bbva/showinfo/model/SnackBarDuration;", "toTextGravity", "Lcom/bbva/showinfo/model/InfoSnackBarTextAlignment;", "(Ljava/lang/Integer;)Lcom/bbva/showinfo/model/InfoSnackBarTextAlignment;", "showinfo-plugin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mapper.kt\ncom/bbva/plugin/showinfo/MapperKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class MapperKt {

    /* JADX INFO: compiled from: Mapper.kt */
    public static final class a extends Lambda implements Function1<InfoSnackBar, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ HideDTO f35993p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HideDTO hideDTO) {
            super(1);
            this.f35993p0 = hideDTO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InfoSnackBar infoSnackBar) {
            InfoSnackBar snackBar = infoSnackBar;
            Intrinsics.checkNotNullParameter(snackBar, "$this$snackBar");
            snackBar.setId(this.f35993p0.getId());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Mapper.kt */
    public static final class b extends Lambda implements Function1<InfoNotification, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ HideDTO f35994p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HideDTO hideDTO) {
            super(1);
            this.f35994p0 = hideDTO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InfoNotification infoNotification) {
            InfoNotification notification = infoNotification;
            Intrinsics.checkNotNullParameter(notification, "$this$notification");
            notification.setId(this.f35994p0.getId());
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public static final InfoElement createInfoElement(@NotNull HideDTO info) {
        Intrinsics.checkNotNullParameter(info, "info");
        String type = info.getType();
        if (Intrinsics.areEqual(type, "snackbar")) {
            return ShowInfoKt.snackBar(new a(info));
        }
        if (Intrinsics.areEqual(type, "notification")) {
            return ShowInfoKt.notification(new b(info));
        }
        return null;
    }

    @Nullable
    public static final Integer toARGB(@Nullable String str) {
        if (str != null) {
            return Integer.valueOf(Color.parseColor(str));
        }
        return null;
    }

    @NotNull
    public static final SnackBarDuration toSnackbarDuration(@Nullable Integer num) {
        if (num == null) {
            return SnackBarDuration.Short.INSTANCE;
        }
        return num.intValue() == -1 ? SnackBarDuration.Indefinite.INSTANCE : new SnackBarDuration.Defined(num.intValue());
    }

    @NotNull
    public static final InfoSnackBarTextAlignment toTextGravity(@Nullable Integer num) {
        if (num != null) {
            InfoSnackBarTextAlignment infoSnackBarTextAlignment = (InfoSnackBarTextAlignment) ArraysKt___ArraysKt.getOrNull(InfoSnackBarTextAlignment.values(), num.intValue());
            if (infoSnackBarTextAlignment != null) {
                return infoSnackBarTextAlignment;
            }
        }
        return InfoSnackBarTextAlignment.START;
    }
}
