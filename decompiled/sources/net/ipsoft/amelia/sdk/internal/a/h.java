package net.ipsoft.amelia.sdk.internal.a;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.io.IOException;
import java.net.HttpCookie;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import net.ipsoft.amelia.sdk.BaseConversation;
import net.ipsoft.amelia.sdk.IAmeliaOutboundMessage;
import net.ipsoft.amelia.sdk.internal.b.n;

/* JADX INFO: loaded from: classes12.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f84646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f84647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f84648f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f84650h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MediaPlayer f84649g = new MediaPlayer();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityQueue f84643a = new PriorityQueue(10, new b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f84644b = new HashMap();

    public interface a {
        void a(BaseConversation baseConversation);

        void b(BaseConversation baseConversation);
    }

    public class b implements Comparator<f> {
        @Override // java.util.Comparator
        public final int compare(f fVar, f fVar2) {
            return (int) (fVar.f84658b.longValue() - fVar2.f84658b.longValue());
        }
    }

    public class c extends net.ipsoft.amelia.sdk.internal.b.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f84651a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ BaseConversation f84652i;

        public c(String str, BaseConversation baseConversation) {
            this.f84651a = str;
            this.f84652i = baseConversation;
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.o
        public final void a() {
            h hVar = h.this;
            HashMap map = hVar.f84644b;
            String str = this.f84651a;
            Long lValueOf = (Long) map.get(str);
            if (lValueOf == null) {
                lValueOf = Long.valueOf(System.currentTimeMillis());
            }
            if (this.f84764f != null) {
                hVar.f84644b.remove(str);
                return;
            }
            String strA = this.f84732d.a();
            long jLongValue = lValueOf.longValue();
            Uri uri = Uri.parse(hVar.f84646d.f() + strA);
            boolean z10 = hVar.f84645c;
            HashMap map2 = hVar.f84644b;
            PriorityQueue priorityQueue = hVar.f84643a;
            if (z10) {
                priorityQueue.add(new f(uri, Long.valueOf(jLongValue)));
                map2.remove(str);
                return;
            }
            priorityQueue.add(new f(uri, Long.valueOf(jLongValue)));
            map2.remove(str);
            if (map2.isEmpty()) {
                hVar.b(this.f84652i, ((f) priorityQueue.poll()).f84657a);
            }
        }
    }

    public class d implements MediaPlayer.OnPreparedListener {
        public d() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            h.this.f84649g.start();
        }
    }

    public class e implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseConversation f84655a;

        public e(BaseConversation baseConversation) {
            this.f84655a = baseConversation;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            h hVar = h.this;
            hVar.f84645c = false;
            a aVar = hVar.f84650h;
            BaseConversation baseConversation = this.f84655a;
            aVar.b(baseConversation);
            if (hVar.f84643a.isEmpty()) {
                return;
            }
            hVar.b(baseConversation, ((f) hVar.f84643a.poll()).f84657a);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f84657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f84658b;

        public f(Uri uri, Long l6) {
            this.f84657a = uri;
            this.f84658b = l6;
        }
    }

    public h(Context context, n nVar, a aVar) {
        this.f84648f = context;
        this.f84646d = nVar;
        this.f84650h = aVar;
    }

    public void a(String str) {
        this.f84647e = str;
    }

    public final void b(BaseConversation baseConversation, Uri uri) {
        a aVar = this.f84650h;
        HashMap map = new HashMap(1);
        String str = "";
        for (HttpCookie httpCookie : this.f84646d.a()) {
            str = httpCookie.getName() + "=" + httpCookie.getValue() + ReplenishLogic.ID_SEPARATOR;
        }
        map.put("Cookie", str);
        try {
            this.f84645c = true;
            aVar.a(baseConversation);
            MediaPlayer mediaPlayer = this.f84649g;
            mediaPlayer.reset();
            mediaPlayer.setDataSource(this.f84648f, uri, map);
            mediaPlayer.setAudioStreamType(3);
            mediaPlayer.setOnPreparedListener(new d());
            mediaPlayer.setOnCompletionListener(new e(baseConversation));
            mediaPlayer.prepareAsync();
        } catch (IOException e5) {
            this.f84645c = false;
            aVar.b(baseConversation);
            e5.printStackTrace();
        }
    }

    public void a(BaseConversation baseConversation) {
        if (this.f84645c) {
            this.f84649g.stop();
            this.f84645c = false;
            this.f84650h.b(baseConversation);
        }
    }

    public synchronized void a(BaseConversation baseConversation, IAmeliaOutboundMessage iAmeliaOutboundMessage) {
        try {
            List<String> speech = iAmeliaOutboundMessage.getSpeech();
            if (speech != null && !baseConversation.isMuted()) {
                for (String str : speech) {
                    if (str != null && str.trim().length() > 0) {
                        this.f84644b.put(str, Long.valueOf(System.currentTimeMillis()));
                        n nVar = this.f84646d;
                        String str2 = this.f84647e;
                        if (str2 == null) {
                            str2 = "VW Julie";
                        }
                        nVar.a(new net.ipsoft.amelia.sdk.internal.b.i(str, str2, iAmeliaOutboundMessage.getConversationId()), new c(str, baseConversation));
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
