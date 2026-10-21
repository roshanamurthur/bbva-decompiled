package com.bbva.glomohybrid.ui.options.profileselector;

import android.content.Context;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import com.bbva.glomohybrid.ui.R;
import com.bbva.glomohybrid.ui.options.ListOptionFactory;
import com.bbva.glomohybrid.ui.options.model.Asset;
import com.bbva.glomohybrid.ui.options.model.SingleOption;
import com.bbva.glomohybrid.ui.options.model.TwoLinesOption;
import com.bbva.glomohybrid.ui.options.profileselector.view.ProfilesOptionSelectorDialog;
import com.bbva.glomohybrid.ui.options.view.ListOptionAdapter;
import com.bbva.glomohybrid.ui.options.view.ListOptionSelectorDialog;
import com.bbva.glomohybrid.ui.options.view.render.CountryTwoLinesRenderer;
import com.bbva.glomohybrid.ui.options.view.render.SingleRenderer;
import dk.e;
import java.util.Comparator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProfilesListOptionFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/ProfilesListOptionFactory;", "Lcom/bbva/glomohybrid/ui/options/ListOptionFactory;", "()V", "newUserTypeModal", "Lcom/bbva/glomohybrid/ui/options/view/ListOptionSelectorDialog;", "context", "Landroid/content/Context;", "selectedOption", "", "rememberedUserTypeModal", "rememberedUser", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProfilesListOptionFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilesListOptionFactory.kt\ncom/bbva/glomohybrid/ui/options/profileselector/ProfilesListOptionFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1054#2:76\n1054#2:77\n*S KotlinDebug\n*F\n+ 1 ProfilesListOptionFactory.kt\ncom/bbva/glomohybrid/ui/options/profileselector/ProfilesListOptionFactory\n*L\n44#1:76\n69#1:77\n*E\n"})
public final class ProfilesListOptionFactory extends ListOptionFactory {

    @NotNull
    public static final ProfilesListOptionFactory INSTANCE = new ProfilesListOptionFactory();

    @Override // com.bbva.glomohybrid.ui.options.ListOptionFactory
    @NotNull
    public ListOptionSelectorDialog newUserTypeModal(@NotNull Context context, @Nullable String selectedOption) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(context, "context");
        ProfilesOptionSelectorDialog.Builder builder = new ProfilesOptionSelectorDialog.Builder();
        String string = context.getString(R.string.user_type_option_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R.string.user_type_option_2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SingleOption[] singleOptionArr = new SingleOption[2];
        Asset.Icon icon = new Asset.Icon(R.drawable.ic_profile_personal);
        Locale locale = Locale.ROOT;
        String lowerCase2 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String lowerCase3 = null;
        if (selectedOption != null) {
            lowerCase = selectedOption.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase = null;
        }
        singleOptionArr[0] = new SingleOption(string, icon, Intrinsics.areEqual(lowerCase2, lowerCase));
        Asset.Icon icon2 = new Asset.Icon(R.drawable.ic_profile_enterprise_aqua);
        String lowerCase4 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (selectedOption != null) {
            lowerCase3 = selectedOption.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        singleOptionArr[1] = new SingleOption(string2, icon2, Intrinsics.areEqual(lowerCase4, lowerCase3));
        builder.setAdapter(new ListOptionAdapter(CollectionsKt___CollectionsKt.sortedWith(CollectionsKt__CollectionsKt.listOf((Object[]) singleOptionArr), new Comparator() { // from class: com.bbva.glomohybrid.ui.options.profileselector.ProfilesListOptionFactory$newUserTypeModal$lambda$3$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(Boolean.valueOf(((SingleOption) t11).isSelected()), Boolean.valueOf(((SingleOption) t10).isSelected()));
            }
        }), new SingleRenderer()));
        builder.setTitle(context.getString(R.string.login_user_user_type_title));
        return builder.build();
    }

    @Override // com.bbva.glomohybrid.ui.options.ListOptionFactory
    @NotNull
    public ListOptionSelectorDialog rememberedUserTypeModal(@NotNull Context context, @NotNull RememberedUser rememberedUser, @Nullable String selectedOption) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rememberedUser, "rememberedUser");
        ProfilesOptionSelectorDialog.Builder builder = new ProfilesOptionSelectorDialog.Builder();
        String string = context.getString(R.string.user_type_option_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R.string.user_type_option_2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String lowerCase2 = null;
        String strCapitalizeSentence$default = StringExtensionsKt.capitalizeSentence$default(rememberedUser.getUsername(), null, 1, null);
        if (strCapitalizeSentence$default == null) {
            strCapitalizeSentence$default = "";
        }
        TwoLinesOption[] twoLinesOptionArr = new TwoLinesOption[2];
        Asset.InitialsIcon initialsIcon = new Asset.InitialsIcon(rememberedUser.getFullName());
        Locale locale = Locale.ROOT;
        String lowerCase3 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (selectedOption != null) {
            lowerCase = selectedOption.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase = null;
        }
        twoLinesOptionArr[0] = new TwoLinesOption(string, strCapitalizeSentence$default, initialsIcon, Intrinsics.areEqual(lowerCase3, lowerCase));
        Asset.Icon icon = new Asset.Icon(R.drawable.ic_profile_enterprise_aqua);
        String lowerCase4 = string2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (selectedOption != null) {
            lowerCase2 = selectedOption.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        twoLinesOptionArr[1] = new TwoLinesOption(string2, strCapitalizeSentence$default, icon, Intrinsics.areEqual(lowerCase4, lowerCase2));
        builder.setAdapter(new ListOptionAdapter(CollectionsKt___CollectionsKt.sortedWith(CollectionsKt__CollectionsKt.listOf((Object[]) twoLinesOptionArr), new Comparator() { // from class: com.bbva.glomohybrid.ui.options.profileselector.ProfilesListOptionFactory$rememberedUserTypeModal$lambda$1$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(Boolean.valueOf(((TwoLinesOption) t11).isSelected()), Boolean.valueOf(((TwoLinesOption) t10).isSelected()));
            }
        }), new CountryTwoLinesRenderer()));
        builder.setTitle(context.getString(R.string.login_user_user_type_title));
        builder.setShowCloseButton(true);
        return builder.build();
    }
}
