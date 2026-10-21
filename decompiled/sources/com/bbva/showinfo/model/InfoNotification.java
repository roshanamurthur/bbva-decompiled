package com.bbva.showinfo.model;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.collection.k;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0003\b\u0086\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010M\u001a\u0016\u0012\u0004\u0012\u00020,\u0018\u00010+j\n\u0012\u0004\u0012\u00020,\u0018\u0001`-\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010/¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0004J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010!\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0004J\u000b\u0010$\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010'HÆ\u0003J\u0012\u0010)\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u0010.\u001a\u0016\u0012\u0004\u0012\u00020,\u0018\u00010+j\n\u0012\u0004\u0012\u00020,\u0018\u0001`-HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010/HÆ\u0003J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u0004J\u000b\u00102\u001a\u0004\u0018\u00010/HÆ\u0003J\u008a\u0003\u0010Q\u001a\u00020\u00002\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00108\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010H\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00052\u001c\b\u0002\u0010M\u001a\u0016\u0012\u0004\u0012\u00020,\u0018\u00010+j\n\u0012\u0004\u0012\u00020,\u0018\u0001`-2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010P\u001a\u0004\u0018\u00010/HÆ\u0001¢\u0006\u0004\bQ\u0010RJ\t\u0010S\u001a\u00020\u0005HÖ\u0001J\t\u0010T\u001a\u00020\u0002HÖ\u0001J\u0013\u0010W\u001a\u00020\u001b2\b\u0010V\u001a\u0004\u0018\u00010UHÖ\u0003R$\u00103\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010\u0004\"\u0004\b[\u0010\\R$\u00104\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u00105\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010^\u001a\u0004\bd\u0010`\"\u0004\be\u0010bR$\u00106\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010^\u001a\u0004\bg\u0010`\"\u0004\bh\u0010bR$\u00107\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010Y\u001a\u0004\bj\u0010\u0004\"\u0004\bk\u0010\\R$\u00108\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u00109\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010m\u001a\u0004\bs\u0010o\"\u0004\bt\u0010qR$\u0010:\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010;\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010^\u001a\u0004\b|\u0010`\"\u0004\b}\u0010bR%\u0010<\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010Y\u001a\u0004\b\u007f\u0010\u0004\"\u0005\b\u0080\u0001\u0010\\R'\u0010=\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010m\u001a\u0005\b\u0082\u0001\u0010o\"\u0005\b\u0083\u0001\u0010qR)\u0010>\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010\u0014\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010?\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010@\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010A\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010B\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010\u001d\"\u0006\b\u009e\u0001\u0010\u009f\u0001R)\u0010C\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010\u009c\u0001\u001a\u0005\b¡\u0001\u0010\u001d\"\u0006\b¢\u0001\u0010\u009f\u0001R'\u0010D\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010m\u001a\u0005\b¤\u0001\u0010o\"\u0005\b¥\u0001\u0010qR'\u0010E\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010^\u001a\u0005\b§\u0001\u0010`\"\u0005\b¨\u0001\u0010bR)\u0010F\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b©\u0001\u0010\u009c\u0001\u001a\u0005\bª\u0001\u0010\u001d\"\u0006\b«\u0001\u0010\u009f\u0001R'\u0010G\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010Y\u001a\u0005\b\u00ad\u0001\u0010\u0004\"\u0005\b®\u0001\u0010\\R*\u0010H\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R*\u0010I\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010J\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R)\u0010K\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÁ\u0001\u0010\u009c\u0001\u001a\u0005\bÂ\u0001\u0010\u001d\"\u0006\bÃ\u0001\u0010\u009f\u0001R'\u0010L\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÄ\u0001\u0010^\u001a\u0005\bÅ\u0001\u0010`\"\u0005\bÆ\u0001\u0010bR<\u0010M\u001a\u0016\u0012\u0004\u0012\u00020,\u0018\u00010+j\n\u0012\u0004\u0012\u00020,\u0018\u0001`-8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R*\u0010N\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R'\u0010O\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÓ\u0001\u0010Y\u001a\u0005\bÔ\u0001\u0010\u0004\"\u0005\bÕ\u0001\u0010\\R*\u0010P\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÖ\u0001\u0010Î\u0001\u001a\u0006\b×\u0001\u0010Ð\u0001\"\u0006\bØ\u0001\u0010Ò\u0001¨\u0006Û\u0001"}, d2 = {"Lcom/bbva/showinfo/model/InfoNotification;", "Lcom/bbva/showinfo/model/InfoElement;", "", "component1", "()Ljava/lang/Integer;", "", "component2", "component3", "component4", "component5", "Lcom/bbva/showinfo/model/ResourceOrigin;", "component6", "component7", "Lcom/bbva/showinfo/model/Res;", "component8", "component9", "component10", "component11", "", "component12", "()Ljava/lang/Long;", "Lcom/bbva/showinfo/model/BigTextStyle;", "component13", "Lcom/bbva/showinfo/model/BigPictureStyle;", "component14", "Landroidx/core/app/NotificationCompat$InboxStyle;", "component15", "", "component16", "()Ljava/lang/Boolean;", "component17", "component18", "component19", "component20", "component21", "", "component22", "Lcom/bbva/showinfo/model/Lights;", "component23", "Landroid/net/Uri;", "component24", "component25", "component26", "Ljava/util/ArrayList;", "Landroidx/core/app/NotificationCompat$Action;", "Lkotlin/collections/ArrayList;", "component27", "Landroid/app/PendingIntent;", "component28", "component29", "component30", "id", "channelID", "channelName", "channelDesc", "importance", "title", "message", "smallIcon", LogKeysKt.TAG, "color", "ticker", "whenever", "bigTextStyle", "bigPictureStyle", "inboxStyle", "autoCancel", "ongoing", "largeIcon", "groupKey", "groupSummary", "number", "vibration", "lights", "sound", "onlyAlertOnce", "addPerson", "actions", "notificationTap", "flags", "dismiss", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/bbva/showinfo/model/ResourceOrigin;Lcom/bbva/showinfo/model/ResourceOrigin;Lcom/bbva/showinfo/model/Res;Ljava/lang/String;Ljava/lang/Integer;Lcom/bbva/showinfo/model/ResourceOrigin;Ljava/lang/Long;Lcom/bbva/showinfo/model/BigTextStyle;Lcom/bbva/showinfo/model/BigPictureStyle;Landroidx/core/app/NotificationCompat$InboxStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/bbva/showinfo/model/ResourceOrigin;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;[JLcom/bbva/showinfo/model/Lights;Landroid/net/Uri;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/ArrayList;Landroid/app/PendingIntent;Ljava/lang/Integer;Landroid/app/PendingIntent;)Lcom/bbva/showinfo/model/InfoNotification;", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Ljava/lang/Integer;", "getId", "setId", "(Ljava/lang/Integer;)V", "b", "Ljava/lang/String;", "getChannelID", "()Ljava/lang/String;", "setChannelID", "(Ljava/lang/String;)V", "c", "getChannelName", "setChannelName", "d", "getChannelDesc", "setChannelDesc", "e", "getImportance", "setImportance", "f", "Lcom/bbva/showinfo/model/ResourceOrigin;", "getTitle", "()Lcom/bbva/showinfo/model/ResourceOrigin;", "setTitle", "(Lcom/bbva/showinfo/model/ResourceOrigin;)V", "g", "getMessage", "setMessage", "h", "Lcom/bbva/showinfo/model/Res;", "getSmallIcon", "()Lcom/bbva/showinfo/model/Res;", "setSmallIcon", "(Lcom/bbva/showinfo/model/Res;)V", "i", "getTag", "setTag", "j", "getColor", "setColor", "k", "getTicker", "setTicker", "l", "Ljava/lang/Long;", "getWhenever", "setWhenever", "(Ljava/lang/Long;)V", "m", "Lcom/bbva/showinfo/model/BigTextStyle;", "getBigTextStyle", "()Lcom/bbva/showinfo/model/BigTextStyle;", "setBigTextStyle", "(Lcom/bbva/showinfo/model/BigTextStyle;)V", "n", "Lcom/bbva/showinfo/model/BigPictureStyle;", "getBigPictureStyle", "()Lcom/bbva/showinfo/model/BigPictureStyle;", "setBigPictureStyle", "(Lcom/bbva/showinfo/model/BigPictureStyle;)V", "o", "Landroidx/core/app/NotificationCompat$InboxStyle;", "getInboxStyle", "()Landroidx/core/app/NotificationCompat$InboxStyle;", "setInboxStyle", "(Landroidx/core/app/NotificationCompat$InboxStyle;)V", "p", "Ljava/lang/Boolean;", "getAutoCancel", "setAutoCancel", "(Ljava/lang/Boolean;)V", "q", "getOngoing", "setOngoing", "r", "getLargeIcon", "setLargeIcon", "s", "getGroupKey", "setGroupKey", "t", "getGroupSummary", "setGroupSummary", "u", "getNumber", "setNumber", SharedPrefsStorage.VERSION_KEY, "[J", "getVibration", "()[J", "setVibration", "([J)V", "w", "Lcom/bbva/showinfo/model/Lights;", "getLights", "()Lcom/bbva/showinfo/model/Lights;", "setLights", "(Lcom/bbva/showinfo/model/Lights;)V", "x", "Landroid/net/Uri;", "getSound", "()Landroid/net/Uri;", "setSound", "(Landroid/net/Uri;)V", "y", "getOnlyAlertOnce", "setOnlyAlertOnce", "z", "getAddPerson", "setAddPerson", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/util/ArrayList;", "getActions", "()Ljava/util/ArrayList;", "setActions", "(Ljava/util/ArrayList;)V", "B", "Landroid/app/PendingIntent;", "getNotificationTap", "()Landroid/app/PendingIntent;", "setNotificationTap", "(Landroid/app/PendingIntent;)V", "C", "getFlags", "setFlags", "D", "getDismiss", "setDismiss", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/bbva/showinfo/model/ResourceOrigin;Lcom/bbva/showinfo/model/ResourceOrigin;Lcom/bbva/showinfo/model/Res;Ljava/lang/String;Ljava/lang/Integer;Lcom/bbva/showinfo/model/ResourceOrigin;Ljava/lang/Long;Lcom/bbva/showinfo/model/BigTextStyle;Lcom/bbva/showinfo/model/BigPictureStyle;Landroidx/core/app/NotificationCompat$InboxStyle;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/bbva/showinfo/model/ResourceOrigin;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;[JLcom/bbva/showinfo/model/Lights;Landroid/net/Uri;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/ArrayList;Landroid/app/PendingIntent;Ljava/lang/Integer;Landroid/app/PendingIntent;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InfoNotification extends InfoElement {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public ArrayList<NotificationCompat.Action> actions;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public PendingIntent notificationTap;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public Integer flags;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public PendingIntent dismiss;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String channelID;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String channelName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String channelDesc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer importance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceOrigin title;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceOrigin message;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Res smallIcon;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String tag;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer color;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceOrigin ticker;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Long whenever;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public BigTextStyle bigTextStyle;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public BigPictureStyle bigPictureStyle;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public NotificationCompat.InboxStyle inboxStyle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean autoCancel;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean ongoing;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceOrigin largeIcon;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String groupKey;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean groupSummary;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer number;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public long[] vibration;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Lights lights;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Uri sound;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean onlyAlertOnce;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String addPerson;

    public InfoNotification() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ResourceOrigin getTicker() {
        return this.ticker;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getWhenever() {
        return this.whenever;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigTextStyle getBigTextStyle() {
        return this.bigTextStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigPictureStyle getBigPictureStyle() {
        return this.bigPictureStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final NotificationCompat.InboxStyle getInboxStyle() {
        return this.inboxStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getAutoCancel() {
        return this.autoCancel;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getOngoing() {
        return this.ongoing;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final ResourceOrigin getLargeIcon() {
        return this.largeIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getGroupKey() {
        return this.groupKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelID() {
        return this.channelID;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getGroupSummary() {
        return this.groupSummary;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Integer getNumber() {
        return this.number;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final long[] getVibration() {
        return this.vibration;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Lights getLights() {
        return this.lights;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Uri getSound() {
        return this.sound;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Boolean getOnlyAlertOnce() {
        return this.onlyAlertOnce;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getAddPerson() {
        return this.addPerson;
    }

    @Nullable
    public final ArrayList<NotificationCompat.Action> component27() {
        return this.actions;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final PendingIntent getNotificationTap() {
        return this.notificationTap;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Integer getFlags() {
        return this.flags;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final PendingIntent getDismiss() {
        return this.dismiss;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannelDesc() {
        return this.channelDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getImportance() {
        return this.importance;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ResourceOrigin getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ResourceOrigin getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Res getSmallIcon() {
        return this.smallIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final InfoNotification copy(@Nullable Integer id, @Nullable String channelID, @Nullable String channelName, @Nullable String channelDesc, @Nullable Integer importance, @Nullable ResourceOrigin title, @Nullable ResourceOrigin message, @Nullable Res smallIcon, @Nullable String tag, @Nullable Integer color, @Nullable ResourceOrigin ticker, @Nullable Long whenever, @Nullable BigTextStyle bigTextStyle, @Nullable BigPictureStyle bigPictureStyle, @Nullable NotificationCompat.InboxStyle inboxStyle, @Nullable Boolean autoCancel, @Nullable Boolean ongoing, @Nullable ResourceOrigin largeIcon, @Nullable String groupKey, @Nullable Boolean groupSummary, @Nullable Integer number, @Nullable long[] vibration, @Nullable Lights lights, @Nullable Uri sound, @Nullable Boolean onlyAlertOnce, @Nullable String addPerson, @Nullable ArrayList<NotificationCompat.Action> actions, @Nullable PendingIntent notificationTap, @Nullable Integer flags, @Nullable PendingIntent dismiss) {
        return new InfoNotification(id, channelID, channelName, channelDesc, importance, title, message, smallIcon, tag, color, ticker, whenever, bigTextStyle, bigPictureStyle, inboxStyle, autoCancel, ongoing, largeIcon, groupKey, groupSummary, number, vibration, lights, sound, onlyAlertOnce, addPerson, actions, notificationTap, flags, dismiss);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoNotification)) {
            return false;
        }
        InfoNotification infoNotification = (InfoNotification) other;
        return Intrinsics.areEqual(this.id, infoNotification.id) && Intrinsics.areEqual(this.channelID, infoNotification.channelID) && Intrinsics.areEqual(this.channelName, infoNotification.channelName) && Intrinsics.areEqual(this.channelDesc, infoNotification.channelDesc) && Intrinsics.areEqual(this.importance, infoNotification.importance) && Intrinsics.areEqual(this.title, infoNotification.title) && Intrinsics.areEqual(this.message, infoNotification.message) && Intrinsics.areEqual(this.smallIcon, infoNotification.smallIcon) && Intrinsics.areEqual(this.tag, infoNotification.tag) && Intrinsics.areEqual(this.color, infoNotification.color) && Intrinsics.areEqual(this.ticker, infoNotification.ticker) && Intrinsics.areEqual(this.whenever, infoNotification.whenever) && Intrinsics.areEqual(this.bigTextStyle, infoNotification.bigTextStyle) && Intrinsics.areEqual(this.bigPictureStyle, infoNotification.bigPictureStyle) && Intrinsics.areEqual(this.inboxStyle, infoNotification.inboxStyle) && Intrinsics.areEqual(this.autoCancel, infoNotification.autoCancel) && Intrinsics.areEqual(this.ongoing, infoNotification.ongoing) && Intrinsics.areEqual(this.largeIcon, infoNotification.largeIcon) && Intrinsics.areEqual(this.groupKey, infoNotification.groupKey) && Intrinsics.areEqual(this.groupSummary, infoNotification.groupSummary) && Intrinsics.areEqual(this.number, infoNotification.number) && Intrinsics.areEqual(this.vibration, infoNotification.vibration) && Intrinsics.areEqual(this.lights, infoNotification.lights) && Intrinsics.areEqual(this.sound, infoNotification.sound) && Intrinsics.areEqual(this.onlyAlertOnce, infoNotification.onlyAlertOnce) && Intrinsics.areEqual(this.addPerson, infoNotification.addPerson) && Intrinsics.areEqual(this.actions, infoNotification.actions) && Intrinsics.areEqual(this.notificationTap, infoNotification.notificationTap) && Intrinsics.areEqual(this.flags, infoNotification.flags) && Intrinsics.areEqual(this.dismiss, infoNotification.dismiss);
    }

    @Nullable
    public final ArrayList<NotificationCompat.Action> getActions() {
        return this.actions;
    }

    @Nullable
    public final String getAddPerson() {
        return this.addPerson;
    }

    @Nullable
    public final Boolean getAutoCancel() {
        return this.autoCancel;
    }

    @Nullable
    public final BigPictureStyle getBigPictureStyle() {
        return this.bigPictureStyle;
    }

    @Nullable
    public final BigTextStyle getBigTextStyle() {
        return this.bigTextStyle;
    }

    @Nullable
    public final String getChannelDesc() {
        return this.channelDesc;
    }

    @Nullable
    public final String getChannelID() {
        return this.channelID;
    }

    @Nullable
    public final String getChannelName() {
        return this.channelName;
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    public final PendingIntent getDismiss() {
        return this.dismiss;
    }

    @Nullable
    public final Integer getFlags() {
        return this.flags;
    }

    @Nullable
    public final String getGroupKey() {
        return this.groupKey;
    }

    @Nullable
    public final Boolean getGroupSummary() {
        return this.groupSummary;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Integer getImportance() {
        return this.importance;
    }

    @Nullable
    public final NotificationCompat.InboxStyle getInboxStyle() {
        return this.inboxStyle;
    }

    @Nullable
    public final ResourceOrigin getLargeIcon() {
        return this.largeIcon;
    }

    @Nullable
    public final Lights getLights() {
        return this.lights;
    }

    @Nullable
    public final ResourceOrigin getMessage() {
        return this.message;
    }

    @Nullable
    public final PendingIntent getNotificationTap() {
        return this.notificationTap;
    }

    @Nullable
    public final Integer getNumber() {
        return this.number;
    }

    @Nullable
    public final Boolean getOngoing() {
        return this.ongoing;
    }

    @Nullable
    public final Boolean getOnlyAlertOnce() {
        return this.onlyAlertOnce;
    }

    @Nullable
    public final Res getSmallIcon() {
        return this.smallIcon;
    }

    @Nullable
    public final Uri getSound() {
        return this.sound;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final ResourceOrigin getTicker() {
        return this.ticker;
    }

    @Nullable
    public final ResourceOrigin getTitle() {
        return this.title;
    }

    @Nullable
    public final long[] getVibration() {
        return this.vibration;
    }

    @Nullable
    public final Long getWhenever() {
        return this.whenever;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.channelID;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channelName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channelDesc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.importance;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ResourceOrigin resourceOrigin = this.title;
        int iHashCode6 = (iHashCode5 + (resourceOrigin == null ? 0 : resourceOrigin.hashCode())) * 31;
        ResourceOrigin resourceOrigin2 = this.message;
        int iHashCode7 = (iHashCode6 + (resourceOrigin2 == null ? 0 : resourceOrigin2.hashCode())) * 31;
        Res res = this.smallIcon;
        int iHashCode8 = (iHashCode7 + (res == null ? 0 : res.hashCode())) * 31;
        String str4 = this.tag;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.color;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ResourceOrigin resourceOrigin3 = this.ticker;
        int iHashCode11 = (iHashCode10 + (resourceOrigin3 == null ? 0 : resourceOrigin3.hashCode())) * 31;
        Long l6 = this.whenever;
        int iHashCode12 = (iHashCode11 + (l6 == null ? 0 : l6.hashCode())) * 31;
        BigTextStyle bigTextStyle = this.bigTextStyle;
        int iHashCode13 = (iHashCode12 + (bigTextStyle == null ? 0 : bigTextStyle.hashCode())) * 31;
        BigPictureStyle bigPictureStyle = this.bigPictureStyle;
        int iHashCode14 = (iHashCode13 + (bigPictureStyle == null ? 0 : bigPictureStyle.hashCode())) * 31;
        NotificationCompat.InboxStyle inboxStyle = this.inboxStyle;
        int iHashCode15 = (iHashCode14 + (inboxStyle == null ? 0 : inboxStyle.hashCode())) * 31;
        Boolean bool = this.autoCancel;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.ongoing;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ResourceOrigin resourceOrigin4 = this.largeIcon;
        int iHashCode18 = (iHashCode17 + (resourceOrigin4 == null ? 0 : resourceOrigin4.hashCode())) * 31;
        String str5 = this.groupKey;
        int iHashCode19 = (iHashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.groupSummary;
        int iHashCode20 = (iHashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num4 = this.number;
        int iHashCode21 = (iHashCode20 + (num4 == null ? 0 : num4.hashCode())) * 31;
        long[] jArr = this.vibration;
        int iHashCode22 = (iHashCode21 + (jArr == null ? 0 : Arrays.hashCode(jArr))) * 31;
        Lights lights = this.lights;
        int iHashCode23 = (iHashCode22 + (lights == null ? 0 : lights.hashCode())) * 31;
        Uri uri = this.sound;
        int iHashCode24 = (iHashCode23 + (uri == null ? 0 : uri.hashCode())) * 31;
        Boolean bool4 = this.onlyAlertOnce;
        int iHashCode25 = (iHashCode24 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str6 = this.addPerson;
        int iHashCode26 = (iHashCode25 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ArrayList<NotificationCompat.Action> arrayList = this.actions;
        int iHashCode27 = (iHashCode26 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        PendingIntent pendingIntent = this.notificationTap;
        int iHashCode28 = (iHashCode27 + (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 31;
        Integer num5 = this.flags;
        int iHashCode29 = (iHashCode28 + (num5 == null ? 0 : num5.hashCode())) * 31;
        PendingIntent pendingIntent2 = this.dismiss;
        return iHashCode29 + (pendingIntent2 != null ? pendingIntent2.hashCode() : 0);
    }

    public final void setActions(@Nullable ArrayList<NotificationCompat.Action> arrayList) {
        this.actions = arrayList;
    }

    public final void setAddPerson(@Nullable String str) {
        this.addPerson = str;
    }

    public final void setAutoCancel(@Nullable Boolean bool) {
        this.autoCancel = bool;
    }

    public final void setBigPictureStyle(@Nullable BigPictureStyle bigPictureStyle) {
        this.bigPictureStyle = bigPictureStyle;
    }

    public final void setBigTextStyle(@Nullable BigTextStyle bigTextStyle) {
        this.bigTextStyle = bigTextStyle;
    }

    public final void setChannelDesc(@Nullable String str) {
        this.channelDesc = str;
    }

    public final void setChannelID(@Nullable String str) {
        this.channelID = str;
    }

    public final void setChannelName(@Nullable String str) {
        this.channelName = str;
    }

    public final void setColor(@Nullable Integer num) {
        this.color = num;
    }

    public final void setDismiss(@Nullable PendingIntent pendingIntent) {
        this.dismiss = pendingIntent;
    }

    public final void setFlags(@Nullable Integer num) {
        this.flags = num;
    }

    public final void setGroupKey(@Nullable String str) {
        this.groupKey = str;
    }

    public final void setGroupSummary(@Nullable Boolean bool) {
        this.groupSummary = bool;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setImportance(@Nullable Integer num) {
        this.importance = num;
    }

    public final void setInboxStyle(@Nullable NotificationCompat.InboxStyle inboxStyle) {
        this.inboxStyle = inboxStyle;
    }

    public final void setLargeIcon(@Nullable ResourceOrigin resourceOrigin) {
        this.largeIcon = resourceOrigin;
    }

    public final void setLights(@Nullable Lights lights) {
        this.lights = lights;
    }

    public final void setMessage(@Nullable ResourceOrigin resourceOrigin) {
        this.message = resourceOrigin;
    }

    public final void setNotificationTap(@Nullable PendingIntent pendingIntent) {
        this.notificationTap = pendingIntent;
    }

    public final void setNumber(@Nullable Integer num) {
        this.number = num;
    }

    public final void setOngoing(@Nullable Boolean bool) {
        this.ongoing = bool;
    }

    public final void setOnlyAlertOnce(@Nullable Boolean bool) {
        this.onlyAlertOnce = bool;
    }

    public final void setSmallIcon(@Nullable Res res) {
        this.smallIcon = res;
    }

    public final void setSound(@Nullable Uri uri) {
        this.sound = uri;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final void setTicker(@Nullable ResourceOrigin resourceOrigin) {
        this.ticker = resourceOrigin;
    }

    public final void setTitle(@Nullable ResourceOrigin resourceOrigin) {
        this.title = resourceOrigin;
    }

    public final void setVibration(@Nullable long[] jArr) {
        this.vibration = jArr;
    }

    public final void setWhenever(@Nullable Long l6) {
        this.whenever = l6;
    }

    @NotNull
    public String toString() {
        Integer num = this.id;
        String str = this.channelID;
        String str2 = this.channelName;
        String str3 = this.channelDesc;
        Integer num2 = this.importance;
        ResourceOrigin resourceOrigin = this.title;
        ResourceOrigin resourceOrigin2 = this.message;
        Res res = this.smallIcon;
        String str4 = this.tag;
        Integer num3 = this.color;
        ResourceOrigin resourceOrigin3 = this.ticker;
        Long l6 = this.whenever;
        BigTextStyle bigTextStyle = this.bigTextStyle;
        BigPictureStyle bigPictureStyle = this.bigPictureStyle;
        NotificationCompat.InboxStyle inboxStyle = this.inboxStyle;
        Boolean bool = this.autoCancel;
        Boolean bool2 = this.ongoing;
        ResourceOrigin resourceOrigin4 = this.largeIcon;
        String str5 = this.groupKey;
        Boolean bool3 = this.groupSummary;
        Integer num4 = this.number;
        String string = Arrays.toString(this.vibration);
        Lights lights = this.lights;
        Uri uri = this.sound;
        Boolean bool4 = this.onlyAlertOnce;
        String str6 = this.addPerson;
        ArrayList<NotificationCompat.Action> arrayList = this.actions;
        PendingIntent pendingIntent = this.notificationTap;
        Integer num5 = this.flags;
        PendingIntent pendingIntent2 = this.dismiss;
        StringBuilder sb2 = new StringBuilder("InfoNotification(id=");
        sb2.append(num);
        sb2.append(", channelID=");
        sb2.append(str);
        sb2.append(", channelName=");
        k.e(sb2, str2, ", channelDesc=", str3, ", importance=");
        sb2.append(num2);
        sb2.append(", title=");
        sb2.append(resourceOrigin);
        sb2.append(", message=");
        sb2.append(resourceOrigin2);
        sb2.append(", smallIcon=");
        sb2.append(res);
        sb2.append(", tag=");
        sb2.append(str4);
        sb2.append(", color=");
        sb2.append(num3);
        sb2.append(", ticker=");
        sb2.append(resourceOrigin3);
        sb2.append(", whenever=");
        sb2.append(l6);
        sb2.append(", bigTextStyle=");
        sb2.append(bigTextStyle);
        sb2.append(", bigPictureStyle=");
        sb2.append(bigPictureStyle);
        sb2.append(", inboxStyle=");
        sb2.append(inboxStyle);
        sb2.append(", autoCancel=");
        sb2.append(bool);
        sb2.append(", ongoing=");
        sb2.append(bool2);
        sb2.append(", largeIcon=");
        sb2.append(resourceOrigin4);
        sb2.append(", groupKey=");
        sb2.append(str5);
        sb2.append(", groupSummary=");
        sb2.append(bool3);
        sb2.append(", number=");
        sb2.append(num4);
        sb2.append(", vibration=");
        sb2.append(string);
        sb2.append(", lights=");
        sb2.append(lights);
        sb2.append(", sound=");
        sb2.append(uri);
        sb2.append(", onlyAlertOnce=");
        sb2.append(bool4);
        sb2.append(", addPerson=");
        sb2.append(str6);
        sb2.append(", actions=");
        sb2.append(arrayList);
        sb2.append(", notificationTap=");
        sb2.append(pendingIntent);
        sb2.append(", flags=");
        sb2.append(num5);
        sb2.append(", dismiss=");
        sb2.append(pendingIntent2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ InfoNotification(Integer num, String str, String str2, String str3, Integer num2, ResourceOrigin resourceOrigin, ResourceOrigin resourceOrigin2, Res res, String str4, Integer num3, ResourceOrigin resourceOrigin3, Long l6, BigTextStyle bigTextStyle, BigPictureStyle bigPictureStyle, NotificationCompat.InboxStyle inboxStyle, Boolean bool, Boolean bool2, ResourceOrigin resourceOrigin4, String str5, Boolean bool3, Integer num4, long[] jArr, Lights lights, Uri uri, Boolean bool4, String str6, ArrayList arrayList, PendingIntent pendingIntent, Integer num5, PendingIntent pendingIntent2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : resourceOrigin, (i10 & 64) != 0 ? null : resourceOrigin2, (i10 & 128) != 0 ? null : res, (i10 & 256) != 0 ? null : str4, (i10 & 512) != 0 ? null : num3, (i10 & 1024) != 0 ? null : resourceOrigin3, (i10 & 2048) != 0 ? null : l6, (i10 & 4096) != 0 ? null : bigTextStyle, (i10 & 8192) != 0 ? null : bigPictureStyle, (i10 & 16384) != 0 ? null : inboxStyle, (i10 & 32768) != 0 ? null : bool, (i10 & 65536) != 0 ? null : bool2, (i10 & 131072) != 0 ? null : resourceOrigin4, (i10 & 262144) != 0 ? null : str5, (i10 & 524288) != 0 ? null : bool3, (i10 & 1048576) != 0 ? null : num4, (i10 & 2097152) != 0 ? null : jArr, (i10 & 4194304) != 0 ? null : lights, (i10 & 8388608) != 0 ? null : uri, (i10 & 16777216) != 0 ? null : bool4, (i10 & 33554432) != 0 ? null : str6, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : arrayList, (i10 & 134217728) != 0 ? null : pendingIntent, (i10 & 268435456) != 0 ? null : num5, (i10 & PKIFailureInfo.duplicateCertReq) != 0 ? null : pendingIntent2);
    }

    public InfoNotification(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, @Nullable ResourceOrigin resourceOrigin, @Nullable ResourceOrigin resourceOrigin2, @Nullable Res res, @Nullable String str4, @Nullable Integer num3, @Nullable ResourceOrigin resourceOrigin3, @Nullable Long l6, @Nullable BigTextStyle bigTextStyle, @Nullable BigPictureStyle bigPictureStyle, @Nullable NotificationCompat.InboxStyle inboxStyle, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable ResourceOrigin resourceOrigin4, @Nullable String str5, @Nullable Boolean bool3, @Nullable Integer num4, @Nullable long[] jArr, @Nullable Lights lights, @Nullable Uri uri, @Nullable Boolean bool4, @Nullable String str6, @Nullable ArrayList<NotificationCompat.Action> arrayList, @Nullable PendingIntent pendingIntent, @Nullable Integer num5, @Nullable PendingIntent pendingIntent2) {
        super(null);
        this.id = num;
        this.channelID = str;
        this.channelName = str2;
        this.channelDesc = str3;
        this.importance = num2;
        this.title = resourceOrigin;
        this.message = resourceOrigin2;
        this.smallIcon = res;
        this.tag = str4;
        this.color = num3;
        this.ticker = resourceOrigin3;
        this.whenever = l6;
        this.bigTextStyle = bigTextStyle;
        this.bigPictureStyle = bigPictureStyle;
        this.inboxStyle = inboxStyle;
        this.autoCancel = bool;
        this.ongoing = bool2;
        this.largeIcon = resourceOrigin4;
        this.groupKey = str5;
        this.groupSummary = bool3;
        this.number = num4;
        this.vibration = jArr;
        this.lights = lights;
        this.sound = uri;
        this.onlyAlertOnce = bool4;
        this.addPerson = str6;
        this.actions = arrayList;
        this.notificationTap = pendingIntent;
        this.flags = num5;
        this.dismiss = pendingIntent2;
    }
}
