package com.bbva.glomohybrid.ui.options.profileselector.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.glomohybrid.ui.R;
import com.bbva.glomohybrid.ui.databinding.DialogListOptionSelectorBinding;
import com.bbva.glomohybrid.ui.options.error.InvalidInitializationException;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectedItem;
import com.bbva.glomohybrid.ui.options.view.ClickableRecyclerViewAdapter;
import com.bbva.glomohybrid.ui.options.view.ListOptionSelectorDialog;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProfilesOptionSelectorDialog.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0010\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u000eH\u0016J\u001c\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u000eH\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/view/ProfilesOptionSelectorDialog;", "Lcom/bbva/glomohybrid/ui/options/view/ListOptionSelectorDialog;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Lkotlin/Function1;", "action", "addCloseAction", "addFooterAction", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectedItem;", "addItemClicked", "Builder", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nProfilesOptionSelectorDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilesOptionSelectorDialog.kt\ncom/bbva/glomohybrid/ui/options/profileselector/view/ProfilesOptionSelectorDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n67#1,5:113\n262#2,2:110\n1#3:112\n*S KotlinDebug\n*F\n+ 1 ProfilesOptionSelectorDialog.kt\ncom/bbva/glomohybrid/ui/options/profileselector/view/ProfilesOptionSelectorDialog\n*L\n57#1:113,5\n48#1:110,2\n*E\n"})
public final class ProfilesOptionSelectorDialog extends ListOptionSelectorDialog {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f34696w0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f34697p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ClickableRecyclerViewAdapter f34698q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final String f34699r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f34700s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public DialogListOptionSelectorBinding f34701t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public Function1<? super View, Unit> f34702u0;

    @Nullable
    public Function1<? super View, Unit> v0;

