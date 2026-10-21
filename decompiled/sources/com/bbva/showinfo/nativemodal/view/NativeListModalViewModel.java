package com.bbva.showinfo.nativemodal.view;

import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.showinfo.nativemodal.modal.Item;
import com.bbva.showinfo.nativemodal.modal.NativeListModalConfiguration;
import com.bbva.showinfo.nativemodal.modal.NativeListModalState;
import com.bbva.showinfo.nativemodal.utils.MapperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NativeListModalViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fR\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/bbva/showinfo/nativemodal/view/NativeListModalViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalState;", "", "count", "position", "Lcom/bbva/showinfo/nativemodal/modal/Item;", "getItem", AnalyticsConstants.Key.ITEM, "", "selectItem", "dismissView", "Lcom/bbva/showinfo/nativemodal/modal/NativeListModalConfiguration;", "config", "setConfig", "Lkotlinx/coroutines/flow/Flow;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getOnTapEvents", "()Lkotlinx/coroutines/flow/Flow;", "onTapEvents", "<init>", "()V", "Companion", "showinfo_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNativeListModalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeListModalViewModel.kt\ncom/bbva/showinfo/nativemodal/view/NativeListModalViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
public final class NativeListModalViewModel extends ViewModel<NativeListModalState> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Item> f36556y0 = new ActionSpec<>("on-tapped");

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<Item> onTapEvents;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public List<Item> f36558x0;

    /* JADX INFO: compiled from: NativeListModalViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/showinfo/nativemodal/view/NativeListModalViewModel$Companion;", "", "()V", "onTapped", "Lcom/bbva/cells/componentkit/ActionSpec;", "Lcom/bbva/showinfo/nativemodal/modal/Item;", "getOnTapped", "()Lcom/bbva/cells/componentkit/ActionSpec;", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Item> getOnTapped() {
            return NativeListModalViewModel.f36556y0;
        }
    }

    public NativeListModalViewModel() {
        super(new JsonDeserializer(NativeListModalState.INSTANCE.serializer()));
        this.onTapEvents = events(f36556y0);
        this.f36558x0 = CollectionsKt__CollectionsKt.emptyList();
    }

    public final int count() {
        return this.f36558x0.size();
    }

    public final void dismissView() {
        ViewModel.fire$default(this, f36556y0, null, 2, null);
    }

    @Nullable
    public final Item getItem(int position) {
        Integer numValueOf = Integer.valueOf(position);
        int iIntValue = numValueOf.intValue();
        if (iIntValue < 0 || iIntValue >= this.f36558x0.size()) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        numValueOf.intValue();
        return this.f36558x0.get(position);
    }

    @NotNull
    public final Flow<Item> getOnTapEvents() {
        return this.onTapEvents;
    }

    public final void selectItem(@NotNull Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        fire(f36556y0, item);
    }

    public final void setConfig(@NotNull NativeListModalConfiguration config) {
        List<Item> listEmptyList;
        Intrinsics.checkNotNullParameter(config, "config");
        List<Item> values = config.getValues();
        if (values == null || (listEmptyList = MapperKt.withSelectedItemByDefault(values, config.getSelected())) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        this.f36558x0 = listEmptyList;
    }
}
