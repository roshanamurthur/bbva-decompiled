package com.bbva.glomohybrid.infoscreen;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import i5.d;
import i5.e;
import io.reactivex.functions.Consumer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m4.a;
import org.jetbrains.annotations.NotNull;
import y4.g;

/* JADX INFO: compiled from: InfoScreenComponent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\u0012\b\b\u0002\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004J\u001a\u0010\b\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004J\u001a\u0010\t\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004J\u001a\u0010\n\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004J\u001a\u0010\f\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012¨\u0006$"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenComponent;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "", "getId", "", "map", "", "setToolbarTitleLabel", "setHeaderImage", "setTitleLabel", "setDescriptionLabel", "setPositiveButton", "setNegativeButton", "color", "setStyle", "Landroidx/lifecycle/LiveData;", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "getObservableToolbarTitleLabel$info_modal_mexicoRelease", "()Landroidx/lifecycle/LiveData;", "observableToolbarTitleLabel", "getObservableHeaderImage$info_modal_mexicoRelease", "observableHeaderImage", "getObservableTitleLabel$info_modal_mexicoRelease", "observableTitleLabel", "getObservableDescriptionLabel$info_modal_mexicoRelease", "observableDescriptionLabel", "getObservablePositiveButton$info_modal_mexicoRelease", "observablePositiveButton", "getObservableNegativeButton$info_modal_mexicoRelease", "observableNegativeButton", "getObservableStyle$info_modal_mexicoRelease", "observableStyle", "id", "<init>", "(Ljava/lang/String;)V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInfoScreenComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoScreenComponent.kt\ncom/bbva/glomohybrid/infoscreen/InfoScreenComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class InfoScreenComponent extends ReactiveComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "error-screen";

    @NotNull
    public static final String STYLE_BLUE = "BLUE";

    @NotNull
    public static final String STYLE_WHITE = "WHITE";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f32219p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f32220q0;

    /* JADX INFO: compiled from: InfoScreenComponent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenComponent$Companion;", "", "()V", "ID", "", "PROPERTY_DESCRIPTION_LABEL", "PROPERTY_HEADER_IMAGE", "PROPERTY_NEGATIVE_BUTTON", "PROPERTY_POSITIVE_BUTTON", "PROPERTY_STYLE", "PROPERTY_TITLE_LABEL", "PROPERTY_TOOLBAR_TITLE_LABEL", "STYLE_BLUE", "STYLE_WHITE", "getInstance", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenComponent;", "kotlin.jvm.PlatformType", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "id", "getInstance$info_modal_mexicoRelease", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ InfoScreenComponent getInstance$info_modal_mexicoRelease$default(Companion companion, Activity activity, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = InfoScreenComponent.ID;
            }
            return companion.getInstance$info_modal_mexicoRelease(activity, str);
        }

        public final InfoScreenComponent getInstance$info_modal_mexicoRelease(@NotNull Activity activity, @NotNull String id) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(id, "id");
            return (InfoScreenComponent) ComponentManager.get(activity.hashCode(), id);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InfoScreenComponent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final <T> LiveData<T> a(String str) {
        LinkedHashMap linkedHashMap = this.f32220q0;
        LiveData<T> liveData = (LiveData) linkedHashMap.get(str);
        if (liveData != null) {
            return liveData;
        }
        MutableLiveData mutableLiveData = new MutableLiveData();
        linkedHashMap.put(str, mutableLiveData);
        return mutableLiveData;
    }

    public final void b(Object obj, String str) {
        MutableLiveData mutableLiveData = (MutableLiveData) this.f32220q0.get(str);
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(obj);
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId, reason: from getter */
    public String getE0() {
        return this.f32219p0;
    }

    @NotNull
    public final LiveData<PropertiesHelper.Property> getObservableDescriptionLabel$info_modal_mexicoRelease() {
        return a("description-label");
    }

    @NotNull
    public final LiveData<PropertiesHelper.Property> getObservableHeaderImage$info_modal_mexicoRelease() {
        return a("header-image");
    }

    @NotNull
    public final LiveData<PropertiesHelper.Property> getObservableNegativeButton$info_modal_mexicoRelease() {
        return a("negative-button");
    }

    @NotNull
    public final LiveData<PropertiesHelper.Property> getObservablePositiveButton$info_modal_mexicoRelease() {
        return a("positive-button");
    }

    @NotNull
    public final LiveData<String> getObservableStyle$info_modal_mexicoRelease() {
        return a("style");
    }

    @NotNull
    public final LiveData<PropertiesHelper.Property> getObservableTitleLabel$info_modal_mexicoRelease() {
        return a("title-label");
    }

    @NotNull
    public final LiveData<PropertiesHelper.Property> getObservableToolbarTitleLabel$info_modal_mexicoRelease() {
        return a("toolbar-title-label");
    }

    public final void setDescriptionLabel(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        b(PropertiesHelper.Property.from(map), "description-label");
    }

    public final void setHeaderImage(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        b(PropertiesHelper.Property.from(map), "header-image");
    }

    public final void setNegativeButton(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        b(PropertiesHelper.Property.from(map), "negative-button");
    }

    public final void setPositiveButton(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        b(PropertiesHelper.Property.from(map), "positive-button");
    }

    public final void setStyle(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        b(color, "style");
    }

    public final void setTitleLabel(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        b(PropertiesHelper.Property.from(map), "title-label");
    }

    public final void setToolbarTitleLabel(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        b(PropertiesHelper.Property.from(map), "toolbar-title-label");
    }

    public InfoScreenComponent(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f32219p0 = id;
        this.f32220q0 = new LinkedHashMap();
        newProperty("toolbarTitleLabel", new d(this, 1));
        newProperty("headerImage", new e(this, 2));
        newProperty("titleLabel", new a(this, 3));
        newProperty("descriptionLabel", new q4.a(this, 1));
        newProperty("positiveButton", new Consumer() { // from class: w8.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                this.f94184p0.setPositiveButton((Map) obj);
            }
        });
        newProperty("negativeButton", new g(this, 1));
        newProperty("style", new com.bbva.cellscore.reactor.a(this, 3));
    }

    public /* synthetic */ InfoScreenComponent(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ID : str);
    }
}
