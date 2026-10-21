package com.bbva.component.ui.welcome.pager;

import ad.d;
import android.app.Application;
import androidx.camera.core.processing.f;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.component.ui.welcome.exception.DuplicatedPageIdException;
import com.bbva.component.ui.welcome.exception.ModeNotFoundException;
import com.bbva.component.ui.welcome.exception.PageNotFoundException;
import com.bbva.nativesettings.common.Constants;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WelcomePagerViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010$\u001a\u00020!H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020!H\u0000¢\u0006\u0004\b&\u0010'R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R \u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+¨\u00066"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/WelcomePagerViewModel;", "Lcom/bbva/cells/component/kit/ui/viewmodel/ViewModel;", "", "autoMovement", "", "movementDelay", "", "setupGlobalConfig$component_ui_welcome_release", "(ZJ)V", "setupGlobalConfig", "", "Lcom/bbva/component/ui/welcome/pager/Page;", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "setPageList$component_ui_welcome_release", "(Ljava/util/List;)V", "setPageList", "Lcom/bbva/component/ui/welcome/pager/Mode;", "setModeList$component_ui_welcome_release", "setModeList", "", "mode", "setMode$component_ui_welcome_release", "(Ljava/lang/String;)V", "setMode", "shouldMove$component_ui_welcome_release", "()Z", "shouldMove", "delay$component_ui_welcome_release", "()J", "delay", "pagesToShow$component_ui_welcome_release", "()Ljava/util/List;", "pagesToShow", "", "getCount$component_ui_welcome_release", "()I", "getCount", "position", "getPage$component_ui_welcome_release", "(I)Lcom/bbva/component/ui/welcome/pager/Page;", "getPage", "Landroidx/lifecycle/LiveData;", "getPageList$component_ui_welcome_release", "()Landroidx/lifecycle/LiveData;", WelcomePagerViewModel.PAGE_LIST, "getModeList$component_ui_welcome_release", WelcomePagerViewModel.MODE_LIST, "getCurrentMode$component_ui_welcome_release", WelcomePagerViewModel.CURRENT_MODE, "Landroid/app/Application;", Constants.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Companion", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final class WelcomePagerViewModel extends ViewModel {

    @NotNull
    public static final String CURRENT_MODE = "currentMode";

    @NotNull
    public static final String MODE_LIST = "modeList";

    @NotNull
    public static final String PAGE_LIST = "pageList";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f28849r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ArrayList f28850s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f28851t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f28852u0;
    public final MutableLiveData<List<Page>> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final MutableLiveData<List<Mode>> f28853w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final MutableLiveData<String> f28854x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomePagerViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f28849r0 = new ArrayList();
        this.f28850s0 = new ArrayList();
        MutableLiveData<List<Page>> mutableLiveDataNewProperty = newProperty(PAGE_LIST);
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataNewProperty, "newProperty(PAGE_LIST)");
        this.v0 = mutableLiveDataNewProperty;
        MutableLiveData<List<Mode>> mutableLiveDataNewProperty2 = newProperty(MODE_LIST);
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataNewProperty2, "newProperty(MODE_LIST)");
        this.f28853w0 = mutableLiveDataNewProperty2;
        MutableLiveData<String> mutableLiveDataNewProperty3 = newProperty(CURRENT_MODE);
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataNewProperty3, "newProperty(CURRENT_MODE)");
        this.f28854x0 = mutableLiveDataNewProperty3;
    }

    public final Mode a() {
        ArrayList arrayList = this.f28849r0;
        if (arrayList.size() == 1) {
            return (Mode) arrayList.get(0);
        }
        Object obj = null;
        if (getCurrentMode$component_ui_welcome_release().getValue() == null) {
            return null;
        }
        for (Object obj2 : arrayList) {
            String name = ((Mode) obj2).getName();
            String value = getCurrentMode$component_ui_welcome_release().getValue();
            Intrinsics.checkNotNull(value);
            if (Intrinsics.areEqual(name, value)) {
                obj = obj2;
                break;
            }
        }
        return (Mode) obj;
    }

    public final boolean b() {
        return (this.f28850s0.isEmpty() ^ true) && this.f28849r0.isEmpty() && getCurrentMode$component_ui_welcome_release().getValue() == null;
    }

    public final long delay$component_ui_welcome_release() {
        Long movementDelay;
        Mode modeA = a();
        return (modeA == null || (movementDelay = modeA.getMovementDelay()) == null) ? this.f28852u0 : movementDelay.longValue();
    }

    public final int getCount$component_ui_welcome_release() throws DuplicatedPageIdException, PageNotFoundException, ModeNotFoundException {
        List<Page> listPagesToShow$component_ui_welcome_release = pagesToShow$component_ui_welcome_release();
        boolean z10 = !listPagesToShow$component_ui_welcome_release.isEmpty();
        int size = listPagesToShow$component_ui_welcome_release.size();
        return z10 ? size + 2 : size;
    }

    @NotNull
    public final LiveData<String> getCurrentMode$component_ui_welcome_release() {
        return this.f28854x0;
    }

    @NotNull
    public final LiveData<List<Mode>> getModeList$component_ui_welcome_release() {
        return this.f28853w0;
    }

    @NotNull
    public final Page getPage$component_ui_welcome_release(int position) throws DuplicatedPageIdException, PageNotFoundException, ModeNotFoundException {
        List<Page> listPagesToShow$component_ui_welcome_release = pagesToShow$component_ui_welcome_release();
        int count$component_ui_welcome_release = getCount$component_ui_welcome_release();
        if (count$component_ui_welcome_release <= 1) {
            return listPagesToShow$component_ui_welcome_release.get(position);
        }
        if (position == 0) {
            return (Page) CollectionsKt___CollectionsKt.last((List) listPagesToShow$component_ui_welcome_release);
        }
        return position == count$component_ui_welcome_release - 1 ? (Page) CollectionsKt___CollectionsKt.first((List) listPagesToShow$component_ui_welcome_release) : listPagesToShow$component_ui_welcome_release.get(position - 1);
    }

    @NotNull
    public final LiveData<List<Page>> getPageList$component_ui_welcome_release() {
        return this.v0;
    }

    @NotNull
    public final List<Page> pagesToShow$component_ui_welcome_release() throws DuplicatedPageIdException, PageNotFoundException, ModeNotFoundException {
        boolean zB = b();
        ArrayList arrayList = this.f28850s0;
        if (zB) {
            return arrayList;
        }
        boolean zB2 = b();
        ArrayList arrayList2 = this.f28849r0;
        if ((!zB2 && (arrayList.isEmpty() || arrayList2.isEmpty())) || (arrayList2.size() > 1 && getCurrentMode$component_ui_welcome_release().getValue() == null)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Mode modeA = a();
        if (modeA == null) {
            throw new ModeNotFoundException(d.f(new StringBuilder(), getCurrentMode$component_ui_welcome_release().getValue(), " mode not found in the configuration JSON"));
        }
        List<String> pages = modeA.getPages();
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(pages, 10, 16));
        for (Object obj : pages) {
            String str = (String) obj;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (Intrinsics.areEqual(((Page) obj2).getId(), str)) {
                    arrayList3.add(obj2);
                }
            }
            linkedHashMap.put(obj, arrayList3);
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            if (((List) entry.getValue()).size() > 1) {
                throw new DuplicatedPageIdException("Page ID " + ((String) entry.getKey()) + " defined in " + ((List) entry.getValue()).size() + " pages");
            }
            if (!(!((Collection) entry.getValue()).isEmpty())) {
                throw new PageNotFoundException(d.f(new StringBuilder("Page ID "), (String) entry.getKey(), " not found in the configuration JSON"));
            }
            arrayList4.add((Page) CollectionsKt___CollectionsKt.first((List) entry.getValue()));
        }
        return arrayList4;
    }

    public final void setMode$component_ui_welcome_release(@NotNull String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        MutableLiveData<String> mutableLiveData = this.f28854x0;
        if (mutableLiveData.getValue() != null) {
            return;
        }
        mutableLiveData.setValue(mode);
    }

    public final void setModeList$component_ui_welcome_release(@NotNull List<Mode> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = this.f28849r0;
        arrayList.clear();
        arrayList.addAll(list);
        this.f28853w0.setValue(list);
        if (list.size() == 1) {
            this.f28854x0.setValue(list.get(0).getName());
        }
    }

    public final void setPageList$component_ui_welcome_release(@NotNull List<Page> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = this.f28850s0;
        arrayList.clear();
        arrayList.addAll(list);
        this.v0.setValue(list);
    }

    public final void setupGlobalConfig$component_ui_welcome_release(boolean autoMovement, long movementDelay) {
        this.f28851t0 = autoMovement;
        this.f28852u0 = movementDelay;
    }

    public final boolean shouldMove$component_ui_welcome_release() {
        Boolean autoMovement;
        Mode modeA = a();
        return (modeA == null || (autoMovement = modeA.getAutoMovement()) == null) ? this.f28851t0 : autoMovement.booleanValue();
    }
}
