package com.bbva.contacts;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Base64;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.utils.c;
import androidx.webkit.ProxyConfig;
import com.bbva.androidtoolkit.plugin.activity.ActivityResultListener;
import com.bbva.androidtoolkit.plugin.activity.ActivityResultRequest;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.nativesettings.common.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ContactAccessor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 12\u00020\u0001:\u0003123B\u000f\u0012\u0006\u0010.\u001a\u00020)¢\u0006\u0004\b/\u00100JE\u0010\n\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022*\u0010\u0007\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ=\u0010\u000f\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J%\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\u00020\u001d2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020 J\u0016\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"J\u0010\u0010'\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\u0002J\u001a\u0010'\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u001dR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00064"}, d2 = {"Lcom/bbva/contacts/ContactAccessor;", "Lcom/bbva/androidtoolkit/plugin/activity/ActivityResultListener;", "", "key", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "map", "isRequired$contacts_release", "(Ljava/lang/String;Ljava/util/HashMap;)Z", "isRequired", "Lorg/json/JSONObject;", "options", "buildPopulationSet$contacts_release", "(Lorg/json/JSONObject;)Ljava/util/HashMap;", "buildPopulationSet", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/contacts/ContactAccessor$OnPickContactResult;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "pickContact", "Landroid/content/Intent;", "data", "onSuccess", "onCancel", "filter", "", "fields", "Lorg/json/JSONArray;", "search", "(Ljava/lang/String;[Ljava/lang/String;)Lorg/json/JSONArray;", "", "getAllContacts", "", "contactId", "", "openPhoto", "id", "getContactById", "desiredFields", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "mCallback", "Lcom/bbva/contacts/ContactAccessor$OnPickContactResult;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "OnPickContactResult", "WhereOptions", "contacts_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nContactAccessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactAccessor.kt\ncom/bbva/contacts/ContactAccessor\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1590:1\n107#2:1591\n79#2,22:1592\n107#2:1614\n79#2,22:1615\n37#3,2:1637\n1#4:1639\n*S KotlinDebug\n*F\n+ 1 ContactAccessor.kt\ncom/bbva/contacts/ContactAccessor\n*L\n401#1:1591\n401#1:1592,22\n420#1:1614\n420#1:1615,22\n525#1:1637,2\n*E\n"})
public final class ContactAccessor implements ActivityResultListener {

    @NotNull
    public static final String ADDRESSES = "addresses";

    @NotNull
    public static final String BIRTHDAY = "birthday";

    @NotNull
    public static final String CATEGORIES = "categories";

    @NotNull
    public static final String DISPLAY_NAME = "displayName";

    @NotNull
    public static final String EMAILS = "emails";

    @NotNull
    private static final String EMAIL_REGEXP;

    @NotNull
    public static final String IMS = "ims";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String NICKNAME = "nickname";

    @NotNull
    public static final String NOTE = "note";

    @NotNull
    public static final String ORGANIZATIONS = "organizations";

    @NotNull
    public static final String PHONE_NUMBERS = "phoneNumbers";

    @NotNull
    public static final String PHOTO = "photo";

    @NotNull
    public static final String URLS = "urls";

    @NotNull
    public static final String WEB_SITES = "webSites";

    @NotNull
    private static final Map<String, String> dbMap;

    @Nullable
    private OnPickContactResult mCallback;

    @NotNull
    private final Context mContext;
    private static final String TAG = "ContactAccessor";

    /* JADX INFO: compiled from: ContactAccessor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bbva/contacts/ContactAccessor$OnPickContactResult;", "", "canceled", "", "success", "data", "Landroid/content/Intent;", "contacts_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnPickContactResult {
        void canceled();

        void success(@Nullable Intent data);
    }

    /* JADX INFO: compiled from: ContactAccessor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR,\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bbva/contacts/ContactAccessor$WhereOptions;", "", "", "a", "Ljava/lang/String;", "getWhere", "()Ljava/lang/String;", "setWhere", "(Ljava/lang/String;)V", "where", "", "b", "[Ljava/lang/String;", "getWhereArgs", "()[Ljava/lang/String;", "setWhereArgs", "([Ljava/lang/String;)V", "whereArgs", "<init>", "()V", "contacts_release"}, k = 1, mv = {1, 9, 0})
    public static final class WhereOptions {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String where;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String[] whereArgs;

        @Nullable
        public final String getWhere() {
            return this.where;
        }

        @Nullable
        public final String[] getWhereArgs() {
            return this.whereArgs;
        }

        public final void setWhere(@Nullable String str) {
            this.where = str;
        }

        public final void setWhereArgs(@Nullable String[] strArr) {
            this.whereArgs = strArr;
        }
    }

    static {
        String str = File.separator;
        EMAIL_REGEXP = c.a(".+@.+", str, str, ".+.+");
        HashMap map = new HashMap();
        dbMap = map;
        map.put("id", "contact_id");
        map.put(DISPLAY_NAME, "display_name");
        map.put("name", "data1");
        map.put("name.formatted", "data1");
        map.put("name.familyName", "data3");
        map.put("name.givenName", "data2");
        map.put("name.middleName", "data5");
        map.put("name.honorificPrefix", "data4");
        map.put("name.honorificSuffix", "data6");
        map.put(NICKNAME, "data1");
        map.put(PHONE_NUMBERS, "data1");
        map.put("phoneNumbers.value", "data1");
        map.put(EMAILS, "data1");
        map.put("emails.value", "data1");
        map.put(ADDRESSES, "data1");
        map.put("addresses.formatted", "data1");
        map.put("addresses.streetAddress", "data4");
        map.put("addresses.locality", "data7");
        map.put("addresses.region", "data8");
        map.put("addresses.postalCode", "data9");
        map.put("addresses.country", "data10");
        map.put(IMS, "data1");
        map.put("ims.value", "data1");
        map.put(ORGANIZATIONS, "data1");
        map.put("organizations.name", "data1");
        map.put("organizations.department", "data5");
        map.put("organizations.title", "data4");
        map.put(BIRTHDAY, "vnd.android.cursor.item/contact_event");
        map.put(NOTE, "data1");
        map.put("photos.value", "vnd.android.cursor.item/photo");
        map.put(URLS, "data1");
        map.put("urls.value", "data1");
    }

    public ContactAccessor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.mContext = applicationContext;
    }

    public static JSONObject a(Cursor cursor) {
        Object objM5535constructorimpl;
        JSONObject jSONObject = new JSONObject();
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNull(cursor);
            jSONObject.put("street", cursor.getString(cursor.getColumnIndexOrThrow("data4")));
            jSONObject.put("postalCode", cursor.getString(cursor.getColumnIndexOrThrow("data9")));
            jSONObject.put("city", cursor.getString(cursor.getColumnIndexOrThrow("data7")));
            objM5535constructorimpl = Result.m5535constructorimpl(jSONObject.put("country", cursor.getString(cursor.getColumnIndexOrThrow("data10"))));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            thM5538exceptionOrNullimpl.getMessage();
        }
        return jSONObject;
    }

    public static JSONObject b(Cursor cursor) {
        Object objM5535constructorimpl;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNull(cursor);
            jSONObject.put("value", cursor.getString(cursor.getColumnIndexOrThrow("data1")));
            int i10 = cursor.getInt(cursor.getColumnIndexOrThrow("data2"));
            if (i10 == 0) {
                str = "custom";
            } else if (i10 == 1) {
                str = Constants.HOME;
            } else if (i10 != 2) {
                str = "other";
                if (i10 != 3 && i10 == 4) {
                    str = "mobile";
                }
            } else {
                str = "work";
            }
            objM5535constructorimpl = Result.m5535constructorimpl(jSONObject.put("type", str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            thM5538exceptionOrNullimpl.getMessage();
        }
        return jSONObject;
    }

    public static String c(String str) {
        String strReplace$default = l.replace$default(str, "%", "", false, 4, (Object) null);
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        try {
            Phonenumber.PhoneNumber phoneNumber = phoneNumberUtil.parse(strReplace$default, Locale.getDefault().getCountry());
            Intrinsics.checkNotNullExpressionValue(phoneNumber, "parse(...)");
            String str2 = phoneNumberUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            strReplace$default = str2;
        } catch (NumberParseException e5) {
            e5.printStackTrace();
        }
        return h0.b("%", strReplace$default, "%");
    }

    public static String d(int i10) {
        switch (i10) {
            case 0:
                return "custom";
            case 1:
                return Constants.HOME;
            case 2:
                return "mobile";
            case 3:
                return "work";
            case 4:
                return "work fax";
            case 5:
                return "home fax";
            case 6:
                return "pager";
            case 7:
            case 12:
            default:
                return "other";
            case 8:
                return "callback";
            case 9:
                return "car";
            case 10:
                return "company main";
            case 11:
                return "isdn";
            case 13:
                return "other fax";
            case 14:
                return "radio";
            case 15:
                return "telex";
            case 16:
                return "tty ttd";
            case 17:
                return "work mobile";
            case 18:
                return "work pager";
            case 19:
                return "assistant";
            case 20:
                return "mms";
        }
    }

    public static JSONObject e(Cursor cursor) {
        Object objM5535constructorimpl;
        JSONObject jSONObject = new JSONObject();
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNull(cursor);
            String string = cursor.getString(cursor.getColumnIndexOrThrow("data3"));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("data2"));
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow("data1"));
            jSONObject.put(CustomerLoginsParser.FIRST_NAME, string2);
            jSONObject.put(CustomerLoginsParser.LAST_NAME, string);
            objM5535constructorimpl = Result.m5535constructorimpl(jSONObject.put(DISPLAY_NAME, string3));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            thM5538exceptionOrNullimpl.getMessage();
        }
        return jSONObject;
    }

    public static JSONObject f(Cursor cursor) {
        Object objM5535constructorimpl;
        JSONObject jSONObject = new JSONObject();
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNull(cursor);
            jSONObject.put("value", cursor.getString(cursor.getColumnIndexOrThrow("data1")));
            objM5535constructorimpl = Result.m5535constructorimpl(jSONObject.put("type", d(cursor.getInt(cursor.getColumnIndexOrThrow("data2")))));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            thM5538exceptionOrNullimpl.getMessage();
        }
        return jSONObject;
    }

    public static void g(JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, String str, String str2) {
        try {
            if (jSONArray.length() > 0) {
                jSONObject.put(ORGANIZATIONS, jSONArray);
            }
            if (jSONArray2.length() > 0) {
                jSONObject.put("postalAddresses", jSONArray2);
            }
            if (jSONArray3.length() > 0) {
                jSONObject.put(PHONE_NUMBERS, jSONArray3);
            }
            if (jSONArray4.length() > 0) {
                jSONObject.put(EMAILS, jSONArray4);
            }
            if (jSONArray5.length() > 0) {
                jSONObject.put(IMS, jSONArray5);
            }
            if (jSONArray6.length() > 0) {
                jSONObject.put(WEB_SITES, jSONArray6);
            }
            if (str != null) {
                jSONObject.put(PHOTO, str);
            }
            if (str2 != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("name");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject2.put("nickName", str2);
                jSONObject.put("name", jSONObject2);
            }
        } catch (JSONException e5) {
            e5.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    @NotNull
    public final HashMap<String, Boolean> buildPopulationSet$contacts_release(@Nullable JSONObject options) {
        JSONArray jSONArray;
        String str;
        String str2;
        String str3;
        HashMap<String, Boolean> map = new HashMap<>();
        if (options != null) {
            try {
                if (options.has("desiredFields")) {
                    jSONArray = options.getJSONArray("desiredFields");
                } else {
                    jSONArray = null;
                }
                String str4 = URLS;
                String str5 = PHOTO;
                if (jSONArray != null || jSONArray.length() == 0) {
                    Boolean bool = Boolean.TRUE;
                    map.put(DISPLAY_NAME, bool);
                    map.put("name", bool);
                    map.put(NICKNAME, bool);
                    map.put(PHONE_NUMBERS, bool);
                    map.put(EMAILS, bool);
                    map.put(ADDRESSES, bool);
                    map.put(IMS, bool);
                    map.put(ORGANIZATIONS, bool);
                    map.put(BIRTHDAY, bool);
                    map.put(NOTE, bool);
                    map.put(URLS, bool);
                    map.put(PHOTO, bool);
                    map.put(CATEGORIES, bool);
                } else {
                    int length = jSONArray.length();
                    String str6 = CATEGORIES;
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = length;
                        String string = jSONArray.getString(i10);
                        JSONArray jSONArray2 = jSONArray;
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        int i12 = i10;
                        String str7 = str5;
                        if (l.startsWith$default(string, DISPLAY_NAME, false, 2, null)) {
                            map.put(DISPLAY_NAME, Boolean.TRUE);
                        } else if (l.startsWith$default(string, "name", false, 2, null)) {
                            Boolean bool2 = Boolean.TRUE;
                            map.put(DISPLAY_NAME, bool2);
                            map.put("name", bool2);
                        } else if (l.startsWith$default(string, NICKNAME, false, 2, null)) {
                            map.put(NICKNAME, Boolean.TRUE);
                        } else if (l.startsWith$default(string, PHONE_NUMBERS, false, 2, null)) {
                            map.put(PHONE_NUMBERS, Boolean.TRUE);
                        } else if (l.startsWith$default(string, EMAILS, false, 2, null)) {
                            map.put(EMAILS, Boolean.TRUE);
                        } else if (l.startsWith$default(string, ADDRESSES, false, 2, null)) {
                            map.put("postalAddresses", Boolean.TRUE);
                        } else if (l.startsWith$default(string, IMS, false, 2, null)) {
                            map.put(IMS, Boolean.TRUE);
                        } else if (l.startsWith$default(string, ORGANIZATIONS, false, 2, null)) {
                            map.put(ORGANIZATIONS, Boolean.TRUE);
                        } else if (l.startsWith$default(string, BIRTHDAY, false, 2, null)) {
                            map.put(BIRTHDAY, Boolean.TRUE);
                        } else if (l.startsWith$default(string, NOTE, false, 2, null)) {
                            map.put(NOTE, Boolean.TRUE);
                        } else {
                            if (l.startsWith$default(string, str4, false, 2, null)) {
                                map.put(WEB_SITES, Boolean.TRUE);
                            } else {
                                str = str4;
                                if (l.startsWith$default(string, str7, false, 2, null)) {
                                    map.put(str7, Boolean.TRUE);
                                    str2 = str6;
                                    str3 = str7;
                                } else {
                                    str2 = str6;
                                    str3 = str7;
                                    if (l.startsWith$default(string, str2, false, 2, null)) {
                                        map.put(str2, Boolean.TRUE);
                                    }
                                }
                            }
                            str6 = str2;
                            str5 = str3;
                            length = i11;
                            str4 = str;
                            i10 = i12 + 1;
                            jSONArray = jSONArray2;
                        }
                        str2 = str6;
                        str3 = str7;
                        str = str4;
                        str6 = str2;
                        str5 = str3;
                        length = i11;
                        str4 = str;
                        i10 = i12 + 1;
                        jSONArray = jSONArray2;
                    }
                }
            } catch (JSONException e5) {
                e5.getMessage();
            }
        } else {
            jSONArray = null;
            String str8 = URLS;
            String str9 = PHOTO;
            if (jSONArray != null) {
                Boolean bool3 = Boolean.TRUE;
                map.put(DISPLAY_NAME, bool3);
                map.put("name", bool3);
                map.put(NICKNAME, bool3);
                map.put(PHONE_NUMBERS, bool3);
                map.put(EMAILS, bool3);
                map.put(ADDRESSES, bool3);
                map.put(IMS, bool3);
                map.put(ORGANIZATIONS, bool3);
                map.put(BIRTHDAY, bool3);
                map.put(NOTE, bool3);
                map.put(URLS, bool3);
                map.put(PHOTO, bool3);
                map.put(CATEGORIES, bool3);
            } else {
                Boolean bool4 = Boolean.TRUE;
                map.put(DISPLAY_NAME, bool4);
                map.put("name", bool4);
                map.put(NICKNAME, bool4);
                map.put(PHONE_NUMBERS, bool4);
                map.put(EMAILS, bool4);
                map.put(ADDRESSES, bool4);
                map.put(IMS, bool4);
                map.put(ORGANIZATIONS, bool4);
                map.put(BIRTHDAY, bool4);
                map.put(NOTE, bool4);
                map.put(URLS, bool4);
                map.put(PHOTO, bool4);
                map.put(CATEGORIES, bool4);
            }
        }
        return map;
    }

    @NotNull
    public final JSONArray getAllContacts(@NotNull List<String> fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONArray.put(0, ProxyConfig.MATCH_ALL_SCHEMES);
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it = fields.iterator();
            while (it.hasNext()) {
                jSONArray2.put(it.next());
            }
            jSONObject.put("desiredFields", jSONArray2);
        } catch (JSONException e5) {
            e5.getMessage();
        }
        return search(jSONArray, jSONObject);
    }

    @Nullable
    public final JSONObject getContactById(@NotNull String id) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        return getContactById(id, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0293 A[Catch: JSONException -> 0x02c6, TRY_LEAVE, TryCatch #2 {JSONException -> 0x02c6, blocks: (B:109:0x028b, B:111:0x0293, B:117:0x02b8, B:120:0x02c0, B:116:0x02ae, B:123:0x02d5, B:125:0x02dd, B:127:0x02e5, B:129:0x02f8, B:113:0x029b), top: B:156:0x028b, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02d5 A[Catch: JSONException -> 0x02c6, TryCatch #2 {JSONException -> 0x02c6, blocks: (B:109:0x028b, B:111:0x0293, B:117:0x02b8, B:120:0x02c0, B:116:0x02ae, B:123:0x02d5, B:125:0x02dd, B:127:0x02e5, B:129:0x02f8, B:113:0x029b), top: B:156:0x028b, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02dd A[Catch: JSONException -> 0x02c6, TryCatch #2 {JSONException -> 0x02c6, blocks: (B:109:0x028b, B:111:0x0293, B:117:0x02b8, B:120:0x02c0, B:116:0x02ae, B:123:0x02d5, B:125:0x02dd, B:127:0x02e5, B:129:0x02f8, B:113:0x029b), top: B:156:0x028b, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02f8 A[Catch: JSONException -> 0x02c6, TRY_LEAVE, TryCatch #2 {JSONException -> 0x02c6, blocks: (B:109:0x028b, B:111:0x0293, B:117:0x02b8, B:120:0x02c0, B:116:0x02ae, B:123:0x02d5, B:125:0x02dd, B:127:0x02e5, B:129:0x02f8, B:113:0x029b), top: B:156:0x028b, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:158:0x0255 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b2 A[Catch: JSONException -> 0x030f, TRY_ENTER, TRY_LEAVE, TryCatch #16 {JSONException -> 0x030f, blocks: (B:51:0x0189, B:59:0x01b2, B:65:0x01ca, B:71:0x01e2, B:77:0x01fa, B:90:0x0236, B:96:0x024d), top: B:184:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ca A[Catch: JSONException -> 0x030f, TRY_ENTER, TRY_LEAVE, TryCatch #16 {JSONException -> 0x030f, blocks: (B:51:0x0189, B:59:0x01b2, B:65:0x01ca, B:71:0x01e2, B:77:0x01fa, B:90:0x0236, B:96:0x024d), top: B:184:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01d2 A[Catch: JSONException -> 0x01a4, TRY_ENTER, TryCatch #1 {JSONException -> 0x01a4, blocks: (B:53:0x0191, B:55:0x0197, B:61:0x01ba, B:63:0x01c2, B:67:0x01d2, B:69:0x01da, B:73:0x01ea, B:75:0x01f2, B:79:0x0202, B:85:0x0227, B:88:0x022f, B:84:0x021d, B:92:0x023e, B:94:0x0244, B:81:0x020a), top: B:154:0x0191, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01e2 A[Catch: JSONException -> 0x030f, TRY_ENTER, TRY_LEAVE, TryCatch #16 {JSONException -> 0x030f, blocks: (B:51:0x0189, B:59:0x01b2, B:65:0x01ca, B:71:0x01e2, B:77:0x01fa, B:90:0x0236, B:96:0x024d), top: B:184:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea A[Catch: JSONException -> 0x01a4, TRY_ENTER, TryCatch #1 {JSONException -> 0x01a4, blocks: (B:53:0x0191, B:55:0x0197, B:61:0x01ba, B:63:0x01c2, B:67:0x01d2, B:69:0x01da, B:73:0x01ea, B:75:0x01f2, B:79:0x0202, B:85:0x0227, B:88:0x022f, B:84:0x021d, B:92:0x023e, B:94:0x0244, B:81:0x020a), top: B:154:0x0191, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01fa A[Catch: JSONException -> 0x030f, TRY_ENTER, TRY_LEAVE, TryCatch #16 {JSONException -> 0x030f, blocks: (B:51:0x0189, B:59:0x01b2, B:65:0x01ca, B:71:0x01e2, B:77:0x01fa, B:90:0x0236, B:96:0x024d), top: B:184:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0202 A[Catch: JSONException -> 0x01a4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x01a4, blocks: (B:53:0x0191, B:55:0x0197, B:61:0x01ba, B:63:0x01c2, B:67:0x01d2, B:69:0x01da, B:73:0x01ea, B:75:0x01f2, B:79:0x0202, B:85:0x0227, B:88:0x022f, B:84:0x021d, B:92:0x023e, B:94:0x0244, B:81:0x020a), top: B:154:0x0191, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0236 A[Catch: JSONException -> 0x030f, TRY_ENTER, TRY_LEAVE, TryCatch #16 {JSONException -> 0x030f, blocks: (B:51:0x0189, B:59:0x01b2, B:65:0x01ca, B:71:0x01e2, B:77:0x01fa, B:90:0x0236, B:96:0x024d), top: B:184:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x023e A[Catch: JSONException -> 0x01a4, TRY_ENTER, TryCatch #1 {JSONException -> 0x01a4, blocks: (B:53:0x0191, B:55:0x0197, B:61:0x01ba, B:63:0x01c2, B:67:0x01d2, B:69:0x01da, B:73:0x01ea, B:75:0x01f2, B:79:0x0202, B:85:0x0227, B:88:0x022f, B:84:0x021d, B:92:0x023e, B:94:0x0244, B:81:0x020a), top: B:154:0x0191, inners: #15 }] */
    public final JSONArray h(int i10, HashMap<String, Boolean> map, Cursor cursor) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        JSONArray jSONArray5;
        JSONArray jSONArray6;
        byte[] bArrOpenPhoto;
        String strEncodeToString;
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        String str = "getString(...)";
        JSONArray jSONArray7 = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray8 = new JSONArray();
        JSONArray jSONArray9 = new JSONArray();
        JSONArray jSONArray10 = new JSONArray();
        JSONArray jSONArray11 = new JSONArray();
        JSONArray jSONArray12 = new JSONArray();
        JSONArray jSONArray13 = new JSONArray();
        Intrinsics.checkNotNull(cursor);
        int columnIndex = cursor.getColumnIndex("contact_id");
        JSONArray jSONArray14 = jSONArray8;
        int columnIndex2 = cursor.getColumnIndex("raw_contact_id");
        JSONArray jSONArray15 = jSONArray9;
        int columnIndex3 = cursor.getColumnIndex("mimetype");
        JSONArray jSONArray16 = jSONArray11;
        int columnIndex4 = cursor.getColumnIndex("data1");
        JSONArray jSONArray17 = jSONArray12;
        int columnIndex5 = cursor.getColumnIndex("data1");
        if (cursor.getCount() > 0) {
            JSONArray jSONArray18 = jSONArray13;
            JSONObject jSONObject2 = jSONObject;
            boolean z10 = true;
            String str2 = "";
            String str3 = null;
            String string = null;
            JSONArray jSONArray19 = jSONArray10;
            String str4 = str2;
            while (cursor.moveToNext()) {
                String str5 = str4;
                int i11 = columnIndex5;
                if (jSONArray7.length() > i10 - 1) {
                    break;
                }
                try {
                    String string2 = cursor.getString(columnIndex);
                    Intrinsics.checkNotNullExpressionValue(string2, str);
                    try {
                        cursor.getString(columnIndex2);
                        if (Intrinsics.areEqual(cursor.getPosition() == 0 ? string2 : str5, string2)) {
                            jSONArray2 = jSONArray19;
                            jSONArray3 = jSONArray14;
                            jSONArray4 = jSONArray15;
                            jSONArray5 = jSONArray16;
                            jSONArray6 = jSONArray18;
                        } else {
                            try {
                                g(jSONObject2, jSONArray14, jSONArray15, jSONArray19, jSONArray16, jSONArray17, jSONArray18, str3, string);
                                jSONArray7.put(jSONObject2);
                                jSONObject2 = new JSONObject();
                                try {
                                    JSONArray jSONArray20 = new JSONArray();
                                    try {
                                        jSONArray15 = new JSONArray();
                                        try {
                                            jSONArray19 = new JSONArray();
                                            try {
                                                JSONArray jSONArray21 = new JSONArray();
                                                try {
                                                    JSONArray jSONArray22 = new JSONArray();
                                                    try {
                                                        jSONArray5 = jSONArray21;
                                                        jSONArray4 = jSONArray15;
                                                        jSONArray2 = jSONArray19;
                                                        jSONArray17 = jSONArray22;
                                                        z10 = true;
                                                        str3 = null;
                                                        string = null;
                                                        jSONArray6 = new JSONArray();
                                                        jSONArray3 = jSONArray20;
                                                        jSONObject2 = jSONObject2;
                                                    } catch (JSONException e5) {
                                                        e = e5;
                                                        str = str;
                                                        jSONArray7 = jSONArray7;
                                                        columnIndex2 = columnIndex2;
                                                        columnIndex = columnIndex;
                                                        jSONArray17 = jSONArray22;
                                                        jSONArray16 = jSONArray21;
                                                        jSONArray14 = jSONArray20;
                                                        str2 = string2;
                                                        e.getMessage();
                                                        columnIndex5 = i11;
                                                        str4 = str2;
                                                        columnIndex2 = columnIndex2;
                                                        columnIndex = columnIndex;
                                                        str = str;
                                                        jSONArray7 = jSONArray7;
                                                    }
                                                } catch (JSONException e7) {
                                                    e = e7;
                                                    jSONArray16 = jSONArray21;
                                                    jSONArray14 = jSONArray20;
                                                    str2 = string2;
                                                    e.getMessage();
                                                    columnIndex5 = i11;
                                                    str4 = str2;
                                                    columnIndex2 = columnIndex2;
                                                    columnIndex = columnIndex;
                                                    str = str;
                                                    jSONArray7 = jSONArray7;
                                                }
                                            } catch (JSONException e10) {
                                                e = e10;
                                            }
                                        } catch (JSONException e11) {
                                            e = e11;
                                            str = str;
                                            jSONArray7 = jSONArray7;
                                            columnIndex2 = columnIndex2;
                                            columnIndex = columnIndex;
                                            i11 = i11;
                                        }
                                    } catch (JSONException e12) {
                                        e = e12;
                                        jSONArray14 = jSONArray20;
                                        columnIndex = columnIndex;
                                        i11 = i11;
                                        str2 = string2;
                                        e.getMessage();
                                        columnIndex5 = i11;
                                        str4 = str2;
                                        columnIndex2 = columnIndex2;
                                        columnIndex = columnIndex;
                                        str = str;
                                        jSONArray7 = jSONArray7;
                                    }
                                } catch (JSONException e13) {
                                    e = e13;
                                }
                            } catch (JSONException e14) {
                                e = e14;
                                str2 = string2;
                                columnIndex = columnIndex;
                                i11 = i11;
                                e.getMessage();
                                columnIndex5 = i11;
                                str4 = str2;
                                columnIndex2 = columnIndex2;
                                columnIndex = columnIndex;
                                str = str;
                                jSONArray7 = jSONArray7;
                            }
                        }
                        if (z10) {
                            z10 = false;
                        }
                        try {
                            String string3 = cursor.getString(columnIndex3);
                            Intrinsics.checkNotNullExpressionValue(string3, str);
                            str = str;
                            try {
                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/name")) {
                                    try {
                                        if (isRequired$contacts_release("name", map)) {
                                            jSONObject2.put("name", e(cursor));
                                        } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/phone_v2") && isRequired$contacts_release(PHONE_NUMBERS, map)) {
                                            jSONArray2.put(f(cursor));
                                        } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/email_v2") && isRequired$contacts_release(EMAILS, map)) {
                                            jSONArray5.put(b(cursor));
                                        } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/postal-address_v2") && isRequired$contacts_release(ADDRESSES, map)) {
                                            jSONArray4.put(a(cursor));
                                        } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/organization") && isRequired$contacts_release(ORGANIZATIONS, map)) {
                                            try {
                                                Result.Companion companion = Result.INSTANCE;
                                                Intrinsics.checkNotNull(cursor);
                                                objM5535constructorimpl2 = Result.m5535constructorimpl(cursor.getString(cursor.getColumnIndexOrThrow("data1")));
                                            } catch (Throwable th2) {
                                                Result.Companion companion2 = Result.INSTANCE;
                                                objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                                            }
                                            if (Result.m5540isFailureimpl(objM5535constructorimpl2)) {
                                                objM5535constructorimpl2 = "";
                                            }
                                            jSONArray3.put((String) objM5535constructorimpl2);
                                        } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note") || !isRequired$contacts_release(NOTE, map)) {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                                try {
                                                    if (isRequired$contacts_release(NICKNAME, map)) {
                                                        i11 = i11;
                                                        try {
                                                            string = cursor.getString(i11);
                                                            jSONArray15 = jSONArray4;
                                                            jSONArray16 = jSONArray5;
                                                            jSONArray19 = jSONArray2;
                                                            jSONArray18 = jSONArray6;
                                                            jSONArray14 = jSONArray3;
                                                            str2 = string2;
                                                        } catch (JSONException e15) {
                                                            e = e15;
                                                            jSONArray15 = jSONArray4;
                                                            jSONArray16 = jSONArray5;
                                                            jSONArray19 = jSONArray2;
                                                            jSONArray18 = jSONArray6;
                                                            jSONArray14 = jSONArray3;
                                                            str2 = string2;
                                                            e.getMessage();
                                                        }
                                                    }
                                                } catch (JSONException e16) {
                                                    e = e16;
                                                    i11 = i11;
                                                }
                                            }
                                            i11 = i11;
                                            jSONArray4 = jSONArray4;
                                            try {
                                                if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website") && isRequired$contacts_release(URLS, map)) {
                                                    try {
                                                        Result.Companion companion3 = Result.INSTANCE;
                                                        Intrinsics.checkNotNull(cursor);
                                                        objM5535constructorimpl = Result.m5535constructorimpl(cursor.getString(cursor.getColumnIndexOrThrow("data1")));
                                                    } catch (Throwable th3) {
                                                        Result.Companion companion4 = Result.INSTANCE;
                                                        objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th3));
                                                    }
                                                    if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                                                        objM5535constructorimpl = "";
                                                    }
                                                    jSONArray6.put((String) objM5535constructorimpl);
                                                } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo") && isRequired$contacts_release(PHOTO, map)) {
                                                    Long lValueOf = Long.valueOf(string2);
                                                    Intrinsics.checkNotNullExpressionValue(lValueOf, "valueOf(...)");
                                                    bArrOpenPhoto = openPhoto(lValueOf.longValue());
                                                    if (bArrOpenPhoto != null) {
                                                        strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                    } else {
                                                        strEncodeToString = null;
                                                    }
                                                    str3 = strEncodeToString;
                                                }
                                                jSONArray16 = jSONArray5;
                                                jSONArray18 = jSONArray6;
                                                jSONArray14 = jSONArray3;
                                                jSONArray15 = jSONArray4;
                                                str2 = string2;
                                                jSONArray19 = jSONArray2;
                                            } catch (JSONException e17) {
                                                e = e17;
                                                jSONArray16 = jSONArray5;
                                                jSONArray18 = jSONArray6;
                                                jSONArray14 = jSONArray3;
                                                jSONArray15 = jSONArray4;
                                                str2 = string2;
                                                jSONArray19 = jSONArray2;
                                                e.getMessage();
                                            }
                                        } else {
                                            jSONObject2.put(NOTE, cursor.getString(columnIndex4));
                                        }
                                        jSONArray4 = jSONArray4;
                                        i11 = i11;
                                        jSONArray16 = jSONArray5;
                                        jSONArray18 = jSONArray6;
                                        jSONArray14 = jSONArray3;
                                        jSONArray15 = jSONArray4;
                                        str2 = string2;
                                        jSONArray19 = jSONArray2;
                                    } catch (JSONException e18) {
                                        e = e18;
                                        jSONArray15 = jSONArray4;
                                        jSONArray16 = jSONArray5;
                                        jSONArray19 = jSONArray2;
                                        jSONArray18 = jSONArray6;
                                        jSONArray14 = jSONArray3;
                                        str2 = string2;
                                        i11 = i11;
                                        e.getMessage();
                                    }
                                } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/phone_v2")) {
                                    if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/email_v2")) {
                                        if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/postal-address_v2")) {
                                            if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/organization")) {
                                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                                }
                                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                                    if (isRequired$contacts_release(NICKNAME, map)) {
                                                        i11 = i11;
                                                        string = cursor.getString(i11);
                                                        jSONArray15 = jSONArray4;
                                                        jSONArray16 = jSONArray5;
                                                        jSONArray19 = jSONArray2;
                                                        jSONArray18 = jSONArray6;
                                                        jSONArray14 = jSONArray3;
                                                        str2 = string2;
                                                    }
                                                }
                                                i11 = i11;
                                                jSONArray4 = jSONArray4;
                                                if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                                    if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                        Long lValueOf2 = Long.valueOf(string2);
                                                        Intrinsics.checkNotNullExpressionValue(lValueOf2, "valueOf(...)");
                                                        bArrOpenPhoto = openPhoto(lValueOf2.longValue());
                                                        if (bArrOpenPhoto != null) {
                                                            strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                        } else {
                                                            strEncodeToString = null;
                                                        }
                                                        str3 = strEncodeToString;
                                                    }
                                                } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                    Long lValueOf3 = Long.valueOf(string2);
                                                    Intrinsics.checkNotNullExpressionValue(lValueOf3, "valueOf(...)");
                                                    bArrOpenPhoto = openPhoto(lValueOf3.longValue());
                                                    if (bArrOpenPhoto != null) {
                                                        strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                    } else {
                                                        strEncodeToString = null;
                                                    }
                                                    str3 = strEncodeToString;
                                                }
                                                jSONArray16 = jSONArray5;
                                                jSONArray18 = jSONArray6;
                                                jSONArray14 = jSONArray3;
                                                jSONArray15 = jSONArray4;
                                                str2 = string2;
                                                jSONArray19 = jSONArray2;
                                            } else {
                                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                                }
                                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                                    if (isRequired$contacts_release(NICKNAME, map)) {
                                                        i11 = i11;
                                                        string = cursor.getString(i11);
                                                        jSONArray15 = jSONArray4;
                                                        jSONArray16 = jSONArray5;
                                                        jSONArray19 = jSONArray2;
                                                        jSONArray18 = jSONArray6;
                                                        jSONArray14 = jSONArray3;
                                                        str2 = string2;
                                                    }
                                                }
                                                i11 = i11;
                                                jSONArray4 = jSONArray4;
                                                if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                                    if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                        Long lValueOf4 = Long.valueOf(string2);
                                                        Intrinsics.checkNotNullExpressionValue(lValueOf4, "valueOf(...)");
                                                        bArrOpenPhoto = openPhoto(lValueOf4.longValue());
                                                        if (bArrOpenPhoto != null) {
                                                            strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                        } else {
                                                            strEncodeToString = null;
                                                        }
                                                        str3 = strEncodeToString;
                                                    }
                                                } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                    Long lValueOf5 = Long.valueOf(string2);
                                                    Intrinsics.checkNotNullExpressionValue(lValueOf5, "valueOf(...)");
                                                    bArrOpenPhoto = openPhoto(lValueOf5.longValue());
                                                    if (bArrOpenPhoto != null) {
                                                        strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                    } else {
                                                        strEncodeToString = null;
                                                    }
                                                    str3 = strEncodeToString;
                                                }
                                                jSONArray16 = jSONArray5;
                                                jSONArray18 = jSONArray6;
                                                jSONArray14 = jSONArray3;
                                                jSONArray15 = jSONArray4;
                                                str2 = string2;
                                                jSONArray19 = jSONArray2;
                                            }
                                        } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/organization")) {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                            }
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                                if (isRequired$contacts_release(NICKNAME, map)) {
                                                    i11 = i11;
                                                    string = cursor.getString(i11);
                                                    jSONArray15 = jSONArray4;
                                                    jSONArray16 = jSONArray5;
                                                    jSONArray19 = jSONArray2;
                                                    jSONArray18 = jSONArray6;
                                                    jSONArray14 = jSONArray3;
                                                    str2 = string2;
                                                }
                                            }
                                            i11 = i11;
                                            jSONArray4 = jSONArray4;
                                            if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                    Long lValueOf6 = Long.valueOf(string2);
                                                    Intrinsics.checkNotNullExpressionValue(lValueOf6, "valueOf(...)");
                                                    bArrOpenPhoto = openPhoto(lValueOf6.longValue());
                                                    if (bArrOpenPhoto != null) {
                                                        strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                    } else {
                                                        strEncodeToString = null;
                                                    }
                                                    str3 = strEncodeToString;
                                                }
                                            } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf7 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf7, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf7.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                            jSONArray16 = jSONArray5;
                                            jSONArray18 = jSONArray6;
                                            jSONArray14 = jSONArray3;
                                            jSONArray15 = jSONArray4;
                                            str2 = string2;
                                            jSONArray19 = jSONArray2;
                                        } else {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                            }
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                                if (isRequired$contacts_release(NICKNAME, map)) {
                                                    i11 = i11;
                                                    string = cursor.getString(i11);
                                                    jSONArray15 = jSONArray4;
                                                    jSONArray16 = jSONArray5;
                                                    jSONArray19 = jSONArray2;
                                                    jSONArray18 = jSONArray6;
                                                    jSONArray14 = jSONArray3;
                                                    str2 = string2;
                                                }
                                            }
                                            i11 = i11;
                                            jSONArray4 = jSONArray4;
                                            if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                    Long lValueOf8 = Long.valueOf(string2);
                                                    Intrinsics.checkNotNullExpressionValue(lValueOf8, "valueOf(...)");
                                                    bArrOpenPhoto = openPhoto(lValueOf8.longValue());
                                                    if (bArrOpenPhoto != null) {
                                                        strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                    } else {
                                                        strEncodeToString = null;
                                                    }
                                                    str3 = strEncodeToString;
                                                }
                                            } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf9 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf9, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf9.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                            jSONArray16 = jSONArray5;
                                            jSONArray18 = jSONArray6;
                                            jSONArray14 = jSONArray3;
                                            jSONArray15 = jSONArray4;
                                            str2 = string2;
                                            jSONArray19 = jSONArray2;
                                        }
                                    } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/postal-address_v2")) {
                                        if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/organization")) {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                            }
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                                if (isRequired$contacts_release(NICKNAME, map)) {
                                                    i11 = i11;
                                                    string = cursor.getString(i11);
                                                    jSONArray15 = jSONArray4;
                                                    jSONArray16 = jSONArray5;
                                                    jSONArray19 = jSONArray2;
                                                    jSONArray18 = jSONArray6;
                                                    jSONArray14 = jSONArray3;
                                                    str2 = string2;
                                                }
                                            }
                                            i11 = i11;
                                            jSONArray4 = jSONArray4;
                                            if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                    Long lValueOf10 = Long.valueOf(string2);
                                                    Intrinsics.checkNotNullExpressionValue(lValueOf10, "valueOf(...)");
                                                    bArrOpenPhoto = openPhoto(lValueOf10.longValue());
                                                    if (bArrOpenPhoto != null) {
                                                        strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                    } else {
                                                        strEncodeToString = null;
                                                    }
                                                    str3 = strEncodeToString;
                                                }
                                            } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf11 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf11, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf11.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                            jSONArray16 = jSONArray5;
                                            jSONArray18 = jSONArray6;
                                            jSONArray14 = jSONArray3;
                                            jSONArray15 = jSONArray4;
                                            str2 = string2;
                                            jSONArray19 = jSONArray2;
                                        } else {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                            }
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                                if (isRequired$contacts_release(NICKNAME, map)) {
                                                    i11 = i11;
                                                    string = cursor.getString(i11);
                                                    jSONArray15 = jSONArray4;
                                                    jSONArray16 = jSONArray5;
                                                    jSONArray19 = jSONArray2;
                                                    jSONArray18 = jSONArray6;
                                                    jSONArray14 = jSONArray3;
                                                    str2 = string2;
                                                }
                                            }
                                            i11 = i11;
                                            jSONArray4 = jSONArray4;
                                            if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                    Long lValueOf12 = Long.valueOf(string2);
                                                    Intrinsics.checkNotNullExpressionValue(lValueOf12, "valueOf(...)");
                                                    bArrOpenPhoto = openPhoto(lValueOf12.longValue());
                                                    if (bArrOpenPhoto != null) {
                                                        strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                    } else {
                                                        strEncodeToString = null;
                                                    }
                                                    str3 = strEncodeToString;
                                                }
                                            } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf13 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf13, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf13.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                            jSONArray16 = jSONArray5;
                                            jSONArray18 = jSONArray6;
                                            jSONArray14 = jSONArray3;
                                            jSONArray15 = jSONArray4;
                                            str2 = string2;
                                            jSONArray19 = jSONArray2;
                                        }
                                    } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/organization")) {
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                        }
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                            if (isRequired$contacts_release(NICKNAME, map)) {
                                                i11 = i11;
                                                string = cursor.getString(i11);
                                                jSONArray15 = jSONArray4;
                                                jSONArray16 = jSONArray5;
                                                jSONArray19 = jSONArray2;
                                                jSONArray18 = jSONArray6;
                                                jSONArray14 = jSONArray3;
                                                str2 = string2;
                                            }
                                        }
                                        i11 = i11;
                                        jSONArray4 = jSONArray4;
                                        if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf14 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf14, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf14.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                        } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                            Long lValueOf15 = Long.valueOf(string2);
                                            Intrinsics.checkNotNullExpressionValue(lValueOf15, "valueOf(...)");
                                            bArrOpenPhoto = openPhoto(lValueOf15.longValue());
                                            if (bArrOpenPhoto != null) {
                                                strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                            } else {
                                                strEncodeToString = null;
                                            }
                                            str3 = strEncodeToString;
                                        }
                                        jSONArray16 = jSONArray5;
                                        jSONArray18 = jSONArray6;
                                        jSONArray14 = jSONArray3;
                                        jSONArray15 = jSONArray4;
                                        str2 = string2;
                                        jSONArray19 = jSONArray2;
                                    } else {
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                        }
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                            if (isRequired$contacts_release(NICKNAME, map)) {
                                                i11 = i11;
                                                string = cursor.getString(i11);
                                                jSONArray15 = jSONArray4;
                                                jSONArray16 = jSONArray5;
                                                jSONArray19 = jSONArray2;
                                                jSONArray18 = jSONArray6;
                                                jSONArray14 = jSONArray3;
                                                str2 = string2;
                                            }
                                        }
                                        i11 = i11;
                                        jSONArray4 = jSONArray4;
                                        if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf16 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf16, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf16.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                        } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                            Long lValueOf17 = Long.valueOf(string2);
                                            Intrinsics.checkNotNullExpressionValue(lValueOf17, "valueOf(...)");
                                            bArrOpenPhoto = openPhoto(lValueOf17.longValue());
                                            if (bArrOpenPhoto != null) {
                                                strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                            } else {
                                                strEncodeToString = null;
                                            }
                                            str3 = strEncodeToString;
                                        }
                                        jSONArray16 = jSONArray5;
                                        jSONArray18 = jSONArray6;
                                        jSONArray14 = jSONArray3;
                                        jSONArray15 = jSONArray4;
                                        str2 = string2;
                                        jSONArray19 = jSONArray2;
                                    }
                                } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/email_v2")) {
                                    if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/postal-address_v2")) {
                                        if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/organization")) {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                            }
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                                if (isRequired$contacts_release(NICKNAME, map)) {
                                                    i11 = i11;
                                                    string = cursor.getString(i11);
                                                    jSONArray15 = jSONArray4;
                                                    jSONArray16 = jSONArray5;
                                                    jSONArray19 = jSONArray2;
                                                    jSONArray18 = jSONArray6;
                                                    jSONArray14 = jSONArray3;
                                                    str2 = string2;
                                                }
                                            }
                                            i11 = i11;
                                            jSONArray4 = jSONArray4;
                                            if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                    Long lValueOf18 = Long.valueOf(string2);
                                                    Intrinsics.checkNotNullExpressionValue(lValueOf18, "valueOf(...)");
                                                    bArrOpenPhoto = openPhoto(lValueOf18.longValue());
                                                    if (bArrOpenPhoto != null) {
                                                        strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                    } else {
                                                        strEncodeToString = null;
                                                    }
                                                    str3 = strEncodeToString;
                                                }
                                            } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf19 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf19, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf19.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                            jSONArray16 = jSONArray5;
                                            jSONArray18 = jSONArray6;
                                            jSONArray14 = jSONArray3;
                                            jSONArray15 = jSONArray4;
                                            str2 = string2;
                                            jSONArray19 = jSONArray2;
                                        } else {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                            }
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                                if (isRequired$contacts_release(NICKNAME, map)) {
                                                    i11 = i11;
                                                    string = cursor.getString(i11);
                                                    jSONArray15 = jSONArray4;
                                                    jSONArray16 = jSONArray5;
                                                    jSONArray19 = jSONArray2;
                                                    jSONArray18 = jSONArray6;
                                                    jSONArray14 = jSONArray3;
                                                    str2 = string2;
                                                }
                                            }
                                            i11 = i11;
                                            jSONArray4 = jSONArray4;
                                            if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                                if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                    Long lValueOf110 = Long.valueOf(string2);
                                                    Intrinsics.checkNotNullExpressionValue(lValueOf110, "valueOf(...)");
                                                    bArrOpenPhoto = openPhoto(lValueOf110.longValue());
                                                    if (bArrOpenPhoto != null) {
                                                        strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                    } else {
                                                        strEncodeToString = null;
                                                    }
                                                    str3 = strEncodeToString;
                                                }
                                            } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf111 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf111, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf111.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                            jSONArray16 = jSONArray5;
                                            jSONArray18 = jSONArray6;
                                            jSONArray14 = jSONArray3;
                                            jSONArray15 = jSONArray4;
                                            str2 = string2;
                                            jSONArray19 = jSONArray2;
                                        }
                                    } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/organization")) {
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                        }
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                            if (isRequired$contacts_release(NICKNAME, map)) {
                                                i11 = i11;
                                                string = cursor.getString(i11);
                                                jSONArray15 = jSONArray4;
                                                jSONArray16 = jSONArray5;
                                                jSONArray19 = jSONArray2;
                                                jSONArray18 = jSONArray6;
                                                jSONArray14 = jSONArray3;
                                                str2 = string2;
                                            }
                                        }
                                        i11 = i11;
                                        jSONArray4 = jSONArray4;
                                        if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf112 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf112, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf112.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                        } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                            Long lValueOf113 = Long.valueOf(string2);
                                            Intrinsics.checkNotNullExpressionValue(lValueOf113, "valueOf(...)");
                                            bArrOpenPhoto = openPhoto(lValueOf113.longValue());
                                            if (bArrOpenPhoto != null) {
                                                strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                            } else {
                                                strEncodeToString = null;
                                            }
                                            str3 = strEncodeToString;
                                        }
                                        jSONArray16 = jSONArray5;
                                        jSONArray18 = jSONArray6;
                                        jSONArray14 = jSONArray3;
                                        jSONArray15 = jSONArray4;
                                        str2 = string2;
                                        jSONArray19 = jSONArray2;
                                    } else {
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                        }
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                            if (isRequired$contacts_release(NICKNAME, map)) {
                                                i11 = i11;
                                                string = cursor.getString(i11);
                                                jSONArray15 = jSONArray4;
                                                jSONArray16 = jSONArray5;
                                                jSONArray19 = jSONArray2;
                                                jSONArray18 = jSONArray6;
                                                jSONArray14 = jSONArray3;
                                                str2 = string2;
                                            }
                                        }
                                        i11 = i11;
                                        jSONArray4 = jSONArray4;
                                        if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf114 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf114, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf114.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                        } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                            Long lValueOf115 = Long.valueOf(string2);
                                            Intrinsics.checkNotNullExpressionValue(lValueOf115, "valueOf(...)");
                                            bArrOpenPhoto = openPhoto(lValueOf115.longValue());
                                            if (bArrOpenPhoto != null) {
                                                strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                            } else {
                                                strEncodeToString = null;
                                            }
                                            str3 = strEncodeToString;
                                        }
                                        jSONArray16 = jSONArray5;
                                        jSONArray18 = jSONArray6;
                                        jSONArray14 = jSONArray3;
                                        jSONArray15 = jSONArray4;
                                        str2 = string2;
                                        jSONArray19 = jSONArray2;
                                    }
                                } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/postal-address_v2")) {
                                    if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/organization")) {
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                        }
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                            if (isRequired$contacts_release(NICKNAME, map)) {
                                                i11 = i11;
                                                string = cursor.getString(i11);
                                                jSONArray15 = jSONArray4;
                                                jSONArray16 = jSONArray5;
                                                jSONArray19 = jSONArray2;
                                                jSONArray18 = jSONArray6;
                                                jSONArray14 = jSONArray3;
                                                str2 = string2;
                                            }
                                        }
                                        i11 = i11;
                                        jSONArray4 = jSONArray4;
                                        if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf116 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf116, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf116.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                        } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                            Long lValueOf117 = Long.valueOf(string2);
                                            Intrinsics.checkNotNullExpressionValue(lValueOf117, "valueOf(...)");
                                            bArrOpenPhoto = openPhoto(lValueOf117.longValue());
                                            if (bArrOpenPhoto != null) {
                                                strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                            } else {
                                                strEncodeToString = null;
                                            }
                                            str3 = strEncodeToString;
                                        }
                                        jSONArray16 = jSONArray5;
                                        jSONArray18 = jSONArray6;
                                        jSONArray14 = jSONArray3;
                                        jSONArray15 = jSONArray4;
                                        str2 = string2;
                                        jSONArray19 = jSONArray2;
                                    } else {
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                        }
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                            if (isRequired$contacts_release(NICKNAME, map)) {
                                                i11 = i11;
                                                string = cursor.getString(i11);
                                                jSONArray15 = jSONArray4;
                                                jSONArray16 = jSONArray5;
                                                jSONArray19 = jSONArray2;
                                                jSONArray18 = jSONArray6;
                                                jSONArray14 = jSONArray3;
                                                str2 = string2;
                                            }
                                        }
                                        i11 = i11;
                                        jSONArray4 = jSONArray4;
                                        if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                            if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                                Long lValueOf118 = Long.valueOf(string2);
                                                Intrinsics.checkNotNullExpressionValue(lValueOf118, "valueOf(...)");
                                                bArrOpenPhoto = openPhoto(lValueOf118.longValue());
                                                if (bArrOpenPhoto != null) {
                                                    strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                                } else {
                                                    strEncodeToString = null;
                                                }
                                                str3 = strEncodeToString;
                                            }
                                        } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                            Long lValueOf119 = Long.valueOf(string2);
                                            Intrinsics.checkNotNullExpressionValue(lValueOf119, "valueOf(...)");
                                            bArrOpenPhoto = openPhoto(lValueOf119.longValue());
                                            if (bArrOpenPhoto != null) {
                                                strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                            } else {
                                                strEncodeToString = null;
                                            }
                                            str3 = strEncodeToString;
                                        }
                                        jSONArray16 = jSONArray5;
                                        jSONArray18 = jSONArray6;
                                        jSONArray14 = jSONArray3;
                                        jSONArray15 = jSONArray4;
                                        str2 = string2;
                                        jSONArray19 = jSONArray2;
                                    }
                                } else if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/organization")) {
                                    if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                    }
                                    if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                        if (isRequired$contacts_release(NICKNAME, map)) {
                                            i11 = i11;
                                            string = cursor.getString(i11);
                                            jSONArray15 = jSONArray4;
                                            jSONArray16 = jSONArray5;
                                            jSONArray19 = jSONArray2;
                                            jSONArray18 = jSONArray6;
                                            jSONArray14 = jSONArray3;
                                            str2 = string2;
                                        }
                                    }
                                    i11 = i11;
                                    jSONArray4 = jSONArray4;
                                    if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                            Long lValueOf1110 = Long.valueOf(string2);
                                            Intrinsics.checkNotNullExpressionValue(lValueOf1110, "valueOf(...)");
                                            bArrOpenPhoto = openPhoto(lValueOf1110.longValue());
                                            if (bArrOpenPhoto != null) {
                                                strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                            } else {
                                                strEncodeToString = null;
                                            }
                                            str3 = strEncodeToString;
                                        }
                                    } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                        Long lValueOf1111 = Long.valueOf(string2);
                                        Intrinsics.checkNotNullExpressionValue(lValueOf1111, "valueOf(...)");
                                        bArrOpenPhoto = openPhoto(lValueOf1111.longValue());
                                        if (bArrOpenPhoto != null) {
                                            strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                        } else {
                                            strEncodeToString = null;
                                        }
                                        str3 = strEncodeToString;
                                    }
                                    jSONArray16 = jSONArray5;
                                    jSONArray18 = jSONArray6;
                                    jSONArray14 = jSONArray3;
                                    jSONArray15 = jSONArray4;
                                    str2 = string2;
                                    jSONArray19 = jSONArray2;
                                } else {
                                    if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/note")) {
                                    }
                                    if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/nickname")) {
                                        if (isRequired$contacts_release(NICKNAME, map)) {
                                            i11 = i11;
                                            string = cursor.getString(i11);
                                            jSONArray15 = jSONArray4;
                                            jSONArray16 = jSONArray5;
                                            jSONArray19 = jSONArray2;
                                            jSONArray18 = jSONArray6;
                                            jSONArray14 = jSONArray3;
                                            str2 = string2;
                                        }
                                    }
                                    i11 = i11;
                                    jSONArray4 = jSONArray4;
                                    if (!Intrinsics.areEqual(string3, "vnd.android.cursor.item/website")) {
                                        if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                            Long lValueOf1112 = Long.valueOf(string2);
                                            Intrinsics.checkNotNullExpressionValue(lValueOf1112, "valueOf(...)");
                                            bArrOpenPhoto = openPhoto(lValueOf1112.longValue());
                                            if (bArrOpenPhoto != null) {
                                                strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                            } else {
                                                strEncodeToString = null;
                                            }
                                            str3 = strEncodeToString;
                                        }
                                    } else if (Intrinsics.areEqual(string3, "vnd.android.cursor.item/photo")) {
                                        Long lValueOf1113 = Long.valueOf(string2);
                                        Intrinsics.checkNotNullExpressionValue(lValueOf1113, "valueOf(...)");
                                        bArrOpenPhoto = openPhoto(lValueOf1113.longValue());
                                        if (bArrOpenPhoto != null) {
                                            strEncodeToString = Base64.encodeToString(bArrOpenPhoto, 2);
                                        } else {
                                            strEncodeToString = null;
                                        }
                                        str3 = strEncodeToString;
                                    }
                                    jSONArray16 = jSONArray5;
                                    jSONArray18 = jSONArray6;
                                    jSONArray14 = jSONArray3;
                                    jSONArray15 = jSONArray4;
                                    str2 = string2;
                                    jSONArray19 = jSONArray2;
                                }
                            } catch (JSONException e19) {
                                e = e19;
                                i11 = i11;
                                jSONArray16 = jSONArray5;
                                jSONArray18 = jSONArray6;
                                jSONArray14 = jSONArray3;
                                jSONArray15 = jSONArray4;
                                str2 = string2;
                                jSONArray19 = jSONArray2;
                                e.getMessage();
                                columnIndex5 = i11;
                                str4 = str2;
                                columnIndex2 = columnIndex2;
                                columnIndex = columnIndex;
                                str = str;
                                jSONArray7 = jSONArray7;
                            }
                        } catch (JSONException e20) {
                            e = e20;
                            str = str;
                        }
                    } catch (JSONException e21) {
                        e = e21;
                        str = str;
                        jSONArray7 = jSONArray7;
                        columnIndex2 = columnIndex2;
                        string2 = string2;
                        columnIndex = columnIndex;
                        i11 = i11;
                    }
                } catch (JSONException e22) {
                    e = e22;
                }
                columnIndex5 = i11;
                str4 = str2;
                columnIndex2 = columnIndex2;
                columnIndex = columnIndex;
                str = str;
                jSONArray7 = jSONArray7;
            }
            JSONArray jSONArray23 = jSONArray7;
            if (jSONArray23.length() < i10) {
                g(jSONObject2, jSONArray14, jSONArray15, jSONArray19, jSONArray16, jSONArray17, jSONArray18, str3, string);
                jSONArray = jSONArray23;
                jSONArray.put(jSONObject2);
            } else {
                jSONArray = jSONArray23;
            }
        } else {
            jSONArray = jSONArray7;
        }
        cursor.close();
        return jSONArray;
    }

    public final boolean isRequired$contacts_release(@Nullable String key, @NotNull HashMap<String, Boolean> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Boolean bool = map.get(key);
        return bool != null && bool.booleanValue();
    }

    @Override // com.bbva.androidtoolkit.plugin.activity.ActivityResultListener
    public void onCancel() {
        OnPickContactResult onPickContactResult = this.mCallback;
        if (onPickContactResult != null) {
            Intrinsics.checkNotNull(onPickContactResult);
            onPickContactResult.canceled();
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.activity.ActivityResultListener
    public void onSuccess(@NotNull Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        OnPickContactResult onPickContactResult = this.mCallback;
        if (onPickContactResult != null) {
            Intrinsics.checkNotNull(onPickContactResult);
            onPickContactResult.success(data);
        }
    }

    @Nullable
    public final byte[] openPhoto(long contactId) {
        byte[] blob;
        Uri uriWithAppendedId = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, contactId);
        Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
        Cursor cursorQuery = this.mContext.getContentResolver().query(Uri.withAppendedPath(uriWithAppendedId, PHOTO), new String[]{"data15"}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst() && (blob = cursorQuery.getBlob(0)) != null) {
                CloseableKt.closeFinally(cursorQuery, null);
                return blob;
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursorQuery, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(cursorQuery, th2);
                throw th3;
            }
        }
    }

    public final void pickContact(@Nullable Activity activity, @Nullable OnPickContactResult listener) {
        if (activity != null) {
            this.mCallback = listener;
            ActivityResultRequest.create().action("android.intent.action.PICK").uri(ContactsContract.Contacts.CONTENT_URI).listener(this).start(activity);
        }
    }

    @NotNull
    public final JSONArray search(@Nullable String filter, @NotNull String[] fields) {
        int i10;
        Intrinsics.checkNotNullParameter(fields, "fields");
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            int length = fields.length;
            int i11 = 0;
            if (length == 0) {
                jSONArray.put(0, ProxyConfig.MATCH_ALL_SCHEMES);
                i10 = 1;
            } else {
                i10 = 0;
            }
            while (i10 < length) {
                jSONArray.put(i10, fields[i11]);
                i10++;
                i11++;
            }
            jSONObject.put("filter", filter);
            jSONObject.put("multiple", true);
        } catch (JSONException e5) {
            e5.getMessage();
        }
        return search(jSONArray, jSONObject);
    }

    @Nullable
    public final JSONObject getContactById(@NotNull String id, @Nullable JSONArray desiredFields) throws JSONException {
        Intrinsics.checkNotNullParameter(id, "id");
        Cursor cursorQuery = this.mContext.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, "contact_id = ? ", new String[]{id}, "contact_id ASC");
        JSONArray jSONArrayH = h(1, buildPopulationSet$contacts_release(new JSONObject().put("desiredFields", desiredFields)), cursorQuery);
        Intrinsics.checkNotNull(cursorQuery);
        if (!cursorQuery.isClosed()) {
            cursorQuery.close();
        }
        if (jSONArrayH.length() == 1) {
            return jSONArrayH.getJSONObject(0);
        }
        return null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19031. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @org.jetbrains.annotations.NotNull
    public final org.json.JSONArray search(@org.jetbrains.annotations.NotNull org.json.JSONArray r39, @org.jetbrains.annotations.NotNull org.json.JSONObject r40) {
        /*
            Method dump skipped, instruction units count: 1903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.contacts.ContactAccessor.search(org.json.JSONArray, org.json.JSONObject):org.json.JSONArray");
    }
}
