package rpg;

/*
 * Decompiled with CFR 0.150.
 */
public final class SoundPlayerManager {
    public static int var_int_a = 10;
    private static int volumeLevel = 0;
    private static SoundPlayer soundPlayer1;
    private static SoundPlayer soundPlayer2;
    private static SoundPlayer c;
    private static SoundPlayer[] arraySoundPlayer = new SoundPlayer[32];;
    private static final String[] arrayTrackName = new String[]{"00.mid", "01.mid", "02.mid", "03.mid", "04.mid", "05.mid", "06.mid", "07.mid", "08.wav", "def.mid", "def.mid", "def.mid", "12.mid", "13.wav", "14.wav", "15.wav", "16.wav", "17.wav", "18.wav", "def.mid", "20.wav", "21.wav", "22.mid", "23.mid", "24.mid", "25.mid", "26.mid", "27.mid", "28.mid", "29.mid", "30.mid", "31.mid"};

    public static final void a() {
        if (soundPlayer1 != null) {
            soundPlayer1.b();
            return;
        }
        if (soundPlayer2 != null) {
            soundPlayer2.b();
        }
    }

    public static final void b() {
        if (soundPlayer1 != null) {
            soundPlayer1.playTrack();
            return;
        }
        if (soundPlayer2 != null) {
            soundPlayer2.playTrack();
        }
    }

    public static final void c() {
        if (soundPlayer2 != null) {
            soundPlayer2.b();
        }
    }

    public static final void d() {
        if (c != null) {
            c.b();
        }
    }

    public static final void e() {
        if (soundPlayer1 != null) {
            soundPlayer1.b();
        }
    }

    public static final void f() {
        if (soundPlayer1 != null) {
            soundPlayer1.c();
            soundPlayer1 = null;
        }
        if (soundPlayer2 != null) {
            soundPlayer2.c();
            soundPlayer2 = null;
        }
    }

    public static final void a(byte by2, boolean bl2) {
        if (arraySoundPlayer[by2] != null) {
            c = arraySoundPlayer[by2];
            c.setVolumeLevel(volumeLevel);
            c.playTrack();
        }
    }

    public static final void a(int n2) {
        if (n2 <= 0) {
            n2 = 0;
        } else if (n2 > var_int_a) {
            n2 = var_int_a;
        }
        if (volumeLevel == 0 && n2 != 0) {
            SoundPlayerManager.b();
        }
        if ((volumeLevel = n2 * 10) == 0) {
            SoundPlayerManager.a();
        }
        for (int i2 = 0; i2 < arraySoundPlayer.length; ++i2) {
            if (arraySoundPlayer[i2] == null) continue;
            arraySoundPlayer[i2].setVolumeLevel(volumeLevel);
        }
    }

    public static final void g() {
        System.out.println("readySound");
        try {
            bs.var_bs_a.j();
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        SoundPlayerManager.a(bs.var_bs_a.var_int_a);
    }

    public static final void setupSoundPlayer(byte trackId) {
        if (arraySoundPlayer[trackId] == null) {
            String trackPath = "resource:/snd/" + arrayTrackName[trackId];
            SoundPlayerManager.arraySoundPlayer[trackId] = new SoundPlayer(trackPath);
            arraySoundPlayer[trackId].setVolumeLevel(volumeLevel);
        }
    }

    public static final void b(byte by2) {
        if (arraySoundPlayer[by2] != null) {
            arraySoundPlayer[by2].c();
            SoundPlayerManager.arraySoundPlayer[by2] = null;
        }
    }

    public static final void startPlayer1(int playerId) {
        soundPlayer1 = arraySoundPlayer[playerId];
        if (soundPlayer1 != null && !soundPlayer1.boolean_a()) {
            soundPlayer1.setVolumeLevel(volumeLevel);
            soundPlayer1.setLoopCount(-1);
            soundPlayer1.playTrack();
        }
    }

    public static final void startPlayer2(int playerId) {
        soundPlayer2 = arraySoundPlayer[playerId];
        if (soundPlayer2 != null && !soundPlayer2.boolean_a()) {
            soundPlayer2.setVolumeLevel(volumeLevel);
            soundPlayer2.setLoopCount(-1);
            soundPlayer2.playTrack();
        }
    }

//    public static {
//        var_int_a = 10;
//        var_int_b = 0;
//        var_ci_arr_a = new ci[32];
//        var_java_lang_String_arr_a = new String[]{"00.mid", "01.mid", "02.mid", "03.mid", "04.mid", "05.mid", "06.mid", "07.mid", "08.wav", "def.mid", "def.mid", "def.mid", "12.mid", "13.wav", "14.wav", "15.wav", "16.wav", "17.wav", "18.wav", "def.mid", "20.wav", "21.wav", "22.mid", "23.mid", "24.mid", "25.mid", "26.mid", "27.mid", "28.mid", "29.mid", "30.mid", "31.mid"};
//    }
}