    /* JADX INFO: compiled from: ProfilesOptionSelectorDialog.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/view/ProfilesOptionSelectorDialog$Builder;", "", "Lcom/bbva/glomohybrid/ui/options/profileselector/view/ProfilesOptionSelectorDialog;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "Lcom/bbva/glomohybrid/ui/options/view/ClickableRecyclerViewAdapter;", "b", "Lcom/bbva/glomohybrid/ui/options/view/ClickableRecyclerViewAdapter;", "getAdapter", "()Lcom/bbva/glomohybrid/ui/options/view/ClickableRecyclerViewAdapter;", "setAdapter", "(Lcom/bbva/glomohybrid/ui/options/view/ClickableRecyclerViewAdapter;)V", "adapter", "c", "getFooterTitle", "setFooterTitle", "footerTitle", "", "d", "Z", "getShowCloseButton", "()Z", "setShowCloseButton", "(Z)V", "showCloseButton", "<init>", "()V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public ClickableRecyclerViewAdapter adapter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String footerTitle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public boolean showCloseButton;

        @NotNull
        public final ProfilesOptionSelectorDialog build() throws InvalidInitializationException {
            String str = this.title;
            if (str == null) {
                throw InvalidInitializationException.INSTANCE;
            }
            ClickableRecyclerViewAdapter clickableRecyclerViewAdapter = this.adapter;
            if (clickableRecyclerViewAdapter != null) {
                return new ProfilesOptionSelectorDialog(str, clickableRecyclerViewAdapter, this.footerTitle, this.showCloseButton, null);
            }
            throw InvalidInitializationException.INSTANCE;
        }

        @Nullable
        public final ClickableRecyclerViewAdapter getAdapter() {
            return this.adapter;
        }

        @Nullable
        public final String getFooterTitle() {
            return this.footerTitle;
        }

        public final boolean getShowCloseButton() {
            return this.showCloseButton;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setAdapter(@Nullable ClickableRecyclerViewAdapter clickableRecyclerViewAdapter) {
            this.adapter = clickableRecyclerViewAdapter;
        }

        public final void setFooterTitle(@Nullable String str) {
            this.footerTitle = str;
        }

        public final void setShowCloseButton(boolean z10) {
            this.showCloseButton = z10;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    /* JADX INFO: compiled from: ProfilesOptionSelectorDialog.kt */
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ProfilesOptionSelectorDialog.this.dismiss();
            return Unit.INSTANCE;
        }
    }

    public ProfilesOptionSelectorDialog(String str, ClickableRecyclerViewAdapter clickableRecyclerViewAdapter, String str2, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this.f34697p0 = str;
        this.f34698q0 = clickableRecyclerViewAdapter;
        this.f34699r0 = str2;
        this.f34700s0 = z10;
    }

    @Override // com.bbva.glomohybrid.ui.options.view.ListOptionSelectorDialog
    @NotNull
    public ListOptionSelectorDialog addCloseAction(@NotNull Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.v0 = action;
        return super.addCloseAction(action);
    }

    @Override // com.bbva.glomohybrid.ui.options.view.ListOptionSelectorDialog
    public /* bridge */ /* synthetic */ ListOptionSelectorDialog addFooterAction(Function1 function1) {
        return addFooterAction((Function1<? super View, Unit>) function1);
    }

    @Override // com.bbva.glomohybrid.ui.options.view.ListOptionSelectorDialog
    @NotNull
    public ListOptionSelectorDialog addItemClicked(@NotNull Function1<? super ProfileSelectedItem, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f34698q0.addItemClickedListener(action, new a());
        return this;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.DialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogListOptionSelectorBinding dialogListOptionSelectorBindingInflate = DialogListOptionSelectorBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(dialogListOptionSelectorBindingInflate, "inflate(...)");
        this.f34701t0 = dialogListOptionSelectorBindingInflate;
        if (dialogListOptionSelectorBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogListOptionSelectorBindingInflate = null;
        }
        return dialogListOptionSelectorBindingInflate.getRoot();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Unit unit;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DialogListOptionSelectorBinding dialogListOptionSelectorBinding = this.f34701t0;
        DialogListOptionSelectorBinding dialogListOptionSelectorBinding2 = null;
        if (dialogListOptionSelectorBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogListOptionSelectorBinding = null;
        }
        dialogListOptionSelectorBinding.options.setAdapter(this.f34698q0);
        DialogListOptionSelectorBinding dialogListOptionSelectorBinding3 = this.f34701t0;
        if (dialogListOptionSelectorBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogListOptionSelectorBinding3 = null;
        }
        dialogListOptionSelectorBinding3.listOptionTitle.setText(this.f34697p0);
        DialogListOptionSelectorBinding dialogListOptionSelectorBinding4 = this.f34701t0;
        if (dialogListOptionSelectorBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogListOptionSelectorBinding4 = null;
        }
        AppCompatImageButton closeButton = dialogListOptionSelectorBinding4.closeButton;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        boolean z10 = this.f34700s0;
        closeButton.setVisibility(z10 ? 0 : 8);
        DialogListOptionSelectorBinding dialogListOptionSelectorBinding5 = this.f34701t0;
        if (dialogListOptionSelectorBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogListOptionSelectorBinding5 = null;
        }
        AppCompatImageButton appCompatImageButton = dialogListOptionSelectorBinding5.closeButton;
        if (!z10) {
            appCompatImageButton = null;
        }
        if (appCompatImageButton != null) {
            appCompatImageButton.setOnClickListener(new s5.a(this, 4));
        }
        String str = this.f34699r0;
        if (str == null) {
            unit = null;
        } else {
            DialogListOptionSelectorBinding dialogListOptionSelectorBinding6 = this.f34701t0;
            if (dialogListOptionSelectorBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogListOptionSelectorBinding6 = null;
            }
            dialogListOptionSelectorBinding6.footerButton.setText(str);
            final Function1<? super View, Unit> function1 = this.f34702u0;
            if (function1 != null) {
                DialogListOptionSelectorBinding dialogListOptionSelectorBinding7 = this.f34701t0;
                if (dialogListOptionSelectorBinding7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dialogListOptionSelectorBinding7 = null;
                }
                CellsButton footerButton = dialogListOptionSelectorBinding7.footerButton;
                Intrinsics.checkNotNullExpressionValue(footerButton, "footerButton");
                footerButton.setOnClickListener(new View.OnClickListener() { // from class: com.bbva.glomohybrid.ui.options.profileselector.view.ProfilesOptionSelectorDialog$registerFooterAction$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Intrinsics.checkNotNull(view2);
                        function1.invoke(view2);
                        this.dismiss();
                    }
                });
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
        }
        if (unit == null) {
            DialogListOptionSelectorBinding dialogListOptionSelectorBinding8 = this.f34701t0;
            if (dialogListOptionSelectorBinding8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogListOptionSelectorBinding8 = null;
            }
            dialogListOptionSelectorBinding8.delimiter.setVisibility(8);
            DialogListOptionSelectorBinding dialogListOptionSelectorBinding9 = this.f34701t0;
            if (dialogListOptionSelectorBinding9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                dialogListOptionSelectorBinding2 = dialogListOptionSelectorBinding9;
            }
            dialogListOptionSelectorBinding2.footerButton.setVisibility(8);
        }
    }

    @Override // com.bbva.glomohybrid.ui.options.view.ListOptionSelectorDialog
    @NotNull
    public ProfilesOptionSelectorDialog addFooterAction(@NotNull Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f34702u0 = action;
        return this;
    }
}
