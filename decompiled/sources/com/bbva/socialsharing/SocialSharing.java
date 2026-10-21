package com.bbva.socialsharing;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Base64;
import androidx.camera.camera2.internal.compat.u;
import androidx.core.content.FileProvider;
import androidx.webkit.internal.AssetHelper;
import com.bbva.glomohybrid.base.file.constants.FileConstants;
import com.bbva.socialsharing.model.ShareData;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SocialSharing.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/bbva/socialsharing/SocialSharing;", "", "Landroid/content/Context;", "context", "", "shareTitle", "", "Lcom/bbva/socialsharing/model/ShareData;", "content", "", "share", "(Landroid/content/Context;Ljava/lang/String;[Lcom/bbva/socialsharing/model/ShareData;)V", "<init>", "()V", "socialsharing_release"}, k = 1, mv = {1, 4, 0})
public final class SocialSharing {
    public static /* bridge */ /* synthetic */ void share$default(SocialSharing socialSharing, Context context, String str, ShareData[] shareDataArr, int i10, Object obj) throws UnsupportedOperationException, ActivityNotFoundException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        socialSharing.share(context, str, shareDataArr);
    }

    public final void share(@NotNull Context context, @Nullable String shareTitle, @NotNull ShareData... content) throws UnsupportedOperationException, ActivityNotFoundException {
        Intent intent = new Intent("android.intent.action.SEND");
        ArrayList arrayList = new ArrayList();
        for (ShareData shareData : content) {
            if (shareData instanceof ShareData.Res) {
                throw new UnsupportedOperationException();
            }
            if (shareData instanceof ShareData.Www) {
                throw new UnsupportedOperationException();
            }
            if (shareData instanceof ShareData.Raw) {
                ShareData.Raw raw = (ShareData.Raw) shareData;
                File file = new File(context.getCacheDir(), "share");
                file.mkdirs();
                String filename = raw.getFilename();
                File file2 = new File(file, String.valueOf((filename == null || filename.length() == 0) ? UUID.randomUUID() + ".png" : raw.getFilename()));
                file2.createNewFile();
                byte[] bArrDecode = Base64.decode(raw.getContent(), 0);
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2.getAbsolutePath());
                    try {
                        fileOutputStream2.write(bArrDecode);
                        fileOutputStream2.close();
                        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + FileConstants.FILE_PROVIDER_SUFFIX, file2);
                        Intrinsics.checkExpressionValueIsNotNull(uriForFile, "FileProvider.getUriForFi…}.fileprovider\", newFile)");
                        arrayList.add(uriForFile);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else if (shareData instanceof ShareData.PlainText) {
                intent.putExtra("android.intent.extra.TEXT", ((ShareData.PlainText) shareData).getContent());
                intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            }
        }
        if (!arrayList.isEmpty()) {
            intent.addFlags(1);
            ContentResolver contentResolver = context.getContentResolver();
            ArrayList<String> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                String str = "*/*";
                if (!it.hasNext()) {
                    break;
                }
                String type = contentResolver.getType((Uri) it.next());
                if (type != null) {
                    str = type;
                }
                arrayList2.add(str);
            }
            String strF = "";
            for (String str2 : arrayList2) {
                String str3 = (String) StringsKt__StringsKt.split$default((CharSequence) strF, new String[]{"/"}, false, 0, 6, (Object) null).get(0);
                String str4 = (String) StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"/"}, false, 0, 6, (Object) null).get(0);
                strF = (strF.length() == 0 || Intrinsics.areEqual(strF, str2)) ? str2 : Intrinsics.areEqual(str3, str4) ? u.f(str4, "/*") : "*/*";
            }
            intent.setType(strF.length() != 0 ? strF : "*/*");
        }
        if (arrayList.size() > 1) {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(arrayList));
        } else if (arrayList.size() == 1) {
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) CollectionsKt___CollectionsKt.first((List) arrayList));
        }
        context.startActivity(Intent.createChooser(intent, shareTitle));
    }
}
